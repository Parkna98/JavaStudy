/*
	Math	: 수학관련
		=> Math.random() ==> java.util.Random()
							 Random r=new Random();
							 r.nextInt(100) => 0~99 
		   	=> Math => final 클래스 => 변경이 불가능
		   			   있는 그대로 사용
		   			   모든 메소드가 static이다
		   			   => Math는 객체생성을 하지 않는다 => 클래스명. 으로 접근
		=> Math.ceil() : 웹에서 가장 많이 사용
			=> 올림 메소드	 ---------------
							ㅣ 페이징 => 무한 스크롤 => 20개씩
			172/10.0		  ----- 총페이지 구하기
			==> 17.2 ==> 18page ==> 맨마지막은 2개출력 (마지막 페이지는 게시물갯수가 정해지지않음 => 컬렉션이용)
			
		=> Math는 대부분 리턴형이 double (형변환 생각하기)
							 
	System	: 
	------
		System.out.println() => 웹 => 확인
			정상적으로 사용자가 데이터 전송
			순서 => 동작
			에러 => 처리
		System.gc() : 메모리 해제 요청, 웹 서버(톰캣)
		System.exit() : 프로그램 종료 ==> 윈도우
		--------------------------------------
		
	***String  / StringBuffer / Wrapper(Integer,Long,Double,Byte...)
	데이터형 ==> 문자열로 변경			------- 문자열로 읽어서 다른 데이터형으로 바꿀때 사용하는 메소드
	문자열을 ==> 다른 데이터형으로 변경
	------
		=> 2진법,8진법,16집번 ===> 10진법 ==> Wrapper
	
 */
import java.util.*;
public class MainClass_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		System.out.print("총 갯수:");
		int total=scan.nextInt();
		
		// ==> 10개씩 나눠서 출력 ==> 총 페이지
		// 이전	1/10   다음
		int page=(int)Math.ceil(total/10.0); // 한페이지에 10개씩
		// SELECT CEIL(COUNT(*)/10.0) FROM recipe;
		System.out.println("총 페이지:"+page);*/
		// 항상 형변환 생각
		int a=10;
		System.out.println(Integer.toBinaryString(a)); // 2진법
		System.out.println(Integer.toOctalString(a)); // 8진법
		System.out.println(Integer.toHexString(a)); // 16진법
		
	}

}
