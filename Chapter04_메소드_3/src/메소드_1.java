/*
 * 		변수 / 연산자 / 제어문
 * 			-------------- 명령문
 * 		=> 묶어서 사용
 * 		변수 : 배열 / 클래스**
 * 		명령문 : 관련된 명령
 * 				=> 입력 / 출력 / 요청 ==> 메소드
 * 				=> 동작 => 조립해서 사용 (객체지향프로그램)
 * 						 ========== 수정/추가 (유지보수) 
 * 		메소드는 한개의 기능만 수행이 가능하게 만든다
 * 		=> 자바는 클래스 영역을 벗어날 수 없다 (클래스 종속)
 * 		1. 메소드 구성요소 
 * 			= 리턴형		: 사용자 요청에 대한 처리 결과값
 * 						  **결과값은 반드시 한개만 사용이 가능하다
 * 									   --------
 * 										여러개인 경우 => 배열/클래스/컬렉션
 * 						  => 예측해서 설정 (정답은 없으나 프로그램에 맞게끔 설정)
 * 
 * 			= 매개변수		: 사용자가 요청한 값
 * 						  웹에서 마우스클릭, 키입력, 입력창...
 * 							   -------		 -----
 * 						=> 메소드는 사용자가 행위를 한 경우 => 메소드 호출
 * 								 ---------- : 마우스, 키보드
 * 									
 * 			= 메소드명		: 식별자 (변수) 
 * 						  관례상 소문자로 시작
 * 
 * 			= return문장	: 처리결과값 보내줌, 메소드의 종료
 * 			  --------- 항상 맨 마지막에 사용하는것은 아님, 중간에서 사용가능(조건문안에넣는등)
 * 			  메소드() {
 * 				if() return;
 * 				else return;
 * 			  }
 * 
 * 		2. 메소드 형식	
 * 		   [접근지정어][옵션] 리턴형 메소드명(매개변수) ==========> 선언부
 * 			{
 * 				구현부
 * 				--- 변수선언
 * 				--- 연산자
 * 				--- 제어문
 * 				-------------------- 결과값 도출 : 파이썬(예측) => AI
 * 				return 결과값;
 * 				=> 자체 처리 => void => return을 생략할 수 있다 (void인 경우만!)
 * 									 ------------
 * 										   ㅣ 모든 메소드는 return을 필요로 한다
 * 										   ㅣ 컴파일러가 자동 추가 (자동추가: return, import java.lang.*)
 * 																					---------String,Math,System,Thread...
 * 			}
 * 			
 * 			**** 모든 프로그램
 * 			= 입력 => 변수에 대한 초기화
 * 			= 처리부분 (요청) => CRUD				  오라클 (영구적인 저장 (DELETE하지 않는다면) )
 * 							 ---- Create : 추가 => INSERT
 * 								  Read : 읽기 (목록,상세보기) => SELECT
 * 								  Update : 수정 => UPDATE
 * 								  Delete : 삭제 => DELETE
 * 			= 출력 => 사용자가 볼 수 있게 만든다 => HTML, CSS 
 * 										------------- 
 * 										브라우저에서는 java언어가 작동되지 않으므로 HTML,CSS로 바꿔서 출력해야한다
 * 										***JSP : java를 HTML,CSS로 바꿔줌
 * 			= main() => 프로그램의 시작과 종료
 *			
 *		3. 메소드 유형
 *			리턴형 매개변수
 *			 o		o  	
 *			 	=> String substring(int begin) => 원형
 *				   ------			----------   
 *				   String substring(int begin, int end) => 오버로딩
 *
 *			 o		x  
 *				=> String trim()
 *				   ------
 *				   double random()
 *				   ------
 *
 *			 x		o
 *				=> void main(String[] args)
 *				   ---- 메소드 자체에서 처리
 *  
 *			 x		x
 *				=> void println() => 다음줄 출력
 *
 *  			*** 한개의 클래스 안에서 메소드명이 동일할 수 있다
 *  							   -----------
 *  								매개변수의 갯수나 타입이 다름 (오버로딩) => 중복 정의 메소드
 *  								aaa(int a)
 *  								aaa(double d)
 *  								aaa(int a, int b)
 *  								=> 메소드 명이 같지만, 매개변수의 갯수와타입이 다르므로 가능 
 *  								aaa(int b) => 이건 안됨. 갯수와 타입이 같으므로.
 * 
 * 
 * 
 * 		   [접근지정어]--------------------------------
 * 		   public : 모든 클래스에서 사용가능
 * 		   private : 자신의 클래스에서만 사용가능 => 은닉화 
 * 		   protected : 상속받는 클래스, 같은 폴더안에서	
 * 		   default : 같은 폴더 안에서만
 * 		   -----------------------------------------
 * 		   [옵션]------------------------------------
 * 		   static : 자동 메모리 저장 ==> new (주로 new를 많이 씀)
 * 		   abstract : 추상 메소드 ==> 선언 (설계=>요구사항) => 유스케이스 다이어그램
 * 	       final : 수정이 불가능 => String,Math
 * 
 * 		   리턴형으로 사용 => 기본형 (int,long,byte,char,double,boolean)
 * 			(1개만사용)  => 참조형 : 배열 / 클래스
 * 					      = String, int[]
 * 					  => 메소드 매개변수 전송법
 * 						 ----------------
 * 						*** Call By Value / Call By Reference ***
 * 								(값 전송)			(주소 전송)
 * 
 * 		   매개변수로 사용(0개이상) => 기본형 : Call By Value
 * 							   	참조형 : Call By Reference
 * 					=> **매개변수가 3개이상 : 배열, 클래스
 * 		   
 * 		4. 메소드 호출
 * 		   --------
 * 			= 인스턴스 메소드 => new를 이용해서 메모리 저장
 * 				Scanner scan=new Scanner(System.in) => 저장해두고 메소드 쓰는 방식
 * 				String s="";
 * 				s.메소드명
 * 			= 클래스 메소드 (static) => 공유 => 자동 저장 
 * 						--------
 * 							=> 사이트의 로고 등 바뀌지않는것들
 * 				Math.random()
 * 
 * 			=> static 
 * 				클래스명.메소드명()
 * 				--------------
 * 				=> 같은 클래스인 경우 => 클래스명 생략가능 (다른 클래스를 인용하는 경우 클래스명.메소드() 써줘야함)
 * 			=> aaa(int a, int b)
 * 				=> aaa(10,20)
 * 			=> int aaa()
 * 			   int a=aaa()
 * 			   -----
 * 		5. return값 설정
 * 		   -----------
 * 		    int diplay()
 * 			{
 * 				return 10;
 * 			}
 * 
 * 		    double diplay()
 * 			{
 * 				return 10.0;
 * 			}
 * 
 * 		    String diplay()
 * 			{
 * 				return "";
 * 			}
 * 
 * 		    void diplay()
 * 			{
 * 				return; // 생략가능 (컴파일러에서 자동생성)
 * 			}
 * 	
 * 			int[] display()
 * 			{
 * 				int[] arr=new int[5];
 * 				return arr;
 * 			}
 * 
 * 			==> 중요내용 => 여러번 호출이 가능 (재사용)
 * 
 * 		6. 	메소드 사용 목적	(면접)
 * 			= 반복되는 기능 제거
 * 			= 코드관리 용이 (기능별 분리)
 * 			= 소스가 간결하다
 * 			= 재사용성 (다른 클래스에서 연결)
 * 			---------------------------------
 * 			
 * 		
 */	
