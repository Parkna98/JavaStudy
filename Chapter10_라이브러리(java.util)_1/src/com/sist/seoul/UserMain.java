package com.sist.seoul;
import java.util.*;
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("명소(1), 자연(2):");
		int no=scan.nextInt();
		
		SeoulManger sm=new SeoulManger();
		Seoul[] seoul=sm.seoulAllData(no);
		for(Seoul s:seoul) {
			System.out.println(s.getRank()+"."+s.getLocation());
		}
		
	}

}
