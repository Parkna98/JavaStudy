//4. 10개의 난수를 발생하여 배열에 저장한 후에 인덱스가 1인 곳의 값을 출력하시오.
import java.util.*;
public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		// 초기값
		// Random r=new Random() => r.nextInt(100)
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
			// double random() => 0.0~0.99
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("인덱스1번:"+arr[1]);
		
		// 5. 위 문제의 배열중에서 최대값의 인덱스를 출력
		int max=1;
		int maxcount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				maxcount=i;
			}
		}
		System.out.println("최댓값의 인덱스:"+maxcount);
	
		
		
	}

}
