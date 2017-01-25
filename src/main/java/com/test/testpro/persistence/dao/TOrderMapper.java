package com.test.testpro.persistence.dao;

import java.util.List;

import org.shardmybatis.spring.dbsharding.annotation.DataSourceRouting;
import org.shardmybatis.spring.dbsharding.annotation.ShardingKey;

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