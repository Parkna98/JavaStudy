// 12,1,2=>겨울 3,4,5=>봄 6,7,8=>여름 9,10,11=>가을
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
		case 3: case 4: case 5:
			System.out.println("봄입니다");
			break;
		case 6: case 7: case 8:
			System.out.println("여름입니다");
			break;
		case 9: case 10: case 11:
			System.out.println("가을입니다");
			break;
		}
	}

}
