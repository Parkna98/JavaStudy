/*
 * 		다중 조건문 => 결과값이 1개만 도출
 * 		형식)
 * 			if(조건문)
 * 			{
 * 				조건문이 true일 경우 수행하는 문장 ====> 종료
 * 				false인 경우 다음 조건문으로 넘어감
 * 			}
 * 			else if(조건문)
 * 			{
 * 				조건문이 true일 경우 수행하는 문장 ====> 종료
 * 				false인 경우 다음 조건문으로 넘어감
 * 			}
 * 			else if(조건문)
 * 			{
 * 				조건문이 true일 경우 수행하는 문장 ====> 종료
 * 				false인 경우 다음 조건문으로 넘어감
 * 			}
 * 			...
 * 			...
 * 			else(조건문) // 생략 가능 
 * 			{
 * 				해당하는 조건 없는 경우 수행
 * 			}
 * 
 * 			=> 한개의 문장만 수행
 * 			=> 게임, 네트워크 서버 (자바(x), C/C++)
 */
// 국어,영어,수학 점수를 입력받아서 => 총점,평균,학점,합격/불합격 출력
import java.util.Scanner;
public class 제어문_조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 데이터를 저장할 공간 => 변수
		int kor, eng, math, total;
		double avg;
		char score=' '; // 명시적인 초기화
		// 입력값을 받는다
		// 초기화
		
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 점수:");
		kor=scan.nextInt();
		System.out.print("영어 점수:");
		eng=scan.nextInt();
		System.out.print("수학 점수:");
		math=scan.nextInt();
		
		//총점
		total = kor+eng+math;
		//평균
		avg = total/3.0;
		
		// 학점 => 평균 => 90이상 'A', 80이상 'B', 70이상 'C', 60이상 'D', 60미만 'F'
		if(avg>=90)
			score='A';
		else if (avg>=80)
			score='B';
		else if (avg>=70)
			score='C';
		else if (avg>=60)
			score='D';
		else
			score='F';
		
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		System.out.println("학점:"+score);
		// 결과값을 출력 => 제어문, 연산자 ==> DOS, 브라우저, 모바일
		
		

	}

}
