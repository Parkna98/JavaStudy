// 변수 => 초기화 
	/*
	 *  	1. 명시적 초기화
	 *  	2. 초기화 블록
	 *  	3. 생성자
	 *  	
	 *  	=> class의 블록 : 선언만 가능 => 구현이 불가능하다
	 *  							   ---- 메소드 호출
	 *  							   ---- 연산처리
	 *  							   ---- 제어문 처리
	 *  							   ---- 파일읽기
	 *  							   ---- 키보드 입력값
	 *  							   ---- 변수값 변경
	 */

class Student{
	int a;
	// a=10; // 오류: 변수값변경불가
	int b=10; // 선언과 동시에 초기화 가능 => 명시적 초기화 (1)
	
	{
		a=100; // 초기화 블록 => class{} 말고 초기화블록에서 구현가능 => 자동처리
		// 자동로그인 
		// 크롤링해서 데이터 저장 
	}
}

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
