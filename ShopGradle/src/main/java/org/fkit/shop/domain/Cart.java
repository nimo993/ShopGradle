package org.fkit.shop.domain;

import java.io.Serializable;
import java.util.List;



public class Cart implements Serializable{

	private int id;
	private List<Goods> goods;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Goods> getGoods() {
		return goods;
	}
	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	
	

	private int count;
	private int goods_id;
	private int user_id;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ",user_id="+user_id+", goods_id=" + goods_id + ", count=" + count + "]";
	}
	
	
}
