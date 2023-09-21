import java.util.Scanner;
public class 제어문_반복제어문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// 1~9가지 menu
		while(true) {
			System.out.print("menu 선택:");
			int menu=scan.nextInt();
			if(menu<1 || menu>9) { // 없는 메뉴 선택
				System.out.println("없는 메뉴입니다");
				continue; // 조건식으로 이동 (처음부터 실행)
			}
			if(menu==9) {
				break; // 반복문 종료후 다음 문장 수행함
				// System.exit(0); => 프로그램 전체를 종료하기 때문에 이후 문장 수행하지 못해서 에러남
			}
			System.out.println(menu+"번 메뉴를 선택하셨습니다");
		}
		System.out.println("프로그램 종료!!");
	}

}
