package com.sist.lib;
/*		
		자주쓰이는 라이브러리는 외워놓기
		java.lang => 자바 소스의 기본 => 많이 사용이 되는 패키지
				  => import를 생략할 수 있다
				  => java.lang에 있는 대부분의 클래스는 
				  	 final클래스가 많다
				  	 ---------- 확장이 불가능 (있는 그대로 사용)
				  	 String, StringBuffer, Math, System, Wrapper
				  	 예외 : Object
		=> Object : 최상위 클래스 => 모든 클래스의 상위 클래스
		 			(사용자 정의, 라이브러리 => 모든 클래스는 Object로부터 상속을 받는다) => Object : 객체
		 			= ***toString() : 객체를 문자열화
		 			   				기본은 메모리 주소값 출력
		 			   				=> 오버라이딩(멤버변수값 확인)
		 			= ***clone() : 메모리 주소를 복제 => 새로운 메모리 생성 
		 				=> protected Object clone()
		 			  	=> 게임 (아바타) => 디자인 패턴, 알고리즘
		 			= finalize() : 소멸자(자동호출) => 메모리 해제 (주소값 null주면 해제대상)
		 				=> protected void finalize()
		 			
		=> System : 출력, 메모리 해제, 프로그램 종료
					= println() : 에러 출력, 멤버변수값 확인, 전송값 확인
					윈도우 / 브라우저 => 자체 출력 => 디버깅 
					
					= gc() : 가비지 컬렉션을 호출 => 메모리 해제
						=> 멀티미디어, 애니메이션
						   ==> 실시간 도로 CCTV
					= exit( ) : 프로그램 종료
						  --- 0(정상), 비정상
		
		=> Math : 수학 => 모든 메소드가 static 
		   		  => 메모리 할당을 하지 않는다
		   		  => Math.메소드명()
		   		  = ***random() => 리턴형(double : 0.0~0.99)
		   		  = ***ceil() => 올림 => 총 페이지 구하기
		
		=> StringBuffer : String 보완 => 문자열 결합시에 최적화
				= ***append()
				
		=> String : 문자열 관리하는 클래스
			= ***startsWith : 지정한 문자로 시작하는지 판단 
				=> public boolean startsWith(String s) 
					=> 검색기 (자동완성기)
			= endsWith : 지정한 문자로 끝나는지 판단
				=> public boolean endsWith(String s)
			= ***equals : 두 개의 String의 값만을 비교
				=> public boolean equals(String s) 
					=> 웹 : 로그인, ID찾기, ID중복확인...
					  --- CRUD (게시판) => 회원가입 => 로그인...
					  	  목록(페이지 나누기) => 상세보기(댓글)...
					  	  최근방문기록(쿠키), 로그인상태 유지(세션)
					=> 대소문자 구분해서 비교
						=> 대소문자 구분X => equalsIgnoreCase(String s)
						
			= ***indexOf : 지정한 문자가 몇번째에 있는지 인덱스 반환 (오버로딩)
				=> public int indexOf(String s)
				=> public int indexOf(char c)
				   public int indexOf(String s, int fromIndex) => fromIndex부터 찾기
				
			= ***lastIndexOf : 지정한 문자가 마지막 몇번째에 있는지 인덱스 반환 (인덱스는 맨앞 0기준) (오버로딩)
				=> public int lastIndexOf(String s)
				=> public int lastIndexOf(char c)
				-----------------------------------
					오버로딩 => 객체지향의 3대특성 (다형성) => 오버라이딩(재정의)
						= 한 클래스에서 만들어진다
						= 같은 메소드명 이용
							ex) 버스(마을), 버스(고속)...
						= 매개변수의 갯수, 데이터형, 순서가 다르다
						= 리턴형은 관계없음
						= 접근지정어 관계없음
						  	ex) 생성자, println()...
						= 중복 메소드 정의
					 	cf) 기술면접 => 협업/프로젝트의 어려운점
					 				=> 형상관리? Git (하나의 레포지토리에 여러사람 연결)
						  	
			= ***length() : 문자열의 길이를 반환
				=> public int length()
					ex) 비밀번호 / 글쓰기 ...
					 	-----	----- 오라클의 지정된 문자 갯수 초과
					   8자이상	  => 오라클은 문자의 갯수 지정
					 			  => title VARCHAR2(1000) => 한글은 300글자까지 사용가능
					 			  							 --- 한글은 3byte
					 			
			= ***replace() : 지정한 문자가 있으면 새로 지정한 문자로 바꿔서 출력
				=> public String replace(String old, String new)
				=> public String replace(char old, char new)
					=> 오라클 => 값을 저장할때 
					   ----	   --------- 이미지 => &, || ( =>이름에 들어가면 안되서 바꿔줌)
							   & => Scanner ===> &,#
							   || => 문자열 결합
							   
			= replaceAll() : 정규식을 지정한 문자로 바꿔서 출력
				=> public String replaceAll(String regExp, String s)
											----------- 정규식, split()
											데이터 분석 (챗봇)
					=> 정규식 패턴(문자열의 형태)
						맛집 => 어떤 맛
								짜다, 싱겁다, 맵다...
								---
								짜다, 짜고, 짜서...
								=> 짜+ ("짜"로 시작하고 2글자이상)
					=> 기호(+,*,^,$,.,|) ==> 기호자체를 호출( \\+,\\|,\\* ...)
					
			= split() : 지정한 문자로 문자열을 나눌 수 있다 (배열로 반환)
				public String[] split(String regExp) => 정규식 이용
				=> java.util => ***StringTokenizer (일반식 이용)
			
			= substring() : 문자열에 지정한 범위에 속하는 문자열을 반환 (시작값은 포함, 끝값은 미포함)
				=> public String substring(int b)
					=> b부터 전체반환
				=> public String substring(int b, int e)
					=> b부터 e-1 까지 반환
					
				*** 원본은 변경되지 않는다!
				String s="Hello Java"
						  0123456789
				s.substring(6) => Java
				System.out.print(s) => "Hello Java"
				
			= toLowerCase() / toUpperCase() : 대문자를 소문자로 / 소문자를 대문자로 변환
				=> public String toLowerCase()/toUpperCase()
				
			= ***trim() : 문자열의 좌우에 있는 공백을 제거(중간공백X)
				=> public String trim() 
					cf) 중간 공백 제거해서 배열로 반환? split([ + ]) 정규식써서 중간공백제거
				
			= toString() : 지정한 개체의 원시값을 반환 (데이터형을 문자열로 변환)
				=> String toString() 
					=> Object가 가지고 있는 값 반환 (오버라이딩)
					
			= ***contains() : 지정한 문자가 비교대상 문자열에 포함되어있는지 판단
			 	=> public boolean contains(String s)
			
			= charAt() : 지정한 index의 문자를 반환
			 	=> public char charAt(int index) => 0부터 시작
			 
			= concat() : 문자열 결합
				=> public String concat(String s) => +
					=> MySQL은 문자열 결합시 => concat() 사용
					=> 오라클 => || 사용
					
			= format() : 서식문자열을 이용해서 서식화된 문자열반환 (java.text 비슷한기능)
			 	=> public static String format(String s, Object ...obj) 
			 								  ---------			------ 가변매개변수
			 								  포맷종류(%d,%f...)
				String.format("%d%d%d",10,20,30) 
				-------
				 static메소드
				
				
				
				객체 생성
				------
				=> 모든 값을 저장 할 수 없다
				=> 모든 값을 저장 하기위해 => 메모리를 모아서 저장
									   --------------- Heap
				=> 객체에는 heap에 저장되어 있는 메모리 주소를 가지고 있다
										 --------- 참조변수
				( 주소 비교시에는 == , 실제 저장된 값을 비교 equals )
				
			= 
			
			
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
