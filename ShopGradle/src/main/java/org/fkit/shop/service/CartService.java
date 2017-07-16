package org.fkit.shop.service;

import java.util.List;

import org.fkit.shop.domain.Cart;

public interface CartService {
	
	List<Cart> getAll();
	Cart findCart(int goods_id);
	Cart saveCart(int goods_id);
	Cart addCart(int goods_id);
	Cart reduceCart(int goods_id);
	Cart removeCart(int goods_id);
	void clearCart();
	

}
