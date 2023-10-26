package com.sist.lib;
/*
		= 중복 데이터 => ArrayList
		= 중복이 없는 데이터 => HashSet
		= 두개를 저장해서 찾는다 => HashMap : 클래스 찾기, SQL문장 찾기
							 -------- Annotation
		-----------------------------
		(p349) 
		Map => 인터페이스
		--- 
		 ㅣ
		---------------------
		ㅣ					ㅣ
	HashTable			HashMap => HashTable을 보완
								=> 동기(순차적) / 비동기(동시다발)
								=> Ajax (비동기)
		특징
		= 두개를 동시에 저장(key,value)
		= key는 중복할 수 없다, value는 중복이 가능
			ex) ("id","hong")
				("id","shim") ==> get("id') => key중복불가
				
			ex) 책 => ISBN 5249687 / 책이름
				국가 => ko, en,...
		= 사용처
			웹에서 제공하는 90% 클래스 => Map을 이용하고 있다
			=> 데이터 전송
			   HttpServletRequest
			   ------------------ 서버에서 브라우저로 값 전송
			   setAttribute("id","hong")
			   setAttribute("pwd","1234")
			   => session / cookie
			    			------ 최신 방문 
		=> 라이브러리
			Spring ==> HashMap => key, 클래스 객체
				=> 클래스 관리 => 클래스 찾기 (DL) Dependency Log
							  --------- getBean("key")
				   객체의 생명주기 관리 => 생성 ~ 소멸
				   => WEB (라이브러리 일부)
				   
			MyBatis ==> 데이터베이스와 관련 => ORM
			 => SQL문장을 관리 => key
			---------------> 등록(XML,Annotation)
		=> 주요 메소드
			1) 저장 => put("key",value)
						  ---- 반드시 문자로 시작
			2) 읽기 => get(key) 
			--------------------------------
			프로그램 : 데이터가 많이 있다
				=> 구분
				ArrayList => 인덱스
				Set => 중복X
				Map => key
				오라클 => Primary Key
				-------------------- 정형화된 데이터
				비정형화 데이터 => 분석 => 시각화
							  ------------ 정형화된 데이터로 변경
							  	ㅣ
							  빅데이터 => 예측 (AI)
				Application => exe
				웹/모바일 => java
							ㅣ
						  kotlin
				분석 = python
				실시간 = 스칼라 
 */
import java.util.*;
public class MainClass_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map=new HashMap<String, String>(); // Map은 key,value 2개지정
		// 데이터 저장 => put() => 보통 value값에 클래스값을 넣어서 한번에 저장한다
		map.put("id", "hong");
		map.put("pwd", "1234");
		map.put("name", "홍길동");
		map.put("sex", "남자"); 
		map.put("addr", "서울");
		map.put("phone", "010-1111-1111");
		/*
		System.out.println("ID:"+map.get("id"));
		System.out.println("PW:"+map.get("pwd"));
		System.out.println("NAME:"+map.get("name"));
		System.out.println("SEX:"+map.get("sex"));
		System.out.println("ADDRESS:"+map.get("addr"));
		System.out.println("PHONE:"+map.get("phone")); */
		
		// 루프
		Set<String> set=map.keySet(); // keySet() : set에 key값을 모음
		System.out.println(set); // set에 key값 모아놔서 루프돌릴수있음
		for(String key:set) {
			System.out.println(key.toUpperCase()+":"+map.get(key));
		}
		// 읽는 순서는 저장된 순이 아님. 
		for(String s:map.values()) { // values() : value값만 모음
			System.out.println(s);
		}
		/*
				clear() : 전체 삭제 (복구안됨) /  delete() : 하나씩 삭제 (복구가능)
				get() : 해당키값이 실제 데이터를 읽기
				put() : 데이터를 저장할때 사용
				isEmpty() : 데이터가 있는지 여부
				size() : 저장 갯수
				keySet() : 키만 가지고 온다
				values() : 실제 저장된 값을 읽는 경우
		 */
	}

}
