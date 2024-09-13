package org.zerock.myapp.domain;

import java.io.Serial;
import java.io.Serializable;

import org.zerock.myapp.annotation.VO;

import lombok.Value;


@VO

@Value
public class UserVO implements Serializable {
	@Serial private static final long serialVersionUID = 1L;
	
	// 테이블의 스키마에 나온 컬럼의 순서대로, 컬럼명을 따라가고,
	// 컬럼타입에 맞는 자바타입으로 필드의 타입을 선언
	// 주의사항: 만약에 테이블의 컬럼명이 복합단어로 되어 있고
	//           USER_NAME 이런식으로 "_" 기호로 선언된 컬럼명은
	//		     VO의 필드로 선언할 때에는, 카멜기법으로 선언합니다.
	//			 이렇게, 예)userName
	private String username;
	private String password;
	private String role;
	
	// 중요사항: VO이든 DTO이든, 필드의 타입은 절대 기본타입을 사용하지 않습니다.
	//			 만약 기본타입이 필요하면, 그에 대응되는 Wrapper Type으로 선언
	
	

} // end class

