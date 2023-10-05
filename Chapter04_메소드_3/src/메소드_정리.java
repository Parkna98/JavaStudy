/*		* 프로그램의 유형
 * 			= 네트워크 : 게임, 화상채팅
 * 			= 데이터베이스
 * 
 * 		1. 리턴형
 * 			= 요청 처리에 대한 결과값 전송
 * 						  --------
 * 							= 한개 (기본형) (int,long,char,boolean,double)
 * 							= 여러개(배열,클래스) 
 * 									  ----- 상세보기, 목록...
 * 			= 결과값이 없는 경우 : 추가,수정,삭제 ==> void
 * 								==> 출력
 * 			= 결과값이 있는 경우 : 목록, 상세보기, 검색...
 * 
 * 		2. 매개변수
 * 			= 사용자가 요청값을 받을 경우
 * 			= 여러개 사용이 가능 = 3개 이상이면 배열, 클래스
 * 			= 가변 매개변수(...) (매개변수의 갯수가 정해지지 않음) 
 * 
 * 		3. 메소드명
 * 			= 식별자 => 문자갯수(제한은 없음) => 효율상 10글자 이내
 * 			= 두 개의 단어가 있는 경우
 * 				userInput(), user_input() 
 * 				aaa() => delete()  : 의미가 있는 명칭 사용
 * 
 * 		4. return문
 * 			=> 가급적이면 메소드 마지막에 설정
 * 			=> void면 생략이 가능
 * 			
 * 		5. 형식
 * 			리턴형 메소드명(매개변수...)
 * 			----
 * 			{
 * 				return 값;
 * 					  ---
 * 			}
 * 		6. 메소드 유형
 * 		   리턴형 / 매개변수
 * 			o		o
 * 			o		x
 * 			------------------출력내용이 있는경우
 * 			x		o
 * 			x		x
 * 			------------------메소드 자체 처리(void)
 * 
 * 		7. 사용 목적
 * 			= 다른 클래스와 연결 (메세지) => 메소드 호출
 * 			= 재사용
 * 			= 반복 제거
 * 			= 수정이 편리하게 
 * 			= 에러 처리가 쉽게
 * 
 * 		8. 메소드 형태
 * 			= static : 자동저장
 * 			= instance : 따로따로
 * 			
 */
public class 메소드_정리 {
	/*static void data(String s) {
		System.out.println(s);
	}
	
	static void data(String s,String s1) {
		System.out.println(s+" "+s1);
	}*/
	
	// **가변형 => 매개변수의 값이 정해지지 않을때 사용 
	//				(데이터형...s)
	static void data(String...s) {
		for(String ss:s) {
			System.out.println(ss);
		}
	}
	
	static void data2(int...s) {
		for(int ss:s) {
			System.out.println(ss);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		data("Java","Oracle","Python","Spring");
//		data("Java","Oracle","Python","Spring","React","Vue.js");
//		data("Java");
		data2(1,2,4,5,6);
	}

}
