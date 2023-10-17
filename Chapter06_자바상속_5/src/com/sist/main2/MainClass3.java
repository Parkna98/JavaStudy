package com.sist.main2;
class Super{
	
}
class Sub extends Super{
	
}
public class MainClass3 {
	static String str;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super sssss; // ==> null인 상태 => sssss.XX 실행하면 NullPointerException => 주소값없음(생성자없음)
		Super s=new Sub();
		// Sub ss=new Super(); => Error! Super의 데이터형이 더 크기때문에 오류 (형변환필요) 
		// Sub ss=(Sub)new Super(); => Error! ClassCastException
		Sub ss=(Sub)s; // => 형변환
		
		Super sss=new Super();
		//Sub ssss=(Sub)sss; // Error! => ClassCastException => Sub생성자가 있어야함 (new Super()가 아니라 new Sub()로 들고와야함)
		
		char c=str.charAt(0); // NullPointerException => 주소값없는데 명령? 오류
	}

}
