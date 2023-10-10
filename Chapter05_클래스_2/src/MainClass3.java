// 영화
// 프로그램의 기본 => 묶는것이다 => 한개의 이름으로 사용
// 사용자 정의 데이터형
// 폴더가 다른 경우에는 접근 불가 => default
// 접근지정어(public,private,default ...)
class Movie  // 영화클래스를 만들고 변수를 제어
{
	int movieId; // 고유번호(구분자) => 상세보기, 찾기
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

public class MainClass3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
