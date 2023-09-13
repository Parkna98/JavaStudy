/*
 *  증감 연산자
 *  int a=10;
 *  a++;
 *  ---------------a=a+1 ==> a+=3
 *  ---1개증가, 1개감소 =============> 반복문에서 주로 사용
 *  	++		--
 *  = 전치연산자
 *  	++a, --a
 *  = 후치연산자
 *  	a++, a--
 *  
 *  	int a=10;
 *  	int b=++a; ==> a를 먼저 증가하고 b에 대입
 *  	==> a=11, b=11
 *  
 *  	int a=10;
 *  	int b=a++; ==> b에 a값을 대입하고 나중에 a값 증가
 *  		---
 *  		순서1
 *  		  ---
 *  		  순서2      ****** 출력할때도 적용 / int a=10; sysout(a++);이면 결과 10 => 출력끝나고 a=11  
 *  	==> a=11, b=10;
 *  
 *  	int a=10;
 *  	int b=++a + ++a + a++ 
 *  	=> a = 13
 *  	=> b = 11 + 12 + 12 = 35
 * 
 * 		int a=10;
 * 		int b= a++ + a++ + ++a;
 *  	=> a = 13
 *  	=> b = 10 + 11 + 13 = 34
 *  
 *  	int a=10;
 *  	int b=++a + a++ + ++a + a++
 *  	=> a = 14
 *  	=> b = 11 + 11 + 13 + 13 = 48
 *  
 *  	int a=10;
 *  	int b=a++ + a++ + a++ + a++
 *  	=> b = 10 + 11 + 12 + 13 = 46
 *  
 *  	int a=10;
 *  	int b=a-- + a++ + --a + a++
 *  	=> a = 10
 *  	=> b = 10 + 9 + 9 + 9 = 37
 *  	--------------------------------------
 *  	
 */
public class 증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=++a; //전치
		System.out.println("a="+a+",b="+b);
		
		a=10;
		b=a++; // 후치
		System.out.println("a="+a+",b="+b);
	}

}
