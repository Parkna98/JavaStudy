/*
 * 		문자열
 * 		문자 '' => 한글자 저장 => char
 * 			'a','b','c' ==> 한번에 저장이 가능 String => ""
 * 		일반데이터형
 * 			String name="홍길동"; ==> 제어
 * 		클래스형
 * 			기능 => 메소드
 * 		=> 웹은 데이터형이 존재하지 않는다 => 모든 데이터형이 문자열
 * 			"1"
 * 			<input type=text> // HTML
 */
import java.util.Scanner;
public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 저장
		String name="박나현";
		System.out.println(name);
		char a='박';
		char b='나';
		char c='현';
		System.out.println(a+""+b+c);
		
		String address="서울특별시 마포구 연남로1길 11 1F";
		System.out.println(address);
		
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어:");
		String find=scan.next(); // String으로 받아오기 => next()와 nextLine()의 차이는?
		System.out.println(find);
		
	}

}
