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

	}

}
