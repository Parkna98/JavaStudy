package com.sist.main;
/*
 * 		재사용 기법
 * 		-------- 기존의 클래스를 사용 (라이브러리)
 * 		=> 라이브러리는 상속보다는 포함 
 * 		   -------
 * 			ㅣ 상속을 할 수 없는 클래스 => 종단 클래스
 * 			  종단 클래스 : public final class ClassName
 * 			  ---------------------------------------
 * 				=> java.lang (p220)
 * 				   String, Math, System, StringBuffer...
 * 					=> 변경할 수 없다 (완제품)
 * 		=> 상속 (is-a)
 * 		=> 포함 (has-a)
 * 		-------------------- 클래스를 비교할 수 있다
 * 		class A
 * 		{
 * 			int a,b,c,d,e,f;
 * 		}
 * 		class B
 * 		{
 * 			int a,b;
 * 		}
 * 		
 * 		A ? B (크기비교 불가)
 * 		   
 * 		class A
 * 		{
 * 		}
 * 		class B extends A
 * 		{
 * 		}
 * 		크기비교 => 범위 => 공통성
 * 		A > B (상속내린클래스 > 상속받은) => 데이터형 개념 
 * 			 메모리 크기는? 상속받은 > 상속내린
 * 				식물 
 * 				 ㅣ
 * 				나무ㅡㅡㅡㅡㅡㅡㅡㅡ풀ㅡㅡㅡㅡ
 * 				 ㅣ			 ㅣ
 * 			-------------	---------
 * 			ㅣ			ㅣ		ㅣ	ㅣ
 * 			침엽수		활엽수 
 * 		-------------------------------
 * 		class A
 * 		class B 
 * 		{
 * 			A a;
 * 		}
 * 		=> 포함 클래스 (A < B)
 * 
 * 		=> 포함 : 변경없이 있는 그대로 사용
 * 		=> 상속 : 변경이 필요한 부분 => 오버라이딩
 * 		
 * 		ex) Window => 자동차 모양으로 윈도우 변경
 * 						=> 상속
 * 						class Login extends JFrame{}
 * 			Window => 사각형으로 사용
 * 						=> 포함
 * 						class Login
 * 						{
 * 							JFrame fr=new JFrame(); 
 * 							// 메소드에 선언 => 포함클래스가 아니다 (클래스영역에 포함되어야함)
 * 							public void display()
 * 							{
 * 								JFrame fr=new JFrame(); // ==> 지역변수
 * 							}
 * 						}
 * 						
 * 						Login log=new Login();
 * 						log.fr.메소드()
 * 
 * 		 			===> 포함 클래스가 많다
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
