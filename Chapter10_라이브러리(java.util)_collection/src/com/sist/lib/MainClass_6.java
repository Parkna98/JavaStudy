package com.sist.lib;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
// 멜론:곡명, 지니뮤직:곡명 => 중복이 안된 곡만 추출
// 공통 / 차집합 / 교집합 / 합집합
public class MainClass_6 {
	public static Set<String> genieMusic() {
		Set<String> set=new HashSet<String>();
		try {
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title=doc.select("table.list-wrap a.title");
			for(int i=0;i<title.size();i++) {
				set.add(title.get(i).text());
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return set;
	}
	public static Set<String> melonMusic() {
		Set<String> set=new HashSet<String>();
		try {
			Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title=doc.select("div.wrap_song_info div.rank01 a");
			for(int i=0;i<title.size();i++) {
				set.add(title.get(i).text());
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return set;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> genie=genieMusic();
		System.out.println("============= Genie Music ==============");
		for(String title:genie) {
			System.out.println(title);
		}
		System.out.println("============= Melon Music ==============");
		Set<String> melon=melonMusic();
		for(String title:melon) {
			System.out.println(title);
		}
		// System.out.println("====== 지니뮤직에만 있는 노래 ======");
		
		// 차집합 => removeAll() => MINUS(Oracle)
		// [1,2,3,4,5]-[1,2,3,6,7] = [4,5]
		/*genie.removeAll(melon);
		for(String title:genie) {
			System.out.println(title);
		}*/
		
		// 교집합 => retainAll
		/*System.out.println("====== 지니뮤직과 멜론에 공통적인 노래 ======");
		genie.retainAll(melon);
		System.out.println("곡 수:"+genie.size());
		for(String title:genie) {
			System.out.println(title);
		}*/
		
		// 합집합 => 중복된것도 다 들고오려면 => List  
		// 합집합에서 중복된것을 하나만 띄우려면 => Set으로 가지고오면됨
		// list.addAll(genie); list.addAll(melon); ==> genie와 melon의 전체를 (중복포함) 추가
		// genie.addAll(melon); ==> genie는 Set이므로 melon에 있는 것중 중복제외 전체 추가
		System.out.println("====== 지니뮤직+멜론 ======");
		List<String> list=new ArrayList<String>();
		list.addAll(genie);
		list.addAll(melon); // 데이터값 전체 추가 addAll
		// 중복된값 다들고오기 => oracle : UNION ALL
		for(String title:list) {
			System.out.println(title);
		}
	}

}
