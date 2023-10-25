package com.sist.lib;
/*
		자바에서 가장 많이 사용되는 패키지
		=> java.lang / java.util / java.io / java.sql
			=> 웹 사이트 => HTML/CSS 오픈
				=> Spring / React 
		java.lang : Object / String / Math / Wrapper
		java.util : Date / StringTokenizer / Arrays
					List(ArrayList), Map(HashMap)
					Calendar => 기본 달력 (예약)
 */
import java.util.*;
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// System.in, System.out => 자바의 표준 입출력
		// 키보드 입력값 받기, 화면 출력
		System.out.print("년 월 일을 입력(2023 10 25):");
		int year=scan.nextInt();
		int month=scan.nextInt();
		int day=scan.nextInt();
		
		// => 요일, 입력달의 마지막 날짜 => Calendar에 설정
		// set() => get()
		/*
			1. 년도 설정 : set(Calendar.YEAR, year)
			2. 월 설정  : set(Calendar.MONTH, month-1) => MONTH는 0부터 시작
			3. 일 설정  : set(Calender.DATE,1) => 달력을 만들때 1일이 무슨요일인지 호출하기위해 1로 
												오늘이 궁금하면 입력받은 day쓰면됨
				=> Calendar => 추상클래스
							   ------- 미완성 (메소드 구현이 안된 상태)
							   new를 이용해서 메모리 할당 불가
				=> new를 사용하지 않고 메모리 할당 ==> 추상클래스, 인터페이스
		 */
		// Calendar 객체 생성
		Calendar cal=Calendar.getInstance(); // new를 못써서 getInstance로 객체생성
		// 요청한 달의 날짜 설정
		cal.set(Calendar.YEAR, year); // 연도설정을 위해 상수로만들어놓음
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1); 
		
		// 요일구하기 ==> DAY_OF_WEEK
		int week=cal.get(Calendar.DAY_OF_WEEK)-1; // 0번부터 쓰기위함 (원래는 1~7 기준)
		// 1~7까지 => 0~6 (일~토)
	
		// 해당 달의 마지막 날짜 구하기
		int lastday=cal.getActualMaximum(Calendar.DATE);
		
		// 출력
		String[] strWeek= {"일","월","화","수","목","금","토"};
		System.out.println(year+"년도 "+month+"월 ");
		
		for(String w:strWeek) {
			System.out.print(w+"\t");
		}
		System.out.println("\n"); // 다음줄로 이동
		for(int i=1;i<=lastday;i++) {
			if(i==1) {  // 첫날 요일 전까지 공백
				for(int j=0;j<week;j++)
					System.out.print("\t");
			}
			System.out.printf("%2d\t",i);
			week++; // 요일을 증가시키면서 한주지나면 한줄내리기
			if(week>6) {
				week=0;
				System.out.println();
			}
		}
	}

}
