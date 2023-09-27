// 3. 100 개의 난수(0~9)를 발생하여 빈도수를 구하는 프로그램을 작성하시오

public class 문제3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[100];
		int[] count=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10);
		}
		for(int i=0;i<arr.length;i++) {
			count[arr[i]]++; // count[arr[i]]하면 자동적으로 0~9로 들어감
			}
		for(int i:count) {
			System.out.println(i);
		}
		}
	}