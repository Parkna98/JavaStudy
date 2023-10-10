// 망고플레이트 
// 카테고리 => 맛집 
// 클래스는 반드시 구분자***를 필요로 한다 => 주로 정수형
/*
 * 		1) 변수를 묶는다
 * 		2) 구분자 => 참조번호
 * 		3) 여러개 있는 경우 => 배열 / 문자열 => 갯수가 고정이라면 배열, 각기 다르다면 문자열
 * 		4) 데이터형 설정 => String, int, double
 * 		5) 저장하는 과정 
 * 			new : 동적 메모리 할당 
 * 				 ---- new가 나올때마다 메모리 할당
 * 		6) 사용법 
 * 		   ----- 
 * 			객체.변수명 => 읽기/쓰기 ==> .은 메모리 접근 연산자
 * 			--------
 * 			int a=10;
 * 			a=100; 쓰기
 * 			System.out.println(a); 읽기
 * 		7) 사용자 정의 데이터형
 * 		   -------------- ~VO, ~DTO, ~Bean => 데이터 값만 저장되어있음 (변수만 할당되어있음)
 * 						Spring  MyBatis JSP
 * 		8) 변수의 종류
 * 			= 멤버변수 
 * 				=> new를 사용해야 메모리에 저장
 * 				=> 메모리 공간이 따로 생성
 * 			= 정적변수 (static)
 * 				=> 컴파일 시에 메모리 할당
 * 				=> 메모리 공간이 1개 생성 => 공유변수
 * 			= 나머지는 지역변수 
 * 			
 */
class FoodCategory{
	int cno; // 구분자
	String poster,title,subject;
}
class FoodHouse{
	int cno; // 카테고리 번호(구분자) => 1번 카테고리 선택하면 1번에 저장된 칼국수 카테고리가 전부 출력
	int fno; // 맛집 번호(구분자) => 1번 맛집을 선택하면 1번에 저장된 맛집이 출력 
	String[] poster=new String[5]; // 사이트의 사진 갯수가 5개로 나옴
	// 멤버변수 포함 => 기본형, 클래스, 배열
	String name;
	double score;
	String address; // 도로명과 지번이있는데 한번에 받아서 substring
	String phone; //
	String type;
	String price;
	String parking;
	String time;
	String menu; // 메뉴가 여러개라 배열을 잡고싶지만, 모든음식점마다 메뉴갯수가 다르기때문에 배열저장불가
	// String으로 잡아서 a,b,c,d 식으로 잡고 ","으로 split
	
	
}
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
