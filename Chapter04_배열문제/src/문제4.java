import java.util.Scanner;
public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4. 양의 정수 10개 입력받아 배열에 저장하고,
		// 배열에 있는 정수 중에서 3의 배수만 출력
		int[] arr=new int[10];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.print("양의 정수 입력:");
			int num=scan.nextInt();
			arr[i]=num;
			
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%3==0) {
				System.out.print(arr[i]+" ");
			}
		}
		
		System.out.println();
		
		for(int c:arr) {
			System.out.print(c+" ");
		}
		
	}

}
