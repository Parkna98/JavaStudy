package com.sist.music;
import java.io.*;
import java.util.*;

import com.sist.lib.MainClass_1;
// Music을 제어하는 프로그램
public class MusicManager {
	private static Music[] musics=new Music[48]; // 목록은 공유 => 모든 접속자가 같은 목록보기
	// 접속하는 모든 유저에게 공유 => 목록 => static
	// 초기화 ==> 클래스블록에서는 초기화 불가 => static 블록
	/*
			1) 인스턴스 블록 : 인스턴스, static
			2) static 블록 : static => 인스턴스를 초기화 (객체 생성)
			3) 생성자 : 인스턴스, static
	 */
	/*
			예외처리 종류 (예외: java.io, java.net, java.sql)
									 -------------------
									 	ㅣ 웹(네트워크)
				= 예외 복구
					try{
						=> 정상수행, 예외가 발생되는 소스코드
					}catch(예외클래스){
						예외 발생시 복구
						=> 예외의 위치 : getMessage()
									  printStackTrace()
									  디버깅 확인 ==> 수정
					}
				= 예외 회피(throws)
					=> 라이브러리에서 많이 사용 => 개발자에게 넘김
					=> 예상되는 에러를 선언 => 컴파일러가 확인을 안하고 동작
					   method() throws 예외... (순서가 없다)
					=> 처리 방법 : throws이용, try~catch
				= 임의 발생(throw)
					=> throw new 예외처리생성자()
				= 사용자 정의 예외처리 
					=> class MyException extends Exception
					   {
					   }
				
	 */
	// 메모리할당을 해줘야하기때문에 생성자 이용 => 할당하지 않아도 된다면 static블록
	public MusicManager() {
		FileReader fr=null; // try밖에있어야 finally에서 fr을 사용가능 
		try { 
			fr=new FileReader("c:\\javaDev\\genie.txt"); // FileNotFoundException
			int i=0;
			String music_data="";
			while((i=fr.read())!=-1) // -1 EOF
			{
				music_data+=(char)i; // 속도가 느리면 StringBuffer사용
			}
			// 1. 한줄씩 출력
			String[] mds=music_data.split("\n"); // 한줄씩 문자열로 저장
			i=0;
			for(String s:mds) {
				try {
				StringTokenizer st=new StringTokenizer(s,"|");
				musics[i]=new Music();  // 메모리할당부터
				musics[i].setRank(Integer.parseInt(st.nextToken()));
				musics[i].setTitle(st.nextToken());
				musics[i].setSinger(st.nextToken());
				musics[i].setAlbum(st.nextToken());
				musics[i].setKey(st.nextToken());
				i++;
				}catch(Exception ex) {}
			}
			
		}catch(Exception ex) {
			// 에러확인
			ex.printStackTrace();
		}finally {
			// 파일 닫기
			try {
				fr.close();
			} catch (Exception ex) {}
		}
		
	}
	public Music[] musicAllData() {
		return musics;
	}
}
