/*
 * 		★★★★★
 * 		★★★★★
 * 		★★★★★
 * 		★★★★★
 * 
 * 		
 */
public class 제어문_반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print('★');
//			}
//			System.out.println();
//		}
		
//		System.out.println("=========");
//		
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=5;i<=j;j--)
//			{
//				System.out.print("★");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("=========");
//		
//		for(int i=5;i>=1;i--)
//		{
//			for(int j=1;i>=j;j++)
//			{
//				System.out.print("★");
//			}
//			System.out.println();
//		}
		
		// ABCDE
		// FGHIJ
		// KLMNO
		// PQRST
		
//		char ch='A';
//		
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print(ch++); // 하나씩 늘어가니까 ch++ // 반복문은 단지 몇줄이고 몇번 돌릴껀지
//			}
//			System.out.println();
//		}
	
		System.out.println("==============");
		// ABCDE
		// ABCDE
		// ABCDE
		// ABCDE
		
		// 문제를 보기전에 몇줄이고 몇번 반복하는지 보고
		// 변수의 위치를 생각한다! 
		// 변수가 for문 밖에 위치하면 계속 증가하거나 감소하는 식이고
		// 변수가 for문 안에 위치하면 반복될때마다 변수가 초기화되기 때문에 똑같은 모양을 볼 수 있다.
		
//		for(int i=1;i<=4;i++)
//		{	
//			char ch='A'; 				// 변수 위치를 잘 잡아야함,  위 문제와 char 변수 선언 문장의 위치만 다름
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print(ch++); // 하나씩 늘어가니까 ch++ // 반복문은 단지 몇줄이고 몇번 돌릴껀지
//			}
//			System.out.println();
//		}
		
		// ★☆☆☆
		// ☆★☆☆
		//	
		
		
		for(int i=1;i<=4;i++)  /// 	반복문 + 조건문도 항상 생각
		{
			for(int j=1;j<=4;j++)
			{
				if(i==j)
					System.out.print("★");
				else
					System.out.print("☆");
			}
			System.out.println();
		}
		
	}

}
