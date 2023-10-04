/*
 * 		increment() => num 1
 * 		increment() => num 1
 * 		increment() => num 1
 * 		세번 호출해도 메소드를 처음부터 다시 부르기때문에 num은 1이다! 증가되지않음!
 */
public class 메소드_8 {
	static void increment() {
		int num=1; // 지역변수 (메소드 안에서만 사용)
		System.out.println(num);
		num++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		increment();	
		increment();
		increment(); // 3번 다 1임, 메소드에서 출력하고 증가하고 사라짐
		//				다음에 또 부를때 새로운 메모리에 1을 출력하고 증가하고 사라짐
	}

}
