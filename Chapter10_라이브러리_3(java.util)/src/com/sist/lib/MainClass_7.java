package com.sist.lib;
/*
		List => add,remove,set,size,get,isEmpty
		=> List가 여러개 있는 경우 (JOIN)
		   contatinsAll : 두 개 list가 있는 경우 중복된 데이터 모아서 관리
		   retainAll : 두 개 list에서 중복된 데이터만 남기기
		   --------- 장바구니 => 중복 구매 
		   *** addAll : 데이터 전체 복사
		   subList : 부분적 데이터 복사
		   asList : 배열을 리스트로
		   
		   
 */
import java.util.*;
public class MainClass_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		Random r=new Random();
		for(int i=0;i<10;i++) {
			list.add(r.nextInt(100)+1);
		}
		for(int i:list) {
			System.out.print(i+" ");
		}
		System.out.println("\n==============================");
		
		// 부분적으로 데이터 추출 : subList
		ArrayList<Integer> list2=new ArrayList<Integer>(list.subList(0, 4));
		// end-1 (마지막인덱스는 포함안됨) => 마지막은 제외
		list2.add(r.nextInt(100)+1);
		list2.add(r.nextInt(100)+1);
		list2.add(r.nextInt(100)+1);
		list2.add(r.nextInt(100)+1);
		list2.add(r.nextInt(100)+1);
		for(int i:list2)
			System.out.print(i+" ");
		System.out.println("\n==============================");

		// 정렬
		Collections.sort(list); // Arrays는 배열 정렬! 리스트는 Collections.sort !!
		for(int i:list)
			System.out.print(i+" ");
		System.out.println("\n==============================");
		
		// 같은 데이터 추출
		System.out.println(list.containsAll(list2)); // false
		System.out.println(list.retainAll(list2)); // true => 메모리에 같은값만 남겨놓음 (주소값이 같아서 원형을 변경하는듯)
		for(int i:list)
			System.out.print(i+" ");
		System.out.println("\n==============================");
		
		// 전체 복사
		ArrayList<Integer> list3=new ArrayList<Integer>();
		list3.addAll(list);
		for(int i:list3)
			System.out.print(i+" ");
		
	}

}
