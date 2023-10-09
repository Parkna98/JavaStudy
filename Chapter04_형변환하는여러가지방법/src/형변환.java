/*		
 * 		*** 숫자형식 형변환
 * 	
 * 		int => char : i + '0'
 * 			3+'0' => 3+48 => 51 => '3' (char연산 시 int로 변경)
 * 
 * 		char => int : c - '0'
 * 			'3'-'0' => 51-48 => 3
 *    
 * 		int => Str : (문자열) + (any type) => 문자열
 * 			3+"" => "3" 
 * 			String.valueOf(int); (int말고 다른 type도 변환가능)
 * 
 * 		Str => int
 * 			Integer.valueOf(Str); 
 *				=> Integer.valueOf("3") ; => 3 (int)
 *
 * 		char[] => Str
 * 			String.valueOf();
 * 				=> char[] arr = 
 * 			
 * 			
 * 		Str  => char[]
 * 			toCharArray();
 * 				=> char[] arr = {'a','b','c','d'};
 * 					String arrStr = String.valueOf(arr);
 * 
 */
public class 형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="3";
//		int i = Integer.valueOf(s);
//		System.out.println(i+1);
		
		// char[] => String : String.valueOf(char[])
		char[] arr = {'a','b','c','d'};
		String arrstr = String.valueOf(arr);
		System.out.println(arrstr);
		
		// char[] => String : Character.toString(char[])
		String change="";
		for(int i=0;i<arr.length;i++) {
			change += Character.toString(arr[i]);
		}
		System.out.println(change);
	}

}
