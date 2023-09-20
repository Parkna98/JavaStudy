import java.util.Scanner;
public class 제어문_반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor,eng,math;
		int total;
		double avg;
		
		Scanner scan=new Scanner(System.in);
		/*		
		 * 		for(int i=1;i<=3;i++) {       // for문으로 while문 3번 돌리기 => 국어,영어,수학은 어떻게 바꿈? => 배열!
		 * 			while(true) { // 무한루프
						System.out.print("국어 점수 입력:");
						kor=scan.nextInt();
						if(kor>=0 && kor<=100) {
							break; // 종료
		 */
		while(true) { // 무한루프 ===> 반드시 종료 조건 ==> break; 
			System.out.print("국어 점수 입력:");
			kor=scan.nextInt();
			if(kor>=0 && kor<=100) {
				break; // 종료
			}
		}

		while(true) { // 무한루프
			System.out.print("영어 점수 입력:");
			eng=scan.nextInt();
			if(eng>=0 && eng<=100) {
				break; // 종료
			}
		}
		
		while(true) { // 무한루프
			System.out.print("수학 점수 입력:");
			math=scan.nextInt();
			if(math>=0 && math<=100) {
				break; // 종료
			} // 유효성 검사 => 원하는 값이 들어오도록 하는 것
		}
		total = kor+eng+math;
		avg = total/3.0;
		
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f",avg);
		
			
			
			

	}

}
