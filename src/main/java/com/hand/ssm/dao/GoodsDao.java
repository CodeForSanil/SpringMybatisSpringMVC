package com.hand.ssm.dao;

import com.hand.ssm.dto.Goods;
import org.springframework.stereotype.Repository;

/**
 * @author wangz
 */
@Repository
public interface GoodsDao {

	/**
	 * 查询产品信息
	 * @param goodId 产品id
	 * @return Goods
	 */
	Goods getGoodByPrimaryKey(long goodId);
	
}
