// 2. 10개의 임의의 정수를 받아서 최댓값, 최솟값(난수) 구하는 프로그램 작성
import java.util.*;
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		int min=100;
		int[] arr=new int[10];
		
		// 정수 => 10개 초기화
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i:arr) {
			if(i>max) max=i;
			if(i<min) min=i;
		}
		System.out.println("최댓값:"+max);
		System.out.println("최솟값:"+min);
	}

}
