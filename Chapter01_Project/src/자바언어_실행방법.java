/*
 *  2page
 *  자바 언어의 특징
 *  ------------
 *  1) 실행방법
 *  	- 컴파일 방식		==> 2진파일로 변환 (컴퓨터가 인식하는 언어)
 *  						C/C++ ...., Java
 *  						기계어
 *  		*** 자바의 특징
 *  			컴파일
 *  			  C/C++ => 컴파일시 운영체제마다 다른 컴파일을 한다
 *  					=> 컴파일된 내용이 다르다
 *  			  Java  => 운영체제마다 동일
 *  			   => 컴파일된 파일 : 바이너리 코드
 *  							  --------------
 *  							   One Write (한번 코딩하면 모든 운영체제(OS)에서 사용가능)
 *  	- 인터프리터 방식	==> 한줄씩 번역해서 실행
 *  			   			HTML / CSS
 *  	= 보안(자바) => 두번을 검색하기 때문에 (소스 검증)
 *  		=> 보안의 뛰어남 => 인증 시스템
 *  		=> 동원 증권 : 자바 => 시스템 구축
 *  
 *  				  자바소스
 *  					ㅣ
 *  				   JVM => 파일(dll)
 *  					ㅣ
 *  			-----------------
 *  			ㅣ		ㅣ		ㅣ
 *  		  리눅스	   윈도우    MAC
 *        = 실행과정
 *        		기계어로 변경 (javac)		한줄씩 번역(java)
 *        A.java ==============A.class ================> Hello Java
 *        프로그래머 코딩	  ㅣ	   바이너리 코드      ㅣ
 *        				컴파일 				인터프리터
 *        => 편집기 : 이클립스, 인텔리J(파이참) 
 *        			--------------- 어시스트
 *        			   ㅣ
 *					 java + javac => ctrl + F11
 *			--------------------------------------
 *							ㅣ
 *				자바 파일 목록  ㅣ
 *							ㅣ 소스 코딩
 *							ㅣ  
 *			----------------------------------------
 *					OUTPUT : 화면출력
 *			----------------------------------------
 *				다운로드 : eclipse.org => J2EE
 *
 *			6page : 개발환경 구축
 *					JDK => 17 (이상 버전은 한글 제어에 문제)
 *					https://jdk.java.net
 *					--> 스프링 (14)
 *						스프링 (STS => 3, STS => 4 : Boot) - 3시즌 사용할것( 4버전은 FrameWork 없고 Boot만 있음)
 *							  FrameWork + Boot
 *			=> JDK 환경 설정
 *			   ------------------
 *				path -> c:\jdk-17.0.2\bin
 *				classpath -> .;c:\jdk-17.0.2\lib
 *			
 *			=> 11page
 *				이클립스로 파일생성
 *				=> 프로젝트 폴더 만들기
 *				=> src => 자바파일 생성
 *						  ------class파일 생성
 *				=> 주의점(19page)
 *					파일명과 클래스명이 반드시 "동일"해야 사용이 가능
 *					대소문자를 구분한다 
 *					=> 언어 (대소문자를 구분한다)
 *					문법사항은 아니나, 약속
 *				=> 클래스명은 첫자를 대문자, 새로운 단어 결합 할 때 첫자 대문자 - 헝거리언식 표현법 (Camel Case)
 *				=> 변수, 메소드 => 소문자
 *				   상수 => 전체를 대문자
 *				=> {} 일치
 *				=> 명령어 종료시 ;
 *				
 *				=> 모든 자바파일은 main이 있어야 실행이 가능
 *
 *				=> 주석 (번역이 안되는 코드)
 *					// 한줄주석
 *				  => 드래그 후 ctrl + shift + /   주석
 *				  => 드래그 후 ctrl + shift + \   주석풀기
 *				
 *				=> 화면출력
 *					sysout => ctrl + space
 *							  ------------
 *					. => 메소드 많이 보여줌
 *
 *				자바의 구성도
 *				class A ==> 클래스 시작
 *				{ 
 *					public static void main(String[] arg)
 *					{
 *						System.out.println("Hello"); 화면 출력
 *					}	=> 메인 종료 
 *				}	클래스 종료
 */
public class 자바언어_실행방법 {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java!!");
		System.out.println("Hello Java!!");
		System.out.println("Hello Java!!");
		System.out.println("Hello Java!!");
		System.out.println("Hello Java!!");
		System.out.println("Hello Java!!");
	}

}
