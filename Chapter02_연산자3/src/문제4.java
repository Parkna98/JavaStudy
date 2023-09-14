/*
 * 다음은 대문자를 소문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자인 경우에만
 * 소문자로 변경한다. 문자코드는 소문자가 대문자보다 32만큼 더크다.
 * 예를 들어 'A'의 코드는 65이고, 'a'의 코드는 97이다. 알맞은 코드를 넣으세요
 */
import java.util.Scanner;
public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("문자 입력: ");
		char ch=scan.next().charAt(0);
		System.out.println("ch="+ch);
		char lowerCase=(ch>='A' && ch<= 'Z'?(char)(ch+32):(char)(ch-32)); //대문자를 소문자로, 소문자를 대문자로
		System.out.println("변경된 값: "+lowerCase);
		
//		char ch='u';
//		char lowerCase =ch>='A' && ch<='Z'?(char)(ch+32):ch; // 대문자인 경우? (int)ch>=65 && (int)ch<=90
//		System.out.println("ch: "+ ch);
//		System.out.println("ch to lowerCase:"+ lowerCase);
//		System.out.println();
	}

}
