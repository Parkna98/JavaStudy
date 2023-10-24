package com.sist.lib;
/*
		1. java.util
			=> 프로그램에서 많이 사용되는 유용한 클래스의 집합
			=> 반드시 import를 사용한다
			
			1) 날짜
			 	Date / Calendar ==> Date에 없는 기능 확장 Calendar
			 		   -------- 예약
			2) 문자열 분해
				StringTokenizer 
			3) 자료구조 : 메모리에서 데이터를 쉽게 관리할 수 있게 만든 클래스
			   ------ 컬렉션*******
			   		  ---- 가변형 (크기결정 X)
			   표준화 (모든 개발자가 동일하게 사용)
			   => CRUD => 읽기/쓰기/수정/삭제
			   	  Collection => interface
			   	  	   ㅣ
			--------------------------------------------
			ㅣ		   			ㅣ					   ㅣ
		  List		  			Set				   	  Map
		  = 데이터의 중복 허용  		= 데이터 중복 불가		  = 키, 값으로 저
		  = 순서가 있다(인덱스이용)	= 순서가 없다			  = 순서가 없다
		  -------									  = 데이터 중복 허용
		  => 데이터베이스 사용시에 주로사용					  = 키는 중복 불가
		  											  --------------
		  											  => 클래스 관리(스프링, 웹)
		  = List (interface)
		    ----
		     ㅣ List를 구현한 클래스
		---------------------------------
		ㅣ				ㅣ				ㅣ
	**ArrayList		 Vector  		LinkedList
										ㅣ
									  Queue
									  
	  ArrayList : 오라클에 있는 데이터 저장해서 제어 => 브라우저
	  			  ------------------------
	  			  	=> 데이터베이스 관련 => 비동기 방식
	  			  	
	  Vector : 동기 방식 => 네트워크 (사용자의 정보 => IP,PORT) 
	  	*** Vector의 단점을 보완 ArrayList (대부분 ArrayList사용)
	  
	  LinkedList : C호환 => 수정, 삭제, 추가
	  			  	=> 읽기는 ArrayList가 빠름
	  			  	
	  ==> *** 인터페이스 구현이기때문에 메소드가 같음
	  ------------------------------------------------
	  
	
		  = Set
		    ---
		     ㅣ Set을 구현한 클래스
		-----------------
		ㅣ				ㅣ		
	**HashSet		  TreeSet
	
		  = Map
		    ---
		     ㅣ Map을 구현한 클래스
		-----------------
		ㅣ				ㅣ		
 	**HashMap		   HashTable
	
		  
 */
import java.util.*;
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new LinkedList(); // 동일 인터페이스이기 때문에 ArrayList,Vector,LinkedList는 서로 변경해서 써도 무방 
									//	 	프로그램에 따라 쓸것 정함
		list.add("홍길동");
		list.add("심청이");
		list.add("박문수");
		
		for(Object name:list) { // 제네릭스 안썼으니까 Object로 받아와야함!!
			System.out.println(name);
		}

	}

}
