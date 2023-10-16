package com.sist.music;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MelonMusicSystem extends GenieMusicSystem {
	// 초기화블록은 상속제외기 때문에 초기화블록(예외처리부분)제외 나머지부분 전부 상속
	protected String title="멜론 Top50";
	//protected Music[] musics=new Music[50]; 눈에 안보이지만 상속된 상태
	/*
	 * 상속받은 것
	 * public Music[] musicAllData()
	 * public Music[] musicTitleFindData(String title)
	 * public Music[] musicSingerFindData(String singer)
	 * public Music musicDetailData(int mno)
	 */
	// 제외 => 초기화 블록, static, 생성자, private (protected는 상속됨)
	{
		try {
			Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			// 노래 제목
			Elements title=doc.select("div.wrap_song_info div.rank01");
			// 가수명
			Elements singer=doc.select("div.wrap_song_info div.rank02");
			// 앨범
			Elements album=doc.select("div.wrap_song_info div.rank03");
					
			for(int i=0;i<musics.length;i++) {
				musics[i]=new Music();
				musics[i].setMno(i+1);
				musics[i].setTitle(title.get(i).text());
				musics[i].setSinger(singer.get(i).text());
				musics[i].setAlbum(album.get(i).text());
			}
		}catch(Exception ex) {}
	}
}
