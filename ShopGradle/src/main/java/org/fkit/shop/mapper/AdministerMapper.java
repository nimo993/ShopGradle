package org.fkit.shop.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import org.fkit.shop.domain.Administer;

public interface AdministerMapper {
	@Select("select * from tb_administer where loginname = #{loginname} and password = #{password}")
	Administer findWithLoginnameAndPassword(@Param("loginname")String loginname,
			@Param("password") String password);
}
