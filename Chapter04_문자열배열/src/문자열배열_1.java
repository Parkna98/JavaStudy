/*
 * 		자바 => 문자열(웹,윈도우) => 가장 많이 사용되는 데이터형
 * 				   -------- 대부분 문자열을 가지고 있다
 * 		문자열 사용법
 * 		---------
 * 		=> 데이터형
 * 			String : 일반 데이터형, 클래스형으로 사용이 가능
 * 					 ---------
 * 						ㅣ
 * 					String name="박나현";
 * 					String name=new String("박나현")
 * 					** 문자열의 저장 갯수는 제한이 없다
 * 					   -----------------------
 * 			String => 클래스형으로 만들어져 있다
 * 			------ char[]
 * 			"Hello Java"
 * 			 0123456789 => 문자열 인덱스는 0번부터 시작 
 * 						=> 오라클은 1번부터 시작(*주의), MySQL은 0번부터 시작
 * 			=>{'H','e','l','l','o',' ','J','a','v','a'} ==> String은 char배열로 만들어짐
 * 			String의 기능(메소드)
 * 				***라이브러리 (변경해서 사용 할 수 없다)
 * 				=> String은 final class
 * 					java.lang에 있는 대부분의 클래스는 final
 * 					--------- String, Math, System ....
 * 			-----------------
 * 			변환
 * 				toUpperCase() => 대문자변환
 * 				toLowerCase() => 소문자변환 
 * 				****valueOf() => 모든 데이터형을 String으로 변경
 * 				-------------
 * 					ex)	int a=10;
 * 						valueOf(a) ==> "10"
 * 						valueOf(a) + 100 ==> "10100"
 * 
 * 			제어
 * 				substring() : 문자 자르기
 * 			변경
 * 				trim() : 공백(좌우) 제거
 * 				replace() : 문자,문자열 변경
 * 				replaceAll() : 변경(정규식)
 * 				split() : 분리
 * 
 * 			찾기
 * 				indexOf() 		: 위치 찾기 (앞에서부터) ==> 파일경로, 확장자 찾기
 * 				lastIndexOf()	: 위치 찾기 (뒤에서 부터) 
 * 				"Hello Java" => 맨 뒤의 a를 찾으려면 lastIndexOf() 쓰기
 * 							 	앞의 a를 찾으려면 indexOf() 쓰기
 * 
 * 			결합
 * 				concat() ==> + ==> 문자열 결합
 * 			
 * 			비교
 * 				equals() : 같은 문자열인 경우 => 로그인, 아이디찾기...
 * 				contains() : 문자열이 포함된 경우 => 검색
 * 				startsWith() : 시작문자열이 같은 경우 ==> Cookie
 * 				endsWith() : 끝 문자열이 같은 경우
 * 
 * 			기타
 * 				charAt() ==> 문자중에 한개의 char 얻는다
 * 				toCharArray() ==> 문자열을 char[]로 변경
 */
import java.util.*;
public class 문자열배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기능처리 => 메소드 : 기능처리한 후에 반드시 결과값을 보내준다.
		// 결과값 : 리턴형
		// double => Math.random()
		// Math.random(); // random()에 마우스커서 갖다대면 데이터형을 알려줌
		// String => char[] toCharArray
		/* String s="Hello Java";
		System.out.println(s);
		char[] c = s.toCharArray();
		System.out.println(Arrays.toString(c)); */
		
		char[] arr=new char[10];
		// 초기값
		for(int i=0;i<arr.length;i++){
			arr[i]=(char)((Math.random()*26)+65);
		}
//		System.out.println(Arrays.toString(arr));
//		String s=String.valueOf(arr); // 배열을 문자열로 변환
//		System.out.println(s);
		// char[] => String  : valueOf
		// String => char[]  : toCharArray
		// charAt() => char
		/*
		 * 		Hello Java
		 * 		0123456789
		 * 
		 * 		charAt(4) => 'o'
		 */
		String s="Hello Java"; // 문자열 "" / 문자 ''
		for(int i=0;i<10;i++) {
			char c=s.charAt(i); 
			System.out.println("c="+c);
		}

		
	}
} 
 