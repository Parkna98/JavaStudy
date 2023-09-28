// 8. 5개의 난수를 배열에 저장한 후에 인덱스번호 두개를 받아서 값을 교환하는 프로그램을 작성하시오
import java.util.Arrays;
public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		// 난수 생성
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		// 인덱스 두개 받기 (중복없이 두개 생성)
		int index1,index2;
		while(true) {
			index1=(int)(Math.random()*5);
			index2=(int)(Math.random()*5);
			if(index1!=index2) break;
		}
		System.out.println("인덱스번호:"+index1+","+index2);
		// 값 교환
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		System.out.println(Arrays.toString(arr));
	}

}
