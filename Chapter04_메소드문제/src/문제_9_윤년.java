/* 3.   년도를 입력 받아 윤년여부를 확인하는 프로그램 작성
		년도 입력 메소드
		윤년 처리 
		출력     */
import java.util.Scanner;
public class 문제_9_윤년 {
	
	// 년도 입력 메소드
	static int yearInput() {
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		return scan.nextInt();
	}
	
	// 윤년 처리
	static String yCheck(int year) {
		boolean bCheck=false;
		if((year%4==0 && year%100!=0) || year%400==0) {
			bCheck=true;
		}
		return bCheck?"윤년입니다":"윤년이 아닙니다";
	}
	
	// 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=yearInput();
		System.out.println(year+"년은 "+yCheck(year));
	}

}
