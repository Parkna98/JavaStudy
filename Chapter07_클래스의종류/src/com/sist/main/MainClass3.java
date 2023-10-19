package com.sist.main;
/*
 * 		추상클래스 => 확장 (보완) => 인터페이스
 * 		인터페이스
 * 		-------
 * 			1. 추상클래스의 일종 => 인터페이스도 클래스
 * 				구분) 클래스 / 인터페이스 
 * 					-----  --------
 * 					ㅣ단일상속 	  ㅣ다중상속
 * 
 * 			2. 인터페이스는 구현된 메소드가 없이 추상메소드만 가지고 있다
 * 						---------
 * 						ㅣ 인터페이스에 메소드 추가가 되면 문제 발생
 * 						ㅣ JDK 1.8 구현 메소드를 사용하게 만듬
 * 								  ---------
 * 									default / static
 * 				=> 소프트웨어공학 : 인터페이스는 고정을 해야한다 
 * 			
 * 			3. 형식 (p247)
 * 				public interface interface명
 * 				{
 * 					------------------
 *					 변수
 *						=> 상수형 변수
 *						int a; ==> 오류
 *						int a=10;
 *						---------
 *							자동추가 => (public static final) int a=10;
 *									----------------------생략가능
 * 					------------------
 *					 구현이 안된 메소드
 *						void display(); ==> 구현 내용이 많은 경우
 *						=> 프로그램에 맞게 구현해서 사용
 *						=> (public abstract) void display();
 *							----------------
 *							*** 인터페이스는 모든 메소드가 public이어야 한다
 * 					------------------
 *					 구현이 된 메소드
 *						default void aaa(){
 *
 *						} 
 *						=> (public) default void aaa(){
 *							------생략가능
 *						}
 *						static void bbb(){
 *
 *						}
 *						=> (public) static void bbb(){}
 * 					------------------
 *					 생성자가 존재하지 않는다 (추상 클래스는 생성자가 있다)
 * 					------------------
 * 				}
 * 				인터페이스는 모든 접근지정어가 public(변수,메소드)
 * 				변수 => 반드시 명시적인 초기화를 한다
 * 				int a; => int a=10;
 * 
 * 				상속
 * 				---
 * 				implements => 구현해서 사용
 * 				------------------------
 * 				interface A =======> interface B
 * 				interface A
 * 				interface B (extends) A
 * 							---------
 * 
 * 				interface A =======> class B
 * 				interface A
 * 				class B (implements) A
 * 						------------
 * 				----------------------------------존재하지 않는 과정
 * 				class A    =======> interface B
 * 				interface B () A ===> 오류
 * 				-----------------------------------
 * 				interface A 
 * 				interface B extends A => A,B
 * 				interface C extends B => A,B,C
 * 				------------------------------------
 * 				interface D extends A,B (인터페이스는 다중상속가능)
 * 								    ---- 콤마로 구분
 * 				interface A
 * 				interface B
 *    			class C implements A,B ==> 다중 상속
 *    
 *    			interface A
 *    			interface B
 *    			class C
 *    			** class D extends C implements A,B
 *    					-------------
 *    				    ㅣ class 상속 -----------------
 * 									ㅣ 인터페이스 상속
 * 				=> 윈도우
 * 				=> 인터페이스에 설정된 모든 것(메소드,변수)
 * 					public만 사용이 가능 => public을 설정하지 않으면 자동추가
 * 				=> 인터페이스 사용
 * 					=> 윈도우 이벤트 처리
 * 					=> 사용자 정의 => 클래스 관리 (Spring : 클래스 찾기(DL)) (스프링은 클래스 관리자라고 생각하면됨)
 * 					-----------------------
 * 						ㅣ => 인터페이스 대신 어노테이션으로 변경
 * 										-------- @구분자 
 * 				=> 설계
 * 					1. 개발기간이 단축
 * 						ex) 
 * 							예약
 * 							로그인 	
 * 							맛집선택
 * 							예약일 선택
 * 							예약 시간 선택
 * 							인원 확인
 * 							계약금을 전송
 * 							=> 좌선 선택
 * 					2. 인터페이스 => 표준화
 * 					
 * 					3. 서로 다른 클래스 연결해 주는 역할 (스프링)
 * 			-----------------------------------------------
 * 			실무 
 * 				개발기간 : 8개월
 * 				1. 설계(요구사항분석) => 3개월 => 인터페이스 => 아키텍쳐
 * 				2. 데이터베이스 설계 : 1개월 => DBA
 * 				3. 화면 UI : 1개월 => 퍼블리셔
 * 				4. 구현 : 2개월 => 웹 프로그래머(***)
 * 				5. 테스트 배포 : 1개월 => 테스터
 * 
 * 			*** 인터페이스는 자신이 메모리 할당을 할 수 없다
 * 				=> 구현된 클래스를 이용해서 메모리 할당을 한다
 * 			
 * 			interface A
 * 			class B implements A
 * 			=> A a=new B();
 */
/*interface A{
	//protected void disp(); => Error! only public!!
	int a=10; // public static final 생략된 상태
	void disp(); // public abstract 생략된 상태 
}
class B implements A{
	// void disp() {} // Error! => A는 public이라 B에서 default로 축소되서 오류 => 확대만가능
	public void disp() {}
}*/
//I i=new A(); // I(인터페이스)도 클래스임!! 상위클래스라 A로 생성가능
// I => display() aaa()  ===> 같은 메소드만 가져갈 수 있기때문에
//						 ===> 최대한 같은메소드만 작성할수 있도록하자! 
// 						 ===> 인터페이스에 메소드 추가되는것은 public default void로 하면됨
// A => bbb				 ===> **** 하위클래스의 독자적인 메소드는 상위클래스에서 쓸 수 없다!! 
//									상위클래스에 있는 같은 메소드(내용은 변경가능(오버라이딩))만 사용가능!!!
//						 ===> I(인터페이스)는 자신의 메모리할당이 불가하므로 A를 통해서만 메모리할당이 가능하다
//								따라서, 인터페이스에 있는 메소드를 A를 통해 가져온다 
/*
 * 		인터페이스가 방화벽역할을 하는것?
 * 		인터페이스(I)로 묶어진 클래스들(A~C) 중 A에서 에러 
 * 		=> I는 각각의 클래스에서 공통의 메소드를 받아서 호출하는데,
 * 		   A에서 메소드명이 수정되어서 오류가 생겨도, 다른 클래스는 어짜피 인터페이스와 연결되어있기때문에
 * 		   A의 오류는 다른 클래스에 영향을 미치지 못한다 (인터페이스가 아닌경우는 다른객체들도 전부 오류남 (보통 하나의 클래스로 나머지를 묶기때문에)) 
 * 		   
 * 		단점: 여러개의 공통기능중 한개만 쓰려해도 모든 기능을 다 가져와야함
 * 			=> default를 써서 안쓸기능 버려라 
 */
import javax.swing.*;
import java.awt.event.*;
public class MainClass3 extends JFrame implements ActionListener,MouseListener,KeyListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 호출만 하고 구현은 프로그래머가 하는 방식
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
