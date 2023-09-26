/*
 * 		40 30 10 50 20 ==> ASC
 * 		-- --
 * 		30 40	
 * 		   -- --
 * 		   10 40
 *	 		  -- --
 *			  40 50
 * 		   		 -- --
 * 				 20 50(고정) 0-4
 * 		-------------------
 * 		30 10 40 20 50
 * 		-- --
 * 		10 30	
 * 		   -- --
 * 		   30 40
 *	 		  -- --
 *			  20 40(고정) 	1-3
 *		-------------------
 *		10 30 20 (40 50) 
 *		-- --
 * 		10 30	
 * 		   -- --
 * 		   20 30(고정)
 * 		-------------------	2-2
 *		10 20 (30 40 50) 
 *		-- --
 * 		10 20
 * 		-------------------	3-1
 * 		10 20 30 40 50 ==> 버블 정렬 완료	
 * 		
 * 		i	j
 * 		0	4	=> i+j=4 ==> j=4(length-1)-i
 * 		1	3
 * 		2	2
 * 		3	1
 *		
 *		==> 버블 정렬 (오른쪽부터 고정)
 */
import java.util.*;
// import java.lang.*; ==> 생략가능
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		// 초기화
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("====== 정렬전 ======");
		System.out.println(Arrays.toString(arr));
		System.out.println("====== 정렬후 ======");
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		 
	}

}
