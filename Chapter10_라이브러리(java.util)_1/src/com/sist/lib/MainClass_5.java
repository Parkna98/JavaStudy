package com.sist.lib;

import java.util.StringTokenizer;

/*
		StringTokenizer 
			==> 문자열 분리 
				=> 데이터 오라클에 한번에 저장후 분리해서 쓴다 (모든 데이터갯수가 똑같지는 않으므로)
							  --------- 한문장으로 문자열 결합(^,| 등등 기준을사용해서)
				=> split() => 정규식을 이용 => 쉽게 제작 => StringTokenizer
				=> 네트워크 / 빅데이터 / 웹
				=> 기능(메소드)
				 	1) countTokens()	: 분리된 데이터 갯수
				 	2) nextToken()		: 실제 분리된 데이터 읽기
				 	3) hasMoreTokens()	: 분리된 수만큼 루프 수행
 */
public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="red|green|blue|black|white|yellow|pink|cyan|magenta";
		// split("\\|")
		StringTokenizer st=new StringTokenizer(data,"|"); 
		// StringTokenizer의 구분자는 일반식!! (정규식아니라 \\ 필요없음)
		/*System.out.println("컬러의 갯수:"+st.countTokens());
		String color1=st.nextToken();
		String color2=st.nextToken();
		String color3=st.nextToken(); // 하나자르고 하나자르고
		System.out.println(color1);
		System.out.println(color2);
		System.out.println(color3);*/
		// st.nextToken() => 갯수를 벗어나면 오류발생
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		// hasMoreTokens => 자른갯수만큼만
		/*
			hasMoreTokens 
			1) cursor => 다음토큰이 있으면 true 없으면 false
			--------------------------
			=> Before First
			--------------------------
			   red => st.nextToken() ==> true
			--------------------------
			   blue => st.nextToken() ==> true
			--------------------------
			   green => st.nextToken() ==> true
			--------------------------
			=> After Last ==> st.nextToken() ==> false
			--------------------------
			
		 */
	}

}
