import java.util.Scanner;
public class 문제1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
		//   십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.
//		Scanner scan=new Scanner(System.in);
//		System.out.print("2자리 정수 입력(10~99):");
//		int num=scan.nextInt();
//		
//		if(num%11==0) {
//			System.out.println("10의 자리와 1의 자리가 같습니다.");
//		}
//		else {
//			System.out.println("10의 자리와 1의 자리가 다릅니다.");
//		}
		
		//2. 숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울,
		// 그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라. 
		// if-else 문과 switch 둘 다 이용해 볼 것.
//		Scanner input=new Scanner(System.in);
//		System.out.print("달을 입력하세요(1~12):");
//		int month=input.nextInt();
//			if(month>=3 && month<=5) {
//				System.out.print("봄");
//			}
//			else if(month>=6 && month<=8) {
//				System.out.println("여름");
//			}
//			else if(month>=9 && month<=11) {
//				System.out.println("가을");
//			}
//			else if(month==1 || month==2 || month==12) {
//				System.out.println("겨울");
//			}
//			else {
//				System.out.print("잘못입력되었습니다");
//			}

		//2-1. switch case
		Scanner input=new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12):");
		int month=input.nextInt();
		switch(month) {
		case 1: case 2: case 12:
			System.out.println("겨울");
			break;
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		default :
			System.out.println("잘못입력되었습니다");
		}
			
	}
	

}
