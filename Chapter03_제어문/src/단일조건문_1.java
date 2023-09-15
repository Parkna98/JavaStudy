//	알파벳을 받아서 대문자, 소문자, 숫자, 다른문자
import java.util.Scanner;
public class 단일조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// 알파벳 받기
		// 대문자
		// 소문자
		// 숫자
		// 기타
		System.out.print("알파벳 입력:");
		char ch=scan.next().charAt(0); // charAt(i) => 어떤 문자열을 입력하던지 i번째에 있는 문자 가져옴 (0번이 첫순서)
									   // 공백 (' ')은 못받는건지??
		if(ch>='A' && ch<='Z')
		{
			System.out.println(ch+"는(은) 대문자입니다");
		}
		if(ch>='a' && ch<='z')
		{
			System.out.println(ch+"는(은) 소문자입니다");
		}
		if(ch>='0' && ch<='9')
		{
			System.out.println(ch+"는(은) 숫자입니다");
		}
		if(!(
				(ch>='A' && ch<='Z') || 
				(ch>='a' && ch<='z') || 
				(ch>='0' && ch<='9')
		   ))
		{
			System.out.println(ch+"는(은) 알파벳이나 숫자가 아닙니다");
		}
	}

}
