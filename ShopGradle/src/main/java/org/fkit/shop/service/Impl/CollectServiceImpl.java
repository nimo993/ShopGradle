package org.fkit.shop.service.Impl;

import java.util.List;

import org.fkit.shop.domain.Collect;
import org.fkit.shop.mapper.CollectMapper;
import org.fkit.shop.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("collectService")
public class CollectServiceImpl implements CollectService{
	@Autowired
	private CollectMapper collectMapper;
	@Override
	public List<Collect> getAll() {
		// TODO Auto-generated method stub
		return collectMapper.findAll();
	}

	@Override
	public Collect removeCollect(int goods_id) {
		// TODO Auto-generated method stub
		Collect collect = collectMapper.findWithId(goods_id);
		collectMapper.removeCollect(collect);
		return collect;
	}

	@Override
	public Collect findCollect(int goods_id) {
		// TODO Auto-generated method stub
		return collectMapper.findWithId(goods_id);
	}

	@Override
	public Collect saveCollect(int goods_id) {
		// TODO Auto-generated method stub
		Collect collect=new Collect();
		collect.setGoods_id(goods_id);
		collectMapper.saveCollect(collect);
		return collect;
	}

	@Override
	public void clearCollect() {
		// TODO Auto-generated method stub
		collectMapper.clearCollect();
	}

}
