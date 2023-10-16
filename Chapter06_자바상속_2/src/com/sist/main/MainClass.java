package com.sist.main;
/*
 * 		상속
 * 		자바 상속 => 1)멤버변수 2)메소드
 * 					------
 * 					 ㅣ static, private
 * 				  접근지정어
 * 				  -------
 * 					public/protected     default / private
 * 					----------------	 --------  --------
 * 					패키지와 관계없이 받을수있다		ㅣ	  		상속을 받을수는 있으나 접근 불가능	
 * 											패키지가 같은경우
 * 					=> 생성자, 초기화블록은 받을 수 없다
 * 
 * 		***** 클래스 여러개를 한개의 객체로 접근시에는 상위 클래스 이용
 * 				Student
 * 				ㅣ	  ㅣ
 * 			HStudent  UStudent
 * 			
 * 			HStudent h=new HStudent()
 * 			UStudent u=new UStudent()
 * 			-------------------------
 * 			Student h=new HStudent() ==> 하나의 객체명을 가지고 여러클래스를 제어
 * 			h=new UStudent()
 * 			
 * 			****** 모든 클래스를 한개의 객체로 연결이 가능 => Object **
 * 				  ------------------------------
 * 							Object o=new MainClass();
 * 							o=new MainClass1()....
 * 							Object는 모든 데이터형을 묶어서 사용이 가능
 * 							Object  o=10;
 * 									o=10.5;
 * 									o=true;...
 * 							-------------------- 자바의 매개변수가 객체인 경우
 * 												 Object => 형변환 => 제네릭스
 * 			=> 형식
 * 				class 하위 클래스 extends 상위 클래스
 * 			=> 단일 상속만 가능
 * 
 * 			다중 상속은 불가능하다
 * 			----------------
 * 			class man
 * 			{		
 * 				String name;
 * 				int age;
 * 			}
 * 			class woman
 * 			{
 * 				String name;
 * 				int age;
 * 			}
 *			// 자바에서는 존재하지 않는 코드 (다중 상속 => C/C++)
 * 			class Human extends Man, Woman => 다중상속
 * 			{
 * 				String name;
 * 				int age;
 * 				String name;   ==> 변수가 중복됨 => 다중상속 불가
 * 				int age;
 * 			}
 * 			// => 자바에도 다중 상속 존재 => 인터페이스 (07장)
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
