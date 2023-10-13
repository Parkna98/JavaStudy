package com.sist.main2;
/*
 * 		static메소드 / 인스턴스 메소드
 * 		---------- => 인스턴스나 static 상관없이 사용이 가능
 * 			ㅣ static 변수, static 메소드를 호출
 * 			   인스턴스 변수, 인스턴스 메소드는 반드시 객체 생성 후에 사용
 * 		
 * 		=> 클래스 생성 => 객체 생성 => 자동으로 this(자신의 객체)
 * 									   -----
 * 										멤버변수와 지역변수를 구분
 * 									** 변수가 동일한 이름이면 지역변수 우선순위
 * 									** 지역변수, 매개변수 찾고 => 없는 경우에는 멤버변수에서 찾는다
 * 		ex) 
 * 			class A
 * 			{
 * 				int a=20;  ====> 메모리 저장 위치가 다르다
 * 								 Heap
 * 				void display()
 * 				{
 * 					int a=10; => Stack 
 * 					Systme.out.println(this.a);
 * 									  --- 지역변수
 * 				}	
 * 				void display(int a)
 * 				{			 ----- 지역변수의 일종 Stack
 * 					System.out.println(this.a); // => 그냥 a를 주면 매개변수a값을 읽고, this.a를 주면 멤버변수 a를 가져온다
 * 				}
 * 			}
 * 
 * 			===> this : 객체
 * 				 this() => 생성자 (자신의 생성자를 호출할때 사용) (constructer)
 * 				-------
 * 					=> 생성자에서 사용이 가능
 * 					=> 생성자 첫줄에 온다
 * 			class A
 * 			{
 * 				A()
 * 				{
 * 				}
 * 				A(int a)
 * 				{	
 * 					this(); (O) ===> super() (상위클래스의 생성자호출)
 * 					System.out.println("aaa");
 * 					this(); ==> 오류발생 (첫줄에 써야함!)	
 * 				}	
 * 			}
 * 
 * 
 */
class Student
{
	int hakbun; // 0
	String name; // null
	String sex; // null
	
	public Student() {
		System.out.println("디폴트 생성자 호출"); // 생성자 호출 : 멤버변수의 값을 초기화시키겠다
		this.hakbun=1; // 정석은 초기화할때 this를 붙여서 멤버변수에 저장해야하는데
		this.name="홍길동";   // 지역변수와 충돌이 없는 경우는 생략이 가능하다
		this.sex="남자"; 
//		----Student가 가지고있는 멤버변수
	}
	public Student(int hakbun,String name) {
		// 구분자 => 멤버변수와 지역변수의 구분
		this(); // ==> 디폴트 생성자 호출 => 앞의 값을 채운상태로 가지고옴 => 생성자는 첫줄에!! 
		this.hakbun=hakbun; // 변수의 이름이 겹침 => this 생략불가 (변수색으로 구분가능 : 파랑-멤버변수, 갈색-지역변수,매개변수)
		this.name=name;
	}
	
	public Student(String sex) {
		this(); // ==> 디폴트 생성자 호출 => 앞의 값을 채운상태로 가지고옴 
		this.sex=sex;
	}
	
	public Student(int h,String n,String s) // 오버로딩!! => 같은 메소드명이지만 매개변수의 갯수,데이터형이 다르고 새로운 기능을 만듬 => 매개변수명은 관계없음
	{
		this(s); // 매개변수있는 생성자도 호출가능 !!
		//hakbun=h; // 변수명의 충돌이 없기때문에 this.를 생략가능하다
		//name=n;
		//sex=s;
	}
	
	public void print() {
		System.out.println("학번:"+hakbun);
		System.out.println("이름:"+name);
		System.out.println("성별:"+sex);
	}
	/*
	 * 		void diplay(int a,int b,int c)
	 * 		void diplay(char a,double b,int c)
	 * 		void diplay(double a,double b,double c)** 
	 * 
	 * 		display(10.5,'A',100) => double char int 어떤 메소드를 호출??****
	 * 								==> 1. 똑같은것을 찾아본다	
	 * 								==> 2. 없으면 대체할 수 있는 값을 찾아본다 (더 큰 데이터형)
	 * 								==> 3. 위의 경우 double이 char와 int를 대체할수있기 때문에 
	 * 									   double double double을 매개변수로 가진 메소드가 호출된다
	 */
}

public class MainClass {
	
	void diplay(int a,int b,int c) {
		System.out.println("diplay(int a,int b,int c) Call...");
	}
	void diplay(char a,double b,int c) {
		System.out.println("diplay(char a,double b,int c) Call...");
	}
	void diplay(double a,int b,int c) {
		System.out.println("diplay(double a,int b,int c) Call...");
	}
	void diplay(double a,double b,double c) {
		System.out.println("diplay(double a,double b,double c) Call...");
	}
	void diplay(double a,char b,int c) {
		System.out.println("diplay(double a,char b,int c) Call...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass m=new MainClass(); 
		// ==> *****main은 static이기 때문에 static만 들어올수있다. 이외에는 객체생성하고 들어와야함!!
		m.diplay(10.5, 'A', 100.0);
		// 1. 매개변수 데이터형이 같은 것을 찾는다
		// 2. 없다면 대체할 데이터형이 있으면 찾는다
		// 3. 대체값 호출
		
		// default 생성자
		// 0 null null
		/*Student s1=new Student();
		s1.print();
		// 0 null null
		Student s2=new Student("여자"); 
		s2.print(); // 0, null, 여자 ==> 성별값만 초기화되고 나머지는 안된 상태임
		// ===> 1, 홍길동, 여자 => 앞부분의 데이터를 유지할수있게
		// 0 null null
		Student s3=new Student(2,"심청이");
		s3.print(); // 2, 심청이, null ==> 학번,이름만 초기화되고 성별은 디폴트값
		
		Student s4=new Student(3,"박문수","남자");
		s4.print(); // 3, 박문수, 남자 */
	}

}
