package com.sist.exception;
// 다중 catch => 에러마다 따로 처리
/*
 * 	====> 전체가 에러코드 => 앞에 Exception의 최상위클래스가 있어서 
 * 						뒤의 문장들이 쓸모없어짐 
 * 			==> 구조상의 에러가 없으려면 Exception은 가장 마지막에 들어가야함 (순서가 존재)
 * 		try
 * 		{
 * 			문자열 => 정수로 변한 에러 
 * 		}catch(Exception e) ==> 다중catch문은 크기별로 순서 중요 (Exception은 마지막에)
 * 		{
 * 		}catch(NumberFormatException e)
 * 		{
 * 		}catch(NullPointerException e){}
 * 
 * 				Throwable
 * 				---------
 * 					ㅣ
 * 			-----------------
 * 			ㅣ				ㅣ
 * 		  Error			Exception
 * 							ㅣ
 * 						-----------
 * 						ㅣ		  ㅣ
 					IOException	RuntimeException
 					SQLException		ㅣ
 									NumberFormatException
 										...
 */
// 문자열을 입력 ==> 정수 변환 ==> 배열에 첨부 ==> 배열에 있는 값 /

import java.util.*;
public class MainClass_3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		String s1=scan.next();
		// <input type=text> 웹상에서는 거의다 문자열로 입력받음
		System.out.print("정수 입력:");
		String s2=scan.next();
		
		try {
			int[] arr= new int[2]; 
			arr[0]=Integer.parseInt(s1);  // => 에러가 있는지 모름
			arr[1]=Integer.parseInt(s2);
			
			int result=arr[0]/arr[1];
			System.out.println("result="+result);
	//	}catch(SQLException) // Error! try소스에 SQL관련내용이 없어서 에러 검출할 사항이 없기 때문이다
		//{
			
		}catch(NumberFormatException ex) {
			System.out.println("정수 변환을 할 수 없습니다");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났습니다");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}catch(Exception e){
			System.out.println("기타 에러 발생");
		}catch(Throwable a) {
			System.out.println("예외와 에러처리"); // Throwable이 가장 큰클래스이기때문에 가장 마지막에
			
		System.out.println("정상종료");
		}
	}
}
