// charAt...
// 대문자 / 소문자 변경
public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdef";
		// 대문자출력
//		for(int i=0;i<s.length();i++) {
//			char c=s.charAt(i);
//			System.out.print((char)(c-32));
//		}
		
		System.out.println(s.toUpperCase()); // 대문자변경
		
		s="ABCDEFG";
//		for(int i=0;i<s.length();i++) {
//			char c=s.charAt(i);
//			System.out.print((char)(c+32));
			
		System.out.println(s.toLowerCase()); // 소문자변경
		
		String name="JASON";
		System.out.println(name.toLowerCase());
	}

}
