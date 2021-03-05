package com.javaweb.action;


import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginAction extends ActionSupport {
	private String username;
	private String password;

	@Override
	public void validate() {
		if("zxp".equals(username) && "1234".equals(password)){
			
		}else{
			this.addActionError("用户名密码不一致");
		}
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String execute() throws Exception {
		return SUCCESS;
	}
}
