package com.sist.io;
// ObjectInputStream : FileInputStream
import java.util.*;
import java.io.*;
public class MainClass_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis=new FileInputStream("c:\\java_data\\emp.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			ArrayList<Sawon> list=(ArrayList<Sawon>)ois.readObject(); // object로 선언하면 한번에 리스트로 받을수 있다 (저장,읽기 둘다편함)
			// 형변환시에 => 제네릭을 포함한다
			ois.close();
			fis.close();
			for(Sawon s:list) {
				System.out.println(s.getSabun());
				System.out.println(s.getName());
				System.out.println(s.getDept());
				System.out.println(s.getJob());
				System.out.println(s.getPay());
				System.out.println("=================");
			}
		}catch(Exception ex) {}
	}

}
