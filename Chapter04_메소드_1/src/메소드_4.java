/*
 * 		리턴형 (처리 결과값 => 반드시 한개만 사용이 가능) => 여러개일 때는 배열,클래스 이용
 * 			  ------------------------------
 * 		1) 로그인 요청
 * 		   --------
 * 		   boolean => 경우의 수 2가지
 * 		   경우의 수 3가지 
 * 		   ----------- ID,PW,Login => String, int // 다른 사람이 유지보수할때 가독성이 좋으려면 주로 String 사용
 * 
 * 		2) 기본형 => int, long, double
 * 		
 * 		3) 영화 정보 요청 => class
 * 
 * 		4) 정렬 => 10 40 50 30 20 => 배열
 * 		-----------------------------------------
 * 			경우의 수....
 * 		ex) 정수 => 사칙연산
 * 			+ 	int plus(int,int)
 * 			-	int minus(int,int)
 * 			*	int multiple(int,int)
 * 			/	String divide(int,int) ==> 0으로 나눌때 오류표시를 위해 String으로 리턴값을 받는 것이 좋다
 * 	
 * 		1. 기능별로 나눠서 처리(한가지 기능만 수행)
 * 			예) 사람 <===> 자판기
 * 			   --- 행위자 (액터) => 유스케이스 다이어그램
 * 			    
 * 		2. 반복이 있는 경우
 * 		3. 다른 클래스와 연결(*******)
 */
// 사칙연산 
import java.util.Scanner;
// 1. 정수 한 개를 입력 받아서(2~9) => 구구단을 출력 ==> 출력값이 많으므로 메소드 자체에서 출력하는것이 편함(void) 

public class 메소드_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 절차적 언어 => 재사용을 할 수 없다
		Scanner scan=new Scanner(System.in);
		System.out.print("단 입력(2~9):");
		// print() => 사용자가 요청한 메세지 출력
		int dan=scan.nextInt();
		// nextInt() => 키보드로 정수값 입력 시 => 읽어서 => 메모리에 저장
		// 구구단 출력
		for(int i=1;i<=9;i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		// 프로그램 2가지 기능 => 1. 단입력 2. 단출력
	}

}
