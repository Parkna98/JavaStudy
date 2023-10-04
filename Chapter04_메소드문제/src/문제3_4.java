// 3. 1~10까지 출력하는 메소드 구현
// 4. 1~10까지 합을 구하는 메소드 구현

public class 문제3_4 {
	
	// 문제3.
	static void num() {
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
	}
	
	// 문제4.
	static int sum(int n) {
		int res=0;
		for(int i=1;i<=n;i++) {
			res+=i;
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=sum(10);
		System.out.println(sum);
	}

}
