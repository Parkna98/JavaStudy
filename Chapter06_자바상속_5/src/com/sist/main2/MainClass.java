package com.sist.main2;
class Movie{
	// 공통성
	/*
	 * 		예약을 한다
	 * 		영화목록을 보여준다
	 * 		상세보기
	 * 		결재를 한다
	 * 		영화 추천
	 * 		...
	 */
	void reserve() {
		System.out.println("예약을 한다");
	}
	void list() {
		System.out.println("영화 목록을 출력한다");
	}
	void detail() {
		System.out.println("영화 상세 보기를 한다");
	}
	void recommand() {
		System.out.println("영화 추천을 한다");
	}
}
// cf) 선언만하고 구현은 각 프로그램에 맞게 따로 구현 => 인터페이스와 추상클래스
class CGV extends Movie{

	@Override
	// 접근지정어를 확장할 수 있다 (default->public, protected)
	// 기능추가도 가능
	// 필요한 내용만 오버라이딩 => 오버라이딩 하지 않는 부분은 상위클래스의 것을 그대로 쓴다
	void reserve() {
		// TODO Auto-generated method stub
		System.out.println("CGV 예약"); // 기능 변경
	}
	/*
	@Override
	protected void list() {
		// TODO Auto-generated method stub
		super.list();
	}

	@Override
	void detail() {
		// TODO Auto-generated method stub
		super.detail();
	}

	@Override
	void recommand() {
		// TODO Auto-generated method stub
		super.recommand();
	}*/
	
}
class MegaBox extends Movie{

	@Override
	void reserve() {
		// TODO Auto-generated method stub
		System.out.println("MegaBox 예약");
	}
	
	// 확장 => 상위클래스(Movie)에는 없는 기능 추가
	public void print() {
		System.out.println("MegaBox:print() Call...");
	}
	/*
	@Override
	void list() {
		// TODO Auto-generated method stub
		super.list();
	}

	@Override
	void detail() {
		// TODO Auto-generated method stub
		super.detail();
	}

	@Override
	void recommand() {
		// TODO Auto-generated method stub
		super.recommand();
	}*/
	
}
public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CGV c=new CGV();
		c.reserve();
		
		MegaBox m=new MegaBox();
		m.reserve();
		m.print(); 
		
		// 한개의 객체만 생성 => 상위 클래스 이용(관련내용 한번에 묶기)
		// 상속을 받는 목적 => 관련된 클래스를 묶어서 한개의 객체이용
		Movie mm=new CGV(); // Movie안에 있는 메소드를 호출***
							// Movie의 메소드를 CGV의 메소드로 덮어씀(오버라이딩)
							// 메소드 호출시에 오버라이딩을 하면 => 변경된 메소드 호출
		mm.reserve(); 
		// 생성자와 클래스가 다른 경우에 => 오버라이딩된 메소드 호출
		mm=new MegaBox();	// mm은 print()를 호출 할 수 없다(MegaBox에만 추가한 기능) (mm은 상위클래스) 
		// 하나의 상위클래스 객체로 하위클래스를 묶음
		mm.reserve();
		//mm.print(); // Error!
		
		/*
		 * 		생성자와 클래스명이 다른 경우
		 * 		Movie m=new CGV();
		 * 		-----	----------
		 * 		m을 통해 접근시에 => Movie 안에 있는 메소드와 멤버변수에만 접근 가능
		 * 
		 * 		class Movie
		 * 		{	
		 * 			int a=100;
		 * 			void print(){"movie"}
		 * 		}
		 * 		class CGV extends Movie
		 * 		{
		 * 			int b;
		 * 			void aaa(){}
		 * 			------------ 메모리
		 * 			int a=1000;  ==> 멤버변수 오버라이딩
		 * 			void print(){"cgv"} ==> 메소드 오버라이딩
		 * 			-------------- 
		 * 		}
		 * 
		 * 		Movie m=new CGV();
		 * 				----------
		 * 					ㅣ 주소 변경
		 * 		m ==> a, print() => CGV가 가지고 있는 print()
		 * 		
		 * 		1) 변수 => 클래스명
		 * 			=> 멤버변수 오버라이딩 했을 경우는 a=100; 안했을 경우는 a=1000;
		 * 		2) 메소드 => 생성자
		 * 			==> 100개 
		 * 			==> 분리
		 * 			==> 한개의 객체로 100개 작업 ==> Object
		 * 			==> 배열
		 * 			Object[] obj={10,"aaa",10.5,'A',new Movie()};
		 * 				=> Object는 모든 데이터형을 받을 수 있다
		 */
		Object o=10;
		int i=(int)o; // => Object가 int보다 큰데이터형이므로 형변환
		o=10.5;
		o="aaa";
		o='A';
		
		Object oo=new CGV();
		CGV cc=(CGV)oo; // 객체 형변환 => Object가 CGV보다 크기때문에 형변환
		// Object를 CGV로 받는이유? oo는 CGV의 메소드 접근이 불가하기때문에 CGV로 받아서 cc를 통해 CGV메소드로 접근
		
		// 자바에서 => 클래스 객체를 리턴하는 메소드가 많이 존재
		// 			-------------- 무슨 데이터형으로 리턴할지 몰라 => Object로 다 받아서 들어옴
	}

}
