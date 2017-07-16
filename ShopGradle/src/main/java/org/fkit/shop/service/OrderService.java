package org.fkit.shop.service;

import java.util.List;

import org.fkit.shop.domain.Order;

public interface OrderService {
	List<Order> getAll();
	Order findOrder(int goods_id);
	Order saveOrder(int goods_id);
	Order addOrder(int goods_id);
	Order removeOrder(int goods_id);
}
