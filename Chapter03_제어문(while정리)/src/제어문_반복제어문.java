/*
 * 		break	: 반복 중단
 * 				  게임 => ESC (반복문, switch)
 * 		continue: 특정부분을 제외
 * 		---------------------- 반복문에서만 사용이 가능
 * 		*** 제어영역 => 자신의 반복문
 * 		for(){
 * 			for(){
 * 				break; ====> 2차for문 제어
 * 			}
 * 			break; ====> 1차for문 제어 // break의 위치에 따라 제어되는 for문이 다른것확인
 * 		}
 * 
 * 		outer: for(){
 * 			for(){
 * 				break outer; ====> 이름이 있는 break는 이름이 있는 특정for문을 종료시킬 수 있다.
 * 			}
 * 		}
 */
public class 제어문_반복제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// break => 반복문 종료
		/*
		 * 		for(int i=1;
		 */
//		for(int i=1;i<=10;i++) {
//			if(i==3) {
//				// 소스코딩이 가능
//				break;	// i==3이면 반복문 종료
//				// 소스코딩이 불가능, 앞에 break걸었기 때문에 종료된 상태
//				// if 뒤에 {} 없으면 한줄만 if문, 2번째줄부터는 if문과는 별개의 문장, {}있으면 안의 문장 모두 if문
//			}
//			System.out.println("i="+i);
//		}
		
		for(int i=1;i<=10;i++) {
			if(i==3)
				continue; // {}없기때문에 밑의 문장은 if와 별개문장
			//  -------증가식으로 이동
			/*
			 * 		for
			 * 		while
			 * 		----- break는 동일
			 * 		
			 * 		continue
			 * 		-------- for => 증가식으로 이동
			 * 		-------- while => 조건식으로 이동
			 * 				 -------------------- 무한루프가 될 수 있다
			 * 					=> 처음부터 다시 시작할 경우에 주로 사용
			 */
			System.out.println("i="+i); // 1 2 4 5 6 7 8 9 10 (3제외 출력)
		}
		System.out.println("===== while =====");
//		int i=1;
//		while(i<=10) {
//			if(i==3)
//				break; // 3이 되면 반복문 종료
//			System.out.println("i="+i);
//			i++;
//		}
		
		int i=1;
		while(i<=10) {
			if(i==3)
				continue; // continue 이후에 조건식으로 이동 (i는3인상태) 조건이 i<=10이므로 계속 true => 무한루프
			System.out.println("i="+i);
			i++;
		}
		
		
		
	}

}
