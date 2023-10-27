package com.sist.io;
/*
		FileReader / FileWriter => 다른 언어를 사용할 수 있게
								   ------- 한국어,중국어,일본어(2byte)
									=> 한글 깨짐 방지
									=> 문자 스트림
		FileInputStream / FileOutputStream 
		-----------------------------------
			=> 파일 입출력이 가능 (1byte) => 알파벳, 숫자
 */
import java.io.*;
import java.util.*;
// 여러 문장을 저장
// => 1. append => new FileWriter("",true) => 크롤링 
// => 2. 문자열을 결합 => 한번에 출력
public class MainClass_FileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw=null; // 초기화 => null을 줘야 객체가 생성되어 finally에서 닫을 수 있다
		try {
			// 처리 기능 => 정상적으로 수행할 수 있는 문장
			fw=new FileWriter("c:\\java_data\\sawon.txt",true); // true써야지 저장된것에 추가해서 들어감 // 안쓰면 덮어써짐
			// 경로~파일명까지 => 자동으로 createNewFile()
			Scanner scan=new Scanner(System.in);
			System.out.print("사번 입력:");
			int sabun=scan.nextInt();
			System.out.print("이름 입력:");
			String name=scan.next();
			System.out.print("부서 입력:");
			String dept=scan.next();
			// 파일 단점 => 구분이 안된다 => 구분자
			String msg=sabun+"|"+name+"|"+dept+"\r\n";
			// 저장
			fw.write(msg);
			
			System.out.println("파일 저장 완료!!");
		}catch(Exception ex) {
			// 에러가 있는 경우 => 복구 / 에러위치 확인
			ex.printStackTrace(); 
		}finally {
			// 파일, 리소스 => 닫기
			// 서버 닫기 
			// 오라클 닫기
			try {
				fw.close();
			}catch(Exception ex) {}
		}
	}

}
