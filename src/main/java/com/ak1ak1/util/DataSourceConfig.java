package com.ak1ak1.util;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DataSourceConfig {

	
	
	@Value("${spring.datasource.db1.jdbc-url}")
    private String dbUrl1;

    @Value("${spring.datasource.db1.username}")
    private String username1;

    @Value("${spring.datasource.db1.password}")
    private String password1;

    @Value("${spring.datasource.db1.driverClassName}")
    private String driverClassName1;
    
    
    @Value("${spring.datasource.db2.jdbc-url}")
    private String dbUrl2;
    
    @Value("${spring.datasource.db2.username}")
    private String username2;
    
    @Value("${spring.datasource.db2.password}")
    private String password2;
    
    @Value("${spring.datasource.db2.driverClassName}")
    private String driverClassName2;

    @Value("${spring.datasource.initialSize}")
    private int initialSize;

    @Value("${spring.datasource.minIdle}")
    private int minIdle;

    @Value("${spring.datasource.maxActive}")
    private int maxActive;

    @Value("${spring.datasource.maxWait}")
    private int maxWait;

    @Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
    private int timeBetweenEvictionRunsMillis;

    @Value("${spring.datasource.minEvictableIdleTimeMillis}")
    private int minEvictableIdleTimeMillis;

    @Value("${spring.datasource.validationQuery}")
    private String validationQuery;

    @Value("${spring.datasource.testWhileIdle}")
    private boolean testWhileIdle;

    @Value("${spring.datasource.testOnBorrow}")
    private boolean testOnBorrow;

    @Value("${spring.datasource.testOnReturn}")
    private boolean testOnReturn;

    @Value("${spring.datasource.filters}")
    private String filters;

    @Value("${spring.datasource.logSlowSql}")
    private String logSlowSql;
	
	//数据源1
    @Bean(name = "datasource1")
    // @ConfigurationProperties(prefix = "spring.datasource.db1") // application.properteis中对应属性的前缀
    public DataSource dataSource1() throws IOException {
    	// DataSource dataSource = DataSourceBuilder.create().build();
    	DruidDataSource datasource = new DruidDataSource();
    	datasource.setUrl(dbUrl1);
        datasource.setUsername(username1);
        datasource.setPassword(password1);
        datasource.setDriverClassName(driverClassName1);
        datasource.setInitialSize(initialSize);
        datasource.setMinIdle(minIdle);
        datasource.setMaxActive(maxActive);
        datasource.setMaxWait(maxWait);
        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        datasource.setValidationQuery(validationQuery);
        datasource.setTestWhileIdle(testWhileIdle);
        datasource.setTestOnBorrow(testOnBorrow);
        datasource.setTestOnReturn(testOnReturn);
        try {
            datasource.setFilters(filters);
        } catch (SQLException e) {
        	e.printStackTrace();
        }
    	return datasource;
    }
 
    //数据源2
    @Bean(name = "datasource2")
    // @ConfigurationProperties(prefix = "spring.datasource.db2") // application.properteis中对应属性的前缀
    public DataSource dataSource2() throws IOException {
    	
    	// DataSource dataSource = DataSourceBuilder.create().build();
    	DruidDataSource datasource = new DruidDataSource();
    	datasource.setUrl(dbUrl2);
        datasource.setUsername(username2);
        datasource.setPassword(password2);
        datasource.setDriverClassName(driverClassName2);
        datasource.setInitialSize(initialSize);
        datasource.setMinIdle(minIdle);
        datasource.setMaxActive(maxActive);
        datasource.setMaxWait(maxWait);
        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        datasource.setValidationQuery(validationQuery);
        datasource.setTestWhileIdle(testWhileIdle);
        datasource.setTestOnBorrow(testOnBorrow);
        datasource.setTestOnReturn(testOnReturn);
        try {
            datasource.setFilters(filters);
        } catch (SQLException e) {
        	e.printStackTrace();
        }
    	return datasource;
    	/*DataSource dataSource = DataSourceBuilder.create().build();
        return dataSource;*/
    }
	
    @Primary
    @Bean(name = "dynamicDataSource")
    public DataSource dynamicDataSource() throws IOException {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        // 默认数据源
        dynamicDataSource.setDefaultTargetDataSource(dataSource1());
        // 配置多数据源
        Map<Object, Object> dsMap = new HashMap<>();
        dsMap.put("datasource1", dataSource1());
        dsMap.put("datasource2", dataSource2());
        dynamicDataSource.setTargetDataSources(dsMap);
        return dynamicDataSource;
    }
 
    /**
     * 配置@Transactional注解事物
     * @return
     * @throws IOException 
     */
    @Bean
    public PlatformTransactionManager transactionManager() throws IOException {
        return new DataSourceTransactionManager(dynamicDataSource());
    }
}
