import java.util.*;
public class 배열_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		Scanner scan=new Scanner(System.in);
		int sum=0; // Scope => 사용범위
		while(true){
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 최댓값, 최솟값 출력");
			System.out.println("2. 총합");
			System.out.println("3. 평균");
			System.out.println("4. 종료");
			System.out.println("================");
			System.out.print("메뉴 선택:");
			int menu=scan.nextInt();
			
			if(menu==4)
				break;
			else if(menu==1) {
				int max=arr[0];
				int min=arr[0];
				
				for(int i:arr) {
					if(i>max)
						max=i;
					if(i<min)
						min=i;
				}
				System.out.println("최댓값:"+max);
				System.out.println("최솟값:"+min);
			}
			else if(menu==2) {
				sum=0; // 총합을 초기화 시켜주지 않으면 실행할때마다 누적됨.
				for(int i:arr) {
					sum+=i;
				}
				System.out.println("총합:"+sum);
			}
			else if(menu==3) {
				sum=0;
				for(int i:arr) {
					sum+=i;
				}
				System.out.printf("평균:%.2f\n",sum/10.0);
			}
				
		}
	}

}
