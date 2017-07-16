package org.fkit.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import org.fkit.shop.domain.Goods;

public interface GoodsMapper {
	@Select("select * from tb_goods")
	List<Goods> findAll();
	@Select("select * from tb_goods where id=#{id}")
	@Results({ @Result(id = true, column = "id", property = "id"), @Result(column = "image", property = "image"),
			 @Result(column = "catagory", property = "catagory"),
			@Result(column = "goods_name", property = "goods_name"),
			@Result(column = "goods_price", property = "goods_price"),
			@Result(column = "amount", property = "amount"),@Result(column = "remark", property = "remark")})
	List<Goods> selectByGoodsId(int goods_id);
    

}
