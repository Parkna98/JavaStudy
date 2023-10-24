package com.sist.seoul;
import java.util.*;
// 출력
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("서울여행(1), 명소(2):");
		int num=scan.nextInt();
		
		// 값 받았으니 출력하려면
		// 먼저 매니저클래스 생성자 만들고
		// set으로 숨겨놓은거 get으로 들고와야지
		SeoulManager sm=new SeoulManager();
		Seoul[] seoul=sm.seoulAllData(num);
		for(Seoul s:seoul) {
			System.out.println(s.getNo()+"."+s.getName());
		}
	}

}
