package com.sist.io;
import java.io.*;
/*
		FileReader
		= 파일읽기 => 송수신 => 2byte씩 읽어온다 => 문자스트림
		= 파일자체제어 : Reader / Writer  
 */
public class MainClass_FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		try {
			fr=new FileReader("c:\\java_data\\sawon.txt");
			int i=0;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			try {
				fr.close();
			}catch(Exception ex) {}
		}
	}

}
