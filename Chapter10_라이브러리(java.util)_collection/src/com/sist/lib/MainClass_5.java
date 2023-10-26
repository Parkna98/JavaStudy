package com.sist.lib;
// 객체 중복 제거 => 객체비교는 극히 드물다 (보통은 데이터값만 비교)
// p347 참고 (객체중복관련)
import java.util.*;
class Student{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (name+age).hashCode(); // 해시코드가 같으면 주소값이 같다
	}
	@Override // 재정의
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		// 객체비교 => instanceof
		if(obj instanceof Student) {
			Student s=(Student)obj;
			return name.equals(s.name) && age==s.age;
		}
		return false;
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}

public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> set=new HashSet<Student>();
		Student s1=new Student("홍길동", 25);
		Student s2=new Student("홍길동", 25); 
		
		s1.setName("심청이"); // 오버라이딩 함수에서 조건이 이름과 나이가 동일한가 였는데
		s1.setAge(20);		// 값이 변경되어서 주소도 달라진다
		System.out.println("s2.name:"+s2.getName());
		System.out.println("s2.age:"+s2.getAge());
		// 위에서 equals와 hashcode 메소드를 재정의해서 원래는 new를 쓰면 메모리주소가 다르지만
		// 이름과 나이가 같으면 같게 만들었다
		
		/*if(s1.equals(s2)) { // 위에서 equals 재정의함
			System.out.println(s1+"=="+s2);
		}
		else {
			System.out.println(s1+"!="+s2);
		}*/
		set.add(s1);
		set.add(s2);
		System.out.println(set); // s1과 s2의 주소가 중복이기때문에 하나만 나옴 
	}

}
