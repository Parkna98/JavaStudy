import java.util.Arrays;
public class 메개변수전송법3 {
	static void change(int[] arr) {
		// temp=arr
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
	// 배열이나 클래스를 매개변수로 사용한다면 리턴값을 주지않고, Call By Reference가 적용하기때문에 주소값을 받는다. void로 만들어서 처리해도 해당값이 변경된다.
	
	static void change2(String ss) {
		ss="Hello World";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temp=new int[5];
		System.out.println("적용전:");
		System.out.println(Arrays.toString(temp));
		System.out.println("적용후:");
		change(temp);
		System.out.println(Arrays.toString(temp));
		
		String ss="공백";
		change2(ss); // String은 예외로 클래스이지만 Call By Value가 작동된다
		System.out.println("ss="+ss);
		// 주소가 같은 경우에는 저장값을 언제든 제어 할 수 있다
		int[] a= {1,2,3};
		int[] b=a;
		int[] c=a;
		int[] d=a;
		d[0]=10;
		System.out.println("a[0]="+a[0]); // int[] a b c d 모두 같은 주소값임 => 하나만바뀌어도 다른 배열의 값들도 모두 바뀜
	}

}
