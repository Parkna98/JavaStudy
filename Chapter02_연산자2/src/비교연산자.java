/*
 * 		44page
 * 		비교연산자 ===> 결과값 (boolean : true/false)
 * 		--------사용처 (조건문, 반복문)
 * 		숫자 (정수, 실수, boolean, 문자) => 문자열은 비교할 수 없다
 * 						  ㅣ
 * 						==, != 만 가능 
 * 		------------------------------ 문자는 어떤 연산자를 사용해도 정수형으로 변경 (char)
 * 		1) == 같다
 * 		2) =! 같지않다
 * 		3) <  작다
 * 		4) >  크다
 * 		5) <= 작거나 같다
 * 		6) >= 크거나 같다
 * 		---------------
 * 		
 */
public class 비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		//			------------------ 0.0~0.99 사이에 숫자 추출 *100 => 0.0~99.0 
		//					
		//	------0~99에 +1해서 1~100 사이 랜덤수 추출
		int b=(int)(Math.random()*100)+1;    // 예약가능한 날
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("a==b: "+(a==b));
		System.out.println("a!=b: "+(a!=b));
		System.out.println("a<b: "+(a<b));
		System.out.println("a>b: "+(a>b));
		System.out.println("a<=b: "+(a<=b));
		// a<b || a==b
		System.out.println("a>=b: "+(a>=b));
		// a>b || a==b
		
		char c=(char)((Math.random()*26)+65); //A의 유니코드가 65이기 때문에 +65 // 26은 알파벳갯수 (A~Z)
		char d=(char)((Math.random()*26)+65); //A의 유니코드가 65이기 때문에 +65
		System.out.println("c="+c); // 위에 있는 코드 복붙해서 붙였는데 문자만 바꾸면 되는 경우
		System.out.println("d="+d); // 바꿀부분 드래그하고 Ctrl F 해서 a->b, c->d 로 바꾸기 가능 (File - Replace)
		System.out.println("c==d: "+(c==d)); 
		System.out.println("c!=d: "+(c!=d));
		System.out.println("c<d: "+(c<d));
		System.out.println("c>d: "+(c>d));
		System.out.println("c<=d: "+(c<=d));
		System.out.println("c>=d: "+(c>=d));
		
		boolean b1=false;
		boolean b2=true;
		System.out.println("b1==b2:"+(b1==b2));
		System.out.println("b1!=b2:"+(b1!=b2));
	}

}
