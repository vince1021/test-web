package com.test.testpro.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.testpro.persistence.dao.TOrderMapper;
import com.test.testpro.persistence.dao1.UserMapper;
import com.test.testpro.persistence.po.TOrder;
import com.test.testpro.persistence.po.User;
import com.test.testpro.util.JSONUtils;

@Service
public class TestService {
	
	@Autowired(required=true)
	UserMapper userMapper;
//	
	@Autowired(required=true)
	TOrderMapper tOrderMapper;
	

	@Transactional
	public String testOrder(Long id){
		
		//kafkaProducerService.sendMessage("testjava", "hello");
	
	
			User record1 = new User();
			record1.setUserName("lilianzhi");
			record1.setPassword("ps");
			record1.setCreateTime(new Date());
			userMapper.insertSelective(record1);
			System.out.println(JSONUtils.toJSONString(record1));
			
			TOrder record = new TOrder();
			//record.setOrderId(System.currentTimeMillis());
			record.setOrderId(id);
			record.setUserId(112233);
			record.setStatus("ACT");
			tOrderMapper.insertSelective(record);
			System.out.println(record.getOrderId());
			
			//User user = userMapper.selectOne(record);
			TOrder user = tOrderMapper.selectByPrimaryKey(record.getOrderId());
			System.out.println(JSONUtils.toJSONString(user));
		
		
		
		return "login";
	}
	
	public String testOrder1(Long id){
		
		//kafkaProducerService.sendMessage("testjava", "hello");
	
			
			User record1 = new User();
			record1.setUserName("lilianzhi");
			record1.setPassword("ps");
			record1.setCreateTime(new Date());
			userMapper.insertSelective(record1);
			System.out.println(JSONUtils.toJSONString(record1));
			
			TOrder record = new TOrder();
			//record.setOrderId(System.currentTimeMillis());
			record.setOrderId(id);
			record.setUserId(112233);
			record.setStatus("ACT");
			tOrderMapper.insertSelective(record);
			System.out.println(record.getOrderId());
			
			//User user = userMapper.selectOne(record);
			TOrder user = tOrderMapper.selectByPrimaryKey(record.getOrderId());
			System.out.println(JSONUtils.toJSONString(user));
		
		
		
		return "login";
	}
	

}
