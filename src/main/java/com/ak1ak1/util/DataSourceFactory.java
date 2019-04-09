package com.ak1ak1.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataSourceFactory {

	public static Connection getConnection(String dbType,String url,String username,String password) throws Exception{
    	Connection conn = null;
    	Class.forName(DbConfig.ORACLE); //classLoader,加载对应驱动
    	conn = (Connection) DriverManager.getConnection(url, username, password);
    	return conn;
    }
}

class DbConfig{
	
	final static String ORACLE = "oracle.jdbc.driver.OracleDriver";
	final static String MYSQL = "com.mysql.jdbc.Driver";
	
	// 数据库配置
	final static String ORACLEONEURL = "jdbc:oracle:thin:@192.168.1.252:1521:orcl";
	final static String ORACLEONEUSERNAME = "tests";
	final static String ORACLEONEPASSWORD = "tests";
	
}
