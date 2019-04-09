package com.ak1ak1.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		// System.out.println("数据源为" + DataSourceContextHolder.getDataSource());
		return DataSourceContextHolder.getDataSource();
	}

}
