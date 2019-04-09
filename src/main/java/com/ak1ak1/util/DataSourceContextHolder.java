package com.ak1ak1.util;

public class DataSourceContextHolder {

	public static final String DEFAULT_DB = "datasource1";
	 
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();
    
    public static void setDataSource(String dbType){
    	contextHolder.set(dbType);
    }
    
    public static String getDataSource(){
    	return (contextHolder.get());
    }
	
    public static void clearDataSource(){
    	contextHolder.remove();
    }
}
