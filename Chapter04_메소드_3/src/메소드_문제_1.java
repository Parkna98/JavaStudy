// 정수 한개를 입력받아서 홀,짝 판별
// 1.정수입력 2.홀짝 3.출력
import java.util.Scanner;
public class 메소드_문제_1 {
	// static int number; => 전역변수, 클래스 내에서 전체 사용 가능
	// 정수 입력
	static int num() {
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int number=scan.nextInt();
		return number;  // 넘기지 않아도 할수있는방법 : 전역변수 (클래스에서 변수선언)
	}
	// 앱
	// 홀짝 판별
	static String result(int number) {
		String res="";
		if(number%2==0)
			res = "짝수"; // boolean으로 잡아도되지만 출력할때 또 조건문 써야하므로 그냥 String으로 리턴값줌
		else
			res = "홀수";
		
		// return 삼항연산자
		
		return res;
	}
	
	// 출력
	
	// 조립
	static void process() {
		int number=num();
		String res=result(number);
		System.out.println(res);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process();
		
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
	}

}
