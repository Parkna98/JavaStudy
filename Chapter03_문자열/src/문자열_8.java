import java.util.Scanner;
// equals : 대소문자 구분 / equalsIgnoreCase() : 대소문자 구분X
public class 문자열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String MID="admin", MPWD="1234";
		Scanner scan=new Scanner(System.in);
		System.out.print("아이디 입력:");
		String id=scan.next();
		System.out.print("비밀번호 입력:");
		String pwd=scan.next();
		// equals는 대소문자구분!!
		if(id.equals(MID) && pwd.equals(MPWD)) // equalsIgnoreCase() => 대소문자구분안함 // equals() => 대소문자구분 
		{
			System.out.println(id+"님 로그인되었습니다");
		}
		else 
		{
			System.out.println("ID나 Password가 틀립니다");
		}
	}

}
