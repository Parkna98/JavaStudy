
public class 배열연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중복없는 난수 10개 발생
//		int[] arr=new int[10];
//		int su=0; // 난수저장
//		boolean bCheck=false; // 중복확인
//		
//		for(int i=0;i<arr.length;i++) {
//			bCheck=true;
//			while(bCheck) {
//				su=(int)(Math.random()*10)+1;
//				bCheck=false; // 종료조건을 만들어 둬야함 (무한루프피하기위해)
//				// 중복체크
//				for(int j=0;j<i;j++) {
//					if(arr[j]==su) {
//						bCheck=true; // 중복이라면 while문 다시 수행
//						break;
//					}
//				}
//			}
//			arr[i]=su;
//			
//		}
//		for(int a:arr) {
//			System.out.print(a+" ");
//		}
		
		//중복없는 10개 난수 발생(1~10)
//		int[] arr=new int[10];
//		int su=0; // 난수발생
//		boolean bCheck=false; // 중복체크
//		
//		for(int i=0;i<arr.length;i++) {
//			bCheck=true;
//			while(bCheck) {
//				su=(int)(Math.random()*10)+1;
//				bCheck=false;
//				for(int j=0;j<i;j++) {
//					if(arr[j]==su) {
//						bCheck=true;
//						break;
//					}
//				}
//			}
//			arr[i]=su;
//		}
//		for(int a:arr) {
//			System.out.print(a+" ");
//		}
		
		// 간단하게 짜는 중복없는 난수
//		int[] arr=new int[10];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=(int)(Math.random()*10)+1;
//			for(int j=0;j<i;j++) {
//				if(arr[i]==arr[j]) {
//					i--; // 중복되면 1차 for문으로 돌아가게 만듬
//					break; // if문과는 상관없는 break
//				}
//			}
//		}
//		for(int a:arr) {
//			System.out.print(a+" ");
//		}
		String str1="abc";
		String str2="abc";
		String str3=new String("abc");
		System.out.println(str1.equals(str3));
	}

}
