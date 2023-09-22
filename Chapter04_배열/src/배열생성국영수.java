import java.util.Scanner;
public class 배열생성국영수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor=new int[3]; // int kor1,kor2,kor3 // int[3]은 3크기를 갖는 int배열 
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		double[] avg=new double[3];
		
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<3;i++) // 인덱스는 0번,1번,2번 순
		{
			System.out.println((i+1)+"번째 학생 국어:");
			kor[i]=scan.nextInt();
			
			System.out.println((i+1)+"번째 학생 영어:");
			eng[i]=scan.nextInt();
			
			System.out.println((i+1)+"번째 학생 수학:");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
			
		}
		for(int i=0;i<3;i++){
		System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n",kor[i],eng[i],math[i],total[i],avg[i]/3.0);
		}
	}

}
