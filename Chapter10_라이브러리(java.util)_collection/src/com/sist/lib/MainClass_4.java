package com.sist.lib;
import java.util.*;

import javax.swing.plaf.basic.BasicPopupMenuSeparatorUI;
// 중복데이터 제거
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"홍길동","심청이","이순신","박문수","강감찬",
						 "춘향이","이산","홍길동","심청이","박문수"};
		
		// 배열을 컬렉션으로 변경 => Arrays.asList(arr)
		List<String> list=Arrays.asList(names);
		
		// 출력
		for(String name:list) {
			System.out.println(name);
		}
		System.out.println("===== Set =====");
		
		// 중복 제거
		Set<String> set=new HashSet<String>();
		set.addAll(list); // addAll => 전부 복사
		// 중복된 데이터는 set에 저장되지 않는다 => 중복제거
		for(String s:set)
			System.out.println(s);
		
		System.out.println("===List에 정보 재입력===");
		List<String> list2=new ArrayList<String>();
		list2.addAll(set);
		for(String name:list2) {
			System.out.println(name);
		}
	}

}
