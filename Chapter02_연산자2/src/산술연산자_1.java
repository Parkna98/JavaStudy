// % 배수 ==> 화폐매수 구하기
public class 산술연산자_1 {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		int a=10;
		int b=3;
		
		System.out.println(a+"%"+b+"="+(a%b));
		System.out.println(-a+"%"+b+"="+(-a%b));
		System.out.println(a+"%"+-b+"="+(a%-b));
		System.out.println(-a+"%"+-b+"="+(-a%-b));
		
		System.out.println("=====================");
		int c=369;
		// 백단위 : 3, 십단위 : 6, 일단위 : 9
		int h = c/100;
		// 369/100 = 3
		int t = c%100/10;
		// 369%100/10 = 6      ** /, % 를 적절히 쓰면 원하는 숫자를 잘라서 갖고올수있다.
		int o = 369%10;
		// 369/10 = 9
		System.out.println("백단위:"+h+",십단위:"+t+",일단위:"+o);
	}

}
