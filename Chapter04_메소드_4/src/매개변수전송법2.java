
public class 매개변수전송법2 {
	
	static void swap(int a) {
		a=100;
	}
	
	static void swap2(int[] arr) {
		arr[0]=100;
	}
	/*
	 *  배열 => 메모리 주소 이용
	 *  기본형 => 실제 저장된 값 이용
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=10;
		swap(b); // b의 값인 10만 전달
		System.out.println("b="+b); // b=10 => 바뀌지 않음(값만 전달한다 / Call By Value)
		
		/*
		 * 		int b=10;
		 * 		int a=b;
		 * 		a=100;
		 */
		
		int[] kkk= {1,2,3};
		int[] aaa=kkk;
		System.out.println("kkk="+kkk);
		System.out.println("aaa="+aaa); /// aaa와 kkk의 주소는 같음
		swap2(kkk);
		System.out.println(kkk[0]); // kkk[0]=100 => 값 변함(주소를 전달하기때문 / Call By Reference)
	}

}
