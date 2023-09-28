// 2. 한 개의 정수를 입력 받아 3의 배수인지 판별하여 출력하라
// if : 3의 배수 ~ else 3의 배수가 아닌경우
import java.util.Scanner;
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		num=scan.nextInt();
		
		if(num%3==0)
			System.out.println(num+"는(은) 3의 배수입니다"); // 한줄짜리는 {} 안해도됨. 가독성을 위해 하는것이 좋음
		else
			System.out.println(num+"는(은) 3의 배수가 아닙니다");
	}

}
