package com.sist.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 캡슐화
@Getter // 실무에서 getter,setter쓰는 방법 // lombok => mvnrepository.com에서 lombok다운 => cmd로 풀고 
		// => eclipse.exe 경로설정 => install => get,set할 폴더우클릭 => build path => configure => classpath선택 후 => add external jar => javaDev에 있는 lombok선택 

@Setter // Getter, Setter 적용되었는지 확인 => outline보면 get set확인 가능
// get,set이 class위에있으면 전체다 적용, 변수위에있으면 아래변수하나만 적용
//@Data
//@NoArgsConstructor   // 생성자 만들어줌 
//@AllArgsConstructor  // 매개변수 포함 생성자 만들어줌
// @ ==> annotation
public class Music {
	// 변수 => 저장 / 값 읽기
	// 		------------- 메소드(getXxx,setXxx)
	private int mno; // default는 사용자는 못봄 같은폴더만
	private String title;
	/*
	 * 		public void setTitle(String title){
	 * 			this.title=title;
	 * 		}
	 */
	private String singer;
	private String album;
	private int idcrement;
	private String state;
	// 은닉화 => 클라이언트가 볼 수 있게 만든다
	// 변수 => 메모리에 저장 / 메모리에서 데이터 읽기
	//        읽기 / 쓰기 => 기능 추가 ==> getter/setter
	// 								=> 데이터는 감추고 메소드를 이용해서 값을 가져올수있게

	
	
}
