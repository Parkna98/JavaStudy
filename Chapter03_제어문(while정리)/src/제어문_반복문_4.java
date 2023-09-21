/*
 * 	객체지향 => 재사용/유지보수 => 대표적인 예) 메소드 (random()) => 이미 만들어진 메소드 (라이브러리) 
 * 	절차적 언어 => 재사용불가 => 작은 계산기 같은것들 (컴퓨터는 수리, 교체가능 // 계산기는 고장나면 버림)
 */
// do~while 
// updown~game ==> 단점 : 
import java.util.Scanner;
public class 제어문_반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int com=(int)(Math.random()*100)+1;
		
		do {
			System.out.print("정수 입력(1~100):");
			int user=scan.nextInt();
			
			if(com>user) {
				System.out.println("입력값보다 큰수를 입력하세요");
			}
			else if(com<user) {
				System.out.println("입력값보다 작은수를 입력하세요");
			}
			else {
				System.out.println("정답입니다");
				System.exit(0);
			}
		} while(true);
		
	}

}
