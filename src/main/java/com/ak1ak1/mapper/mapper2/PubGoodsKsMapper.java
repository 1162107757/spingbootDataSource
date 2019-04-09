package com.ak1ak1.mapper.mapper2;

import com.ak1ak1.annotation.DB;
import com.ak1ak1.pojo.PubGoodsKs;

import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
@DB("datasource2")
public interface PubGoodsKsMapper extends Mapper<PubGoodsKs> {

}
