/*
 * 		변수의 초기화
 * 		1) 변수 추출
 * 		2) 변수 선언 (데이터형)
 * 		3) 변수 초기화
 * 			= 명시적인 초기화
 * 				int a=10;
 * 			= 입력값 
 * 				***Scanner : 키보드 입력값을 받을 때 사용
 * 				BufferedReader : 기능을 동일 (단점;예외처리)
 * 			= 임의값을 받아서 초기화
 * 			  ------랜덤
 * 			= 크롤링 
 * 
 */
import java.util.Scanner; // import => java에서 필요한 class 갖고오기
public class 변수의초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=100;
		int b=(int)(Math.random()*100); //math.random()은 double을 갖고오기때문에 int b와 충돌
		// 0.0 and less than 1.0 => int로 random을 변환하면 0밖에 안나옴 (소수점 버리기때문에) (그래서 100을 곱해주면 0~99숫자나옴)
		Scanner scan=new Scanner(System.in);
		//		 키보드 입력값	
		System.out.print("정수 입력:");
		int c=scan.nextInt();
		System.out.println(c);	*/
		int a = 10;
		int b = 20;
		// a=10, b=20
		int temp=a; // 값 교환하기 위한 임시변수(temp) 설정, 나중에 정렬을 위해 자주사용
		a=b; // a=20;
		b=temp; // b=10;
	}	
	
}
