// 2. 10개의 임의의 정수를 받아서 최대값,최소값(난수)  구하는 프로그램 작성
import java.util.Arrays;
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		// 임의의 정수 생성
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		// 최대,최소 구하기
		int max=0;
		int min=100;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) max=arr[i];
			if(arr[i]<min) min=arr[i];
		}
		System.out.println("최댓값:"+max+" ,최솟값: "+min);
	}

}
