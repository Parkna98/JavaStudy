package com.sist.main;
import java.io.*;

import javax.print.Doc;
import javax.xml.parsers.FactoryConfigurationError;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Document doc=Jsoup.connect("https://movie.daum.net/ranking/reservation").get();
			Elements link=doc.select("div.section_ranking strong.tit_item a");
			for(int i=0;i<link.size();i++) {
				//System.out.println(link.get(i).attr("href"));
				String subLink="https://movie.daum.net"+link.get(i).attr("href"); // 영화 클릭하면 나오는 URL주소
				System.out.println(subLink);
				Document doc2=Jsoup.connect(subLink).get(); // 영화 하나를 클릭해서 들어간 상태
				// 제목
				Element title=doc2.selectFirst("h3.tit_movie span.txt_tit");
				System.out.println(title.text()); // 하나짜리라 Element 쓰기
				// state
//				Element state=doc2.selectFirst("h3.tit_movie span.txt_state");
//				System.out.println(state.text());
				
				// 디테일
				String regdate="개봉일 정보 없음",genre="장르 정보 없음",nation="국가 정보 없음",grade="등급 정보 없음",time="러닝타임 정보 없음",score="평점 정보 없음",make_share="누적관객 정보 없음";
				Elements etc=doc2.select("div.detail_cont dl.list_cont dt");
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
				//Elements detail=doc2.select("div.detail_cont dl.list_cont dd");
				//System.out.println(detail);
//				String temp="";
//				System.out.println(dd1.text());
//				System.out.println(dd2.text());
//				System.out.println(dd3.text());
//				System.out.println(dd4.text());
//				System.out.println(dd5.text());
//				for(int j=0;j<detail.size();j++) {
//					temp+=detail.get(j).text()+"|";
//					System.out.println(detail.get(j).text());
//				}
				
				Element poster=doc2.selectFirst("div.info_poster span.bg_img");
				String image=poster.attr("style");
				image=image.substring(image.indexOf("(")+1,image.lastIndexOf(")")); // 괄호() 안에있는 것만 짜름
				System.out.println(image);
				
//				String msg=(i+1)+"|"
//						+title.text()+"|"
//						+state.text()+"|"
//						+image+"|"
//						+dd1.text()+"|"
//						+dd2.text()+"|"
//						+dd3.text()+"|"
//						+dd4.text()+"|"
//						+dd5.text()+"\r\n";
//														
				String msg=title.text()+"|"
						+image+"|"
						+regdate+"|"
						+genre+"|"
						+nation+"|"
						+grade+"|"
						+time+"|"
						+score+"|"
						+make_share+"\r\n";
				//msg=msg.substring(0,msg.lastIndexOf("|")); // 맨마지막에 붙는 | 제거
				//msg+="\r\n";
				
				FileWriter fw=new FileWriter("c:\\java_data\\movie_reservation.txt",true);
				fw.write(msg);
				fw.close();
				
			}
		}catch(Exception ex) {}
	}

}
