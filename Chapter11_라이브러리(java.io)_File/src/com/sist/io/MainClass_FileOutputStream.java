package com.sist.io;
/*
		FileOutputStream
		
		= 주요 메소드
			= read() / write() / => append
			=> new FileInputStream / new FileOutputStream("경로명")
			=> 저장을 하면 새로운 파일을 만듬 => 그 전의 내용 없어짐
			new FileOutputStream("경로명",true) => append모드
			---------------------------------
			크롤링시에 append모드를 써야 한줄씩 읽어올때 파일에 한줄씩 추가하는식으로 저장됨
			(그냥 쓰게되면 한줄저장할때마다 그전까지 저장한것은 사라져서 마지막 문장만 남게됨) 
			
		**파일은 반드시 닫는다!
 */
import java.util.*;
import java.io.*;

public class MainClass_FileOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String[] cate= {
					"얼큰한 칼국수 맛집 베스트 20곳",
					"여의도 맛집 베스트 50곳",
					"일본 라멘 맛집 베스트 70곳",
					"어복쟁반 맛집 베스트 15곳",
					"비빔밥 맛집 베스트 45곳"
			};
			// category.txt 에 저장
			for(String s:cate) {
				// 파일저장
				FileOutputStream fos=new FileOutputStream("c:\\java_data\\category.txt",true);
				// true 붙이면 append모드 => 파일에 계속 붙이면서 
				// 안붙이면 create모드 => 파일을 새로 생성하면서
				fos.write((s+"\r\n").getBytes()); // \r\n => 한글자씩 한줄씩  
				// getBytes() : 문자열을 byte[]변환
				fos.close();
			}
			System.out.println("파일 저장 완료!!");
		}catch(Exception ex) {}
	}

}
