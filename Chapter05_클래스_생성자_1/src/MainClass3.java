class Member{
	// 우선순위는 명시적 초기화 => 구현이 필요할때만 초기화블록 or 생성자 사용
	int mno=1;
	String id="admin";
	String pwd="1234";
	String name="홍길동"; // 명시적 초기화 => 일반적인 값을 대입
	// Member(){}
	{	// 구현이 필요할때만 초기화블록이나 생성자를 사용한다 (파일 읽어서 값대입, 난수발생해서 값대입....)
		mno=3;
		id="park";
		pwd="1234";
		name="심청이";     // ===> 초기화블록, 생성자를 같이쓰는경우는 없다
	}					 // 	 마지막에 초기화한 값만 저장되기때문에 의미가 없다
	Member(){
		mno=2;
		id="hong";
		pwd="1234";
		name="박문수";
	}
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1=new Member(); // 메모리 저장 => 생성자 호출
		System.out.println("번호:"+m1.mno);
		System.out.println("ID:"+m1.id);
		System.out.println("PWD:"+m1.pwd);
		System.out.println("Name:"+m1.name);
		System.out.println("================");
		Member m2=new Member();
		System.out.println("번호:"+m2.mno);
		System.out.println("ID:"+m2.id);
		System.out.println("PWD:"+m2.pwd);
		System.out.println("Name:"+m2.name);
		System.out.println("================");
	}

}
