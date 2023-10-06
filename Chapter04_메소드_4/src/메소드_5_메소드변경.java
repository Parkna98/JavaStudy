/*
 * 		3명의 학생의 국어,영어,수학 => 총점,평균,학점,등수
 * 		--------------------------------------
 * 		1. 입력
 * 		2. 총점
 * 		3. 평균
 * 		4. 학점
 * 		5. 등수
 * 		6. 출력
 */

import java.util.*;
public class 메소드_5_메소드변경 {
	
	// 많은 배열을 매개변수로 쓸경우 Call By Reference =
	// 배열은 자동으로 값을 채워주기때문에 미리 배열변수를 잡고 
	// 매개변수에 모든 배열을 넣고 그 후에 채워줘도 된다
	// 배열,클래스는 주소값에 저장하기때문에 지워지지않는다
	
	// 입력(Call By Reference)
	static void input(int[] kor,int[] eng,int[] math,int[] total,double[] avg) {
		for(int i=0;i<kor.length;i++) {
			Scanner scan=new Scanner(System.in);
			System.out.print((i+1)+"번째 학생 국어 점수 입력:");
			kor[i]=scan.nextInt();
			System.out.print((i+1)+"번째 학생 영어 점수 입력:");
			eng[i]=scan.nextInt();
			System.out.print((i+1)+"번째 학생 수학 점수 입력:");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
	}
	
	// score
	 static void scoreChonge(double[] avg,char[] score)
	    {
	    	for(int i=0;i<score.length;i++)
	        {
	        	switch((int)(avg[i]/10.0))
	        	{
	        	case 10:
	        	case 9:
	        		score[i]='A';
	        		break;
	        	case 8:
	        		score[i]='B';
	        		break;
	        	case 7:
	        		score[i]='C';
	        		break;
	        	case 6:
	        		score[i]='D';
	        		break;
	        	default:
	        		score[i]='F';
	        	}
	        }
	    }
	// rank
	static void rankChange(int[] total,int[] rank)
    {
    	for(int i=0;i<3;i++)
        {
        	rank[i]=1;
        	for(int j=0;j<3;j++)
        	{
        		if(total[i]<total[j])
        		{
        			rank[i]++;
        		}
        	}
        }
    }
	// print
	static void print(int[] kor,int[] eng,int[] math,
    		int[] total,double[] avg,char[] score,
    		int[] rank)
    {
    	for(int i=0;i<3;i++)
        {
        	System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-5c%-5d\n",
        			kor[i],eng[i],math[i],total[i],avg[i],score[i],rank[i]);
        }
    }
	
	// process
	static void process()
    {
    	int[] kor=new int[3];
        int[] eng=new int[3];
        int[] math=new int[3];
        int[] total=new int[3];
        int[] rank=new int[3];
        char[] score=new char[3];
        double[] avg=new double[3];
        input(kor, eng, math, total, avg);
        scoreChonge(avg, score);
        rankChange(total, rank);
        print(kor, eng, math, total, avg, score, rank);
    }
	
	
	/*
	// 입력(국,영,수)
	static int[] input(String msg) {
		int[] student=new int[3];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<student.length;i++) {
			System.out.print((i+1)+"번째 학생 "+msg+" 점수 입력:");
			student[i]=scan.nextInt();
		}
		return student;
	}
	
	// 총점 
	static int[] getTotal(int[] kor, int[] eng, int[] math) {
		int[] total=new int[3];
		for(int i=0;i<kor.length;i++) {
			total[i]=kor[i]+eng[i]+math[i];
		}
		return total;
	}
	
	// 평균
	static double[] getAvg(int[] total) {
		double[] avg=new double[3];
		for(int i=0;i<total.length;i++) {
			avg[i]=total[i]/3.0;
		}
		return avg;
	}
	*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
