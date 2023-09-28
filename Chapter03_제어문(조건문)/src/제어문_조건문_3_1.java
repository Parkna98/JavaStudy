//	정수 2개 입력, 연산자 (+,-,*,/) => 연산처리 (4칙연산)
// 	다중조건문
/*
 * 		if(op=='+')
 * 		else if(op=='-')
 * 		else if(op=='*')
 * 		else if(op=='/')
 * 		else (다른연산자 입력시 잘못된 연산입니다)
 * 
 */
import java.util.Scanner;
public class 제어문_조건문_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 명시적 초기화
		int num1=0, num2=0;
		char op=' ';
		
		// 사용자의 입력
		// 사용자의 요청에 따라 결과값을 출력 (가공) = 연산자, 제어문
		//									============ 메소드
		// ---------------------------------- 재사용
		Scanner scan=new Scanner(System.in);
		System.out.print("정수1 입력:");
		num1=scan.nextInt();
		System.out.print("정수2 입력:");
		num2=scan.nextInt();
		System.out.print("연산자 입력(+,-,*,/):");
		op=scan.next().charAt(0);
		
		if(op=='+')
			System.out.println(num1+"+"+num2+"="+(num1+num2)); // 문장이 1개일 경우 굳이 블럭{} 하지 않아도됨. 2개이상이면 {}
		else if(op=='-')
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		else if(op=='*')
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		else if(op=='/') // 0으로 나눌 경우 오류 발생
		{
			if(num2==0)
				System.out.println("0으로 나눌 수 없습니다");
			else
				System.out.println(num1+"/"+num2+"="+(num1/num2));	
		}
		else
			System.out.println("잘못된 연산자 입니다");
		
	}

}
