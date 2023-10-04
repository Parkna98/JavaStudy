/*
 * 		1. 문자열을 입력 받아서 대문자 => 소문자, 소문자 => 대문자
 * 		   -------------  -------------------------
 * 		2. 문자열을 입력을 받아서 반대로 출력 
 * 		   --------------- --------
 * 
 */
import java.util.Scanner;
public class 메소드_2 {
	
	// 문자열을 입력받는 기능 : 리턴형 => String, 매개변수(x)
	static String userInput() {
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열 입력:");
		return scan.nextLine();
		// next() : 엔터시에 메모리에 저장 => 공백까지 문자열 인식
		//			=> aaa bbb ccc ddd ==> aaa만 인식
		// nextLine() : 엔터시에 메모리에 저장 => 한줄 전체 인식
		//			=> aaa bbb ccc ddd ==> aaa bbb ccc ddd 다 인식
	}
	
	// 대문자 => 소문자, 소문자 => 대문자
	static void alphaChange(String msg) {
		String result="";
		for(int i=0;i<msg.length();i++) {
			char c=msg.charAt(i);
			if(c>='A' && c<='Z') {
				//result+=(char)(c+32); // 소문자 변환
				result+=String.valueOf(c).toLowerCase();
				// 		----------------char=>String
			}
			else if(c>='a' && c<='z') {
				//result+=(char)(c-32); // 대문자 변환
				result+=String.valueOf(c).toUpperCase();
			}
			else
				result+=c;
		}
		System.out.println("결과값 출력:"+result);
		
	}
	
	// 	=> 리턴형, 매개변수(String)
	//	   -----결과값 받아서 출력, 메소드 안에서 처리(정답은 없음, 프로그램에 잘맞는거 선택)
	// 반대로 출력
	static String alphaReverse(String msg) {
		String result="";
		for(int i=msg.length()-1;i>=0;i--) {
			result+=msg.charAt(i);
		}
		return result;
	}
	// 	=> 결과값을 받아서 출력
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg=userInput();
		System.out.println("msg:"+msg);
		//alphaChange(msg); // void 메소드라 받아주는 데이터형 없이 메소드만 나와도됨
		String res=alphaReverse(msg);
		System.out.println(res);
	}

}
