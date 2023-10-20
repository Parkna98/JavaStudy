package com.sist.exception;
/*
	프로그램을 만들때 예외처리 고민 1) 조건문으로 가능한지, 2)안된다면 자바제공 예외처리기능 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
	예외처리
		= 예외복구 => try~catch
			try	=> 정상 수행 문장 => 에러 발생
			catch => try 문장 수행중 에러 발생시 1)확인 2)복구(다시수행)
										  ----- getMessage()
										  		printStackTrace()
			=> catch를 여러번 사용이가능
			=> catch는 순서가 존재 (계층구조)
						Throwable
						---------
							ㅣ
						Exception 
							 ㅣ
					------------------
				IOException 	RuntimeException
									 ㅣ	
								NumberFormatException ....... (같은 계층은 순서 상관무) 
				
		= 예외회피 => throws
 */
// UpDown Game
public class MainClass_4 extends JFrame implements ActionListener{
	JTextField tf; // 입력창
	JTextArea ta; // 결과창
	JButton b1,b2; 
	// 난수
	int com; // 0
	// 초기화 ==> 생성자
	public MainClass_4() {
		tf=new JTextField(10);
		tf.setEnabled(false); // 비활성화
		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta); // 우측과 하단에 스크롤 생성
		b1=new JButton("Start");
		b2=new JButton("Exit");
		
		// 윈도우 배치
		JPanel p=new JPanel(); // 패널생성
		p.add(tf); // 패널에 tf,b1,b2를 한줄에 묶기
		p.add(b1);
		p.add(b2);
		
		add("North",p);
		add("Center",js);
		
		setSize(300,450);
		setVisible(true);
		
		// 버튼 클릭시에 => ActionPerformed 호출 요청
		// 이벤트 처리
		b1.addActionListener(this);
		//					 위치 (this : 이 클래스에 있다)
		b2.addActionListener(this);
		tf.addActionListener(this); // 엔터 (버튼에 ActionListener 추가하면 클릭이고 검색창에 추가하면 엔터인듯)
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass_4();
	}
	// 버튼처리, enter처리
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			com=(int)(Math.random()*100)+1; // b1을 누르면 난수생성
			b1.setEnabled(false); // b1버튼 비활성화
			tf.setEnabled(true);  // 입력창 활성화
			tf.requestFocus(); // 입력창으로 커서이동
			ta.append("게임을 시작합니다\n");
		}
		if(e.getSource()==b2) {
			dispose(); // 메모리 회수 (종료전 윈도우창의 메모리를 회수하기위함)
			System.exit(0);	
		}
		if(e.getSource()==tf) {
			try {
				// 정상수행문장
				String num=tf.getText(); // 입력값 읽어오기
				int user=Integer.parseInt(num);
				// user/com
				if(user<1 || user>100) {
					ta.append("1~100까지 입력이 가능합니다\n");
				}
				else {
					if(com>user) 
						ta.append("입력값보다 큰값을 입력하세요\n");
					else if(com<user)
						ta.append("입력값보다 작은값을 입력하세요\n");
					else {
						ta.append("Game Over!!\n");
						tf.setText("");
						b1.setEnabled(true);
						tf.setEnabled(false);
					}
				}
				tf.setText("");
				
			}catch(NumberFormatException ex){	// NumberException보다 큰클래스 쓰기만하면 됨
				// 에러발생복구
				JOptionPane.showMessageDialog(this, "1~100까지 정수만 입력하세요");
				tf.setText("");
				tf.requestFocus();
			}
		}
	}

}
