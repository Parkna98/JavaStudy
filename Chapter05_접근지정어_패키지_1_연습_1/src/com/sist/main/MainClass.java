package com.sist.main;
import com.sist.manager.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicSystem ms=new MusicSystem();
		// 시스템 생성했으면 감쳐둔 값 들고오기
		for(Music m:ms.getMusics()) {
			System.out.println(m.getMno()+"."+m.getTitle());
		}
	}

}
