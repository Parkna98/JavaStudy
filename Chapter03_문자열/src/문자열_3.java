import java.util.Scanner;
// 문자열 입력을 받아서 A,a가 몇개인지 확인
public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열 입력:");
		String data=scan.next(); // next()는 공백전까지 받는 메소드 // 공백포함 받고싶다면 nextLine() 쓰면 문장전체 받음
		
		int count=0; // A || a 의 갯수
		// charAt() => 문자를 한개씩 자르는 경우에 사용
		// "Hello" 01234 ==> charAt(5) => Error!
		for(int i=0;i<data.length();i++) // i의 조건식은 length보다 하나 적게! index가 0번부터이기때문!
		{
			char c=data.charAt(i);
			if(c=='A' || c=='a')
				count++;
		}
		System.out.println("A|a의 갯수는 "+count+"개입니다");
		
		
	}

}
