/*
 *		25page 관리할 데이터를 저장하는 공간을 변수
 *		---------------------------------- 한개만 저장이 가능하다.
 * 		변수 : 변수명 => 소문자로 시작한다
 * 			  식별자 (명명규칙)
 * 				1. 알파벳이나 한글로 시작
 * 				   -----대소문자구분
 * 				   Abc abc ABC
 * 				2. 명칭의 갯수는 제한하지 않음
 * 				   => 3~7로 압축
 * 				   a , b , c => kor, eng, math (의미를 부여하는 변수명칭이 좋음)
 * 				3. 숫자는 사용가능
 * 					맨 앞 숫자는 불가 ( a2(o), 2a(x) )
 * 				4. 특수문자 사용이 가능 ( $, _ )
 * 					_ 는 많이 사용됨
 * 					file_name, file_count
 * 					_name, _count => 임시변수
 * 				5. 변수명에는 공백 불가
 * 					file name (x) file_name (o)
 * 				6. 키워드 사용 불가
 * 				   ----- 자바에서 사용하는 단어
 * 	 	변수
 * 			1) 선언
 * 				데이터형 변수명;
 * 				------
 * 				int a; ==> 4byte 메모리 공간을 만들고 이름을 a로 부여
 * 			2) 초기값을 부여
 * 				a = 100;
 * 			3) 동시에 처리
 * 				int a = 100; (사용빈도가 많은 방법)
 * 			4) 값 읽기 / 값 변경
 * 			   -------------- 읽기(값 가지고 오기)/쓰기(저장)/수정
 * 			
 * 		26page
 * 			형식)
 * 				데이터형 변수명
 * 				------ ---- 명명규칙
 * 				fileName, file_name
 * 
 * 				정수값을 저장한다 (200)
 * 				int num = 200;
 * 				--- ---   ---
 * 				 ㅣ    ㅣ    ㅣ  
 * 			   데이터형 변수  리터럴
 * 			 리터럴 = 문자로 표현한 값
 * 
 * 		=> 프로그램 개발 : 가독성, 퍼포먼트(속도)
 * 					   ------리팩토링 (SI/SM) cf) 자바파일우클릭후 rename -> refactoring
 * 			no => music_no => mno
 * 
 * 			for(int i=1; i<=4; i++)
 * 			{
 * 				for(int j=1;j<=1;j++)
 * 				{
 * 					System.out.print("*");
 * 				}
 * 				System.out.println();
 * 			}
 * 
 * 			System.out.println("*");
 * 			System.out.println("**");
 * 			System.out.println("***");
 * 			System.out.println("****");
 * 
 * 			**float f=10.5 => Error : 좌항은 float(4byte) < 우항은 double(생략) (8byte)
 * 			   long l=100  => OK! 좌항크기 > 우항크기
 * 			   char a=65   => OK! 캐릭터는 int값 받기 가능
 * 			   
 * 			크기 : byte < char < int < long < float < double
 * 						 short   	  -------------
 * 									 => 메모리 크기(x) => 수표현 : 수를 표현하는 방법이 더 많기에 메모리크기는 작아도 float가 long보다 큼
 * 
 * 			각 데이터형 표현법
 * 			-정수
 * 				byte b = 100;
 * 				int  i = 100;
 * 				long l = 100L; long l = 200 ==> 200L
 * 			-문자
 * 				char c = 'A', char c = 65 ('A')
 * 			-논리
 * 				boolean b = true; b = false;
 * 			-실수
 * 				float f = 10.5F
 * 				double f = 10.5 (d는 생략가능)
 * 				double d = 'A' => d = 65.0     *** 문자값 A는 정수(실수)로 변환가능한거 체크!
 * 				double d = 10  => d = 10.0
 * 				double d = 10.5F => d = 10.5
 * 				double d = 10L => d = 10.0    
 * 		
 */
public class 자바변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte _byte = 127;
		int _int = 20000;
		long _long = 20000; // 20000L
		float _float = 10.5f;
		double _double = 100; // 100.0 체크!! => 자동 형 변환
		char _char = 65; // 'A' char는 정수 저장 가능 / 65 저장 시 출력 시에 A나오는거 체크
		boolean _boolean = true;
		
		System.out.println("_byte:"+_byte);
		System.out.println("_int:"+_int);
		System.out.println("_long:"+_long);
		System.out.println("_float:"+_float);
		System.out.println("_double:"+_double);
		System.out.println("_char:"+_char);
		System.out.println("_boolean:"+_boolean);
		// + (산술) + (문자열 결합)
		

	}

}
