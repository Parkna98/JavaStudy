/*
 * 		문자열
 * 		----- String = 기능이 많다
 * 		1. 문자의 갯수 확인 : length()
 * 		2. 검색
 * 		   --- 
 * 			starstWith	: 시작하는 문자열이 같을떄
 * 			endWith		: 끝나는 문자열이 같을때 => cookie 
 * 			***contains	: 포함된 문자가 있는지 => 검색, 추천
 * 			***equals	: 같은 값 => id, password
 * 			   ------- => 대소문자 구분
 * 		3. 문자열 제어
 * 		   = 변경 : replace(), replaceAll()
 * 				   replace('a','b')
 * 				   replaceAll("[가-힣]","") => 한글전체를 공백으로 바꿔라
 * 				   replaceAll("[0-9 A-Z a-z]","") => 숫자, 대문자, 소문자 바꾸기
 * 				   String s="Hello Java"
 * 							 0123456789 => 문자순서
 * 			= 문자 자르기 : substring(1) => 1번 부터 짜르기 => ello Java 들고옴
 * 						 substring(4,8) => 4번부터 7번까지 짜르기(8번제외) => o Ja 들고옴
 * 
 * 			= 대문자 : toUpperCase
 * 			= 소문자 : toLowerCase
 * 		
 * 		4. 모든 데이터형을 문자열로 변경
 * 			= valueOf(1) => "1" ==> 윈도우, 웹 => 문자열로 바꿔서 전송해야함 (숫자전송 안됨)
 * 		
 * 		5. 분리 : split() => Spring[] 
 * 				 charAt(index)
 * 				 "Hello Java" => charAt(0) => 'H' => 시작번호 0번 => 공백은 어떻게 취급하는지??
 * 				*** index번호 자바는 0부터 시작 (오라클은 1부터 시작)
 * 
 * 		String => 일반형 => 
 * 		------------------ Call By Value / Call By Reference
 * 				  				ㅣ			=> 배열/클래스
 * 							  String
 * 		형식) String s="";
 * 			 String s=new String("")
 */
public class 문자열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Java!!";
		System.out.println(s.length()); // 문자의 갯수 => 공백포함
		if(s.startsWith("Hello")) // Hello로 시작하는 문자열인지 확인하는 문자 ==> Suggest(검색할때 자바치면 검색창에 자바, 자바스크립트, 자바소스 등등 나오는것)
		{ 
			System.out.println("포함됨");
		}
	}

}
