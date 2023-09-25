// 응용
// => 정수를 1개 입력 받아서 => 이진법 출력
// 32bit => 0,1 
// 16bit(0~32767) => 양수
// 2진법이라 15번부터 채워나갈것 => 항상 0번부터 채우는것은 아님, 뒤에서부터 채울경우도 있음
/*
 * 	10
 * 	0000 0000 0000 1010
 */
import java.util.Scanner;
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] binary=new int[16]; // 초기값:0
		int index=binary.length-1; // 마지막 index번호
		
		// 역순으로 값을 배치
		Scanner scan=new Scanner(System.in);
		System.out.print("0~32767사이의 정수 입력:");
		int num=scan.nextInt();
		System.out.println("====== Library ======");
		System.out.println(Integer.toBinaryString(num));
		
		while(true) {
			binary[index]=num%2;
			num=num/2; // 1/2=0
			if(num==0) break;
			index--;
		}
		// 출력
		for(int i=0;i<binary.length;i++) {
			if(i%4==0 && i!=0) // i!=0 => 0이면 4로나누고 나머지 0이므로 처음부터 한칸띄고 시작
				System.out.print(" ");
			System.out.print(binary[i]);
		}
		
	}

}
