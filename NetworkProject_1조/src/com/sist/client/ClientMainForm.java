package com.sist.client;
import javax.swing.*;
import java.util.*;

import com.sist.common.ImageChange;
import com.sist.manager.FoodManager;
import com.sist.manager.MovieManager;
import com.sist.vo.FoodCategoryVO;
import com.sist.vo.MovieReservationVO;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientMainForm extends JFrame implements ActionListener{
	MenuPanel mp=new MenuPanel();
	ControllPanel cp=new ControllPanel();
	JLabel logo=new JLabel();
	Login login=new Login();
	//FoodManager fm=new FoodManager();
	MovieManager mm=new MovieManager();
	public ClientMainForm() {
		setLayout(null); // 화면 배치 => null:지원안받음 => 직접배치
		logo.setBounds(320,20,1120,60);
		logo.setIcon(new ImageIcon(ImageChange.getImage(new ImageIcon("c:\\javaDev\\logo.png"),130,60)));
		add(logo);
		mp.setBounds(460,40,1120,40); // setBounds(a,b,c,d) c,d : 버튼 크기 조절 
		add(mp);
		
		cp.setBounds(0,120,1920,940);
		add(cp);
		setSize(1920,1080);
		//setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 화면우측상단 X버튼 누르면 메모리해제후 종료
		setResizable(false);
		// 등록
		mp.b1.addActionListener(this);
		mp.b2.addActionListener(this);
		mp.b3.addActionListener(this);
		mp.b4.addActionListener(this);
		mp.b5.addActionListener(this);
		mp.b6.addActionListener(this);
		
		login.b1.addActionListener(this); // 로그인이 갖고있는 버튼
		ArrayList<MovieReservationVO> list=mm.MovieReservationData(1);
		//cp.hp.cardInit(list);
		cp.hp.cardPrint(list);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// UI종류
			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
		}catch(Exception ex) {}
		new ClientMainForm();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mp.b1) {
			cp.card.show(cp, "home");
		}
		else if(e.getSource()==mp.b3) {
			cp.card.show(cp, "chat");
		}
		else if(e.getSource()==mp.b4) {
			cp.card.show(cp, "board");
		}
		else if(e.getSource()==mp.b5) {
			cp.card.show(cp, "news");
		}
		else if(e.getSource()==mp.b6) {
			System.exit(0);
		}
		else if(e.getSource()==login.b1) { 
			// 서버연결
			login.setVisible(false); // 로그인버튼 누르면 로그인창 사라지기
			setVisible(true); // 로그인 되면 윈도우창 띄우기
		}
	}
}
