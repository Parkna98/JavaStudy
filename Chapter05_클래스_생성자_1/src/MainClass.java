/*
 * 		클래스 :
 * 			용도 1. 사용자 정의 데이터형 => 데이터형 클래스
 * 					=> 메모리 저장 / 메모리 읽기
 * 					=> 실무 / 프로젝트 => ~VO, ~DTO	
 * 									------------ 캡슐화(데이터보호)
 * 					=> 관련된 데이터를 묶어서 사용 => 관리가 용이, 추가 쉽게
 * 					=> 초기화 
 * 						ㅣ
 * 					   초기화 블록
 * 					   --------
 * 					   생성자
 * 					   --------
 * 			
 * 			용도 2. 액션 클래스 => 메소드의 묶음
 * 					=> 게시판 (목록, 수정, 상세보기, 삭제, 추가, 검색)
 * 			
 * 			용도 3. 코드를 재사용
 * 				   코드 관리 용이
 * 				   신뢰성
 * 				   ----------- 객체지향 프로그램
 * 		=> 기본 문법 => 활용
 * 		   => 자바 / 오라클 / HTML / CSS / JavaScript
 * 										----------
 * 											ㅣ  Ajax/Jquery/VueJS/React 
 * 												=> React-Query
 * 												   -----------
 * 		   => JSP : 활용 => 사이트제작
 * 		   => 실무 : Spring / Spring-Boot
 * 				=> MSA(서버 분산) => DevOps (CI/CD) => Git
 * 				   ------------------------------------- 우대사항
 * 		=> 자바 
 * 		   ---
 * 			1. 변수
 * 			2. 연산자
 * 			3. 제어문
 * 			-------- 기본 문법 (알파벳=>단어)
 * 			4. 배열
 * 			5. 메소드
 * 			-------- 숙어
 * 			6. 클래스 ---> 문장 (컴퓨터와 통신) 
 *			   ----
 *			   => 1) 구성요소
 *					[접근지정어][옵션] class ClassName{
 *						-----------------------------------------------------------
 *						멤버 변수 : 클래스 전체, 다른 클래스에서 사용가능
 *							1) 기본형
 *							2) 배열, 클래스
 *							=> 멤버변수(인스턴스변수)(전역변수)
 *								=> new 사용시마다 따로 저장하는 변수
 *								class ClassName
 *								{
 *									int a;
 *									int b;
 *									String s;
 *									int[] arr;
 *									static int c; ==> static변수는 선언과 동시에 Method Area에 메모리 공간 1개 생성 (공유)
 *									// 클래스 영역 전체에서 사용이 가능
 *									// 다른 클래스에서 사용이 가능
 *								}
 *								생성시점
 *								ClassName hong=new ClassName();
 *											--- -------------
 *											 ㅣ			ㅣ생성자 => ClassName 클래스의 인스턴스변수를 초기화
 *											 ㅣ			
 *											메모리 공간을 생성(인스턴수 변수 저장)
 *											생성된 공간의 주소를 a에 전달
 *
 *								ClassName park=new ClassName(); // a와는 또다른 메모리공간이 생긴다
 *								==hong==
 *								0x100 => new가 할당해주는 메모리 주소값
 *								------  	====0x100====
 *											 a => 0
 *				==Method Area==				 b => 0 
 *				 c (공유변수)					 s => null => ClassName()
 *				---							 arr
 * 				메모리공간1개
 *								==shim==
 *								0x997 => new가 할당해주는 메모리 주소값
 *								------  	====0x997====
 *											 a => 0
 *											 b => 0
 *											 s => null => ClassName()
 *											 arr 
 *								
 *											
 *							=> 공유변수
 *								=> 메모리 공간이 1개 (오라클의 저장된 변수)
 *								=> static
 *						---------------------------------------------------------------
 *						생성자, 초기화 블록 => 멤버변수 초기값 할당
 *						=> 변수의 초기화
 *							1) 기본 디폴트 초기화
 *								class ClassName
 *								{
 *									int a;		=> 0
 *									long b;		=> 0L
 *									double c;	=> 0.0
 *									float f;	=> 0.0F
 *									boolean bb;	=> false
 *									int[] arr;	=> null
 *									String s;	=> null
 *								}
 *							
 *							2) 명시적 초기화 => 우선사항
 *								class ClassName
 *								{
 *									int a=10;
 *									String name="홍길동";	
 *								}
 *								파일 읽기 / 크롤링 / 오라클 / 제어문 (명시적 초기화가 불가능한 경우)
 *								----------------------------
 *									=> 클래스 블록에서는 사용이 불가능 (초기화 블록에서는 가능)
 *									class ClassName{
 *										int[] arr=new int[5];
 *										---------------------- 선언
 *										for(int i=0;i<arr.length;i++)  ===> Error! (class블록에서는 선언만 가능)
 *										{
 *											arr[i]=(int)(Math.random()*100)
 *										}
 *										-------------------------------------- 구현
 *										int a;
 *										a=100; => 구현(Error!)
 *										int a=100; => 선언과 동시에 값 할당(가능)
 *
 *										= 초기화 블록
 *										= 생성자
 *										-------------- 동시사용 빈도는 거의 없다
 *									}
 *									
 *									class A
 *									{
 *										int a=100;
 *										// 초기화 블록 ==> 파일 읽기 / 자동 로그인 ...
 *										{
 *											a=1000;
 *										}
 *										A() ===> 배열에 대한 초기화...
 *										{
 *											a=2000;
 *										}
 *									}
 *									a=100 => a=1000 => a=2000 ===> 비효율적 => 처음부터 명시적초기화로 int a=2000; 이 효율적
 *
 *								클래스의 구성요소
 *									데이터 저장 : 멤버 변수
 *										 활용 : 메소드
 *									   값 할당 : 생성자
 *						-----------------------------------------------------------
 *						메소드 : s
 *						-----------------------------------------------------------
 *					}			
 * 		
 * 		class Sawon
 * 		{
 * 			// 사원 관리에 필요한 변수 설정
 * 		}
 * 		class SawonSystem
 * 		{
 * 			// 사원 관리 기능 처리 
 * 			static Sawon[] sawons=new Sawon[10]; ==> 관리시스템을 static으로 설정해야함!
 * 													=> A,B,C 각각 아래처럼 주소값을 할당하는데
 * 													   instance라면 한명의 정보가 바뀌었을때 시스템에 공통적으로 적용되지 않음
 * 			=> ***관리데이터는 static을 많이 쓴다
 * 		}
 * 
 * 		사원 A => SawonSystem s=new SawonSystem();
 * 				 sawons[1]=A; 	===================> 관리시스템이 static이 아니라면 A사원의 정보가 변경되었을때 
 * 													 B사원의 시스템 속 A사원의 정보는 그대로이다 => static을 쓴다면 모든 변경사항이 모든시스템에 공통적으로 적용
 * 		사원 B => SawonSystem s=new SawonSystem();
 * 		사원 C => SawonSystem s=new SawonSystem();
 * 
 * 		*** 자바는 모든 코딩 (변수,메소드...) => 클래스 안에서만!
 * 			=> static변수는 지역변수로는 사용이 불가
 * 			   클래스 블록에서만 사용이 가능
 * 			예) class ClassName
 * 			   {
 * 					static int a;
 * 					int b;
 * 					void aaa() 
 * 					{
 * 						static int b; => 오류
 * 					}
 * 			   }
 * 				
 * 			   class A
 * 			   {
 * 					ClassName.a ==> 다른클래스에 호출시 static변수는 생성자없이 사용가능
 * 					ClassName aa=new ClassName(); 인스턴스변수는 new로 생성후 사용 가능
 * 			 		aa.b
 * 			   }
 * 			   한개의 파일 => class를 여러개 사용이 가능
 * 			   -------- class를 한개만 사용(권장) => 유지보수측면에서도 따로하는것이 효율적
 * 
 * 			   자바코딩 (순서)
 * 			   ------
 * 			   package => 소속 => 한번만 사용이 가능
 * 			   import => 외부에 있는 클래스를 불러오기
 * 						 라이브러리 / 사용자정의 클래스
 * 						 여러번 사용이 가능
 * 			   class A
 * 			   {
 * 					=> A.class
 * 			   }
 * 			   public class B  // ==> public class는 파일에 무조건 한개만!
 * 			   {
 * 					반드시 => main()
 * 						=> B.class
 * 			   }
 */

