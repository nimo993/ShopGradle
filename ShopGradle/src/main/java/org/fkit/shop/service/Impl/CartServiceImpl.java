package org.fkit.shop.service.Impl;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import org.fkit.shop.domain.Cart;
import org.fkit.shop.mapper.CartMapper;
import org.fkit.shop.service.CartService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("cartService")
public class CartServiceImpl implements CartService {
	@Autowired
	private CartMapper cartMapper;

	@Override
	public List<Cart> getAll() {
		// TODO Auto-generated method stub
		return cartMapper.findAll();
	}
	
	@Override
	public Cart findCart(int goods_id) {
		// TODO Auto-generated method stub
		return cartMapper.findWithId(goods_id);
	}

	@Override
	public Cart saveCart(int goods_id) {
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		cart.setGoods_id(goods_id);
		final int i = 1;
		cart.setCount(i);
		cartMapper.saveCart(cart);
		return cart;
	}
	@Override
	public Cart addCart(int goods_id) {
		// TODO Auto-generated method stub
		Cart cart = cartMapper.findWithId(goods_id);
		cartMapper.addCart(cart);
		return cart;
	}

	@Override
	public Cart reduceCart(int goods_id) {
		// TODO Auto-generated method stub
		
				Cart cart = cartMapper.findWithId(goods_id);
				if (cart.getCount() >= 1) {
					cartMapper.reduceCart(cart);
				} else {
					Error e = null;
					throw new RuntimeErrorException(e);
				}
				return cart;
	}

	@Override
	public void clearCart() {
		// TODO Auto-generated method stub
		cartMapper.clearCart();
	}

	@Override
	public Cart removeCart(int goods_id) {
		// TODO Auto-generated method stub
		Cart cart = cartMapper.findWithId(goods_id);
		cartMapper.removeCart(cart);
		return cart;
	}

	
	
}
