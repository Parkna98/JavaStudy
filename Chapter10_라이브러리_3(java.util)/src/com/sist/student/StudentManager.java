package com.sist.student;
import java.util.*;
// 리턴형과 매개변수를 잘 생각하자

public class StudentManager {
	private static ArrayList<Student> list=new ArrayList<Student>();
	// 여러면 저장
	// 초기화 => 생성자 이용
	public StudentManager() {
		list.add(new Student(1,"홍길동",89,77,98));
		list.add(new Student(2,"심청이",80,94,75));
		list.add(new Student(3,"춘향이",75,80,90));
		list.add(new Student(4,"이순신",64,75,95));
		list.add(new Student(5,"박문수",58,67,80));
	}
	// 목록 출력
	public ArrayList<Student> studentAlldata(){
		return list;
	}
	
	// 상세 보기
	public Student studentDetailData(int hakbun) {
		Student s=new Student();
		for(Student std:list) {
			if(std.getHakbun()==hakbun) {
				s=std;
				break;
			}
		}
		return s;
	}
	
	// 자동증가 => sequence ==> 중복없는 데이터를 만든다
	// Oracle => CREATE SEQUENCE
	// MY_SQL => auto_increment()
	public int hakbunMaxData() {
		int max=0;
		for(Student std:list) {
			if(max<std.getHakbun())
				max=std.getHakbun();
		}
		return max+1;
		// 학생 추가시에 다음학번을 주기위함
	}
	// 학생 추가 => add
	// 추가, 수정 ==> 매개변수가 많다 (클래스로 전송)
	// 순서없이 처리
	public void studentInsert(Student std) {
		list.add(std);
		System.out.println("학생 추가 완료!");
	}
	
	// 학생 수정 => set
	public void studentUpdate(Student std) {
		int index=0;
		for(int i=0;i<list.size();i++) {
			Student s=list.get(i);
			if(s.getHakbun()==std.getHakbun()) {
				index=i;
				break;
			}
		}
		list.set(index, std);
		System.out.println("수정이 완료되었습니다!");
	}
	
	
	// 학생 삭제 => remove
	/*
		인덱스 : remove(int idx), set(int idx,데이터)
		나머지는 for-each로
	 */
	public void studentDelete(int hakbun) {
		for(int i=0;i<list.size();i++) { 	// 삭제는 인덱스번호가 필요해서 for-each를 쓰지 않음
			Student s=list.get(i);
			if(s.getHakbun()==hakbun) {
				list.remove(i);
				System.out.println(hakbun+"학번을 삭제하였습니다");
				break;
			}
		}
	}
	
	// 학생 찾기 => contains (검색) ==> 검색하면 여러개나오니까 ArrayList!!!
	public ArrayList<Student> studentFindData(String name){
		ArrayList<Student> s=new ArrayList<Student>();
		for(Student std:list) {
			if(std.getName().contains(name))
				s.add(std);
		}
		return s;
	}
	
}
