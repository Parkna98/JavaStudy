package com.sist.lib;
import java.util.*;

interface I{
	public void display();
}
class A implements I{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("A:display() Call...");
	}
	
}
class B implements I{
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("B:display() Call...");
	}
	
}
class C implements I{
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("C:display() Call...");
	}
	
}
class D implements I{
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("D:display() Call...");
	}
	
}
class Container{
	private Map<String,I> map=new HashMap<String, I>();
	public Container() {
		map.put("a", new A());
		map.put("b", new B());
		map.put("c", new C());
		map.put("d", new D());
	}
	public I getBean(String key) { // key를 주면 찾아줌
		return map.get(key);
	}
}
public class MainClass_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container c=new Container();
		I i=c.getBean("a"); // 싱글턴 Map에 저장한순간 안바뀜 => a를 하나더 생성하더라도 객체주소값 동일
							// 객체 한개에서 씀 => 더필요하면 clone()
							// 메모리 누수현상 방지 
		i.display();
		System.out.println("i="+i);
		
		i=c.getBean("a"); // i 하나로 여러 클래스 제어
		i.display();
		System.out.println("i="+i);
		
		i=c.getBean("c");
		i.display();
		
		i=c.getBean("d");
		i.display();
		
		System.out.println("i="+i);
	}

}
