//4. 10개의 난수를 발생하여 배열에 저장한 후에 인덱스가 1인 곳의 값을 출력하시오.
public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10)+1;
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(arr[1]);
		
		// 5. 위 문제의 배열중에서 최대값의 인덱스를 출력
		int max=1;
		int maxcount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				maxcount=i;
			}
		}
		System.out.println("최댓값의 인덱스:"+maxcount);
	
		
		
	}

}
