package com.sist.client;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import java.net.URL;

import com.sist.vo.*;
import com.sist.common.ImageChange;
import com.sist.manager.*;

public class MovieDetailPanel extends JPanel implements ActionListener {
	JLabel imageLa;
	JLabel titleLa, scoreLa;
	JLabel regdateLa, genreLa, nationLa, gradeLa;
	JLabel timeLa, make_shareLa;
	JButton b;
	ControllPanel cp;
	JLabel la1,la2,la3,la4,la5,la6; // 항목명
	MovieManager mm=new MovieManager();
	
	public MovieDetailPanel(ControllPanel cp) {
		this.cp=cp;
		imageLa=new JLabel();
		titleLa=new JLabel();
		scoreLa=new JLabel();
		regdateLa=new JLabel();
		genreLa=new JLabel();
		nationLa=new JLabel();
		gradeLa=new JLabel();
		timeLa=new JLabel();
		make_shareLa=new JLabel();
		
		b=new JButton("목록");
		la1=new JLabel("개봉일");
		la2=new JLabel("장르");
		la3=new JLabel("국가");
		la4=new JLabel("등급");
		la5=new JLabel("러닝 타임");
		la6=new JLabel("누적 관객수");
		
		// 배치
				setLayout(null);
				imageLa.setBounds(10, 15, 300, 375);
				add(imageLa);
				
				titleLa.setBounds(320, 15, 300, 35);
				scoreLa.setBounds(450, 15, 40, 35);
				add(titleLa); add(scoreLa);
				
				la1.setBounds(320, 55, 70, 35);
				regdateLa.setBounds(395, 60, 400, 35);
				add(la1); add(regdateLa);

				la2.setBounds(320, 100, 70, 35);
				genreLa.setBounds(395, 100, 400, 35);
				add(la2); add(genreLa);
				
				la3.setBounds(320, 140, 70, 35);
				nationLa.setBounds(395, 140, 400, 35);
				add(la3); add(nationLa);
				
				la4.setBounds(320, 180, 70, 35);
				gradeLa.setBounds(395, 180, 400, 35);
				add(la4); add(gradeLa);
				
				la5.setBounds(320, 220, 70, 35);
				timeLa.setBounds(395, 220, 400, 35);
				add(la5); add(timeLa);
				
				la6.setBounds(320, 260, 70, 35);
				make_shareLa.setBounds(395, 260, 400, 35);
				add(la6); add(make_shareLa);
				
				b.setBounds(320, 340, 100, 35);
				add(b);
				
				b.addActionListener(this);
	}
	public void MoviePrint(MovieReservationVO vo) {
		try {
			titleLa.setText(vo.getTitle());
			scoreLa.setText(String.valueOf(vo.getScore()));
			regdateLa.setText(vo.getRegdate());
			genreLa.setText(vo.getGenre());
			nationLa.setText(vo.getNation());
			timeLa.setText(vo.getTime());
			gradeLa.setText(vo.getGrade());
			make_shareLa.setText(vo.getMake_share());
			
			URL url=new URL(vo.getImage());
			Image image=ImageChange.getImage(new ImageIcon(url), 300, 500);
			imageLa.setIcon(new ImageIcon(image));
		}catch(Exception ex) {}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b) {
			cp.card.show(cp, "home"); // 목록누르면 목록화면으로 
		}
	}


}
