
public class 기본알고리즘_연습문제_2 {
	
	// n단의 피라미드를 출력하는 메서드를 작성하세요
	static void spira(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--)
				System.out.print(' ');
			for(int k=1;k<=(i-1)*2+1;k++)
				System.out.print('*');
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		spira(5);
	}

}
