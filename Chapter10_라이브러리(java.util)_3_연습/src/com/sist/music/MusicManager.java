package com.sist.music;
import java.util.*;
import java.io.*;

public class MusicManager {
	public static Music[] musics=new Music[48]; // 목록 출력 : static
	
	public MusicManager() {
		FileReader fr=null;
		try {
			int i=0;
			fr=new FileReader("c:\\javaDev\\genie.txt");
			String data="";
			while((i=fr.read())!=-1) {
				data+=(char)i;
			}
			String[] mds=data.split("\n"); // 한줄씩 자르기
			i=0;
			for(String s:mds) {
				try {
				StringTokenizer st=new StringTokenizer(s,"|");
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
	public Music[] musicAllData() {
		return musics;
	}
}
