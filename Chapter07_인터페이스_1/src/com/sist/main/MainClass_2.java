package com.sist.main;
/*
 * 		인터페이스
 * 		기본문법) 
 * 				변수는 사용할 수 없다 (상수만 사용 가능)
 * 				int i; ==> 오류
 * 				int i=10; ==> 생략된 것이 있다
 * 				---- public static final int i=10;
 * 					 -------------------
 * 					 => static final int i=10;
 * 						// 상수
 * 						final int i=10;
 * 						// 상수형 변수
 * 						int i=10;
 * 						// 변수
 * 				메소드 
 * 				구현이 안된 메소드 : 구현 내용이 여러개인 경우 ex) 도형 (선,사각형,원...)(무조건 지정해야하는내용)
 * 					(public abstract) void display();		
 * 				구현이 된 메소드 : 공통으로 사용되는 부분 정의 ex) 검정색(default) (색지정없으면 검정색)
 * 					=> 새로운 기능 추가
 * 						(public) default void kkk(){}
 * 						(public) static void eee(){}
 * 					==> 메소드나 상수를 선언 => 무조건 public
 * 				상속 : 인터페이스도 클래스다
 * 					  -------------- 상속시 상위 클래스다
 * 					  extends 
 * 					  implements 
 * 					  ----------- 상속
 * 				다중상속 : ,로 구분
 * 				
 * 				interface ===== interface
 * 						  extends
 * 	
 * 				interface ===== class
 * 						 implements 
 * 								
 *		 	class A
 *			interface B
 *			interface C
 *			class D extends A implements B,C
 *			{		-------	  ----------
 *					 확장			구현
 *			}
 */	
interface A{
	/*public static final*/ // public static final은 생략일뿐 => a는 초기화를 반드시 해줘야함
	void aaa();
	void bbb(); // 다른클래스에서 인터페이스 implements할때 반드시 인터페이스의 메소드 모두 구현해줘야한다
	void ccc();
	/*public abstract*/ void ddd(); // public abstract는 생략되어있는 것
	void eee();
	public default void kkk() {} // 다른클래스와 연결후, 새로운 기능을 추가할때, 구현을 하고 들어와야한다.
}
class B implements A{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ccc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ddd() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eee() {
		// TODO Auto-generated method stub
		
	}

}

interface C{
	void aaa();
}
interface D{
	void bbb();
}
class E implements D,C{
	public void aaa() {System.out.println("aaa()");} // 인터페이스는 선언만, 클래스에서 받으면 구현해주자
	public void bbb() {System.out.println("bbb()");}
}
public class MainClass_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B();
		a.kkk();
		
		D d=new E();
		// d.aaa(); => 다중상속의 경우, D로 생성한경우 D에 있는것만 쓸수있어서 aaa()는 C에있어서 오류
		d.bbb();
		
		// ===> 다중상속 받았을땐
		E e=new E(); // 모든 메소드 가지고있는 E의 클래스 객체를 생성하자!
	}

}
