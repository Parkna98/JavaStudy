
public class 문제9_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= new char[26];
		char c='A';
		for(int i=0;i<arr.length;i++){
			arr[i]=c++;
		}
		for(char i:arr) {
			System.out.print(i);
		}
		System.out.println();
			for(int j=arr.length-1;j>=0;j--) {
				System.out.print(arr[j]);
			}
		
	}

}
