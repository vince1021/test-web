package com.test.testpro.persistence.dao;

import java.util.List;

import com.test.testpro.dbshard.annotation.DataSourceRouting;
import com.test.testpro.dbshard.annotation.ShardingKey;
import com.test.testpro.persistence.customshard.OrderModuloSharding;
import com.test.testpro.persistence.po.TOrder;

@DataSourceRouting(handler = OrderModuloSharding.class)
public interface TOrderMapper {

	int deleteByPrimaryKey(@ShardingKey Long orderId);

	int insert(TOrder record);

	int insertSelective(TOrder record);

	TOrder selectByPrimaryKey(@ShardingKey Long orderId);

	int updateByPrimaryKeySelective(TOrder record);

	int updateByPrimaryKey(TOrder record);

	TOrder selectOne(TOrder record);

	List<TOrder> selectList(TOrder record);

	int selectCount(TOrder record);

	int deleteSelective(TOrder record);
}