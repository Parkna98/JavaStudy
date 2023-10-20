package com.sist.main;
/*
		1. 객체와 클래스
			= 클래스는 객체를 생성하기위한 설계도와 같은 것이다
			= new 연산자로 클래스의 생성자를 호출함으로써 객체가 생성된다
			= new 연산자를 통해 하나의 클래스로 여러 객체를 생성할 수 있다
			= 객체는 클래스의 인스턴스이다
			
			프로그램 개발
			클래스 설계
			--------------
				=> 변수 : 공유변수 / 공통 변수 => static : 메모리 공간이 한개
				=> 		 멤버변수(필드) => new를 사용할때 마다 따로 생성되는 변수 (인스턴스 변수)
				=> 클래스를 한개만 만들고 => new를 이용해서 여러개의 객체를 생성
				
		2. 클래스의 구성 멤버
			= 필드(멤버변수)
			= 생성자(constructor)
			= 메소드
			
			class ClassName
			{
				----------------
				멤버변수
					인스터스변수/공유변수 
					ex) 맛집 => 맛집마다 저장값이 다르다 => 인스턴스 변수
						메뉴바/footer => 공유(static)
				----------------
				생성자 : 필요시에만 사용 => 없는 경우 (컴파일러가 자동으로 한개 생성 => 디폴트 생성
				=> 여러개를 사용가능 (오버로딩)
				=> 초기화 
				=> 시작과 동시에 처리 => 윈도우, 서버연결, 오라클 연결
				=> 오버로딩 조건
				   1) 메소드명이 동일
				   2) 매개변수의 데이터형,갯수,순서가 다르다
				   3) 리턴형은 관계없다
				   4) 접근지정어는 관계없다
				   
				=> 객체지향 프로그램 => 여러개의 클래스가 연결해서 한개의 프로그램 완성
				   ------------ 기능별 클래스 제작 => 조립
				=> 연결시에 클래스에 메모리 할당하고 메소드를 이용해서 통신
								------- 다른 클래스에서 메모리 할당이 가능하게 만든다
								생성자의 접근지정어는 public을 사용
				----------------
				메소드 : 다른 클래스와 통신시에 사용
				메소드 안에는 두개의 변수가 사용된다 : 매개변수, 지역변수
											------------- 메소드 호출시마다 메모리 할당
				----------------
			}
			
		3. 필드, 생성자, 메소드
			= 필드는 객체의 데이터를 저장한다
				   		--------- 클래스에서 필요한 데이터를 저장할 목적(멤버변수)
			= 생성자는 객체의 초기화를 담당한다 : 시작과 동시에 처리
					윈도우 : 화면 UI
					웹 : 오라클 연결 / 자동 로그인
			= 메소드는 객체의 동작 부분으로 실행 코드를 가지고 있는 블록이다
				void method(){
					동작부분을 구현 ==> 연산자, 제어문
				}
			= 클래스는 변수와 메소드를 반드시 가질 필요는 없다
				=> 변수만 가지는 클래스도 있다 (데이터)
				=> 추상클래스는 선언만된 메소드만 가지고 있다
				사용자 정의 데이터형 => 멤버변수 => Music/Movie
				메소드만 => 크롤링/데이터베이스 연동 
				필드+메소드
				=> 구성요소를 다 포함 / 변수만 / 메소드만 => 구성요소 3가지가 필수는 아니다
					1) 변수만 => ~VO, ~DTO
					2) 메소드 => ~DAO, ~Manager, ~Service, ~Controller, RestController
			
				
		4. 필드
			= 필드는 메소드에서 사용할 수 있다 => 멤버변수 처리
			= 인스턴스 필드 초기화는 생성자에서 할 수 있다
			= 필드는 초기값을 주지 않더라도 기본값으로 자동 초기화된다
			
			class ClassName => 가독성
			{	
				-------------------
				멤버변수
				-------------------
				생성자
				-------------------
				메소드
				-------------------
			}
			class ClassName => 가독성
			{	
				-------------------
				메소드 => 멤버변수 사용
				-------------------
				생성자 => 초기화
				-------------------
				멤버변수
				-------------------
			} ==> 가독성에는 문제가 있지만 문법상 문제는 없다
			
		5. 생성자
			= 객체를 생성하려면 생성자 호출이 반드시 필요한 것은 아니다
				=> 생성자 없이 호출가능 : Reflection (클래스이름으로 메모리 할당 => 스프링)
				Class className=Class.forName("클래스명")
				className.newInstance();
				=> 추상클래스 / 인터페이스 => 상속받은 클래스 이용
				=> 싱글턴
				ex) Calendar cal=Calendar.getInstance()
					-------- 추상클래스 => 스스로 생성자 못만
			= 생성자는 다른 생성자를 호출하기 위해 this()를 사용할 수 있다
			= 생성자가 선언되지 않으면 컴파일러가 기본 생성자를 추가한다
			= 생성자를 private로 쓸 수는 있지만, 상속이나 가져다쓰기가 힘들기때문에
			  가급적이면 public을 쓴다
			  
			생성자 : 필요시에 사용 (없는 경우 => 자동추가)
			특징) 클래스명과 동일, 리턴형이 없다, 여러개의 생성자 제작, 상속은 예외조건
			     생성자 => 생성자 호출
			     		 자신의 생성자 호출 : this()
			     		 상속내린 클래스의 생성자 호출 : super()
			     		 *** 상속이 있는 경우 => super()
			    class A
			    {
			    	public A(){} => 상속내리려면 생성자가 있어야함
			    }
			    class B extends A => 상속을 받으려면 상위클래스에 생성자가 있어야함!
			    {
			    	public B(){
			    		super() => 상속받으면 상위클래스의 생성자 불러온다 (생략가능)
			    	}
			    }
			    => 자신의 객체 this , 상위클래스 객체 => super
			    *** 자바는 모든 클래스가 Object로 상속을 받는다
			 
		6. 메소드
			= 리턴값이 없는 메소드는 리턴 타입을 void로 한다 => return 생략가능
				=> 컴파일러에 의해 자동 추가 => 메소드를 종료하는 시점 => 리턴은 반드시 필요
				=> return은 원하는 위치에서 설정가능
			= 리턴 타입이 있는 메소드는 리턴값을 지정하기 위해 반드시 return문이 있다
			= 매개변수의 갯수를 모를 경우 "..."를 이용해서 매개변수를 선언할 수 있다
				=> 가변 매개변수
				System.out.printf(String format, Object...arg)
				=> 매개변수의 수가 정해지지않고 원하는 만큼 출력가능
				*** Object는 가장 큰 데이터형 => 모든 데이터형을 받을 수 있다
			= 메소드의 이름은 중복해서 선언 가능하다
				=> 오버로딩 : 메소드의 이름은 동일, 매개변수의 갯수나 데이터형이 다름 
				=> 오버라이딩 : 메소드의 이름은 동일, 수행문장만 변경
				
		7. 메소드 오버로딩
			= 동일한 이름의 메소드를 여러개 선언하는 것
			= 리턴형은 관계없다
			= 매개변수의 데이터형, 갯수, 순서를 다르게 선언해야 한다
			= 매개변수의 데이터형과 갯수에 따라 호출될 메소드가 선택된다
				=> 만약 동일한 데이터형이 없다면 대체할 수 있는 데이터형을 가지고 있는 메소드 호출
				
		8. 인스턴스 멤버와 정적 멤버
			= 정적 멤버는 static으로 선언된 필드와 메소드를 말한다 : 한 개를 가지고 사용
			= static블록에서는 => static만 초기화 가능
				=> 초기화 블록에서는 상관없이 초기화 가능
			= 정적 필드와 정적 메소드는 객체 생성 없이 클래스를 통해 접근할 수 있다
			= 인스턴스 필드와 메소드는 객체를 생성하고 사용해야 한다
			class A
			{
				int a;
				static{
					A aa=new A();
					aa.a=10; ===> static에서 멤버변수를 쓰려면 객체를 생성하고 써야한다
								  static에는 this가 없기때문에!!
				}
			}
			
		9. final 필드와 상수(static final)
			= final 필드와 상수는 초기값이 저장되면 값을 변경할 수 없다
			= final 필드와 상수는 반드시 명시적으로 초기화 해야한다
			= 상수의 이름은 대문자로 작성하는 것이 관례이다
			= 상수는 객체 생성 없이 클래스를 통해 사용할 수 있다
			= 생성자와 메소드 {}내부에 선언된 것은 모두 로컬변수가 된다
				=> 필드 선언은 이외의 어디서든 선언 가능
				
		10. 클래스에 생성자를 추가하려고 할때, name필드 와 id필드를 
			외부에서 받은 값으로 초기화 하려면 생성자를 어떻게 선언해야 하는가
			=> this 이용
			Member(String name, String id){
				this.name=name;
				this.id=id;
			}
			=> 생성자의 매개변수 입력을 통해 원하는 변수만 선택적으로 초기화 할 수 있다
			   나머지 멤버변수에는 자동으로 기본값이 할당된다
			
			=> this()
				=> 생성자의 이름은 반드시 클래스의 이름과 동일해야한다
				   this() 생성자를 이용하면 클래스의 이름을 사용하지 않고
				   같은 클래스에 있는 다른 생성자를 호출할 수 있다
				   
			=> super()
				=> 상속에서 상위 클래스의 생성자를 호출할 때 사용
				   상속관계에 있는 클래스에서 별도의 언급이 없으면 부모의 기본 생성자가 자동 호출
				   super()는 생략 가능하다
				   상위 클래스에 기본 생성자가 없다면 반드시 인자가 있는 super()를 사용하여 생성자를 명시적으로 호출해야한다
			
				
		* 필드
		  => 클래스 영역에 정의한 변수
		  => 필드 = 전역변수 = 멤버변수
		  		=> 메소드 안에 있는 변수는 지역변수
		  => 필드는 객체의 고유 데이터, 객체가 가져야할 부품, 객체의 현재 상태 데이터를 저장
		     ex) 자동차 객체
		     	 = 고유 데이터 : 제작회사, 모델, 색깔, 최고속도
		     	 = 상태 : 현재 속도, 엔진 회전 수
		     	 = 부품 : 차체, 엔진 타이어
		     	 ======> 
		     	 자동차 클래스
		     	 public class Car{
		     	 	// 고유 데이터
		     	 	String company;
		     	 	String model;
		     	 	String color;
		     	 	int maxSpeed;
		     	 	
		     	 	// 상태
		     	 	int speed;
		     	 	int rpm;
		     	 	
		     	 	// 부품
		     	 	Body body;
		     	 	Engine engine;
		     	 	Tire tire;
		     	 }	
		   
		  = 필드 선언
		  	=> 필드 선언은 중괄호 블록 어디서든 존재할 수 있다
		  	   하지만, 생성자와 메소드 중괄호 내부에는 선언불가!
		  	   (생성자와 메소드 중괄호 내부에 선언된 것은 로컬변수!)
		  	   필드 선언은 변수의 선언 형태와 비슷하다(클래스 멤버 변수로 부르기도 한다)
		  	   
		  = 필드 선언 형태
		  	타입 필드 (= 초기값);
		  	ex) 
		  		String company = "KT";
		  		int currenSpeed;
		  		boolean enginStart;
		  	=> 초기값이 지정되지 않은 필드들은 객체 생성시 자동으로 기본 초기값으로 설정된다
		     	
 */
public class 객체지향정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
