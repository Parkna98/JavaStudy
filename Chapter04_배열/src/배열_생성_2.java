// 문자 => 10개를 저장하는 배열생성 => 초기화 => 출력
// 		  ---------
// 실수 배열 ==> double[] arr={10,20,30,40,50}
//				=> 10.0, 20.0, 30.0 ....
// double[] arr=new double[10] ==> 0.0으로 초기화
// char[] arr=new char[10] ==> '\0'
// boolean[] arr=new boolean[10] ==> false
// String[] arr=new String[10] ==> null (모든 클래스는 null (주소값이 없다))
// index를 이용하는 프로그램
/*
 * 		int[] arr=new int[3];
 * 
 * 		---------------------
 * 			0  ㅣ  0   ㅣ  0
 * 		---------------------
 *  	arr[0]  arr[1] arr[2] => 변수명이라고 생각하면 됨 (인덱스 번호로 변수를 구분)
 *  								** 주의:동일한 데이터형을 묶어야함
 */

import java.util.Arrays;

public class 배열_생성_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha=new char[10];
		// char a,b,c....
		// alpha[0],....,alpha[9]
		// 초기화
		for(int i=0;i<alpha.length;i++) // 조건에 length를 사용해야 배열의 크기가 변경되어도 자동으로 수정
		{
			alpha[i]=(char)((Math.random()*26)+65);  // 배열에 10개 채우기 => 변수10개설정하는 것보다 효율적
		}
		// alpha={'A','B','C'....}
		// 출력 => for-each ==> 출력용!(제어용아님)
		System.out.println("===== for-each:실제 저장된 값을 읽어오는 기능=====");
		for(char c:alpha) // ***for-each 구문 (index값이 아닌 실제값들고옴)(배열과 컬렉션에서만 쓰임)
		{
			System.out.print(c+" ");
		}
		// 출력전용
		
		System.out.println("\n===== for(일반):index이용 =====");
		// 값을 변경,초기화
		for(int i=0;i<alpha.length;i++) {
			System.out.print(alpha[i]+" "); // 
		}
		System.out.println("\n====== API ======");
		Arrays.sort(alpha); // 정렬기능 (오름차순)
		System.out.println(Arrays.toString(alpha));
		for(int i=alpha.length-1;i>=0;i--) // 내림차순 
		{
		System.out.print(alpha[i]+" "); 
		}
	
	}

}
