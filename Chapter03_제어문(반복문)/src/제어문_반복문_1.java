// 식별자 => 변수/상수/메소드/클래스/인터페이스 => 구분
/*
 * 		자바에서 제공하는 제어문
 * 		------------------
 * 		조건문	: 형식, 사용처
 * 			= 선택문 : 값이 1개 => 키보드, 서버 프로그램 => Application
 * 				형식) 
 * 					switch(정수,문자,문자열)
 * 					{
 * 						case 값 : 
 * 								실행문장
 * 								break; => 실행문장 수행 후 종료
 * 								----- 중복적으로 실행문장이 있는 경우 break 생략가능
 * 						case 값 :
 * 						...
 * 						...
 * 						default : 값이 없는 경우 실행문장
 * 					} // 버튼 클릭, 메뉴 선택
 * 			= 단일 조건문
 * 				형식) 
 * 					if(조건문) => 조건(true/false)
 * 					{			--------------- 비교연산자/논리연산자/부정연산자
 * 						조건이 true
 * 					}
 * 					=> 웹) 상세보기, 로그인, 아이디찾기...
 * 					=> 독립적이다 (if문마다 따로 수행)
 * 					=> 조건에 해당되는 모든 내용 출력...
 * 			= 다중 조건문
 * 				형식)
 * 					if(조건문)
 * 					{
 * 						조건이 true => 문장 수행 후 종료
 * 						조건이 false => 다음 조건문으로 넘어감
 * 					}
 * 					else if(조건문)
 * 					{
 * 						조건이 true => 문장 수행 후 종료
 * 						조건이 false => 다음 조건문으로 넘어감
 * 					}
 * 					else
 * 					{
 * 						조건이 없는 경우 처리
 * 					}
 * 			= 제어문 / 변수 / 연산자 ==> 자바스크립트, 오라클
 * 			= 선택 조건문 : true와 false나눠서 처리 (경우가 2가지 일때 주로 사용)
 * 				형식)
 * 					if
 * 					{
 * 						조건이 true => 문장 수행 후 종료
 * 					}
 * 					else
 * 					{
 * 						조건이 false일때 => 로그인이 안된 상태
 * 					}
 * 					
 * 		반복문 // 65page
 * 			===============================================================
 * 				DB단		: DBA
 * 				View단	: HTML, JS, 
 * 				Back단	: Java
 * 				--------------------
 * 
 * 			=> 종류, 형식
 * 				1) 종료
 * 					**for	 => 반복횟수가 있는 경우
 * 								웹) 목록출력, 쿠키출력...
 * 								=> 출력용 (JavaScript)
 * 					**while	 => 반복횟수가 정해지지 않은 경우 => 선조건
 * 							 	서버프로그램, 게임...
 * 								데이터베이스 프로그램, 파일읽기
 * 								=> 데이터관리 (Java)
 * 
 * 					while(조건문)
 * 					{
 * 						반복 실행문장
 * 					}
 * 					do~while => 반복횟수가 정해지지 않은 경우 ==> 최소 한번은 반드시 실행
 * 							 => 후조건
 * 					do{
 * 						반복실행문
 * 					}while(조건문) a!=10
 * 
 * 		1) for => 2차 for (알고리즘) => 코테
 * 			형식) 
 *						false => 종료 
 * 					 ① => ②  ← ④
 * 				for(초기값;조건식;증감식)
 * 				{		 -----
 * 						 true ↗
 * 						  ↓
 * 						  ③
 * 					반복 실행문장
 * 				}
 * 					1=>2=>3=>4
 * 					  ========반복 (2가 false일 때까지 반복)
 * 				
 * 					   1      2    4
 * 				for(int i=1;i<=10;i++) ==> i=2
 * 				{    3
 * 					수행
 * 	 			}
 * 		
 * 				초기값 : 조건식에 사용할 변수 선언 => 값은 한번만 사용할 수 있다
 * 				조건식 : 반복횟수 => 반복문을 중단할 지 여부 확인
 * 						false => 종료, true => 반복 수행
 * 				증가식 : 조건식이 false가 되는 조건을 만든다
 * 				----
 * 				  한개 ++
 * 				  여러개 +=
 * 
 * 				  
 * 
 * 
 * 		반복제어문 
 */
public class 제어문_반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("==== for ====");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Hello For문");
		}
		System.out.println("==== for ====");
		for(int i=0;i<10;i++) 				// 초기값은 꼭 1일 필요는 없음. 초기값은 바뀔 수 있는 것 유의
		{
			System.out.println("Hello For문");
		}
		System.out.println("==== for ====");
		for(int i=10;i>=0;i--)				// 이런식으로 10부터 내림차순으로도 가능, 증감이 감소도 가능함 i--
		{
			System.out.println("Hello For문");
		}
	}

}
