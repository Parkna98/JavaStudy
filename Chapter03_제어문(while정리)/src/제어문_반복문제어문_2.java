// break ==> while, for => System.exit(0) // break를 자주사용 (break는 while,for문을 종료 / exit는 프로그램 자체종료)
public class 제어문_반복문제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 		i=1 =>	j=1 j=2 j=3 
		 * 		i=2 =>	j=1 j=2 j=3 
		 * 		i=3 =>	j=1 j=2 j=3 ==> 9번반복 
		 */
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=3;j++) {
//				if(j==2) {
//					break;  // 소속문장만 제어 => j만 제어하기때문에 i는 계속 돌아간다 => i=1,j=1 i=2,j=1 i=3,j=1
//				}
//				System.out.println("i="+i+",j="+j);
//			}
//			
			System.out.println("====== continue ======");
			for(int i=1;i<=3;i++) {
				for(int j=1;j<=3;j++) {
					if(j==2) {
						continue;  // 소속문장만 제어 => j만 제어하기때문에 i는 계속 돌아간다 => j=2일때만빼고 i=1,2,3는 다 돌아간다
					}
					System.out.println("i="+i+",j="+j);
				}
		}
			System.out.println("===== 이름있는 break ======");
			outer: for(int i=1;i<=3;i++) {
				for(int j=1;j<=3;j++) {
					if(j==2) {
						break outer;  // 이름있는 break(이름은 자유, 동일하기만하면됨 => outer for문을 종료시킨다 => 결과 i=1, j=1 
					}
					System.out.println("i="+i+",j="+j);
				}
		}	
			
	}

}
