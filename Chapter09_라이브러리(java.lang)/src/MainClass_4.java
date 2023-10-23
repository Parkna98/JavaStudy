// finalize() => 객체가 메모리 해제 시에 자동 호출하는 메소드
// 소멸자
// C : A(), ~A()

/*
		클래스는 
		1) 객체 생성(메모리 저장) A a=new A()
		2) 객체 기능 활용 => a.메소드명()
		3) 메모리 해제 => finalize() => 바로 회수가 안된다 
			a=null; (주소값을 없애면 가비지컬렉션(GC) 대상)
 */
class A{
	public A() {
		System.out.println("A객체 생성:"+this);
	}
	public void action() {
		System.out.println("객체 활용...");
	}
	
	// GC는 바로 회수하지 않는다 => 메모리가 충분히 크기때문에
	// => 바로 메모리 회수하고싶다면 직접 GC 호출 
	// => System.gc(); => finalize 자동호출
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 메모리 해제...");
	}
	
}
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.action();
		a=null; // GC대상 (a가 필요없어져서 메모리 해제)
		System.gc(); // 바로 해제되도록 호출 (호출안하면 바로 해제 안됨) ==> 멀티미디어
		// finalize 자동호출하는듯
	}

}
