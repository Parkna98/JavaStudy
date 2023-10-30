package com.sist.main;
import java.io.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainClass_1_연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Document doc=Jsoup.connect("https://movie.daum.net/premovie/netflix").get();
			Elements link=doc.select("ul.aniposter_ott div.item_poster strong.tit_item a");
			//System.out.println(link.get(0).attr("href"));
			for(int i=0;i<link.size();i++) {
				//System.out.println(link.get(i).attr("href"));
				String subLink="http://movie.daum.net"+link.get(i).attr("href");
				Document doc2=Jsoup.connect(subLink).get();
				Element title=doc2.selectFirst("h3.tit_movie span.txt_tit");
				System.out.println(title.text());
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
