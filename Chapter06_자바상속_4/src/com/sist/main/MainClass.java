package com.sist.main;
/*
 * 		1. 상속
 * 			=> 멤버변수, ***메소드(기능 => 상속) 
 * 			   ------
 * 				ㅣ 접근지정어 (private, default(패키지가 다른 경우))
 * 				=> 메소드를 재사용하거나 변경해서 사용 (기능)
 * 				=> 객체 지향 관련 => 메소드
 * 				=> 라이브러리는 변수가 없다 => 메소드
 * 							--- 상수
 * 		=> 형식
 * 			단일 상속만 가능
 * 			class SubClass extends SuperClass
 * 						   -------
 * 							기존의 클래스를 확장(수정,추가)
 * 			{
 * 				SuperClass가 가지고 있는 모든 메소드 사용이 가능
 * 				=> 변경해서 사용이 가능(오버라이딩)
 * 			}
 * 
 * 		=> 호출
 * 			class A
 * 			class B extends A
 * 				 ---	   ---
 * 				  ㅣSub		ㅣSuper  =>	 Super > Sub
 * 				*** 상속을 내리는 클래스가 상속 받은 클래스 보다 크다 ==> 크기가 있기때문에 형변환이있다!
 * 
 * 				*** 모든 클래스의 상위클래스는 Object
 * 					=> 자바에서 지원하는 라이브러리는의 메소드 => Object를 리턴한다 => 형변환해줘야한다
 * 		
 * 				=> 확장 (클래스 사용시에는 확장된 클래스를 사용한다)		
 * 				// A a=new A() => 활용
 * 				B b=new B(); 보통의 경우
 * 				A a=new B(); A로부터 상속을 받은 여러클래스를 묶는 경우 (특별한경우) => Spring
 * 							-------------------------------
 * 								ㅣ 카페 => 게시판 (여러 게시판이 있지만 하나의 객체로 받을 수 있다)
 * 				*** 상위 클래스는 하위 클래스에 있는 변수/메소드 접근이 불가
 *				B b=new B(); 상위,하위 클래스의 변수 메소드 접근가능
 * 				A a=new B(); 변수는 상위클래스만, 메소드는 하위클래스 접근가능
 * 
 * 				class A
 * 				{
 * 				-------------------a
 * 					int a,b;	=====> c
 * 					void aaa(){}
 * 					void bbb(){}	
 * 				-------------------
 * 				}
 * 				class B extends A
 * 				{
 * 					----------------------------b
 * 					int c,d;
 * 					----------- 눈에 보이지않지만 메모리상에 배치
 * 					int a,b;
 * 					----------------------c
 * 					void aaa(){} => 변경시 
 * 					void bbb(){} => 변경시
 * 					void ccc(){}
 * 					----------------------
 * 					-----------------------------
 * 				}
 * 				A a=new A();
 * 				B b=new B();
 * 				A c=new B(); => A가 가지고 있는 변수, B에서 오버라이딩된 메소드 호출
 * 				  -- c는 접근 불가능 : 변수 ( c,d )
 * 								   메소드( ccc() ) => B에서 A의 메소드를 오버라이딩한것만 호출 
 * 													B에서 새로 추가된 메소드는 호출불가 (A영역에 있는것만 가능)
 * 				클래스 객체명
 * 				--------- => 객체는 클래스에 있는 변수, 메소드만 사용한다
 * 				A a=> A클래스에 정의된 변수와 메소드만 접근 가능
 * 				
 * 				상위클래스 = 하위클래스
 * 				-------	  -------
 * 				   ㅣ		 ㅣ
 * 				  변수		메소드  ==> 메소드는 상위 클래스에 있는 것만 가능
 * 				
 * 			
 */
class A // extends Object 생략 
{
	int a=10,b=20;
	void aaa() {System.out.println("A:aaa() Call...");}
	void bbb() {System.out.println("A:bbb() Call...");}
}
class B extends A
{
	int a=100,b=200,c=300,d=400;
	void aaa() {System.out.println("B:aaa() Call...");}
	void bbb() {System.out.println("B:bbb() Call...");}
	void ccc() {System.out.println("B:ccc() Call...");}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Object o=new A();
		// o.aaa(); => Error! why? 상위클래스는 하위클래스의 메소드에 접근이 불가 (반대만 가능)
		// 					=> 접근하려면 형변환 필요
		A o2=new A(); // => 하위클래스로 받아야 접근이 쉽다 */
		
		A aa=new A();
		System.out.println("aa.a="+aa.a);
		System.out.println("aa.b="+aa.b);
		aa.aaa();
		aa.bbb();
		// 가장 많이 사용 70%
		B bb=new B();
		System.out.println("bb.a="+bb.a);
		System.out.println("bb.b="+bb.b);
		System.out.println("bb.c="+bb.c);
		System.out.println("bb.d="+bb.d);
		bb.aaa();
		bb.bbb();
		bb.ccc();
		// 인터페이스 => 클래스 여러개를 묶어서 사용 30%
		A cc=new B();
		System.out.println("cc.a="+cc.a); 
		System.out.println("cc.a="+cc.b);
		cc.aaa(); // B의 오버라이딩된 메소드 접근 (오버라이딩된 aaa())
		cc.bbb(); // 
		// ccc()는 오버라이딩된 메소드가 아니기때문에 접근불가!
		
		// 멤버변수 : 클래스,    메소드 : 생성자 타입 (상위클래스에 있던 메소드가 오버라이딩된 메소드만 가져옴)
		
	}

}
