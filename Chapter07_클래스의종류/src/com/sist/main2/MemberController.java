package com.sist.main2;
interface I{
	public void display(); // 구현하는 내용이 틀린 경우
	public default void aaa() {
		System.out.println("default..."); // 인터페이스에 메소드추가할때 에러나는데 
										  // 에러나지 않도록 public default void로 추가하기
	} // => 내용이 같은 경우
}

class A implements I{
	/*
	 * 	public default void aaa() {
		System.out.println("default...");}
	 */
	public void display() {
		System.out.println("A...");
		this.aaa();
	}
}
class B implements I{
	public void display() {
		System.out.println("B...");
	}
}
class C implements I{
	public void display() {
		System.out.println("C...");
	}
}
public class MemberController implements Controller {
	public void execute() {
		System.out.println("회원 관리 클래스");
	}
	public static void main(String[] args) {
		Object o=new A(); // 모든 클래스는 Object를 상위클래로 가짐
		// 문제점 : Object에는 display()가 없어서 기능 수행 불가
		//			=> 기껏 모았는데 의미없음 => 인터페이스로 모으자!
		o=new B();
		o=new C();
		
		I i=new A(); // I(인터페이스)도 클래스임!! 상위클래스라 A로 생성가능
		// I => display() aaa()  ===> 같은 메소드만 가져갈 수 있기때문에
		//						 ===> 최대한 같은메소드만 작성할수 있도록하자! 
		// 						 ===> 인터페이스에 메소드 추가되는것은 public default void로 하면됨
		// A => bbb				 ===> **** 하위클래스의 독자적인 메소드는 상위클래스에서 쓸 수 없다!! 
		//									상위클래스에 있는 같은 메소드(내용은 변경가능(오버라이딩))만 사용가능!!!
		//						 ===> I(인터페이스)는 자신의 메모리할당이 불가하므로 A를 통해서만 메모리할당이 가능하다
		//								따라서, 인터페이스에 있는 메소드를 A를 통해 가져온다 
		i.display();
		i.aaa();
		i=new B();
		i.display();
		i.aaa();
		i=new C();
		i.display();
		i.aaa();
	}
}
