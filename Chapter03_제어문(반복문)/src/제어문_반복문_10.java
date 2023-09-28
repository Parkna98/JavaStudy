import java.util.Scanner;
// 사용자가 정수 1개 입력 => 입력받은 수까지의 합을 출력 
public class 제어문_반복문_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		num=scan.nextInt();
		
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum+=i;
		}
		
		System.out.println("1~"+num+"까지의 합:"+sum);
		// 큰 수 입력했는데 결과값 음수나옴 why???
		
		
		
	}

}
