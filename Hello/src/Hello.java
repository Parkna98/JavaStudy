import java.util.Arrays;
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		String s1 = s.replace('l','L');
		String s2 = s.replace("el","EL");
		System.out.println(s1);
		System.out.println(s2);
		int arr[]=new int[5];
		System.out.println(arr.length);
		String s3 = s.toUpperCase();
		System.out.println(s3);
		System.out.println((char)(s.charAt(0)+32));
	}
}
