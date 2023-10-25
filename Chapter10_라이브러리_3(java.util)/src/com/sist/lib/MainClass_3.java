package com.sist.lib;
/*
		p338 => 제네릭
		
		제네릭 : 데이터형을 통일화 (기존에 설정된 데이터형 변경)
			   => 기본형을 사용불가, 클래스형만 사용가능
			   	  ---------------------------
			   	  => Wrapper 클래스 이용 => 기본형 저장
			   	  
		= 형식 : <클래스형>
				=> 자바에서는 컬렉션 => Object로 설정이 되어 있다
				 				  ------- 지정된 클래스형으로 변경
		<T> => type (클래스형)
		<E> => element (요소)
		<K> => key (키)
		<V> => value (값) 
		
		List<E>
		Vector<E> 
		Set<E>
		Map<K,V>
		
		장점 => 소스 간결 => 형변환이 필요없음
		단점 => 무조건 지정된 데이터형만 첨부
		ArrayList => Object
		ArrayList<String> => String (add, return 모두 해당클래스형으로 변경)
		ArrayList<Integer> => Integer
		ArrayList<Music> => Music => 사용자 정의 클래스도 가능
		=> 저장된 데이터는 같은 데이터형을 사용해야 편리하다
 */
class Data<T>{
	// T : 임시 데이터형
	private T t; // T가 없는 경우는 자동으로 Object형
	public void setT(T t) {
		this.t=t;
	}
	public T getT() {
		return t;
	}
	// List 인터페이스에는 이와같은 메소드가 이미 다 짜여있음
}
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Data data=new Data(); // T를 설정안해줘서 getT,setT의 매개변수,리턴형이 Object형이다
		//Data<String> d=new Data<String>(); // T를 String으로 설정해서 매개변수,리턴형도 String이다
		Data d=new Data(); 
		Data<String> d1=new Data<String>();
	}

}
