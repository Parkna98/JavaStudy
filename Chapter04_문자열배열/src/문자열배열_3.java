/* 			
 * 	String toUpperCase() => 대문자변환
 *  String toLowerCase() => 소문자변환
 */ 
public class 문자열배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="Hello Java";
		msg.toUpperCase();
		//System.out.println(msg); // msg="Hello Java" 변경사항 없음
		//msg = msg.toUpperCase(); // 다시 저장해야지 msg 변경됨
		System.out.println(msg.toUpperCase()); // 대문자로 출력 (저장x)
		System.out.println(msg.toLowerCase()); // 소문자로 출력 (저장x)
		//msg = msg.toLowerCase(); // msg를 소문자로 변환 저장
		System.out.println(msg);
		// 처리 => 다시 저장하지 않은 경우에는 원본을 유지한다.
		// 저장 할껀지 저장하지 않을껀지 잘 선택하기
		// 대문자로 변환하는 것은 가끔 사용
		// 오라클에서는 대소문자구분(저장된 데이터만 구분, 명령어는 x)
		// 예) 비밀번호를 대소문자섞어서 쓰고 저장하는것
		}

}
