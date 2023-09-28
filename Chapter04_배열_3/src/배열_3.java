import java.util.*;
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,20,30,40,50};
		int[] arr2=arr.clone(); // 깊은 복사 
		// arr의 메모리에 있는 모든 내용을 copy해서 새로운 메모리에 저장
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println("arr="+arr);
		System.out.println("arr2="+arr2); // 서로 다른 메모리 주소
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		// arr={100,200,300,40,50}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2)); // clone은 새로운 메모리에 저장했기때문에 서로 다른 메모리주소
													// 서로의 수정사항에 대해 서로 영향 없음
		// clone => prototype**
	}

}
