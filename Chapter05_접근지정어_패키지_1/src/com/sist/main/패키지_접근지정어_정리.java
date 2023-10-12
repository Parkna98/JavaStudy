package com.sist.main;
/*
 * 		접근지정어
 * 			=> 어느 클래스까지 접근할 수 있는지 설정
 * 			private : 자신의 클래스에서만 사용이 가능
 * 						=> 멤버변수 (저장된 데이터 보호)
 * 			default : 같은 패키지 안에서만 접근이 가능 
 * 						=> 사용빈도가 거의 없다
 * 			protected : 같은 패키지 안에서 접근이 가능
 * 						상속을 받은 경우에 상속내린 클래스의 패키지까지 접근이 가능
 * 							=> 사용빈도가 거의 없다
 * 			public : 패키지와 관계없이 모든 클래스에 접근이 가능
 * 						=> 클래스 public class ClassName
 * 						=> 메소드 => public 리턴형 메소드
 * 						=> 생성자 => public 클래스명()
 * 						=> 객체지향 프로그램은 객체와 객체의 상호작용
 * 										 ---------
 * 										 연결 => 메모리 할당
 * 										 교환 : 메소드
 * 			멤버변수 (지역변수에서는 사용이 불가)
 * 			=> [접근지정어] 데이터형 변수명;
 * 			   --------- private
 * 							ㅣ
 * 						   기본형, 참조형(사용자 정의 => 배열/클래스)
 * 			   public class ClassName
 * 			   {
 * 					private int a;
 * 					private long a2;
 * 					private double d;
 * 					private boolean bb;
 * 					private int[] arr=new int[5]
 * 					private Music music=new Music(); // 클래스도 멤버변수로 쓸 수 있다
 * 			   }
 * 			생성자 (클래스명과 동일, 리턴형이 없다, 여러개 사용이 가능)
 * 				public class A
 * 				{
 * 					A(){} => X
 * 					public A(){}    => O
 * 					public A(int){} => O
 * 				}
 * 			멤버메소드
 * 				=> [접근지정어] 리턴형 메소드명(매개변수...)
 * 					{
 * 						=> 접근 지정어 => public (98%)
 * 					}
 * 			
 * 		패키지 : 폴더의 개념 => 관련된 클래스를 모아서 저장
 * 						  ---------- 
 * 						  패키지가 다르면 같은 이름의 클래스 사용이 가능
 * 
 * 		==> 묶는 연습 => 1)찾기 2)재사용 
 * 			------
 * 			  1. 관련된 데이터 => 배열 (같은 데이터형)
 * 				 클래스 (다른 데이터형)  
 * 			  2. 명령문 (기능별 분리) => 메소드
 * 			  3. 관련된 클래스를 묶는다 => 패키지
 *			  => 패키지 제작 : 라이브러리
 *			  => 패키지를 사용하면 
 *				 같은 패키지 => import 없이 사용이 가능
 *				 다른 패키지 => import를 사용해서 클래스를 읽어 온다
 *							-------
 *							라이브러리 / 사용자 정의 클래스
 *				 *** 패키지명은 com(org).회사명.압축
 *					 DB연결
 *						com.sist.dao	
 *								----- 
 *		멤버변수 : 데이터 보호
 *				--------
 *					ㅣ
 *				private => 다른 클래스에서는 사용이 불가능
 *				------- 변수의 기능
 *						--------
 *				class A
 *				{
 *					int a;
 *				}
 *				
 *				A aa=new A(); // 메모리 공간 확보 => 객체생성을 먼저해야 a를 쓸 수 있다
 *				  -- aa라는 메모리 주소에 a를 저장
 *				---aa--- ==> . ==> aa.a
 *				   --a--
 *				   -----
 *				  ------
 *					aa.a=100; => 메모리에 값 저장
 *					System.out.println(aa.a) // 메모리에서 값 읽기
 *					=> 저장 / 읽기 ==> 메소드
 *					   --------- getter / setter
 *					   String name;
 *					   => public String getName() => 값을 읽는 것이므로 return있음
 *							{
 *								return name;
 *							}
 *							getXxx() => age getAge()
 *						=> public void setName(String name) => 값을 저장하는것이므로 void 와 매개변수
 *							{
 *								this.name=name;
 *							}
 *						=> 변수는 은닉화 메소드를 이용해서 변수사용이 가능
 *						   ----------------------------------
 *											ㅣ 
 *										   캡슐화
 *			=> 분리
 *				= 서버단 		: 데이터 관리
 *				= 클리아언트단  : 화면 출력 => main ==> JSP
 */
public class 패키지_접근지정어_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
