import java.util.Arrays;
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 7-1. 10명의 컴퓨터 정수를 입력받아 배열에 저장하고 
		//     총점과 평균을 구하여 출력하는 프로그램을 작성
		
		int[] arr=new int[10];
		int total=0;
		for(int i=0;i<arr.length;i++) {
			int num=(int)(Math.random()*100)+1;
			arr[i]=num;
			total+=num;
		}
		for(int a1:arr) {
			System.out.print(a1+" ");
		}
		System.out.println("\n총점:"+total);
		System.out.printf("평균:%.2f",total/10.0);
		
		System.out.println();
		// 7-2. 5개의 정수를 {95,75,85,100,50}로 초기화하고
		// 오름차순으로 정렬하는 프로그램
		
		int[] arr2=new int[5];
		for(int i=0;i<arr2.length;i++) {
			int num=(int)(Math.random()*100)+1;
			arr2[i]=num;
		}
		for(int a2:arr2) {
			System.out.print(a2+" ");
		}
		System.out.println();
		Arrays.sort(arr2);
		for(int a3:arr2) {
			System.out.print(a3+" ");
		}
	}

}
