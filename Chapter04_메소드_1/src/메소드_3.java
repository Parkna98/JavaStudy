//  리턴값을 받는 경우

public class 메소드_3 {
	static int plus(int a, int b)
	{
		System.out.println("plus() call");
		System.out.println("요청처리 종료...");
		System.out.println("결과값을 전송...");
		return a+b; // void가 아니기 때문에 return값이 있어야한다!! (생략불가)
		// return 이후에는 코딩불가 (return하면 종료)
	}
	/*
	 * 		main에서는 가급적이면 처리하지 않는다 => 시작 메소드만 호출
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=plus(10,20); // 결과값을 받을 때 메소드의 데이터형과 일치시키기
		System.out.println("결과값:"+c);
	}

}
