package com.sist.main;

import com.sist.manager.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성먼저!
		MusicSystem ms=new MusicSystem();
		// 생성했으니 감춰둔 데이터 get으로 들고옴
		for(Music m:ms.getMusics()) {
			System.out.println(m.getMno() +"."+m.getTitle()+"("+m.getSinger()+")");
		}
	}

}
