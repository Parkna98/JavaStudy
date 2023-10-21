package com.sist.exception;

public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 선택적인 부분 ==> 오류 발생시 제외 
		//				=> 오류 발생시 종료 => 밖에 try~catch
		//				=> 오류 발생시 해당것 제외하고 나머지는 계속 => for문 안에 try~catch => 크롤링
		//try {
			for(int i=1;i<=10;i++) {
				try {
				int j=(int)(Math.random()*3);
				System.out.println("j="+j+",i="+i+","+"i/j="+(i/j));
				// j=0이 나온순간 오류 => 반복문 종료 => catch 이동 
				// 반복문 10번을 다 돌리고싶다면? try~catch절을 for문 안에 쓴다면 => 오류 난 부분 제외 (continue)
				}catch(Exception ex) {System.out.println("pass");}
			}
		//}catch(Exception ex) {}
	}

}
