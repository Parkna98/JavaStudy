package com.sist.main;
/*
 * 		7장 정리
 * 		------ JSP, Spring, Spring-Boot => 기본 자바 (자바기반 라이브러리)
 * 			   => HTML/CSS/JavaScript
 * 			   => 데이터 저장 => 오라클/MySQL
 * 			   -------------------------- + K-디지털 : 데이터분석(파이썬)
 * 
 * 		*** 인터페이스는 같은 기능을 가지는 클래스를 만들어서 제어
 * 					 ------- 강제화
 * 			interface I
 * 			{
 * 				void aaa();
 * 				void bbb();
 * 				void ccc();
 *				// 새로 기능을 추가하고싶다면
 *				default void ddd(){}
 *				default void eee(){}
 *				default void kkk(){}
 * 			}
 * 			class A implements I
 * 			{
 * 				void aaa(){} // 인터페이스의 메소드 강제구현
 * 				void bbb(){}
 * 				void ccc(){}
 * 				void ddd(){}
 * 			}
 * 			class B
 * 			{
 * 				void aaa();
 * 				void bbb();
 * 				void ccc();
 * 				void eee();
 * 			}
 * 			class C
 * 			{
 * 				void aaa();
 * 				void bbb();
 * 				void ccc();
 * 				void kkk();
 * 			}
 * 			인터페이스의 구현받은 클래스에 메소드가 새로 추가될 경우 => 인터페이스로 관리불가
 * 			I i=new A() => i를 가지고 A가 가지고 있는 메소드를 제어
 * 				=> 접근을 할 수 없는 메소드 존재
 * 				aaa(),bbb(),ccc()(O) ddd()(X)
 * 			I i=new B() => i를 가지고 B가 가지고 있는 메소드를 제어
 * 			I i=new B() => i를 가지고 C가 가지고 있는 메소드를 제어
 * 			==> A,B,C가 유형이 같은 경우 => 한개의 이름으로 제어(I)
 * 				목적 => 서로 다른 클래스를 묶어서 관리
 * 					   ----------- 관련
 * 				   => 관리(소스 코딩이 간결)
 * 				   => 인터페이스의 메소드 동일
 * 				   ex)
 * 							DriverManager (인터페이스)
 * 								  ㅣ
 * 						------------------------------------------------
 * 						오라클 MySQL MSSQL DB2 SQLITE 사이베이스... (데이터베이스)
 * 						=> SQL문장 => ANSI(표준어)
 * 					
 * 				    컬렉션 (CRUD)
 * 					Collectiion
 * 						ㅣ
 * 				-------------------
 * 				ㅣ
 * 			   List(인터페이스) => 아래메소드의 추가,삭제할때의 메소드 동일
 * 				ㅣ
 * 			----------------------------------
 * 			ㅣ		ㅣ		ㅣ		   ㅣ	 ㅣ
 * 		ArrayList  Vector LinkedList Stack	Queue
 * 
 * 		1. 인터페이스 VS 추상클래스
 * 		   -------------------------------------------------------------------
 *						인터페이스						추상클래스 (일반클래스와 거의 동일) => 차이점 : 선언만된 메소드 생성가능(구현X), 혼자 메모리 할당 불가
 * 		   -------------------------------------------------------------------
 * 			구현메소드		선언된 메소드					선언된 메소드 / 구현된 메소드
 * 				JDK 1.8) + 구현된 메소드
 * 						= default
 * 						  (인터페이스에서 접근지정어가 아니다)
 * 						  (인터페이스는 접근지정어가 public)
 * 						public default void disp();
 * 						= static
 * 						 => 접근시 반드시 인터페이스명으로만 접근
 * 		   -------------------------------------------------------------------
 * 			인스턴스변수	사용할 수 없다					사용이 가능
 * 						=> 공용						private 변수 가능
 * 						=> 상수형 변수만 사용
 * 						=> public(only)
 * 						=> openjdk
 * 						   jdk => 1.9(private가 가능) 
 * 						   	=>  C/C++ => exe
 * 						   	=>  오라클에서 필요한 것(윈도우창)
 * 		   -------------------------------------------------------------------
 * 			생성자 		생성자 없음						생성자 있음
 * 		   -------------------------------------------------------------------
 * 			접근범위		모든 내용을 공개					한정한다 (모든 접근지정어 사용가능)
 * 						=> 메소드, 변수	
 * 		   -------------------------------------------------------------------
 *			상속			다중상속						단일상속
 *						implements					extends
 *			
 *						interface => interface		
 *								 (extends)
 *						interface => class
 *								(implements) 						
 *						=> 사용자 정의, 라이브러리
 *							=> 단일 상속이 중심이다
 *						=> 윈도우 : 여러개 받는 경우가 있다	
 * 		   -------------------------------------------------------------------
 *			** 공통점	: new를 이용해서 메모리 할당이 불가능하다 (람다를 쓰면 가능은함) => new를 쓰면 인터페이스 상의 모든 메소드 오버라이딩해야함
 *					 => 상속을 내려서 상속받은 클래스가 구현해서 사용
 *			** 목적 : 서로 다른 클래스를 연결해서 사용가능
 *					 관련된 클래스를 모아서 사용
 *			** 실생활
 *				=> 충전기의 pin, 어댑터(110V=>220V)
 *				=> 컴퓨터 : 마우스, 키보드
 *				   업체가 여러개
 *				   ---------
 *					MS => 인터페이스 전송
 *		   --------------------------------------------------------------------
 *			인터페이스의 구성요소
 *			public interface interface명
 *			{
 *				-----------------------------
 *				상수 : 반드시 초기값 설정 (명시적)	
 *				int a=10;
 *					  ---	
 *				(public static final) int a=10;
 *				=> 생략이 되면 접근지정어와 제어어를 자동추가
 *				-----------------------------
 *				구현이 안된 메소드 : 프로그램에 맞게
 *				=> 개발자가 알아서 구현
 *				(public abstract) void display();
 *				-----------------------------
 *				구현이 된 메소드
 *				=> 공통으로 사용
 *					=> 필요시마다 변경해서 사용
 *				(public) default void display(){}
 *						 -------접근지정어가 아니라 구현된 메소드
 *				(public) static void diplay(){}
 *				==> static메소드에 접근할때는
 *					인터페이스명.메소드명()  ***
 *				-----------------------------
 *			}			
 *			*** 만약 기능추가가 필요하다면 default!!	
 * 
 */
import java.util.*;
interface I{
	//private int a=10; // Error! interface는 public만 가능
	public int a=10;
	// public은 생략하면 => 컴파일러에 의해 자동추가
	public static void display() {
		System.out.println("I:display() Call...");
	}
	default void kkk() {} // 새로 추가되는 기능 (public) default 
}
class A{
	public static void aaa(){
		System.out.println("A:aaa() Call");
	}
}
class B extends A{
//		상속
	public void bbb() {
		aaa(); // static메소드는 공유라서 경로설정안해도 호출가능
		A.aaa();
	}
}
class C implements I{
//		구현(상속)	==> class(단일상속), interface(다중상속)
	public void ccc() {
		// display(); => 오류, 인터페이스명으로 경로설정해야함
		I.display();   // 인터페이스의 static메소드는 인터페이스명으로만 접근가능
	}
	public void kkk() {} // public까먹지않기
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I i=new C();
		i.kkk();
	}
}
