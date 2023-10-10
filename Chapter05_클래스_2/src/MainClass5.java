// try.jsoup.org
// fetch URL => 원하는 페이지소스
// 가져오고싶은 정보의 가장큰 클래스 안에있는 클래스 입력
/*
 * 		명령어 모르겠으면 Query참고
 * 	ex) https://movie.daum.net/ranking/reservation (다음영화 예매페이지)
 * 		원하는 정보 : 몇세이상관람가
 * 		페이지소스에서 원하는 정보 찾기
 * 		정보가 소속된 클래스 찾기
 * 		검색
 * 		큰 클래스 (공백) 작은 클래스
 * 		원본
 * 		<span class="txt_tag">
 * 		<span class="ico_movie ico_see see12">12세이상관람가</span>
 * 		검색
 * 		span.txt_tag span.ico_movie
 * 		=> 꺽쇠 뒤쪽부터 가져와서 class= 과 " 지우고 클래스만 .으로 클래스만 입력
 * 
 * 		=> 해당 정보 모두 들고옴
 */
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
