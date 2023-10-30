package com.sist.io;
import java.io.*;
public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis=new FileInputStream("c:\\javaDev\\genie.txt");
			FileOutputStream fos=new FileOutputStream("c:\\java_data\\genie.txt");
			
			BufferedInputStream bis=new BufferedInputStream(fis);  
			BufferedOutputStream bos=new BufferedOutputStream(fos);  // 파일을 올리고 다운로드할때 쓰는 코딩
			// 관리자모드는 파일을 많이올리기 때문에 주로사용
			int i=0; // read() => 한글자 읽기 
			// read(byte[]) => 읽은 바이트수
			byte[] buffer=new byte[1024]; 
			// => 1024byte를 읽어서 => 새로운 파일에 전송
			while((i=bis.read(buffer,0,1024))!=-1) { // 매개변수가 있는 i는 몇글자를 읽었는지 확인
													 // 매개변수가 없는 i는 한글자씩 읽어옴
				bos.write(buffer, 0, i); // 읽은 바이트 수만큼 저장한
			}
			bis.close();
			bos.close();
			System.out.println("파일 복사 완료");
		}catch(Exception ex) {}
	}

}
