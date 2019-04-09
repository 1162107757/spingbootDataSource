package com.ak1ak1.aspect;

import java.lang.reflect.Type;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.support.AopUtils;
import org.springframework.stereotype.Component;

import com.ak1ak1.annotation.DB;
import com.ak1ak1.util.DataSourceContextHolder;

/**
 * @Description 动态切换数据源
 * @author 何杰
 * @date 2019年1月11日
 * @version V1.0
 */
@Aspect
@Component
public class DynamicDataSourceAspect {

	//切换放在mapper接口的方法上，所以这里要配置AOP切面的切入点
	@Pointcut("execution( * com.ak1ak1.mapper.*.*.*(..))")
    public void dataSourcePointCut() {
    }
	
	@Before("dataSourcePointCut()")
    public void beforeSwitchDS(JoinPoint point) throws Exception{
		Object target = point.getTarget();
		// 的到被代理的对象
		Type[] genericInterfaces = AopUtils.getTargetClass(target).getGenericInterfaces();
		// 存储真实对象
		Class<?> clazz = null;
		for (Type type : genericInterfaces) {
			clazz = (Class<?>)type;
		}
		// 默认数据源
		String dataSource = DataSourceContextHolder.DEFAULT_DB;
		// 判断该类是否有注解
		if(clazz.isAnnotationPresent(DB.class)){
			DB db = clazz.getAnnotation(DB.class);
			// 取出注解中的数据源名
            dataSource = db.value();
		}else{
			throw new RuntimeException(clazz + "类缺少DB注解，用于区分数据源！");
		}
		// 切换数据源
        DataSourceContextHolder.setDataSource(dataSource);
    }
    
    @After("dataSourcePointCut()")
    public void afterSwitchDS(JoinPoint point){
        DataSourceContextHolder.clearDataSource();
    }
	
}
