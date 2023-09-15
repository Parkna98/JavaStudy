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
		char ch=scan.next().charAt(0);
		
		if(ch>=65 && ch<=90)
		{
			System.out.println(ch+"는(은) 대문자입니다");
		}
		if(ch>=97 && ch<=122)
		{
			System.out.println(ch+"는(은) 소문자입니다");
		}
		if(ch>=48 && ch<=57)
		{
			System.out.println(ch+"는(은) 숫자입니다");
		}
		if(!((ch>=65 && ch<=90) || (ch>=97 && ch<=122) || (ch>=48 && ch<=57)))
		{
			System.out.println(ch+"는(은) 기타입니다.");
		}
	}

}
