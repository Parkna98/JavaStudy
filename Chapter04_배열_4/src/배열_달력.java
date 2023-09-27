import java.util.Scanner;
public class 배열_달력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언 => year, month => 입력 ===> 메소드
		/*int year,month;
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		year=scan.nextInt();
		
		System.out.print("월 입력:");
		month=scan.nextInt();
		// 처리 => 달력을 만들기 위한 처리 ==> 세부적(메소드가 많음)
		// => 1년 1월 1일 ~ 요청한 날짜 => 총 일수 % 7 => 요일 => 1일자 요일 확인
		// 1. 전년도까지의 합
		int total=(year-1)*365
					+(year-1)/4   // 윤년일때 +1
					-(year-1)/100 // 100년마다 -1 
					+(year-1)/400; // 400년마다 +1  ===> 윤년조건 ==> 프로그램에서 자주등장 ==> 메소드
		
		// 2. 전달까지의 합
		int[] lastday= {
				31,28,31,30,31,30,31,31,30,31,30,31		// 각 month의 마지막날
		};
		// 문제 발생 ==> 2월달 윤년이면 29일
		if((year%4==0 && year%100!=0) || (year%400==0))
			// 윤년이라면
			lastday[1]=29;
		else
			lastday[1]=28;
		
		// 전달까지의 합
		for(int i=0;i<month-1;i++) {
			total+=lastday[i];
		}
		// 3. +1
		total++;
		// 요일 구하기
		int week=total%7;
		char[] strWeek= {'일','월','화','수','목','금','토'};
		// 달력 출력 ==> 메소드
		// System.out.println(year+"년도 "+month+"월 1일은 "+strWeek[week]+"요일입니다");
		System.out.println(year+"년도 "+month+"월");
		System.out.println();
		for(int i=0;i<strWeek.length;i++)
			System.out.print(strWeek[i]+"\t");
		System.out.println();
		for(int i=1;i<=lastday[month-1];i++) {
			if(i==1) {
				for(int j=0;j<week;j++) {
					System.out.print("\t");
				}
			}
				System.out.printf("%2d\t",i);
				week++;
				if(week>6) {
					week=0;
					System.out.println();
				}
			}*/
		
		// 달력만들기
		// 변수선언
		int year,month;
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력:");  // 년도 입력
		year = scan.nextInt(); 
		
		System.out.println("월 입력:");
		month = scan.nextInt();
		
		int total = (year-1)*365
				+ (year-1)/4
				- (year-1/100)
				+ (year-1/400);
		
		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31}; // 각 달의 마지막 날
		// 2월 조건
		if((year%4==0 && year%100!=0) || year%400==0 ) {
			lastday[1]=29;
		}
		else lastday[1]=28;
		
		total++; // 
		
		int week=total%7;
		int[] strWeek= {'일','월','화','수','목','금','토'};
		
		// xxxx년 xx월 출력
		System.out.println(year+"년 "+month+"월 ");
		System.out.println();
		
		// 달력 출력
		for(int i=0;i<strWeek.length;i++) {
			System.out.println(strWeek[i]+"\t");
		}
		System.out.println();
		
		}
		
	}


