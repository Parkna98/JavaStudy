// substring() => 문자를 자른다
/*
 * 		"Hello Java"
 * 		 0123456789
 * 		
 * 		.substring(6) => Java => 숫자하나쓰면 그 인덱스번호부터 끝까지 출력
 * 		.substring(0,5) => Hello => 0~4 => *마지막번호는 제외!
 * 		 
 */
public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address="서울특별시 강남구 도산대로51길 36 지번 서울시 강남구 신사동 655";
//		String s2=address.substring(0,address.indexOf("지번")); // indexOf로 지번찾아서 그 앞까지 자르기
//		String s3=address.substring(address.indexOf("지번")+3); // 지번부터 3글자(지,번,' ') 다음부터 출력
//		String s4=address.substring(address.indexOf("신사동"),address.indexOf("신사동")+("신사동").length());
		String ext="Hello.Java.java";
		String s=ext.substring(ext.lastIndexOf(".")+1); // "."다음부터 잘라내기 (확장자알기위해 .다음부터) ==> 경로, 탐색기, mvc구조 만들때 주로사용
		System.out.println(s);
		
//		int a=address.lastIndexOf(" "); // 신사동 뒤에서 첫번째의 공백찾으려고
//		String s5=address.substring(a-3,a);
		
//		String s1=s.substring(0,4);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
//		System.out.println(s5);
		
	}

}
