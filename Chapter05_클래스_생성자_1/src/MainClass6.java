class C{
	int a=10;
	void C(){
		// void를 붙이면 일반함수가 됨
		// 리턴형 없이 C(){} 형식이 생성자임
		System.out.println("C클래스의 default 생성자 호출");
	}
	/*
	 * 		생성자 => 초기화가 필요하다 (명시적인 초기화가 불가능하다)
	 * 				제어문 / 파일읽기
	 * 			 => 시작과 동시에 처리 => 가장 먼저 호출
	 * 				-------------
	 * 					  ㅣ
	 * 				 	자동로그인
	 * 					윈도우 화면 설정
	 * 					서버 연결 
	 * 					데이터베이스 연결
	 * 
	 */
}
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// C(); => Error!
		// new C(); // 생성자 호출 방법 : **반드시 new 생성자()
		// new C().a=100;
		C c=new C(); // c에 주소값 저장
//		c.a=100;
//		new C().a=1000;
//		System.out.println(new C().a); // a=10 => new를 썼기때문에 다른메모리에 생성됨
//		System.out.println(c.a); // a=100 => 주소값을 저장해놨기때문에 주소에 저장된 값을 호출
		c.C(); // 생성자 호출
	}

}
