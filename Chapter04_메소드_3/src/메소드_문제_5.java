// 년 월 일을 입력받아서 요일을 출력
import java.util.Scanner;
public class 메소드_문제_5 {

// 1.입력 2.전년도 3.전달 4.+day 5.요일 6.출력 7.조립 
	
	// 입력
	static int input(String msg) {
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+" 입력:");
		
		return scan.nextInt();
	}
	
	
	
	// 요일 구하기
	static String whatday(int year,int month,int day) {
		int total=(year-1)*365 +(year-1)/4 -(year-1)/100 + (year-1)/400;
		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%4==0 && year%100!=0) || year%400==0) 
			lastday[1]=29;
		else lastday[1]=28;
		for(int i=0;i<month-1;i++) {
			total+=lastday[i];
		}
		total+=day;
		int week=total%7;
		String[] strWeek={"일","월","화","수","목","금","토"};
		
		return strWeek[week];
	}
	
	// 출력
	static void print(int year,int month,int day,String week) {
		System.out.println(year+"년도 "+month+"월 "+day+"일은 "+week+"요일입니다");
	}
	
	// process()
	static void process() {
		int year=input("년도");
		int month=input("월");
		int day=input("일"); // 반복제거기법
		String week=whatday(year,month,day);
		print(year,month,day,week);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		
		///// 입력
		/*Scanner scan=new Scanner(System.in);
		System.out.print(" 입력:");
		int year=scan.nextInt();
		System.out.print(" 입력:");
		int month=scan.nextInt();
		System.out.print(" 입력:");
		int day=scan.nextInt();
		
		///// 요일
		//전년도까지의 총일수
		int total=(year-1)*365 +(year-1)/4 -(year-1)/100 + (year-1)/400;
		//전달까지의 총일수
		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%4==0 && year%100!=0) || year%400==0) 
			lastday[1]=29;
		else lastday[1]=28;
		
		for(int i=0;i<month-1;i++) {
			total+=lastday[i];
		}
		//--------------------+day
		total+=day;
		
		// 요일 => total%7 => 요일 출력 strWeek{"일",~,"토"}
		int week=total%7;
		
		String[] strWeek={"일","월","화","수","목","금","토"};
		
		System.out.println(year+"년도 "+month+"월 "+day+"일은 "+strWeek[week]+"요일입니다");*/
		
		
		
	}

}
