package com.sist.main;
/*
 * 		1. => 194page : 상속
 * 				목적, 형식
 * 		2. => 199page
 * 				논리적 포함 관계
 * 					=======> 구체적
 * 				동물 --- 포유류 --- 인간 --- 남자/여자
 * 					<======	추상화 : 공통점이 많이 있다
 * 				abstract => 추상적인 => 공통적인 내용 모아둔 것이다
 * 				게시판  ========> 추상클래스
 * 					= 글쓰기
 * 					= 상세보기
 * 					= 목록
 * 					= 수정
 * 					= 삭제
 * 					= 검색
 *				 
 * 					====> 답변형 게시판
 * 					====> 묻고 답하기 게시판
 * 					====> 갤러리 게시판
 * 					====> 댓글형 게시판
 * 					====> 추상/인터페이스 => 벤치마킹
 * 		201-202page
 * 			= 단일상속 => 다중상속시 변수명 중복
 * 			= 오버라이딩 => 재정의 => 메소드 변경
 * 				변수 오버라이딩
 * 				**메소드 오버라이딩
 * 			= 오버로딩 / 오버라이딩  (차이점중요)
 * 			  ---------------
 * 				오버로딩 : 중복함수정의 => 새로운 기능 추가 (new)
 * 				오버라이딩 : 재정의 => 기존의 메소드 수정 (modify)
 * 		
 * 		207page
 * 			= 접근 지정어
 * 				=> 상속시 private는 접근불가
 * 
 * 		211page
 * 			= 생성자
 * 			class A
 * 			{
 * 				public A()
 * 				{
 * 					super() ==> Object
 * 				}
 * 			}
 * 			class B extends A
 * 			{
 * 				public B()
 * 				{
 * 					super() (자동추가) => new A()를 호출 => 생성자 첫줄에 사용!
 * 										// this() => 생성자 첫줄에 사용!
 * 										// => super() this() 동시에 사용불가
 * 				}
 * 			}
 * 			B b=new B(); => new A() => new B() (메모리할당)
 * 
 * 			= 자신의 객체 ===> this.
 * 			= 자신의 생성자 호출	===> this()
 * 			= 상위클래스 객체 ===> super. (p215)
 * 			= 상위클래스의 생성자 호출 ===> super()
 * 			
 * 			===> 상속을 받은 클래스는 자신과 관련된 변수,메소드 and 상위클래스의 변수,메소드 사용가능 (제외:static(공유), 생성자, 초기화블록, private(접근X))
 * 				 상속을 내린 클래스는 자신의 클래스의 변수,메소드만 사용가능
 * 
 * 			217page => final ==> 변수는 상수형이다    (빈도수 적음)
 * 								 메소드는 확장 불가 => java.lang (String,Math...)
 * 
 * 			**221page
 * 				객체의 형변환
 * 				--------- 클래스의 크기가 있다
 * 						  ----------
 * 							ㅣ 반드시 상속,포함 상태
 * 						class A
 * 						{
 * 							int a,b
 * 						} 
 * 						class A
 * 						{
 * 							int a
 * 						} 
 * 						------------- 크기를 잴 수 없다
 * 						class A
 * 						class B extends A
 * 						------------------ B < A => 크기비교가 가능하면 => 형변환 가능
 * 						class A
 * 						{
 * 							B b=new B(); // 포함 => has-a
 * 						}
 * 						class B
 * 						------------------ A > B
 * 						
 * 						=> 묵시적 형변환
 * 						class A
 * 						class B extends A
 * 						A a=new B(); // A가 B보다 크므로 자동적으로 A로 형변환 된 상태 (묵시적)
 * 						============ B b=(B)a; => B가 더 작으므로 명시적으로 형변환!
 * 						B b=new B();
 * 						A a=b; (묵시적)
 * 						클래스도 데이터형이다
 * 						=> 자바에서 지원하지 않는 데이터형이라 사용자 정의 데이터형
 * 
 * 			*** 제어자
 * 			접근 지정어 : private, default, protected, public
 * 			그 외 : static, final, abstract, synchronized 
 * 			
 * 			static : 공통적인 => 공유
 * 				==> 클래스, 메소드, 변수 ==> 지역변수에서는 사용X
 * 			
 * 			final : 마지막
 * 				==> 클래스, 메소드, 멤버변수, 지역변수 
 * 				ex) public final class A => 확장할 수 없는 클래스
 * 							=> 상속불가 클래스
 * 							=> String, Math, System... (java.lang)
 * 					public final void display(){} => 오버라이딩 불가능한 메소드 (오버로딩가능?)
 * 					public final int a=10; => 상수 (값 변경 불가)
 * 			
 * 			abstract : 추상적인(공통성), 미완성
 * 					===> 추상클래스, 인터페이스
 * 
 * 			synchronized : 동기적인 (동기화) <=====> 비동기화	
 * 							안정성 O				안정성 X
 * 							속도 X                속도 O
 * 				=> 비동기적 => 동시에 명령수행 (AJax)  ex) 음악다운시 한번에 여러개 다운
 * 				=> 동기   => 하나 끝내고 하나수행      ex) 음악다운시 하나다운받고 다음곡 다운
 * 		
 * 			조합 
 * 			--------------------------
 * 			대상			조합
 * 			클래스		public/default final abstract     ex) public abstract 클래스명 (O) private abstract 클래스명 (X)
 * 						(protected/private X)
 * 			변수			private final, static
 * 			메소드		public final static abstract
 * 			지역변수		final 
 */
public class MainClass3 {
	private int a;
	public final void display() {}
	
	public final void display(int a) {}
	
	public MainClass3() {
		super();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
