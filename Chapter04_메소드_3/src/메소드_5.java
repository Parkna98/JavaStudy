// 5개 정수를 받아서 => max, min
// 1.입력 2.최대최소찾기 3.출력
import java.util.Arrays;
public class 메소드_5 {

	// 입력
	static int[] userInput() {
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		return arr;
	}
	
	// 리턴형은 한개만 받기때문에 max, min을 따로 만든다
	
	// 최댓값
	static int max(int[] arr) {
		int m=arr[0];
		for(int i:arr) {
			if(i>m) m=i;
		}
		return m;
	}
	
	// 최솟값
	static int min(int[] arr) {
		int m=arr[0];
		for(int i:arr) {
			if(i<m) m=i;
		}
		return m;
	}
	
	// 출력
	static void print(int max,int min) {
		System.out.println("max="+max);
		System.out.println("min="+min);
	}
	
	// 조립
	static void process() {
		int[] arr=userInput();
		System.out.println(Arrays.toString(arr));
		int max=max(arr);
		int min=min(arr);
		print(max,min);
	}
	// 변수명과 메소드명은 동일해도 된다.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 사용자로 부터 입력값을 받는다 / 초기화
		/*int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		// 최대,최소 찾기
		int max=arr[0]; int min=arr[0];
		for(int i:arr) {
			if(i>max) max=i;
			if(i<min) min=i;
		}
		// 출력
		System.out.println("max="+max);
		System.out.println("min="+min);*/
		
		process();
	}

}
