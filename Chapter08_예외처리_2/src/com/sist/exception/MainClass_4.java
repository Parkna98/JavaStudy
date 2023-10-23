package com.sist.exception;
/*
	throws
		=> 특정 메소드에서 발생된 예외 객체를 해당 메소드를 호출한 쪽으로 던질 수 있다.
		
		
 */
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int num1=parseInt(args[0]);
			int num2=parseInt(args[1]);
			divide(num1,num2);
		}catch(NumberFormatException e) {
			System.out.println("반드시 숫자 형식의 값을 입력하세요.");
		}catch(ArithmeticException e) {
			System.out.println("두 번째 숫자는 0이 아닌 수를 입력하세요.");
		}
	}
	private static int parseInt(String number) throws NumberFormatException {
		return Integer.parseInt(number);
	}
	
	private static void divide(int num1,int num2) throws ArithmeticException {
		System.out.println(num1/num2);
	} 
}
