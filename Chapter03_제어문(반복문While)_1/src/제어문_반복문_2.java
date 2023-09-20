/*
 * 		while
 * 		-----
 * 			=> 10개의 난수 => 1~100
 * 			=> 최댓값 / 최솟값
 */
public class 제어문_반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=1,min=100; // while돌려서 최대 최소 바꿔줄것이기 때문에 최대를 1 최소를 100을 잡는다
		int i=1; // 루프변수
		while(i<=10) {
			int rand=(int)(Math.random()*100)+1;
			System.out.print(rand+" ");
			if(rand>max)
				max=rand;
			if(rand<min)
				min=rand;
			i++;
		}
		System.out.println("\n최댓값:"+max);
		System.out.println("최솟값:"+min);
			
	}

}
