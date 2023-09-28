// 11. 1~100 3의 배수이고 5의 배수를 출력하는 프로그램 작성
public class 문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++)
		{	
			if(i%3==0) // if(i%3==0 && i%5==0) 논리연산자쓰면 한번에 가능
			{
				if(i%5==0)
				{
					System.out.printf("%2d\t",i);
				}
			}
		}
	}

}