/*		생성자
 * 			=> 클래스를 메모리에 저장할때 호출되는 메소드
 * 				A a=new A()
 * 						--- 생성자
 * 				Scanner scan=new Scanner()
 * 								 ---------
 * 			=> 특징	
 * 				= 클래스명과 동일
 * 				  class A => A()
 * 				  class B => B()...
 * 
 * 				= 리턴형이 없다	
 * 				  class A
 * 					A() => 생성자(리턴형 없음)
 * 					void A() /  int A() => 일반 메소드
 * 				
 * 				= 여러개를 만들 수 있다
 * 				  ---- 매개변수의 갯수나 데이터형이 다르다
 * 					   ------------------------- 오버로딩
 * 				= 상속에서 예외
 * 				
 * 				= 생성자는 필요시에만 사용
 * 				  ---- 서버 연결 / DB 연결 / 자동 로그인
 * 				  ---- 생성자는 반드시 필요하다 (메모리 할당할때 필요함)
 * 					   -----------------
 * 							ㅣ
 * 						생성자를 만들지 않는 경우에 자동으로 생성자를 만들어준다
 * 						----------------------------------------
 * 						=> 디폴트 생성자
 * 						   --------- 매개변수가 없다 
 * 
 * 			=> 용도
 * 				=> 멤버변수의 초기화 (명시적인 초기화가 불가능할때)
 * 
 * 				=> 윈도우 초기화, 웹 초기화, 서버 연결 ... 오라클 연결
 * 
 * 				=> 생성자는 **한번만 호출이 가능
 * 					new 생성자() 
 * 					new 생성자()
 * 					new 생성자() => 모두 메모리공간이 다름 (호출할때마다 다른공간생성)
 * 			
 * 				=> 생성자 호출시에는 반드시 new 생성자()
 * 
 * 			=> 오버로딩
 * 				=> 생성자는 여러개를 만들 수 있다
 * 				=> 생성자명이 동일
 * 				=> 매개변수의 갯수 / 매개변수의 데이터형이 다르다
 * 				class A
 * 				A()
 * 				A(int a)
 * 				A(int a,int b)
 * 				A(double d)
 * 				A(String s)
 * 				----------------
 * 				class A
 * 				{
 * 				 		===> A(){} 자동 생성
 * 				}
 * 				
 * 				class A
 * 				{
 * 					A(){} ==> 자동 생성(X)
 * 				}
 * 				
 * 				class A
 * 				{
 * 					A(int a){} ==> 자동 생성(X)
 * 				}
 * 				매개변수가 있는 경우도 생성자다
 */
