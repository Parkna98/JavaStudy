// 리턴형(O), 매개변수(X)
// => 아이디 찾기
import java.util.Scanner;
public class 메소드_2 {
	
	// id 입력
	static String idInput() {
		Scanner scan=new Scanner(System.in);
		System.out.print("ID 입력:");
		return scan.next();
	}
	// 아이디 중복체크
	static boolean idCheck(String id) {
		boolean bCheck=false;
		String[] ids= {
			"hong","admin","lee","park","shim"
		};
		for(String i:ids) {
			if(id.equals(i)) {
				bCheck=true; // id가 존재하면 true(중복) 아니면 false(사용가능)
				break;
			}
		}
		return bCheck;
	}
	
	// 모든 메소드를 조립하는 메소드 (기본) (가급적이면 process에 코딩하고 main에서는 호출만!)
	static void process() {
		String id=idInput();
		// 사용자가 입력한 값
		boolean bCheck=idCheck(id); // 메소드 찾는방법 : Ctrl + 마우스좌클릭
		
		if(bCheck)
			System.out.println(id+"는 이미 사용중인 아이디 입니다");
		else
			System.out.println(id+"는 사용가능한 아이디 입니다");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
