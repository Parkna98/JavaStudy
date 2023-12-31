package com.sist.exception;
/*
 * 		캡슐화 : private변수 / 읽기/쓰기(getter/setter) 메소드 추가
 * 
 * 		재사용 : 상속(is-a) / 포함(has-a)
 * 
 * 		다형성 : 수정(Modify) : 오버라이딩 / 추가(New) : 오버로딩
 * 		-----------------------------------------------------
 * 		클래스의 종류
 * 		---------
 * 			미완성 클래스 (미완성 => 메소드 구현이 안된 상태)
 * 				=> 단점 : 메모리 할당이 불가능 하다 (new사용 불가)
 * 				=> 상속을 내려서 구현후에 사용 ==> 오버라이딩
 * 				=> 관련된 클래스를 한개의 객체명으로 관리
 * 			= 추상 클래스 : 단일 상속, 멤버변수, 생성자, 구현된 메소드, 구현이 안된 메소드
 * 				
 * 			= 인터페이스 : 다중 상속, 상수, 구현이 안된 메소드 중심
 * 						=> 구현된 메소드 추가 : default(접근지정어 아님) / static
 * 			-------------------------------------------------------
 * 			=> 상속
 * 				class ========= class
 * 					   extends
 * 			
 * 				interface ========= interface
 * 					  	   extends
 * 			
 * 				interface ========== class
 * 					  	  implements
 * 			-----------------------------------
 * 				class A
 * 				class C
 * 				class B extends A,C ==> 오류
 * 				
 * 				class A
 * 				class C extends A
 * 				class B extends C
				------------------ 정상 코드
				
				interface A
				interface B extends A
				interface C extends B
				interface D extends A,B ==> 가장 많이 사용
				----------------------- 다중상속
				
				class A
				interface B
				interface C
				class D extends A implements B,C 
				---------------------------------
				
				interface A
				interface B
				class C implements A,B
				-----------------------
				
				interface ==> Container 역할, Controller 역할
									ㅣ				ㅣ
								묶어주는 역할		  찾기,제어
							  -----------------------------
							  	ㅣ 스프링 ==> AOP
							  => 실무에서 order 
							  	 모듈화, 말아올려, 컨테이너, 컨트롤러, 컴포넌트.....
							  	 (모듈화 : 클래스를 만들어서 인터페이스 연결해서 실행)
							  	 (말아올려 : 인터페이스 대입)
							  	 실무에서 리서치(구글링,GPT)하는 법도 중요 
							  	 	=> ex) 예매시스템 리서치 => AJax, VueJs를 이용한 예매시스템검색
 */
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
