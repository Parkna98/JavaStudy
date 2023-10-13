package com.sist.client;
import javax.swing.*;
import java.awt.*; // 다른라이브러리로 바뀜, 이번만쓸것(웹에띄우기위함)(통신과정을 잘 기억할것!) 
/*
 * 		라벨2개 (ID,Password) textfield2개(id입력,pw입력) 버튼2개(로그인버튼,취소버튼) 
 */
public class Login {
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf; // 패스워드 칠때 안보이게 점으로표시되는메소드
	JButton b1,b2;
	JFrame fr=new JFrame("로그인");
	
	public Login() {
		la1=new JLabel("ID");
		la2=new JLabel("Password");
		tf=new JTextField();
		pf=new JPasswordField();
		b1=new JButton("로그인");
		b2=new JButton("취소"); 
		
		// layout 위의값들의 위치
		fr.setLayout(null);
		// 직접배치  null=>기본레이아웃쓰지않겠다
		la1.setBounds(10, 15, 70, 30); // 순서대로 x좌표,y좌표,width,height
		tf.setBounds(85, 15, 150, 30);
		la2.setBounds(10, 50, 70, 30);
		pf.setBounds(85, 50, 150, 30);
		
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		p.setBounds(10, 85, 225, 35);
		
		fr.add(la1); // 화면에 추가
		fr.add(la2);
		fr.add(tf);
		fr.add(pf);
		fr.add(p);
		
		fr.setSize(265,180);
		fr.setVisible(true);
	}
	public static void main(String[] args) {
		new Login();
	}
}
