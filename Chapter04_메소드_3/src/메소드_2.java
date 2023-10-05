// 정수를 입력 => 0~32767 => 16bit => 2진법을 출력하는 메소드
// 입력메소드, 2진법 변환메소드, 출력 => 조립
import java.util.*;

public class 메소드_2 {
	
	// 입력 
	static int userInput() {
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력(0~32767):");
		return scan.nextInt();
	}
	
	// 2진법 변환
	static int[] binarycode(int input) {
		int[] binary=new int[16];
		int index=15; // 뒷공간부터 채워넣기
		while(true) {
			binary[index]=input%2;
			input=input/2;
			if(input==0)
				break;
			index--;
		}
		return binary;
	}
	
	// 출력
	static void print(int[] binary) {
		for(int i=0; i<binary.length;i++) {
			if(i%4==0 && i!=0) {
				System.out.print(" ");
				System.out.print(binary[i]);
			}
		}
	}
	
	// 조립 
	static void process() {
		// 입력값 받기
		int num=userInput();
		// 2진법 변환
		int[] arr=binarycode(num);
		// 출력
		print(arr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		process();
	}

}
