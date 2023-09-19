// 1~100까지 = 3의배수의 합, 5의 배수합, 7의 배수의 합 => 출력
public class 제어문_반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum3=0, sum5=0, sum7=0;
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)		// ** 3,5,7의배수는 중복이 있음 => 단일조건문!! if if if (o) else if 쓰면 중복안나옴 
				sum3+=i;	// 중복있으면? 단일!!
			if(i%5==0)
				sum5+=i;
			if(i%7==0)
				sum7+=i;
		}
		System.out.println("1~100까지 3의배수의 합:"+sum3);
		System.out.println("1~100까지 5의배수의 합:"+sum5);
		System.out.println("1~100까지 7의배수의 합:"+sum7);
	}

}
