
public class aaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		float f=3.14f;
//		double d = 1.4e3f;
//		System.out.println(d);
//	    		int x = 1;
//	    		int y = 2;
//	    		int z = 3;
//	    		int temp_1 = x;
//	            int temp_2 = y;
//	            y = z;
//	            x = temp_2;
//	            z = temp_1;
//	        System.out.println("x="+x);
//	        System.out.println("y="+y);
//	        System.out.println("z="+z);
//		int System = 3;
		
//		int x = 2;
//        int y = 5;
//        char c = 'A'; // 'A'의 문자코드는 65
//        //
//        System.out.println(y>=5 || x<0 && x>2);
//        System.out.println(y += 10 - x++);
//        System.out.println(x += 2);
//        System.out.println(!('A' <= c && c <= 'Z'));
//        System.out.println('c' - c);
//        System.out.println('5' - '0');
////        System.out.println(c + 1);
////        System.out.println(++c);
////        System.out.println(c++);
////        System.out.println(c);
//		int num = 456;
//        System.out.println(num/100*100);
		
		int numOfApples = 123;
        int sizeOfBucket = 10;
        int numOfBucket = ((numOfApples%sizeOfBucket==0)?numOfApples/sizeOfBucket : numOfApples/sizeOfBucket + 1);
        System.out.println("필요한 바구니의 수: "+numOfBucket);
		
	}

}
