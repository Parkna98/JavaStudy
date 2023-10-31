package com.sist.io;
/*
		IO => 입력,출력
		= 메모리 입출력
		= 파일 입출력
		= 네트워크 입출력
		-------------------------
		1. 클래스의 종류
			1) 송수신 => 1byte ===> 바이트 스트림
			2) 송수신 => 2byte ===> 문자 스트림
			   ** 스트림 : 데이터를 이동하는 통로
			메모리, 파일, 네트워크 =====> 자바응용프로그램 =====> 화면출력
				  			   ㅣ				  ㅣ
				  			InputStream(1byte)	OutputStream
				  			Reader(2byte)		Writer
			3) 클래스
			   = 1byte (바이트 스트림)  (DB에서 전송,업로드,다운로드 힘들어서 이때는 바이트스트림 이용)
			   	=> 파일전송, 업로드, 다운로드 => byte단위로 전송    
			   	InputStream (읽기)						OutputStream (쓰기)
			   		ㅣ										ㅣ
			---------------------				-----------------------------		
			ㅣ					ㅣ				ㅣ							ㅣ
	**FileInputStream	FilterInputStream	FileOutputStream		FilterOutputStream	
								ㅣ											ㅣ
					 **BufferedInputStream						  **BufferedOutputStream
					 ** Buffer : 임시 기억장소 => 속도 최적화
			  				=> 파일이나 웹서버에 있는 모든 데이터를 메모리에 올려놓고 시작						
			  				
			   = 2byte (문자 스트림) => 파일제어 (파일읽기 / 파일쓰기)
			  	 *** 문자 스트림 (한글 => 2byte)
			  	 Reader 	/  Writer 
			  	 	ㅣ		     ㅣ
			  **FileReader    **FileWriter
			  ----------      ----------
			  BufferedReader  BufferedWriter
			  
			  = 객체 단위 저장
			  	=> ObjectInputStream / ObjectOutputStream
			  	=> 직렬화 / 역직렬화
			  	객체 저장
			  	class A{
			  		int age;
			  		String name;
			  		int kor;
			  	}
			  	A a=new A(); // 메모리 공간을 만들어서 저장한다
			  	
			  	---a---
			  	 100X					
			  	-------	 ↘	---100X---	==> 주소접근 연산자 (.) 
			  				  --age--   	=> a.age / a.name / a.kor 
			  				  	 0
			  				  -------
			  				  --name--
			  				  	null
			  				  -------
			  				  --kor--
			  				     0
			  				  -------
			  				----------
			  	메모리에 저장 ==> ObjectOutputStream  (Object라 데이터형에 구애받지 않고 저장)
			  	---------
			  	----------------------- => 직렬화
			  	age		name	 kor
			  	     ㅣ		  ㅣ  
			  	-----------------------
			  	메모리에서 값 읽기 ==> 역직렬화 : ObjectInputStream
			  	---a---
			  	 100X					
			  	-------	 ↘	---100X---	==> 주소접근 연산자 (.) 
			  				  --age--   	=> a.age / a.name / a.kor 
			  				  	 0
			  				  -------
			  				  --name--
			  				  	null
			  				  -------
			  				  --kor--
			  				     0
			  				  -------
			  				----------
			  	=> 파일관련
			  	   .txt (파일 자체를 제어)
			  	   .xml, .json, .csv, .properties => 웹   // xml => Spring,MyBatis => XML을 대체 (어노테이션)
			  	   ----- -----  ----- => 데이터분석(공공포털) 			------------- XML없이 사용 => Spring-Boot
	 Spring, MyBatisㅣ	   ㅣ=>JavaScript
	 		  	   	 	      ----------- 자바의 데이터형과 연동이 안됨
			  	   	 	      => class A{
			  	   	 	      	     String name="a";
			  	   	 	      	     int age=20;
			  	   	 	      	 }
			  	   	 	      => {name:"a",age:20} => JavaScript의 클래스 형식
			  	   	 	         => 이런형식으로 바꿔주는 => JSON
			  	   	 	         => Ajax, Vue, React ==> RestFul**
			  	   ==> 제어(읽기/쓰기) 클래스가 이미 라이브러리로 제공(Open API)
				
				=> 파일 정보 => File 클래스
					File : 파일, 디렉토리까지 관리
					---- 일반클래스 (new사용)
					사용법)
						File file=new File("c:\\javaDev\\aa.txt")
							 파일 정보 읽기
						File dir=new File("c:\\javaDev")
							 폴더 정보 읽기
							 
					주요 메소드)
						=> long length() : 파일 크기 => 단위 Bytes => return long형인거 주의!
						=> String getName() : 파일이나 폴더 이름만 읽은 경우
						=> String getPath() : 경로+이름 읽기 (업로드/다운로드)
						=> String getParent() : 경로만 읽기
						=> boolean isFile(), boolean isDirectory()
						=> boolean exists() : 존재여부 확인
						=> File[] listFiles() : 폴더안에 있는 모든 파일 읽기
						=> delete() : 파일 삭제
						=> createNewFile() : 파일 생성
						=> mkdir() : 폴더 생성 
						----------------------------------------------------------------
					FileInputStream / FileReader
						=> read(), read(byte[], offset, length), close()
					FileOutputStream / FileWriter
						=> write(), write(String..), close()
			 
 */
// Buffered => 속도가 빠르다 => 파일 읽기
import java.io.*;
// 패키지 설정 => 예외처리 (CheckException) => 컴파일러가 예외처리 여부를 체크
// java.net, java.sql => CheckException
// 파일열기 => 종료시에 파일닫기를 한다
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* try {
			String data="";
			FileReader fr=new FileReader("c:\\javaDev\\genie.txt");
			int i=0;
			while((i=fr.read())!=-1) {
				data+=(char)i;
			}
			fr.close(); // 파일 닫기 까먹지 않기!!
			System.out.println(data);
		}catch(Exception ex) {} */
		try {
			FileInputStream fis=new FileInputStream("c:\\javaDev\\genie.txt");
			// 1바이트로 읽음(FileInputStream) => 2바이트로 변경(InputStreamReader)
			// 필터 스트림 ==> 1byte를 읽어서 => 2byte로 변환해서 사용
			BufferedReader in=new BufferedReader(new InputStreamReader(fis));
			String data="";
			/*while(true) {
				String s=in.readLine(); // 한줄씩 읽기
				if(s==null) // 데이터가 없는 경우
					break;
				data+=s;
			}*/
			while((data=in.readLine())!=null){
				System.out.println(data);
			}
			in.close();
		}catch(Exception ex) {}
	}

}
