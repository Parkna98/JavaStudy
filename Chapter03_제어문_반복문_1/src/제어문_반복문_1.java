/*
 * 		1. 반복문 => 중복을 제거
 * 				   --------- 메소드
 * 			1. 데이터 저장
 * 				변수 (한개만 저장이 가능) => 묶어서 사용
 * 				 국어,영어,수학,총점,평균	: 
 * 				-------------------- 배열 (변수를 줄여라) => 단점: 같은 데이터형만 묶임 => 한번에 묶고싶어 => 클래스!
 * 				
 * 			2. 명령문 => 묶어서 사용
 * 			   ------------------ 메소드
 * 									+ =================== 클래스!! => 데이터보호할래 => 캡슐화 
 * 		2. 반복문의 종류
 * 			1. for : 횟수가 지정된 경우에 주로 사용
 * 					 => 화면 출력 (영화목록, 맛집목록) // html, css 사용 // 글자맞추기 '...'입력
 * 				일반 for / 향상된 for(배열,컬렉션)
 * 				 ㅣ
 * 				=> 2차 for까지 (웹에서는 아주 가끔 등장) => 코테 
 * 
 * 			2. while : 횟수가 없는 경우에 주로 사용
 * 					=> 무한루프 (파일읽기,데이터베이스)
 * 			3. do~while : 반드시 한번 이상을 수행 (사용빈도가 거의 없음)
 * 			-------------------------------------------------
 * 				ㅣ 규정/문법사항은 아니다
 * 				 ------------------- 
 * 			4. 제어 (다시시작, 종료)
 * 			------------------------
 * 				break; 반복문 중단
 * 				continue : 특정부분을 제외
 * 			-----------------------------------
 * 			for : 1) 형식 2) 동작(순서) 3) 패턴
 * 				1) 형식  
 * 				for(초기값;조건식;증감식)
 * 				 { 반복실행문장 (한줄이면 블록생략가능) => 두줄인데 블럭 안닫았으면 첫줄만 수행됨. 밑에줄은 for문과 다른 소속임, 가급적 {} 쓸것
 * 					문장 ==> for문 소속문장이 아니다( {}블록 없을시
 * 				 } 
 * 				
 * 				2) 동작	   ㅣfalse면 종료
 * 						   ㅣ <==ㅣ-----
 * 					 1	   2 	3	  ㅣ
 * 				for(초기값;조건식;증감식)  ㅣ
 * 				{		   ㅣtrue     ㅣ
 * 					반복실행문장 ----------
 * 				}
 * 							
 * 				for(int i=1;i<=10;i++)
 * 					i=2 i<=10 true i++ => i=2ㅡ
 * q				i=2 i<=10 true i++ => 3
 * 					..
 * 					..
 * 					i=10 i<=10 true i++ => i=11
 * 					i=11 i<=10 false => 종료
 *
 * 		   
 * 
 * 
 */

import java.io.FileReader;
import java.io.*;


public class 제어문_반복문_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		String s="ABCDEFGHIJKLMNOP";
//		String[] alpha=s.split(""); 
//		for(int i=0;i<alpha.length;i++) // 0번부터 인덱스로 하나씩 들고옴 (향상된 for문)
//		{
//			System.out.print(alpha[i]); 
//		}
//		System.out.println();
//		for(String ss:alpha)	// 또 다른방법
//		{
//			System.out.print(ss);
//		}
	/*	FileReader fr=new FileReader("C:\\Users\\SIST\\git\\java-study\\Chapter03_제어문_반복문_1\\src\\제어문_반복문_1.java");
		int i=0;
		while((i=fr.read())!=-1) // EOF 한글자씩 읽어옴
		{
			System.out.print((char)i); // 파일의 글자수를 읽어올 수 없기때문에 while로 반복돌려버림
		} */
	}

}
