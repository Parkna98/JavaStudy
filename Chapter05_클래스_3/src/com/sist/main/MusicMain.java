package com.sist.main; // com-sist-main이라는 폴더생성하면서 패키지생성
import java.util.*;
import java.io.*; // 입출력(파일)관련
// 일반 데이터형 => 사용자 정의 데이터형 => 제공이 안됨 => 직접 제작
// class
// 데이터만 저장, 메소드 저장
class Music{
	String rank;
	String title;
	String artist;
	String album;
	String key;
}

// 데이터형을 모아서 관리
class MusicData{
	// 사용자 정의 데이터형 = 기본형처럼 사용이 가능
	// String[] 
	Music[] musics=new Music[50];
	// 초기화
	// 1. 초기화 블록이용 2. 생성자
	// {구현가능} ( {}블록밖에서는 구현불가 )
	// {구현} => 초기화 블록 => 자동 생성
	{
		// 예외처리 => 에러를 미리 방지 => check / uncheck => io나 sql은 무조건 check(컴파일전에 예외처리가 되었는지 확인)
		try {
			FileReader fr=new FileReader("c:\\javaDev\\genie.txt");
			String data="";
			int i=0; // 1글자씩 => 정수형 => char변환
			while((i=fr.read())!=-1) {
				// -1 : 파일의 끝 => EOF ==> 파일이 끝날때까지 읽어라
				data+=(char)i;
			}
			
			fr.close(); // 파일은 반드시 읽고 닫아줘야함
			//System.out.println(data);
			String[] datas=data.split("\n"); // 데이터를 한줄씩 자름
			i=0; // 0으로 초기화 안해주면 앞에서 i=-1이 된상태로 저장되서 오류남 
			for(String s:datas) {
				String[] ss=s.split("\\|"); // 데이터를 "|"를 기준으로 자름
				musics[i]=new Music(); 
				//if(ss[0].equals("47"))
				//	continue;
				musics[i].rank=ss[0];
				musics[i].title=ss[1];
				musics[i].artist=ss[2];
				musics[i].album=ss[3];
				musics[i].key=ss[4];
				i++;
			}
		}catch(Exception ex) {}
	}// ==> 초기화 블록을 이용한 파일 읽기
} 

// 제어
public class MusicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicData md=new MusicData(); 
		System.out.println("============ 뮤직 ===============");
		for(int i=0;i<md.musics.length;i++) {
			System.out.println("순위:"+md.musics[i].rank);
			System.out.println("제목:"+md.musics[i].title);
			System.out.println("가수:"+md.musics[i].artist);
			System.out.println("앨범:"+md.musics[i].album);
			System.out.println("동영상키:"+md.musics[i].key);
			System.out.println("==============================");
		}
		Scanner scan=new Scanner(System.in);
		System.out.print("동영상 선택(1~49):");
		int mno=scan.nextInt();
		Music mm=md.musics[mno-1]; // 인덱스 0부터
		System.out.println("====== 상세보기 =======");
		System.out.println("순위:"+mm.rank);
		System.out.println("제목:"+mm.title);
		System.out.println("가수:"+mm.artist);
		System.out.println("순위:"+mm.album);
		System.out.print("동영상을 실행 할까요?(y|n):");
		char c=scan.next().charAt(0);
		if(c=='y'|c=='Y') {
			try {
					Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe " // exe뒤에 공백주는것 확인!
												+"http://youtube.com/embed/"+mm.key);
			}catch(Exception ex) {}
		}
		else {
			System.out.println("프로그램 종료!!");
		}
	}

}
