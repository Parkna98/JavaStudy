// 1. 5명의 학생의 국어점수를 받아서 등수를 출력하는 프로그램 작성
// index 0번부터 뒤의 것들과 차례로 비교하면서 그것보다 큰값이 있으면 등수 +1씩 더하기
import java.util.Arrays;
import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] kor=new int[5];
//		Scanner scan=new Scanner(System.in);
//		for(int i=0;i<kor.length;i++) {
//			System.out.println(i+"번째 학생 국어점수 입력:");
//			kor[i]=scan.nextInt();
//		}
//		for(int i:kor) {
//			System.out.print(i+" ");
//		}
//		for(int i=0;i<kor.length-1;i++) {
//			for(int j=0;j<kor.length-1;j++) {
//				if(kor[j]>kor[j+1]) {
//					int temp=kor[j];
//					kor[j]=kor[j+1];
//					kor[j+1]=temp;
//				}
//			}
//		}
		int[] kor=new int[5];
		int[] rank=new int[5];
		
		//국어점수 등록
		for(int i=0;i<kor.length;i++) {
			kor[i]=(int)(Math.random()*50)+50;
		}
		System.out.println("국어점수 출력");
		System.out.println(Arrays.toString(kor));
		
		//등수구하기
		for(int i=0;i<rank.length;i++) {
			rank[i]=1;
			for(int j=0;j<kor.length;j++)
				if(kor[i]<kor[j]) {
					rank[i]++;
				}
		}
		
		// 결과출력
		for(int i=0;i<kor.length;i++) {
			System.out.println(kor[i]+" "+rank[i]); 
		}
	}

}
