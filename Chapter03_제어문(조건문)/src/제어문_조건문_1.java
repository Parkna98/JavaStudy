// 54page
/*
 * 	1) 자바에서 제공하는 제어문 : 프로그램에서 필요에 의해 제어
 * 	----------------------
 * 		평문 : 무조건 수행 => 연산자...
 * 		조건문 : 필요한 내용만 출력 할 때 => 상세보기
 * 			if, switch
 *      반복문 : 같은 내용이 중복이 있는 경우
 *      	for, while, do ~ while
 *      	for : 반복 횟수가 지정
 *      	while : 반복 횟수가 지정되지 않은 경우 (게임, 네트워크 서버)
 *      	------------종료(break), 특정부분 제외(continue)
 *      	do ~ while : 한번 이상을 수행
 *		----------------------------------------------------
 *	1) 자바 => 형식, 결과값 확인 => 사용자(user)가 요청한 내용을 도출
 *		=> 예측(AI)
 *	2) 응용 : 사용처, 흐름(동작순서) => 알고리즘(순서도)
 *	--------------------------------------------------------
 *		1. 조건문
 *			= 단일 조건문 (독립적) => ID중복체크, 우편번호 검색, 로그인
 *								  상세보기, 지도 ...
 *				1) 형식
 *					if(조건문) : 조건문은 반드시 true/false 
 *						=> 부정연산자(!), 비교연산자(==,!=,<,>,<=,>=), 논리연산자(&&, ||)만 사용 가능
 *					{	
 *						조건이 true인 경우 수행하는 문장
 *					}
 *					==> 조건이 true인 경우 수행
 *						조건이 false인 경우 건너뜀
 *				2) 흐름
 *					==> 조건이 true인 경우 수행
 *						조건이 false인 경우 건너뜀
 *					==> 단일 조건문을 여러개 사용시에는 조건에 맞는 모든 문장을 수행
 *						1~100 ==> 3의 배수, 5의 배수, 7의 배수
 *									15		15
 *			= 
 *			= 
 */
public class 제어문_조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수선언 => 데이터관리 => 저장(메모리) => 한개의 데이터 저장
		// 프로그램의 시작 => 데이터 저장, 연산자, 제어문 => 기초/필수
		// 데이터형 변수명 
		int a = 105;
		// 3의 배수, 5의 배수, 7의 배수
		if(a%3==0) // a가 3의 배수
		{
			System.out.println(a+"는(은) 3의배수입니다");
		}
		if(a%5==0) // a가 5의 배수
		{
			System.out.println(a+"는(은) 5의배수입니다");
		}
		if(a%7==0) // a가 7의 배수
		{
			System.out.println(a+"는(은) 7의배수입니다");
		}
		
		
	}

}
