package com.sist.lib;
import java.text.*;
import java.util.*;
//Format
/*
		DecimalFormat : 숫자 변환 (천자리 앞에 ,)
			200000000 => 200,000,000
		ChoiceFormat : switch
		MessageFormat : 출력형식
		SimpleDateFormat : 날짜 출력 형식
		------------------------------------
		java.text 
*/
// 날짜변환
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 현재 시스템의 시간을 읽어 온다 => Date
		Date date=new Date();
		System.out.println(date); // 데이터베이스 호환(오라클)
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
		/*
		 * 		년도 : y => yyy => yy => yyyy (자리수 출력) (소문자)
		 * 		월  : M => MM (01)
		 * 			 1~12 
		 * 		일  : d => dd(01,02)
		 * 		시간 : h => hh
		 * 		분 : m => mm   
		 * 		초 : s => ss 
		 * 		--------------- 소문자 한개쓰면 한글자, 두개쓰면 두글자출력
		 */
	}

}
