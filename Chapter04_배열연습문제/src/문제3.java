// 3. 100 개의 난수(0~9)를 발생하여 빈도수를 구하는 프로그램을 작성하시오
// 난수가 0~9범위 이므로 난수 자체를 빈도수의 배열에 넣어서 count++하면 0~9의 빈도수 구해짐
import java.util.Arrays;
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[100];
		int[] count=new int[10];
		// 난수 생성
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(arr));
		
		// 빈도수 구하기
		for(int i=0;i<arr.length;i++) {
			count[arr[i]]++;
		}
		for(int i=0;i<count.length;i++) {
			System.out.println(i+": "+count[i]+"번");
		}
	}

}
