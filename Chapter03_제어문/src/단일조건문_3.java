/*
 *  1~100 사의 난수를 3개발생 
 *  => 발생된 난수출력
 *  => MAX, MIN 출력
 */
public class 단일조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = (int)(Math.random()*100)+1;
		int num2 = (int)(Math.random()*100)+1;
		int num3 = (int)(Math.random()*100)+1;
		
		System.out.println("첫번째 난수:"+num1);
		System.out.println("두번째 난수:"+num2);
		System.out.println("세번째 난수:"+num3);
		
		int max=num1; // 간단히 생각하기
		if (max<num2)
			max=num2;
		if (max<num3)
			max=num3;
		System.out.println("MAX:"+max);

		int min=num1;
		if (min>num2)
			min=num2;
		if (min>num3)
			min=num3;
		System.out.println("MIN:"+min);
		
//		처음 생각은 밑의 방법이엇는데 상당히 비효율적
//		if(num1>=num2 && num1>=num3)
//		{
//			System.out.println("최댓값:"+num1);
//		}
//		if(num2>=num1 && num2>=num3)
//		{
//			System.out.println("최댓값:"+num2);
//		}
//		if(num3>=num1 && num3>=num2)
//		{
//			System.out.println("최댓값:"+num1);
//		}
//		if(num1>=num2 && num1>=num3)
//		{
//			System.out.println("최댓값:"+num1);
//		}
//		if(num1>=num2 && num1>=num3)
//		{
//			System.out.println("최댓값:"+num1);
//		}
//		
		
	}

}
