package com.sist.manager;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import lombok.Getter;
import lombok.Setter;

public class MusicSystem {
	@Getter
	@Setter
	// musics의 데이터를 저장하고 가져오기 위함 
	private static Music[] musics=new Music[50]; // 배열이나 컬렉션은 주로 static인거 체크
	// 이번에는 return값을 받아서 해보기 => public이 안들어가도됨 // return이 없으면 public있어야지 musics를 가져다 쓴다
	// static이기 때문에 생성자가 필요없음 => static블록을 쓰자!
	static // static블록 => static 초기화 => musics에 값을 채우기위함 => 리턴으로 받아서 main으로 전달하기 위함 
	{
		// 초기화 블록 => static변수만 사용 (인스턴스변수는 생성자쓰기) => 자동 인식
		// 상속은 불가능 => 호출없이 실행이 가능
		// 생성자를 이용할 수 있다 (더편한거 고르기)
		// static은 method area에 바로 저장되기때문에, 메모리공간을 할당할 필요가 없다 
		// 			=> new를 쓸필요가 없다 => 생성자가 필요없을 수 있다 => 초기화블록을 써도된다
		// 1. 예외처리 => io(파일,메모리,네트워크) => 프로그램의 정상 종료
		try
		{
		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get(); // 해당페이지의 HTML소스를 가져온다
		Elements title=doc.select("table.list-wrap td.info a.title");     // Elements : HTML의 태그를 가져오는 메소드(Jsoup) (한개는 Element)
		// 위의 HTML소스코드에서 제목을 추출하기위해 가져오는것 (제목이포함된 태그를 가져와야함)
		//System.out.println(title);
		Elements singer=doc.select("table.list-wrap td.info a.artist");	
		Elements album=doc.select("table.list-wrap td.info a.albumtitle");	
		
		for(int i=0;i<title.size();i++) {
			musics[i]=new Music(); // 주소 할당
			musics[i].setMno(i+1); //1~50까지의 값 저장
			musics[i].setTitle(title.get(i).text()); 
			musics[i].setSinger(singer.get(i).text()); 
			musics[i].setAlbum(album.get(i).text()); 
			// musics[i].title => private처리를 했기때문에 바로가져오지는 못한다
			// set을 통해 받아온 값을 Music 클래스의 멤버변수 title에 저장한다
		}
		}catch(Exception ex) {}
	}
}
