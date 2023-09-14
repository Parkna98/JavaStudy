/*
 * 		연산자
 * 		----- 메소드(기능수행)
 * 		
 */
// 외부라이브러리 갖고오기 자바폴더 우클릭 - Build Path - configure path - class path 선택 - add external - apply
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.*;
public class 연산자정리 {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("검색어 입력:");
		String fd=scan.next();
		
		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		Elements title=doc.select("a.title");
		Elements singer=doc.select("a.artist");
		for(int i=0;i<50;i++)
		{
			if(title.get(i).text().contains(fd)) 
			{
			System.out.println(title.get(i).text()
					+ "("+singer.get(i).text()+")"
					);
			}
		}
		
	}

}
