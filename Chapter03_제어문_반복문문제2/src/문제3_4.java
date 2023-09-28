
public class 문제3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3.1에서 100까지 3의 배수를 더하는 while 문의 빈칸에 적절한 코드를 삽입하라.
//		int sum=0, i=1;
//		while (i<100) {
//		    if(i%3 != 0) {
//		        i++;
//		        continue;
//		    }
//		    else sum+=i;
//		    i++;
//		}
		

		// 4.1에서 50까지의 합을 더하는 while 문이다. 빈칸에 적절한 코드를 삽입하라
		int sum=0,i=1;
		while (true) {
		    if(i>50)
		    	break;
		    sum+=i;
		    i++;  
		} 
		System.out.println(sum);
		

	}	

}
