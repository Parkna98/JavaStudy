/*
 * 		프로그램 (데이터 관리 프로그램)
 * 		------
 * 			1. 데이터 저장
 * 				1) 메모리에 저장 => 프로그램 종료시 자동으로 사라짐
 * 				   ----------
 * 					= 한개의 데이터 저장
 * 						= 읽기(데이터 가지고 오기), 쓰기(저장, 수정)	
 * 						  ---------------------------------
 * 							변수
 * 							형식)  
 * 								데이터형 변수명;
 * 								------ -----
 * 								   ㅣ
 * 								메모리 크기 (저장할 데이터)
 * 								---------
 * 								= 기본형 (자바에서 제공)
 * 									1byte, 2byte, 4byte, 8byte
 * 									 8bit  16bit  32bit	 64bit
 * 						     		(-127~128) => byte
 * 									(0 ~65535) => char =====> String
 * 									(-21억4천~21억4천) => int (컴퓨터에서는 모든 수를 int로 인식) 
 * 									(이외의 더 큰데이터) => long  => L(l)
 * 									---------------------------------
 * 									실수형
 * 										double(8byte) : 실수의 default => 모든 실수는 double 인식
 * 											10.6(d) / 10.6f 
 * 									논리형
 * 										boolean => true/false (1byte)
 * 									---------------------------------
 * 									int a=10; => a는 저장된 위치
 * 									boolean b=true;
 * 										   -- 저장된 위치의 메모리 주소 별칭
 * 
 * 									=> 크기
 * 										<=================== 강제 형변환
 * 									byte < char < int < long < double
 * 										===================> 자동 형변환
 * 									double a='A'
 * 											 --- 65.0
 * 									int a='A'
 * 										  --- 65	
 * 									int a=10.5
 * 										  ---- => 자동형변환 안되긴때문에 강제형변환해야함
 * 											==> (int)10.5 ==> 소수점을 지워준다 (버림)		
 * 
 * 								= 참조형 (사용자 정의) (메모리 크기 설정) (메모리 주소)
 * 								  --------------- 저장위치가 다르다
 * 								= 저장 장소(자바)
 * 									1) Method Area (메소드, static)
 * 									2) Stack => 지역변수
 * 									   =======> 메모지 자체 관리
 * 									   =======> {}안에서만 사용
 * 									3) Heap => 사용자 정의
 * 									   ======> 프로그램 종료시까지 유지
 * 									   => 배열, 클래스 저장
 * 									   => 메모리 관리를 프로그래머가 한다
 * 									   => 자동 메모리 회수를 이용
 * 										  (가비지 컬렉션)
 * 									   => 싱글턴, 팩토리 ... (디자인 패턴)
 * 									   	  --------------------------
 * 								  
 * 
 * 						= 읽기 => 상수
 * 								final 데이터형 상수명; => 상수명은 대문자로
 * 					= 같은 데이터형 여러개 저장
 * 						= 배열
 * 							=> 고정된 데이터
 * 							=> 연속적인 메모리 구조
 * 							=> 한개의 이름으로 데이터 여러개 동시에 제어
 * 							   --------- 반복문 사용 (인덱스)
 * 					= 다른 데이터형 여러개 저장
 * 						= 클래스 : 사용자 정의 데이터형****
 * 				
 * 				2) 파일에 저장 => 영구적인 저장
 * 				   --------- 데이터가 노출(보안에 취약점) => 파일의 연관관계
 * 				
 * 				3) 데이터베이스 시스템 : 오라클, MySQL
 * 			
 * 			2. 데이터 연산처리 (가공) => 사용자가 요청한 결과값
 * 			   -----------------
 * 				1) 연산자
 * 				2) 제어문
 * 				3) 기능별 처리 => 메소드(연산자+제어문)
 * 				------------------------------- 기능(클래스:객체지향프로그램)
 * 
 * 			3. 테스트 => 오류방지 
 * 					   ------ if, 예외처리***
 * 				ㅣ
 * 			  JUnit(단위 테스트) (실무에서 많이 쓰는듯)
 * 			  
 * 			4. 출력 => Application, WebApplication
 * 								   --------------
 * 										 ㅣ 2차 자바(웹)
 * 										 ㅣ 3차 자바(스프링)
 * 										 ㅣ => MyBatis(DB)
 * 										 ㅣ => JPA 
 * 			-------------------------------------
 * 				
 */
import java.io.*;
public class 변수정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("");
		long len=file.length(); // 파일크기는 long형으로 받기때문에 int로 받으면 Error 남
	}

}
