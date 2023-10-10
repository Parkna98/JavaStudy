
class Card {
	String type;
	int number; // 1=>A, 11=>J.... => String이 더 편한방법
	static int width, height; // static 변수로 선언하면 공유되서 card1의 width를 바꾸면 모든 Card클래스의 width가 바뀐다
	// static변수는 인스턴수변수와 다른곳에 저장된다
	// ---------Method Area에 저장됨 ==> card1,card2 등 모든 곳에서 가져다가 쓸수있음 (변경사항도 공유)
	// .을 이용해서 접근
	
	/*Card(){
		System.out.println("메모리");
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
	}*/
	
}	
// 52개 저장 => new => 메모리 공간이 다르다 (다른 값을 저장할 수 있다)
/*
 * 		new Card()
 * 		------------------
 * 			----type------
 * 
 * 			----number----
 * 
 * 			----width-----
 * 
 * 			----height----
 * 
 * 			--------------
 * 		------------------
 * 
 * 		new Card()
 * 		------------------ => 주소를 이용해서 접근이 가능 (.)
 * 			----type------	
 * 
 * 			----number----
 * 
 * 			----width-----
 * 
 * 			----height----
 * 
 * 			--------------
 * 		------------------
 * 		* 클래스는 여러개의 데이터를 한개로 묶어서 메모리에 저장후 사용
 * 				 ---------- 클래스 설계
 * 				 			--------
 * 							=> new를 이용해서 메모리에 저장
 * 		* 주소에 대한 개념이 거의 없다
 * 		   --- &,* (자바에는 없다)
 * 		   클래스 / 배열 (주소를 가지고 있다)
 * 		* 상속 => super/this
 * 		* 한가지, 한명에 대한 정보를 설계
 * 		  사원10명 => 클래스 1개만 생성 => 메모리 공간을 10개 생성
 * 		  			new => 10번
 * 		-----------------------------------------------
 * 		  사용자 정의 데이터형 Board (데이터에 대한 묶음)
 * 		  ---------------
 * 		  메소드를 묶음 (액션 클래스) BoardSystem (데이터 가공하는 메소드 묶음)
 * 		  --------------------
 * 			데이터형 + 메소드 혼합
 * 			----------------- 거의 없다 (데이터와 가공을 따로따로)
 * 		  -------------------------------------------------
 * 				ㅣ 재사용이 가능, 데이터를 보호, 수정, 추가 ====> 객체지향
 * 			
 * 		** 클래스는 단순화 작업 => 시뮬레이션 
 * 				 -------- 추상화 => 공통적으로 가지고 있는 특성
 * 			ex) 
 * 			  시계  
 * 				= 시침
 * 				= 분침
 * 				= 초침
 * 			  컴퓨터
 * 				= 모니터
 * 				= 본체
 * 				= 키보드
 * 				= 마우스
 * 			  사원
 * 				= 사번
 * 				= 이름
 * 				= 부서명
 * 				= 직위
 * 				= 근무지
 * 				= 입사일
 * 				= 연봉
 * 
 * 		*** 클래스는 일반(기본형) 동일하게 사용
 * 			-----  . , 배열(index)
 * 			 ㅣ
 * 			형변환 => 상속(is-a),포함(has-a) 
 * 					--- 상속을 내리는 클래스가 받는 클래스보다 데이터형이 더 크다 (생물>동물>인간>남녀)
 */

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Card 1장 생성
		Card card1=new Card(); // main 안에 있는 클래스이기때문에 stack에 저장 => 프로그램 종료시 없어짐
		card1.type="♥";        // heap에 저장되는 값이기 때문에 프로그램 종료시 지워지지 않음
		card1.number=1;		   // 프로그램 종료하면 card1이 없어지기때문에 쓸모없어짐
		card1.width=150;	   // 이러한 쓸모없어진 메모리를 지우는 방법
		card1.height=200;	   // ==> card1=null; 주소값을 지우고
							   // System.gc(); 가비지컬렉션 사용 ==> 해당 메모리가 heap에서 지워짐
		Card card2=new Card();
		card2.type="♠";
		card2.number=2;
		card2.width=150;
		card2.height=200;
		
		System.out.println("card1.type="+card1.type);
		System.out.println("card1.number="+card1.number);
		System.out.println("card1.type="+card1.width);
		System.out.println("card1.type="+card1.height);
		System.out.println("===================");
		System.out.println("card2.type="+card2.type);
		System.out.println("card2.number="+card2.number);
		System.out.println("card2.type="+card2.width);
		System.out.println("card2.type="+card2.height);
		// 변경
		card1.width=250;
		card1.height=300; // card1의 w,h만 바뀜 // card2의 w,h는 바뀌지 않음 => 메모리주소값이 다르기때문
						  // 클래스에서 width,height를 static변수로 선언하면 하나만 바뀌어도 모두 바뀜(공유변수)
		/*card2.width=250;
		card2.height=300; // => card2의 w,h바뀜 */
		// ==>  하나씩 바꾸기 비효율 ==> static변수를 쓰자!!
		System.out.println("===================");
		System.out.println("card1.type="+card1.type);
		System.out.println("card1.number="+card1.number);
		System.out.println("card1.type="+card1.width);
		System.out.println("card1.type="+card1.height);
		System.out.println("===================");
		System.out.println("card2.type="+card2.type);
		System.out.println("card2.number="+card2.number);
		System.out.println("card2.type="+card2.width);
		System.out.println("card2.type="+card2.height);
		
//		card1=null; // 주소값 지우기
//		card2=null;
		
//		System.gc() // 필요없는 메모리 제거 (heap에 저장된 메모리는 남아있기때문에 GC를 이용해서 지워줌)
	}

}
