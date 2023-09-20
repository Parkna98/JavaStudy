
public class 문제17_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//17.
		/*
		 * 	ABCDE
		 * 	ABCDE
		 * 	ABCDE
		 * 	ABCDE
		 * 	ABCDE
		 */
		for(int i=1;i<=5;i++) {
			char ch='A';
			for(int j=1;j<=5;j++) {
				System.out.print(ch++);
			}
			System.out.println();
			}
		
		System.out.println("=============");
		
		//18.
		/*
		 * 	AAAAA
		 * 	BBBBB
		 * 	CCCCC
		 * 	DDDDD
		 * 	EEEEE
		 */
		char ch2='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(ch2);
			}
			ch2++;
			System.out.println();
		}
	}

}
