package com.test.testpro.persistence.po;

import org.shardmybatis.spring.dbsharding.annotation.ShardingKey;

public class TOrder extends DBRecord {

	
	@ShardingKey
	private Long orderId;

	private Integer userId;

	private String status;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}