package org.fkit.shop.service.Impl;

import java.util.List;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.fkit.shop.domain.Goods;
import org.fkit.shop.mapper.GoodsMapper;
import org.fkit.shop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsMapper goodsMapper;
	
	@Transactional(readOnly=true)
	@Override
	public List<Goods> getAll() {
		return goodsMapper.findAll();
	}
}
