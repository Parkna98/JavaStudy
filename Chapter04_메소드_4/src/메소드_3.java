// 숫자야구게임
import java.util.Arrays;
import java.util.Scanner;
/*
 * 		1. 임의의 난수발생 => []
 * 		2. 사용자가 입력
 * 		3. 힌트
 * 		4. 종료여부
 * 		5. 조립
 */
public class 메소드_3 {
	
	// 임의의 난수발생(같은숫자없이)
	static int[] com() {
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
	static int[] user() {
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
	static int hint(int[] com, int[] user) // hint는 출력만하고 리턴값으로 s값을 받아서 종료여부에서 s==3일때 이용 
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
		////////////////////////////////////////////
		return s;
	}
	// 힌트출력
	
	// 종료여부 ==> 리턴값 boolean
	static void endgame(String hint) {
		if(hint.contains("3S")) {
			System.out.println("Game Over!!");
		}
	}
	
	// 조립
	static void process() {
		int[] com=com();
		int[] user=user();
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 임의의 난수 발생
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
		// System.out.println(Arrays.toString(com));
		// 사용자 요청
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
		
		// hint 제공
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
		System.out.printf("Input Number:%d,Result:%dS-%dB\n",input,s,b);
		
		// 종료 여부 확인
		if(s==3) {
			System.out.println("Game Over!!");
			break; // 종료
		}
		
		}
	}

}
