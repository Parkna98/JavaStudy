package com.sist.exam;

public class MainClass_4 /*implements Runnable*/{
	public void run() {
		System.out.println("run Call...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* MainClass_4 m=new MainClass_4(); // 인터페이스 구현
		Thread t=new Thread(m);
		t.start();		// 아래 주석방법과 같은 결과  */
		
		/*Runnable r=()->{		// 람다식
			System.out.println("run Call...");
		};
		Thread t=new Thread(r);
		t.start();*/
		
		Runnable r=new Runnable() {		
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("run Call...");
			}
		};
		Thread t=new Thread(r);
		t.start();
		
		/*
				function aaa(){} => implements 
				let aaa=function(){}
				let aaa=()=>{} => 함수를 메소드의 주소값만 받아서 처리 => React,Vue
				메소드는 메소드명이 주소	   -----------메소드명
		 */
	}

}
