/*
 * 		메소드 : 한개의 기능을 수행하는 명령문의 집합
 * 			   --------		   ----- 변수,제어문,연산자
 * 		1) 메소드 구조
 * 			[접근지정어][옵션] 리턴형 메소드명(매개변수목록) ==> 선언부
 * 			{
 * 				구현부
 * 				...
 * 				...
 * 				...
 * 				return 값
 * 				=> void로 선언 시에는 return; 생략가능
 * 								  -----------
 * 								  컴파일러에의해 자동추가
 * 				=> return 문장은 메소드의 종료(반드시 필요)
 * 			}
 * 			메소드 : 호출 => 메소드는 처음부터 끝까지 실행을 하고 
 * 						  원래 호출한 위치로 넘어온다
 * 			예)
 * 				void aaa()
 * 				{
 * 					문장1 ----- 2 --- 7
 * 					문장2 ----- 3 --- 8
 * 					문장3 ----- 4 --- 9
 * 					return; -- 메소드종료 => 호출위치 돌아감				
 * 				}
 * 				
 * 				void main()
 * 				{
 * 					문장4 ----- 1
 * 					aaa()
 * 					문장5 ----- 5
 * 					문장6 ----- 6
 * 					aaa()
 * 					문장7 ----- 10
 * 				}
 * 				=> 반복적인 문장이 있는 경우 (반복 제거)
 * 				=> 기능별 분리하기 때문에 코드간결
 * 				   -------- 수정하기 편리하다, 에러처리 편리
 * 				=> 다른 클래스와 연결 시에 주로 사용
 * 				=> 객체 지향 : 변수 / 메소드
 * 				=> 클래스의 구성 : 변수 / 메소드
 * 				=> 메소드가 존재하면 좋은 점 : 분산이 가능 (여러명이 동시에 개발 가능)				
 * 
 * 		2) 리턴형 결정
 * 			사용자가 요청에 대한 결과값 도출
 * 			=> 한개의 값만 리턴가능
 * 				=> 값이 여러개라면? ==> 묶어서 전송	
 * 								   -------- 한개로 인식(배열,클래스)
 * 			예)	
 * 				=> 사용자 정의 데이터형 (참조형 변수)
 * 				class Movie{
 * 					String title;
 * 					String director;
 * 					String actor;
 * 					double score;
 * 					int rank;
 * 				}
 * 			= 결과값이 있는 경우 => 결과값 설정
 * 								= 기본형
 * 								= 참조형
 * 			= 결과값이 없는 경우 (메소드 자체처리) => void
 * 				void => 결과를 메소드에서 출력
 *			= 리턴형과 결과값은 가급적이면 동일한 데이터형으로
 *				*** 리턴형이 결과값보다는 크거나 같게 (결과를 예측하지 못할때)
 *				ex) int 메소드명()
 *					---리턴형 (long, double, float)
 *					{
 *						return 값;
 *							  --- 결과값(리턴형보다는 작거나 같은 데이터형)
 *					}
 *					*** boolean / String 은 대체불가
 * 
 * 		3) 매개변수 : 사용자로부터 요청을 받은 값
 *				   --------------------
 *					ex) 로그인 요청 => ID, PW
 *						우편번호 검색 => 동/읍/면
 *			=> 매개변수는 여러개 사용 가능 
 *			=> 가급적이면 적게 사용
 *					  ------- 3개이하
 *							  => 3개이상이라면 배열,클래스
 *			=> 예측을 못하는 경우
 *			   ------------- => 가변 매개변수(...) 
 *									ex) String...s , int...s
 *										for(String ss:s) 같은 형식으로 쓰면 됨			
 * 
 * 		4) 메소드명 
 * 			=> 식별자 이용(변수명칭법과 동일)
 * 			   ----
 * 				1. 알파벳이나 한글로 시작
 * 				   ---- OS에 영향이 없다 (Window, Linux, Mac..) (한글은 대부분 깨짐현상)
 * 				   ---- 소프트웨어 이식(개발 => 윈도우 => 리눅스)
 * 				   => 알파벳은 대소문자를 구분
 * 				2. 숫자 사용이 가능(앞에 사용불가)
 * 				3. 특수문자 사용가능($,_)
 * 				4. 키워드 사용 불가
 * 				   ---- 변수명, 메소드명, 클래스명 (X) => 메소드명과 클래스명, 변수명이 같아도 된다.
 * 					 	=> 키워드 ex) int, public, float...
 * 				5. 공백 불가
 * 				6. 메소드명의 길이는 제한은 없다 (3-15글자 권장)
 * 					=> 추가 (board_insert, boardInsert)
 * 				7. 약속 
 * 					=> 소문자로 시작
 * 					=> 두개 단어이상일 경우 뒤의 단어 첫자 대문자
 * 						------------------------------ 헝거리언식 표기법
 * 			=============> 식별자 적용 : 변수/상수/메소드/클래스/인터페이스/열거형
 * 
 * 		5) 호출 => 실행과정
 * 		   -------------
 * 		   int max(int a, int b)
 * 		   {
 * 				return a>b?a:b
 * 		   }
 * 			=> int max=max(10,20) => a=10, b=20
 * 			   --- 
 * 				ㅣ클 수도 있다(double,long..)
 * 		   void max(int a, int b)
 * 		   {
 * 				System.out.println(a>b?a:b);
 * 		   }
 * 			=> max(10,20) => 받아서 저장하는 값이 없다
 * 
 * 		6) 메소드 유형
 * 		   --------
 * 			리턴형 		매개변수
 * 			------------------
 * 				o		o
 * 				=> String.substring(int begin)
 * 				=> String.substring(int begin,int end)
 * 				-------------------- 메소드명이 동일 => 매개변수가 다르다
 * 										=> 메소드가 다르다(오버로딩)
 * 				
 * 				o		x
 * 				=> double random() => 임의의 데이터 추출
 * 				--------- 0.0~0.99
 * 			------------------
 * 				x		o
 * 				=> 출력담당
 * 					void println(String)
 * 
 * 				x		x => 빈도수 적음 (웹에서는 거의 리턴형을 가지고감)
 * 				=> void println() => 다음줄에 출력
 * 				----------------- 원형
 * 					= 사용자정의
 * 					= 라이브러리 => 어떤 기능, 원형 (리턴형,매개변수)
 * 					  ------- (자바 : CBD프로그램 ) ( C언어 : 하드코딩프로그램 )
 * 								Component => 기능이 있는 클래스
 * 								
 * 			------------------ void (INSERT,UPDATE,DELETE)
 * 				파일에 값 추가, 파일 값 삭제, 수정
 * 			
 */
public class 메소드_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
