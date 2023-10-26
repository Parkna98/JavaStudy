package com.sist.lib;
/*	
			Set (인터페이스)
		 	 ㅣ
		---------------------
		ㅣ					ㅣ
	 HashSet			 TreeSet
	 ---------------------------
	 	특징)
	 		= 순서가 없다 (인덱스가 없다)
	 		= 데이터 중복 불가
	 		= 장르별, 부서별 ...
	 		= 데이터베이스 : DISTINCT
	 		
	 	=> HashSet : 속도가 빠르다 
	 	=> TreeSet : 정렬, 검색속도
	 	------------------------ List에 저장 => 중복 제거
	 		= 주요 메소드
	 			데이터 저장 : add(Object) 
	 			삭제 : remove(Object)
	 			전체 삭제 : clear()
	 			데이터를 한번에 모아서 관리 : iterator()
	 			TreeSet => LIKE, REGEXP_LIKE (오라클)
	 				= headSet
	 				= tailSet
	 			ex) 최근 본 레시피 => 연속으로 방문해도 최근에 하나만 띄워지게
	 				쿠키(Set 이용)
	 	
 */
import java.util.*;
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>();
		set.add("B");
		set.add("A");
		set.add("C");
		set.add("D");
		set.add("E");
		//// 중복값은 저장안됨
		set.add("B");
		set.add("A");
		set.add("C");
		
		// 출력
		for(String s:set)
			System.out.print(s+" ");
	}

}
 