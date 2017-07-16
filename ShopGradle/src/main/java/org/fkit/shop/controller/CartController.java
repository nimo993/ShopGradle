package org.fkit.shop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;


import org.fkit.shop.domain.Cart;

import org.fkit.shop.service.CartService;


@Controller
public class CartController {

	@Autowired
	@Qualifier("cartService")
	private CartService cartService;

	@RequestMapping(value="/addcart")
	
	public String save(HttpServletRequest request,Model model) {

		String goods_id = request.getParameter("goods_id");
		int goods_id_ = Integer.parseInt(goods_id);
		Cart cart=cartService.findCart(goods_id_);
		if (cart == null) {
			cartService.saveCart(goods_id_);
		}else {			
			cartService.addCart(goods_id_);	
		}
		List<Cart> cart_list = cartService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("cart_list", cart_list);
		// 跳转到cart页面
		return "cart";
	}
	

@RequestMapping(value="/cart")
public String cart(Model model){
	
	List<Cart> cart_list=cartService.getAll();
	model.addAttribute("cart_list",cart_list);
	return "cart";
}
//从购物车里减少数量
@RequestMapping(value="/reduce")
public String reduce(Model model,HttpServletRequest request){
	String goods_id = request.getParameter("goods_id");
	int goods_id_ = Integer.parseInt(goods_id);
	cartService.reduceCart(goods_id_);
	List<Cart> cart_list = cartService.getAll();
	// 将图书集合添加到model当中
	model.addAttribute("cart_list", cart_list);
	// 跳转到cart页面
	return "cart";
}
//取消购物车的东西
	@RequestMapping(value="/remove")
	public String remove(Model model,HttpServletRequest request){
		String goods_id = request.getParameter("goods_id");
		int goods_id_ = Integer.parseInt(goods_id);
		cartService.removeCart(goods_id_);
		List<Cart> cart_list = cartService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("cart_list", cart_list);
		// 跳转到cart页面
		return "cart";
	}
}