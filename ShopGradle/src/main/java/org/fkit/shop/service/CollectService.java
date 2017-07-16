package org.fkit.shop.service;

import java.util.List;

import org.fkit.shop.domain.Collect;

public interface CollectService {
	List<Collect> getAll();
	Collect removeCollect(int goods_id);
	Collect findCollect(int goods_id);
	Collect saveCollect(int goods_id);
	void clearCollect();
}
