// 3. 100 개의 난수(0~9)를 발생하여 빈도수를 구하는 프로그램을 작성하시오
// 0~9 난수이기 때문에 count에 난수를 넣어서 카운트하면됨. if나 switch쓸필요없음
import java.util.*;
public class 문제3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// word count
		int[] arr=new int[100];
		int[] count=new int[10];
		
		// 초기값
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(arr));
		
		// 빈도수 구하기
		for(int i:arr) {
			count[i]++; // count[arr[i]]하면 자동적으로 0~9로 들어감 // 인덱스번호(0~9)이용
			}
		for(int i=0;i<count.length;i++) {
			System.out.printf("count[%d]=%d\n",i,count[i]);
		}
		}
	}