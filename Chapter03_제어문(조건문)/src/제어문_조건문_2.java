/*
 * 		단일 조건문 => true인 경우에만 처리 => false는 건너뜀
 * 		선택 조건문 => true일때 처리, false일때 처리를 나눠서 작업
 * 		--------- 예) 아이디 중복체크
 * 					  중복일 경우		=> 이미 사용중인 ID입니다
 * 					  중복이 아닌 경우	=> 사용이 가능한 ID
 * 			형식)
 * 				  if(조건문)
 * 				  {
 * 				 	// 조건문이 true인 경우
 * 				  }
 * 				  else(조건문)
 * 				  {
 * 				 	// 조건문이 false인 경우
 * 				  }
 * 				  ===> 간결하게 처리 삼항연산자 (웹, 게임)
 * 
 * 				  => 짝수 / 홀수 
 * 				  => 대문자 / 소문자
 * 				  => 웹 => 페이지
 * 
 */
public class 제어문_조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
		// 대문자 / 소문자
		if(c>='A' && c<='Z') // 대문자 여부
		{
			System.out.println(c+"는(은) 대문자");
		}
		else 
		{
			System.out.println(c+"는(은) 소문자");
		}
		// else문장은 독립적으로 사용 불가 => if문과 같이 사용
		// else문장은 바로 위에 있는 if만 지원한다
		/*
		 * 	if()
		 *  {
		 *  }
		 *  ---------
		 * 	if()
		 * 	{
		 * 	}
		 *  ---------
		 * 	if()
		 *  {
		 * 	}
		 * 	else
		 *  {
		 * 	}
		 */
		// 56page
		int a=11;
		if(a%2==0)
		{
			System.out.println(a+"는(은) 짝수");
		}
		else
		{
			System.out.println(a+"는(은) 홀수");
		}
	}

}
