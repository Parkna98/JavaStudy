// 알파벳을 입력받아서 => 대문자, 소문자 판별
// 메소드 1개 or 2개
import java.util.Scanner;

public class 메소드_6 {
	static char alphaInput() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("알파벳 입력:");
		return scanner.next().charAt(0);
		// java의 단점 => char를 받아서 처리하는 기능이 없다
		// 				String을 받아서 잘라내야함 => charAt(i)
	}
	
	static void result(char c) {
		// void => 결과값을 자체 처리
		if(c>='A' && c<='Z') 
			System.out.println(c+"는(은) 대문자 입니다.");
		else if(c>='a' && c<='z')
			System.out.println(c+"는(은) 소문자 입니다.");
		else
			System.out.println(c+"는(은) 알파벳이 아니다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 알파벳 입력 받기
		char c=alphaInput();
		result(c);
	}

}
