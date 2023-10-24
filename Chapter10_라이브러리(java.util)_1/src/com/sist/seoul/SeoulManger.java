package com.sist.seoul;
import java.io.*;
import java.util.*;

public class SeoulManger {
	/*private static Seoul[] seoul=new Seoul[273];
	
	public SeoulManger() {
		FileReader fr=null;
		try {
			fr=new FileReader("c:\\javaDev\\");
			int i=0;
			String seoul_data="";
			while((i=fr.read())!=-1) {
				seoul_data+=(char)i;
			}
			// 한줄씩 출력
			String[] sds=seoul_data.split("\n");
			i=0;
			for(String s:sds) {
				try {
					StringTokenizer st=new StringTokenizer(seoul_data,"|");
					
				}catch(Exception ex) {}
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			
		}*/
	public Seoul[] seoulAllData(int i) {
		Seoul[] seoul=null;
		String path="c:\\javaDev\\";
		if(i==1) 
			path+="seoul_location.txt"; // 문자열 결합
		else
			path+="seoul_nature.txt";
			
		FileReader fr=null;
		try {
			fr=new FileReader(path);
			String data="";
			int j=0;
			while((j=fr.read())!=-1) {
				// read() 한글자씩 읽기 => 정수로 읽는다
				// A => 65
				data+=(char)j;
			}
			StringTokenizer st=new StringTokenizer(data,"\n");
			seoul=new Seoul[st.countTokens()]; // 273,110
			// 데이터 갯수를 몰라서 countTokens이용해서 갯수 세기
			
			// 분리 => 데이터를 Seoul[]에 첨부
			i=0;
			String[] seouls=data.split("\n");
			for(String s:seouls) {
				st=new StringTokenizer(s,"|");
				seoul[i]=new Seoul();
				// 문자열 => 정수형으로 변경
				// token (단어)
				seoul[i].setRank(st.nextToken());
				seoul[i].setLocation(st.nextToken());
				seoul[i].setExplain(st.nextToken());
				seoul[i].setAddress(st.nextToken());
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
