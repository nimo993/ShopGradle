package org.fkit.shop.domain;

import java.util.List;

public class Collect {
	private int id;
	private List<Goods> goods;
	private int goods_id;
	
	
	
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	private int user_id;
	public List<Goods> getGoods() {
		return goods;
	}
	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "collect [id=" + id + ", goods=" + goods + ", user_id=" + user_id + ", goods_id=" +goods_id+ "]";
	}
	
	

}
