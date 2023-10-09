// 1. 국어,영어,수학 점수 입력 => 총점, 평균 출력
import java.util.*;
public class 메소드_문제_3 {
	
	/*// 입력
	static int[] score() {
		int[] sc=new int[3];
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 입력:");
		sc[0]=scan.nextInt();
		System.out.print("영어 입력:");
		sc[1]=scan.nextInt();
		System.out.print("수학 입력:");
		sc[2]=scan.nextInt();
		return sc;
	}*/
	
	// 더 효율적 입력 => 반복해서 쓰면됨
	static int userInput(String msg) {
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+" 입력:");
		int num=scan.nextInt();
		return num;
	}
	
	
	// 총점
	static int total(int kor, int eng, int math) {
		return kor+eng+math;
	}
	
	// 평균
	static double avg(int total) {
		return total/3.0;
	}
	
	// 학점
	static char grade(int avg) {
		char c='A'; // switch는 실수못받음
		switch(avg) {
		case 10: case 9:
			c='A'; break;
		case 8:
			c='B'; break;
		case 7:
			c='C'; break;
		case 6:
			c='D'; break;
		default:
			c='F';
		}
		return c;
	}
	
	// 출력
	static void print(int kor,int eng,int math,int total,double avg,char c) {
		System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c\n",kor,eng,math,total,avg,c);
	}
	
	// process()
	static void process() {
		int kor=userInput("국어");
		int eng=userInput("영어");
		int math=userInput("수학");
		int total=total(kor,eng,math);
		double avg=avg(total);
		char c=grade((int)(avg/10));
		print(kor,eng,math,total,avg,c);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process();
		
		/*Scanner scan=new Scanner(System.in);
		System.out.print("국어 입력:");
		int kor=scan.nextInt();
		System.out.print("영어 입력:");
		int eng=scan.nextInt();
		System.out.print("수학 입력:");
		int math=scan.nextInt();
		
		int total=kor+eng+math;
		double avg=total/3.0;
		
		System.out.printf("%-5d%-5d%-5d%-7d%-7.2f\n",kor,eng,math,total,avg);*/
		
	}

}
