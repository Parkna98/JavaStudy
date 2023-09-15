// 정수 2개를 난수로 받아서 => 최댓값,최솟값을 구한다
public class 단일조건문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = (int)(Math.random()*100)+1;
		int num2 = (int)(Math.random()*100)+1;
		System.out.println("Max:"+Math.max(num1, num2)); // 라이브러리 쓰면 과정 훨씬 단축됨 
		System.out.println("Min:"+Math.min(num1, num2)); 
		
//		System.out.println("첫번째 난수:"+num1);
//		System.out.println("두번째 난수:"+num2);
//		
//		int max=num1; // 간단히 생각하기
//		if (max<num2)
//			max=num2;
//		System.out.println("MAX:"+max);
//		
//		int min=num1;
//		if (min>num2)
//			min=num2;
//		System.out.println("MIN:"+min);
	}

}
