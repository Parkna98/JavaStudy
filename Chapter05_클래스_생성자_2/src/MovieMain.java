import java.util.*;
import java.io.*;
// 사용자 정의 데이터형
/*
 * 		1|
 * 		쇼생크 탈출|
 * 		드라마|
 * 		https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|
 * 		팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)|
 * 		2016 .02.24 재개봉, 1995 .01.28 개봉|
 * 		15세 관람가|
 * 		프랭크 다라본트
 */
// 데이터 클래스
class Movie{
	String rank;
	String title;
	String genre;
	String poster;
	String actor;
	String regdate;
	String grade;
	String director;
}

// 액션클래스
class MovieSystem{
	static Movie[] movies=new Movie[1938];
	
	// 생성자 1개(초기화) + 메소드 5개
	// 1. 초기화
	MovieSystem() {
		try {
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			// MSA = Spring Cloud
			StringBuffer data=new StringBuffer(); // 속도차이면에 StringBuffer가 뛰어남(String을 문자열결합으로 가져오는것보다)
			int i=0; // char => fr.read() => 한글자 정수
			while((i=fr.read())!=-1) {
				// -1 => EOF
				data.append((char)i); // 문자열결합 append
			}
			fr.close();
			String[] datas=data.toString().split("\n");
			i=0;
			for(String ss:datas) {
				String[] s=ss.split("\\|");
				movies[i]=new Movie();
				movies[i].rank=s[0];
				movies[i].title=s[1];
				movies[i].genre=s[2];
				movies[i].poster=s[3];
				movies[i].actor=s[4];
				movies[i].regdate=s[5];
				movies[i].grade=s[6];
				movies[i].director=s[7];
				i++;
			}
			
		}catch(Exception ex){}
	}
	// 2. 목록 출력
	void list() {
		for(Movie m:movies) // ==> Movie도 데이터형(클래스)이다!!! movies는 Movie라는 데이터형으로 이루어져있음!
		{
			System.out.println(m.rank+"."+m.title);
		}
	}
	// 3. 상세보기
	void detail(int mno) {
		// 배열 => 인덱스 => 구분자는 필요 없다 => rank
		Movie m=movies[mno-1]; // movies에서 인덱스번호로 구분자를 쓰기위해 -1 // Movie(클래스)도 데이터형인것 기억!!!
		System.out.println("========= 영화 상세 내용 =========");
		System.out.println("영화명:"+m.title);
		System.out.println("감독명:"+m.director);
		System.out.println("출연:"+m.actor);
		System.out.println("장르:"+m.genre);
		System.out.println("등급:"+m.grade);
		System.out.println("개봉일:"+m.regdate);
		System.out.println("순위:"+m.rank);
		System.out.println("===============================");
	}
	// 4. 영화명으로 찾기
	void movieNameFind(String title) {
		System.out.println("===== 검색 결과 =====");
		for(Movie m:movies) {
			if(m.title.contains(title))
				System.out.println(m.title);
		}
		System.out.println("===================");
	}
	// 5. 출연으로 찾기
	void movieActorFind(String actor) {
		System.out.println("===== 검색 결과 =====");
		for(Movie m:movies) {
			if(m.actor.contains(actor))
				System.out.println(m.title+"("+m.actor+")");
		}
	}
	// 6. 장르 찾기
	void movieGenreFind(String genre) {
		System.out.println("===== 검색 결과 =====");
		for(Movie m:movies) {
			if(m.genre.contains(genre))
				System.out.println(m.title+"("+m.genre+")");
		}
	}

}

public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JSP(java=>html=>웹에 출력)
		MovieSystem ms=new MovieSystem();
		ms.list(); // 리턴형이나 매개변수 없이 쓰는것이 장점
		System.out.println("=================================");
		Scanner scan=new Scanner(System.in);
		//System.out.print("상세보기할 영화 선택(1~1938):");
		//int mno=scan.nextInt();
		//ms.detail(mno);
		System.out.print("검색어 입력:");
		//String title=scan.next();
		//ms.movieNameFind(title);
		//String actor=scan.next();
		//ms.movieActorFind(actor);
		String genre=scan.next();
		ms.movieGenreFind(genre);
	}

}
