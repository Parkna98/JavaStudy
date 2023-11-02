//package com.sist.client;
//import java.util.*;
//import javax.swing.*;
//import javax.swing.table.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.net.*;
//
//import com.sist.vo.*;
//import com.sist.common.*;
//import com.sist.manager.*;
//
//public class MovieFindPanel extends JPanel implements ActionListener {
//	JTextField tf;
//	JButton b1,b2;
//	JTable table;
//	DefaultTableModel model;
//	ControllPanel cp;
//
//	
//	public MovieFindPanel(ControllPanel cp) {
//		this.cp=cp; // 화면 이동
//		tf=new JTextField(20);
//		b1=new JButton("검색");
//		b2=new JButton("홈이동");
//		
//		String[] col= {"","영화명","장르"};
//		Object[][] row=new Object[0][3]; // 가변
//		
//		model=new DefaultTableModel(row,col) {
//
//			@Override
//			public boolean isCellEditable(int row, int column) {
//				// TODO Auto-generated method stub
//				return false;
//			}
//
//			@Override
//			public Class<?> getColumnClass(int columnIndex) {
//				// TODO Auto-generated method stub
//				return getValueAt(0, columnIndex).getClass();
//			}
//			// Class.forName("")
//		};
//		table=new JTable(model);
//		table.setRowHeight(30);
//		JScrollPane js=new JScrollPane(table);
//		
//		// 배치
//		JPanel p=new JPanel();
//		p.add(tf);
//		p.add(b1);
//		p.add(b2);
//		
//		setLayout(new BorderLayout());
//		add("North",p);
//		add("Center",js);
//		
//		b1.addActionListener(this);
//		b2.addActionListener(this);
//		tf.addActionListener(this);
//	}
//	public void findPrint(String title) {
//		try {
//			ArrayList<MovFoodHouseVO> list=mm..FoodFindData(title);
//			for(int i=model.getRowCount()-1;i>=0;i--) {
//				model.removeRow(i);
//			}
//			
//			for(FoodHouseVO vo:list) {
//				URL url=new URL(vo.getPoster());
//				Image image=ImageChange.getImage(new ImageIcon(url), 90, 90);
//				Object[] obj= {
//						new ImageIcon(image),vo.getName()
//				};
//				model.addRow(obj);
//			}
//		}catch(Exception ex) {}
//	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
