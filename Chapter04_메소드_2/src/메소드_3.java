// 암호화 시저스 => AES 
import java.util.Scanner;
public class 메소드_3 {
	// 매개변수 전송법*** => 메소드안에서만 메모리 저장되는데 어떻게 다른 프로그램까지 쓸수있게 하는지
	// 입력값 => 리턴형(o) 매개변수(x)
	static String userInput() {
		//Scanner scan=new Scanner(System.in);
		return 메소드_2.userInput(); // 재사용
	}
	// 암호화 => 리턴형(o) 매개변수(o)
	static String encode(String msg) {
		String result="";
		for(int i=0;i<msg.length();i++) {
			char c=msg.charAt(i);
			result+=(char)(c+3);
		}
		return result;
	}
	// 복호화 => 리턴형(x) 매개변수(o) => void, 매개변수(o)
	static void decode(String en) {
		for(int i=0;i<en.length();i++) {
			char c=en.charAt(i);
			System.out.print((char)(c-3));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg=userInput();
		System.out.println("msg:"+msg);
		String en=encode(msg);
		System.out.println("암호화된 문자:"+en);
		decode(en);
	}

}
