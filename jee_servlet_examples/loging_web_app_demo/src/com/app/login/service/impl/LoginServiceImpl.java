package com.app.login.service.impl;

import com.app.login.dao.LoginDAO;
import com.app.login.dao.impl.LoginDAOImpl;
import com.app.login.exception.BusinessException;
import com.app.login.model.User;
import com.app.login.service.LoginService;

public class LoginServiceImpl implements LoginService {

	private LoginDAO dao=new LoginDAOImpl();
	@Override
	public boolean isValidUserCredentials(User user) throws BusinessException {
		boolean b = false;
		
		if(user!=null && user.getUserName()!=null && user.getPassword()!=null && user.getUserName().matches("[a-z]{4,6}[0-9]{4}") && user.getPassword().matches("[a-z]{3,6}[*#$@]{1}[0-9]{4}")) {
			b=dao.isValidUserCredentials(user);
			
		}else {
			throw new BusinessException("Invalid Login Credentials");
		}
		return b;
	}

}
