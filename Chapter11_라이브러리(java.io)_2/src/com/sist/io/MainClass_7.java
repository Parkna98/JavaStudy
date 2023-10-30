package com.sist.io;
// ObjectInputStream : FileInputStream
import java.util.*;
import java.io.*;
public class MainClass_7 {
	private static class Point{
		public final long x,y;
		private Point(long x, long y) {
			this.x=x;
			this.y=y;
		}
	}
	private Point intersection(long a1,long b1,long c1,long a2,long b2, long c2) {
		double x=(double)(b1*c2 - b2*c1)/(a1*b1 - a2*b1);
		double y=(double)(a2*c1 - a1*c2)/(a1*b2 - a2*b1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			FileInputStream fis=new FileInputStream("c:\\java_data\\emp.txt");
//			ObjectInputStream ois=new ObjectInputStream(fis);
//			ArrayList<Sawon> list=(ArrayList<Sawon>)ois.readObject(); // object로 선언하면 한번에 리스트로 받을수 있다 (저장,읽기 둘다편함)
//			// 형변환시에 => 제네릭을 포함한다
//			ois.close();
//			fis.close();
//			for(Sawon s:list) {
//				System.out.println(s.getSabun());
//				System.out.println(s.getName());
//				System.out.println(s.getDept());
//				System.out.println(s.getJob());
//				System.out.println(s.getPay());
//				System.out.println("=================");
//			}
//		}catch(Exception ex) {}
		
	}

}
