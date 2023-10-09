// 메소드_4_구현 
/*	
 * 		리턴형 / 매개변수 / 메소드명 => 가독성있게...
 * 		첫번째기능 => 단입력
 * 		두번째기능 => 구구단출력
 */
import java.util.Scanner;
public class 메소드_4_구현 {
	// 사용자로부터 정수를 받는다(입력)
	// static => 자동저장
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("단 입력(2~9):");
		//int dan=scan.nextInt();
		return scan.nextInt();
	}
	
	// 받은 정수에 해당되는 구구단 출력
	/* static String gugudan(int dan) 
	{
		String result=dan+"단\n";
		for(int i=1;i<=9;i++) {
			result+=dan+"*"+i+"="+dan*i+"\n";
		}
		return result;
	} */
	// 위의 메소드와 같은결과를 가져오지만, 다른 방법 => 메소드 내에서 출력
	static void gugudan(int dan)
	{
		System.out.println(dan+"단");
		for(int i=1;i<=9;i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
	}
	
	// 조립기
	static void process() 
	{
		int dan=userInput();
		//String gu=gugudan(dan);
		//System.out.println(gu);
		gugudan(dan);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process(); // 객체 지향 프로그램 => 기능별로 나눠서 코딩 => 조립기 => main에서는 조립기만 호출 => 다른 파일에서 재사용가능
		
		
	}

}
