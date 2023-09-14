/*
 * 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 
 * 변수 b의 값이 true가 되도록 하는 코드이다. 알맞은 코드를 넣으세요.
 */
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch= 'k';
		boolean b = (((int)ch>=65 && (int)ch<=90)||((int)ch>=97 && (int)ch<=122)||((int)ch>=48 && (int)ch<=57)?true:false);
		System.out.println(b);
	}

}
