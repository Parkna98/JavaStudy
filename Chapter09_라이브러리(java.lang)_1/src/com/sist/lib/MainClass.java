package com.sist.lib;
/*
		java.lang / java.util / java.text 
		java.io / java.net / java.sql
		--------------------------------- 표준 자바 JDK 1.0
		=> 확장 : javax (웹,윈도우) => JDK 1.2
		
		= java.lang => 보통 package가 다르면 import를 사용해서
					   클래스를 가지고 온다 (java.lang은 생략이 가능)
		  ---------
		  	Object	: 모든 클래스의 상위 클래스 (모든 클래스는 Object를 상속받는다)
		  			  모든 데이터형을 받을 수 있는 클래스
		  			  모든 데이터형을 모아서 관리
		  			  Object[] obj={"",' ',10,10.5,new A()};
		  			  --------------------------------------
		  			  		ㅣ 자바스크립트(배열=>Object이기 때문에...)
		  			  기능만 가지고 있다 (메소드)
		  			  = 주요기능
		  			  	1) toString() : 자주 사용, 객체를 문자열화
		  			  	   => 오버라이딩이 가장 많이 되는 메소드
		  			  	   => 기본 출력 : 객체 주소값 출력 (오버라이딩하면 출력값 변경가능)
		  			  	   => 객체 출력할 때 toString()이 생략가능
		  			  	   => String toString() => 원형
		  			  	   
		  			  	2) clone() : 객체를 복제해서 새로운 객체생성
		  			  	   => 스프링에서 주로 사용
		  			  	   	  ----
		  			  	   	  ㅣ 싱글턴(한 개의 객체 생성 ==> 재사용하는 방식)
		  			  	   	  		 -------------
		  			  	   	  		 필요시에는 여러개 생성가능(clone())
		  			  		  ㅣ 응용 => JSP에서 (웹) => 알고리즘이 필요 없다
		  			  		  ㅣ 스프링 => 디자인 패턴 / 알고리즘
		  			  	   => Object clone() throws CloneNotSupportedException
		  			  	   	  ------ 1. 예외처리, 2. 형변환을 한다
		  			  	   	  => 라이브러리 공부
		  			  	   	  	 1. 원형 (리턴형, 메소드명, 매개변수)
		  			  	   	  	 2. 사용처
		  			  	   	  	 3. 70~80% 이미 만들어져 있다 (라이브러리)
		  			  	   	  	 	20~30% 사용자정의 => 라이브러리 + 사용자정의클래스 (조립식)
		  			  	   	  	 	=> 라이브러리 중심으로 프로그램 구현 => CBD
		  			  	   	  	 	=> 프로그래머 VS 개발자
		  		이미 존재하는 기능 조립 (자바,C#) ㅣ		   ㅣ 없는 것을 만드는 사람(C/C++)
		  		
		  		=> Python / C/C++ / Java / C#
		  		=> Java / C/C++ / Python / C#
		  		=> 특성
		  		   => 미국, 유럽 => 아키텍쳐(설계)
		  		   => 인도 => 구현 중심
		  		   => 일본 => 무선 발전
		  		   => 한국 => 유선 발전 => 웹 사이트 (자바)
		  			  
		  				3) finalize() : 소멸자 (객체 메모리 해제시에 자동 호출)
		  								=> 멀티미디어 (스트리밍 서비스)
		  								=> 멜론 / 지니뮤직 / OTT
		  								=> 아프리카TV
		  					protected void finalize() => finalize만 protected를 씀
		  					
		  				4) equals() : 객체 비교시에 주로 사용
		  				   -------- String에서 오버라이딩이 된 메소드를 주로 사용
		  				   	boolean equals(Object obj) => 라이브러리메소드는 앞에 지정어 안쓰면 public이라고 생각
		  				   			------
		  				   			"==" : 주소값을 비교한다, 실제 메모리에 저장된 값
		  				   			"equals" : 객체를 가지고 있는 데이터가 같은 지 여부 (값만을 비교)
		  				   			
		  				   	String s="Hello";
		  				   	String s1="Hello"; // => s==s1 (true), 문자열이 같은것을 저장하면 같은 주소 (String제외 사용자정의데이터형은 다른 주소)
		  				   	String s2=new String("Hello") // 문자열은 같지만 새로운 메모리 공간 생성
		  			  	   	  	   
		  	String	: 문자열을 저장하는 데이터형 / 클래스형
		  			  --------- 기능을 사용할 수 있다
		  			  => 비교
		  			  	 ---
		  			  	= equals => 같은 문자열인지 확인
		  			  		=> 로그인, 아이디 중복 체크
		  			  		=> 아이디 찾기, 비번 찾기
		  			  		=> 상세보기
		  			  		==> 원형
		  			  			boolean equals(String s)
		  			  		=> 같은 문자열은 같은 주소를 가지고 있다
		  			  		   new를 이용하면 다른 주소에 저장
		  			  	
		  			  	= startsWith / endsWith
		  			  		==> 원형 
		  			  		 	boolean startsWith(String s) => s로 시작하는 문자열 => 자동완성기 => 대소문자 구분 
		  			  		 	boolean	endsWith(String s) => s로 끝나는 문자열 => 사용빈도 적음
		  			  		 	
		  			  	= contains : 문자열 포함
		  			  		=> 자바스크립트도 동일
		  			  		==> 원형 
		  			  			boolean contains(String s)
		  			  			=> 문자열 중에 s의 포함여부
		  			  			=> 가장 많이 사용되는 메소드
		  			  	
		  			  => 분리
		  			   	 ---
		  			   	= split() => 원하는 문자별로 분리
		  			   	==> 원형
		  			   		String[] split(",") => 크롤링 
		  			   			 	 ----------
		  			   			 	  ㅣ 정규식을 이용한다
		  			   		**정규식은 => 표현법 
		  			   		기호 ==> \\기호 (기호는 역슬래시 2개를 붙여야함) ex "\\|"
		  			  		-------------
		  			  		= ^ = ^A => A로 시작하는 모든 문자열
		  			  			  startsWith('A'), A%(오라클)
		  			  			  
		  			  		= $	=> A$ => A로 끝나는 모든 문자열
		  			  			  <img src^="http|https"> => http 또는 https로 시작하는
		  			  			  <img src$="jpg|png|gif"> => jpg 또는 png 또는 gif로 끝나는
		  			  			  <img src*="aaa"> => aaa가 포함되는
		  			  			  => 오라클 / JS / CSS
		  			  			  
		  			  		= +	=> A+ => A로 시작 => 1개 이상 문자열 (AB, ABC, ABFE...) (A만 찾아주지는 않음)
		  			  		= *	=> A* => A로 시작 => 0개 이상 문자열 (A 하나만 찾기도 가능)
		  			  		= |	=> a|b => a 또는 b
		  			  		= [] => 문자의 범위
		  			  			[A-Z] 대문자전체 / ^[A-Z] 대문자로 시작하는 / ^[0-9] 숫자로 시작하는
		  			  			[가-힣] 한글전체
		  			  		= {} => 문자의 갯수
		  			  			{3} : 3글자 / {1,3} : 1~3글자
		  			  			
		  			  			ex) 전 세계의 모든 ip 211.238.142.1  xxx.xxx.xxx.xxx
		  			  				[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3} => ip표현법
		  			  				=> .(임의의 한글자) ex) ... : 임의의 3글자
		  			  	
		  			  	= substring() : 문자를 자른다
		  			  		==> 원형
		  			  			String substring(int b)
		  			  			=> String s="Hello Java"
		  			  						 0123456789 => 문자열의 시작은 0부터
		  			  				s.substring(6) => 6부터 나머지전체 => "Java" 
		  			  			String substring(int b, int e) (b ~ e-1)
		  			  				s.substring(3,8) => 3부터 7까지 => "lo Ja"
		  			  			=> 화면에 문자가 길어지면 사용(...)
		  			  			
		  			  		=> 변환 
		  			  		   replace
		  			  		   	=> String replace(char old, char new)
		  			  		   			replace('A','B') => A를 B로 바꿔라
		  			  		   	   String replace(String old, String new) (오버로딩)
		  			  		   	   
		  			  		   replaceAll => 정규식 
		  			  		   		=> 한글전체, 영어전체 등 전체바꿀때 주로 사용
		  			  		   		
		  			  		=> 문자 위치 찾기
		  			  			indexOf => 앞에서부터 찾기
		  			  			lastIndexOf => 뒤에서 찾기
		  			  			int indexOf(char c)
		  			  			int indexOf(String s)
		  			  			int indexOf(char c, int fromIndex) => fromIndex부터 찾기
		  			  			int lastIndexOf(char c)
		  			  			int lastIndexOf(String s)
		  			  			int indexOf(char c, int fromIndex) => fromIndex부터 찾기
		  			  		=> String s="Hello Java";
		  			  			=> char[]을 쉽게 제어가 가능하게 만든 클래스
		  			  			Hello Java
		  			  			0123456789
		  			  			s.indexOf('a'); ==> 7
		  			  			s.lastIndexOf('a'); ==> 9
		  			  	  		==========> 경로명 / 웹사이트 주소
		  			  	  		
		  			  	  	=> 기타
		  			  	  		length() : 문자의 갯수
		  			  	  			=> int length()
		  			  	  		trim() : 좌우공백제거
		  			  	  			=> String trim() => 사용자 입력이 있는 경우
		  			  	  		valueOf() : 모든 데이터형을 문자열 변환
		  			  	  			==> static String valueOf(int a)
		  			  	  				=> 모든 데이터형이 오버로딩
		  			  	  				=> String.valueOf(10) => "10"
		  			  	  		charAt() 
		  			  	  			=> char charAt(int index)
		  			  	  				=> 한글자씩 잘라서 => char변환
		  			  	  		concat() : 문자열 결합 (+)
		  			  	  			=> String concat(String s) 
		  			  	  					  ------ +
		  	StringBuffer : 보완 (String을 보완)
		  		=> 문자열 결합 (최적화) 
		  			=> append(String s) => sb.append("a");
		  			==> 같은 메모리 공간에 문자열을 모아줌 => 속도가 빠름
		  			==> "+"를 이용한 결합은 추가될때마다 새로운 공간을 만듬 => 속도가 느림
		  			
		  	Wrapper : 기본 타입의 데이터를 객체로 저장 (p317)
		  			  ------- 쉽게 사용이 가능하게 만들기 위해 기능을 첨부한 클래스화
		  			  정수형
		  			    byte	==> Byte**
		  			    short	==> Short
		  			    int 	==> Integer**
		  			    long	==> Long**
		  			  실수형
		  			  	float	==> Float
		  			  	double	==> Double**
		  			  논리형
		  			  	boolean	==> Boolean**
		  			  문자형
		  	 			char	==> Character
		  	 		--------------------------------
		  	 		  웹 주소창 => 유일하게 서버와 연결
		  	 		  	=> 사용자가 값을 서버로 전송
		  	 		  	   URL주소?page=10
		  	 		  	   		  ------- String page="10"
		  	 		  	   		  				 ---------
		  	 		  	   		  				 	int로 변경후에 사용 (Wrapper을 사용)
		  	 		  	   		  				 int a=Integer.parseInt(page)
		  	 		  	   		  				 NUMBER, VARCHAR2, DATE...
		  	 => 박싱(오토박싱) / 언박싱
		  	 	----------
		  	 	Integer i=10; // 박싱 : 기본형 데이터를 Wrapper 객체로 변환
		  	 	int j=i; // 언박싱 : Wrapper 객체를 기본형으로 변환
		  	 	---------------------- 호환 
		  	 	
		  	 		 	   
		  	System  :
		  		println() : 화면출력 ***웹
		  		-----------------------
		  		gc() : 메모리 회수 요청
		  		exit() : 프로그램 종료
		  		----------------------- Application(윈도우..)
		  			
		  	Math  	:
		  		random() : 임의로 발생 => double(0.0~0.99)
		  		ceil(double d) : 올림메소드 
		  		ceil(165/10) => 16.0
		  		ceil(165/10.0) => ceil(16.5) => 17
		  		===> Math는 모든 메소드가 static으로 되어있다
		  		Math.ceil...
		  		
		  	Thread	: 한 개의 프로그램 안에서 여러개의 프로그램을 동시에 실행
		  	------ 게임 (시분할)
		  	  ㅣ 서버는 여러명이 접속시에 따로 동작이 가능하게 만들어 준다
 */
