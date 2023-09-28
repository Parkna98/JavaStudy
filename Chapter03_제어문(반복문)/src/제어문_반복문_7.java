// A-Z
public class 제어문_반복문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int i=65;i<=90;i++)
//		{
//			System.out.println((char)i);
//		}
//		
		for(char c='A';c<='Z';c++) // char는 연산시 int로 계산되므로 굳이 위처럼 65부터 안들고 와도됨.
		{
			System.out.print(c+" ");
		}
	}
		
}
