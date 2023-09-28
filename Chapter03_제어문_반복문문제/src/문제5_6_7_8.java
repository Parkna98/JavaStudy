import java.util.Scanner;
public class 문제5_6_7_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5. 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 
	    // 출력하는 프로그램을 작성하시오
//		for(int i=1;i<=6;i++) {
//			for(int j=1;j<=6;j++) {
//				if(i+j==6) {
//					System.out.println("["+i+","+j+"]");
//				}
//			}
//		}
		// 6. 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서
		// 끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오
		int res=1;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째정수입력:");
		int num1=scan.nextInt();
		
		System.out.print("두번째정수입력:");
		int num2=scan.nextInt();
		
		if(num2<num1) {
			int temp=num2;
			num2 = num1;
			num1 = temp;
			
		}
		
		for(int i=num1;i<=num2;i++) {
			res*=i; // 곱이기 때문에 res=0이 아닌 res=1로 초기화!
		}
		System.out.println("결과는?"+res);
		
//		7.5~16까지의 합을 구하시오
		int sum=0;
		for(int i=5;i<=16;i++) {
			sum+=i;
		}
		System.out.println("5~16까지의 합은 "+sum);
	
		// 8. 3이상 4462 이하에서 짝수인 정수의 합을 구해라
		int even=0;
		for(int i=4;i<=4462;i+=2) {
			even+=i;
		}
		System.out.println("3이상 4462이하에서 짝수인 정수의 합은 "+even);
	}
	

}
