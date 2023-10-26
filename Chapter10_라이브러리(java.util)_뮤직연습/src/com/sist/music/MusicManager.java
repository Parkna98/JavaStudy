package com.sist.music;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class MusicManager {
	// 목록 생성
	private static ArrayList<Music> list=new ArrayList<Music>();
	
	static {
		try {
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements poster=doc.select("table.list-wrap a.cover img");
			Elements title=doc.select("table.list-wrap td.info a.title");
			Elements singer=doc.select("table.list-wrap td.info a.title");
			Elements album=doc.select("table.list-wrap td.info a.title");
			
			for(int i=0;i<poster.size();i++) {
				Music music=new Music();
				music.setRank(i+1);
				music.setPoster("http:"+poster.get(i).attr("src")); // attribute(속성값 읽을때사용)
				music.setTitle(title.get(i).text());
				music.setSinger(singer.get(i).text());
				music.setAlbum(album.get(i).text());
				
				list.add(music);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	// 목록 출력
	public ArrayList<Music> musicAllData(){
		return list;
	}
		
	// 상세보기
	public Music musicDetailData(int no) {
		Music m=new Music();
		for(Music mm:list) {
			if(mm.getRank()==no) {
				m=mm;
				break;
			}
		}
		return m;
	}
	
	// 검색
	public ArrayList<Music> musicFind(String title){
		ArrayList<Music> m=new ArrayList<Music>();
		for(Music mm:list) {
			if(mm.getTitle().contains(title)) {
				m.add(mm);
			}
		}
		return m;
	}
	
}
