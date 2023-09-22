/*
 * 		replace(char, char)
 * 		replace(string,string) 
 * 		=> char, string 둘다 가능 => 오버로딩기법 => 메소드는 똑같지만 매개변수는 다름!
 * 								   ---------ex) System.out.print(int, char, str, ...) 
 * 
 */
public class 문자열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="1상승"; // 숫자와 한글을 각각 자르기
		String id=s.replaceAll("[가-힣]", ""); // [가-힣] => 한글 전체를 가르키는 말 => 한글을 공백으로 바꿔라
		String state=s.replaceAll("[0-9]", ""); // 숫자를 공백으로 바꿔라
		System.out.println("id="+id);
		System.out.println("state="+state);
		System.out.println("▲"+id);
		
		s="Hello Java!!";
		String ss=s.replace('a','b'); // 문자 변경 a → b
		System.out.println(ss);
		ss=s.replace("Java","Python"); //문자열 변경 Java → Python 
		System.out.println(ss);
		
	}	

}
