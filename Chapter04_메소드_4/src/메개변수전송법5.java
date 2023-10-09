
public class 메개변수전송법5 {
	static void swap(int[] arr) {
		System.out.println("변경전:swap=>arr[0]="+arr[0]+","+arr[1]);
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temp={10,20};
		System.out.println("temp="+temp);
		// 같은 주소 이용해서 같은 메모리를 제어
		// temp
		
//		System.out.println("변경전:main=>temp[0]"+temp[0]+",temp[1]="+temp(10));
	}

}
