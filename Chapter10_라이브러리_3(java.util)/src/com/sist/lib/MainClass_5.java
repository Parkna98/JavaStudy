package com.sist.lib;
// => 메소드(340page)
// => 검색 
import java.util.*;

public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		// 정수만 메모리에 저장해서 관리
		/*
			Wrapper => 기본형을 클래스형으로
					   => 기능을 부여
					   => 제네릭을 사용
			=> 장점은 Wrapper클래스와 기본형이 호환
			Integer => 10,20,30.. 정수값과 호환
			Integer i=10; ==> int
		 */
		// 추가 => add()
		list.add(Integer.valueOf(10));
		list.add(20); // 호환되기때문에 valueOf쓸필요 없음
		list.add(30);
		list.add(40);
		list.add(50); 
		
		for(int i=0;i<list.size();i++) {
			int val=list.get(i); // 값을 받을때 Integer가 아닌 int로 받아도 무방
			System.out.println(i+":"+val);
		}
		System.out.println("======");
		list.add(3,60); // 가급적이면 사용하지 않는다
		for(int i=0;i<list.size();i++) {
			int val=list.get(i); 
			System.out.println(i+":"+val);
		}
		System.out.println("======");
		list.remove(3);
		for(int i=0;i<list.size();i++) {
			int val=list.get(i); 
			System.out.println(i+":"+val);
		}
		// 인덱스 번호는 0번부터 시작 
		// size() : 갯수 
		// 인덱스 초과시 오류발생
		// for-each 구문 => 데이터 갯수만큼만 수행
		System.out.println("======");
		for(int i:list)
			System.out.println(i);
		System.out.println("======");
		System.out.println("데이터 저장 갯수:"+list.size());
		System.out.println("데이터 존재 여부:"+list.isEmpty()); // 데이터가 있으면 false
		// isEmpty()   OR   list.size()==0 => 같은말
		// 라이브러리 => 메소드 isXxx() => boolean
		// 				   setXxx => void
		System.out.println("======");
		list.clear();
		System.out.println("데이터 저장 갯수:"+list.size());
		System.out.println("데이터 존재 여부:"+list.isEmpty()); // 데이터가 없으면 true
		/*
			setXxx
			getXxx
			isXxx 
			remove
			delete
		 */
	}

}
