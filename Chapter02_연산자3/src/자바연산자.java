/*
 * 		변수	: 저장공간
 * 		====
 * 			자바 저장 공간을 설정 (자료형,데이터형)
 * 			----------------
 * 			정수
 * 			 byte (8bit) => 0,1을 8개 채워서 숫자하나 저장 -128~127
 * 		 	 int  (32bit) => -21억 4천 ~ 21억 4천
 * 			 ------------------------default (컴퓨터에서 모든 숫자는 int를 인식)
 * 			 long (64bit) => 금융권, 빅데이터
 * 			실수
 * 			 double (64bit) => 소수점 15자리 이상
 * 			문자
 * 			 char (16bit) => 0~65535 (문자번호, 아스키코드, 유니코드)
 * 					'A' ==> 65
 * 			논리
 * 			 boolean : true, false (8bit)
 * 			-----------------------------------
 * 			정수 3개 저장
 * 			int a, b, c;
 * 			실수 2개 저장
 * 			double d1, d2
 * 			문자 1개
 * 			char c;
 * 			boolean bb;
 * 
 * 		---> 데이터 저장 ----> 사용자 요청에 맞게 가공 ----> 화면 출력
 * 		---> 프로그램 (반복) 			ㅣ 
 * 								  연산자
 * 		자바에서 제공하는 연산자
 * 		------------------
 * 		단항연산자 :
 * 			= 증감연산자 (++,--) : 한개증가, 한개감소
 * 				++a : a값을 1증가 시킨후에 다른 연산을 수행
 * 				 int a=10;
 * 				 int b=++a;
 * 				 	   --
 * 					   증가(1)
 * 					 --
 * 					 대입
 * 
 * 				a++ : 먼저 다른 연산 수행 후 1증가
 * 				 int a=10;
 * 				 int b=a++;
 * 					 ---
 * 					 대입
 * 					   ---
 * 					   증가(1) a=11
 * 
 * 				--a : a값을 먼저 감소하고 나중에 다른 연산 수행
 * 				 int a=10;
 * 				 int b=--a
 * 					   --- 1감소 ==> a=9
 * 					---
 * 					감소된 값을 대입
 * 
 * 				a-- : 다른 연산을 수행한 다음에 감소를 한다
 * 				 int a=10;
 * 				 int b=a--
 * 					 --- 감소전 대입 b=10
 * 					   ---
 * 						a가 1감소 ==> a=9
 * 				
 * 				++, -- => 1증가, 1감소
 * 
 * 			= 부정연산자 (!) => boolean에서만 사용
 * 				=> true => false
 * 				   false => true
 * 					ex) boolean bCheck=false;
 * 						bCheck= !bCheck ==> bCheck=true
 * 						예약가능한 날 => !(예약가능한 날)
 *  
 * 			= 형변환연산자 (type) => 강제 형변환
 * 			  ---------객체지향 형변환 (클래스)
 * 			  숫자관련만 (정수,실수,문자)
 * 			  ----------------------
 * 				UpCasting   : 데이터형을 크게 만든다
 * 					int=>double
 * 					char=>int
 * 					--------------자동 형변환
 * 					int a='A'
 * 						  --- int 변경 ('A' => 65)
 * 					double d=100
 * 							---- double변경 (100=>100.0)
 * 				DownCasting : 데이터형을 작게 만든다
 * 					char c=(char)65; c='A'
 * 					int i=(int)100.0 => i=100
 * 			데이터형의 크기
 * 			=====================> 자동 형변환
 * 			byte < char < int < long < float < double
 * 			<===================== 강제 형변환
 * 			
 * 			자동 형변환
 * 			--------
 * 				연산 처리시 많이 변경 (자바자체)
 * 				-------
 * 					데이터형이 같은 것 끼리 연산이 된다
 * 					double + int (x)
 * 							----
 * 							double로 변경
 * 					char + int (x)
 * 					----
 *  				int로 변경
 * 					int + char + double
 * 					---	  ----
 * 					double double 로 변경 => 속도를 빠르게 하려면 처음부터 같은 데이터형을 연산하면됨
 * 					
 * 					*** 주의점 (int이하 데이터형은 연산시에 int로 변경)
 * 					char+byte = int
 * 					char+char = int
 * 					byte+byte = int
 * 
 * 
 * 		이항연산자 :
 * 			= 산술연산자 : + - *  / %
 * 				*** 우선순위 *,/,% => +, -
 * 						3+5*10 => 53
 * 						(3+5)*10 => 80
 * 						7+"7"+7-7; Error!
 * 						7+"7"+(7-7); => "77"
 * 						7+"7"+7/7; => "771"
 * 				+: 두개의값 더하기
 * 				   문자열결합 ("7"+7+7 = "777")
 * 				/ : 정수/정수 => 정수, 정수/실수 => 실수
 * 					정수/(double)정수 => double (형변환)
 *					** 0으로 나눌 수 없다 (0으로 나누면 Error)
 *				% : 왼쪽 부호를 따라감
 *					=> 윤년 구하기, 숫자 자르기, 배수 구하기...
 *
 * 			= 비교연산자 :( ==, !=, <, >, <=, >= )  ==> 결과값은 true/false
 * 			  => 정수,실수,문자('') => 자바는 Unicode를 사용 (모든 국가의 언어사용가능)
 * 										한글자당 2byte =>'박','홍'
 * 			
 *  * 				== 같다
 * 				!= 같지않다
 * 				< 작다 (왼쪽 기준)
 * 				> 크다
 * 				*** 날짜, 문자열("")은 구분할 수 없다 (비교하는 자체메소드가 있음)
 * 
 * 			= 논리연산자 : &&, ||
 * 					&& : 직렬연산자 => 조건 두개 모두 true면 true. 하나만 false 면 false
 * 						(조건)  &&  (조건)
 * 						-----	   -----
 * 						주로 사용처 : 기간, 범위가 포함된 상대
 * 					|| : 병령연산자 => 하나만 true면 true
 * 						(조건)  ||  (조건) => 주로 사용처 : 잘못된 입력
 * 			= 대입연산자 : =, +=, -=
 * 				= 일반 대입
 * 				+= =============> a+=1 ==> a=a+1  => 여러개 증가
 * 				-= =============> a-=1 ==> a=a-1
 * 		삼항연산자 : 조건 연산자 (조건)?():()
 * 			(조건)?(값1):(값2)
 * 			-----
 * 			true => 값1
 * 			false => 값2 ==> 페이징
 * 
 * 			
 * 		
 * 		
 * 		
 */
// 산술연산자
// 정수 3개 입력을 받아서 총점, 평균
import java.util.Scanner; // Scanner 클래스를 불러온다
//		-------폴더명, java.util 이란 폴더에서 Scanner기능을 가져온다
// c => include
// c# => using
// javaScript => import
public class 자바연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kor,eng,math;
		int total;
		double avg;
		// =================== 선언 (메모리 저장공간 생성)
		// 메모리 공간에 값을 첨부 => 변수의 초기화
		Scanner scan=new Scanner(System.in);
		//						----------- 키보드 입력값
		System.out.println("국어,영어,수학 점수 입력(90 90 90):");
		kor = scan.nextInt();
		eng = scan.nextInt();
		math = scan.nextInt();
		// new => 메모리에 저장 (클래스)
		// 연산처리 ==> 
		total = kor+eng+math;
		avg = total/3.0;
		// 결과 출력
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		System.out.print(avg>=90 && avg<=100?"A학점":"");
		System.out.print(avg>=80 && avg<=89?"B학점":"");
		System.out.print(avg>=70 && avg<=79?"C학점":"");
		System.out.print(avg>=60 && avg<=69?"D학점":"");
		System.out.print(avg<60?"F학점":"");
	}

}
