// 1~100까지 5의 배수의 합과 갯수
public class 제어문_반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum5=0,a5=0;
		
		for(int i=1;i<=100;i++) // int 뺴먹지 않기
		{
			if(i%5==0)	// if문에 문장여러개면 무조건 {} , 그냥 if문 쓰면 무조건 {}쓰자
			{
				sum5+=i;
				a5+=1; // a5++
			}
			
		}
		System.out.println("1~100까지 5의 배수의 합:"+sum5);
		System.out.println("1~100까지 5의 배수의 갯수:"+a5);
	}

}
