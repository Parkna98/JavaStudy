// Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 정수의 절대값을 출력하라
import java.util.Scanner;
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		num=scan.nextInt();
		
		if(num>=0)
		{
			System.out.println(num+"의 절댓값은 "+num);
		}
		else
		{
			System.out.println(num+"의 절댓값은 "+(-num)); // 절댓값 메소드 : Math.abs(num)  
		}
	}

}
