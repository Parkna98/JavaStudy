package com.sist.main2;
import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add("홍길동");
		
		// String name=list.get(0); => Error! Object로 값이 넘어오기때문에 형변환해야함
		// 상위 클래스 리턴 => 반드시 형변환 => 라이브러리
		String name=(String)list.get(0);
		// 형변환 하기 귀찮아 => list를 처음부터 String으로 생성 => 제네릭스
		List<String> sList=new ArrayList<>();
		sList.add("홍길동");
		String name2=sList.get(0);
		
	}

}
