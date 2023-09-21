/*
 * 		문자열
 * 		----- String = 기능이 많다
 * 		1. 문자의 갯수 확인 : length()
 * 		2. 검색
 * 		   --- 
 * 			starstWith	: 시작하는 문자열이 같을떄
 * 			endWith		: 끝나는 문자열이 같을때 => cookie 
 * 			***contains	: 포함된 문자가 있는지 => 검색
 * 			***equals	: 같은 값 => id, password
 * 			   ------- => 대소문자 구분
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
