/*
 * 		자바 제어문 종류
 * 		------------
 * 		조건문
 * 			= 단일조건문
 * 				if(조건문) => true/false (부정,논리,비교연산자)
 * 					{
 * 						조건 true면 수행
 * 						조건 false면 건너뜀
 * 					}
 * 				if(조건문)
 * 					{
 * 						조건 true면 수행
 * 						조건 false면 건너뜀
 * 					}
 * 				===> 독립적인 경우
 * 
 * 				= 선택 조건문 ==> true/false 나눠서 처리
 * 					ex) 로그인 => O/X, ID중복, 검색 ...
 * 					if(로그인이되었다면)
 * 					{
 * 						조건 true면 수행 // 로그인된 경우
 * 					}
 * 					else
 * 					{
 * 						조건 false면 수행 // 로그인 안된 경우
 * 					}
 *  
 * 				
 * 			= 다중조건문 : 한개의 문장만 수행
 * 			  	if(조건문)
 * 			  	{		조건 true면 수행 ==> 종료
 * 							false면 밑에조건이동 
 * 			  	}
 * 			  	else if(조건문)
 * 			  	{		조건 true면 수행 ==> 종료
 * 							false면 밑에조건이동
 * 			  	} 
 * 			  	else if(조건문)
 * 			  	{		조건 true면 수행 ==> 종료
 * 							false면 밑에조건이동
 * 			  	}	 
 * 			  	else
 * 			  	{		해당조건이 없는경우 수행
 * 			 	} 
 * 			
 * 			
 * 		선택문 : 한 개의 값을 선택한 경우 
				=> 별점, 카테고리, 메뉴선택...
				switch(정수,문자,문자열) 
				{ case 값: 
					수행문장
					break; ==> break; 생략가능하지만, 없으면 종료되지않고 break수행 전까지 다음case도 수행함
				  case 값: 
					수행문장
					break;
			 	  case 값: 
					수행문장
					break;
				  default:
				  	해당 값 없는경우 수행문장	  
 * 			
 * 		반복문
 * 			for : 횟수지정 ==> 배열, 컬렉션
 *							---------- 인덱스번호 => 일정하게
 *							=> for문 (for-each)
 *						       for a of list (JS)
 *							   for i in (Python)
 *				=> 1차 
 *					for(초기값;조건식;증감식) ==> 조건식 false면 종료
 *					{
 *						반복문장
 *					}
 *				=> 2차 
 *					==> 알고리즘 (2차) ==> SORT, 등수구하기.... ==> 코딩테스트
 *						  1    2    8
 *					for(초기값;조건식;증감식) ==> 조건식 false면 종료
 *					{         3	   4    6
 *						for(초기값;조건식;증감식)
 *						{
 *							반복문장 5
 *						}
 *						줄바꿈 7 
 *					}
 *
 *			while : 초기값;
 *					while(조건식)
 *					{
 *						반복문장
 *						증감식
 *					}
 * 		반복제어문
 * 
 */
public class 제어문정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5}; // 배열
		for(int a:arr) // for-each 구문 ==> 웹 출력(목록) 
		{
			System.out.println(a);
		}
	}

}
