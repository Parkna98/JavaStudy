package com.sist.main;
import java.io.*;
// regdate / genre / nation / grade / time / score / make_share
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
// 다음영화 넷플릭스
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Document doc=Jsoup.connect("https://movie.daum.net/premovie/netflix").get();
			Elements link=doc.select("ul.aniposter_ott div.item_poster strong.tit_item a");
			
			for(int i=0;i<link.size();i++) {
				//System.out.println(link.get(i).attr("href"));
				String subLink="https://movie.daum.net"+link.get(i).attr("href");
				Document doc2=Jsoup.connect(subLink).get();
				// 제목
				Element title=doc2.selectFirst("h3.tit_movie span.txt_tit");
				//System.out.println(title.text());
				// 디테일
				String regdate="개봉일 없음",genre="장르 없음",nation="국가 없음",grade="등급 없음",time="상영 시간 없음",score="평점 없음",make_share="누적 관객수 없음";
				Elements etc=doc2.select("div.detail_cont dl.list_cont dt");
				//System.out.println(etc);
				for(int a=0;a<etc.size();a++) {
					String ss=etc.get(a).text();
					//System.out.println(ss);
					if(ss.equals("장르")) {
						Element genre1=doc2.select("div.detail_cont dl.list_cont dd").get(a);
						genre=genre1.text();
					}
					else if(ss.equals("국가")) {
						Element nation1=doc2.select("div.detail_cont dl.list_cont dd").get(a);
						nation=nation1.text();
					}
					else if(ss.equals("등급")) {
						Element grade1=doc2.select("div.detail_cont dl.list_cont dd").get(a);
						grade=grade1.text();
					}
					else if(ss.equals("러닝타임")) {
						Element time1=doc2.select("div.detail_cont dl.list_cont dd").get(a);
						time=time1.text();
					}
					else if(ss.equals("평점")) {
						Element score1=doc2.select("div.detail_cont dl.list_cont dd").get(a);
						score=score1.text();
					}
					else if(ss.equals("누적관객")) {
						Element make_share1=doc2.select("div.detail_cont dl.list_cont dd").get(a);
						make_share=make_share1.text();
					}
					else if(ss.equals("개봉")) {
						Element regdate1=doc2.select("div.detail_cont dl.list_cont dd").get(a);
						regdate=regdate1.text();
					}
				
				}
				
//				Element dd1=doc2.select("div.detail_cont dl.list_cont dd").get(0);
//				Element dd2=doc2.select("div.detail_cont dl.list_cont dd").get(1);
//				Element dd3=doc2.select("div.detail_cont dl.list_cont dd").get(2);
//				Element dd4=doc2.select("div.detail_cont dl.list_cont dd").get(3);
//				Element dd5=doc2.select("div.detail_cont dl.list_cont dd").get(4);
//				System.out.println(dd1.text());
//				System.out.println(dd2.text());
//				System.out.println(dd3.text());
//				System.out.println(dd4.text());
//				System.out.println(dd5.text());
				
				Element poster=doc2.selectFirst("div.info_poster span.bg_img");
				String image=poster.attr("style");
				image=image.substring(image.indexOf("(")+1,image.lastIndexOf(")")); // 괄호() 안에있는 것만 짜름
				//System.out.println(image);
				
				String msg=title.text()+"|"
						+image+"|"
						+regdate+"|"
						+genre+"|"
						+nation+"|"
						+grade+"|"
						+time+"|"
						+score+"|"
						+make_share+"\r\n";
//				String msg=(i+1)+"|"
//						+title.text()+"|"
//						//+state.text()+"|"
//						+image+"|"
//						+regdate.text()+"|"
//						+dd2.text()+"|"
//						+dd3.text()+"|"
//						+dd4.text()+"|"
//						+dd5.text()+"\r\n";
				FileWriter fw=new FileWriter("c:\\java_data\\movie_netflix.txt",true);
				fw.write(msg);
				fw.close();
			}
		}catch(Exception ex) {}
	}	

}
