// 1. 5명의 학생의 국어점수를 받아서 등수를 출력하는 프로그램 작성
// 점수배열 하나와 랭크배열 하나씩 만들기
// 처음 랭크1로 하고 뒤의 값들과 순서대로 비교하면서 더 큰값있으면 +1.
import java.util.Arrays;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] arr=new int[5];
		int[] rank=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		// 등수구하기
		for(int i=0;i<rank.length;i++) {
			rank[i]=1;
			for(int j=0;j<rank.length;j++) {
				if(arr[j]>arr[i]) {
					rank[i]++;   
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(rank));*/
		
		/*int[] kor=new int[5];
		int[] rank=new int[5];
		// 난수 생성
		for(int i=0;i<kor.length;i++) {
			kor[i]=(int)(Math.random()*50)+50;
		}
		// 등수 출력 => 등수1로 설정하고 그뒤의 점수와 비교하면서 더큰값이 있을 경우 +1
		for(int i=0;i<rank.length;i++) {
			rank[i]=1;
			for(int j=0;j<rank.length;j++) {
				if(kor[j]>kor[i]) {
					rank[i]++; 
				}
			}
		}
		System.out.println(Arrays.toString(kor));
		System.out.println(Arrays.toString(rank));*/
		String my_string="apporoograpemmemprs";
		int[] indices= {1, 16, 6, 15, 0, 10, 11, 3};
		String answer = "";
        String[] str=my_string.split("");
        System.out.println(Arrays.toString(str));
        for(int i:indices){
            str[i]="";
        }
        System.out.println(Arrays.toString(str));
        answer=String.join("",str);
        System.out.println(answer);
	}

}
