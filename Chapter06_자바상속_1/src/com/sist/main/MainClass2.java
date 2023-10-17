package com.sist.main;
class A{
	int a=10,b=20;
	void aaa() {
		System.out.println("A:aaa() Call...");
	}
}
class B extends A{
	int a=100,b=200;
	int c,d;
	// 오버라이딩 => 메소드명, 매개변수 같지만 내용이 다름
	void aaa() {
		System.out.println("B:aaa() Call...");
	}
	void bbb() {
		System.out.println("B:bbb() Call...");
	}
}
// B클래스는 A클래스에 있는 모든 것을 사용 (a,b,aaa())
// A클래스는 B클래스에 있는 모든 것을 사용할 수 없다 (a,b,aaa()만 가능 c,d,bbb()불가)
public class MainClass2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A(); // B클래스(하위)에 있는 변수, 메소드 사용불가
		System.out.println("a=>"+a.a); // 10
		System.out.println("b=>"+a.b); // 20
		a.aaa();
		//System.out.println("c=>"+a.c); // Error! (상위클래스는 하위클래스것을 사용불가)
		//System.out.println("d=>"+a.d); // Error! 
		
		B b=new B(); // 하위클래스는 상위클래스(A)의 모든 것 사용가능
		// b => a,b,c,d,aaa(),bbb()
		System.out.println("a=>"+b.a); // 100
		System.out.println("b=>"+b.b); // 200
		System.out.println("c=>"+b.c); 
		System.out.println("d=>"+b.d); 
		b.aaa();
		b.bbb();
		// A  >  B => 클래스의 크기 ==> 범위(상속을 내린 클래스가 크다)
		/*
		 * 		A a=new B(); (O)
		 * 		B b=new A(); (X) Error ==> 형변환가능
		 */
		A aa=new B();
		// aa => a,b,aaa()만 접근가능 ==> B클래스의 변수,메소드는 접근불가
		System.out.println("aa.a=>"+aa.a); // 10
		System.out.println("aa.b=>"+aa.b); // 20
		//System.out.println("aa.c=>"+aa.c); // Error!
		//System.out.println("aa.d=>"+aa.d); //
		aa.aaa(); // B의 메소드** (오버라이딩된 메소드 가져오는것으로 생각)
		//aa.bbb(); ==> Error!
		
		// *********
		// 멤버변수 => A aa ==> 변수는 자신것을 들고오고
		// 메소드 => new B() 생성자 ==> 메소드는 오버라이딩된것 들고옴
		
		//B bb=aa; Error! 
		B bb=(B)aa; // 상위 클래스 => 하위 클래스로 받는 경우 ===> 형변환
		// -------- **가장 많이 등장
		//B cc=new A(); // Error;
		System.out.println("bb.a=>"+bb.a);
		System.out.println("bb.b=>"+bb.b);
		System.out.println("bb.c=>"+bb.c);
		System.out.println("bb.d=>"+bb.d);
		bb.aaa();
		bb.bbb();
		
		// B cc=(B)new A(); => 실행시 Error ==> 객체생성 먼저하고, 그다음 

		/*
		 * 		상속 : 하위클래스로 접근하는 것이 기본
		 * 			------------------------
		 * 			class A
		 * 			class B extends A
		 * 			B b=new B();
		 * 			  => 상속제외조건 : static, private, 생성자, 초기화블록
		 *			  => 상위 클래스는 공통적으로 사용하는 변수,메소드
		 *	 
		 * 			A => 여러개를 한개의 클래스로 제어
		 */
		
		/*		학생 			회사원
		 * 		---			----
		 * 		학번			사번	
		 * 		-----------------	
		 * 		이름			이름		=> 상위클래스(공통부분)
		 * 		나이			나이
		 * 		-----------------	
		 * 		학년			직급
		 * 		
		 * 		-----------------	
		 * 		먹는다()		먹는다()  => 상위클래스
		 * 		잠을 잔다()	잠을 잔다()
		 * 		-----------------	
		 * 		공부한다()		일한다()
		 *	
		 *	
		 * 			 사람 (상위클래스)
		 * 		-----------------	
		 * 			이름
		 * 			나이
		 * 			먹는다()
		 * 			잠을잔다()
		 * 		-----------------	
		 * 		ㅣ			ㅣ	=> 하위클래스
		 * 		학생			회사원
		 * 		학번 			사번
		 * 		학년			직급
		 * 		공부한다()		일한다()
		 * 		------------------> 반복을 제거
		 * 		*** 단일 상속만 가능
		 * 		
		 * 		상위클래스는 하위클래스가 가지고 있는 변수, 메소드 사용이 불가능
		 * 		하위클래스는 상위클래스에서 내려준 변수,메소드를 사용할 수 있다
		 * 				 ==> 변수(static) 상속은 아니고 사용이 가능
		 * 				 ==> 공통으로 사용할 수 있다
		 * 		객체 생성
		 * 		= 하위 클래스로 객체 생성
		 * 			class A
		 * 			class B extends A
		 * 
		 * 			=> B b=new B();	==> 기본
		 * 			=> A a=new B(); ==> 변수는 A(상위)클래스 것 사용 
		 * 								메소드는 생성자(B())것 사용
		 * 			=> A bb=new B();
		 * 			   B cc=(B)bb;  ==> 생성이 되어있어야(생성자가있어야) 형변환이 가능하다
		 * 
		 * 			class 동물
		 * 			class 사람 extends 동물
		 * 			class 개 extends 동물
		 * 			class 소 extends 동물
		 * 			class 말 extends 동물
		 * 			class 돼지 extends 동물
		 * 			------------------------
		 * 			동물 ani=new 사람(); ===> 클래스 여러개를 묶어서 사용할때는 상위클래스를 사용(변수는 상위클래스, 메소드는 각각의 생성자)
		 * 									==> 에러가 나도 하나씩만 수정하면됨  (결합성이 낮음)
		 * 			ani=new 개();
		 * 			ani=new 소();
		 */
		A bbb=new B();
		B ccc=(B)bbb;
	}

}
