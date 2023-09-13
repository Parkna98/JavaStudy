/*
 *  println 과 printf 의 차이
 *  
 * 
 * 
 */
public class 문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* (15)
		 * int a = 5; int b = 5; System.out.println("a와 b가 같은가요?" + (a==b));
		 * System.out.println("a가 b보다 큰가요?" + (a>b));
		 * System.out.println("a가 b보다 작은 가요 ?" + (a<b));
		 * System.out.println("a가 b와 같은면서 3보다 큰가요?" +(a==b&&a>3));
		 * System.out.println("a가 50이 아닌가요?" +(a!=50));
		 */
		
		/* (5)
		 * int num1=10, num2=10; System.out.printf("%d \n", ++num1);
		 * System.out.printf("%d \n", num1); System.out.printf("%d \n", num2++);
		 * System.out.printf("%d \n", num2);
		 */

		/* (4)
		 * int num1=1, num2=2, num3=3, num4=4, num5=5; num1 = num1 + num2; num2 = num2 -
		 * 2; num3 = num3 * 2; num4 = num4 / 2; num5 = num5 % 2;
		 * System.out.printf("%d, %d, %d, %d, %d \n",num1,num2,num3,num4,num5);
		 */
		
		/* (6)
		 * int num1=10; System.out.printf("%d \n", num1); num1++;
		 * System.out.printf("%d \n", num1); ++num1; System.out.printf("%d \n", num1);
		 * --num1; System.out.printf("%d \n", num1); num1--; System.out.printf("%d \n",
		 * num1);
		 */

		/* (7)
		 * int num1=10, num2=10; int a, b; num1 = num1 + 1; a = num1;
		 * System.out.printf("%d, %d \n", a, num1); b = num2; num2 = num2 + 1;
		 * System.out.printf("%d, %d \n", b, num2);
		 */
	
		/* (10)
		 * int num1 = 2; int num2 = 7; int num3; int num4; num1++; num3 = --num1;
		 * --num2; num4 = num2++; System.out.printf("%d\n", num3);
		 * System.out.printf("%d\n", num4);
		 */
		
		/* (12)
		 * int a=(int)(Math.random()*100)+1; int b=(int)(Math.random()*100)+1;
		 * System.out.println("a-b="+(a-b)); System.out.println("a*b="+(a*b));
		 */
		
		/* (13)
		 * int a=(int)(Math.random()*100)+1; int b=(int)(Math.random()*100)+1; int
		 * c=(int)(Math.random()*100)+1;
		 * 
		 * System.out.println("a*b+c="+(a*b+c));
		 */
		
		/* (14)
		 * int a=(int)(Math.random()*100)+1; int b=(int)(Math.random()*100)+1;
		 * 
		 * System.out.println("a%b="+(a%b));
		 */
	}

}
