package com.sist.lib;
/*
		335page => 자바의 컬렉션 
				   --------- 자료구조 (데이터 관리)
				   => 데이터를 모아서 관리하는 클래스의 집합
				   	  -------------- CRUD
				   	  추가,읽기,수정,삭제
				   	  => 메모리에서 제어 => 영구적인 저장 불가
				   	  => 영구적인 저장 장치 : 파일 / 오라클
				   	  
		Collection => 인터페이스 
			ㅣ
		 -----------------------------------------
		 ㅣ					 ㅣ					 ㅣ
		List				Set					Map ==> 인터페이스(표준화)
		
		= List : 순서를 가지고 있다 (인덱스) ==> 배열의 보완 (고정적,같은데이터형만 취급)
									  ==> 가변형 (크기 지정X), Object(모든 데이터형 취급)
		 		 데이터의 중복을 허용한다
		 		 => ArrayList : Vector를 보완 => 비동기 => 데이터베이스 연동
		 		 => Vector : 동기 => 네트워크에서 접속자 정보를 저장
		 		 => LinkedList : C언어 개발자 => 호환
		--------------------------------------------------
			컬렉션		읽기(접근시간)		추가/삭제		비고
		--------------------------------------------------
		ArrayList		속도가 빠르다		느리다	순차적으로 추가/삭제는 빠르다 (중간에 추가삭제는 인덱스번호를 바꿔야하므로 느림)
												비효율적인 메모리 사용
						=> 웹 => 자체에서 추가/삭제를 하지 않는다
								오라클 
		--------------------------------------------------
		LinkedList		속도가 느리다		빠르다	데이터가 많을 수록 접근성이 떨어진다							
						=> 윈도우에서는 빠름 
		--------------------------------------------------
		= Set : 순서가 없다
				데이터의 중복을 허용하지 않는다 
				=> HashSet => 중복데이터를 만들 때
				=> TreeSet => 검색 최적화
		
		= Map : 순서가 없다
				데이터 중복을 허용한다
				key, value => 두항목이 세트로 만들어 진다
				--- key는 중복 불가 
				=> HashMap => 웹에서 가장 많이 사용
								1) 관련된 클래스 관리 => 스프링, MyBatis
								2) 웹소켓 (웹 네트워크) => sessionID
				=> HashTable => 단점을 보완 => HashMap 
		
		Collection => 데이터를 일정 공간에 모아서 관리할 목적
		---------- => 웹에서 목록출력 (모아서 => 브라우저 전송)
			1) 배열의 단점 보완 (저장 크기를 결정) => 고정적이다
				=> 크기 결정을 하지 않는다 (가변형)
			2) 인터페이스를 이용한다
			   ------- 표준화 (모든 개발자가 동일한 메소드를 이용)
			   => 프레임워크 : Spring / MyBatis / JQuery / VueJS / ReactJS => 코딩방식이 동일(표준화)
			   		ㅣ 일정 기본 틀 => 쉽게 다른 개발자의 코딩을 분석
			   		  ---------- 유지보수
		 
		List
		----
		1. ArrayList
			= 장점
				배열형식으로 만들어져 있다 => 인덱스를 이용해서 처리
									  접근속도가 빠르다
			= 단점
				중간에 추가/삭제 => 속도가 저하
			= 항상 인덱스 번호는 순차적으로 유지
				0 1 2 3 4 5 
				=> 3삭제
				0 1 2 3 4 => 자동처리
				
				0 1 2 3 4 5
				=>   ㅣ추가
				0 1 2 3 4 5 6	
				 	  - ------원래 인덱스에서 +1씩됨
				 	  추가
			= 사용
				데이터의 양이 일관적이고 추가, 삭제가 없는 경우에 주로 사용
				=> 데이터베이스
				데이터의 접속 속도를 중요시 할때 (웹)
				ArrayList
				---------------------
					10	20	30	40
				---------------------
					0	1	2	3
					
				LinkedList
				---- ---- ---- ----
				 10---20---30---40
				---- ---- ---- ---- 
			
				=> 주요 메소드 ==> 웹(공유=>오라클)
				   --------
				   ***1) 추가
				   		add(데이터)
				   		add(int index, 데이터) => index위치에 추가 => 속도 저하
				   2) 수정
				   		set(int index, 데이터) => index위치 데이터의 변경
				   3) 삭제
				   		remove(int index)
				   ***4) 읽기
				   		get(int index)
				   ***5) 저장 갯수 
				   		size() 
				   6) 전체 지우기
				   		clear()
				   ------------ 메소드는 동일 (List)
				
				
		
 */
import java.util.*;
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList(); // Object
		// 가급적이면 같은데이터 입력이 유리
		// 추가
		list.add("홍길동"); // 0번이 맨처음
		list.add("심청이"); // 1
		list.add("이순신"); // 2
		list.add("강감찬"); // 3
		list.add("춘향이"); // 4
		
		// 출력
		for(int i=0;i<list.size();i++) {
			Object name=list.get(i); // 데이터 읽기
			System.out.println(i+"."+name);
		}
		// 추가
		System.out.println("==== 추가 ====");
		list.add(2,"을지문덕"); // 인덱스 2번에 을지문덕 추가 => 해당데이터부터 그뒤는 하나씩 밀림
		for(int i=0;i<list.size();i++) {
			Object name=list.get(i); // 데이터 읽기
			System.out.println(i+"."+name);
		}
		// 삭제 remove(int index)
		System.out.println("==== 삭제 ====");
		list.remove(3); // 인덱스 3번 삭제 => 뒤의 데이터들 하나씩 당겨옴
		for(int i=0;i<list.size();i++) {
			Object name=list.get(i); // 데이터 읽기
			System.out.println(i+"."+name);
		}
		// 수정 set(int index, 데이터)
		System.out.println("==== 수정 ====");
		list.set(2,"박문수"); // 인덱스 2번 수정
		for(int i=0;i<list.size();i++) {
			Object name=list.get(i); // 데이터 읽기
			System.out.println(i+"."+name);
		}
		// 갯수 size()
		System.out.println("==== 갯수 ====");
		System.out.println("현재 인원:"+list.size());
		// 전체 삭제 clear()
		System.out.println("=== 전체삭제 ===");
		list.clear();
		System.out.println("현재 인원:"+list.size());
		/*
				add() => 데이터 추가
				size() => 저장된 갯수 
				get() => 읽기
				remove() => 삭제
				set() => 수정
				clear() => 전체 삭제
		 */
	}

}
