// 8. 5개의 난수를 배열에 저장한 후에 인덱스번호 두개를 받아서 값을 교환하는 프로그램을 작성하시오
import java.util.*;
public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		Scanner scan=new Scanner(System.in);
		
		System.out.println("첫번째 인덱스 입력:");
		int num1= scan.nextInt();
		
		System.out.println("두번째 인덱스 입력:");
		int num2= scan.nextInt();
		// 교환=>임시변수
		int temp=arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = temp;
		System.out.println(Arrays.toString(arr));
		
		
	}

}
