/*
 * 사용자로 부터 정수를 입력받아서 양수인지 음수인지 확인하는 프로그램
 */
import java.util.Scanner;
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		
		if(num>0)  //  cf) 자바에서는 0을 음수로 간주함. 
		{
			System.out.println(num+"는(은) 양수입니다"); 
		}
		if(num<0)
		{
			System.out.println(num+"는(은) 음수입니다");
		}
		if(num==0)
		{
			System.out.println(num+"는(은) 0입니다");
		}
		
//		System.out.println((num==0)?"0":(num>0?"양수":"짝수"));
		// 삼항연산자를 2번쓰면 한줄로 코딩 가능
	}
}
