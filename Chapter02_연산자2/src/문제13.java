import java.util.Scanner; // 본문에 Scanner치고 Ctrl Space 누르면 import 자동으로 달아줌

public class 문제13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in); // Scanner + Ctrl Space
		System.out.println("세개 정수 입력(1 2 3):");
		int a=scan.nextInt(); // nextInt() => 입력받은 데이터 각각 저장
		int b=scan.nextInt();
		int c=scan.nextInt();
		System.out.println(a*b+c);
	}

}
