import java.util.*;
/*
 * 		int aaa(int a,int b) ==> 지역변수를 쓰면 날라가기때문에 return을써서 값을 도출함
 * 		{
 * 			return a+b;
 * 		}
 * 		
 * 		int a,b; => 멤버변수를 쓰면 프로그램종료전까지 쓸수 있기때문에 return을 받을 필요가 없음 + 다른클래스에 사용가능
 * 		{
 * 			void aaa(){
 * 			}
 * 		}
 */
class Student{
	String name; // null
	int kor,eng,math; // 0,0,0
	// 매개변수 / 지역변수 => stack에 저장
	// 멤버변수 => heap에 저장 =========> 저장되는 위치가 서로 다르기때문에 변수이름이 같아도 가능
	// 매개변수 / 지역변수 ==> 메소드 안에서만 사용 => 자동 메모리 해제
	Student(String name, int kor, int eng, int math){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		
		// 지역변수, 매개변수 => 멤버변수에서 찾는다
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] std=new Student[3]; // 한명의 정보만 저장한다면 매개변수받지않고, 명시적 초기화가 더 편할것.
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<std.length;i++) {
			System.out.print((i+1)+"번째 이름 입력:");
			String name=scan.next();
			
			System.out.print((i+1)+"번째 국어 입력:");
			int kor=scan.nextInt();
			
			System.out.print((i+1)+"번째 영어 입력:");
			int eng=scan.nextInt();
			
			System.out.print((i+1)+"번째 수학 입력:");
			int math=scan.nextInt();
			
			std[i]=new Student(name, kor, eng, math); // 초기화하면서 객체 생성
		}
		// 출력
		for(int i=0;i<std.length;i++) {
			System.out.printf("%-6s%-5d%-5d%-5d%-7d%-7.2f\n",std[i].name,std[i].kor,std[i].eng,std[i].math,
					std[i].kor+std[i].eng+std[i].math,
					(std[i].kor+std[i].eng+std[i].math)/3.0);
		}
		
//		ArrayList<Student> list=new ArrayList<Student>();
//		list.add(new Student("",0,0,0));
	}

}
