package com.test.testpro.persistence.dao;

import java.util.List;

import com.test.testpro.persistence.po.User;

public interface UserMapper {

	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	User selectOne(User record);

	List<User> selectList(User record);

	int selectCount(User record);

	int deleteSelective(User record);
}