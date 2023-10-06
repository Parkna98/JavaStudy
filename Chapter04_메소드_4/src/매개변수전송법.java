/*
 * 		1. 값만 전송하는 방식
 * 			= 기본형 => 메모리가 다르다
 * 			= Call By Value
 * 
 * 		2. 메모리 주소 전송하는 방식
 * 			= 배열, 클래스 => 같은 메모리에서 제어
 * 			= Call By Reference
 * 			= 예외) String (Call By Value 형식으로 작동)
 * 			= Spring
 * 			= 얕은 복사 / 깊은 복사
 * 			  ------   -------
 * 			Reference
 * 
 */
public class 매개변수전송법 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 얕은복사(Call By Reference)(참조형변수만 해당)
		int[] arr= {10,20,30};
		int[] temp=arr; // 주소값을 저장하기때문에 temp가 바뀌면 arr도 바뀐다
		temp[1]=40;
		System.out.println(arr[1]); // arr[1]=40
		
		int[] arr2=arr;
		System.out.println(arr2.equals(temp)); // true
		System.out.println(temp==arr2); // true
		
		String s1="ABC";
		String s2="ABC";
		String s3=new String("ABC");
		System.out.println(s1==s2); // true
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1==s3); // false => 메모리 주소는 다르지만
		System.out.println(s1.equals(s3)); // true => 값은 같다
		
	}

}
