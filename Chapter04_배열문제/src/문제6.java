import java.util.Scanner;
import java.util.Arrays;
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5-1. 5개 정수를 입력받은 후 차례로 출력
		//	입력예) 5 10 9 3 2
		//  출력예) 5 10 9 3 2
		
//		int[] q1=new int[5];
//		Scanner scan=new Scanner(System.in);
//		for(int i=0;i<q1.length;i++) {
//			System.out.print("정수입력:");
//			int num=scan.nextInt();
//			q1[i]=num;
//		}
//		//출력
//		for(int a1:q1) {
//			System.out.print(a1+" ");
//		}
		
		// 5-2. 문자 10개를 저장할 수 있는 배열을 선언하고 
		//      10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램
		// 입력예) A B C D E F G H I J
		// 출력예) ABCDEFGHIJ
//		char[] q2=new char[10];
//		Scanner scan2=new Scanner(System.in);
//		for(int i=0;i<q2.length;i++) {
//			System.out.print("문자입력:");
//			char ch=scan2.next().charAt(0);
//			q2[i]=ch;
//		}
//		//출력
//		for(char a2:q2) {
//			System.out.print(a2);
//		}
		
		// 5-3. 정수 10개를 입력받은 후
		// 세번째, 다섯번쨰와 마지막으로 입력받은 정수를 차례로 출력하는 프로그램
		// 입력예) 5 3 9 6 8 4 2 8 10 1
		// 출력예) 9 8 1
		
		int[] q3=new int[10];
		Scanner scan3=new Scanner(System.in);
		for(int i=0;i<q3.length;i++) {
			System.out.print("정수입력:");
			int num=scan3.nextInt();
			q3[i]=num;
		}
		//출력
		for(int a3:q3) {
			System.out.print(a3+" ");
		}
		System.out.println("\n세번째값:"+q3[2]);
		System.out.println("다섯번째값:"+q3[4]);
		System.out.println("마지막값:"+q3[9]);
		
		Arrays.sort(q3);
		System.out.println("가장큰수:"+q3[0]);
	}

}
