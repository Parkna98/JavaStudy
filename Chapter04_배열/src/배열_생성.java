/*
 * 		배열
 * 		--- 묶어서 관리
 * 			--------
 * 			1) 변수 => 같은 유형의 변수가 3개이상 => 묶어서 처리
 * 											 -----
 * 											 변수명을 한개로 관리
 * 				   => 같은 데이터형 => 배열
 * 				   => 다른 데이터형 (******) => 클래스
 * 						=> ~VO,   ~DTO,  ~Bean
 * 						(Spring)(MyBatis)(JSP)
 * 					
 * 			2) 명령문 : 관련된 명령끼리 묶어서 구조적 프로그램
 * 					  메소드 ==> 단락
 * 			기본문법 --------
 * 			데이터 묶기 (변수)
 * 			명령문 묶기 (명령문) => 소스코딩 ;
 * 					   ㅣ
 *					  입력 						
 *					  처리 						
 *					  출력 						
 *								   					  
 * 					
 */

public class 배열_생성 {
	public static void print(int dan)
	{
		for(int i=1;i<=9;i++)
		{
			System.out.println(dan+"*"+i+"="+(dan*i)); // 메소드 : 구구단을 출력하는 기능
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
