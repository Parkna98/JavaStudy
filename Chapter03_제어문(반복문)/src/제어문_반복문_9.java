/*
 * 		updown 게임
 * 		----------
 * 			컴퓨터 난수 발생 : 1~100
 * 			---------------------
 * 			=> 힌트 up & down
 * 				=> 정답이 나올때까지 반복수행
 * 				   ------------------- 무한루프
 * 					for(;;) => while(true)
 */
import java.util.Scanner;
// import java.lang.* => 시스템에서 자동으로 추가되는 라이브러리 => random() string[] System 등등 다포함
//                       메소드( ~main)가 끝날때 return; 있어야하지만, 컴파일시 없으면 자동으로 추가되기때문에 쓰지않는것. 
public class 제어문_반복문_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 난수 발생
		int com=(int)(Math.random()*100)+1;
		// 종료 => break, System.exit(0)
		Scanner scan=new Scanner(System.in);
		int count=0;
		for(;;) // 무한루프 ==> 종료문구 있어야함!! => break; System.exit(0);
		{
			System.out.print("1~100사이의 값 입력:");
			int num=scan.nextInt();
			count++;
			if(num<1 || num>100)
			{
				System.out.println("잘못된 입력입니다!");
				continue; // 문장수행하고 다시 처음으로 돌아가게 하는 명령어
			}
			else if(num==com) // 정답
			{
				System.out.println("정답입니다");
				System.out.println("입력횟수:"+count);
				System.exit(0); // 프로그램 종료
			}
			// hint
			else if(num>com)
			{
				System.out.println("숫자가 더 작습니다(DOWN)");
			}
			else
			{
				System.out.println("숫자가 더 큽니다(UP)");
			}
				
		}
		
	}

}
