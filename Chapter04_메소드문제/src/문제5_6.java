// 5. 1~n까지 합을 구하는 메소드 구현
// 6. 두 정수를 나눗셈 결과를 구해주는 메소드 구현
/*
 * 		메소드는 사용시에 => 호출 
 * 		------------------- main()은 컴파일러에 의해 자동 호출
 * 							--------------------------
 * 										ㅣCall back
 * 		메소드
 * 			= CallBack => main => 자동 호출되는 메소드 (시작점)
 * 			= 사용자 정의 : 프로그래머가 직접 제작
 * 			= 라이브러리  : 이미 제작된 메소드 (System, print 등등) => 만들지 못하는 프로그램
 * 				=> 자바에서 제공
 * 				=> 외부 업체에서 지원 (Jsoup, Spring) => mvnrepository.com (라이브러리 사이트)
 * 				=> CBD => 조립식
 * 				   ----------- 메소드 호출
 * 			= 조립할 때, 재사용 할 때, 유지보수가 편리하게 만든다
 * 			= 재사용
 * 			  메소드를 불러온다
 * 			  ------------
 * 			  int aaa()		====> int a=aaa();
 * 			  double bbb()	====> double b=bbb();
 * 			  void ccc()	====> ccc();
 * 			  boolean ddd()	====> boolean d=ddd();
 * 			  -------------------------------------
 * 			  class A
 * 			  {
 * 				 int aaa(){}
 * 			  }
 * 			  class B
 * 			  {
 * 				 main()
 * 				 {
 * 					A.aaa() ======> 다른 클래스에서 메소드를 가져다쓸때, 메소드앞에 클래스이름을 붙여야한다!(ex) Math.random() )
 * 			 	 }
 * 			  }
 * 				
 * 			
 */
import java.util.Scanner;
public class 문제5_6 {
	
	// 5.
	static int sum(int n) {
		int res=0;
		for(int i=1;i<=n;i++) {
			res+=i;
		}
		return res;
	}
	
	// 6.
	// 두 정수 입력, 나눗셈 결과 
	// 입력 메소드
	static int input(String msg) {
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+"정수 입력:");
		return scan.nextInt();
	}
	
	// 나눗셈 출력 메소드 ==> 나눗셈은 0으로 나눴을 때 에러메세지를 보내기때문에 String으로 return값을 받는것이 좋다
	static String div(int a,int b) {
		String res="";
		if(b==0)
			res="0으로 나눌 수 없다";
		else
			res=a+"/"+b+"="+(((int)(a/(double)b*100+0.5))/100f); // 소수점 둘째자리까지 출력하고싶으면 어떻게 설정?
		// 1) String => format
		// 2) 둘째자리라면, 100곱하고, 0.5더하고, (int)형변환, 100f로 나누기 => 가독성이 떨어지는데 실전에서 쓸지
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(1000));
		int a=input("첫번쨰 ");
		int b=input("두번쨰 ");
		System.out.println("두 수의 나눗셈 결과값 출력");
		System.out.println(div(a,b));
		
	}

}
