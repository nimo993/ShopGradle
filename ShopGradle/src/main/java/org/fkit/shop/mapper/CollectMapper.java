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
import org.apache.ibatis.mapping.FetchType;
import org.fkit.shop.domain.Collect;

public interface CollectMapper {
	//删除商品
    @Delete("delete from tb_collection where goods_id=#{goods_id}")
	void removeCollect(Collect collect);
    
    //遍历书籍
    @Select("select * from tb_collection")
	@Results({ @Result(id = true, column = "id", property = "id"),
		@Result(column = "goods_id", property = "goods", many = @Many(select = "org.fkit.shop.mapper.GoodsMapper.selectByGoodsId", fetchType = FetchType.LAZY)),		
	    @Result(column = "goods_id", property = "goods_id")})
	List<Collect> findAll();
    
    //通过ID寻找书
    @Select("select * from tb_collection where goods_id=#{goods_id}")
	@Results({ @Result(id = true, column = "id", property = "id"),
			@Result(column = "goods_id", property = "goods", many = @Many(select = "org.fkit.shop.mapper.GoodsMapper.selectByGoodsId", fetchType = FetchType.LAZY)),				
			 @Result(column = "goods_id", property = "goods_id") })
	Collect findWithId(@Param("goods_id") int goods_id);
   //进行收藏
    @Insert("insert into tb_collection(goods_id) values(#{goods_id})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int saveCollect(Collect collect);
    //清空收藏
    @Delete("delete from tb_collection ")
	void clearCollect();
}
