package com.sist.music;
import javax.swing.*;
import java.awt.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.table.*;

public class UserMain extends JFrame implements ActionListener {
	JTextField tf;
	JButton b,b2;
	JTable table;
	DefaultTableModel model;
	MusicManger mm=new MusicManger(); // 포함 클래스 (있는 그대로 쓰겠다 (변경X))
	public UserMain() {
		tf=new JTextField(10);
		b=new JButton("검색");
		b2=new JButton("목록");
		JPanel p=new JPanel();
		p.add(tf); p.add(b); p.add(b2);
		
		String[] col= {"순위","곡명","가수명"};
		String[][] row=new String[0][3];
		
		model=new DefaultTableModel(row,col);
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		
		// 윈도우에 올리기
		add("North",p);
		add("Center",js);
		
		musicPrint();
		setSize(800,600);
		setVisible(true);
		
		b.addActionListener(this); // 매개변수 => actionlistner가 어디있는지
		b2.addActionListener(this);
		tf.addActionListener(this); // this => 이 클래스 안에 있는 actionListner를 호출하겠다
	}
	public void musicPrint() {
		ArrayList<Music> list=mm.musicAllData();
		for(int i=model.getRowCount()-1;i>=0;i--) { // 0부터 지우면 하나가 안지워져서 뒤에서부터 지움
			model.removeRow(i); // 검색하고 목록으로 들어올때 한번지우고 다시 띄움
		}
		for(Music m:list) {
			String[] data= {String.valueOf(m.getRank()),m.getTitle(),m.getSinger()};
			//              rank는 int라서 String[]에 넣기위해 valueOf 사용해서 형변환
			model.addRow(data); // 한줄씩 추가
		}
	}
	
	public void musicFind(String title) {
		ArrayList<Music> list=mm.musicFindData(title);
		for(int i=model.getRowCount()-1;i>=0;i--) { // 0부터 지우면 하나가 안지워져서 뒤에서부터 지움
			model.removeRow(i); // 검색하고 목록으로 들어올때 한번지우고 다시 띄움
		}
		for(Music m:list) {
			String[] data= {String.valueOf(m.getRank()),m.getTitle(),m.getSinger()};
			//              rank는 int라서 String[]에 넣기위해 valueOf 사용해서 형변환
			model.addRow(data); // 한줄씩 추가
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UserMain();
	}
	@Override // 버튼을 눌렀을 때 수행하는 메소드(인터페이스 오버라이딩)
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b||e.getSource()==tf) { // 검색버튼 // tf=> 엔터쳤을때
			String title=tf.getText();
			// if로 예외처리 (유효성 검사)
			if(title.length()<1) {
				JOptionPane.showMessageDialog(this, "검색어를 입력하세요"); // messagedialog => 아이디등 잘못 입력했을때 띄우는 작은 메세지창
				tf.requestFocus();
				return;
			}
			musicFind(title);
		}
		else if(e.getSource()==b2){
			musicPrint(); // 목록 출력
		}
	}

}
