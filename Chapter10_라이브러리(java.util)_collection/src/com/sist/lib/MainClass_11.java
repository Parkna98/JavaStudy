package com.sist.lib;
import java.util.*;
public class MainClass_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,50,40,70,60,10,20,40};
		Set<Integer> set=new HashSet<Integer>();
		// 배열을 => list로 바꾸는 메소드 asList는 있지만
		// 배열을 => set으로 바꾸는 메소드는 없다
		// for-each 구문 사용해서 중복 지우기
		for(int a:arr) {
			set.add(a);
		}
		System.out.println(set);
		List<Integer> list=new ArrayList<Integer>(set); // list.addAll(set); 해도됨
		System.out.println(list); 
		System.out.println("===== 오름차순 정렬 =====");
		Collections.sort(list); // sort(List) 는 List를 매개변수로 받으므로 set을 정렬하려면 list에 받아야함 
		System.out.println(list);
		System.out.println("===== 내림차순 정렬 =====");
		Collections.reverse(list); // 역순정렬(매개변수 리스트)
		System.out.println(list);
		
		// ArrayList<?> list=new ArrayList<String>();
		//          --- 와일드카드 : 모든 데이터형을 받는경우 (오버라이딩할때 가끔등장) 
		// ArrayList list=new ArrayList(); ==> Object로 받는 것이 더 편할듯
	}

}
