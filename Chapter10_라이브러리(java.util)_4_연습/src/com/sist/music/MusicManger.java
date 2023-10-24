package com.sist.music;
import java.io.*;
import java.util.*;

public class MusicManger {
	private static Music[] musics=new Music[48]; // 목록출력 => public static

	public MusicManger() {
		FileReader fr= null;
		try {
			fr=new FileReader("c:\\javaDev\\genie.txt");
			int i=0;
			String data="";
			while((i=fr.read())!=-1) {
				data+=(char)i;
			}
			String[] mds=data.split("\n");
			i=0;
			for(String s:mds) {
				StringTokenizer st=new StringTokenizer(s,"|");
				// 객체생성
				try {					// 여기에 try~catch안씌우면 오류?
				musics[i]=new Music();
				musics[i].setRank(Integer.parseInt(st.nextToken()));
				musics[i].setTitle(st.nextToken());
				musics[i].setSinger(st.nextToken());
				musics[i].setAlbum(st.nextToken());
				musics[i].setKey(st.nextToken());
				i++;
				}catch(Exception ex) {}
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}finally {
			try {
				fr.close();
			}catch(Exception ex) {}
		}
	}
	public Music[] musicAlldata() {
		return musics;
	}
	
}
