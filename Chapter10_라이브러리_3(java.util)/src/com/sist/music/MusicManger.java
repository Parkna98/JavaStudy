package com.sist.music;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

// 크롤링 => 데이터를 모아서 저장 => 메모리에 저장 (프로그램 실행시마다 크롤링할수는 없으므로 파일에 저장, 오라클에 저장해서 가져오기)
// 크롤링 => 파일
// 크롤링 => 오라클
// -----------------> 브라우저에 출력
public class MusicManger {
	// Music 전체 데이터 => 클라이언트 접속자에게 공유 => static
	private static ArrayList<Music> list=new ArrayList<Music>();
	// 크롤링
	// 초기화 => static블록, 인스턴스블록, 생성자
	static 
	{
		try {
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get(); // HTML소스코드 가져오기
			// poster <img>태그 모으기
			Elements poster=doc.select("table.list-wrap a.cover img"); // img만 하게되면 노래사진말고 사이트에 떠있는 다른 사진 다 가지고옴
			// title
			Elements title=doc.select("table.list-wrap td.info a.title");
			// singer
			Elements singer=doc.select("table.list-wrap td.info a.artist");
			// album
			Elements album=doc.select("table.list-wrap td.info a.albumtitle");
			
			for(int i=0;i<poster.size();i++) {
				Music music=new Music();
				music.setRank(i+1);
				music.setPoster("http:"+poster.get(i).attr("src")); // attribute(속성값 읽을때사용)
				music.setTitle(title.get(i).text()); // text() : <a> dddd </a> 태그 사이의 값 읽기
				music.setSinger(singer.get(i).text());
				music.setAlbum(album.get(i).text());
				
				list.add(music);
			}
			
		}catch(Exception ex) {ex.printStackTrace();}
	}
	
	// 목록 출력
	public ArrayList<Music> musicAllData(){
		return list;
	}
	
	// 상세 보기
	public Music musicDetailDate(int no) {
		Music music=new Music();
		for(Music m:list) {
			if(m.getRank()==no) {
				music=m;
				break;
			}
		}
		return music;
	}
	
	// 검색
	public ArrayList<Music> musicFindData(String title){
		ArrayList<Music> arr=new ArrayList<Music>();
		for(Music m:list) {
			if(m.getTitle().contains(title)) {
				arr.add(m);
			}
		}
		return arr;
	}
}
