/*
		메모리 사용법
		---------
			= 같은 메모리 사용  : 얕은 복사 ==> 대입
			= 새로운 메모리 생성 : 깊은 복사 ==> clone(prototype)
 */
class Student{
	int hakbun;
	String name;
}
public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 얕은복사
		Student s=new Student();
		s.hakbun=1;
		s.name="홍길동";
		
		Student s1=s; // 대입 => 주소값이 같음 => 메모리공간 1개
		s1.hakbun=2;  // s1에 값넣어도 s값역시 바뀜
		s1.name="심청이";
		
		System.out.println(s.hakbun);
		System.out.println(s.name);
		// ==> 얕은복사 : 매개변수로 주소를 보내서 메소드에서 제어할 때 주로 사용
		//	   ------ Call By Reference
		// 윈도우 
		
		
	}

}
