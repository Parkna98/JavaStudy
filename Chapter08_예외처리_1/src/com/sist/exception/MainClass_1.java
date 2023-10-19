package com.sist.exception;
/*
 * 		8장 => 예외처리
 * 			  ------ 에러 => 사전에 에러 방지하는 목적
 * 					     => 비정상 종료를 방지하고 정상 상태를 유지
 * 						 => 예외처리 => 에러 발생시 에러를 건너뜀
 * 		에러 발생 
 * 		-------
 * 		 = 사용자 (잘못된 입력) => 유효성 검사 => JavaScript(웹)
 * 						   => if
 * 		 = 개발자 (실수) => 배열 인덱스, 정수변환...
 * 		-------------------
 * 		1) 사전에 차단 (if) => 예외처리 
 * 		2) 예외처리
 * 		   ------
 * 				= 에러(Error): 소스상에서 수정이 불가능한 에러
 * 							  메모리 저장공간이 부족하다..
 * 				= 예외(Exception) : 소스상에서 수정이 가능한 에러
 * 					ex) 파일경로명, IP, 0으로 나눈다, 배열 인덱스가 틀리다
 * 		==> 예외처리 방법
 * 			---------
 * 			= 예외복구 => try~catch
 * 			= 예외회피 => throws 
 * 			= 임의발생 => throw
 * 			= 지원하지 않는 예외 : 사용자 정의 예외처리
 * 		==> 예외의 종류 (상속도)
 * 				Object : 모든 클래스의 상위 클래스
 * 				   ㅣ
 * 				Throwable : 예외의 최상위 클래스
 * 				   ㅣ
 * 			---------------------
 * 			ㅣ					ㅣ
 * 		  Error				Exception
 * 		  -----				----------
 * 		  처리가 불가능			처리가 가능 (소스변경)
 * 			메모리 부족			 => 0으로 나누는 경우
 * 			윈도우 충돌				배열의 인덱스범위 벗어나는 경우
 * 			톰캣 작동실패			형변환, 파일명, IP 틀린경우...
 * 			오라클 연결실패
 * 		-----------------------------------------------
 * 			Exception : 예외처리의 최상위 클래스 
 * 			----------
 * 				ㅣ
 * 			---------------------------------
 * 			ㅣ								ㅣ
 * 		CheckException					UnCheckException
 * 		=> 컴파일시에 예외처리를 했는지 확인		=> 확인이 없기 때문에 필요시에 사용
 *		=> 라이브러리 중에 반드시 예외처리
 *		=> java.io
 *			=> 파일명이 틀린경우
 *			=> FileNotFoundException
 *			=> IOException
 *		=> java.net
 *			=> URL주소, IP가 틀린경우
 *			=> MalformedURLException
 *		=> java.sql				
 *			=> 오라클 URL : SQLException
 *				jdbc:oracle:thin:@localhost:1521:XE
 *											----
 *		=> ClassNotFoundException            연결포트
 *		=> 충돌 => 쓰레드 InterruptedException
 *		------------------------------------------
 *		UnCheckException
 *		-----------------
 *		RuntimeException => 예외를 확인 할 수 없다 
 *		---------------- => 모든에러를 잡으려면 Exception(최상위)를 쓰고 밑에있는 해당에러들만 잡고싶으면 RuntimeException 처럼 부분적으로 예외처리
 *		  ㅣ실행시 에러
 *			ex) 1~100사이의 정수 입력.. => 무엇을 입력할지 모르니 실행후 에러
 *		
 *		NumberFormatException : 문자열로 받아서 정수로 변경 => 웹에서 많이 발생
 *			=> http://localhost/main/main.jsp?page = 10 => Error! 공백불가 (page=10) 
 *			=> 웹에서는 데이터 전송 => URL을 이용해서 전송
 *			   자바는 메소드의 매개변수를 이용해서 전송
 *
 *		ArrayIndexOfOutBoundsException : 배열의 인덱스번호 벗어난 경우
 *				
 *		NullPointerException : null인 클래스를 사용한 경우
 *							  ----- 주소가 없는 경우
 *		ArithmeticException : 0으로 나누는 경우 
 *
 *		ClassCastException : 형변환				
 *
 *		==> 에러 예상 :
 *			문자열로 정수를 받아서 배열에 저장한 다음에 나누기를 한다
 *			--------------- --------       -----
 *		NumberFormatException			ArithmeticException  				
 *							ArrayIndexOfOutBoundsException
 *		==> 사전에 에러 방지 => 예측
 *
 */
import javax.swing.*;
class A{
	public void aaa() {
		System.out.println("A:aaa() Call...");
	}
}
class B extends A{
	public void aaa() {
		System.out.println("B:aaa() Call...");
	}
}

public class MainClass_1 extends JFrame{
	JButton b1,b2; // null
	public MainClass_1() {
		b1=new JButton("로그인");
		b1=new JButton("취소"); // b2 null인상태
		add("North",b2);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainClass_1(); // NullPointerException => b2의 주소값 null
		// TODO Auto-generated method stub
		/*A a=new A();
		B b=(B)a; //  
		b.aaa(); => Error! B의 오버라이딩된 메소드를 들고오고싶은데 a는 A로 생성되어서 못들고옴 (생성자오류)*/
		
		/*A a=new B();
		B b=(B)a;
		b.aaa();
		try {
			Thread.sleep(100); // CheckException => 예외처리 안하면 오류남
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//System.out.println(Integer.parseInt(" 10")); // NumberFormatException! 공백불가
		//System.out.println(Integer.parseInt("10"));
		
		/*int[] arr=new int[2];
		arr[2]=100; // ArrayIndexOfBoundsException*/
	}

}
