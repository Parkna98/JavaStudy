package com.sist.main;
/*
 *		interface
 *		---------
 *			=> 서로 다른 클래스를 연결해서 사용
 *			=> 결합성이 낮은 프로그램
 *			=> 개발자가 같은 메소드를 사용 => 표준화
 *			=> 관련된 클래스를 묶어서 한개의 이름으로 관리
 *			  --------------------------------
 *				Model => 형식 ==> interface
 *			=> class A
 *			   class B extends A
 *			   A a=new A() => A에 있는 변수, 메소드만 호출
 *			   B b=new B() => B에 있는 변수, 메소드만 호출
 *			   A c=new B() => A에 있는 변수, 메소드는 B에 있는 것 호출(A가 갖고있는 메소드 중)
 *										  ------------------------------------
 *												오버라이딩된 메소드
 *			=> interface I => aaa() ==> 클래스마다 공통으로 적용되는 메소드만 선언
 *			   class A implements I
 *					aaa()
 *			   class B implements I
 *					aaa() bbb()
 *					I i=new B() (X) => I와 다른메소드 가지고 있어서 의미없음
 *					B b=new B() => 다른 메소드가 있으면 이렇게 생성
 *			   class C implements I
 *			   
 *			   I i=new A();	i.aaa() 
 *			   --- -------- i에 존재하는 메소드중에 A에서 오버라이딩한 메소드 호출, 변수는 I의 것 호출!
 *			   I i=new B();
 *			   I i=new C();
 *
 *			   상위클래스 객체명=new 하위클래스()
 *				=> 접근 : 변수는 상위클래스에 있는 변수만
 *						 메소드는 상위클래스에 있는 메소드만
 *							   ----------------- 오버라이딩된 것만!!
 *				=> 인터페이스 통해서 클래스에 접근
 *				   ------- 인터페이스에 있는 메소드만 가지고 있어야 효율적이다 
 *
 *				interface A
 *				{
 *					void aaa();
 *					void bbb();
 *				}
 *				class B implements A
 *				{		----------
 *					void aaa(){}
 *					void bbb(){}
 *					void ccc(){}
 *				}	
 *				A a=new B(); ==> 가급적이면 사용하지 않는다 (B에있는 ccc()는 호출못하기때문에 의미가 없다)
 *								의미가 있으려면? B b=new B(); 생성해서 다쓰자
 *									
 *			class A
 *			{
 *				int a;
 *				void aaa(){}
 *			}
 *			Object o=new A(); => o는 a,aaa() 못씀 
 *			class B
 *			class C
 *			Object[] obj={new A(), new B(), new C()};
 *			A a=(A)obj[0]; => 오브젝트배열로 받으면 접근못해서 형변환해야함 => 비효율적
 *			========> 인터페이스를 이용해서 관련된 클래스를 묶어 하나로 관리
 * 			
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
