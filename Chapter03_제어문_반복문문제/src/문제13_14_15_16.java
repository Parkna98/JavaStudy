
public class 문제13_14_15_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//13. 
		char c='*';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print(c); // 굳이 처음에 변수c 설정 하지 않아도됨 => System.out.print('*'); 바로 출력OK
			}
			System.out.println();
		}
		
		//14 
		/*	11111	
		 * 	22222
		 * 	33333
		 * 	44444
		 * 	55555
		 */
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		//16. 
		/*	1####
		 * 	#2###
		 * 	##3##
		 * 	###4#
		 * 	####5
		 * 
		 */
		char ch='#';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j)
				System.out.print(i);
				else
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
