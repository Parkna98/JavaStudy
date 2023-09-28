// 6.100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D,
//   60점 이하면 F를 출력하라 (switch~case 사용)
import java.util.Scanner;
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		char score=' ';
		Scanner scan=new Scanner(System.in);
		System.out.print("점수 입력(100점만점):");
		num=scan.nextInt();
		int temp_num = num/10;
		
		switch(temp_num) // switch 조건에는 정수,문자,문자열만 가능 => 실수는 불가하므로 임시변수 미리 정수로 변환할것
		{
			case 10:
			case 9:
				score = 'A';
				break;
			case 8:
				score = 'B';
				break;
			case 7:
				score = 'C';
				break;
			case 6:
				score = 'D';
				break;
			default :
				score = 'F';
			
		}
		System.out.println(score+"학점입니다");
	}

}
