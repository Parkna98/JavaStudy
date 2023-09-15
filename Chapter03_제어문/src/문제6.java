/*
 * 임의의 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성
 */
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=(int)(Math.random()*26)+65;  // ch를 char으로 잡고 뒤에 랜덤수를 char로 변환하는게 밑에처럼 (char)계속 안붙여도 될듯
		int ch2=(int)(Math.random()*26)+97; //
		int num=(int)(Math.random()*2);
		
		if(num==0)
		{
			System.out.println("임의의 문자:"+(char)ch);
			if((char)ch>='A' && (char)ch<='Z')
			{
				System.out.println((char)ch+"는(은) 대문자입니다");
			}
			if((char)ch>='a' && (char)ch<='z')
			{
				System.out.println((char)ch+"는(은) 소문자입니다");
			}
		}
		if(num!=0)
		{
			System.out.println("임의의 문자:"+(char)ch2);
			if((char)ch2>='A' && (char)ch2<='Z')
			{
				System.out.println((char)ch2+"는(은) 대문자입니다");
			}
			if((char)ch2>='a' && (char)ch2<='z')
			{
				System.out.println((char)ch2+"는(은) 소문자입니다");
			}
		}
//		
//		좀더 짧게 하는 법 참고
//		============================================ ** 삼항연산자로 하는게 맞지만, 연습을 위한 단일조건문 사용임
//		char c=' ';
//		int a=(int)(Math.random()*2); // 0,1
//		if(a==0)
//		{
//			c=(char)(Math.random()*26+65); // 대문자
//		}
//		if(a==1)
//		{
//			c=(char)(Math.random()*26+97); // 소문자
//		}
//		System.out.println("c="+c);
		
		
	}

}
