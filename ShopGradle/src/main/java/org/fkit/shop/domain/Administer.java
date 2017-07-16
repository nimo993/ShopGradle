package org.fkit.shop.domain;

import java.io.Serializable;

public class Administer implements Serializable {
private String loginname;	// 登录名
	
	public String getLoginname() {
	return loginname;
}

public void setLoginname(String loginname) {
	this.loginname = loginname;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

	private String password;

@Override
public String toString(){
	return "administer [loginname=" + loginname + ", password=" + password + "]";
}
}