import java.io.*; // 예외처리

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s="Hello";
		String s1="Hello"; // => s==s1 (true)
		String s2=new String("Hello");
		//		  --- 새로운 메모리 공간에 "Hello"저장
		if(s==s1)
			System.out.println("s와 s1는 같은 주소를 가지고 있다");
		else System.out.println("s와 s1는 다른 주소를 가지고 있다");
		
		if(s.equalsIgnoreCase(s2))
			System.out.println("s와 s2는 다른 메모리 저장 주소와 같은 문자열을 가지고 있다");
		else System.out.println("s와 s2는 다른 메모리 저장 주소와 다른 문자열을 가지고 있다");
		// 대소문자 구분 없이 비교 ==> 검색 => equalsIgnoreCase()
		// 대소문자 구분 해서 비교 ==> 로그인 => equals()
		
		s1="bye"; // s1에 다른값줘도 s는 안바뀜 => 다른값 준 순간 주소값이 달라짐
		if(s==s1)
			System.out.println("s와 s1는 같은 주소를 가지고 있다");
		else System.out.println("s와 s1는 다른 주소를 가지고 있다");
		
		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,4,5}; // 사용자정의 클래스(String제외)는 클래스명이 다르게 저장하면 다른공간 (클래스명이 주소)
		System.out.println(a==b); // false*/
		
		/*String data="홍길동|박문수|이순신|강감찬|을지문덕";
		String[] names=data.split("\\|"); // 역슬러시를 안주면 한글자씩 자름
		for(String name:names)
			System.out.println(name);*/
		
		// => 다중 검색 => N(name), S(subject), C(content)
		/*String data="NSC";
		String[] ss=data.split(""); // ""로 자르면 한글자씩 잘라옴
		for(String s:ss)
			System.out.println(s);
		System.out.println(data.substring(1, 3));*/
		/*
		String[] data= {
				"a.png","b.jpg","c.gif","d.java","e.java","f.zip"
		};
		// 확장자 찾기 ==> 그림파일
		for(String s:data) {
			String ss=s.substring(s.lastIndexOf(".")+1);
			//System.out.println(ss);
			if(ss.equals("png")||ss.equals("jpg")||ss.equals("gif")){
				System.out.println(s);
			}
		}
		
		String s="Hello World"; 
		System.out.println(s.lastIndexOf("o",7)); // 7 (맨앞 0기준)
		System.out.println(s.lastIndexOf("o",4)); // 4 (맨앞 0기준) */
		try {
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			//String data=""; // 속도 너무 느림
			StringBuffer data=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1) { // -1 EOF
				data.append((char)i);
			}
			fr.close();
			System.out.println(data);
		} catch (Exception e) { 	// Exception / Throwable(exception+에러까지 포함) // error:수정불가능에러 / exception:수정가능한에러
			e.printStackTrace();
		}
		// 예외처리 둘중 선택
		// 1.컴파일러에 알려만 준다(통과요청) => CheckException
		// 		=> 에러 발생시 복구가 어렵다, 예외회피, 예외선언 => throws
		//		=> 소스 코딩을 자유롭게 한다
		// 2.에러발생시 => 복구 ==> try ~ catch
	}

}
