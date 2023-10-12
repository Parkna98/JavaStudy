import java.util.*;
// 3명의 국영수점수받아 출력
// 필요한 기능: 3명점수 받아 저장후 출력
// 필요한 변수: 이름,국,영,수

class Std{
	int kor,eng,math;
	String name;
	
	Std(){
		name="홍길동";
		kor=92;
		eng=92;
		math=92;
	}
	
	Std(String name,int kor,int eng,int math){
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.name=name;
	}
}

class StdSystem{
	Std[] stds=new Std[3];
	StdSystem() {
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<stds.length;i++) {
			stds[i]=new Std();
			System.out.println((i+1)+"번째 이름 입력:");
			stds[i].name=scan.next();
			System.out.println((i+1)+"번째 국어 입력:");
			stds[i].kor=scan.nextInt();
			System.out.println((i+1)+"번째 영어 입력:");
			stds[i].eng=scan.nextInt();
			System.out.println((i+1)+"번째 수학 입력:");
			stds[i].math=scan.nextInt();
			// 위에 값을 받았으면 위의값들로 구성된 저장공간을 만들어줘야지
			stds[i]=new Std(stds[i].name,stds[i].kor,stds[i].eng,stds[i].math);
			}
		}
	
		void print() {
		for(int i=0;i<stds.length;i++) {
			System.out.printf("%-6s%-5d%-5d%-5d%-7d%-7.2f\n",stds[i].name,stds[i].kor,stds[i].eng,stds[i].math,
					stds[i].kor+stds[i].eng+stds[i].math,
					(stds[i].kor+stds[i].eng+stds[i].math)/3.0);
		}
	
	}
}	
	
public class MainClass2_1 {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdSystem s=new StdSystem();
		
		s.print();
	}

}
