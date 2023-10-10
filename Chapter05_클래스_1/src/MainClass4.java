// 클래스 => 데이터형 => 배열 사용이 가능
import java.util.*;
class Std 		// 같은폴더내에서 Student라는 이름의 클래스를 사용하고있기때문에 Std로 변경
{
	String name;
	int kor;
	int eng;
	int math;
}
// 3명의 학생 => 이름 국어 영어 수학 총점 평균
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Std[] std=new Std[3]; // 객체배열 => 일반배열과 동일
		// => 메모리 할당이 아니다... 배열선언
		// std[0]=null
		// std[1]=null
		// std[2]=null
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<std.length;i++) {
			std[i]=new Std(); // 주소를 꼭 선언해줘야함 
			System.out.print((i+1)+"번째 이름 입력:");
			std[i].name=scan.next();
			
			System.out.print((i+1)+"번째 국어 입력:");
			std[i].kor=scan.nextInt();
			
			System.out.print((i+1)+"번째 영어 입력:");
			std[i].eng=scan.nextInt();
			
			System.out.print((i+1)+"번째 수학 입력:");
			std[i].math=scan.nextInt();
			
		}
		// 출력
		for(int i=0;i<std.length;i++) {
			System.out.printf("%-7s%-5d%-5d%-5d\n",std[i].name,std[i].kor,std[i].eng,std[i].math);
		} */
		
		Std[] std=new Std[3];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<std.length;i++) {
			std[i]=new Std(); // ****Std의 인스턴스변수를 사용하기 위해 주소값 설정
			System.out.print((i+1)+"번째 이름 입력:");
			std[i].name=scan.next();
			
			System.out.print((i+1)+"번째 국어 입력:");
			std[i].kor=scan.nextInt();
			
			System.out.print((i+1)+"번째 영어 입력:");
			std[i].eng=scan.nextInt();
			
			System.out.print((i+1)+"번째 수학 입력:");
			std[i].math=scan.nextInt();
		}
		// 출력
		for(int i=0;i<std.length;i++) {
			System.out.printf("%-7s%-5d%-5d%-5d\n",std[i].name,std[i].kor,std[i].eng,std[i].math);
		}
	}

}
