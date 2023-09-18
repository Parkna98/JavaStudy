// 사칙연산
// 정수 2개 => 연산자 (문자열)
// 정수 3개 => 1개 결과값
import java.util.Scanner;
public class 선택문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;  // 입력받는 값이라 초기값 필요없지만
		int result=0;    // switch문에서 연산되는 값이기 때문에 반드시 초기화가 필요함.
		Scanner scan=new Scanner(System.in);
		// 초기화 
		System.out.print("정수1 입력:");
		num1=scan.nextInt();
		
		System.out.print("정수2 입력:");
		num2=scan.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/)");
		switch(scan.next())
		{
		case "+": // str값 받았으므로 case도 str으로! ""(O) ''(x) 
			result=num1+num2;
			break;
		case "-":
			result=num1-num2;
			break;
		case "*":
			result=num1*num2;
			break;
		case "/":
			result=num1/num2;
			break;				// break를 다 없앤다면, 값을 10,2,- 넣었을때 결과는 5 => break가 없어서 맨마지막까지 감
		default:
			System.out.println("잘못된 입력입니다.");
		}
		
		System.out.println("계산결과값:"+result);
		
	}

}
