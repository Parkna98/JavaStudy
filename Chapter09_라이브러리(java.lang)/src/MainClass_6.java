class Member implements Cloneable{
	String id;
	String pwd;
	String name;
	
	// 초기화
	public Member() {
		id="admin";
		pwd="1234";
		name="홍길동";
	}
	
	public void print() {
		System.out.println("ID:"+id);
		System.out.println("PWD:"+pwd);
		System.out.println("NAME:"+name);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	// clone 재정의 (오버라이딩)
	
}
/*
		Web관련 자바
		----------
			J2SE / J2EE
			----   ----
			자바기본	자바웹
		toString() : 객체를 문자열로 변경
		clone() : 메모리 복제 => 새로운 메모리 생성
		finalize() : 호출이 되면 메모리 해제
		---------- 자동 호출 (확인)
 */
public class MainClass_6 {

	public static void main(String[] args) throws Exception { // 더 큰 데이터형의 예외클래스 써도됨 (작지만 않으면 됨)
		// TODO Auto-generated method stub
		/*Member m=new Member();
		m.print();
		
		Member m1=(Member)m.clone(); // 오버라이딩된 메소드에서 throws 있으니까 예외처리해야함
		//		  ------- clone()은 리턴이 Object라 Member로 형변환
		m1.print();*/
		Member m1=new Member();
		m1.id="hong";
		m1.pwd="h1234";
		m1.name="홍길동";
		m1.print();
		
		//Member m2=new Member(); // 새로운 메모리 공간
		Member m2=(Member)m1.clone(); // 새로운 메모리공간을 만들어서 m1값을 가져옴
		System.out.println(m1==m2); // false
		// m1에 있는 메모리를 그대로 복사 => 새로운 메모리 공간에 붙여넣기
		// 아바타 => 디자인패턴 (prototype)
		// 스프링에서 prototype을 사용하면 => 새로운 메모리를 생성
		m2.print();
		
		m2.id="shim";
		m2.pwd="s1234";
		m2.name="심청이";
		m2.print();
		m1.print(); // m1의 메모리와 m2의 메모리는 다르다!
		
	}

}
