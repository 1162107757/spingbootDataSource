package com.ak1ak1.mapper.mapper2;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ak1ak1.annotation.DB;
import com.ak1ak1.pojo.GresaSaDtl;

import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
@DB("datasource2")
public interface GresaSaDtlMapper extends Mapper<GresaSaDtl> {

	List<GresaSaDtl> getGresaSaDtlsList(@Param("page")int page, @Param("limit")Integer limit);

	Integer getGresaSaDtlsCount();
	
}
