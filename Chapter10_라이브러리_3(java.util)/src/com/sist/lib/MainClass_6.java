package com.sist.lib;
/*
		ArrayList<클래스> 
				 ------
				 ㅣ 기본형 ==> Integer, String
				 	=> 사용자 정의 클래스
				 ArrayList<Music>
				 ArrayList<Moive>
				 ArrayList<Food>
				 ----------------- Object => 형변환 (제네릭스)
 */
import java.util.*;

public class MainClass_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names1=new ArrayList<String>();
		names1.add("홍길동");
		names1.add("박문수");
		names1.add("심청이");
		names1.add("이순신");
		names1.add("춘향이");
		for(String name:names1) {
			System.out.println(name);
		}
		System.out.println("======");

		ArrayList<String> names2=new ArrayList<String>();
		names2.add("홍길동");
		names2.add("박문수");
		names2.add("심청이");
		names2.add("이몽룡");
		names2.add("강감찬");
		for(String name:names2) {
			System.out.println(name);
		}
		System.out.println("======");
		ArrayList<String> temp=new ArrayList<String>();
		temp.addAll(names1);  // addAll  데이터의 복사 (다른 컬렉션에 데이터 추가)
		for(String name:temp) {
			System.out.println(name);
		}
		System.out.println("=======");
		temp.retainAll(names2); // 같은 데이터를 추가 (교집합) (temp와 names2에서 같은 데이터를 전부 가져온다)
		for(String name:temp) {
			System.out.println(name);
		} // 같은 데이터 찾기 => JOIN, INTERS
	}
	
}
