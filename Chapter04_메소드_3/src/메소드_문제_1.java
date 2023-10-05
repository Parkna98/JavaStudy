// 정수 한개를 입력받아서 홀,짝 판별
// 1.정수입력 2.홀짝 3.출력
import java.util.Scanner;
public class 메소드_문제_1 {
	
	// 정수 입력
	static int num() {
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int number=scan.nextInt();
		return number;
	}
	
	// 홀짝 판별
	static String result(int number) {
		String res="";
		if(number%2==0)
			res = "짝수";
		else
			res = "홀수";
		return res;
	}
	
	
	
	// 조립
	static void process() {
		int number=num();
		String res=result(number);
		System.out.println(res);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int num=scan.nextInt();
		
		// 홀짝
		String res="";
		if(num%2==0)
			res = "짝수";
		else
			res = "홀수";
		
		// 출력
		System.out.println(res);*/
		
		process();
	}

}
