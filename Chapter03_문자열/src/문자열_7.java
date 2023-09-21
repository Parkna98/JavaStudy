import java.util.Scanner;
// ***startsWith, endsWith, ***contains => 검색기, 자동완성기(Suggest)
public class 문자열_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data= {
				"Java와 JSP",
				"Java와 Oracle",
				"Oracle Programming",
				"JQuery AND AJAX",
				"Spring AND Java"
		};
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 입력:");
		String findData=scan.nextLine(); // next() => 공백앞까지 읽어옴, nextLine() => 문장 전체 읽어옴
		System.out.println(findData);
		for(int i=0;i<data.length;i++) {
			if(data[i].contains(findData)) { // findData가 포함된 문자열 가져와 *****
			//if(data[i].endsWith(findData)){ // findData로 끝나는 문자열 가져와
			//if(data[i].startsWith(findData)) { // findData로 시작하는 문자열 가져와 *****
				try {
					Thread.sleep(1000); // 속도 1000: 1초에 한번 출력 (잠시 멈췄다 출력)
				} catch(Exception ex) {}
				System.out.println(data[i]);
			}
		}
	}

}
