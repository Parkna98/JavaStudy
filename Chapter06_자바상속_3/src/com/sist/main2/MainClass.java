package com.sist.main2;
// 메모리 => 상위 클래스 => 상속받은 클래스 메모리 할당
//			------생성자 호출되어야함
class Super
{
	int a;
	public Super(int a) 
	{
		this.a=a;
		System.out.println("Super 생성자 호출...");
	}
}
class Sub extends Super // 상속받아서 a=100인 상태
{
	int a; // 하위클래스에 a선언 안한다면? 상위클래스의 a를 가져다가 쓴다 ==> 밑에 a=1000으로 초기화 했으므로 super.a의 값도 1000이된다
		   // a선언을 해준다면? 하위클래스는 자신의 a를 쓴다 ==> a=1000으로 초기화했으므로 Sub의 a=1000, 
		   // super의 a는 안썼으므로, 생성자를 만들때 대입해준 100의 값이 그대로 쓰임 super.a=100
	public Sub() 
	{
		super(100); // 상위클래스의 매개변수가 있는 생성자는 반드시 호출해서 사용
					// 상위클래스의 생성자를 매개변수를 넣어서 생성해야 하위클래스도 쓸 수 있다!!
		
		// => 생략이 가능한 경우 => 상위 클래스가 디폴트 생성자
		//super(); // 생략이 가능 => 자동 추가
		// Super super=new Super();
		a=1000;
		
		System.out.println("Sub 생성자 호출..."); 
		System.out.println("Sub.a="+this.a); // this는 생략가능 (매개변수랑 멤버변수의 이름이 중복된경우 this사용)
		System.out.println("Super.a="+super.a); // super는 상위클래스의 객체명
		
		/*
		 * 		heap
		 * 		--------------------
		 * 		------super------
		 * 				a
		 * 		-----------------
		 * 				
		 * 		-------this------
		 * 				a
		 * 		-----------------
		 * 		--------------------
		 */
	}
}
/*
 *  	final 클래스
 *  	----------
 *  	public final class ()
 *  					   -- 확장이 안되는 클래스
 *  					   -- 상속을 받을수 없다
 *  					   -- String, Math, System... 
 *  					   -- java.lang 
 *  					
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub=new Sub();
	}

}
