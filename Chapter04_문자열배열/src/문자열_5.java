/*
 * 		split => String[]
 */
public class 문자열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String actor="하정우,임시완,배성우,김상호";
		String[] movie=actor.split(",");
		System.out.println(movie[1]);*/
		
//		String actor="하정우|임시완|배성우|김상호";
//		String[] movie=actor.split("\\|"); // "|"로 split하려면 정규식이기때문에 "\\|"로 구분해야한다
//		//					------마우스커서 가져다대면 (String regex) 나오는데 정규식이라는 의미 (String에는 split과 replaceAll)
//		System.out.println(movie[1]);
		String name="          Hello Java         ";
		System.out.println(name.trim()); // trim=> 좌우의 공백만 제거(가운데 공백은 X) 
//							----------공백이 사라지기 때문에 문자열의 길이도 줄어든 공백만큼 줄어든다 
		
		// replace => 원하는 문자를 변경
		String s="Hello Java Java";
		System.out.println(s.replace('a', 'b'));
		System.out.println(s.replace("Java", "Oracle"));
		System.out.println(s); // 저장하지않고 출력만했기 때문에 s는 그대로
		System.out.println(s=s.replace("Java", "Oracle")); //출력문 안에서도 저장 가능 => s 변경
	}

}
