/*
 * 농구공 5개씩 한 박스에 들어간다. 40개면 8상자, 26개면 6상자이다.
 * 삼항연산자를 이용해서 구현하시오.
 */
import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("농구공의 갯수는?");
		int balls = scan.nextInt();
//		System.out.println(balls%5==0?"필요한상자의 수는 "+balls/5:"");
//		System.out.println(balls%5!=0?"필요한상자의 수는 "+(balls/5+1):"");
//		System.out.println("필요한상자의 수는 "+(balls%5==0?+balls/5:balls/5+1));
		System.out.println("필요한상자의 수는 "+(int)(Math.ceil(balls/5.0))); // Math.ceil 올림함수 4.4=>5, 1.2=>2
																		 // Math.round 반올림
																		 // Math.floor 버림
		
				

	}

}
