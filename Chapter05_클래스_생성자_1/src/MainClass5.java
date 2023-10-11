import java.util.*;
// 사용자 정의 데이터형
	
class Join{
	int mno;
	String name;
	String address;
	String phone;
	
	Join(int mno,String name,String address,String phone) {
		this.mno=mno;
		this.name=name;
		this.address=address;
		this.phone=phone;
	}
}

class JoinSystem{
	static Join[] member=new Join[5];
	// 값을 받아서 넣어줘야하기때문에 생성자 필요(위의 데이터형클래스에서 생성자 만듬)
	// static은 객체 생성시마다 동일한 메모리 사용
}

public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinSystem js1=new JoinSystem(); // => member
		
		Join j=new Join(1,"홍길동","서울","010-1111-1111");
		js1.member[0]=j;
		// {j,null,null,null,null}
		for(int i=0;i<js1.member.length;i++) {
			if(js1.member[i]!=null) {
				System.out.println(js1.member[i].name);
			}
		}
		
		System.out.println("--------");
		
//		JoinSystem js2=new JoinSystem(); // => member
		Join j2=new Join(2,"심청이","경기","010-2222-2222");
		js1.member[1]=j2;
		for(int i=0;i<js1.member.length;i++) {
			if(js1.member[i]!=null) {
				System.out.println(js1.member[i].name);
			}
		}
		
	}

}
