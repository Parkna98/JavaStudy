// 선택정렬 
// 앞에 문자부터 고정시킴
/* 알파벳 ==> 문자열은 안된
 * 			--------- 비교연산자를 사용할 수 없다
 * 			compare() 음수/양수/0 *
 * 			String s="H";
 * 			String s1="K"
 * 	
 * 			s.compare(s1)
 * 			-         --
 *		 	H  		  k ==> -2
 */
import java.util.*;
public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha=new char[10];
		for(int i=0;i<alpha.length;i++) {
			alpha[i]=(char)((Math.random()*26)+65);
		}
		System.out.println("==== 정렬전 ====");
		System.out.println(Arrays.toString(alpha));
		
		System.out.println("==== 정렬후 ====");
		for(int i=0;i<alpha.length-1;i++) {
			for(int j=i+1;j<alpha.length;j++) {
				if(alpha[i]>alpha[j]) {
					char temp=alpha[i];
					alpha[i]=alpha[j];
					alpha[j]=temp;
				}
			}
			System.out.println((i+1)+"Round==>"+alpha[i]);
			System.out.println(Arrays.toString(alpha));
		}
		System.out.println(Arrays.toString(alpha));
	}

}
