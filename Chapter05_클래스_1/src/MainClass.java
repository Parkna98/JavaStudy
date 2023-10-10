/*
 * 		프로그램
 * 		1. 데이터 관리 (메모리에 저장, 파일에 저장, ***RDBMS에 저장)
 * 								-------------------- 영구적인 저장
 * 		   --------
 * 			1) 데이터 저장
 * 				= 한개 저장 : 변수
 * 				---------------
 * 				= 같은 데이터형 저장 : 배열
 * 				= 다른 데이터형 저장 : 클래스
 * 					=> 메모리 주소를 이용하는 프로그램
 * 					   -------- 참조변수 => 사용자 정의 데이터형
 * 				----------------------- 관련된 데이터를 모아서 관리 
 * 			2) 데이터 가공
 * 				= 명령문 => ;
 * 				= 연산자
 * 				= 제어문
 * 				--------------- 메소드
 * 
 * 			3) 가공된 데이터 출력
 * 				= 명령 프롬프트 / 윈도우 => Application
 * 				= 브라우저 => WebApplication
 * 				  ------------------------
 * 				= 모바일 = Mobile Application
 * 						 ------Kotlin => Spring(Kotlin)
 * 				----------------------------------- 문법 형식은 동일 (출력형식만 다름)
 * 				= Front-End (React,Vue)
 * 							------ React-Query
 * 		
 * 		2. 데이터 관리를 위한 사용자 정의 데이터형
 * 			= 클래스의 구성 요소
 * 				class ClassName
 * 				{
 * 					------------
 * 					*** 1) 변수 설정 => 프로그램 종료까지 사용이 가능
 * 							  => 지역변수
 * 								 메소드 종료시 사라지는 변수
 * 								 => 리턴형, 매개변수
 * 							  => 전역변수
 * 								 => 리턴형, 매개변수가 단순해 진다
 * 								 = 공유변수
 * 								 = 인스턴스 변수	=> static
 * 								
 * 					------------
 * 					2) 생성자 설정 : 변수에 대한 초기화 
 * 						=> 여러개 사용이 가능, 사용하지 않는 경우도 있음
 * 										  ------------
 * 											컴파일러에 의해 자동생성
 * 					------------
 * 					3) 메소드 설정 : 기능 
 * 					------------
 * 				
 * 				}
 * 
 * 			= 클래스의 변수의 종류 
 * 			  클래스 영역에 선언하는 변수  
 * 			  -------------------(멤버변수) ===> heap
 * 				= 인스턴스 변수 (객체) => new를 사용할 때마다 따로 저장
 * 				  ---------------------- heap영역에 저장
 * 				= 클래스 변수 => 공유변수 => static 
 * 						   => Method area 
 * 				
 * 				자바의 메모리
 * 				-------------------------
 * 					Method Area (static)
 * 					= 메소드 저장, static 변수
 * 				-------------------------
 * 					Heap
 * 					= 인스턴스 변수 (멤버변수) => 프로그래머 관리 영역
 * 						=> 프로그래머가 메모리에 저장, 해제
 * 										=> GC(자동 메모리 해제)(Garbage Collection)
 * 										=> System.gc()
 * 											멀티미디어, erp
 * 				-------------------------
 * 					Stack
 * 					= 지역변수, 매개변수 => 블록변수 {} => 메모리 자체 관리
 * 				-------------------------
 * 				
 * 			--------------------------------------------------------		
 *				변수유형		선언위치		메모리저장		사용범위 				
 * 			--------------------------------------------------------
 * 				인스턴스 변수	= ***new : 새로운 공간이 생성 => 클래스 전체
 * 				=> 클래스를 메모리에 저장한 상태(인스턴스) => ( ex) 비행기의 좌표)
 * 						class ClassName
 * 						{
 * 							int a;
 * 						}
 * 
 * 				정적변수(static) = 컴파일시 자동 저장 => 공유변수 ( ex) 비행기격추시 점수)
 * 						class ClassName
 * 						{
 * 							static int a;
 * 						}
 *
 *				지역변수 : 메소드 호출시마다 생성 => 메소드 안에서 사용이 가능
 * 						class ClassName
 * 						{
 * 							void display()
 * 							{
 * 								int a;  // => 메소드 내에서 사용
 * 							}
 * 						}
 * 
 * 				= 메모리 저장
 * 				  *** 인스턴스 : 메모리에 저장된 상태 (객체)
 * 											 -----
 * 											 클래스에 대한 변수명
 * 											 => 메모리 주소
 * 						int a=10;
 * 						class A(데이터형)
 * 						{
 * 						}
 * 							new의 C언어 버전
 * 							=> malloc(sizeof(A)) => new
 * 							=> free(A) => delete => C/C++에서만 사용	
 * 						A a=new A()
 * 							--- 메모리 크기를 확인
 * 							--- 메모리 확보
 * 							--- 확보된 메모리 주소를 넘겨주는 역할
 * 								--- 생성자 (멤버변수에 대한 초기화)
 * 							------- 초기값
 * 
 * 						클래스 : 설계 (필요한 데이터를 모아준다)
 * 							=> 메모리에 저장 ===> 활용 ===> 메모리 해제
 *						
 *						*** 클래스는 한개의 정보를 모아둔 곳(영화, 음식 등) 
 * 						class Movie
 * 						{
 * 							---
 * 							---
 * 							---
 * 						}
 * 						Movie m1=new Movie(); ===> new를 이용해서 여러 영화의 정보를 저장 
 * 						Movie m2=new Movie(); ===> new를 통해 다른 메모리 공간을 생성해서 다른영화의 정보도 저장
 * 						Movie m3=new Movie();
 * 						...
 * 						...
 * 						활용
 * 						-----
 * 							m1.변수명 => .은 주소 접근 연산자
 * 						해제
 * 						-----
 * 							m1=null => 주소값을 제거해서 메모리해제
 * 					
 * 					ex) Student s1=new Student() 
 * 							=> stack에 s1의 주소값 생성 => heap에 s1에 해당하는 값 저장 (메소드 포함)
 * 						Student s2=new Student() => new를 쓸때마다 새로운 주소가 생성
 * 							=> stack에 s2의 주소값 생성 => heap에 s2에 해당하는 값 저장 (메소드 포함)
 * 
 * 					static 변수 => 공유변수 => 100명의 Student를 생성했는데 학교명이 바뀌었으면
 * 											100명의 학교명을 다바꾸는 것이 아니라
 * 											학교명을 static변수로 설정하고 한번에 바꿈(공유변수) => '정규화'(DataBase)
 * 			----------------------------------------------------------------------------------------------
 * 			= 메소드 처리
 * 			= 생성자
 * 			---------------------------------------------------- 객체지향
 * 			= 초기화 블록
 * 			= 클래스의 종류 (추상,내부,종단...)
 * 			= 라이브러리
 * 			= 예외처리
 */
