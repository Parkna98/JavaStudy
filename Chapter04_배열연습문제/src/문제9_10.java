// 9. char 배열을 생성하여, 알파벳 A~Z까지 대입 후, 출력하시오
// 10. 위문제를 역순으로 출력하시오
import java.util.Arrays;
public class 문제9_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch=new char[26];
		// 배열에 A~Z 저장
		/*for(int i=0;i<ch.length;i++) {
			ch[i]=(char)(i+65);
		}
		System.out.println(Arrays.toString(ch));
		
		// 역순
		for(int i=ch.length-1;i>=0;i--) { 
			System.out.print(ch[i]+" ");
		}*/
		char c='A';  
		for(int i=0;i<ch.length;i++) {
			ch[i]=c++;
		}
		System.out.println(Arrays.toString(ch));
	}

}
