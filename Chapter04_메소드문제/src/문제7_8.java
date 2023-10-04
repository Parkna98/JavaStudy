// 7. 문자열의 소문자를 대문자로 바꿔주는 메소드 구현
// 8. 문자열을 거꾸로 출력하는 메소드 구현
import java.util.Scanner;
public class 문제7_8 {
	
	// 문제7,8
	 
	// 문자열 입력 메소드
	static String input() {
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열 입력:");
		return scan.nextLine();
	}
	
	// 소문자를 대문자로 바꿔서 출력
	static void alphaChange(String msg) {
		String res="";
		for(int i=0;i<msg.length();i++) {
			char c=msg.charAt(i);
			if(c>='a' && c<='z') {
				res+=(char)(c-32);
			}
			else
				res+=c;
		}
		System.out.print(res);
	}
	
	// 거꾸로 출력
	static void alphaRev(String msg) {
		String res="";
		for(int i=msg.length()-1;i>=0;i--){
			res+=msg.charAt(i);
		}
		System.out.print(res);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alpha=input();
		System.out.println("소문자를 대문자로 출력");
		alphaChange(alpha);
		System.out.println("\n거꾸로 출력");
		alphaRev(alpha);
	}

}
