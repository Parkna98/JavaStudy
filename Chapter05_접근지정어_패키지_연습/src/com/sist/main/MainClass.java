package com.sist.main;

import com.sist.manager.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentSystem ss=new StudentSystem();
		ss.input();
		for(Student s:ss.students) {
			System.out.println(s.hakbun);
			System.out.println(s.name);
		}
	}

}
