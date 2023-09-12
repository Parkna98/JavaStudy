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
		int kor=89, eng=90, math=87;
		int total= kor+eng+math;
		// 출력
		System.out.println("국어점수: "+kor);
		System.out.println("수학점수: "+math);
		System.out.println("영어점수: "+eng);
		System.out.println("총점: "+total);
		// 평균
		double ave = total / 3.0 ;// **3으로 나누면 int라서 소수점 없어지므로 3.0으로 나눠야함!!
		System.out.println("평균: "+ave); // => 평균 : 88.666666666667 
		
		System.out.println("========== & ==========");
		int a=5;
		int b=2;
		System.out.println(a+"%"+b+"="+(5%2));
		System.out.println(-a+"%"+b+"="+(-5%2));
		System.out.println(a+"%"+-b+"="+(5%-2));
		System.out.println(-a+"%"+-b+"="+(-5%-2));
	}

}
