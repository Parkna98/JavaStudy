// 정수 1개를 받아서 해당 구구단
import java.util.Scanner;
public class 제어문_반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan;
		// 초기화 (명시적(값 대입) / 입력값 / 임의의 난수 / 파일 / 오라클)
		Scanner scan=new Scanner(System.in);
		System.out.print("단 입력:");
		dan=scan.nextInt();
		
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%2d * %2d = %2d\n",dan,i,dan*i); // 정수입력은 %d 하고 해당값 순서대로 콤마
																// %2d는 2칸만큼 오른쪽정렬한다고 생각 %3d %4d 
		}
	}

}
