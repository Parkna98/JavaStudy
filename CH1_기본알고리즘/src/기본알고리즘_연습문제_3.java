
public class 기본알고리즘_연습문제_3 {
	
	// 숫자로 표현된 n단의 숫자피라미드 출력
	static void npira(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++)
				System.out.print(" ");
			for(int k=1;k<=(i-1)*2+1;k++)
				System.out.print(i%10);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		npira(11);
	}

}
