// 5. 1~n까지 합을 구하는 메소드 구현
// 6. 두 정수를 나눗셈 결과를 구해주는 메소드 구현
import java.util.Scanner;
public class 문제5_6 {
	
	// 5.
	static int sum(int n) {
		int res=0;
		for(int i=1;i<=n;i++) {
			res+=i;
		}
		return res;
	}
	
	// 6.
	// 두 정수 입력, 나눗셈 결과 
	// 입력 메소드
	static int input(String msg) {
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		return scan.nextInt();
	}
	
	// 나눗셈 출력 메소드
	static void devide(int a,int b) {
		System.out.printf("%.2f",a/(double)b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=input("첫번쨰 ");
		int b=input("두번쨰 ");
		System.out.println("두 수의 나눗셈 결과값 출력");
		devide(a,b);
		
	}

}
