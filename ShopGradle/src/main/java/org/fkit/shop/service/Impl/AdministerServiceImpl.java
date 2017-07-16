package org.fkit.shop.service.Impl;


import org.fkit.shop.domain.Administer;

import org.fkit.shop.mapper.AdministerMapper;
import org.fkit.shop.service.AdministerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * User服务层接口实现类
 * @Service("administerService")用于将当前类注释为一个Spring的bean，名为userService
 * */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("administerService")
public class AdministerServiceImpl implements AdministerService {
	/**
	 * 自动注入UserMapper
	 * */
	@Autowired
	private AdministerMapper administerMapper;

	/**
	 * UserService接口login方法实现
	 * @see { UserService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public Administer alogin(String loginname, String password) {
		return administerMapper.findWithLoginnameAndPassword(loginname, password);
	}
}
