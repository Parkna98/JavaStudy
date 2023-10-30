package com.sist.io;
// BufferedOutputStream => 파일 쓰기
import java.io.*;
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos=new FileOutputStream("c:\\java_data\\sawon.txt");
			BufferedOutputStream bos=new BufferedOutputStream(fos); // 메모리로 이동
			String data="홍길동|개발부|서울|대리|3600\r\n";
			bos.write(data.getBytes()); // BufferedOutputStream은 바이트로저장해야되기때문에 마지막에 바이트로 바꿔줌
										// 한글자체 저장하려면 FileWriter
			bos.close();
		}catch(Exception ex) {}
	}

}
