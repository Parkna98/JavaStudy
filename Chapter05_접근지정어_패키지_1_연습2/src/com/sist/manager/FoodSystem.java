package com.sist.manager;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FoodSystem {

	public static Food[] getFoods() {
		return foods;
	}

	public static void setFoods(Food[] foods) {
		FoodSystem.foods = foods;
	}
	private static Food[] foods=new Food[10];
	
	static {
		try {
			Document doc=Jsoup.connect("https://www.mangoplate.com/top_lists/3069_eolkeunhan_kalguksu").get();
			Elements name=doc.select("h3");
			Elements address=doc.select("p.etc");
			for(int i=0;i<foods.length;i++) {
				foods[i]=new Food();
				foods[i].setFno(i+1);
				foods[i].setName(name.get(i).text());
				foods[i].setAddress(address.get(i).text());
			}
		}catch(Exception ex) {}
		
	}
	
}
