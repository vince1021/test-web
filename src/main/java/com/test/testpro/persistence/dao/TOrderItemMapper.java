package com.test.testpro.persistence.dao;

import java.util.List;

import com.test.testpro.persistence.po.TOrderItem;

public interface TOrderItemMapper {

	int deleteByPrimaryKey(Long itemId);

	int insert(TOrderItem record);

	int insertSelective(TOrderItem record);

	TOrderItem selectByPrimaryKey(Long itemId);

	int updateByPrimaryKeySelective(TOrderItem record);

	int updateByPrimaryKey(TOrderItem record);

	TOrderItem selectOne(TOrderItem record);

	List<TOrderItem> selectList(TOrderItem record);

	int selectCount(TOrderItem record);

	int deleteSelective(TOrderItem record);
}