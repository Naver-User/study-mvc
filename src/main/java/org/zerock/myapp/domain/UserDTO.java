package org.zerock.myapp.domain;

import java.io.Serial;
import java.io.Serializable;

import org.zerock.myapp.annotation.DTO;

import lombok.Data;


@DTO

@Data
public class UserDTO implements Serializable {
	@Serial private static final long serialVersionUID = 1L;
	
	// 로그인 화면에서 사용자가 입력한 아래 2개 이름의 전송파라미터를 저장할 필드선언
	private String username;	// 저장할 전송파라미터의 이름과 동일하게 선언
	private String password;	// 상동.
	
	

} // end class

