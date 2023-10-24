package com.sist.exception;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// printStackTrace() : 에러의 발생근원지를 찾아 단계적으로 출력
// getMessage() : 에러의 원인을 간단히 출력
// toString() : 에러의 Exception 내용과 원인을 출력
public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메소드나 클래스 존재오류
//		try {
//			Class c=Class.forName("nonExistsClass");
//			c.getMethod("method");
//		}catch(NoSuchMethodException | ClassNotFoundException e) {
//			e.printStackTrace(); 
//		}
		// 파일읽기쓰기같은 입출력오류
		/*try {
			byte[] list= {'a','b','c'};
			System.out.write(list);
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}*/
		// 파일경로설정 오류
//		try {
//			File file=new File("file.txt");
//			FileReader fr=new FileReader(file);
//		}catch(FileNotFoundException e){
//			e.printStackTrace();
//		}
//		// 0으로 나눌때 오류
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.getMessage();	// 	" / by zero "
			e.printStackTrace();
		}
		// 정수로 변환불가능한 오류
//		try {
//			String str="1a2b3c";
//			int a=Integer.parseInt(str);
//		}catch(NumberFormatException e) {
//			System.out.println(e.getMessage());
//		}
		// 배열의 범위 오류
//		try {
//			List<String> list=new ArrayList<>();
//			list.add("hello");
//			list.add("world");
//			System.out.println(list.get(2));
//		}catch(IndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
	}

}
