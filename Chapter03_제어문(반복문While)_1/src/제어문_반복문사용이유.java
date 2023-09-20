// 5개 난수발생 => 최댓값 (1~100)
public class 제어문_반복문사용이유 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		int d=(int)(Math.random()*100)+1;
		int e=(int)(Math.random()*100)+1; // 반복문은 조건하나만 쓰면되지만, 안쓸경우 일일이 변수를 설정해야함 (비효율적)
		int max=1;
		if(max<a)
			max=a;
		if(max<b)
			max=b;
		if(max<c)
			max=c;
		if(max<d)
			max=d;
		if(max<e)
			max=e;
		
		System.out.println("최댓값:"+max); // 5개 난수기때문에 변수5개설정, if문 5개써야함. 반복문을 활용해야함
	}

}
