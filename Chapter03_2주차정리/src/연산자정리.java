/*
 *		연산자
 *		-----
 *		=> 결과값 (데이터형 사용)
 *		1) 피연산자 / 연산자
 *		   ------ 연산 대상 
 *		   1개 = 단항연산자 ++,--,!,형변환
 *					= 증감연산자
 *						ㅣ
 *					  ++, -- => 1증가, 1감소
 *					  전치 연산자:++a; 먼저 증가 => 다른 연산 수행
 *					  후치 연산자:a++; 다른 연산 수행 => 이후 증가
 *					  int a=10;
 *					  System.out.println(a++) => a=10
 *					  int a=10;
 *					  System.out.println(++a) => a=11 ==> 게시물 번호 ==> --a
 *			
 *					= 부정연산자 ==> boolean 사용 (조건문)
 *					  String s="aaa";
 *					  s.replace('a','b') ==> "bbb"
 *				  	  s="aaa" 
 *					
 *					= 형변환연산자	
 *					  --------- boolean 생략
 *					  
 *
 *		   2개 = 이항연산자
 *					= 산술연산자 +, -, *, /, %
 *						 + => 문자열 결합**, 산술
 *							  int이하 데이터형은 연산시 int로 변경(byte,char,short)
 *						 / => 정수/정수 => 정수
 *						   => 0으로 나누면 오류
 *						 % => 부호가 왼쪽부호가 남는다
 *						- % - => -
 *						+ % - => +
 *					= 비교연산자 <,>,<=,>=,==,!=
 *						=> 조건문 / 반복문(조건식) 
 *						=> boolean
 *						1. 문자열은 비교할 수 없다 (=> equals 를 쓰면됨) 
 *							(문자열은 '=='쓰면 메모리주소로 비교하기때문에 같은문자여도 다른값이라고 나온다)
 *					= 논리연산자 && ||
 *						(조건) && (조건)
 *						-----	 -----
 *						  ㅣ  	   ㅣ
 *						  ---------- 조건 둘다 true 일때 true
 *							* 앞 조건이 false이면 뒷 조건은 수행하지 않는다 => 효율적인 연산
 *							* || 도 마찬가지. 앞조건이 true이면 뒷조건은 수행하지 않는다 
 *								|| ==> 사용처 (오류처리, 잘못된 입력, 범위를 벗어나는 경우)
 *	
 *
 *					= 대입연산자 =, +=, -=
 *						a+=5; ==> a=a+5
 *						==> 한개 증가보다는 여러개 증가할때 주로 사용
 *						==> 비행기, 총알 
 *	 
 *		   3개 = 삼항연산자 (조건)?값:값 	===> 페이지변경(이전페이지, 다음페이지)
 *						------
 *						true => 앞의 값 수행
 *						false => 뒤의 값 수행
 *				=> if~else
 */
public class 연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		boolean bCheck=false;
//		if(!bCheck) {
//			System.out.println("출력");
//		}
//		System.out.println(bCheck); // 부정연산자는 연산해도 값보존
//		bCheck=!bCheck;
//		System.out.println(bCheck);
//		
//		int a=10;
//		a++; // 증감연산자는 연산하면 값 변함.
//		System.out.println(a); // a=10 => a=11
//		byte b1=10;
//		byte b2=20;
		// byte b3=b1+b2; 오류문장=> byte끼리의 합은 int형이라 int b3로 선언해야한다
//		int b3=b1+b2; // int형 보다 큰 데이터도 다 가능 => int long double float 모두가능
		
		String s="Hello";
		String s1=new String("Hello");
//		if(s==s1)		 // 저장된 메모리 주소가 같은가? 
		if(!s.equals(s1)) // 저장된 문자가 같은가? 같지않은것을 물어보고싶으면 "!"앞에 쓰면됨
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		
	}

}
