package com.sist.client;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import com.sist.manager.FoodManager;
import com.sist.manager.MovieManager;
import com.sist.vo.FoodCategoryVO;
import com.sist.vo.MovieReservationVO;

public class HomePanel extends JPanel implements ActionListener{
	JButton b1,b2,b3;
	PosterCard[] pcs=new PosterCard[20];
	//FoodManager fm=new FoodManager();
	MovieManager mm=new MovieManager();
	JPanel pan=new JPanel(); // 이미지가 배치
	public HomePanel() {
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(1,3,20,20)); // 1줄에 3개 배치 (간격 5,5)
		b1=new JButton("믿고 보는 맛집 리스트");
		b1.setPreferredSize(new Dimension(300,45));
		b2=new JButton("지역별 인기 맛집");
		b2.setPreferredSize(new Dimension(300,45));
		b3=new JButton("메뉴별 인기 맛집");
		b3.setPreferredSize(new Dimension(300,45));
		p.add(b1); p.add(b2); p.add(b3);
		
		pan.setLayout(new GridLayout(4,5,20,10)); // 총12개이니까 4줄에 각 3개씩
		
		// 배치
		setLayout(new BorderLayout()); // 스크롤바를 만들기위한 borderlayout
		add("North",p); 
		add("Center",pan);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void cardPrint(ArrayList<MovieReservationVO> list) {
		int i=0; 
		for(MovieReservationVO vo:list) {
			pcs[i]=new PosterCard(vo);
//			if(list.size()==6) {
//				FoodCategoryVO fvo=new FoodCategoryVO();
//				fvo.setPoster("c:\\javaDev\\default.png");
//				for(int j=6;j<12;j++) {
//					pcs[j]=new PosterCard(fvo);
//				}
			//}
			pan.add(pcs[i]);
			i++;
		}
	}
	public void cardInit(ArrayList<MovieReservationVO> list) {
		for(int i=0;i<list.size();i++) {
			pcs[i].poLa.setIcon(null); // 현재화면 싹 지우고 다른화면 띄우기
			pcs[i].tLa.setText("");
		}
		pan.removeAll(); // 데이터 제거
		pan.validate(); // validate() => Panel 재배치 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			ArrayList<MovieReservationVO> list=mm.MovieReservationData();
			cardInit(list);
			cardPrint(list); 
		}
		/*
		else if(e.getSource()==b2) {
			ArrayList<MovieReservationVO> list=mm.MovieReservationData(2);
			MovieReservationVO fvo=new MovieReservationVO();
//			fvo.setPoster("c:\\javaDev\\default.png");
			fvo.setImage("null");
			fvo.setTitle("");
			for(int j=0;j<6;j++) {
				list.add(fvo);
			}
			cardInit(list);
			cardPrint(list); 
			
		}
		else if(e.getSource()==b3) {
			ArrayList<MovieReservationVO> list=mm.MovieReservationData(3);
			cardInit(list);
			cardPrint(list); 
			
		}*/
	}
}
