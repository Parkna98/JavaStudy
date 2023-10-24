package com.sist.lib;
// Format
/*
		DecimalFormat : 숫자 변환 (천자리 앞에 ,)
			200000000 => 200,000,000
		ChoiceFormat : switch
		MessageFormat : 출력형식
		SimpleDateFormat : 날짜 출력 형식
		------------------------------------
		java.text 
 */
import java.text.*;
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] won= {1000,20300,250000,7800000,58000000}; // 가격은 정수배열로 => 여러품목 선택시 합, 곱할수 있게
		DecimalFormat df=new DecimalFormat("###,###,###,###"); // 출력용
		for(int i:won)
			System.out.println(df.format(i)+"원");
		
		double[] limit= {59,60,70,80,90}; // 양끝(59이하,60~69,70~79,80~89,90이상)
		String[] grade= {"F","D","C","B","A"};
		int[] score= {100,90,85,90,80,72,60,58};
		ChoiceFormat cf=new ChoiceFormat(limit,grade); // limit에 해당되는 범위일때 grade 출력
		for(int s:score) {
			System.out.println(s+":"+cf.format(s));
		}
	}

}
