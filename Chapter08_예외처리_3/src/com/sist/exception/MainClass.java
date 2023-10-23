package com.sist.exception;
/*
	1. 자바문법
		=> 변수/연산자/제어문
		=> 사용자 정의 클래스
			=> 멤버변수/메소드/생성자
			=> 클래스의 종류 => 인터페이스
		=> 에러방지 : 예외처리
		
		= 예외 처리 : 사전에 에러를 방지하는 프로그램
					=> 비정상 종료를 방지하고 정상 수행하게 함
			=> 자바에서 지원하는 예외처리
				1) 고려사항 
					if => 예외처리
				2) 예외처리 대상 
					CheckedException => 컴파일시에 예외처리가 되어 있는지 확인
						=> 반드시 예외처리 (io, net, sql)
						=> 웹 관련
					UnCheckException : 사용자의 입력에 따라...
				3) 예외처리 방법
					--------------------------------------
					= 예외 복구 => 에러를 받아서 처리 => catch
						1. 형식
						2. try{
						   	  => 정상수행 할 수 있는 소스 코드
						   	  => 모든 소스, 부분 소스
						   }catch(예외처리 종류){
						   	  => try에서 에러가 발생시 처리하는 문장
						   	  => 복구는 거의 없다
						   	  => 에러의 위치
						   	  	 printStackTrace
						   	  => 에러 정보
						   	  	 getMessage
						   	  => 에러 수정 목적
						   }
						   --------- catch 여러개 사용이 가능 => 전체(Exception)
						   finally{
						   	  => 생략 가능
						   	  => 사용처 : 서버 종료, 오라클 연결 해제, 파일 닫기...
						   	  => 에러발생과 관계없이 반드시 수행 
						   	  	 ------
						   	  	 try수행(정상수행), catch(에러가있다)
						   	  	 -----------------------------
						   	  	 무조건 수행하는 문장 => finally
						   }
						   
						   동작 순서
						   try{
						   		문장1
						   		문장2  
						   		문장3 
						   }
						   catch(Exception e){
						   		문장4
						   }
						   fianlly{
						   		문장5
						   }
						   => try가 정상수행 : 1=>2=>3=>5 (catch절 수행X)
						   							--finally수행
						   => 문장2에서 에러 : 1=>4=>5 
						      ---------- 에러발생 구간에서 바로 catch절로 이동
						   					 
						   
					= 예외 회피 => JVM에 미리 알려준다 => RuntimeException은 생략이 가능 (UnCheckException)
							  => 이런 에러가 발생할 수 있다
						문법)
							메소드() throws 예외처리종류...
							메소드() throws Exception, NumberFormatException 
										  ---------------------------------
										  throws는 예외처리 순서가 없다
										  => try~catch => 예외처리 순서(상속도)
										  => throws => 예외처리 순서가 없다
										  => throws문장을 사용할 때 => 이미 소스코딩이 완료된 상태에서 에러처리를 하고싶을때
										  
							*** 예외처리 목적 => 프로그램 종료 방지
							 	ex) 로그인 => 입력이 안된 상태 => 종료
							 		=> 개인 정보 누출 의심 => 자바스크립트로 제어
							 							(자바는 데이터를 웹에 연결할때 중간다리 역할 (JSP)) 
							 															 ---- Java => HTML
							 							JSP에서 <% %>안에 자바코드 넣고, <body></body> 안에 HTML코드
							 	=> 라이브러리뒤에 많이 붙어있다(예외처리)
							   	   ---------
							   	   1) throws
							   	   2) try~catch를 이용할 수 있다
							   	   
							   	   ex) void insert() throws Exception
							   	   		=> insert를 호출하기 위해서는 예외처리를 하고 사용
							   	   	   void method(){
							   	   	   	   insert() ===> 오류(예외처리없음)
							   	   	   }
							   	   	   
							   	   	   ==>  void method() throws Exception{
							   	   	   			insert()
							   	   	   		}
							   	   	   		
							   	   	   		void method(){
							   	   	   			try{
							   	   	   				insert()
							   	   	   			}catch(Exception ex){}
							   	   	   		}
					--------------------------------------
					= 임의 발생 => 테스트 
					= 지원하지 않는 예외 => 사용자 정의 예외
		
	2. 라이브러리 => 암기
		java.lang
			= Object, String, StringBuffer, Wrapper
		java.util
			= Date, Calendar, StringTokenizer
			= Collection 
				= ArrayList / HashSet / HashMap
		java.io
			= 업로드 / 다운로드 => 파일 관련
		java.net => 흐름 (크롤링=>프로젝트) URL
		---------
		java.sql = 자바에서 오라클 연동
			Connection / Statement / ResultSet
		---------
	
 */
public class MainClass {

	public static void main(String[] args) {
		try {
			Thread.sleep(1000); // 예외처리 1.try~catch 사용
								//       2. throws InterruptedException 사용
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
