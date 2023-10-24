package com.sist.lib;
import java.text.*;
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="홍길동";
		String sex="남자";
		int age=20;
		String addr="서울";
		String phone="010-1111-1111";
		// INSERT => 문자열 : '' , 정수는 그대로
		String sql="INSERT INTO member VALUES('"
					+name+"','"+sex+"',"+age+",'"+addr+"','"+phone+"')";
		System.out.println(sql);
		System.out.println("===== 변환 이용 =====");
		String sql2="INSERT INTO member VALUES(''{0}'',''{1}'',"+"{2},''{3}'',''{4}'')"; // '<=두개씩 줘야함 (오라클 전달시 '값'의 형태로 줘야하므로)
		Object[] obj= {name,sex,age,addr,phone};
		System.out.println(MessageFormat.format(sql2, obj));
		System.out.println(MessageFormat.format("나의 이름은 {0} 입니다. 성별은 {1}이고 나이는 {2}입니다.", name, sex, age));
		// ?,?,?,?,?
	}
	// ***DecimalFormat, ***SimpleDateFormat, MessageFormat, ChoiceFormat
	// => 출력 형식으로 변환 => java.text
}