// class 밖에 쓸 수 있는 것 => import, package => 이외에는 클래스안에!!
import java.util.*;
class A // ==> JavaDev -> JavaStudy -> 해당폴더 -> bin ==> A.class와 MainClass.class 파일이 각각 생성
{
	
}

class Sawon{
	int sabun;
	String name;
	String dept,job,loc; 
	// Sawon(){} => 자동 생성*** (없으면)
	// 생성자가 있어야만 Sawon s=new Sawon() 호출가능
	Sawon(){
		sabun=1; // this를 쓰는것이 맞지만 생성자의 매개변수와 중복되지 않는다면 생략가능
		name="홍길동";
		dept="개발부";
		job="대리";
		loc="서울";
	}
	// 매개변수 생성자
	Sawon(int s,String name,String dept,String job,String loc) 
	// => 매개변수를 넣는다고해서 인스턴스변수에 저장이 되는것이 아님(매개변수는 지역변수)
	{	// 값 저장
		// 지역변수 우선 순위
		sabun=s; // 매개변수를 sabun으로 하고 sabun=sabun으로 저장하면 지역변수로 저장되기때문에 
				 // main 에서 sabun=2를 넣고 출력하면 인스턴스변수에 저장된 값을 불러옴 => 초기값인 0을 불러옴
				 // ===> 1. 매개변수의 이름을 바꾸기 2. this를 쓰기(변수명이 같을경우)
		this.name=name; // 색상이 파란색:멤버변수 / 파란색필기체:static / 밤색:지역변수 (색구분)
		this.dept=dept; // this=> 이클래스가 갖고있는 변수
		this.job=job;
		this.loc=loc;
	}
}

public class MainClass {
	// MainClass(){}  ===> 자동으로 추가되는 디폴트 생성자
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon sa=new Sawon();
		System.out.println("사번:"+sa.sabun);
		System.out.println("이름:"+sa.name);
		
		Sawon sa1=new Sawon(); // 다른 사원인데 사번과 이름이 같음 (생성자가 같으므로) 
							   // ==> 어떻게 구분? 생성자에 매개변수를 준다! 
		System.out.println("사번:"+sa1.sabun);
		System.out.println("이름:"+sa1.name);
		
		Sawon sa2=new Sawon(2,"박문수","영업부","과장","경기");
		System.out.println("사번:"+sa2.sabun); // 0 ==> 매개변수의 이름과 인스턴스변수 이름이 같아서 지역변수가 우선되서 생긴일
												// this를 쓰면 인스턴스값을 불러옴
		System.out.println("이름:"+sa2.name); 
		System.out.println("부서:"+sa2.dept); 
		/*
		 * 		Sawon s=new Sawon();
		 * 			 --- 메모리 주소 => 주소를 활용(참조변수)
		 * 		JVM
		 * 			this=s; => 자신 객체
		 * 			1) 멤버변수와 지역변수 같은 경우 => 구분
		 * 			2) 모든 클래스는 this를 가지고 있다
		 * 						------ static => JSP(page)
		 */
		
	}

}
