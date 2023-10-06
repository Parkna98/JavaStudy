/*		
 * 		1. 임의의 난수발생 => com[]
 * 			리턴=> int[], 매개변수X
 * 		2. 사용자가 입력 => user[]
 * 			리턴=> int[], 매개변수X
 * 		3. 힌트 => (com[],user[]) => s,b 추출 => return int s (종료여부확인)
 * 			리턴 => int s, 매개변수(com[], user[])
 * 		4. 종료여부 => s
 * 			리턴 => boolean, 매개변수 int s
 * 		5. 조립
 * 			리턴X 매개변수X
 * 		
 *		 
 */
import java.util.*;

public class 메소드_3_메소드변경 {
	
	// 숫자중복없는 3자리수 생성
	static int[] com()
	{
		int[] com=new int[3];
		for(int i=0;i<com.length;i++) {
			com[i]=(int)(Math.random()*9)+1;
			//           ----------------0~0.81
			//	   -----0~8
			//							----1~9
			for(int j=0;j<i;j++) {
				if(com[i]==com[j]) {
					i--;  // 숫자 중복시 다시발생
					break;
				}
			}
		}
		return com;
	}
	
	// 사용자 입력
	static int[] userInput()
	{
		int[] user=new int[3]; // com,user
		Scanner scan=new Scanner(System.in);
		while(true) // 무한루프 ==> 종료여부확인 : 정답일때까지 
		{
			System.out.print("세자리 정수 입력:");
			int input=scan.nextInt();
			if(input<100 || input>999) {
				System.out.println("잘못된 입력입니다");
				continue;
				// => for(증가식으로 이동), while(조건식으로 이동)
				// => 처음부터 실행 => while
				// => 제외 => for문
			}
			// 배열에 숫자를 저장
			user[0]=input/100;      // 백의자리
			user[1]=(input%100)/10; // 십의자리
			user[2]=input%10;		// 일의자리
			
			// 오류 처리
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) {
				System.out.println("같은 숫자는 사용할 수 없습니다");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				System.out.println("0은 사용할 수 없습니다");  // 087 061... => 오류
				continue;
			}
			break;
		}
		return user;
	}
	
	// 힌트
	static int hint(int[] com, int[] user)
	{
		int s=0,b=0;
		for(int i=0;i<3;i++) // com 
		{
			for(int j=0;j<3;j++) // user
			{
				if(com[i]==user[j]) // 같은 수가 있는지 확인
				{
					if(i==j) 
						s++; // 같은 자리수
					else
						b++; // 다른 자리수
				}
			}
		}
		// 힌트 출력
		System.out.printf("Input Number:%d%d%d,Result:%dS-%dB\n",user[0],user[1],user[2],s,b);
		print(s,b);
		return s;
	}
	
	// 종료 여부
	static boolean isEnd(int s) {
		boolean bCheck=false;
		if(s==3)
			bCheck=true;
		return bCheck;
	}
	
	/*
	 *  	S:●●●  
	 */
	static void print(int s, int b) {
		System.out.println("=============== 전광판 ================");
		System.out.print("S:");
		for(int i=1;i<=s;i++) {
			System.out.print("●");
		}
		System.out.print("\nB:");
		for(int i=1;i<=b;i++) {
			System.out.print("○");
		}
		System.out.println("\n====================================");
	}
	
	// 조립
	static void process() {
		int[] com=com();
		int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		while(true) {
			user=userInput();
			int s=hint(com,user);
			if(isEnd(s)) {
				System.out.print("게임을 다시 할까요?(y|n):");
				char c=scan.next().charAt(0);
				if(c=='y'||c=='Y') {
					System.out.println("=== 새게임을 시작합니다 ===");
					process(); // 재귀호출 => 메소드에서 메소드를 다시호출해서 처음부터시작
				}
				else {
					System.out.println("Game Over!!");
					break;
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
