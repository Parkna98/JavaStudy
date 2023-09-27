// 1. 5명의 학생의 국어점수를 받아서 등수를 출력하는 프로그램 작성
import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor=new int[5];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<kor.length;i++) {
			System.out.println(i+"번째 학생 국어점수 입력:");
			kor[i]=scan.nextInt();
		}
		for(int i:kor) {
			System.out.print(i+" ");
		}
		for(int i=0;i<kor.length-1;i++) {
			for(int j=0;j<kor.length-1;j++) {
				if(kor[j]>kor[j+1]) {
					int temp=kor[j];
					kor[j]=kor[j+1];
					kor[j+1]=temp;
				}
			}
		}
	}

}
