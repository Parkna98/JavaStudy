package com.sist.client;
import javax.swing.*;
import java.awt.*;
/*
		FlowLayout	: JPanel
		--------------------
			==============
			 버튼 버튼 .... (일직선으로)
			==============
		GridLayout	
		----------
			============== 
 			  버튼 버튼 버튼 (일정간격으로) (ex 계산기버튼 )
			  버튼 버튼 버튼
			==============
		BorderLayout
		------------
			==============
				North
			==============
			
		EAST    CENTER 	  WEST
			
			==============
				South
			==============
		CardLayout : 감춘다 => 원할때 보여줌 => 클릭하면 원하는 화면 띄우기
		----------
		
 */
public class ClientMainForm extends JFrame{
	MenuPanel mp=new MenuPanel();
	public ClientMainForm() {
		setLayout(null); // 화면 배치 => null:지원안받음 => 직접배치
		mp.setBounds(10,15,600,50); // setBounds(a,b,c,d) c,d : 버튼 크기 조절 
		add(mp);
		setSize(1024,768);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 화면우측상단 X버튼 누르면 메모리해제후 종료
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// UI종류
			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
		}catch(Exception ex) {}
		new ClientMainForm();
	}

}
