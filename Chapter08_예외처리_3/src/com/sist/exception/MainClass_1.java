package com.sist.exception;

import java.io.IOException;
import java.sql.SQLException;

/*
	throws => 선언만 => 예외회피
		=> method 뒤에 붙어있다 => 라이브러리에 주로 사용
							   ------- 자동완성기 이용 (커서 가져다 대면 나오는 해결법)
		=> throws 이용, try~catch 이용
			예외처리의 중심은 try~catch
		-------------------------------
		= 주의점
			void method() throws Exception, IOException, SQLException // => 예상되는 에러들
			{
			}
			==> 사용
			void main() throws Exception, IOException, SQLException
			{		    ------ 프로그래머한테 오류처리 넘기기
			}
			void main(){        
				try{  		// 직접 해결가능하다면 try~catch
				}catch(IOException ex){
				}catch(SQLException e){
				}catch(Exception e){
			}
			==> 가장 큰 예외처리로도 가능하다 (정석은 3개다 처리) => Exception으로 통합가능
			void main() throws Exception
			{
			}
			void main(){
				try{
				}catch(Exception ex){
				}
			}
 */
public class MainClass_1 {
	// 코딩이 많은 경우에 => throws (이미 만들어진 소스) 
	// 시작부터 => try~catch
	public void method() throws Exception,IOException,SQLException
	{
		int i=Integer.parseInt("10 "); 
		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass_1 m=new MainClass_1();
		try {
			m.method();
		}catch(Exception ex) {}
		System.out.println("프로그램 종료!!");
		// try~catch는 에러를 통과하는데
		// throws는 컴파일할때만 통과시켜주고 에러를 통과하지못함
	}

}
