package com.sist.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Document doc=Jsoup.connect("https://movie.daum.net/ranking/reservation").get();
			Elements title=doc.select("div.section_ranking strong.tit_item a");
			Elements poster=doc.select("div.section_ranking div.poster_movie img");
			Elements grade=doc.select("div.section_ranking span.txt_tag span");
			Elements score=doc.select("div.section_ranking span.txt_grade");
			Elements reserve=doc.select("div.section_ranking span.txt_append span.txt_num");
			Elements moviedb=doc.select("div.section_ranking div.thumb_cont a");
			
			/*
			 	<a href="/moviedb/main?movieId=171140" class="link_story" data-tiara-layer="poster">
			 	   ----------------------------------속성값 => attr("href") (태그안에)
               	화재로 어머니를 잃은 11살 소년…! ==> text() (태그밖에)
                </a>
			 */
			
			for(int i=0;i<title.size();i++) {
				System.out.println(title.get(i).text());
				System.out.println(poster.get(i).attr("src"));
				System.out.println(grade.get(i).text());
				System.out.println("평점:"+score.get(i).text());
				System.out.println("예매율:"+reserve.get(i).text());
				System.out.println(moviedb.get(i).attr("href"));
				//System.out.println(title.get(i).attr("href"));
			}
		}catch(Exception ex) {}
	}

}
