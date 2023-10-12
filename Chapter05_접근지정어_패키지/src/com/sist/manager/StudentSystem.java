package com.sist.manager;
// 같은 패키지상에 있을 경우, default/public/protected 만 접근가능 / private는 본인클래스만가능 
// import를 사용하지 않는다
// => 프랜들리
import java.util.*;
/*
 * 		캡슐화 / 오버라이딩 / 상속 / 포함
 * 		----   -------    ㅣ   ---
 * 						  ㅣPOJO(상속이 없는 클래스방식)	
 * 	  **1) 결합성 (결합성이 낮은것이 좋음) (상속이 없는 단독클래스가 최신유행)(Spring은 상속이 없음)
 * 		2) 응집성
 * 	  **3) 가독성
 * 		4) 최적화
 */
public class StudentSystem {
	public Student[] students=new Student[3];
	// 입력
	// 메소드 => 1.멤버메소드 2.static메소드 3.생성자메소드
	// 접근지정어 => public (클라이언트와 관리자가 쓸수있게) (변수만 private 나머진 public을 쓴다고 생각)
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<students.length;i++) {
			students[i]=new Student();
			System.out.print("학번 입력:");
			students[i].hakbun=scan.nextInt(); // scan은 public메소드(라이브러리는 모두 public)
			
			System.out.print("이름 입력:");
			students[i].name=scan.next();
			
			System.out.print("국어 입력:");
			students[i].kor=scan.nextInt();
			
			System.out.print("영어 입력:");
			students[i].eng=scan.nextInt();
			
			System.out.print("수학 입력:");
			students[i].math=scan.nextInt();
			
		}
	}
	
}
