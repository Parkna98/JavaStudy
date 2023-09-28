/*
 * 		1. 변수, 배열 => int, String
 * 					 --------------**
 * 		2. 요청 처리 => 연산자, 제어문 (메소드화)
 * 					 -----------
 * 			연산자 : 산술연산자 (+,%)
 * 					비교연산자, 논리연산자, 대입연산자(+=)
 * 			제어문 : if, if~else, 
 * 					for : 향상된 for문 => 출력
 * 						  ----------------- 웹, JavaScript
 * 												----------
 * 													라이브러리
 * 														forEach,map
 * 														=> VueJS,React,Redux
 * 					while : 데이터베이스 연동(오라클에서 데이터읽기)
 * 			============================================= 기본과정
 * 		3. 분리작업 => 관련된 내용을 묶어서 사용
 * 		   -----
 * 			데이터 묶어서 사용
 * 				= 배열
 * 				= 클래스
 * 			명령문 묶어서 => 입력 / 처리 / 출력 = 메소드
 * 			----------------------------------- + 
 * 				=> 객체 지향 프로그램 : 재사용, 수정, 기능추가, 데이터 노출 방지
 *								  ----- ----------- ------------캡슐화
 *									ㅣ	  다형성(오바라이딩(수정), 오버로딩(추가))     ㅣ
 *									ㅣ								 		ㅣ
 *								 변경해서 사용 => 상속(is-a)						ㅣ ==> 면접많이나오는부분
 *								 있는 그대로 사용 => 포함(has-a)					ㅣ
 *			------------------------------------------------------------
 *			1. 설계 => 인터페이스
 *			2. 비정상 종료를 방지 (오류를 사전에 처리)	=> 예외처리
 *			3. 라이브러리 => 조립식 프로그램
 *			   -------네트워크, 데이터베이스 연동
 *	
 *		배열
 *		--- 데이터 묶기
 *			=> 연속적으로 메모리 할당 => 인덱스사용 
 *			=> ----- 메모리 크기가 동일
 *			=> 		--------- 데이터형이 동일
 *			=> 고정적이다 (크기를 선언하면 => 수정이 어렵다)
 *			=> 						  ---
 *									   ㅣ 큰 배열을 다시 만들어서 사용
 *			-------보완: 컬렉션(******)----------------
 *		배열 사용법
 *		--------
 *		1. 배열 선언
 *			데이터형[] 배열명; => 권장사항
 *			-------
 *			데이터형 배열명[]; => C언어	
 *		2. 초기값 부여
 *		   ----
 *			1) 명시적 초기화 
 *				=> int[] arr={1,2,3,4,5};
 *			-------------- int, char (주로 쓰임)
 *			2) 크롤링 초기화
 *			3) 파일
 *			-------------- String (주로나오는데이터형)
 *			4) 입력
 *				=> int[] arr=new int[5];
 *				   arr[0]=scan.nextInt();
 *				   arr[1]=scan.nextInt();
 *				   ...
 *			5) 난수
 *			--------------
 *				=> int[] arr=new int[5];
 *				   arr[0]=(int)(Math.random()*100);
 *					=> 저장된 데이터가 많은 경우
 *						for => index이용
 *		3. 필요시에 수정 
 *			arr[0] => 일반 변수와 동일
 *			arr[0]=100 => arr[0]=1000....
 *			=> 배열 : 변수명이 동일 => 인덱스번호 이용
 *								  ------
 *									순차적 => for
 *		4. 출력 => 검색 => 데이터
 *		   ---
 *			향상된 for문 => 간결하다, 속도가 빠르다
 *			for(데이터형 변수명:배열,컬렉션)
 *				-----		------- :뒤에는 배열이나 컬렉션만!
 *				  ㅣ 배열에 저장된 데이터형 (일치, 큰데이터형을 사용하다)
 *				=> 실제 데이터를 1개씩 읽어 온다
 *
 *		5. 배열의 갯수 : 배열명.length ( String은 문자열명.length() ) 
 *		
 *		6. 출력시에 => 항상 0번부터 출력하는 것은 아니다
 *					필요시에는 length-1
 *		7. 배열의 범위를 초과하면 => ArrayIndexOutOfBoundsException (오류메세지)
 *			[1]
 *			--- 인덱스, 첨자
 *		
 *		8. 자동 초기화
 *		   -------- new를 이용하면 메모리 할당시에 자동 초기화
 *			int => 0
 *			double => 0.0
 *			boolean => false
 *			char => '\u0000' => null값 => 주소를 갖고있지 않는 형태
 *			모든 클래스는 null값 초기화 ==> 107page
 *			int[] arr; ===> arr=null => 참조변수
 *				=> int[] arr={1,2,3,4,5}
 *				=> int[] arr=new int[5];
 *						---- 0,0,0,0,0 
 *			String s; => null
 *
 *		9. 메모리 할당
 *			int[] arr=new int[100]; ==> 10개사용 ==> 메모리 누수현상 (단점)
 *												==> 보완:가변형 => 넣는 데이터에따라 메모리가 바뀜
 *													--------컬렉션
 *			---------
 *			Stack			Heap(실제 저장되는 위치)
 *			arr				arr[0] arr[1] arr[2] ==> 순차적
 *			100(번지)			0		0		0
 *						100번지	100+4번지	 100+8번지
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
