package com.sist.manager;
import java.util.*;
// Student클래스와 같은 패키지이므로 public변수 사용 가능
public class StudentSystem {
	public Student[] students=new Student[3]; // Student[]에도 public해야지 이 배열까지 다른패키지에서 쓴다. 없으면 클래스만 쓰고 변수는 못씀
	
	// 클래스에는 구현 불가!!
	// 구현하고싶으면? 생성자 or 초기화블록!!
	// void 메소드도 다른패키지에서 써야하므로 public!!!!
	public void input() {
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<students.length;i++) {
			students[i]=new Student();
			System.out.print("학번 입력:");
			students[i].hakbun=scan.nextInt();
			
			System.out.print("이름 입력:");
			students[i].name=scan.next();
			
		}
	}
}
