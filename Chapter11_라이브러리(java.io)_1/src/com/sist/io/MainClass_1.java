package com.sist.io;
/*
		자바 입출력 (입력 : InputStream / 출력 : OutputStream) ==> IO
		=> 반드시 예외처리
		=> 반드시 import를 이용해서 클래스를 읽어온다
				------ import java.io.*;
		=> 특징
			=> 단방향
			=> 데이터 이동통로를 이용하고 있다
			   ---------------- Stream (빨대) 
			=> 이동 통로
			   -------
			   	1) 1byte : 바이트 스트림 => (한글은 2byte라 사용불가)
			   	   ~InputStream, ~OutputStream
			   	   => 파일 업로드 / 파일 다운로드 
			   	   => 네트워크는 1바이트...
			   	2) 2byte : 문자 스트림
			   	   ~Reader, ~Writer
			   	   => 파일 쓰기 / 파일 읽기
		-----------------------------------------
		바이트 스트림 => File
		---------
			InputStream			OutputStream
				ㅣ					ㅣ
			FileInputStream		FileOutPutStream
			ObjectInputStream	ObjectOutPutStream
		문자 스트림
		--------
			Reader				Writer
			------				------
			FileReader			FileWriter
		-------------------------------------------
			보조 스트림
			Buffered~
			  => BufferedReader, BufferedWriter
			  	 BufferedInputStream, BufferedOutputStream
		
		1. 자바 특징
		   -------
		   자바에서 IO는 Stream을 사용하고 있다
		   			 ------- 
		   			 	ㅣ 데이터를 이동하는 통로
		   			 	  ---------------- FIFO(선입선출 : First in First out) (Queue)
		   			 	  				   LIFO(Last in First out) (Stack)
			=> IO
				= 메모리 입출력
				= 파일 입출력 
				= 네트워크 입출력 => 웹
			=> IO는 단방향 통신
				    => 양방향 => 쓰레드를 이용해서 두개의 프로그램을 동시에 처리
				       ---- 채팅 
			=> 읽기 / 쓰기 (1byte, 2byte)
			   자바(서버) ======> 브라우저 ======> 화면 출력
			   				 	 ㅣ
			   				   C/C++
			   char=>2		   char=>1     	  char=>2
			   char=>byte(1) 			    byte=>char  => 이과정을 통해 한글이 안깨짐
			   	  encoding					  decoding 
			   	  
			   = 1byte : 바이트 스트림
			   		~InputStream, ~OutputStream
			   = 2byte : 문자 스트림
			   		~Reader, ~Writer
			   * 한글은 1글자당 2byte => 한글깨짐주의(Reader,Writer를 써야함)
		
		(p356)
		메모리 (데이터 저장) ======> 자바응용프로그램 ======> 모니터 전송
						  ㅣ				  	  ㅣ
					 InputStream		 OuputStream
					 System.in			 System.out 	=====> 표준 입출력
					 
					 class System
					 {
					 	static InputStream in; // static이라 클래스명.으로 호출 
					 	static OutputStream out;
					 }
		IO 관련 클래스 (357page)
				Object
				   ㅣ
		--------------------------------------------------
		ㅣ		ㅣ			 		ㅣ			 ㅣ		 ㅣ
	**File 	InputStream  		OuputStream  	Reader  Writer
	   			ㅣ			  		ㅣ			 ㅣ  	 ㅣ
	   **FileInputStream	**FileOutputStream
	   	FilterInputStream   FilterInputStream
	   			ㅣ					ㅣ	
	   **BufferedInputStream **BufferedInputStream
	   			
	   		Reader				Writer
	   		  ㅣ					  ㅣ
	   	**BufferedReader	**BufferedWriter
	   	**FileReader		**FileWriter
	 	--------------------------------------------------
	 	**ObjectInputStream	**ObjectOutputStream
	 
	 ==> 파일모드(mode) => r,w,a (read,write,append)
	 	 r--w--... (읽기/쓰기가 가능하다)
	 	 
	 	 r
	 	 FileReader r=new FileReader("경로")
	 	 w
	 	 FileWriter w=new FileWriter("경로") ==> create mode (새로생성)
	 	 a
	 	 FileWriter w=new FileWriter("경로",true) ==> append mode (추가)
	 
	 ==> File : 독립된 클래스
	 	 -----
	 	 	= File 정보
	 	 	  new File("경로명\\파일명")
	 	 	= 디렉토리 정보
	 	 	  new File("경로명")
	 	 	= 주요 기능 
	 	 	  => getName() : 파일명, 폴더명
	 	 	  => getPath() : 경로명 ~ 파일명
	 	 	  => getParent() : 경로명
	 	 	  => 특성
	 	 	  	 1. canRead() : 읽기 전용
	 	 	  	 2. canWrite() : 쓰기 전용
	 	 	  	 3. isHidden() : 숨김 파일
	 	 	  => 파일/폴더 확인
	 	 	  	 isFile(), isDirectory()
	 
	 	 
 */
import java.util.*;
/*
	스택과 큐
	-------
	Queue (FIFO)
	-----
	int[] arr=new int[10];
	int index=0;
	for(int i=0;i<arr.length;i++){}
	
	Stack (LIFO)
	-----
	int index=9;
	for(int i=9;i<=0;i--){}
 */
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("=== Queue ===");
		Queue<Integer> q=new LinkedList<Integer>(); 
		// Queue는 인터페이스! => LinkedList로 구현해야함!
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		q.offer(50);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		System.out.println("=== Stack ===");
		Stack<Integer> s=new Stack<Integer>();
		// Stack은 일반클래스! (new 사용 가능)
		// 저장
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		while(!s.isEmpty()) {
			System.out.println(s.pop()); // 50부터 출력 (50,40,30,20,10)
		}*/
		String s="자바";
		byte[] b=s.getBytes(); // decoding 
		// 웹에 보낼땐 바이트로 인코딩, 받을땐 char로 디코딩
		System.out.println(Arrays.toString(b));
	}
	
}
