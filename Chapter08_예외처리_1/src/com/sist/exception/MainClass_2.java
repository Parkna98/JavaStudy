package com.sist.exception;
// 예외처리의 기본(267page)
/*
 * 		가장 많이 사용된다 => 예외복구
 * 		try~catch~finally
 * 		1) 형식
 * 			try
 * 			{
 *				에러없이 실행이 가능한 소스
 *				// main ==> 정상수행하는 문장 => 개발자 실수, 사용자의 입력 
 * 			}catch(Exception ex) => Exception: 모든에러를 잡아주는 최상위클래스
 * 			{
 * 				예외복구 ==> 다시 입력 요청 => 다음 문장으로 이동
 * 			} ==> catch는 예상되는 예외를 따로 처리 => 여러개 사용이 가능

		2) 동작 흐름
			문장 1
			문장 2
			try ==> 전체/부분 => 에러가 발생할 수 있는 부분
			{
				문장 3
				문장 4
				문장 5
			}catch(Exception e)
			{
				문장 6
			}
			문장 7
			문장 8
			=> 문장1 => 문장2 => 문장3 => 문장4 => 문장5 => 문장7 => 문장8  (문장6(catch절)은 에러없으면 건너뜀)
			------------------------------------------------------
			문장 1
			문장 2
			try ==> 전체/부분 => 에러가 발생할 수 있는 부분
			{
				문장 3
				문장 4 ==> 에러 발생 int a=10/0; ==> 에러 무시하고 catch로 이동
				문장 5
			}catch(Exception e)
			{
				문장 6 (문장3으로 돌아가라 같은 명령도 가능)
			}
			문장 7
			문장 8
			=> 1 => 2 => 3 => 6 => 7 => 8
			------------------------------------------------------
			문장 1
			문장 2 ==> 에러 발생
			try ==> 전체/부분 => 에러가 발생할 수 있는 부분
			{
				문장 3
				문장 4 ==> 에러 발생 ==> catch로 이동 => 다음문장 수행불가
				문장 5
			}catch(Exception e)
			{
				문장 6 ==> 복구 => 문장3으로 이동해라 명령 => 문장3
			}
			문장 7
			문장 8
			=> 1 => 프로그램 종료(비정상종료) (문장2에서 에러발생인데 예외처리를 안한부분에서 발생)
			
			try ==> 정상으로 수행하는 문장
					=> 개발자 실수, 사용자 입력값 : 에러 발생
					   						-------
					   						  ㅣ 종료 => 건너뛰어서 수행(종료방지) => catch
			*** 수행문장에 이상이 없는 경우(에러가 없는경우)
				try{ 소스 } 만 수행
			*** 수행문장에 이상이 있는 경우(에러가 있는 경우)
						-------- 무시 ==> catch로 이동
			cf) JSP에서는 자바코딩이 맨위에 있음 => 에러나면 그 밑의 HTML코드 실행못함 => 예외처리 필수
 * 	
 */
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문장1");
		System.out.println("문장2");
		try {
			System.out.println("문장3");
			//System.out.println(10/0); // 에러 => catch(문장6)으로 이동
			System.out.println("문장5");
		}catch(Exception ex) {
			System.out.println("문장6");
		}
		System.out.println("문장7");
		System.out.println("문장8==정상종료");
	}

}
