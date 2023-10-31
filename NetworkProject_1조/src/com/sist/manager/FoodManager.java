package com.sist.manager;
import java.util.*;

import com.sist.vo.FoodCategoryVO;
import com.sist.vo.FoodHouseVO;

import java.io.*;

public class FoodManager {
	private static ArrayList<FoodCategoryVO> cList=new ArrayList<FoodCategoryVO>();
	private static ArrayList<FoodHouseVO> fList=new ArrayList<FoodHouseVO>();
	/*
			Throwable
			---------
				ㅣ
			-----------------------------
			ㅣ							ㅣ
	      Error						Exception(수정가능)
	        							ㅣ
	        			 ----------------------------------
	        			 ㅣ								  ㅣ
	        		CheckedException			UnCheckedException
	        		-----------------			-------------------
	        		컴파일시에 예외처리 확인			예외처리 확인 (X)
	        		-----------------			-------------------
	        		java.io						java.lang
	        		java.net					java.util
	        		java.sql			
	        				
	      목적 : 에러를 사전에 방지
	      	    에러시 정상 수행 (비정상 종료 방지)
	      	    
	        			 
	 */
	// 초기화 블록 => static 변수가 있는 경우에 주로 사용
	// -------- 자동 수행이 가능, 상속은 불가
	static {
		FileReader fr=null;
		ObjectOutputStream ois=null;
		FileOutputStream fis=null;
		try {
			// 정상수행 문장
			fr=new FileReader("c:\\java_data\\food_category.txt");
			String data="";
			int i=0;
			while((i=fr.read())!=-1) {
				data+=(char)i;
			}
			fr.close();
			
			String[] cates=data.split("\n");
			for(String s:cates) {
				StringTokenizer st=new StringTokenizer(s,"|"); // 파일의 인코딩이 UTF-8일때 오류가 남 ==> 다른이름으로 저장=> ANSI로 저장 => 해결
				FoodCategoryVO vo=new FoodCategoryVO();
				vo.setCno(Integer.parseInt(st.nextToken().replace("\ufeff", "")));
				vo.setTitle(st.nextToken());
				vo.setSubject(st.nextToken());
				vo.setPoster(st.nextToken());
//				String[] ss=s.split("\\|");
//				FoodCategoryVO 
				cList.add(vo);
			}
			
			fis=new FileOutputStream("c:\\java_data\\fc.txt");
			ois=new ObjectOutputStream(fis);
			ois.writeObject(cList);
			
		}catch(Exception ex) {
			// 에러확인후 복구
			ex.printStackTrace();
		}finally {
			// 무조건 수행 문장 => 파일닫기, 서버닫기...
			try {
				fis.close();
				ois.close();
			}catch(Exception ex) {}
		}
//		FileInputStream fis=null;
//		ObjectInputStream ois=null;
//		try {
//			fis=new FileInputStream("c:\\java_data\\fc.txt");
//			ois=new ObjectInputStream(fis); // 오브젝트로 저장
//			cList=(ArrayList<FoodCategoryVO>)ois.readObject(); // 값읽기 
//			
//		}catch(Exception ex) {
//			ex.printStackTrace();
//		}finally {
//			try {
//				fis.close();
//				ois.close();
//			}catch(Exception ex) {}
//		}
	}
//	public static void main(String[] args) {
//		FoodManager fm=new FoodManager();
//		System.out.println("저장 완료!!");
		/*for(FoodCategoryVO vo:cList) {
			System.out.println(vo.getCno());
			System.out.println(vo.getTitle());
			System.out.println(vo.getSubject());
			System.out.println(vo.getPoster());
			System.out.println("==================================================");
		}*/
		public ArrayList<FoodCategoryVO> foodCategoryData(int no){
			ArrayList<FoodCategoryVO> list=new ArrayList<FoodCategoryVO>();
			int start=0;
			int end=0;
			if(no==1) {
				start=0;
				end=11;
			}
			else if(no==2) {
				start=12;
				end=17;
			}
			else if(no==3) {
				start=18;
				end=29;
			}
			for(int i=start;i<=end;i++) {
				list.add(cList.get(i));
			}
			return list;
		}
	}

