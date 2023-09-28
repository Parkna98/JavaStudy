/*
 * 		★
 * 		★★
 * 		★★★
 * 		★★★★
 * 
 */

/*
 * 		줄수 별표
 * 		1	4  | 역순 => 더한다
 * 		2	3
 * 		3	2
 * 		4	1
 */
public class 제어문_반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("=============");
		
		char c='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c++);
			}

			System.out.println();
		}
		
	}
	

}
