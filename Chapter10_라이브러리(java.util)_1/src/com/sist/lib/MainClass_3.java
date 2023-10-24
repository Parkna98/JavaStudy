package com.sist.lib;
// Random => nextInt()
import java.util.*;
/*
		Random => 임의의 수를 추출할 때 사용
				  ------- 자바 JVM(가상머신)에서 추출
				  => Math.random() => 리턴(double) => 단점:형변환
		=> int nextInt(int bound)
		   			  ----------- 
		   			  	100 => 0~99 (0 ~ 입력숫자 전까지)
		   			  	0~100 => nextInt(100)+1
 */
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A~Z 알파벳을 임의로 10개
		Random r=new Random();
		/*for(int i=1;i<=10;i++) {
			char c=(char)(r.nextInt(26)+65); 
			//				0~25    + 65
			System.out.print(c+" ");
		}*/
		/*for(int i=1;i<=6;i++) {
			int lotto=r.nextInt(45)+1;
			System.out.print(lotto+" ");
		}*/
		int day=r.nextInt(7)+7; // 7~13 (업체마다의 예약가능일수)
		Set set=new HashSet();
		for(int i=1;i<=day;i++) {
			int rr=r.nextInt(31)+1; // 1~31
			if(rr>=6) { 	// 예약가능날짜 활성화 (오늘날짜보다 크거나 같음)
				System.out.print(rr+" "); // 중복 제거시 예약날짜 뽑는 알고리즘
				set.add(rr);	// Set에는 중복불가하므로 중복제거로 사용 (중복값들어오면 저장안되고 팅겨나감)
			}
		}
		System.out.println("\n==========최종결과==========");
		for(Object obj:set) {
			System.out.println(obj+" ");
		}
	}

}
