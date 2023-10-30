package com.sist.manager;
// 파일 입출력
import java.util.*; // ArrayList, Date

import com.sist.vo.BoardVO;

import java.text.*; // SimpleDateFormat
import java.io.*; // File관련 => ObjectInputStream / ObjectOutputStream

public class BoardManger {
	// 게시물 목록 => 모아서 관리
	private static ArrayList<BoardVO> bList=new ArrayList<BoardVO>();
	// 값 채우기
	static {
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream("c:\\java_data\\board.txt"); // 파일저장
			ois=new ObjectInputStream(fis); // 파일읽기 // ObjectInputStream 쓰려면 데이터에 직렬화 인터페이스 구현!!
			bList=(ArrayList<BoardVO>)ois.readObject();
		} catch(Exception ex) {
			// 에러 위치 체크
			ex.printStackTrace();
		} finally {
			try {
				fis.close();
				ois.close();
			}catch(Exception ex) {}
		}
	}
	// 목록 출력 => 리스트로 받아서 처리
	public ArrayList<BoardVO> boardListData(int page){
		ArrayList<BoardVO> list=new ArrayList<BoardVO>();
		int j=0;
		int rowSize=10; // 한페이지에 10개씩 출력한다
		int pagecnt=(page*rowSize)-rowSize;
		/*
			1page => 0~9
			2page => 10~19
			3page => 20~29 => 0,10,20,30 일때 페이지이동
			...		==> 3page 요청시 앞페이지들 버리고 20부터 호출 (for문은 0부터 돌아서 중간페이지 출력시에 앞페이지 스킵하기 위함)
		 */
		// 웹에서는 오라클 => 인라인뷰
		// MySQL => LIMIT
		for(int i=0;i<bList.size();i++) {
			if(j<10 && i>=pagecnt) { // 각 페이지별로 pagecnt부터 출력 
				BoardVO vo=bList.get(i);
				list.add(vo);
				j++; // 10개씩 저장
			}
		}
		return list;
	}
	public int boardTotalPage() {
		return (int)(Math.ceil(bList.size()/10.0));
		// ceil => 올림함수 (소수점이하 0제외 올림)
	}
	// 데이터 추가 ===
	public void boardInsert(BoardVO vo) {
		bList.add(vo); // 메모리 => 프로그램 종료시 사라짐 => 방지 : 파일저장
		fileSave(); // 추가후 파일에 저장한다
	}
	public void fileSave() { // 추가,삭제,수정에 공통으로 들어가는 코딩
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos=new FileOutputStream("c:\\java_data\\board.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(bList); // 덮어쓰기
		}catch(Exception ex) {
			// 에러 위치 확인
			ex.printStackTrace();
		}finally{
			try {
				fos.close();
				oos.close();
			}catch(Exception ex) {}
		}
	}
	// 상세보기
	// 수정하기 ===
	// 삭제하기 === 동일코딩 ==> 파일에 저장 
	// 검색하기
	// 자동 증가번호 만들기 => 시퀀스 
	// 공통 => 파일 저장
}
