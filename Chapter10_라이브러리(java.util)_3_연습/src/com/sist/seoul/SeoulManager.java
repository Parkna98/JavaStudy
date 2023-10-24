package com.sist.seoul;

import java.io.FileReader;
import java.util.StringTokenizer;

// Seoul은 데이터모으는 클래스
// SeoulManager는 데이터 관리 => 데이터먼저 끌고오자 
public class SeoulManager {
	// 객체생성먼저
	// 생성자에 쓰든 블록에쓰든 아니면 메소드만들어서 리턴받든
	public Seoul[] seoulAllData(int i) {
		Seoul[] seoul=null; // finally쓰기위한 주소값null
		String path="c:\\javaDev";
		// 경로선택
		if(i==1)
			path+="\\seoul_location.txt";
		else
			path+="\\seoul_nature.txt";
		// 파일읽기
		FileReader fr=null;
		try {
			fr=new FileReader(path);
			int j=0;
			String data="";
			while((j=fr.read())!=-1) {
				data+=(char)j;
			}
			StringTokenizer st=new StringTokenizer(data,"\n");
			seoul = new Seoul[st.countTokens()]; // 데이터 갯수만큼 배열생성
			
			// 분리 => data짤라서 seoul[]에 입력
			i=0;
			String seouls[]=data.split("\n"); // data를 한줄씩 seouls에 저장
			for(String s:seouls) {
				st=new StringTokenizer(s,"|"); // StringTokenizer는 일반식씀(정규식X)
				//데이터 넣으려면 객체생성 먼저
				seoul[i]=new Seoul();
				seoul[i].setNo(Integer.parseInt(st.nextToken())); // 정수로 바꿔줘야함
				seoul[i].setName(st.nextToken());
				seoul[i].setContent(st.nextToken());
				seoul[i].setAddr(st.nextToken());
				i++;
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			try {
				fr.close();
			}catch(Exception ex) {}
		}
		return seoul;
	}
}
