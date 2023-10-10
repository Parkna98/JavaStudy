import java.util.*;
// 달력만들기 => static 변수사용
// static 변수로 year,month,week을 설정 => 여러 메소드에서 return과 매개변수 신경쓸필요없이
//										year,month,week을 가져다쓰면됨
public class MainClass2 {
	static int[] lastday= {
			31,28,31,30,31,30,31,31,30,31,30,31
	};
	static String[] strWeek= {"일","월","화","수","목","금","토"};
	static int year,month,week;
	// 클래스안에 있는 모든 메소드에서 사용이 가능
	// 년도, 월 입력
	static void userInput() // 전역변수(static)이기때문에 return값을 받지않고 바로 year,month에 저장하고 쓸수있음 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		year=scan.nextInt();
		System.out.print("월 입력:");
		month=scan.nextInt();
	}
	// 요일 구하기 ==> 전역변수(static)는 리턴형과 매개변수를 신경쓰지 않아도됨
	static void dayTotal() {
		int total = (year-1)*365
				+ (year-1)/4
				- (year-1)/100
				+ (year-1)/400;
		if((year%4==0 && year%100!=0) || year%400==0 ) {
			lastday[1]=29;
		}
		else lastday[1]=28;
		for(int i=0;i<month-1;i++) {
			total+=lastday[i];
		} // 전달까지의 합
		total++; // 
		
		week=total%7; // 앞에 int를 주면 지역변수로 저장됨. int를 빼야지 static변수로 저장됨
	}
	//출력
	static void print() {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userInput();
		dayTotal();
		print();
	}

}
