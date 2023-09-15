/*
 * 문제1. 정수 한 개를 입력받아서, 그 수가 50이상의 수인지 
 * 		 -------변수확인			  --------- 조건
 * 		50미만의 수인지 판단해보자.
 * 		---------조건
 */
import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		
		if(num>=50) // 50이상의수
		{
			System.out.println(num+"은(는) 50이상입니다");
		}
		if(num<50) // 50미만의수
		{
			System.out.println(num+"은(는) 50미만입니다");
		}
	}

}
