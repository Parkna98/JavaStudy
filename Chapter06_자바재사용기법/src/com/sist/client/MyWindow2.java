package com.sist.client;
import javax.swing.*;
import java.net.*;
import java.awt.*;

// 상속 => 가장 큰것을 받는다 (버튼상속이 아니라 윈도우상속해서 전부 다쓸수있게)
public class MyWindow2 extends JFrame{
	JLabel la=new JLabel();
	public MyWindow2() {
		setLayout(null);
		la.setBounds(10, 15, 350, 500); // 이미지불러왔는데 크기 안맞음 => 오버라이딩해서 변경하자
		add(la);
		try {
			URL url=new URL("https://img.cgv.co.kr/Movie/Thumbnail/Poster/000087/87407/87407_320.jpg"); // 이미지주소복사
			la.setIcon(new ImageIcon(url)); 
		}catch(Exception ex) {}
		setSize(800,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyWindow2();
	}

}
