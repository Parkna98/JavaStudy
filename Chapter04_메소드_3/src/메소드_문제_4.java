// => 알파벳 입력 받기 => 대문자, 소문자, 숫자, 기타
// 1.문자입력 2.처리 3.출력


import java.util.Scanner;
public class 메소드_문제_4 {
	
	// 입력
	static char input() {
		Scanner scan=new Scanner(System.in);
		System.out.print("문자 입력:");
		char c=scan.next().charAt(0);
		return c;
	}
	
	// 처리
	static String result(char c) {
		String res="";
		if(c>='A' && c<='Z')
			res=c+"는(은) 대문자입니다.";
		else if(c>='a' && c<='z')
			res=c+"는(은) 소문자입니다.";
		else if(c>='0' && c<='9')
			res=c+"는(은) 숫자입니다.";
		else
			res=c+"는(은) 기타입니다.";
		return res;
	}
	
	// 출력
	static void print(String res) {
		System.out.println(res);
	}
	
	// process
	static void process() {
		char c=input();
		print(result(c));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		
		/*Scanner scan=new Scanner(System.in);
		System.out.print("문자 입력:");
		char c=scan.next().charAt(0);
		
		String res="";
		if(c>='A' && c<='Z')
			res=c+"는(은) 대문자입니다.";
		else if(c>='a' && c<='z')
			res=c+"는(은) 소문자입니다.";
		else if(c>='0' && c<='9')
			res=c+"는(은) 숫자입니다.";
		else
			res=c+"는(은) 기타입니다.";
		
		System.out.println(res);*/
	}

}
