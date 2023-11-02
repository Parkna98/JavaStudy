package com.sist.exam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainClass_3 extends JFrame implements ActionListener{
	JProgressBar[] bar=new JProgressBar[5];
	JButton b1,b2; 
	static int rank;
	BarThread[] bt=new BarThread[5];
	public MainClass_3() {
		b1=new JButton("시작");
		b2=new JButton("종료");
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(5,1,5,5));
		Color[] color= {Color.cyan, Color.yellow, Color.pink, Color.orange, Color.magenta};
		for(int i=0;i<5;i++) {
			bar[i]=new JProgressBar();
			bar[i].setMinimum(0);
			bar[i].setMaximum(100);
			bar[i].setStringPainted(true);
			// 1% ~ 100%
			bar[i].setForeground(color[i]);
			bar[i].setBackground(Color.white);
			p.add(bar[i]);
		}
		JPanel p2=new JPanel();
		p2.add(b1); p2.add(b2);
		
		add("Center",p);
		add("South",p2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setSize(640,350);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass_3();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			for(int i=0;i<5;i++) {
				bt[i]=new BarThread(i); // 5개의 쓰레드 사용 => 멀티쓰레드
				bt[i].start();
			}
		}
		else if(e.getSource()==b2) {
			System.exit(0);
		}
	}
	
	// Thread => bar를 이용 => 윈도우가 가지고 있는 모든 데이터 사용 
	// => 내부 클래스 (멤버 클래스) => 객체생성없이 클래스의 데이터 사용가능 => 서버,빅데이터,쓰레드
	/*
			내부 클래스
			  = 멤버 클래스 => 쓰레드, 서버 개발 
			  class A
			  {
			  	 class B
			  	 {
			  	 	A가 가지고 있는 모든 데이터를 공유 
			  	 }
			  }
			  = 익명의 클래스 => 상속없이 오버라이딩 가능
			  class A
			  {
			  	 B b=new B() (생성자에서 오버라이딩)
			  	 {
			  	 	public void disp(){}
			  	 	// 메소드 추가 가능
			  	 }
			  }
			  class B
			  {
			  	 public void disp(){} 
			  }
			  
			  => 지역 클래스
			  class A
			  {
			  	 public void disp()
			  	 {
			  	 	 class B
			  	 	 {
			  	 	 }
			  	 }
			  }
	 */
	class BarThread extends Thread{
		// ProgressBar 한개만 동작 => 5개
		int index;
		public BarThread(int index) {
			this.index=index; // 쓰레드
		}
		public void run() {
			for(int i=0;i<=100;i++) {
				bar[index].setValue(i);
				int a=(int)(Math.random()*300); // 일시정지
				try {
					Thread.sleep(a);
				}catch(Exception ex) {}
				
				if(i==100) {
					rank++;
					interrupt();
				}
				
			}
			System.out.println((index+1)+"번째"+rank+"등");
		}
	}
}
