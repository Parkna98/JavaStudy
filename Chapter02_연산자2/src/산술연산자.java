/*
 * 		1. 실행 순서
 * 			=> 자바파일명과 클래스명은 반드시 동일 / 대소문자 구분
 * 					컴퓨터가 인식하는 언어
 * 						javac(컴파일) => 0,1		  java(인터프리터) 
 * 			A.java =====================> A.class =================> 실행
 * 			------						바이너리코드 => 모든 운영체제에 호환
 * 			  ㅣ
 * 		원시소스(프로그래머)
 *      	==> 이클립스 : javac + java => Ctrl+F11
 * 
 * 		2. 소스 코딩의 주의점
 * 			1) 대소문자 구분
 * 			2) 명령문 => ;
 * 			3) 주석 처리
 * 			4) 들여쓰기 => { => 엔터 }
 * 		3. 자바개발자 약속
 * 			1) 변수 / 클래스 / 메소드 / 상수 / 인터페이스
 * 			변수 : 소문자 시작 => 다른 단어 결합 시 첫자 대문자 (fileName, file_name)
 * 			상수 : 모든 알파벳 대문자 (MAX, MIN, ABC)
 * 			클래스 / 인터페이스 : 첫 글자 대문자 => MainClass
 * 			메소드 : 변수와 동일
 * 		
 * 		*** 프로그램 (데이터 관리)
 * 			데이터 저장
 * 				= 메모리에 저장 => 프로그램 종료와 동시에 사라진다
 * 				  한개의 데이터 관리  => 변수
 * 					=> 기본형으로 메모리 크기 결정
 * 						정수
 * 							byte(1byte) / int(4byte) / long(8byte) 
 * 						문자
 * 							char(2byte)
 * 						실수
 * 							float(4byte) / double(8byte)
 * 						논리
 * 							boolean(1byte)
 * 				  여러개의 데이터 관리 => 배열 / 클래스 (사용자 정의 => 참조형)
 * 						=> int + double + char
 * 				----------------
 * 				= 파일에 저장
 * 				= RDBMS (오라클)
 * 				---------------- 영구적인 저장 장치
 * 		4. 변수 / 연산자 / 제어문 / 데이터 모아서 관리 / 재사용 / 예외처리
 * 
 * 			=> 라이브러리를 이용한 조립식
 * 		5. 응용 : 네트워크, 파일
 * 		------------------------------------------------
 * 		오라클 (21c) : CURD (추가, 수정, 삭제, 검색)
 * 		------------------------------------------------필수
 * 		브라우저 연동 : HTML5 / CSS3 / JavaScript
 * 								   ---------- Jquery  (Ajax)
 * 								   ---------- VueJs   (Vuex)
 * 								   ---------- ReactJs (Redux)
 * 								   옵션------- TypeScript / NodeJs
 * 														  -------
 * 															실시간 상담
 * 		JSP => Back-end + Front-end
 * 		---MVC (SprringMVC => 직접 Spring 제작)
 * 		DataBase 연동 => MyBatis / JPA
 * 		Spring 
 * 		Spring-Boot : ThymeLeaf
 * 		AWS => PaaS ==> EC2 
 * 		-------------------------------------------------------------
 * 		Python : 데이터 분석, 시각화
 * 				 Pandas / Numpy / MatplotLab
 * 				 옵션 : 머신러닝 / 딥러닝
 * 					   ------------- 자동화 - chatbot
 * 		
 * 		변수 : 메모리에 한 개 데이터갖는 공간의 별칭
 * 			  ----주소
 * 			  변수명 설정
 * 			  --------
 * 			  1. 알파벳 시작 (대소문자 구분), 한글
 * 			  2. 숫자 사용 가능 (앞에 사용 금지)
 * 			  3. 키워드는 사용금지
 * 			  4. 공백없이 사용
 * 			  5. 특수문자 (_, $)
 * 			  6. 기타사항 => 압축(3~7글자) => i, j
 * 			------------------------------------
 * 			변수 선언 방식
 * 				=> 데이터형 변수;
 * 			변수의 초기화
 * 				=> 변수명=값;
 * 			변수의 활용
 * 				=> 변수명=값(수정) ==> 자동으로 {}을 벗어나면 삭제된다
 * 			변수의 종류 ===> 지역변수 {}
 * 
 * 			데이터를 저장 ===> 데이터를 가공 ===> 가공된 데이터 출력
 * 								ㅣ
 * 							연산자/제어문		화면에 출력
 * 							---------메소드
 *			1. 산술연산자
 *				+, - , *, /, %
 *				1) 연산은 같은 데이터형끼리 
 *					10.5  +  10 => 20.5
 *					----	--- 
 *					double	int( =>10.5 double로 자동형변환)
 *					
 *					'A' + 1
 *					---  ---
 *					char < int
 *				    -->int 형변환 (자동형변환)
 *					 65 + 1 ==> 66
 *
 *					10.5 + (double)10 => 강제 형변환
 *
 *					크기 ===============> 자동 형변환
 *					byte < char < int < long < float < double (boolean은 비교대상 X)
 *						   short(C언어 호환)
 *					<=================== 강제 형변환
 *					*** int 이하 데이터형 (byte, char, short)
 *						=> 연산 시 결과값 : int
 *							char + char = int
 *							byte + byte = int
 *							char + byte = int
 *			
 *				2) + : 산술 처리, 문자열 결합
 *					=> ' ' 문자
 *					=> " " 문자열
 *					ex) 7+"7"+7 = "777"
 *						----
 *						"77" +7
 *						---------> "777"
 *
 *						7+7+"7" = "147"		
 *						7+"7"+7-5 => Error!
 *						7+"7"+(7-5) = "772"
 *						7+"7"+7*2 = "7714"
 *					산술 => 왼쪽에서 오른쪽으로 연산
 *							*,/,%은 +,- 보다 우선순위
 *							=> 우선순위를 변경할때는 ()
 *					
 *				3) /, %
 *					/ ==> 1. 정수/정수 = 정수
 *							 10/3 => 3
 *							 5/2 => 2
 *						  2. 0으로 나누면 오류 발생
 *
 *					% ==> 나누고 나머지
 *						  결과 부호는 좌항의 부호를 따라감
 *							- % + => -
 *							- % - => -
 *							+ % + => +
 *							+ % - => +
 *					
 *					형변환
 *					int a ='A'		====> a=65
 *					double d=10;	====> d=10.0
 *					-----------------------------자동형변환
 *					int a = (int)10.5; => 강제 형변환			
 *			
 *					
 *		
 *
 *
 *					
 *		
 */
//3개정수 (1~100)  => 총합, 평균
public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		//			(0.0~0.99)*100 + 1 => 1~100 사이의 랜덤수
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		System.out.println("a="+a+",b="+b+",c="+c);
		int total = a+b+c; // 총점
		double avg = total / 3.0; // 평균
		System.out.println("total="+total);
		System.out.println("average="+avg);
		System.out.printf("average=%.2f\n",avg); // 소수점이하 2자리 출력
		/*  printf
		 * 	실수		: %f  %.2f  %.4f
		 * 	정수		: %d
		 * 	문자		: %c
		 * 	문자열 	: %s		
		 *  다음줄로 내리기 : 끝부분에 \n 		   
		 */
		System.out.println("===========================");
		System.out.print("aaa"); // 일자로 가로출력 => aaabbb
		System.out.println("bbb"); // 세로로 출력 
		System.out.println("ccc"); 
	}	

}
