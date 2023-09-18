// 1. Scanner 클래스를 이용하여 한 개의정수를 입력 받아 양수인지 음수인지 출력
import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		num=scan.nextInt();
		
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
