/*
		java.lang	
		java.util	
		java.io		
		java.text	
		java.net	
		java.sql
		------------ 클래스/메소드
		
		java.lang => import 생략가능
		=> 기본이 되는 클래스의 집합
		=> Object : 모든 클래스의 상위클래스
					라이브러리 / 사용자 정의 클래스 => 항상 상속을 내리는 클래스
			= toString() : 객체를 문자열화 => 생략이 가능
				=> 객체 주소 출력
				class A
				A a=new A();
				System.out.println(a) => toString() 생략됨
				System.out.println(a.toString()) 
			= finalize() : 소멸자 => 메모리 해제시 호출
			= clone() : 복제 => 메모리 복제 => 새로운 객체 생성
			
		=> **String / **StringBuffer
			StringBuffer : 문자열 결합시 최적화
				  ------ 임시 저장 장소
				  ------ **append(), reverse()
				  
			String : 문자열 관리
			-------
				equals : 문자열이 같은지 확인
				length : 문자 갯수
				contains() : 포함 문자
				startsWith() : 시작 문자열
				endsWith() : 끝나는 문자열
				substring() : 문자열을 자른다
				indexOf() : 문자 위치 찾기
				lastIndexOf() : 끝에서부터 문자 위치 찾기
				String.valueOf() : 모든 데이터형을 문자열로 변환
				split("분해기준") : 문자열 분해
				-----------------------------------------
				
		=> System
			= println(), print() : 출력
			= gc() : 메모리 해제
			= exit() : 프로그램 종료
		=> Math
			= random() : 임의의 수 발생
			= ceil() : 올림 => 총 페이지
		=> **Wrapper : 모든 데이터형을 관리하기 쉽게 클래스화
						=> 데이터형 변경 (제네릭스 => 클래스만 가능)
							<Integer> <String> ...
				int => Integer => parseInt() : 문자열 정수형 변경
				double => Double => parseDouble()
				boolean => Boolean => parseBoolean()
				byte => Byte
				==> 변환 
		------------------------------------------
			
 */
public class MainClass_1 extends Object{ 	// extends Object 생략
	private String name;
	private int age;
	// 입력을 받아서 초기화
	public MainClass_1(String name, int age) {
		this.name=name;
		this.age=age;
	}
	// 가장 많이 재정의되는 메소드 : 멤버변수 값을 출력
	// 메모리 주소 => 싱글턴 검색 (메모리 클래스 동일 여부)
	@Override // 재정의
	public String toString() {
		// TODO Auto-generated method stub
		return "이름:"+name+",나이"+age;
	}
	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		// toString() => 객체를 문자열화 (주소값 호출)
		// 생략이 가능
		MainClass_1 m=new MainClass_1("홍길동",26);
		System.out.println(m); // 아래와 같은 값 호출 (toString() 생략된 상태)
		System.out.println(m.toString());
	}


}