// 5개의 정수를 전송 => 정렬한다 (int[])
// 5자리 정수를 전송 => 거꾸로 출력 12345 => 54321
import java.util.*;
public class 메소드_1 {
	static int[] sortASC(int[] arr) {
		Arrays.sort(arr);
		/*
		 * 	for(int i=0;i<arr.length-1;i++) // select sort (선택 정렬)
		 * 	{
		 * 		for(int j=i+1;j<arr.length;j++)
		 * 		{
		 *			if(arr[i]>arr[j])
		 *			{
		 *				int temp=arr[i];
		 *				arr[i]=arr[j];
		 *				arr[j]=temp;
		 *			} 
		 * 		}	
		 * 	}
		 */
		return arr;
	}
	
	// DEC
	static int[] sortDESC(int[] arr) {
		for(int i=0;i<arr.length-1;i++) // select sort (선택 정렬)
			  {
			  	for(int j=i+1;j<arr.length;j++)
			  	{
			 		if(arr[i]<arr[j])
			 		{
			 			int temp=arr[i];
			 			arr[i]=arr[j];
			 			arr[j]=temp;
			 		} 
			  	}	
			}
		return arr;
	}
	
	// ASC+DESC
	static int[] sort(int[] arr,String type) {
		boolean bCheck=false;
		for(int i=0;i<arr.length-1;i++) // select sort (선택 정렬)
		  {
		  	for(int j=i+1;j<arr.length;j++)
		  	{
		  		if(type.equals("ASC")) {
		  			bCheck=arr[i]>arr[j];
		  		}
		  		else {
		  			bCheck=arr[i]<arr[j];
		  		}
		 		if(bCheck)
		 		{
		 			int temp=arr[i];
		 			arr[i]=arr[j];
		 			arr[j]=temp;
		 		} 
		  	}	
		}
		return arr;
	}
	
