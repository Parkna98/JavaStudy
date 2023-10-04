import java.util.Scanner;
// 로그인 처리
// 사용자로부터 받는 값 => ID, PW (매개변수)
// 로그인 여부 확인 => void(해당 메소드 자체처리), 결과값을 받을 건지  선택
// ==> 결과값 받아서 처리 : boolean, int(0,1), String
//					  ---------
public class 메소드_7 {
	// 입력메소드
	static String userInput(String msg) {
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+"를 입력하시오:"); // 메소드 하나로 msg에 따라 값을 여러번받기위함
		return scan.next();
	}
	
	static boolean isLogin(String id, String pwd) {
		final String ID="admin"; // 상수
		final String PWD="1234";
		boolean bCheck=false;
		// 아이디,비번 정보 => 파일, 오라클에 저장되어있는 정보 => 일단 임의로 상수로 대체
		if(id.equals(ID) && pwd.equals(PWD)) {
			bCheck=true;
			// return true;
		}
		// else bCheck=false; 앞에 default값으로 false설정해서 생략가능
		
		return bCheck;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id=userInput("아이디");
		String pwd=userInput("비밀번호");
		boolean bCheck=isLogin(id,pwd);
		// boolean => bXxxxx(변수이름)
		// isXxxxx => 리턴형이 boolean
		// 처리
		if(bCheck==true)
			System.out.println("메인 화면으로 이동...(response.sendRedirect('main.jsp')");
		else
			System.out.println("ID나 비밀번호가 틀립니다..(history.back())");
		
	}

}
