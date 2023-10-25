package com.sist.manager;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MusicSystem {
	
	public static Music[] getMusics() {
		return musics;
	}

	public static void setMusics(Music[] musics) {
		MusicSystem.musics = musics;
	}

	private static Music[] musics=new Music[50];
	
	static {
		try {
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get(); //HTML소스코드 가져오기
			Elements title=doc.select("table.list-wrap td.info a.title");
			Elements singer=doc.select("table.list-wrap td.info a.artist");
			
			// 값 추출했으니 값을 저장해야함
			for(int i=0;i<musics.length;i++) {
				// musics[i]에 값을 넣어줘야하므로 공간부터 생성
				musics[i]=new Music();
				musics[i].setMno(i+1);
				musics[i].setTitle(title.get(i).text());
				musics[i].setSinger(singer.get(i).text());
			}
		}catch(Exception ex) {}
		
	}
}
