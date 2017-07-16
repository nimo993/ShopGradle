package org.fkit.shop.service;

import org.fkit.shop.domain.Administer;

public interface AdministerService {
	/**
	 * 判断用户登录
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	Administer alogin(String loginname,String password);
}
