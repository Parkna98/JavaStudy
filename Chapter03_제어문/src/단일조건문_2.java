/*
 * 		정수입력을 1개 받는다
 * 		>>11
 * 		같은 숫자입니다
 * 		>>12
 * 		다른 숫자입니다
 * 
 */
import java.util.Scanner;
public class 단일조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("0~99 사이의 정수 입력:");
		int num=scan.nextInt();
		
		if(num>=1 && num<100)
		{
//			int a=num/10; // 두자리 각각 잘라서 비교할 수 있지만, 밑에 방법이 더 간단함
//			int b=num%10;
//			if(a==b)
			if(num%11==0)
			{
				System.out.println("모든자리가 같은 숫자입니다");
			}
		
			if(num%11!=0)
			{
				System.out.println("모든자리가 다른 숫자입니다");
			}
		}
		
		if(num<1 || num>99) // *****항상 예외처리 생각!!!!!
		{
			System.out.println("범위를 벗어남");
		}

	}
	
}
