// 증감연산자, 부정연산자, 형변환연산자 
import java.util.Scanner;
// 1개의 정수 입력 받아서 한개를 증가한 값을 출력하시오
public class 단항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a;
		System.out.println("정수 입력:");
		a=scan.nextInt();
		// 1개 증가
		/*
		 * ++a;
		 * a++;
		 * a=a+1
		 * a+=1
		 */
		a+=10;
		System.out.println("a="+a);
		
	}

}
