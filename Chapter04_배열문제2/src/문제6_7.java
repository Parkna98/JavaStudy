// 6. 10개의 난수를 배열 안의 모든 값을 더하고, 총합과 평균을 출력하시오
// 7. 10개의 난수를 배열에 저장 후에 배열의 인덱스 3인 곳은 출력하지 말고, 나머지만 출력하시오
public class 문제6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		int sum=0;
		double avg=0;
		for(int i:arr) {
			sum+=i;
		}
		avg=sum/10.0;
		System.out.println("총합:"+sum);
		System.out.printf("평균:%.2f",avg);
		
		System.out.println("\n=======7=======");
		// 7.
		for(int i=0;i<arr.length;i++) {
			if(i==3) continue;
			System.out.print(arr[i]+" ");
		}
	}

}
