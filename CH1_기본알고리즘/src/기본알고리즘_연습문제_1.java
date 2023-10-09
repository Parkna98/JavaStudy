
public class 기본알고리즘_연습문제_1 {

	// 왼쪽 아래가 직각인 이등변 삼각형을 출력
	static void triangleLB(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	// 왼쪽위, 오른쪽위, 오른쪽아래가 직각인 이등변삼각형 출력
	static void triangleLU(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) 
				System.out.print('*');
			System.out.println();  
		}
	}
	
	static void triangleRU(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++)
				System.out.print(' ');
			for(int k=1;k<=n-i+1;k++)
				System.out.print('*');
			System.out.println();
		}
	}
	
	static void triangleRB(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++)
				System.out.print(' ');
			for(int k=1;k<=i;k++)
				System.out.print('*');
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangleLB(5);
		triangleLU(5);
		triangleRB(5);
		triangleRU(5);
	}

}
