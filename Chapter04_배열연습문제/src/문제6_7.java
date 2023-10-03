// 6. 10개의 난수를 배열 안의 모든 값을 더하고, 총합과 평균을 출력하시오.
// 7. 10개의 난수를 배열에 저장 후에 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력하시오
import java.util.Arrays;
public class 문제6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		// 난수 생성
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		// 총합, 평균 출력
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		System.out.println("총합:"+sum);
		System.out.printf("평균:%.2f",sum/10.0);
		System.out.println();
		
		// 7. 인덱스 3번 제외 출력
		for(int i=0;i<arr.length;i++) {
			if(i==3) continue;
			System.out.print(arr[i]+" ");
		}
	}

}
