package com.sist.manager;
import java.util.*;
import java.io.*;

import com.sist.vo.FoodCategoryVO;
import com.sist.vo.MovieNetflixVO;
import com.sist.vo.MovieReservationVO;
import com.sist.vo.MovieReservationVO.*;

public class MovieManager {
		private static ArrayList<MovieReservationVO> mList=new ArrayList<MovieReservationVO>();
//		private static ArrayList<MovieNetflixVO> nList=new ArrayList<MovieNetflixVO>();
		static {
			FileReader fr=null;
			ObjectOutputStream ois=null;
			FileOutputStream fis=null;
			try {
				fr=new FileReader("c:\\java_data\\movie_cate.txt");
				String data="";
				int i=0;
				while((i=fr.read())!=-1) {
					data+=(char)i;
				}
				fr.close();
				
				String[] cates=data.split("\n");
				for(String s:cates) {
					StringTokenizer st=new StringTokenizer(s,"|"); // 파일의 인코딩이 UTF-8일때 오류가 남 ==> 다른이름으로 저장=> ANSI로 저장 => 해결
					MovieReservationVO vo=new MovieReservationVO();
					vo.setTitle(st.nextToken());
					vo.setImage(st.nextToken());
					vo.setRegdate(st.nextToken());
					vo.setGenre(st.nextToken());
					vo.setNation(st.nextToken());
					vo.setGrade(st.nextToken());
					vo.setTime(st.nextToken());
					vo.setScore(st.nextToken());
					vo.setMake_share(st.nextToken());
//					String[] ss=s.split("\\|");
//					FoodCategoryVO 
					mList.add(vo);
				}
				
				fis=new FileOutputStream("c:\\java_data\\aac.txt");
				ois=new ObjectOutputStream(fis);
				ois.writeObject(mList);
				
			}catch(Exception ex){
				ex.printStackTrace();
			}finally {
				try {
					fis.close();
					ois.close();
				}catch(Exception ex) {}
			}
		}
//		static {
//			FileReader fr=null;
//			ObjectOutputStream ois=null;
//			FileOutputStream fis=null;
//			try {
//				fr=new FileReader("c:\\java_data\\movie_netflix.txt");
//				String data="";
//				int i=0;
//				while((i=fr.read())!=-1) {
//					data+=(char)i;
//				}
//				fr.close();
//				
//				String[] cates=data.split("\n");
//				for(String s:cates) {
//					StringTokenizer st=new StringTokenizer(s,"|"); // 파일의 인코딩이 UTF-8일때 오류가 남 ==> 다른이름으로 저장=> ANSI로 저장 => 해결
//					MovieNetflixVO vo=new MovieNetflixVO();
//					vo.setTitle(st.nextToken());
//					vo.setImage(st.nextToken());
//					vo.setRegdate(st.nextToken());
//					vo.setGenre(st.nextToken());
//					vo.setNation(st.nextToken());
//					vo.setGrade(st.nextToken());
//					vo.setTime(st.nextToken());
//					vo.setScore(st.nextToken());
//					vo.setMake_share(st.nextToken());
////					String[] ss=s.split("\\|");
////					FoodCategoryVO 
//					nList.add(vo);
//				}
//				
//				fis=new FileOutputStream("c:\\java_data\\nc.txt");
//				ois=new ObjectOutputStream(fis);
//				ois.writeObject(nList);
//				
//			}catch(Exception ex){
//				ex.printStackTrace();
//			}finally {
//				try {
//					fis.close();
//					ois.close();
//				}catch(Exception ex) {}
//			}
//		}
		public ArrayList<MovieReservationVO> MovieReservationData(int no){
			ArrayList<MovieReservationVO> list=new ArrayList<MovieReservationVO>();
			int start=0;
			int end=0;
			if(no==1) {
				start=0;
				end=11;
			}
			else if(no==2) {
				start=12;
				end=23;
			}
			else if(no==3) {
				start=24;
				end=35;
			}
			for(int i=start;i<=end;i++) {
				list.add(mList.get(i));
			}
			return list;
		}
		
}
