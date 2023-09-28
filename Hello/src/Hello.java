import java.util.Arrays;
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="Hello";
//		String s1 = s.replace('l','L');
//		String s2 = s.replace("el","EL");
//		System.out.println(s1);
//		System.out.println(s2);
//		int arr[]=new int[5];
//		System.out.println(arr.length);
//		String s3 = s.toUpperCase();
//		System.out.println(s3);
//		System.out.println((char)(s.charAt(0)+32));
//		System.out.println(s.charAt(2));
//		int[] num_list= {3,4,5,2,1};
//		 int answer = 0;
//	        int num1=1;
//	        int num2=0;
//	        for(int i=0;i<num_list.length;i++){
//	            num1*=num_list[i];
//	            num2+=(num_list[i]*num_list[i]);
//	        }
//	        System.out.println(num1<num2?1:0); 
			int[] array= {9, -1, 0};
			int[] array2=new int[array.length];
	        Arrays.sort(array);
	        int answer = array2[array.length/2];
	        System.out.println(answer);
	}
}
