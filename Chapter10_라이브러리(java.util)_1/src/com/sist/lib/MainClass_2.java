package com.sist.lib;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
/*
		라이브러리 (9장~12장)
			=> 클래스명 (사용처)
				=> 기능(메소드) 
				   --------- 리턴형/매개변수 ***
				   	신뢰성이 높다 => 에러가 없다 
				   	표준화 
				   	자바는 80%가 라이브러리 + 20% 조립
					**사용위치
		java.lang
			*** Object, String, StringBuffer, Wrapper, Math, System
		java.util
			*** Random 
				------ 예약일, 예약시간 (모든업체에 예약입력 힘들어서 Random으로 대체)
			*** Date / Calendar
				StringTokenizer
				List / Set / Map
				Scanner(거의 안씀)
			
		java.text
			*** SimpleDateFormat : 날짜변경
			 	DecimalFormat : 숫자변경 => 가격출력시 (,)추가 ...
				MessageFormat :  
				ChoiceFormat  :  
		java.io
		java.net
		java.sql
		------------------
		javax.xml
		javax.http.servlet
		------------------
		org.springframework ==> org는 자바내부가아니라 외부그룹에서 보내주는 라이브러리
		org.mybatis
		org.jpa
		------------------
		
		
 */
import java.util.*;
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
		
		int won=1999999;
		DecimalFormat d=new DecimalFormat("#,###,###");
		System.out.println(d.format(won));
		
		String name="홍길동";
		String sex="남자";
		int age=20;
		String addr="서울";
		String tel="010-1111-1111";
		
		// 오라클전송
		String sql="INSERT INTO member VALUES('"+name+"','"+sex+"',"+age+",'"+addr+"')";
		// MessageFormat
		// "INSERT INTO member VALUES(?,?,?,?,?)" => 문자는 '' 숫자는 ''(X)
	}

}
