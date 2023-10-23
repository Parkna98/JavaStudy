
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o="홍길동";
		// Object 클래스는 데이터형 중에 가장 큰 데이터형
		/*
			Object i=1;
			i=10.5;
			i='A';
			i=new A(); 
		 */
		// String s=o.toString(); // Object => String 형변환(toString())
		String s=(String)o;
		String ss=String.valueOf(o); // 문자열 변환하는 여러방법
		System.out.println(s);
	}

}
