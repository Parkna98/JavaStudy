// 13. 3명의 학생에 대한 국어,영어,수학 점수를 입력받아서 저장후에 총점,평균,등수를 구하고 
// 국어점수 총점,영어점수 총점,수학점수의 총점을 구해서 출력하는 프로그램을 작성하시오
import java.util.Arrays;
public class 문제13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		int[] rank=new int[3];
		double[] avg=new double[3];
		
		//난수 생성
		for(int i=0;i<kor.length;i++) {
			kor[i]=(int)(Math.random()*50)+50;
			eng[i]=(int)(Math.random()*50)+50;
			math[i]=(int)(Math.random()*50)+50;
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		System.out.println("국어점수:"+Arrays.toString(kor));
		System.out.println("영어점수:"+Arrays.toString(eng));
		System.out.println("수학점수:"+Arrays.toString(math));
		System.out.println("총점:"+Arrays.toString(total));
		System.out.print("평균:");
		for(int i=0;i<kor.length;i++) {
			System.out.printf("%.2f\t",avg[i]);
		}
		//등수 구하기
		for(int i=0;i<rank.length;i++) {
			rank[i]=1;
			for(int j=0;j<rank.length;j++) {
				if(total[j]>total[i]) rank[i]++;
			}
		}
		System.out.println("\n순위:"+Arrays.toString(rank));
	}

}
