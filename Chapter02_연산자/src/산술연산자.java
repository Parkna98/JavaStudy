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
		System.out.printf("평균:%.2f\n",ave); // printf 쓰고 %.2f쓰고 ,(콤마)로 값설정 / 소수점 두자리 .3f / .4f 등등
		
		System.out.println("========== & ==========");
		int a=5;
		int b=2;
		System.out.println(a+"%"+b+"="+(5%2));
		System.out.println(-a+"%"+b+"="+(-5%2));
		System.out.println(a+"%"+-b+"="+(5%-2));
		System.out.println(-a+"%"+-b+"="+(-5%-2));
		
		/*
		 * 		자동 형변환
		 * 			작은데이터형 => 큰데이터형
		 * 		강제 형변환
		 * 			큰데이터형 => 작은데이터형
		 * 		===============================> 자동 형변환
		 * 		byte < char / short < int < long < float < double
		 * 		강제 형변환 <===============================
		 * 
		 * 		자동 형변환
		 * 		int a='A';
		 * 			=> a=65
		 * 		double d=100;
		 * 				 ----int
		 * 			=> d=100.0
		 * 
		 */
		int aa='A';
		System.out.println("aa="+aa); // char => int
		
		double dd=100;
		System.out.println("dd="+dd); // int => double
		
		System.out.println(100+10.5+10.5F+'A'); // 출력값 데이터형 : double (가장큰데이터형)
		//                 100.0+10.5+10.5+65.0 => 186.0
		// 자동 형변환이 있는 경우 => 연산은 같은 데이터형끼리만 연산
		/*
		 * 	'A' + 10
		 * 	---
		 * 	char => 65(int) + 10 ==> 75 (int)
		 *  형변환이 이뤄질 경우 과정을 하나 더하는 것이기 때문에 속도저하의 원인 
		 */
		System.out.println('A'+'B'); // 65+66 => 131(int)
		// int 이하 (byte, char, short) 연산 => 결과값 int 
	}

}
