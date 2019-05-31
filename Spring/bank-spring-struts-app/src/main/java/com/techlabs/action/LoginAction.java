package com.techlabs.action;

import java.sql.SQLException;
import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import com.techlabs.business.Account;
import com.techlabs.business.Login;
import com.techlabs.service.AccountService;

public class LoginAction implements SessionAware {
	private Login login = new Login();
	private static boolean firstTime;
	private SessionMap<String, Object> sessionMap;
	@Autowired
	AccountService accountService;
	static {
		firstTime = true;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public String execute() throws Exception {
		System.out.println("login execute called");
		System.out.println();
		return "success";
	}

	public String executeDo() throws SQLException, ClassNotFoundException {

		System.out.println("login executeDo called");
		System.out.println(login.getUsername() + "..." + login.getPassword());
		System.out.println();
		Account account = accountService.getUser(login.getUsername());

		if (account.getName().equals(login.getUsername()) && account.getPassword().equals(login.getPassword())) {

			sessionMap.put("login","true");
			sessionMap.put("userName",account.getName());
			System.out.println("User Validate");
			
			return "success";
		} else {
			return "login";
		}
	}

	@Override
	public void setSession(Map<String, Object> session) {
		sessionMap = (SessionMap) session;

	}
	
	public String logout(){  
	    if(sessionMap!=null){  
	        sessionMap.invalidate();  
	    }  
	    return "success";  
	}

}