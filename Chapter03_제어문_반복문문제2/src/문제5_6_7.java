
public class 문제5_6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5.정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 
		// 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라
		int sum=0;
		double avg;
		for(int i=1;i<=10;i++) {
			int num=(int)(Math.random()*10)+1;
			System.out.print(num+" ");
			sum+=num;
		}
		avg=sum/10.0;
		System.out.printf("\n평균:%.2f",avg);
		System.out.println();
		
		// 5-1. while
		int sum2=0;
		double avg2;
		int i=1;
		while(i<=10) {
			int num2=(int)(Math.random()*10)+1;
			System.out.print(num2+" ");
			sum2+=num2;
			i++;
		}
		avg2=sum2/10.0;
		System.out.printf("\n평균:%.2f",avg2);
		System.out.println();
		
		// 5-2. do~while
		int sum3=0;
		int i2=1;
		double avg3;
		do {
			int num3=(int)(Math.random()*10)+1;
			System.out.print(num3+" ");
			sum3+=num3;
			i2++;
		} while(i2<=10);
		avg3=sum3/10.0;
		System.out.printf("\n평균:%.2f",avg3);
		System.out.println();
		
		
		System.out.println("\n=====문제6=====");
		//6.1부터 100 까지의 정수 중에서 
		//짝수만을 더해 출력하는 코드를 for 문을사용해 작성해 보세요
		int even=0;
		for(int o=1;o<=100;o++) {
			if(o%2==0) {
				even+=o;
			}
		}
		System.out.println("합:"+even);
		System.out.println("\n=====문제7=====");
		//7.두 개의 주사위가 같은 값이 나올 때까지 while 문을 사용해 반복하고,
		//반복 횟수와 주사위 눈의 번호를 출력해 보세요.
		int count=0;
		while(true) {
			int dice1=(int)(Math.random()*6)+1;
			int dice2=(int)(Math.random()*6)+1;
			System.out.println("["+dice1+","+dice2+"]");
			count++;
			System.out.println("반복횟수:"+count+"회");
			System.out.println("================");
			if(dice1==dice2) {
				System.out.println("종료");
				break;
			}
			}
		
	}

}
