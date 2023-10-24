package com.sist.music;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicManger mm=new MusicManger();
		// MusicManger에 있는것? => musicAllData! => 생성자
		Music[] m=mm.musicAlldata();
		for(Music ms:m) {
			System.out.println(ms.getRank()+"."+ms.getTitle());
		}
	}

}