	static void sort_1(int[] arr,String type) // 비슷한 다른기능을 통합하기 ==> 매개변수를 하나 더줘서 한번에 통합
	{
		boolean bCheck=false;
		for(int i=0;i<arr.length-1;i++) // select sort (선택 정렬)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(type.equals("ASC")) {
					bCheck=arr[i]>arr[j];
				}
				else {
					bCheck=arr[i]<arr[j];
				}
				if(bCheck)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				} 
			}	
		}
	}
	
	// 거꾸로
	
	static int reverse(int num) {
		String s=String.valueOf(num);
		StringBuffer sb=new StringBuffer(s);
		s=sb.reverse().toString();
		int res=Integer.valueOf(s); // Integer.parseInt(res);
		return res;
	}
	
	// 거꾸로2
	static int rev2(int num) {
		String s=String.valueOf(num);
		String result="";
		for(int i=s.length()-1;i>=0;i--) {
			result+=s.charAt(i);
		}
		int res=Integer.valueOf(result);
		return res;
	}
	// 코딩테스트 => 이미지 하나주고 뒤집어서 출력하시오
	// ==> 이미지를 byte배열로 바꿔서 length-1 부터 출력 (문자열이나 이미지나 배열만 잡는다면 똑같은문제)
	
	// 조립
	static void process() {
		// 5개 정수 설정
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("정렬 전:");
		System.out.println(Arrays.toString(arr));
		/*int[] res=sortASC(arr);
		System.out.println("정렬 후:ASC");
		System.out.println(Arrays.toString(res));
		res=sortDESC(arr);
		System.out.println("정렬 후:DESC");
		System.out.println(Arrays.toString(res));*/
//		int[] result=sort(arr,"ASC");
//		System.out.println(Arrays.toString(result));
//		result=sort(arr,"DESC");
//		System.out.println(Arrays.toString(result));
		
		sort_1(arr,"ASC");
		System.out.println(Arrays.toString(arr)); // Call By Reference ==> ***참조형변수(배열)이기때문에 주소를 가져옴
		//																   따라서 void메소드라도 주소를 들고오기때문에 원하는 값 도출
		//																   속도가 빠름(이 방법 더 많이 씀)
		
		sort_1(arr,"DESC");
		System.out.println(Arrays.toString(arr)); // Call By Reference ==> 기본형변수는 Call By Value => 값만 들고오기때문에 값이 변경되지않음
		
		System.out.println(reverse(123456));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
