// 정수 1개를 받는다
// 1 => 메모장, 2 => 그림판, 3 => 브라우저
// => 메뉴 클릭 / 버튼 클릭시 처리 => GUI (그래픽) <-> DOS (문자)
import java.util.Scanner;
public class 제어문_조건문_3_3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("번호 선택 (1,2,3):");
		num=scan.nextInt();
		
		if(num==1)
		{
			System.out.println("메모장을 선택하셨습니다");
		}
		else if(num==2)
		{
			System.out.println("그림판을 선택하셨습니다");
		}
		else if(num==3)
		{
			System.out.println("브라우저를 선택하셨습니다");
			Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"); // exe파일 띄우는 방식
			/*	역슬래쉬(\)가 포함된 경로 수행할때 \ 하나 더 쳐줘야함, 큰따옴표에 역슬래쉬 주면 자동으로 하나씩 더해줌 
			 * 	\n
			 * 	\t
			 * 	\" 
			 * 	\\
			 */
		}
		else
		{
			System.out.println("해당 메뉴가 존재하지 않습니다");
		}
			
				
	}

}
