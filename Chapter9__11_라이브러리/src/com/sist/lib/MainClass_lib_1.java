package com.sist.lib;
/*
		라이브러리 (내장)
			**= java.lang
				Object
				String 
				StringBuffer
				Math
				Wrapper
				-------------
			**= java.util => Collection
				StringTokenizer
				Date / Calendar
				ArrayList
				HashSet
				HashMap
				
			**= java.io
				FileInputStream / FileOutputStream
				FileReader / FileWriter
				BufferedReader / 
				BufferedInputStream / BufferedOutputStream
				------------------------------------------ 웹
			= java.sql : Connection / Statement / ResultSet
			= java.text, java.net : URL / URLEncoder / Socket
			  ---------
			  	DecimalFormat / SimpleDateFormat
			----------------------------------------- 자바를 사용하는 모든 소스의 기본
			= java.http.servelet (Web) ==> JSP
		외부 라이브러리
			= org.springframework.....
			= org.myBatix
			= org.JSoup
			
			= 사용자 정의
				=> 기본
				   변수
				   	=> 데이터형
				   		정수 : int, long, byte
				   		실수 : double
				   		논리 : boolean
				   		문자열 : String
				   연산자
				    => 증감연산자 (++,--)
				    => 부정연산자 (!)
				    => 형변환연산자 (type)
				    => 산술연산자 (+,-,*,/,%)
				    => 비교연산자 (<,>,<=,>=,==,!=)
				    => 논리연산자 (&&,||)
				    => 대입 (=,+=,-=)
				    
				   제어문
				   	=> if 
				   		=> if(조건)
				   		=> if~else
				   	=> for => for-each
				   	=> while 
				   	=> break
				=> 클래스 
					= 멤버변수 / 공유변수
					= 메소드 
						public 리턴형 메소드명 (매개변수...)
						{
							=> 리턴형이 없는 경우 => void
						}
					= 생성자
						=> 초기화 / 시작과 동시에 처리
						=> 리턴형이 없다 => 클래스명과 동일
						=> 사용하지 않을때, 자동 default생성자 호출
						=> 상속이 안된다 
					= 초기화 블록
						=> 인스턴스 블록 : 인스턴스 변수, static 변수 초기화 가능
						=> static 블록 : static 변수만 초기화가 가능
										=> 인스턴스 변수 초기화 시에는 반드시 객체를 생성후에 사용
							=> static 변수 초기화할때 주로 사용
							=> 인스턴스 변수는 주로 생성자 이용
							=> 멤버변수는 private, 메소드, 생성자, 클래스는 주로 public
							   --------------- 접근을 하기 위해서 기능부여 
							   					------------------ 
							   					메소드(읽기/쓰기) => getter/setter
							
				=> 특성
					==> 데이터 보호 / 재사용 / 수정,추가 용이하게
					= 캡슐화 
						데이터를 은닉화(private) => 메소드를 통해 접근
					= 상속/포함
						수정해서 사용 => 상속
						있는 그대롤 사용 => 포함 (포함을 더 많이 씀)
						------------------
						class A{
							// 클래스영역에 선언해야 포함!! => DAO,Model
							public void aaa(){
								// 포함 아님
							}
						}
					= 오버로딩 / 오버라이딩(재정의)
						=> 다형성
							= 수정 : 오버라이딩
							= 추가 : 오버로딩
							오버라이딩			오버로딩 (**기술면접)
					형태			상속			클래스 내
					메소드명		동일			동일
					매개변수		동일			갯수,데이터형 다름
					리턴형		동일			관계없음
					접근지정어		확대가능		관계없음
					
					private < default < protected < public 
				
				기술면접 
					=> 자바 / 오라클 / 스프링
					   ----------  ----- 3문제 중 1문제
					    7문제 중 6문제
					
				=> 클래스의 종류
					= 인터페이스 **
					-------------
					관련된 클래스를 모아서 관리
					결합성이 낮은 프로그램 (서로 간 영향이 줄어듬)
					=> 상속
					   --- 다중상속이 가능
					   --- extends(X) => implements
					   
					   interface ===== interface
					   			   ㅣ extends
					   			   
					   interface ===== class
					   			   ㅣ implements
					   			   
					   interface A
					   interface B
					   class C implements A,B
					   				     ----- 
					= 구성요소
						interface interface명{
							------------------
							변수
							=> public static final 데이터형 변수명=값;
							   -------------------		 ---------
							   		자동 추가 (상수형 변수)
							   	public -- int a=10;
							   		   ㅣ (static final) 자동추가
							------------------
							메소드(선언)
								public abstract void 메소드명();
								---------------
									자동 추가
								public --- void 메소드명();
										ㅣ (abstact) 자동추가
							------------------
							메소드(구현)
								public default 리턴형 메소드명(){}
								------ --------
						  생략하면 자동추가 	 ㅣ 접근지정어 아니고 구현했다는 의미
						  
						  		public static 리턴형 메소드명(){}
						  		=> 항상 인터페이스를 이용해서만 접근이 가능
						}
						***** new를 이용하지 않고 객체생성 => 추상클래스, 인터페이스
							  File file=new File() => 일반 클래스
							  List list=new ArrayList(); ==> List는 인터페이스이기 때문에 ArrayList라는 구현된 클래스를 이용해 객체생성
						interface A{
							void aaa(); // 앞에 public abstract 자동추가 생각!
						}
						class B implements A{
							void aaa(){} ==> 오류 (접근지정어가 축소됨, 여기는 자동추가 안됨, 직접)
							public void aaa(){} ==> O
						}
				=> 제어어
					static / abstract / final
					공유하는	 공통으로		최종(마지막)
				=> 접근지정어
					private / default / public 
					   ㅣ		ㅣ		  ㅣ 패키지 상관없이 모든 클래스에서 접근 
					   		같은패키지에서 접근
					자신의 클래스내에서 접근
					
			*** 자바에서 주로 사용
				-------------
				= 웹 
				= 모바일
				-------------> 지금 정리된 내용은 거의 사용
 */
import java.util.*;
public class MainClass_lib_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
