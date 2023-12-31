/*
 *		문자열
 *		----
 *			length() => 문자의 갯수
 *			substring() => 문자 자르기
 *			indexOf(), lastIndexOf() => 문자열 번호 찾기
 *			contains() => 포함
 *			startsWith()
 *			valueOf() => 문자열 변환
 *			replace()
 *			split() 
 *			-------------------------------------------
 */
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.URLEncoder;
public class 문자열_1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		// System.out.println(doc.toString());
		Elements title=doc.select("table.list-wrap a.title");
//		System.out.println("title");
		Elements singer=doc.select("table.list-wrap a.artist");
//		System.out.println("artist");
		Elements album=doc.select("table.list-wrap a.albumtitle");
//		System.out.println("artist");
		for(int i=0;i<title.size();i++) {
			System.out.println("순위:"+(i+1));
			System.out.println("곡명:"+title.get(i).text());
			System.out.println("가수명:"+singer.get(i).text());
			System.out.println("앨범:"+album.get(i).text());
			String msg=(i+1)+"|"+title.get(i).text()
					+"|"+singer.get(i).text()
					+"|"+album.get(i).text()+"|"+youtubeData(title.get(i).text())+"\r\n"; // 파일에 저장 => 다음에 사용할때 웹에서 데이터읽지않고 파일저장된거 가져다 쓸 수 있음
			System.out.println(msg);
			FileWriter fw=new FileWriter("c:\\javaDev\\genie.txt",true);
			fw.write(msg);
			fw.close();
			
		}
	}
	static String youtubeData(String title) {
		String key="";
		try {
			String url="https://www.youtube.com/results?search_query="
					+URLEncoder.encode(title,"UTF-8");
			Document doc=Jsoup.connect(url).get();
			Pattern p=Pattern.compile("/watch\\?v=[^가-힣]+");
			Matcher m=p.matcher(doc.toString());
			while(m.find()) {
				String s=m.group();
				key=s.substring(s.indexOf("=")+1,s.indexOf("\""));
				break;
			}
		}catch (Exception ex) {}

		return key;
	}

}
