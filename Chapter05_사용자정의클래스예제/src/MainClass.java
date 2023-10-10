import java.text.DecimalFormat;

class Movie{
	int mno; // 고유번호
	String poster,nameKr,nameEn;
	String regdate;
	String genre;
	String nation;
	String grade;
	String time;
	double score; // 평점,누적관객,순위 등은 변경되므로 int나 double형으로 설정
	int showUser;
	int rank;
	int startdate; // D-day
}

class News{
	int nno; // 구분자 까먹지 않기 => 없으면 상세보기를 했을때 해당게시물을 찾지못함 
	String picture;
	String title;
	String content;
	String regdate;
	String company;
}

class FoodCategory{
	int cno; 
	String poster;
	String title;
	String subTitle;
}

class FoodData{
	int fno;
	String name;
	String address; // 도로명과 지번 한꺼번에 저장후 substring이용해서 자르기
	String phone;
	String type;
	String price;
	String parking;
	String time;
	String menu; // 각 음식점마다 메뉴개수가 다르기때문에 배열쓰기 힘듬
	double score;
}
// 변수 설정 고민하고, 그다음 과정은 초기값을 어떻게 줄것인지 고민
// 초기화 생각!!

class Recipe{
	int rno;
	String picture;
	String title;
	String chef;
	int showUser;
	int hit;
	int score;
}

class Music{
	int mno; // 구분자
	int like; 
	int rank;
	int idcrement; // 얼만큼 상승하고 하강  // state랑 묶으면 안되고 하나씩 따로
	String state; // 유지, 상승, 하강 (- ▲ ▼)
	String poster;
	String title;
	String artist;
	String album;
}

class Market{
	int gno; // 구분자
	String goods_poster; // 변수명에 공통이름(goods_) 넣어주면 좋다
	String goods_name;
	int goods_discount; // 문자열결합을 통해 출력 
	int goods_price; // 가격같은 경우 결재할때 더해서 합계로 계산하기때문에 int가 편하다
					 // (,)의 경우는 int 출력형식만 바꿔주면된다.
}

class Act{
	int ano;
	String poster;
	String title;
	String state;
	String genre;
	String date;
	String place;
	String actor;
	String grade;
	String time;
	// 한줄로 한번에 선언도 가능하지만, 수정등을 위해 위처럼 따로 선언 권장
}
// new => 새로운 메모리 공간 생성
// 연극이 10개 => new 10번써서 메모리공간10개 생성

/*
 * 	class A {
 * 		int age;
 * 		String name;
 *  }
 *  	==> A a=new A => 메모리 8byte 생성 (메모리공간2개:age, name)
 *  	A a=new A(); => stack에 저장되는 주소값메모리공간은 4byte
 *  class B {
 *  	int a,b,c; static int d;
 *  }			
 * 		==> 메모리 공간 12byte(a,b,c) 생성 => static변수는 method area에 저장.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int like=323457;
		// 라이브러리
		// => 숫자 => int
		// 클래스는 한개만잡아서 여러데이터형을 담는다 => new를 이용해서 메모리를 생성후 다른데이터를 저장한다.
		DecimalFormat df=new DecimalFormat("###,###"); // 정수형 (,)포함 표시방법
		System.out.println("♡ "+df.format(like));
	}

}
