package com.sist.io;
import java.io.*;
// 한글파일은 2byte => 문자스트림 사용
// FileInputStream은 1byte씩 읽어서 한글이 깨짐
public class MainClass_FileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis=new FileInputStream("c:\\java_data\\category.txt"); // 한글파일은 FileReader로 읽기
			int i=0; // 한글자씩 읽어온다 => ASCII(문자번호)
			// A => 65 ==> char로 변환해서 해야함
			// 파일 끝날때까지 읽어온다 => -1(EOF)
			// 바이트 스트림 => 다운로드 / 업로드 목적 => 한글파일읽기(X)
			String msg="";
			while((i=fis.read())!=-1) {
				msg+=(char)i; 
			}
			fis.close();
			System.out.println(msg);
		}catch(Exception ex) {}
	}

}
