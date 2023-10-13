package com.sist.main;

class Sawon{
	int sabun;
	String name;
}
// 클래스 => 데이터베이스에 있는 값을 채워 온다 => 매개변수를 이용해서 처리
// 배열 / 클래스는 모두 적용 (예외 : String => 일반 변수) => String은 값만 넘어감(기본형취급)
// Page 160참조
public class MainClass4 {
	
	// 메모리 주소 전송 => 메모리 주소에 있는 변수값 변경
	// Call By Reference 
	static void change(Sawon sa) // Sawon sa=s 
	{
		sa.sabun=2;
		sa.name="이순신";
		// 참조형 => 원본 변경 (String 제외) (Call By Reference)
		// 기본형 => 복사본 => 값만 전송 (Call By Value)
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s=new Sawon();
		s.sabun=1;
		s.name="박문수";
		
		System.out.println(s.sabun);
		System.out.println(s.name);
		
		change(s); // 메모리 주소 전송법
		System.out.println(s.sabun);
		System.out.println(s.name);
	}

}
