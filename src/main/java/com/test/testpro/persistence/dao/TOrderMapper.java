package com.test.testpro.persistence.dao;

import java.util.List;

import com.test.testpro.persistence.po.TOrder;

public interface TOrderMapper {

	int deleteByPrimaryKey(Long orderId);

	int insert(TOrder record);

	int insertSelective(TOrder record);

	TOrder selectByPrimaryKey(Long orderId);

	int updateByPrimaryKeySelective(TOrder record);

	int updateByPrimaryKey(TOrder record);

	TOrder selectOne(TOrder record);

	List<TOrder> selectList(TOrder record);

	int selectCount(TOrder record);

	int deleteSelective(TOrder record);
}