package com.sist.lib;
/*
		Random : 난수 발생
			=> ***nextInt(int bound) ==> 0 ~ bound-1
			
		Arrays : 배열과 관련된 기능 제어
		------
			1) ***sort() => 오름차순 정렬
				==> ORDER BY no DESC(ASC) (오라클) => 시간이 오래걸림
					==> ***index (최적화) (오라클)
			2) copyOf(원 배열, 길이지정) => 다른 배열에서 복사
			   copyOfRange(원 배열, start, end) => start에서 end까지 복사
			3) toString() => 배열값 출력
		
		StringTokenizer 
			==> 문자열 분리 
				=> 데이터 오라클에 한번에 저장후 분리해서 쓴다 (모든 데이터갯수가 똑같지는 않으므로)
							  --------- 한문장으로 문자열 결합(^,| 등등 기준을사용해서)
				=> split() => 정규식을 이용 => 쉽게 제작 => StringTokenizer
				=> 네트워크 / 빅데이터 / 웹
				=> 기능(메소드)
				 	1) countTokens()	: 분리된 데이터 갯수
				 	2) nextToken()		: 실제 분리된 데이터 읽기
				 	3) hasMoreTokens()	: 분리된 수만큼 루프 수행
		
 */
import java.util.*;
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[7];
		Random r=new Random();
		for(int i=0;i<arr.length;i++) {
			arr[i]=r.nextInt(100)+1; // 1~100
		}
		System.out.println("===== 정렬전 =====");
		System.out.println(Arrays.toString(arr));
		System.out.println("===== 정렬후 =====");
		Arrays.sort(arr); // ASC(오름차순)
		System.out.println(Arrays.toString(arr));
		// 가변 배열
		// 작은 배열을 만들때
		int[] subArr=Arrays.copyOf(arr, 3); // 앞에서부터 3개만 copy
		System.out.println(Arrays.toString(subArr));
		// 큰 배열로 변경할 때
		int[] subArr2=Arrays.copyOf(arr, 10); // 원래의배열의 길이를 넘어서는 값은 0으로 처리됨
		// 배열의 길이를 넘어서는 영역은 초기값 설정
		/*
			int 0
			double 0.0
			boolean false
			클래스 null
		 */
		System.out.println(Arrays.toString(subArr2));
		
	
	}

}
