// *=, /=
/*
 *	int a=10;
 *	a*20; ====> a=a*20 ===> a=10*20 => a=200
 *
 * 	int a=10;
 * 	a/=3; ====> a=a/3 ====> a=10/3 ==> a=3
 */
public class 복합대입연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		a*=20;
		System.out.println("a="+a); // a=200
		
		a/=3; // 200/3 = 66 => a에 다시 10을 주고싶다면, 이 전줄에 a=10;으로 변수 수정하기
		System.out.println("a="+a);
		
		final int A=10; // final 붙이면 상수, 상수는 수정불가, 상수는 모든글자 대문자!
		int b=A*20; // 다른 변수에 연산값 지정해야함
	}

}
