package com.sist.client;
import javax.swing.*;
import java.awt.event.*;
/*
 * 		Container : 윈도우창
 * 			**=> JFrame : 닫기, 확대, 축소
 * 			=> JDialog : 
 * 				= Modal => 선택한 작업을 하기전까지 다른작업 불가 => ex) 팝업창 확인/취소 버튼누르기전까지 다른작업불가
 * 				= Modaless => 선택작업 내리고 다른 작업 가능
 * 			=> JWindow : title바가 없다 (로그인제목있는 한줄없음) => ex) 이클립스 킬때 처음 로딩창(eclipse 홍보창과 로딩표시만보임)
 * 			**=> JPanel : 단독으로 실행할 수 없다
 * 			   ------> Button, TextField 묶어서 사용
 * 			=> **JTable, JTree
 * 		Component : => 단독으로 실행할 수 없다
 * 			버튼종류
 * 				= 일반 버튼 : JButton
 * 				= 토글 버튼 : JRadioButton, JCheckBox
 * 				= 메뉴  : JMenuItem
 * 			입력관련
 * 				= 한줄 입력 : JTextField
 * 				= 여러줄 입력 : JTextArea
 * 				= 비밀번호 입력 : JPasswordField
 * 			기타
 * 				= 문자출력, 이미지 출력 : ***JLabel
 * 				= ***JTable : 목록출력, (JList)
 * 				= ***JTabbedPane, JEditPane, JTextPane
 */
public class ClientMain implements ActionListener{
	// 생성자 => 오버로딩
	private JFrame fr=new JFrame("네트워크 미니 프로젝트");
	Login login=new Login();
	/*private JButton b1=new JButton("홈");   // ==> 처음부터 버튼이 일렬로 
	private JButton b2=new JButton("맛집");	  // 버튼형 (add랑 짝꿍)
	private JButton b3=new JButton("레시피");
	private JButton b4=new JButton("서울여행");*/
	
	/*JMenuItem home=new JMenuItem("홈");  // 
	JMenuItem house=new JMenuItem("맛집");
	JMenuItem recipe=new JMenuItem("레시피");
	JMenuItem seoul=new JMenuItem("서울여행");*/
	
	JTabbedPane pan=new JTabbedPane(); // 탭으로 한번에 여러개 추가
	
	public ClientMain() // 시작과 동시에 화면띄우기 => 생성자 ==> 윈도우창띄우기 // 네트워크-서버구동
	{
		pan.setTabPlacement(JTabbedPane.RIGHT); // 3) 탭으로 메뉴띄우기
		pan.addTab("홈", new JPanel());
		pan.addTab("맛집", new JPanel());
		pan.addTab("레시피", new JPanel());
		pan.addTab("서울여행", new JPanel());
		fr.add("Center",pan);
		
		/*JMenu menu=new JMenu("메뉴"); // 1)메뉴버튼을 하나 생성하고 add로 메뉴안에 들어갈 항목 추가 (이클립스화면좌측상단 file과같은버튼)
		menu.add(home);
		menu.add(house);
		menu.add(recipe);
		menu.add(seoul);
		JMenuBar bar=new JMenuBar();
		bar.add(menu);
		fr.setJMenuBar(bar);*/
		
		/*JPanel p=new JPanel(); // 2)버튼을 한줄에 묶기위함 (JPanel + add)
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		fr.add("North",p);*/
		
		fr.setSize(1024,768);
		//fr.setVisible(true);
		login.b1.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// UI종류
			UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
		}catch(Exception ex) {}
		
		new ClientMain();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b1) {
			login.fr.setVisible(false); // 로그인이 되면 로그인창을 끄고
			fr.setVisible(true);	// 윈도우화면을 띄운다
		}
	}

}
