package com.test.testpro.persistence.customshard;

import org.shardmybatis.spring.dbsharding.customshard.DataSourceRoutingHandler;

/**
 * Mapper注解参数是对象，在对象的变量上加注解，如果不是直接注解
 * 函数的入参只能有一个
 *
 */
public class OrderModuloSharding implements DataSourceRoutingHandler{
	
	
	//分库，按取模数获取数据库数据源
	public String getDataSource(Object param){
		
		Long id = (Long)param;
		
		if(id%16<=3)
			return "dataSource0";
		else if(id%16>=4 && id%16<=7)
			return "dataSource1";
		else if(id%16>=8 && id%16<=11)
			return "dataSource2";
		else
			return "dataSource3";
	}
	
	//获取表名的分表方式
	public String getTableName(Object param){
		Long id = (Long)param;
		return ""+id%16;
	}

}
