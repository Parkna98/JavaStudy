/*
 * 		웹
 * 		--- 변수, 연산자, 제어문, 메소드, 클래스, 인터페이스, 예외처리
 * 						----
 * 						  ㅣ
 * 						if/for/while/break
 * 		71page
 * 		------- while => 반복문 => 반복횟수가 없는 경우
 * 				  ㅣ 사용처
 * 				     = 데이터베이스 연동, 파일 읽기				
 * 					   형식)
 * 						초기값 -----------1
 * 						while(조건식) ----2
 * 						{                     1→2→3→4→(2→3→4)→...
 * 							반복수행문장 ---3		=> 2가 false시 종료, true시 문장수행
 * 							증감식  ------4
 * 						}
 * 
 * 						ex)
 * 							int i=1;
 * 							while(i<=10)
 * 							{
 * 								System.out.println(i)
 * 								i++;
 * 							}
 * 
 * 							
 * 					  
 */
public class 제어문_반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== for =====");
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n===== while =====");
		int i=1;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		
	}

}
