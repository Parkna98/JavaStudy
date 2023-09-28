/*
 * 		***알고리즘 : 정렬(선택정렬, 버블정렬)
 * 		***자료구조 : 데이터관리 (추가 => 가지고 오기)
 * 				스택(LIFO)(Last Input)	 / 큐(FIFO)(First Input) / 데큐(양방향)
 * 				: 메모리 구조				   : 네트워크 정보, OS 
 * 		---------------------------------------------------
 * 		선택 정렬 => 한개를 선택해서 변경
 * 		버블 정력 => 인접한 것끼리 변경
 * 		
 * 			선택 정렬
 * 			30 10 20 50 40 ==> 10 20 30 40 50
 * 			-- --
 * 			10 30
 * 			--   --
 * 			10   20
 * 			--	     --
 *  		10		 50
 * 			--   	    --
 * 			10			40
 * 			---------------
 * 			10 30 20 50 40
 * 			   -- --
 * 			   20 30
 * 			   --    --
 * 			   20	 50
 * 			   --   	--
 * 			   20		40
 * 			----------------
 * 			10 20 30 50 40
 * 			   	  -- --
 * 			   	  30 50
 * 			      --    --
 * 				  30    40
 * 			----------------
 * 			10 20 30 50 40
 * 			   	  	 -- --
 * 			   	     40 50
 * 			----------------
 * 			10 20 30 40 50
 * 			----------------
 * 			==================================
 * 			버블 정렬 => 오른쪽 정렬
 * 			-------
 *  		30 10 20 50 40
 *  		-- --
 *  		10 30
 *  		   -- --
 *  		   20 30 
 *  			  -- --
 *            	  30 50
 *  			     -- --
 *  		 		 40 50
 *  		----------------
 *  		10 20 30 40 50
 *  
 */
import java.util.*;
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 선택정렬 (select sort)
		int[] arr=new int[5];
		// 초기화
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("=========== 정렬전 ============");
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println("===== "+(i+1)+" Round=====");
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("=========== 정렬후 ============");
		System.out.println(Arrays.toString(arr));
	}

}
