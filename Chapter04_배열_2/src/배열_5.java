/* 
 * 		간단하게 짜는 중복없는 난수
 */
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr=new int[10];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=(int)(Math.random()*10)+1;
//			for(int j=0;j<i;j++) {
//				if(arr[i]==arr[j]) {
//					i--; // 다시 난수 발생 arr[3]이 중복이라면 arr[3]을 다시 발생시켜라
//					// 인덱스를 이용해서 다시 난수 발생
//					break;
//				}
//			}
//		}
//		
//		//출력
//		for(int i:arr) {
//			System.out.print(i+" ");
//		}
		
		// 중복없는 난수
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10)+1;
			for(int j=1;j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}
