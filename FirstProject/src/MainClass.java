/*
 * 주석 (인식불가) 
 * 
 * 		1. 프로젝트명 설정
 * 		2. src => java파일 생성
 * 		   java : 단위가 Class
 *         클래스 생성 
 *         ------------------
 *           1. 클래스는 대문자로 시작
 *           2. 단어가 2개 이상일 경우
 *              시작하는 첫자는 대문자 - ex) MainClass (o) Mainclass (x) Main_Class (o)
 *           3. 자바에서 숫자 표현
 *           			 => 8진법
 *           				011
 *           			 => 10진법
 *           			 => 16진법
 *           				0xFF ==> HTML의 색상표
 *           		   문자 표현 : '한개의 문자만 사용이 가능' (작은 따옴표 '')
 *           					 'AB' (x) => 'A','B','박' (o)
 *           		   문자열 표현 : "여러개의 문자열 사용이 가능" (큰 따옴표 "")
 *           4. 문장이 종료가 되면 ;
 *           	----------- 명령수행
 *           	----------- 명령 => 순서 (알고리즘)
 *           5. 들여쓰기
 *           6. 자바 실행
 *           	-------
 *								컴퓨터 인식 (2진 파일) -> 컴파일
 *								  	  0,1           					실행
 *           	MainClass.java ===================>	MainClass.class ===========> 
 *           		원시소스 			 javac				bytecode	   java
 *           (개발자만 알아보는 소스)											ㅣ 
 *           														  인터프리터
 *           7. 프로그램 실행
 *           	-----------
 *           		- 컴파일 : 컴퓨터 인식언어로 변경
 *           			   java / c, c++
 *           		- 인터프리터 : 한줄씩 번역 => HTML
 *           		----------------------------
 *           			자바 : 컴파일 + 인터프리터
 *           				  보안이 뛰어남
 *            			=> 자바 : 게임에 사용되는 언어 (세븐스타)
 *            				= 임베디드 => 모바일
 *            			=> 그린 프로젝트 : 모든 기계를 리모콘 한개로 제어
 *            				=> 1차 부도
 *            				=> 네스케이프 (브라우저 업체) => 웹
 *            			=> 개별 업체 (썬 마이크로 시스템)
 *            				=> 자바언어 사용
 *            				=> 제임스 고슬린 + 아서벤 
 *            					  Ja	  + Va => java
 *            			=> 1995 : 자바탄생 (5/23)
 *            			=> 1996에 한국 상륙 ==> 2000s (JSP)
 *            			=> MS <=> 연합군 (오라클,썬)
 *            					  ------------------
 *            			=> MS (데이터베이스 : MS-SQL, Windows)
 *            			   SUN (솔라리스) => 인수 => MySQL
 *            				=> 부도 2차					
 *            			=> 오라클 인수 => Java를 유료화
 *            			   ----------
 *            				   ㅣ
 *            				  java의 제작 (제임스 고슬링)
 *                      				 ----------
 *                      					 ㅣ 연봉(x) => 구글(GO)
 *                      => 모바일 (유료화 => 안드로이드 (자바=>Kotlin)
 *                         *** 스프링 (오픈 소스) => 준비(자바,Kotlin) 자바가 유료화 된다면 Kotlin으로 변경 준비
 *                         ----------------------------------------------------------------------
 *                      자바 
 *                       - 필수
 *                       	1) 변수 (한개의 데이터 저장)
 *                       	   데이터형 (정수,실수,문자...)
 *                       	   ----------------------------------
 *                       	2) 가공 : 연산자, 제어문
 *                       	3) 데이터를 모아서 관리 : 배열 (같은 것만 모은다)
 *                       	4) 다른 데이터를 모아서 관리 : 클래스
 *                       	5) 클래스 : 재사용, 보안, 수정, 추가
 *                       	   ----------------------------------
 *                       	   ===> 객체지향 프로그램
 *                       	6) 예외처리
 *                       	   ----------------------------------
 *                       	7) 라이브러리
 *                       	=====> IO(파일 입출력), 오라클 연결
 *            									 ----------
 *            
 *            **하루정리
 *            	=> 개발환경
 *            		=> JDK : 17
 *            		=> 편집기 : 이클립스 => Front(VSCODE) => Vue,Ajax,React
 *            					=> R, MongoDB
 *            		=> 데이터베이스 : Oracle(1,2) => 3차(MySQL,MariaDB)
 *            		=> 미드웨어 : Tomcat 
 *            		-----------------------------------------
 *            		=> 아나콘다
 *            		-----------------------------------------
 *            		=> 자바 = JDK, 이클립스
 *		프로그램
 *		1. 데이터 저장
 *			변수 / 상수 (변하지 않는 수)
 *			--- 변하는 수 (필요한 경우 변경이 가능)
 *			==> 저장해야 되는 데이터가 많은 경우
 *				=> 묶어서 저장
 *					배열 / 클래스 (사용자 정의)
 *			------------------------------- 메모리에 저장
 *											--- RAM
 *			==> 사라지지 않는 저장값 : 파일 / DataBase (오라클)
 *			-------------------------------------------
 *		2. 데이터 가공 (사용자 요청)	
 *			연산자, 제어문
 *			--------------------메소드
 *			함수(C,C++) / 메소드 (*** 기술면접) - 두가지의 차이점 => 최근 동향 : 포트폴리오
 *			-------------- Java/C#
 *				ㅣ Kotlin / 파이썬
 *			클래스 종속
 *		3. 가공된 데이터 출력
 *			= Application (window,dos) => main
 *			= Web Applicaion (브라우저)  => main(x)
 *		-----------------------------관련된 내용을 묶어서 관리
 *		
 *		4. 자바 : 데이터 관리, 브라우저 전송, 오라클 연동
 *
 * 
 * 
 */
public class MainClass {
	// 한줄 주석
	// 프로그램의 시작점 => main은 반드시 한개이상이 필요하다
	public static void main(String[] args) {
		System.out.println("Hello Java!!");
		{
			// '{' 열고 직접 닫지말고 enter 하면 알아서 닫힘 '}'
		}
	}
}