// 학생 => 이름, 국어, 영어, 수학
/*
 * 		파일명은 .java
 * 			  ------
 * 			  => 클래스명과 동일 (대소문자 구분)
 * 			  A.java, a.java
 * 		한 파일안에 여러개의 클래스를 사용할 수 있다
 * 		--------------------------------
 * 		class A
 * 		public class B
 * 		--------------- public class는 한파일안에 1개만 사용이 가능
 * 						------------ 파일명이 된다 
 * 									ex) public class MainClass 생성 => MainClass.java 라는 파일저장하고 생성
 * 		class A
 * 		class B
 * 		-------- 저장명은 A.java, B.java
 * 		-------- 일반 => 저장명은 main이 있는 클래스를 저장명으로 설정
 * 
 * 		*** 같은 폴더 (src)
 * 		class A
 * 		public class MainClass1
 * 
 * 		class A
 * 		public class MainClass1
 * 		----------------------- 오류(A라는 이름 중복) => 같은 폴더내에서 클래스이름중복금지
 */
import java.util.*;
// 가급적이면 따로 클래스를 만드는 것을 권장
// new => 저장공간을 따로 만들 수 있다 => 학생100명? new 100번 => 저장공간 100개 생성
class Student {
	String name;
	int kor;
	int eng;
	int math;
	// 멤버변수 사용 => 기본형, 클래스, 배열
}
public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names=new String[3];
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3]; 
		
		// 한 명에 대한 정보 => index가 같은 것을 이용한다
		System.out.println(names); // [Ljava.lang.String;@6504e3b2 ==> @뒤에있는 값이 주소값
		/*	
		 * 		names
		 * 		-------		 	--names[0]---names[1]---names[2]----
		 *		@6504e3b2 ---->  		   ㅣ		  ㅣ		
		 * 		-------			------------------------------------
		 * 						@6504e3b2	@6504e3b2+4  @6504e3b2+8
		 * 		모든 클래스는 변수선언시 => 4byte(주소)
		 */
		
		/*Scanner scan=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.print((i+1)+"번째 이름 입력:");
			names[i]=scan.next();
			System.out.print((i+1)+"번째 국어점수 입력:");
			kor[i]=scan.nextInt();
			System.out.print((i+1)+"번째 수학점수 입력:");
			math[i]=scan.nextInt();
			System.out.print((i+1)+"번째 영어점수 입력:");
			eng[i]=scan.nextInt();
		}
		// 출력
		for(int i=0;i<3;i++) {
			System.out.printf("%-5s%-5d%-5d%-5d%-7d%-7.2f\n",names[i],kor[i],eng[i],math[i],kor[i]+eng[i]+math[i],(kor[i]+eng[i]+math[i])/3.0);
		}*/
		
		// 클래스 이용
		Student hong=new Student();
		hong.name="홍길동";
		hong.kor=78;
		hong.eng=64;
		hong.math=89;
		
		//      변수명 => 구분(객체, 인스턴스)
		//				초기화
		//
		// 클래스(사용자 정의 데이터형) 
		// int a = 10;
		
		System.out.println(hong.name+" "+hong.kor+" "+hong.eng+" "+hong.math+" "+(hong.kor+hong.eng+hong.math));
		System.out.println("hong 주소값:"+hong);
		
		Student shim=new Student();
		shim.name="심청이";
		shim.kor=97;
		shim.eng=87;
		shim.math=67;
		System.out.println(shim.name+" "+shim.kor+" "+shim.eng+" "+shim.math+" "+(shim.kor+shim.eng+shim.math));
		System.out.println("shim 주소값:"+shim);
		
		Student park=new Student();
		park.name="박나현";
		park.kor=100;
		park.eng=100;
		park.math=100;
		System.out.println(park.name+" "+park.kor+" "+park.eng+" "+park.math+" "+(park.kor+park.eng+park.math));
		System.out.println("park 주소값:"+park);
		/*
		 * 		stack => 주소
		 * 		shim
		 * 		-----
		 * 		0x100
		 * 		-----	heap(실제 데이터)
		 * 			↖	new Student()
		 * 			0x100-----name------
		 * 
		 * 				 ------kor------
		 * 
		 * 				 ------eng------
		 * 
		 * 				 ------math------
		 * 					
		 * 				 ----------------
		 * 		shim.name, shim.kor, shim.eng, shim.math
		 * 
		 */
	}

}
