// 9. 100~999 사이의 4의배수가 아닌 수의 갯수,합을 출력하는 프로그램 작성
public class 문제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, count=0;
		
		for(int i=100;i<=999;i++)
		{
			if(i%4==0) // if(i%4!=0) 이렇게 쓰고 sum+=i; count++; 쓰면 else 안써도됨
			{
				continue;
			}
			else
			{
				sum+=i;
				count++;
			}
		}
		System.out.println("갯수:"+count);
		System.out.println("합:"+sum);
	}

}
