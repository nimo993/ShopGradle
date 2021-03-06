package org.fkit.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.FetchType;
import org.fkit.shop.domain.Cart;


public interface CartMapper {

	@Select("select * from tb_cart")
	@Results({ @Result(id = true, column = "id", property = "id"),
		@Result(column = "goods_id", property = "goods", many = @Many(select = "org.fkit.shop.mapper.GoodsMapper.selectByGoodsId", fetchType = FetchType.LAZY)),		
		@Result(column = "count", property = "count"), @Result(column = "goods_id", property = "goods_id")})
	List<Cart> findAll();
	
	    //加入购物车
	    @Insert("insert into tb_cart(goods_id,count) values(#{goods_id},#{count})")
		@Options(useGeneratedKeys = true, keyProperty = "id")
		int saveCart(Cart cart);
         //通过ID寻找书
	    @Select("select * from tb_cart where goods_id=#{goods_id}")
		@Results({ @Result(id = true, column = "id", property = "id"),
				@Result(column = "goods_id", property = "goods", many = @Many(select = "org.fkit.shop.mapper.GoodsMapper.selectByGoodsId", fetchType = FetchType.LAZY)),				
				@Result(column = "count", property = "count"), @Result(column = "goods_id", property = "goods_id") })
		Cart findWithId(@Param("goods_id") int goods_id);
        //增加书籍数量
	    @Update("update tb_cart set count=count+1 where goods_id=#{goods_id}")
		void addCart(Cart cart);
        //清空购物车
	    @Delete("delete from tb_cart ")
		void clearCart();
	    //减少购物车商品数量
	    @Update("update tb_cart set count=count-1 where goods_id=#{goods_id}")
		void reduceCart(Cart cart);
	    //删除商品
	    @Delete("delete from tb_cart where goods_id=#{goods_id}")
		void removeCart(Cart cart);
}
