package com.test.testpro.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.testpro.persistence.dao.UserMapper;
import com.test.testpro.persistence.po.User;
import com.test.testpro.util.JSONUtils;


@Controller
public class TestController {
	
	@Autowired(required=true)
	UserMapper userMapper;
//	
//	@Autowired(required=true)
//	TOrderMapper tOrderMapper;

	
	@RequestMapping(value = "/user/login.json", method = RequestMethod.GET)
	public void login(
			@RequestParam(value = "user_name", required=true) Long chatid,
			@RequestParam(value = "password", required=true) Long curruid,
			HttpServletRequest request, HttpServletResponse response){
		

	}
	
	@RequestMapping(value = "/user/login.htm", method = RequestMethod.GET)
	public String loginPage(
			@RequestParam(value = "user_name", required=false) Long chatid,
			@RequestParam(value = "password", required=false) Long curruid,
			HttpServletRequest request, HttpServletResponse response){
		
		//kafkaProducerService.sendMessage("testjava", "hello");
	
		
		User record = new User();
		record.setUserName("lilianzhi");
		record.setPassword("ps");
		record.setCreateTime(new Date());
		userMapper.insertSelective(record);
		System.out.println(record.getId());
		
		//User user = userMapper.selectOne(record);
		User user = userMapper.selectByPrimaryKey(record.getId());
		System.out.println(JSONUtils.toJSONString(user));
		
		
		
//		List<User> list = userMapper.selectList(new User());
//		for(User user : list){
//			System.out.println(user.getUserName());
//		}
		
		
		/*
		 TOrder criteria = new TOrder();
	        //criteria.setOrderId(11L);
	        criteria.setUserId(21);
	        tOrderMapper.insertSelective(criteria);
	        System.out.println(criteria.getOrderId());
	        //criteria.setOrderId(12L);
	        criteria.setUserId(22);
	        criteria.setStatus("INSERT2");
	        tOrderMapper.insertSelective(criteria);
	        System.out.println(criteria.getOrderId());
		*/
		
		
		return "login";
	}

}