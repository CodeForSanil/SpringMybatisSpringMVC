package com.hand.ssm.service.impl;

import com.hand.ssm.dao.GoodsDao;
import com.hand.ssm.dto.Goods;
import com.hand.ssm.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wangz
 */
@Service("goodService")
public class GoodServiceImpl implements GoodsService{

	/**
	 * 注入
	 */
	@Resource
	private	GoodsDao goodsDao;

	@Override
	public Goods getGood(long goodId) {
		return goodsDao.getGoodByPrimaryKey(goodId);
	}

}
