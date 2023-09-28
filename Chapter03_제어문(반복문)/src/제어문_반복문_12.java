// 1~30까지 출력 => 30사이의 짝수만 출려
/*
 *  2 4 6
 *  8 10 12 => 3개씩 출력
 */
public class 제어문_반복문_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=30;i++)
		{	
			
			if(i%2==0)
			{
				System.out.printf("%2d\t",i); // \t => 두칸씩 띄어서 출력, 3d면 세칸...
			}
			if(i%6==0)
			{
				System.out.println("\n");
			}
		}
	}

}
