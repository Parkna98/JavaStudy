package com.sist.manager;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MusicSystem {
	// ****** musics의 값도 private 이므로 get set 해줘야지!!!!
	
	private static Music[] musics=new Music[50]; // 데이터는 감추지만 static으로 곡의 순위가 변경되면 전체가 변경되는 식으로 적용!

	public static Music[] getMusics() {
		return musics;
	}

	public static void setMusics(Music[] musics) {
		MusicSystem.musics = musics;
	}

	// Music의 인스턴스값을 갖는 musics배열을 만들었으니 크롤링해서 노래를 넣어야함 
	// 값을 저장해야하는데(구현이니까 블록생각) 하나하나 넣어도 모든 배열에서 적용되야하므로 static!! => static 블록을 쓰자!
	static {
		try {
			// 값 추출
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get(); // HTML 소스 get
			Elements title=doc.select("table.list-wrap td.info a.title");
			Elements singer=doc.select("table.list-wrap td.info a.artist");
			
			// 추출한 값을 musics[]에 저장
			for(int i=0;i<title.size();i++) {
				// musics[i]에 대해서 값을 넣어줘야하므로 메모리 공간 생성이 먼저!!
				musics[i]=new Music();
				musics[i].setMno(i+1);
				musics[i].setTitle(title.get(i).text());
				musics[i].setSinger(singer.get(i).text());
			}
			
		}catch(Exception ex) {}
	}
}
