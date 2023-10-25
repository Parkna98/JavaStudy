package com.sist.lib;
import java.util.*;
/*
		class A{
			int a,b;
			public void aaa(){}
			public void bbb(){}
		}
		class B extends A{
			int c;
			public void ccc(){}
			-------상속받은-------
			int a,b;
			public void aaa(){}
			public void bbb(){}
			-------------------
		}
		B b=new B(); 
			=> a,b,c, aaa(),bbb(),ccc() => B의 변수,메소드들
		A a=new A();
			=> a,b, aaa(),bbb() => A의 변수,메소드
		A ab=new B();
		---- -------- A가 가지고 있는 메소드를 B의 메소드로 덮어쓴다 (오버라이딩) / 변수는 A의 것만 사용
			=> a,b, aaa(),bbb() 
			 				----B
		
		
 */
class Sawon{
	private int sabun;
	private String name;
	private String dept;
	public Sawon(int sabun,String name,String dept) {
		this.sabun=sabun;
		this.name=name;
		this.dept=dept;
	}
	public void print() {
		System.out.println("사번:"+sabun);
		System.out.println("이름:"+name);
		System.out.println("부서:"+dept);
	}
	
}
// Object대신 저장해야 하는 데이터형 설정 => 모든 매개변수, 리턴형이 변경
// => 제네릭 => 컬렉션은 가급적 제네릭사용을 권장
// => 데이터 첨부시에 원하는 데이터만 첨부가 가능하게 만들어준다
// => 분석 => 가독성 => 명시적이기 때문에
// 데이터를 저장할 때 => 같은 데이터를 첨부 => 제네릭을 선언하면 다른 데이터형은 첨부할 수 없다
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Sawon> list=new ArrayList<Sawon>();
		// 제네릭 => <클래스> => 기본형은 반드시 Wrapper클래스 사용 (int(X) Integer(O))
		// 제네릭 => 폴더별로 저장 => 찾기가 편함
		list.add(new Sawon(1,"홍길동1","개발부"));
		list.add(new Sawon(2,"홍길동2","영업부"));
		list.add(new Sawon(3,"홍길동3","총무부"));
		
		for(int i=0;i<list.size();i++) {
			// Object는 모든클래스의 상위클래스 이기때문에 
			// 하위 클래스인 Sawon클래스에만 있는 print()메소드는 호출불가능하다
			Sawon obj=list.get(i); // 제네릭을 Sawon으로 설정해서 형변환이 필요없다
			obj.print();
			// Sawon obj=list.get(i); (하위클래스 = new 상위클래스 => 불가 => 형변환해야됨)
			//							==> 받을때부터 하위클래스로 받자 => Generics!!
		}
	
		// list => Object
		/*list.add(1);
		list.add("A");
		list.add(0.78);
		for(int i=0;i<list.size();i++) {
			Object val=list.get(i);
			System.out.println(val); 
		}*/
		
	}

}
