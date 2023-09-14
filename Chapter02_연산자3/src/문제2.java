/*
 * 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 
 * 변수 b의 값이 true가 되도록 하는 코드이다. 알맞은 코드를 넣으세요.
 */
import java.util.Scanner;
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("문자 입력: ");
		char ch=scan.next().charAt(0); // char를 입력받을때 쓰는함수 // charAt(0) => 0번 순서를 가져옴, 
		//														  charAt(3) => 3번째 문자를 가져옴 sfjsdlka => j 가져옴
		// "ABC"
		//  012
		System.out.println("ch="+ch);
		boolean b=(ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch<='9'?true:false); // 문자는 int로 자동형변환해서 연산하므로 (int)로 강제형변환 할 필요없음
		System.out.println(b);
//		char ch= 'k';
//		boolean b = (((int)ch>=65 && (int)ch<=90)||((int)ch>=97 && (int)ch<=122)||((int)ch>=48 && (int)ch<=57)?true:false);
//		System.out.println(b);
		
	}

}
