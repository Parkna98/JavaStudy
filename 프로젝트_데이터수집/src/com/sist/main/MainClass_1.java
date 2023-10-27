package com.sist.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String html="<html>"
						+"<body>"
						+"<div id=aaa>"
						+"<div class=bbb>Hello Java</div>"
						+"<a href=daum.net></a>"
						+"</div>"
						+"<div id=ccc>"
						+"<div class=ddd>Hello Java2</div>"
						+"<img src=aaa.png>"
						+"</div>"
						+"<div class=kkk>"
						+"<div>Java</div>"
						+"</div>"
						+"<div class=kkk>"
						+"<div>Oracle</div>"
						+"</div>"
						+"<div class=kkk>"
						+"<div>HTML</div>"
						+"</div>"
						+"<div class=kkk>"
						+"<div>JSP</div>"
						+"</div>"
						+"<div class=kkk>" // 구분자가 kkk로 모두 같은경우에는 한번에 갖고오자
						+"<div>Spring</div>"
						+"</div>"
						+"</body>"
						+"</html>";
			Document doc=Jsoup.parse(html,"UTF-8");
			//System.out.println(doc);
			// 값1개는 Element, 값2개는 Elements
			// id => #, class => .
			Element elem=doc.selectFirst("div#aaa div.bbb"); // selectFirst => 한개만
			System.out.println(elem.text());  // text() => 사이에있는 값 호출
			Element elem2=doc.selectFirst("div#ccc div.ddd");
			System.out.println(elem2.text());
			// 이미지 가져오기 => attr()
			Element elem3=doc.selectFirst("div#ccc img");
			System.out.println(elem3.attr("src"));
			// 태그안에 들어있는 값 => attr() // 태그밖에 있는 값 => text()
			Element elem4=doc.selectFirst("div#aaa a");
			System.out.println(elem4.attr("href"));
			// 같은 태그인 데이터 여러개 모을때 => Elements
			Elements div=doc.select("div.kkk div"); // kkk에 들어있는 div를 갖고와라
			//System.out.println(div);
			for(int i=0;i<div.size();i++) {
				System.out.println(div.get(i).text());
			}
		}catch(Exception ex) {}
	}

}
