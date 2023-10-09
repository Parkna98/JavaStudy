// 3. 1~10까지 출력하는 메소드 구현
// 4. 1~10까지 합을 구하는 메소드 구현
	
/*
 * 
 * 		메소드 : 기능처리 (연산자+제어문)
 * 				= 다른 클래스 연결
 * 				= 재사용 (호출)
 */

public class 문제3_4 {
	
	// 문제3. ==> 리턴형x, 매개변수x
	static void num() {
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
	}
	
	// 문제4. ==> 리턴형o, 매개변수x
	static int sum() {
		int res=0;
		for(int i=1;i<=10;i++) {
			res+=i;
		}
		return res; // 자체 출력 (void)
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num();
		int sum=sum();
		System.out.println("\n"+sum);
	}

}
