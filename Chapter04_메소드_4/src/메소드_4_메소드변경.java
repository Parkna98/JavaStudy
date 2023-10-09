/*
 *	1. 년도와 월 입력받기 int year, int month 		
 *		=> 리턴: int, 매개:String msg 
 *---------------------------------
 *	2. 전년도까지 합 + 전달까지의 합
 * 	3. 2번의 합에 +1 => 요청한 달의 1일자
 *	4. 총일수%7 => 요일  => int week
 *	=> 리턴: int, 매개:int
 * -----------------------------
 * 	5. 달력 출력
 * 	6. 조립 
 */
import java.util.Scanner;
public class 메소드_4_메소드변경 {
	
	// 입력
	static int input(String msg) {
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+" 입력:"); // 반복제거형식
		return scan.nextInt();
	}
	
	// 요일 구하기
	static int week(int year, int month) {
		int total=(year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400; // 전년도까지 합
		int[] lastday = {31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%4==0 && year%100!=0)|| year%400==0)
			lastday[1]=29;
		else 
			lastday[1]=28;
		for(int i=0;i<month-1;i++) {
			total+=lastday[i];
		} // 전달까지의 합
		
		total++; // 요청한 달의 1일까지의 총일수
		
		// 요청한 달의 1일의 요일
		return total%7;
	}
	
	// 출력
	static void print(int year,int month,int week) {
		int[] lastday = {31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%4==0 && year%100!=0)|| year%400==0) // 윤년조건
			lastday[1]=29; 
		else 
			lastday[1]=28; 
		String[] strWeek= {"일","월","화","수","목","금","토"};
		System.out.println(year+"년도 "+month+"월");
		System.out.println();
		for(String s:strWeek) {
			System.out.print(s+"\t");
		}
		System.out.println();
		for(int i=1;i<=lastday[month-1];i++) {
			if(i==1) // 매달 1일 전 공백을 주는 조건문 
			{
				for(int j=0;j<week;j++)
					System.out.print("\t");
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6) {
				week=0;
				System.out.println();
			}
		}
	}
	
	// process
	static void process() {
		int year=input("년도");
		int month=input("월");
		int week=week(year,month);
		print(year,month,week);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
