package com.sist.lib;
import java.util.*;
public class MainClass_12 {
	// 제네릭 => 매개변수
	public static void display1(ArrayList<Integer> list) {
		for(int i:list)
			System.out.print(i+" ");
	}
	public static void display2(ArrayList<Double> list) { // ==> 위아래는 같은메소드임 (입력형식만 다를뿐)
		for(double d:list)
			System.out.print(d+" ");
	}
	public static void display3(ArrayList<String> list) {
		for(String s:list)
			System.out.print(s+" ");
	}
	public static void display4(ArrayList<?> list) { // <?>랑 <Object>와 같음 ==> 가독성차이
		for(Object s:list)
			System.out.print(s+" ");
	}
	// display(double d) ==> display(10) 
	// ArrayList<String> list=new ArrayList<String>();
	// display5(list) => Object
	public static void display5(ArrayList list) {
		for(Object o:list)
			System.out.print(o+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		display5(list); // 2,3번 불가
		System.out.println();
		
		ArrayList<Double> list1=new ArrayList<Double>();
		list1.add(10.0);
		list1.add(15.0);
		list1.add(20.0);
		display2(list1);
		System.out.println();
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		display3(list2);
	}

}
