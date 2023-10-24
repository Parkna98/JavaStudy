package com.sist.lib;
/*
		Wrapper : 기본데이터형을 클래스화
			=> 기본데이터형에 기능을 부여해서 쉽게 사용이 가능
			int ==> Integer
			long ==> Long
			double ==> Double
			boolean ==> Boolean 
			-------------------- 웹에서 주로 사용
			=> 웹/윈도우 => 모든 데이터값 문자열 
			   			 ---------------
			   			 문자열을 정수, 실수, 논리형
			   	ex) 망고플레이트 크롤링시 평점 4.3 
			   		=> 읽어올때는 String
			   		   평점은 계속 바뀌므로 숫자를 변경하려면 Double로 바꿔야함 (Wrapper)
			=> Double.parseDouble("4.5") => 4.5
			   Integer.parseInteger("3") => int page=10
			   Boolean.parseBoolean("true") => true
			   		   --------------------
			   		   	HTML => checkbox
			   		   	 
			=> 제네릭 사용시 => 데이터형을 통일
			   ---- 메소드 => 리턴형, 매개변수
			   				------------ Object로받음 => 내가원하는 데이터형으로 받을래 => 제네릭스
			   **<Integer> ==> <> 안에는 클래스를 받아야함 => 기본형은 불가 => Wrapper클래스!
			   --------- 
			   배열 => 저장 (클래스) => Object => 변경 시 제네릭스 사용
			   class Box<T> ==> T(Object) (T:임시(temp))
			   { 
			   		T t=new T();
			   		void setT(T t){}
			   		T getT()
			   		{
			   			return T;
			   		}
			   }
			   Box<String> => T를 전부 String으로 변환
			   -----------
			   *** 오토박싱 / 언박싱
			   Integer i=10; => int와 같이 사용이 가능
			   int j=i; 	 => 정수에 클래스 대입
 */
import java.util.*;
public class MainClass_1 {
	static void aaa(Integer i) {
		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 오토박싱 / 언박싱
		Integer i=10; // 오토박싱 => 객체에 데이터값 입력가능 (원래는 객체에는 주소를 넣어야함)
		int j=new Integer(100); // 언박싱 => 기본데이터형에 객체주소를 넣기 가능
		System.out.println(i);
		
		aaa(j);
		
		List list=new ArrayList();
		list.add("a"); // 0
		list.add(10.5);
		list.add(10);
		list.add("A");
		list.add(new MainClass_1());
		// 데이터형이 모두 다르기때문에 for문으로 한번에 출력불가 => 처음부터 Integer로 받자
		
		List<Integer> intlist=new ArrayList<Integer>();
		// 제네릭스를 <Integer>를 써서 받을때 int만 받을 수 있게 설정
		intlist.add(5);
	}

}
