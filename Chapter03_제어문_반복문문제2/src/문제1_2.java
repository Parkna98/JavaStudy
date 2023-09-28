/* 
 * => 조건문
 * 	단일조건문/선택조건문/다중조건문 => 형식, 순서
 * 					------(별점, 이미지와 연계)
 * 	-----------------------
 * 	연산자 => 어떤 연산자 => 결과값?
 * 	--------비교연산자, 논리연산자, 부정연산자 (조건문에 쓰이는 연산자)
 * 	단일조건문
 * 	-------
 * 		if(조건문) ==> 오류(예외 처리) => 사전에 오류방지 ( ex) ID 중복체크, 값 입력 유도(NULL값 방지) )
 * 		{
 * 			조건이 true일때만 수행
 * 		}
 * 		=> 수행 => 건너뛴다
 * 
 * 	선택조건문 ==> 선택 2개중 하나, true/false ====> 삼항연산자 (서로 바꿀수있어야함)
 * 	-------
 * 		if(조건문) 
 * 		{
 * 			// 사용자, 회원 ==> 마이페이지 ==> 예약기능
 * 			조건문이 true일 때 수행
 * 		}
 * 		else
 * 		{
 * 			// 관리자, 게스트 ==> 관리자페이지 ==> 예약관리기능
 * 			조건문이 false일 때 수행
 * 		}
 * 
 * 	다중조건문 ==> 조건에 맞는 문장만 수행 ====> switch case (서로 바꿀수있어야함)
 * 	-------
 * 		if(조건문) 
 * 		{
 * 			조건문이 true일 때 수행 => 종료
 * 			false일 때 밑에 조건문을 찾는다
 * 		}
 * 		else if(조건문) 
 * 		{
 * 			조건문이 true일 때 수행 => 종료
 * 			false일 때 밑에 조건문을 찾는다
 * 		}
 * 		else 
 * 		{
 * 			해당 조건이 없는 경우에 처리되는 문장
 * 		}
 * 	===========================================
 * 	선택문
 * 	switch(정수, 문자, 문자열) => 실수 불가
 * 					------
 * 	{
 * 		case 값: 
 * 			처리문장
 * 			break;
 * 		case 값2:
 * 		...
 * 		...
 * 		default:
 * 			처리문장  ==> default 생략가능 ==> ex) 키보드 입력받을때 잘못입력시 해당키 제외한 모든 키 default 
 * 	}
 * 			
 *
 */

import java.util.Scanner;
public class 문제1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
		//   십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.
		Scanner scan=new Scanner(System.in);
		System.out.print("2자리 정수 입력(10~99):");
		//BufferedReader 쓰면 편하지만, io를 배우고 예외처리도 해줘야함
		int num=scan.nextInt();
		
		if(num%11==0) {
			System.out.println("10의 자리와 1의 자리가 같습니다.");
		}
		else {
			System.out.println("10의 자리와 1의 자리가 다릅니다.");
		}
		
		//2. 숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울,
		// 그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라. 
		// if-else 문과 switch 둘 다 이용해 볼 것.
//		Scanner input=new Scanner(System.in);
//		System.out.print("달을 입력하세요(1~12):");
//		int month=input.nextInt();
//			if(month>=3 && month<=5) {
//				System.out.print("봄");
//			}
//			else if(month>=6 && month<=8) {
//				System.out.println("여름");
//			}
//			else if(month>=9 && month<=11) {
//				System.out.println("가을");
//			}
//			else if(month==1 || month==2 || month==12) {
//				System.out.println("겨울");
//			}
//			else {
//				System.out.print("잘못입력되었습니다");
//			}

		//2-1. switch case
		Scanner input=new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12):");
		int month=input.nextInt();
		switch(month) {
		case 1: case 2: case 12:
			System.out.println("겨울");
			break;
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		default :
			System.out.println("잘못입력되었습니다");
		}
			
	}
	

}
