package org.fkit.shop.service.Impl;

import org.fkit.shop.domain.User;
import org.fkit.shop.mapper.UserMapper;
import org.fkit.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * User服务层接口实现类
 * @Service("userService")用于将当前类注释为一个Spring的bean，名为userService
 * */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("userService")
public class UserServiceImpl implements UserService {
	
	/**
	 * 自动注入UserMapper
	 * */
	@Autowired
	private UserMapper userMapper;

	/**
	 * UserService接口login方法实现
	 * @see { UserService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public User login(String loginname, String password) {
		return userMapper.findWithLoginnameAndPassword(loginname, password);
	}
	@Override
	public int addUser(User user) {
		return userMapper.save(user);
		
	}
	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.update(user);
	}
	
	@Override
	public int findUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.find(user);
	}
}
