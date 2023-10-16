package com.sist.man2;
// 변수, 메소드 오버라이딩 => 덮어쓴다
/*
 * 		오버라이딩
 * 		-------
 * 		1) 메소드명이 동일
 * 		2) 상속
 * 		3) 매개변수가 동일
 * 		4) 리턴형 동일
 * 		5) 축소불가, 확장가능 (접근지정어) 크기는 public>protected>default>private 순
 * 		  ---------------
 * 			private < default < protected < public
 */
class Super{
	int number=10;
	void display() {
		System.out.println("Super:display Call...");
	}
}
class Sub extends Super // Super를 확장해서 새로운 클래스를 만든다
{
	int number=20;
	protected void display() {
		System.out.println("Sub:display Call..."); // 오버라이딩 : Super클래스의 display() 변경
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super su=new Super();
		System.out.println("super.number="+su.number);
		Sub sub=new Sub();
		System.out.println("sub.number="+sub.number);
		
		Super su1=new Sub(); 
		System.out.println("super.number="+su1.number);
		// 클래스 선언에 따라서 해당 데이터를 제어한다!
		// Super생성 => Super에 있는 변수
		// Sub생성 => Sub에 있는 변수
		// Super / Sub / Sub=Super  ===> 3가지 경우
		Super s1=new Super();
		s1.display(); 	// Super display Call
		Sub sub1=new Sub();
		sub1.display(); // Sub display Call
		Super s2=new Sub();
		s2.display(); 	// Sub display Call
		
		/*
		 * 		멤버변수 : 선언된 클래스형으로 제어
		 * 			Super s=new Super() ===> Super 클래스의 변수제어
		 * 			Sub sub=new Sub()	===> Sub 클래스의 변수제어
		 * 			Super s2=new Sub()	===> Super 클래스의 변수제어
		 * 			** 변수는 선언된 클래스 **
		 * 		메소드
		 * 			Super s=new Super() ===> Super 클래스의 메소드제어
		 * 			Sub sub=new Sub()	===> Sub 클래스의 메소드제어
		 * 			Super s2=new Sub()	===> Sub 클래스의 메소드제어
		 * 				=> 동적 바인딩
		 * 					생성자에 따라서 메소드의 주소값이 변경
		 * 					생성자에 따라서 메소드 변경O, 변수는 변경X
		 * 			** 메소드는 생성자 타입 **
		 */
	}

}
