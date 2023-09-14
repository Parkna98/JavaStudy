/*
 * 농구공 5개씩 한 박스에 들어간다. 40개면 8상자, 26개면 6상자이다.
 * 삼항연산자를 이용해서 구현하시오.
 */
import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("농구공의 갯수는?");
		int balls = scan.nextInt();
		System.out.println(balls%5==0?"필요한상자의 수는 "+balls/5:"");
		System.out.println(balls%5!=0?"필요한상자의 수는 "+(balls/5+1):"");
		
				

	}

}
