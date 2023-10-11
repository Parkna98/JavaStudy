import java.util.*;
class B{
	static int[] arr=new int[5];
	// arr[0]=1; => Error!
	// 클래스 영역은 선언만 가능(변수선언,메소드선언)
	B() {
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a=new B(); // arr저장
		System.out.println(Arrays.toString(a.arr)); 
		
		B b=new B(); // 다른 arr저장
		System.out.println(Arrays.toString(b.arr)); 
		System.out.println(Arrays.toString(a.arr)); // class B에서 arr을 static으로 선언하면 위의 b.arr값과 같아짐
													// static이 아니라면 위에쓴 a.arr과 변수명(주소)이 같기때문에 값도 같음
													// 오라클은 static 변수 => 게시판이 업데이트 되면 모두가 업데이트된 게시판을 보는것
	}

}
