// &&(직렬연산자)  ||(병렬연산자)
// AND			OR
/*
 * 		사용처
 * 		-----
 * 		&& => 기간이나 범위안에 포함
 * 		|| => 기간이나 범위가 아닌 경우
 * 		
 * 		사용법
 * 		-----
 * 		=> 조건에 사용할 수 있는 연산자 (부정연산자:==,!=, 비교연산자:<,>,<=,>=)
 * 		(조건) && (조건)		(조건) || (조건)
 * 		-----	 -----
 * 		  ㅣ		   ㅣ
 * 		  ----------
 * 			   ㅣ
 * 			  결과값
 * 
 * 		경우의 수			&&			||
 * 		true true  ===> true  ===> true
 * 		true false ===> false ===> true
 * 		false true ===> false ===> true
 * 		false false ===> false ===> false
 * 
 * 		&&, || 는 효율적인 연산을 수행한다
 * 		----------------------------
 * 		&& => false면 뒤에 있는 조건은 수행하지 않는다
 * 		|| => true면 뒤에있는 조건은 수행하지 않는다
 * 
 */
public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a=10; int b=9;
		 * 
		 * boolean bCheck=a<b && ++b==a; // false&&true => false
		 * System.out.println(bCheck); System.out.println(b); // b=9 why? boolean문장에서 앞에
		 * false이기때문에 뒤의 문장 ++b 수행할 필요없어서 b는 그대로 9
		 * 
		 * boolean cCheck=a<b || ++b==a; System.out.println(bCheck);
		 * System.out.println(b); // b=10 why? ||문장에서 앞이 false라서 뒤의 연산까지 수행하기때문에 ++b가
		 * 적용됨
		 */
		
		int a=10;
		int b=21;
		
		boolean bCheck=(a%2==0)&&(b%2!=0); // %를 이용한 짝수,홀수 판별

		bCheck = (a%2==0)||(b%2!=0);
		System.out.println(bCheck);
		
		

	}

}
