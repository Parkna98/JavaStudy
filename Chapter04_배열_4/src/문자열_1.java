/*
 * 		문자열 저장 => String => ""
 * 		한개 저장
 * 		=> String 변수명 = "";
 * 		여러개 저장
 * 		=> String[] 배열명 = {"","",""...};
 * 		=> String[] 배열명 = new String[5];
 * 		
 * 		String은 클래스 => 메소드(기능)
 * 						---------
 * 				1. 메소드명 : 기능
 * 				2. 결과값 확인 
 * 				3. () = 매개변수 확인
 * 
 * 		*** 메소드 종류
 * 			종류와 어떤값을 받는지, 어떤데이터형이 결과로 나오는지 알아야함!
 * 		=> length()
 * 			=> 원형 : int length() => 문자갯수
 * 					----
 * 					String s="Hello";
 * 					s.length() => Hello의 문자갯수는?
 * 					----------
 * 					int len=s.length(); ==> int로 받아야함(리턴형 : int)
 * 		
 * 		=> toUpperCase()
 * 			=> 원형 : String toUpperCase() => 대문자 변환
 * 					-------
 * 					String s="Hello";
 * 					s.toUpperCase() => 대문자로 변환
 * 					---------------
 * 					String ss=s.toUpperCase()
 * 	
 * 		=> toLowerCase
 * 				=> 원형 : String toLowerCase() => 소문자 변환
 * 		
 * 		=> substring()
 * 			=> 원형 : String substring(int begin) => 문자를 자른다
 * 					-------			 ----------
 * 					 리턴형				매개변수
 * 										------ 사용자 요청
 * 					------요청처리결과	
 * 					=> 예) 로그인 
 * 						  ----- 요청 => id, pwd => 결과값 boolean
 * 						  boolean isLogin(String id, String pwd)
 * 					=> String ss=s.substring(1)
 * 					 String substring(int begin, int end) 	
 * 									 	**end번호는 제외
 * 		=> startsWith() : 시작 문자열이 같은지 확인
 * 			=> 원형 : boolean startsWith(String msg)
 * 					 => if문에서 주로 처리
 * 					 String s="Hello Java"
 * 					 if(s.startsWith("He")) ==> true! // 주로 조건문에 쓰임
 * 					=> 서제스트(자동완성기능)
 * 						LIKE 'A%' (오라클)
 * 
 * 		=> endsWith() : 끝나는 문자열이 같은지 확인
 * 			=> 원형 : boolean endsWith(String msg)
 * 					=> 확장자(jpg, png, gif...) => 갤러리 게시판
 * 		
 * 		=> contains() : 문자열이 포함되었는지 확인
 * 			=> 원형 : boolean contains(String msg)
 * 					=> 검색(***)
 * 						LIKE '%A%' (오라클)
 * 
 * 		=> trim() : 좌우 공백 제거
 * 			=> 원형 : String trim() => 매개변수X
 * 					=> 로그인 입력, 검색어 입력, 회원가입
 * 					=> 유효성 검사
 * 					
 * 		=> equals() : 문자열이 같은지 확인 (대소문자 구분)
 * 			=> 원형 : boolean equals(String msg)
 * 					=> 로그인 (아이디, 비밀번호)
 * 
 * 		=> replace() : 문자, 문자열 변경 => 데이터베이스
 * 					=> 오라클에서 주로쓰는 ||(문자열 결합), &(입력값) 등의 문자열 변경
 * 					=> 이미지(URL) => URL에 저장해두고 URL주소를 크롤링해서 이미지를 출력하는데, 주소안에 저런 특수문자들이 여럿있음  
 * 			=> 원형 : String replace(char c, char c1)
 * 								   -------  -------
 * 									 old      new
 * 									--------  ---------
 * 					 String replace(String s, String s1)
 * 		
 * 		=> valueOf() : 모든 데이터형은 문자열로 변환
 * 			=> 원형 : String valueOf(int a) => boolean b
 *			=> static : 자동 메모리 할당 
 *				String.valueOf() ==> 클래스이름으로 접근하는 것은 static
 *		
 *		=> toString() : 생략이 가능 => 객체의 주소값 출력 ==> 원시값 반환 			
 * 				
 * 		=> indexOf() : 지정된 문자위치값 확인 (문자번호 0번부터)
 * 			=> 원형 : int indexOf(char)
 * 					 int indexOf(String s)
 * 	
 * 		=> lastIndexOf() : 지정된 문자위치값 확인 (문자번호, length()-1)
 * 			=> 원형 : int lastIndexOf(char)
 * 					 int lastIndexOf(String s)
 * 		
 * 		=> concat() : 문자열 결합 (+)
 * 			=> 원형 : String concat(String s)
 * 
 * 		=> split() => 특정 문자를 중심으로 잘라서 배열에 저장
 * 		   
 * 		   replaceAll() => 
 */
public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		문자열_1 a=new 문자열_1();
		// 클래스 저장
		System.out.println(a.toString()); // toString()생략가능, 아래와 결과값 같음 
		System.out.println(a); // 원시값(주소값) 출력
	}	

}
