package com.sist.io;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
// 입출력 => IO
// ---- 메모리 제어 ==> IO를 이용해서 파일로 전송 // 직렬화
class Student{
	private int hakbun;
	private String name;
	private int kor,eng,math;
	private int total;
	private double avg;
	
	// 기능 => 읽기/쓰기 (getter/setter) => 캡슐화
	
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
}
class StudentManager{
	private static ArrayList<Student> list=new ArrayList<Student>();
	static {
		FileReader fr=null;
		try {
			// 1|홍길동|90|95|85|270|90.00\n
			fr=new FileReader("c:\\java_data\\student.txt");
			String data="";
			int i=0;
			while((i=fr.read())!=-1) {
				data+=(char)i;
			}
			// 한명의 정보 저장(한줄)
			String[] stds=data.split("\n"); // 읽고자하는 파일에 데이터가 없으면 오류날 가능성
			for(String s:stds) {
				StringTokenizer st=new StringTokenizer(s,"|");
				Student ss=new Student();
				ss.setHakbun(Integer.parseInt(st.nextToken()));
				ss.setName(st.nextToken());
				ss.setKor(Integer.parseInt(st.nextToken()));
				ss.setEng(Integer.parseInt(st.nextToken()));
				ss.setMath(Integer.parseInt(st.nextToken()));
				ss.setTotal(Integer.parseInt(st.nextToken()));
				ss.setAvg(Double.parseDouble(st.nextToken()));
				list.add(ss);
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			try {
				fr.close();
			}catch(Exception ex) {}
		}
	}// 파일을 읽어서 초기화
	
	// 전체목록
	public ArrayList<Student> studentAllData(){
		return list;
	}
	// 학생 한명에 대한 상세보기
	public Student studentDetailDate(int hakbun) {
		Student ss=new Student();
		for(Student s:list) {
			if(s.getHakbun()==hakbun) {
				ss=s;
				break;
			}
		}
		return ss;
	}
	// 학생 추가
	public void studentInsert(Student ss) {
		list.add(ss);
	}
	// 학생정보수정
	public void stdentUpdate(int hakbun,Student ss) {
		int i=0; // 인덱스
		for(i=0;i<list.size();i++) {
			Student s=list.get(i);
			if(s.getHakbun()==hakbun) {
				break; // 인덱스번호를 구하는 과정 (원하는 항목 인덱스구하면 break)
			}
		}
		list.set(i, ss);
	}
	// 학생정보삭제
	public void studentDelete(int hakbun) {
		int i=0; // 인덱스
		for(i=0;i<list.size();i++) {
			Student s=list.get(i);
			if(s.getHakbun()==hakbun) {
				break; // 인덱스번호를 구하는 과정 (원하는 항목 인덱스구하면 break)
			}
		}
		list.remove(i);
	}
	// SAVE => 위의 CRUD를 수행하고 파일에도 저장하기 위함
	// 파일에서는 중간에 수정,삭제 등이 어렵기 때문에 
	// 제어는 ArrayList에서 하고 결과를 파일에 저장하는 식
	public void save() {
		FileWriter fw=null;
		try {
			fw=new FileWriter("c:\\java_data\\student.txt");
			String msg="";
			for(Student s:list) {
				msg+=s.getHakbun()+"|"
						+s.getName()+"|"
						+s.getKor()+"|"
						+s.getEng()+"|"
						+s.getMath()+"|"
						+s.getTotal()+"|"
						+s.getAvg()+"\r\n";
			}
			msg.substring(0,msg.lastIndexOf("\r\n")); // \r\n는 제외
			fw.write(msg);
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(Exception ex) {}
		}
	}
	// 
	public void getRead() {
		
	}
}
public class MainClass_Example_2 {

}
