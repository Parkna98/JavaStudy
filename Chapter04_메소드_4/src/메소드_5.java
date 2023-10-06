/*
 * 		1.  반복이 많은 경우
 * 		ex) (오라클)
 * 			오라클 연결
 * 			오라클 닫기 => 중복되는 여닫기를 메소드로 만들어서 반복제거
 * 			데이터 추가
 * 				= 오라클 연결
 * 				= 데이터 추가 처리 	
 * 				= 오라클 닫기
 * 			데이터 수정
 * 				= 오라클 연결
 * 				= 데이터 수정 처리 	
 * 				= 오라클 닫기
 * 				= 
 * 			데이터 삭제
 * 				= 오라클 연결
 * 				= 데이터 삭제 처리 	
 * 				= 오라클 닫기
 * 			데이터 검색
 * 				= 오라클 연결
 * 				= 데이터 검색 처리 	
 * 				= 오라클 닫기
 * 			------------------ ==> 오라클 열고 닫기 반복됨 
 * 									==> 메소드!
 * 
 * 		2. 다른 클래스와 연결
 * 		   ------------- 웹
 * 		   
 * 		3. 재사용 => 미리 제작하고 필요시마다 호출
 * 		   ---- 기능을 한가지만 수행하게 만든다
 * 		   
 *   	=> 자바/오라클/HTML/CSS/JavaScript (기본)
 *   	=> JSP/Spring/Spring-Boot (응용) ==> 서버단(Back-End)
 *   	   DBCP MyBatis   JPA
 *   	   ------------	  ----	
 *   		오라클		 My-SQL
 *   	   --------------------
 *   		=> DataBase 연동
 *   		---------------- 웹 흐름 ====> Front(Jquery,Ajax)
 *   		=> Spring => 라이브러리 (기능) ==> Front(VueJS==>Vuex)
 *   		=> 실무에서 사용하는 기술 ==> Front(ReactJS==>Redux)
 */
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
public class 메소드_5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 점수 입력 받기
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		int[] rank=new int[3];
		char[] score=new char[3];
		double[] avg=new double[3];
		
		// Call By Reference  ==> 주소값 가져오기 <===> Call By Value(값만 가져오기)
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
		// 학점
		for(int i=0;i<score.length;i++) {
			switch((int)(avg[i]/10.0)) {
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
		// 등수
		for(int i=0;i<rank.length;i++) {
			rank[i]=1;
			for(int j=0;j<rank.length;j++) {
				if(total[i]<total[j])
					rank[i]++;
			}
		}
		// 출력
		for(int i=0;i<kor.length;i++) {
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-5c%-5d\n",kor[i],eng[i],math[i],total[i],avg[i],score[i],rank[i]);
		}
	}

}
