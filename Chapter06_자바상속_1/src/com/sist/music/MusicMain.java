package com.sist.music;
import java.util.*;
public class MusicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("선택(Genie(1),Melon(2)):");
		int select=scan.nextInt();
		// 상위클래스로 => 하위클래스를 제어 		A a=new B(); (A:상위 B:하위)
		GenieMusicSystem ms=null;
		if(select==1)
			ms=new GenieMusicSystem();
		else
			ms=new MelonMusicSystem();
		
		// 1. 전체 목록 읽기
		// System.out.println(ms.title); // => 상위클래스로 하위를 묶으면 변수는 상위클래스로 들어옴 / 메소드는 각자것을 가져옴
		Music[] m=ms.musicAllData();
		for(Music mm:m) {
			System.out.println(mm.getMno()+"."+mm.getTitle());
		}
		// 2. 검색
		System.out.println("=======================");
		System.out.println("가수명 입력:");
		String singer=scan.next();
		Music[] findData=ms.musicSingerFindData(singer);
		for(Music mm:findData) {
			System.out.println(mm.getTitle()+"("+mm.getSinger()+")");
		}
	}

}
