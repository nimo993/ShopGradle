package org.fkit.shop.domain;

import java.util.List;

public class Order {
 private int id;
 private int  count;
 public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public List<Goods> getGoods() {
	return goods;
}
public void setGoods(List<Goods> goods) {
	this.goods = goods;
}
private int goods_id;
 private int user_id;
 private List<Goods> goods;
 private String state;
 

	public String getState() {
	return state;
}
public void setState(String state) {
	
	this.state = state;
}
private String address;

	public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", goods=" + goods + ",state="+state+", count=" + count + ", goods_id=" + goods_id + ", "
				+ "user_id="+ user_id + ",address="+address+"]";
	}
}
