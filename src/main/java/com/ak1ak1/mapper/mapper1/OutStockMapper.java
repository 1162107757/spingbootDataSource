package com.ak1ak1.mapper.mapper1;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ak1ak1.annotation.DB;
import com.ak1ak1.pojo.OutStock;

import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
@DB("datasource1")
public interface OutStockMapper extends Mapper<OutStock> {

	List<OutStock> getOutStockListByOutstockNo(@Param("orderCode")String orderCode);
	
	
}
