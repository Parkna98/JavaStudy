// 가장 기본이 되는 연산자 : 산술연산자 (38p)
/*
 * 		산술연산자 : +, -, *, /, %(나누고 나머지)
 * 		-------이항연산자 (피연산자(연산대상) 2개)
 */
public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// +(산술)
		// 국어, 영어, 수학점수의 총점을 구한다
		int kor=89, eng=90, math=88;
		int total= kor+eng+math;
		// 출력
		System.out.println("국어점수: "+kor);
		System.out.println("수학점수: "+math);
		System.out.println("영어점수: "+eng);
		System.out.println("총점: "+total);
	}

}
