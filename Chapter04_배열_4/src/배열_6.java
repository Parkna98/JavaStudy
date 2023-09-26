/* 버블정렬-알파벳
 *	배열 => 같은 데이터형을 일정한 순서로 모아서 관리
 *		   ---------  --------
 *						ㅣ인덱스 => 0번
 *			=> 배열의 크기 : length
 *			=> 출력시에는 향상된 for (for-each)
 *			=> 관련된 종류의 데이터 3개이상인 경우
 *			=> 선언 => 초기값
 *					 -----
 *						1) 명시적
 *						2) new
 *						  ---- 자동초기화 int => 0
 *									  double => 0.0 
 *									  char => '\0' 
 *									  String => null
 */

import java.util.*;
public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr=new char[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(char)((Math.random()*26)+65);
		}
			System.out.println("========정렬전=========");
			System.out.println(Arrays.toString(arr));
			System.out.println("========정렬후=========");
			
			for(int i=0;i<arr.length-1;i++) {
				for(int j=0;j<arr.length-(i+1);j++) {
					if(arr[j]>arr[j+1]) {
						char temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						
					}
				}
			}
			System.out.println(Arrays.toString(arr));
		
		
	}

}
