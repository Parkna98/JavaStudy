package com.sist.main2;
class Super{
	
}
class Sub extends Super{
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 묵시적 형변환 => 자동 형변환
		Super su=new Sub(); // 데이터형 (사용자정의) 
		// 기본형으로 생각해보면
		// double su=10
		
		// 강제 형변환
		Sub s=(Sub)su;
		// int a=(Sub)10.5;
		
		String str="";
		StringBuffer sb=new StringBuffer();
		Object obj=new Object();
		
		// 객체 비교 => instanceof
		if(str instanceof Object) // str은 Object 소속이다 (상속을 받았다)
			System.out.println("true");
		else
			System.out.println("false");
		
		if(sb instanceof Object) 
			System.out.println("true");
		else
			System.out.println("false");
		
		if(obj instanceof String) 
			System.out.println("true");
		else
			System.out.println("false");
		
		//if(sb instanceof String) ==> Error! => sb와 String은 아예 관계가 없다 
		//	System.out.println("true");
		//else
		//	System.out.println("false");
		
		if(obj instanceof Object) 
			System.out.println("true");
		else
			System.out.println("false");
		
	}

}
