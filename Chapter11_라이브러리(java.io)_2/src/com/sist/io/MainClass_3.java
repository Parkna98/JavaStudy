package com.sist.io;
// BufferedInputStream => 파일 데이터 읽기
import java.io.*;
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis=new FileInputStream("c:\\javaDev\\genie.txt"); // 파일자체에서 가져오기
			BufferedInputStream bis=new BufferedInputStream(fis); // 메모리에 갖다놓기
			// 1byte씩 읽어오기때문에 한글이 깨짐 (파일복사등에 이용) => 한글을 읽으려면? FileReader!
			int i=0;
			while((i=bis.read())!=-1) {
				System.out.print((char)i);
			}
			bis.close();
		}catch(Exception ex) {}
	}

}
