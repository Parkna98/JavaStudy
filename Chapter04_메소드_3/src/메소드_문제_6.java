// => updown게임
// 1.랜덤수 추출 2.up down 하면서 맞힐때까지 입력 + 3.출력

import java.util.*;
public class 메소드_문제_6 {

	// 랜덤 추출
	static int rand() {
		int com=(int)(Math.random()*100)+1;
		return com;
	}
	
	// 입력
	static int userInput() {
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력(1~100):");
		return scan.nextInt();
	}
	
	// 힌트
	/*static void hint(int user, int com) {
		while(true) {
			if(com>user) {
				System.out.println("입력된 값보다 큰 수를 입력하세요");
				user=userInput();
			}
			else if(com<user) {
				System.out.println("입력된 값보다 작은 수를 입력하세요");
				user=userInput();
			}
			else {
				System.out.println("Game Over!!");
				break;
			}
		}	
	}*/
	
	// 힌트
	static String hint2(int user, int com) {
			String res="";
			if(com>user) {
				res="입력된 값보다 큰 수를 입력하세요";
			}
			else if(com<user) {
				res="입력된 값보다 작은 수를 입력하세요";
			}
			else {
				res="종료";
			}
			return res;
		}	
	
	// process()에 while문을 돌리는 것도 방법
	// while문은 밖에서 돌려야한다
	static void process() {
		int com=rand();
		Scanner scan=new Scanner(System.in);
		while(true) {
			int user=userInput();
			String h=hint2(user,com);
			System.out.println(h);
			if(h.contains("종료")){
				System.out.print("게임을 다시 할까요(y|n):");
				char c=scan.next().charAt(0);
				if(c=='y'||c=='Y') {
					System.out.println("새로운 게임을 시작합니다");
					process();
				}
				else {
					System.out.println("게임종료!!");
					System.exit(0);
				}
			}
		}
	}
	
	// process()
//	static void process() {
//		int com=rand();
//		hint(userInput(),com);
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		
		// 컴퓨터가 숫자 추출
		/*int com=(int)(Math.random()*100)+1;
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("정수 입력(1~100):");
			int user=scan.nextInt();
			if(com>user) {
				System.out.println("입력된 값보다 큰 수를 입력하세요");
			}
			else if(com<user) {
				System.out.println("입력된 값보다 작은 수를 입력하세요");
			}
			else {
				System.out.println("Game Over!!");
				break;
			}
		}*/
	}

}
