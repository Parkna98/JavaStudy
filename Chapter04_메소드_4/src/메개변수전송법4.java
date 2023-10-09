
public class 메개변수전송법4 {
	static void swap(int a,int b) {
		System.out.println("변경전=>swap:a="+a+",b"+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("변경후=>swap:a="+a+",b"+b);
		//(20,10)
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("변경전=>.main:a="+a+",b="+b);
//		int a=10;
//		int b=20;
//		
//		System.out.println("변경후=>.main:a="+a+",b="+b);
	}

}
