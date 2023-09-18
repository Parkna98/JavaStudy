/*
 * 		컴퓨터 vs 플레이어 => 가위바위보
 * 		-------------------------
 * 		=> 다중 조건문 => 경우의 수 9개
 * 						-------조건문
 * 			컴퓨터		플레이어
 * 			 가위	(2)		 가위(2)		0
 * 						 바위(1)		1
 * 						 보(0)		2
 * 			 바위(1)		 가위(2)		-1
 * 						 바위(1)		0
 * 						 보(0)		1
 * 			 보(0)		 가위(2)		-2
 * 						 바위(1)		-1
 * 						 보(0)		0
 * 			---------------------------- 
 * 			=> 중첩 if ==> 55page
 * 			  --------
 * 				 로그인 상태
 * 			  if(조건문) ==> 한개의 조건문
 * 			  {
 * 				  if(조건문) // 관리자
 * 				  {
 * 
 * 				  }
 * 				  if(조건문) // 사용자
 * 				  {
 * 
 * 				  }
 * 			  }
 * 			  else
 * 			  {
 * 			  	  Guest라면
 * 			  }
 * 			
 * 
 */
import java.util.Scanner;
public class 제어문_조건문_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com, user;
		com = (int)(Math.random()*3);
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(2), 바위(1), 보(0):");
		user=scan.nextInt();
		// 가공
		System.out.print("컴퓨터:");
		if(com==2)
			System.out.println("가위");
		else if(com==1)
			System.out.println("바위");
		else if(com==0)
			System.out.println("보");
		// 다음줄에 출력
		System.out.print("사용자:");
		if(user==2)
			System.out.println("가위");
		else if(user==1)
			System.out.println("바위");
		else if(user==0)
			System.out.println("보");
		
		int res=com=user;
		if(res==2 || res==-1)
		{
			System.out.println("Com Win");
		}
		else if(res==-2 || res==1)
		{
			System.out.println("User WIn");
		}
		else
		{
			System.out.println("Draw");
		}
		// 결과값
		/*		com-user
		 * 		com == 2(가위)	
		 * 			user = 2 	0 
		 * 			user = 1	1
		 * 			user = 0	2
		 * 		com == 1(바위)
		 * 			user = 2	-1
		 * 			user = 1	0
		 * 			user = 0	1
		 * 		com == 0(보)
		 * 			user = 2	-2
		 * 			user = 1	-1
		 * 			user = 0	0
		 * 
		 * 		com-user = 0 => 비김
		 * 		com-user = 2,-1 => com win
		 * 		com-user = 1,-2 => user win
		 *
		 */
	/* 	if (com==2) // 컴퓨터가 가위일 경우
		{
			if(user==2)
			{
				System.out.println("비겼다");
			}
			else if(user==1)
			{
				System.out.println("사용자 Win");
			}
			else if(user==0)
			{
				System.out.println("컴퓨터 Win");
			}
		}
		else if (com==1) // 컴퓨터가 바위일 경우
		{
			if(user==2)
			{
				System.out.println("컴퓨터 Win");
			}
			else if(user==1)
			{
				System.out.println("비겼다");
			}
			else if(user==0)
			{
				System.out.println("사용자 Win");
			}
		}
		else if (com==0) // 컴퓨터가 보일 경우
		{
			if(user==2)
			{
				System.out.println("사용자 Win");
			}
			else if(user==1)
			{
				System.out.println("컴퓨터 Win");
			}
			else if(user==0)
			{
				System.out.println("비겼다");
			}
		}
	 */
	}

}
