import java.util.*;
// 사용자로부터 입력값(문자열) => 좌우대칭여부를 확인
// ABBA => 문자갯수 => length()
public class 문자열배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String msg=""; // 현재 String msg=null 인 상태, 이상태로 출력하면 오류
		// 오류처리(받는 문자열갯수가 짝수일수 있도록)
		while(true) {
			System.out.print("문자열 입력:");
			msg=scan.next();
			if(msg.length()%2==0) {
				break;
			}
			else continue;
		} // 좌우대칭확인
		boolean bCheck=true; // true를 디폴트로 걸어놓고 (why? if~else로 해결하지못하는문제이기때문에, if만걸고 수행하지않으면 디폴트값, 수행하면 false값으로 설정)
		int j=msg.length()-1; // for문안으로 들어가면 j가 계속 처음으로 초기화되서 밖으로 빼야함
		for(int i=0;i<msg.length()/2;i++) {
			char c=msg.charAt(i);
			char c1=msg.charAt(j);
			if(c!=c1) {
				bCheck=false;
				break;
			}
			j--;
		}
		if(bCheck==false) {
			System.out.println(msg+"는(은) 대칭 구조가 아닙니다");
		}
		else {
			System.out.println(msg+"는(은) 좌우대칭입니다!!");
		}
	}

}
