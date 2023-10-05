/*
 * 	정수 1개 입력 => 3의 배수 여부 확인
 */
public class 메소드_문제_2 {
	
	// 입력
	
	// 3의 배수
	static String check(int number) {
		String res=number+"는(은) 3의 배수가 아닙니다!"; // 디폴트값을 설정해둬서 else문장이 필요없음
		if(number%3==0)
			res=number+"는(은) 3의 배수입니다.";
		return res;
	}
	
	static void print(String res) {
		System.out.println(res);
	}
	
	static void process() {
		int num=메소드_문제_1.num(); // 재사용기법 => 메소드의 목적 
		String res=check(num);
		print(res);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
