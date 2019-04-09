package com.ak1ak1.mapper.mapper2;

import org.apache.ibatis.annotations.Param;

import com.ak1ak1.annotation.DB;
import com.ak1ak1.pojo.PubGoods;

import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
@DB("datasource2")
public interface PubGoodsMapper extends Mapper<PubGoods> {

	PubGoods getPubGoogs(@Param("goodsid")Long goodsid);
	
	
}
