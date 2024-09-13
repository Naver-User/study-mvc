package org.zerock.myapp.service;

import org.zerock.myapp.annotation.Service;
import org.zerock.myapp.domain.UserDTO;
import org.zerock.myapp.domain.UserVO;
import org.zerock.myapp.persistence.UserDAO;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Service

@Log4j2
@NoArgsConstructor
public class UserService {

	// Important: 
	//		The `@PostConstruct` & `@PreDestroy` annotations do work 
	// 		*Only in the java *Servlet class.	
	
	public UserVO findByUsername(UserDTO dto) throws Exception {
		log.trace("findByUsername({}) invoked.", dto);
		
		UserDAO dao = new UserDAO();
		
		UserVO vo = dao.selectByUsername(dto);
		log.info("\t+ vo: {}", vo);
		
		return vo;
	} // findByUsername

} // end class
