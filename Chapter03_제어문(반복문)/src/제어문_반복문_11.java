// 20개의 정수 난수 발생 => 짝수, 홀수 
public class 제어문_반복문_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int even=0,odd=0; // 출력되는것이 변수다!
//		for(int i=1;i<=20;i++)
//		{
//			int rand=(int)(Math.random()*10)+1;
//			System.out.println(rand+" ");
//			if(rand%2==0)
//				even++;
//			else
//				odd++;
//		}
//		System.out.println("\n============결과값============");
//		System.out.println("짝수의 갯수:"+even);
//		System.out.println("홀수의 갯수:"+odd);
		
		int a3=0,a5=0,a7=0;
		for(int i=1;i<=20;i++)
		{
			int aa=(int)(Math.random()*10)+1;
			System.out.print(aa+" ");
			if(aa%3==0)
			{
				a3++;
			}
			if(aa%5==0)
			{
				a5++;
			}
			if(aa%7==0)
			{
				a7++;
			}
				
		}
		System.out.println("\n");
		System.out.println("3의 배수의 갯수:"+a3);
		System.out.println("5의 배수의 갯수:"+a5);
		System.out.println("7의 배수의 갯수:"+a7);
		
		System.out.println("=======================");
		// 1-2+3-4+5-6+7-8+9-10
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				sum-=i;
			else
				sum+=1;
		}
		System.out.println(sum);
		
		// BDFHJLN
		System.out.println("=======================");
		for(char c='B';c<='N';c+=2) // 알파벳이면 알파벳으로 굳이 정수로 바꾸지않아도됨
		{
			System.out.print(c);
		}
		
	}
	/*
	 * 		for문 수행시에 => 수열 (숫자마다 패턴을 가지고 있어야 반복문이 수행된다)
	 * 		1 2 3 4 5 6 7..
	 * 		2 4 6 8 10 12..
	 * 		1111 222 3324 5336377 => 패턴X
	 * 
	 * 		1-2+3-4+5-6+7-8+9-10
	 */
	
	
}
