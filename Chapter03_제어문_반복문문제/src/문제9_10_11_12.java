import java.util.Scanner;
public class 문제9_10_11_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//9. 0~12까지 2의배수, 3의배수의 합을 구해라.
		int a2=0, a3=0;
		for(int i=0;i<=12;i++) {
			if(i%2==0)
				a2+=i;
			if(i%3==0)
				a3+=i;
		}
		System.out.printf("2의배수의합: %d\n",a2);
		System.out.printf("3의배수의합: %d\n",a3);
		
		//10. 1~100까지의 정수 중 4의 배수의 합계를 구하라
		int a4=0;
		for(int i=1;i<=100;i++) {
			if(i%4==0)
				a4+=i;
		}
		System.out.printf("4의배수의합: %d\n",a4);
		
//		//11. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력
//		int evencount=0;
//		Scanner scan=new Scanner(System.in);
//		for(int i=1;i<=10;i++) {
//			System.out.print("정수 입력:");
//			int num=scan.nextInt();
//			if(num%2==0) {
//				evencount++;
//			}
//		}
//		System.out.println("짝수의개수는? "+evencount);
	
		//12. 10개의 정수를 입력받아 3의배수,5의배수 개수가 몇개인지 출력
				int count3=0, count5=0;
				Scanner scan2=new Scanner(System.in);
				for(int i=1;i<=10;i++) {
					System.out.print("정수 입력:");
					int num=scan2.nextInt();
					if(num%3==0) {
						count3++;
					}
					if(num%5==0) {
						count5++;
					}
				}
				System.out.println("3의배수의개수는? "+count3);
				System.out.println("5의배수의개수는? "+count5);
		
	}

}
