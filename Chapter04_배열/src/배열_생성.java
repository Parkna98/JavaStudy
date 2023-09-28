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
 *					-------
 *			배열 : 같은 데이터형을 여러개 묶어서 관리
 *			1) 장점
 *				여러개의 변수명 => 한개로 합쳐서 사용 (루프 돌리기 편함)
 *							  -----------
 *				=> 데이터마다 구분 => 인덱스 (순차적) => 반복문
 *			2) 단점
 *				고정적이다 => 메모리 할당 (10)
 *				-------
 *				크기변경이 불가능 => 큰 배열을 생성
 *				같은데이터형만 모아서 저장 ==> 다른데이터형은 어떻게 모아서 저장? ==> 클래스!!
 *			-----------------------------------------------------------------
 *			1. 배열 선언
 *				데이터형[] 배열명; 자바(권장)
 *				데이터형 배열명[]; C
 *				--------------
 *			2. 초기화
 *				int[] arr={1,2,3,4,5} => 배열크기 5 => 20byte(int5개)
 *					  ---
 *					   ㅣ 변수 식변자와 동일
 *				int[] arr=new int[5]; ==> int(5개를 모아서 관리)
 *						  ----------- => 자동 초기화 0
 *				int[] arr;
 *							스택		힙
 *						  arr	ㅣ	
 *						-------	ㅣ
 *								ㅣ		
 *						-------	ㅣ	
 *				arr=new int[5]	ㅣ 	arr+1*4   arr+2*4   arr+3*4  arr+4*4
 *									   104	   108     112     116       ===> 주소 100번지부터 시작이라면 int이므로 4번지씩 증가 
 *						arr		ㅣ--------------------							104,108,112,116
 *					----------	ㅣ   0	ㅣ   0	ㅣ   0	ㅣ   0	ㅣ   0	ㅣ
 *						100		ㅣ--------------------	
 *					----------	ㅣarr(100)	arr[1]	  arr[2]  arr[3]   arr[4] ==> 주소로 찾기 힘드므로 인덱스로 찾기(순차적)***
 *								  arr[0] ------------------------------------ 일반변수와 동일
 *				
 *			3. 값 변경
 *				=> 1번째 값 변경 
 *					arr[0]=100 => 인덱스0번의 값을 100으로 변경
 *					arr[4]=200 => 인덱스4번의 값을 200으로 변경
 *			4. 출력
 *					int[] arr
 *					for(int a:arr)  ==> 사용할 배열의 데이터형과 for문 조건의 데이터형은 같아야함
 *					{				==> for-each문 (향상된 for문)
 *					
 *					}
 *						   					  
 * 					
 */
// 웹 => user의 요구에따라 => Actor => 객체지향(사용자에 맞게) // admin에 따라 등
// 유스케이스 다이어그램, 씨 다이어그램 ... 흐름파악

import java.util.Scanner;
// 3명 => 국어,영어,수학, => 총점, 평균
public class 배열_생성 {
	public static void print(int dan) //메소드 만들기 (main에 만들기는 불가)
	{
		for(int i=1;i<=9;i++) // 명령문
		{
			System.out.println(dan+"*"+i+"="+(dan*i)); // 메소드 : 구구단을 출력하는 기능
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor1,kor2,kor3; // 국어끼리 묶는다 => 1차원 배열
		int eng1,eng2,eng3;
		int math1,math2,math3;		
		int total1,total2,total3;
		double avg1,avg2,avg3; // ==> 통째로 다 묶으면 ==> 2차원 배열
		
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 학생 국어점수: "); // 변수명이 다 다르기때문에 루프못돌림 ==> 편하게 돌리려면 묶어야해
		kor1=scan.nextInt();
		System.out.print("첫번째 학생 영어점수: ");
		eng1=scan.nextInt();
		System.out.print("첫번째 학생 수학점수: ");
		math1=scan.nextInt();
		
		System.out.print("두번째 학생 국어점수: ");
		kor2=scan.nextInt();
		System.out.print("두번째 학생 영어점수: ");
		eng2=scan.nextInt();
		System.out.print("두번째 학생 수학점수: ");
		math2=scan.nextInt();
		
		System.out.print("세번째 학생 국어점수: ");
		kor3=scan.nextInt();
		System.out.print("세번째 학생 영어점수: ");
		eng3=scan.nextInt();
		System.out.print("세번째 학생 수학점수: ");
		math3=scan.nextInt();
		
		total1=kor1+eng1+math1;
		total2=kor2+eng2+math2;
		total3=kor3+eng3+math3;
		
		System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n",kor1,eng1,math1,total1,total1/3.0); // %-5d ==> 간격띄우기 ==> 5칸만들고 맨앞에 d입력하는형식
		System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n",kor2,eng2,math2,total2,total2/3.0);
		System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n",kor3,eng3,math3,total3,total3/3.0);
		
	}

}
