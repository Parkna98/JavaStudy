// 1. Scanner 클래스를 이용하여 한 개의정수를 입력 받아 양수인지 음수인지 출력
/*	if(양수) else 음수
 * 	if~else : 웹 => 아이디중복, 로그인, 관리자/사용자, ID찾기, 비밀번호찾기 등
 * 	파일업로드 
 */
import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		num=scan.nextInt(); // 키보드로 입력값을 받는다
		/*
		 * 	정수	: nextInt()
		 * 	실수 : nextDouble()
		 * 	논리	: nextBoolean()
		 * 	문자열 : next()
		 * 	*** 단점 : char는 읽지 못한다
		 * 			=> 문자열로 읽어서 잘라내야함 => next.charAt(0) : 0번째 문자를 가져옴 (0이 첫째임)
		 */
		if(num==0)
		{
			System.out.println(num+"는(은) 0입니다");
		}
		else if(num>0)
		{
			System.out.println(num+"는(은) 양수입니다");
		}
		else if(num<0)
		{
			System.out.println(num+"는(은) 음수입니다");
		}
		

	}

}
