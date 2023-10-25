package com.sist.student;
import java.util.*;
// 액션 
/*
		클래스
		----
		1) 데이터 ==> 오라클의 column
		   ----------------------
		   데이터형을 만든다
		   => Music => 가수명, 제목, 앨범...
		   => Movie => 제목, 감독, 출연...
		   =======> 캡슐화
		   			변수의 읽기/쓰기 추가
		
		2) 사용자 요청 => 기능
		   -------- 목록출력, 상세보기, 찾기, 예매, 추천...
		   ====> 상속 / 포함 / 오버라이딩 
		   
		3) 데이터가 여러개일 경우 => 모아서 관리
		   => 컬렉션 / 배열
		   	  	ㅣ	  
		   	 계속 갱신이나 추가 ==> 가변형		 
		   	 => 배열대신 컬렉션을 이용해서 처리
		   	 		  -----
		   	 		  List => 중복허용, 순서(인덱스)
		   	 		   ㅣ
		   	 		  ArrayList => 비동기, 데이터베이스 프로그램 특성화
		   	 		  	=> 읽기 기능 => get() 
		   	 		  	=> 총 갯수 => size()
		   	 		  	=> 추가 => add()
		   	 		  	=> 실제 수정 => 오라클에서 수정, 삭제, 추가 => list에서 수정하면 프로그램종료시 메모리 휘발	
		   	 		  	 									-----
		   	 		  	 								파일 입출력시 읽는 목적등 
 */
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManager sm=new StudentManager();
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 학생 목록");
			System.out.println("2. 상세 보기");
			System.out.println("3. 추가 하기");
			System.out.println("4. 수정 하기");
			System.out.println("5. 삭제 하기");
			System.out.println("6. 학생 찾기");
			System.out.println("7. 프로그램 종료");
			System.out.println("===============");
			System.out.print("메뉴 선택:");
			int menu=scan.nextInt();
			if(menu==7) {
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			}
			else if(menu==1) {
				// 학생 정보를 받아서 출력
				ArrayList<Student> students=sm.studentAlldata();
				for(Student s:students) {
					System.out.println(s.getHakbun()+"."+s.getName());
				}
			}
			else if(menu==3) {
				// 학생 추가
				System.out.print("이름 입력:");
				String name=scan.next();
				System.out.print("국어 입력:");
				int kor=scan.nextInt();
				System.out.print("영어 입력:");
				int eng=scan.nextInt();
				System.out.print("수학 입력:");
				int math=scan.nextInt();
				Student std=new Student(sm.hakbunMaxData(), name, kor, eng, math);
				sm.studentInsert(std);
			}
			else if(menu==2) {
				// 상세보기 (학번입력시 해당학생 출력)
				System.out.print("상세보기할 학번 입력:"); // 웹에서는 클릭으로 대체 (어쩔수없이 도스창이라 입력받는중)
				int hakbun=scan.nextInt();
				Student std=sm.studentDetailData(hakbun);
				
				System.out.println("학번:"+std.getHakbun());
				System.out.println("이름:"+std.getName());
				System.out.println("국어:"+std.getKor());
				System.out.println("영어:"+std.getEng());
				System.out.println("수학:"+std.getMath());
				System.out.println("총점:"+(std.getKor()+std.getEng()+std.getMath()));
				System.out.printf("평균:%.2f\n",((std.getKor()+std.getEng()+std.getMath())/3.0));
			}
			else if(menu==4) {
				// 수정
				System.out.println("수정할 학번 입력:");
				int hakbun=scan.nextInt();
				System.out.print("이름 입력:");
				String name=scan.next();
				System.out.print("국어 입력:");
				int kor=scan.nextInt();
				System.out.print("영어 입력:");
				int eng=scan.nextInt();
				System.out.print("수학 입력:");
				int math=scan.nextInt();
				Student std=new Student(hakbun, name, kor, eng, math);
				sm.studentUpdate(std);
			}
			else if(menu==5) {
				// 삭제 (학번찾아서 삭제)
				System.out.print("삭제할 학생 학번 입력:");
				int hakbun=scan.nextInt();
				sm.studentDelete(hakbun);
			}
			else if(menu==6) {
				// 검색 (학생 이름으로 검색)
				System.out.print("검색할 학생 이름 입력:");
				String name=scan.next();
				ArrayList<Student> ss=sm.studentFindData(name);
				
				for(Student std:ss) {
					System.out.println(std.getHakbun()+"."+std.getName());
				}
			}
			
		}
	}

}
