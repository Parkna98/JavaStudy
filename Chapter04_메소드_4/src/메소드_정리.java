/*
 * 		메소드는 입력을 받아서 처리하고 결과값을 반환
 * 			  ----------	   ---------
 * 				매개변수			리턴형
 * 				  ㅣ				  ㅣ
 * 				사용자			프로그램
 * 		=> 구성요소
 * 			리턴형 / 매개변수 / 메소드명
 * 			----   -----   ------
 * 		=> 선언부
 * 			리턴형 메소드명(매개변수목록) 
 * 		=> 구현부
 * 			{
 * 				-----
 * 				-----
 * 				return (메소드 종료)
 * 				(void일 경우 생략가능)
 * 			}
 * 		=> 매개변수 전송
 * 		int c=add(10,20) => 호출시에는 매개변수값을 전송
 * 				  ㅣ  ㅣ
 * 		int add(int a, int b) ==> 임시 메모리 공간 ==> 지역변수의 일종
 * 		{
 * 			return a+b; => 30 => c에저장
 * 		}
 * 		
 * 		
 * 		=> 입력값(O), 리턴형(O)
 * 		=> 입력값(X), 리턴형(O)
 * 		-------------------
 * 		=> 입력값(O), 리턴형(X)
 * 		=> 입력값(X), 리턴형(X)
 * 		------------------- => void
 * 		메소드 정의
 * 		--------
 * 		1. 특정 작업 수행하는 명령문의 집합
 * 						----- 변수 / 연산자 / 제어문
 * 		2. 메소드를 호출할 경우에만 매개변수가 메모리 할당을 한다
 * 		   ---------
 * 		   메소드는 호출할때마다 처음부터 return이 있는 곳까지 실행한다
 * 		   
 * 		3. 메소드의 매개변수 전송
 * 			= 배열, 클래스 => 주소 참조 (자체가 변경)	=> 같은 메모리 주소 이용
 * 				Call By Reference
 * 			= 일반 데이터형 => 값 참조 (자체는 변경이 안됨) => 다른 메모리에 생성
 * 				Call By Value
 * 		============================================================
 * 		절차적 프로그램 (한줄씩 출력) ==> 구조적 프로그램 ==> 객체지향 프로그램
 * 			ㅣ						  ㅣ					ㅣ
 * 		 한줄씩 나열 				같은 기능별 나눠서 작업	  변수+메소드
 * 									 메소드
 * 		변수 => 보호(데이터 손실방지) => 캡슐화 
 * 		재사용 => is-a, has-a
 * 				  ㅣ		ㅣ
 * 				 상속	    포함
 * 		수정, 추가 => 다형성
 * 		 ㅣ	 ㅣ
 * 	오버라이딩	 오버로딩
 * 
 * 		객체지향 3대요소 => 캡슐화, 재사용, 다형성
 * 		
 * 		= 클래스
 * 			1. 사용자 정의 데이터형 => 데이터 클래스
 * 			2. 메소드 모음 => 액션 클래스
 * 				ex) 게시판
 * 					= 목록출력,상세보기 ...
 *	 				 	
 * 
 */
class Movie{
	String title;
	String actor;
	String director;  // 클래스는 모든 데이터 묶어서 한번에 저장
	double score;
	String regdate;
}
public class 메소드_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie[] m=new Movie[30]; // Movie라는 데이터형을 직접 만들기
		/*Movie m1=new Movie();
		m1.title="aaa";
		m1.actor="bbb";
		Movie m2=new Movie(); // 각 영화별로 new를 써서 저장 => for문돌려서 여러영화
		m2.title="ccc";
		m2.actor="ddd";
		System.out.println(m1.title);
		System.out.println(m2.title);*/
		
	}

}
