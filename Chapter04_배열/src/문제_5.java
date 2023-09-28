
public class 문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를
		// 랜덤하게 생성하여 배열에 저장하라. 배열에 든 숫자들과 평균출력
		
		int[] arr=new int[10];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			int num=(int)(Math.random()*10)+1;
			arr[i]=num;
			sum+=num;
			
		}
		//출력
		for(int c:arr) {
			System.out.print(c+" ");
		}
		//평균출력
		System.out.printf("\n평균:%.2f",sum/10.0);
	}

}
