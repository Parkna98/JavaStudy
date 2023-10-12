package com.sist.main;// 폴더명 => 폴더없으면 폴더 만들어짐
// 패키지 : 클래스를 기능별로 나눔 => 따로 만들지않으면 default package 자동생성
import com.sist.util.User; // 다른폴더에 들어가있는 클래스는 import를 통해 부른다 (같은폴더면 상관없음)
public class MainClass {
	// 폴더가 다르기때문에 클래스이름 가능
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass2 m=new MainClass2(); // 같은 폴더에있는 클래스는 바로 가져다 쓸 수 있음
	}

}
