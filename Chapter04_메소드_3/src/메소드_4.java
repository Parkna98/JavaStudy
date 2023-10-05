// 로또 => 6개 정수를 중복없이 추출 (1~45) => 출력
// 1. 정수 추출 2. 출력
import java.util.Arrays;
public class 메소드_4 {
	
	// 중복없는 난수
	static int[] getRand(int count) {
		int[] lotto=new int[count];
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;		// 중복숫자가 해당숫자 나왔다면 다시뽑기
					break;		// break안하면 i계속 작아짐
				}
			}
		}
		return lotto;
	}
	
	// 출력
	static void print(int[] lotto) {
		for(int i:lotto) {
			System.out.print(i+" ");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto=getRand(10);
		print(lotto);
		
	}

}
