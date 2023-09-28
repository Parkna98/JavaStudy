// 12,1,2=>겨울 3,4,5=>봄 6,7,8=>여름 9,10,11=>가을
// case 값이 동일할 수 없다
// case 값에 실수를 사용할 수 없다.
// case 값:
// case 문장을 수행하고 종료시에는 반드시 => break
// case 순서는 상관없다
/*
 * 		switch(정수)
 * 		{
 * 			default:
 * 				break;
 * 			case 3:
 * 			case 1: 순서 상관X // 쉽게 보기위해 순서지키는것이 좋음
 * 				break; // case 3,1 둘다 수행
 * 			case 2:
 * 		}
 */
public class 선택문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 임의 추출 => random()
		int month=(int)(Math.random()*12)+1;
		System.out.print(month+"월은 ");
		switch(month)
		{
		case 12:
		case 1:
		case 2:
			System.out.println("겨울입니다");
			break;
		case 3: case 4: case 5: // 위 처럼 한줄씩 해도되고, 짧다면 좌측처럼 이어서 써도 무방
			System.out.println("봄입니다");
			break;
		case 6: case 7: case 8:
			System.out.println("여름입니다");
			break;
		case 9: case 10: case 11: // case나 default의 순서는 상관없지만, case의 값은 중복 불가
			System.out.println("가을입니다");
			break;
		}
	}

}