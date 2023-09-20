//	가위바위보 => 10번 => 3승 2무 5패
import java.util.Scanner;
//class A => 클래스생성법
//{
//	
//}
public class 제어문_반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int win=0,lose=0,draw=0;
		
		int i=1;
		Scanner scan=new Scanner(System.in); // new => 메모리1개에 새로운거 저장 / while문 안에 스캐너 넣어도되지만 10번반복되서 메모리10개 할당함
		
		while(i<=10) {
			System.out.println("===== "+i+"번째 게임 =====");
			int com=(int)(Math.random()*3);
			
			// 유효성 검사 => 원하는 값이 입력되게 유도
			while(true) //
			{
				System.out.print("가위(0) 바위(1) 보(2):");
				int user=0;
				user=scan.nextInt();
				if(user<0 || user>2)
				{
					System.out.println("가위바위보 입력!");
					continue; 			// 처음부터 수행이 가능
				}
				break; // 종료 // 소속반복문만제어
		
			}
			int user=0;
			System.out.print("컴퓨터:");
			if(com==0)
				System.out.println("가위");
			else if(com==1)
				System.out.println("바위");
			else if(com==2)
				System.out.println("보");
			
			System.out.print("사용자:");
			if(user==0)
				System.out.println("가위");
			else if(user==1)
				System.out.println("바위");
			else if(user==2)
				System.out.println("보");
			
			//승패결정
			int res=com-user;
			/*
			 * 	컴퓨터		사용자
			 * 가위(0)		가위(0) ==> 0
			 * 				바위(1) ==> -1 user	
			 * 				보(2) ==> -2
			 * 바위(1)		가위(0) ==> 0
			 * 				바위(1) ==> -1 user	
			 * 				보(2) ==> -2
			 * 보(2)			가위(0) ==> 0
			 * 				바위(1) ==> -1 user	
			 * 				보(2) ==> -2
			 * 
			 */		
			if(res==-1 || res==2) {
				System.out.println("사용자win");
				win++;
			}
			else if(res==1 || res==-2) {
				System.out.println("컴퓨터win");
				lose++;
			}
			else {
				System.out.println("비겼다");
				draw++;
			}
			System.out.println();
			i++;
		}
		System.out.println("========결과값========");
		System.out.println(win+"승"+lose+"패"+draw+"무");
	}

}