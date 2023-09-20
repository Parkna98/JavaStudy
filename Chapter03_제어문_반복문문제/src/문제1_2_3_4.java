
public class 문제1_2_3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 작성
		int x=15;
		if(x>10 && x<=20) {
			System.out.println("true");
		}
		
		// 2.char형 변수 ch가 공백이고 탭이 아닐 때 true인 조건식 작성
		char ch=' ';
		if(ch==' ' && ch!='\t')
			System.out.println();
		
		// 3.char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식 작성
		// if(ch=='x' || ch=='X')

		// 4.char형 변수 ch가 숫자('0' ~ '9')일 때 true인 조건식 작성
		// if(ch>='0' && ch<='9')

		
	}

}
