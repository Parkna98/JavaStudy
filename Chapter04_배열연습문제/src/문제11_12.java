// 11. 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하시오
// 12. 10개의 정수를 입력받아서 짝수의 최대값,홀수의 최대값을 출력하는 프로그램을 작성하시오
import java.util.Arrays;
public class 문제11_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		// 난수 생성
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		// 3의 배수만 출력
		for(int i:arr) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		// 짝수의 최댓값, 홀수의 최댓값 출력
		int emax=0;
		int omax=1;
		for(int i:arr) {
			if(i%2==0) {
				if(i>emax) emax=i;
			}
			else {
				if(i>omax) omax=i;
			}
		}
		System.out.println("짝수 최댓값:"+emax+", 홀수 최댓값"+omax);
	}

}
