package com.hand.ssm.service;

import com.hand.ssm.dto.Goods;

/**
 * @author wangz
 */
public interface GoodsService {

	/**
	 * 查询产品
	 * @param goodId 产品
	 * @return 产品
	 */
	Goods getGood(long goodId);
}
