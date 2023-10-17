package com.sist.main;
class A{
	private int a;
	/*public A(int a) {
		this.a=a;
	}*/
	public A() {}
}
class B extends A{
	/*public B(int a) {
		super(a); // ***매개변수가 있는 경우 생략불가 => 매개변수가 있는 생성자의 경우 매개변수를 포함해서 생성자를 만들어어야한다! 
	}*/
	public B() {
		super(); // 생략가능 => 매개변수가 없는 생성자의 경우는 super() 생략하고 생성자 만들기 가능 (자동호출)
	}
}
// super() : 상위 클래스의 생성자 호출
// this() : 자신의 클래스의 생성자를 호출

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
