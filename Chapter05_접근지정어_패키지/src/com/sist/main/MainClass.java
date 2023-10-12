package com.sist.main;
// 패키지가 다르면 => 반드시 클래스 사용시에 import 
import com.sist.manager.*; // Student, StudentSystem을 사용할 수 있다 
						   // Class는 public이라 쓸수있지만 변수도 public을 써야 패키지가 달라도 변수를 쓸 수 있다.
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentSystem ss=new StudentSystem();
		ss.input();
		for(Student s:ss.students) {
			System.out.println(s.hakbun); // 변수들을 public으로 해서 쓸수는 있는데 데이터가 노출됨
			System.out.println(s.name);
			System.out.println(s.kor);
			System.out.println(s.eng);
			System.out.println(s.math);
			System.out.println("===========");
		}
	}

}
