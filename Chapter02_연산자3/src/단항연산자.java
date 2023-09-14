// 증감연산자, 부정연산자, 형변환연산자 
import java.util.Scanner;
// 1개의 정수 입력 받아서 한개를 증가한 값을 출력하시오
public class 단항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scan=new Scanner(System.in); int a; System.out.println("정수 입력:");
		 * a=scan.nextInt();
		 */
		// 1개 증가
		/*
		 * ++a;
		 * a++;
		 * a=a+1
		 * a+=1
		 */
		//a+=10;
		/*
		 * int b=a++ - ++a; System.out.println("a="+a); System.out.println("b="+b);
		 */ 
		/*
		 * System.out.println("===== 부정연산자 ====="); boolean bCheck=true;
		 * System.out.println("변경전:"+bCheck); bCheck=!bCheck;
		 * System.out.println("변경후:"+bCheck); boolean aa=true; while(true) // 2명이서는
		 * true/false로 번갈아가기, 3명이상이면 %활용해서 번갈아가기 { aa=!aa; if(aa==true) {
		 * System.out.println("사용자"); } else { System.out.println("컴퓨터"); } break; }
		 */
		int a=1;
		while(a==3);
			{ a++;
				if(a%3==1) {
					System.out.println("플레이어1");
					
				}
				if(a%3==2) {
					System.out.println("플레이어2");
				}
				else {
					System.out.println("플레이어3");
				}
			
			}
	}

}
