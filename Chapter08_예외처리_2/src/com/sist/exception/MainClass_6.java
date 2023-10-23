package com.sist.exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainClass_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 특정 파일과 연결된 입력스트림을 생성한다
		// 테스트 목적이 아닌 이상은 정상적으로 try~catch 구문을 사용하여 예외처리하는 것을 권장
		try {
			FileInputStream fileIn=new FileInputStream("./data.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
