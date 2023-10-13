package com.sist.main;
/*
 * 	객체 대입 => 메모리를 통으로 전송 => 같은 메모리 주소를 제어
 */
class Human{
	int age; // 0
	String name; // null
}
public class MainClass3 {
	
	/*public class A{
		int age;
		String name;
		static int b;
		
		void aaa(){}
	}
	
	A a=new A();
	A b=new A();*/
	// Page 185 참고
	/*						인스턴스변수						정적변수
	 * 		Stack		 Heap => new					Method Area
	 * 		a(주소값저장) ㅣ a(age, name, aaa() 메모리공간)
	 * 													b(static) (공유)
	 * 		b(주소값저장) ㅣ b(age, name, aaa() 메모리공간)				
	 * 
	 * 					 접근방법 a.age, b.age     		접근방법 A.b 				
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong=new Human();
		// hong(age,name) => hong.age, hong.name (메모리공간생성)
		hong.age=20; // 메모리에 값 저장
		hong.name="홍길동"; // => 쓰기 => setXxx
		
		// 변수(멤버변수,정적변수,지역변수,매개변수) => 읽기/쓰기
		System.out.println(hong.age); // 읽기 => getXxx
		System.out.println(hong.name); 
		
		// hong => 변수 
		Human shim=hong;
		// 대입이 가능하다 => 메모리 주소를 대입 (**배열,클래스는 주소값을 가져온다 => 한쪽에서 수정해도 공유됨)
		//	shim과 hong은 같은 주소를 가지고 있다
		/*
		 * 		int a=10;
		 * 		int b=a; ==> 메모리에 있는 값을 대입 (기본형은 값만을 대입한다)
		 */
		shim.age=30;
		shim.name="심청이";
		System.out.println(hong.age);  // hong과 shim이 같은 주소값인데 shim이 바뀌어서 hong도 바뀌었다
		System.out.println(hong.name); // 서로 다른 정보를 넣고싶다면 new사용해 새로운 주소를 가지는 메모리공간을 생성한다
	}

}
