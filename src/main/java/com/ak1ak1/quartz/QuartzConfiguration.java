package com.ak1ak1.quartz;

import org.quartz.Trigger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import com.ak1ak1.timedtask.RequireUpdate;

@Configuration
public class QuartzConfiguration {

	// 配置定时任务
	@Bean(name = "firstJobDetail")
	public MethodInvokingJobDetailFactoryBean firstJobDetail(RequireUpdate requireUpdate){
		MethodInvokingJobDetailFactoryBean jobDtl = new MethodInvokingJobDetailFactoryBean();
		// 是否并发执行
		jobDtl.setConcurrent(false);
		jobDtl.setTargetObject(requireUpdate);
		// 为需要执行的实体类对应的对象
		jobDtl.setTargetMethod("update");
		return jobDtl;
	}
	
	// 配置触发器
	@Bean(name = "firstTrigger")
	public CronTriggerFactoryBean  firstTrigger(MethodInvokingJobDetailFactoryBean jobDetail){
		CronTriggerFactoryBean trigger = new CronTriggerFactoryBean();
		trigger.setJobDetail(jobDetail.getObject());
		// 设置任务启动延迟
		trigger.setStartDelay(0);
		// 启动时间为每天凌晨三点
		trigger.setCronExpression("0 00 03 * * ?");// 执行时间
		return trigger;
	}
	
	// 配置Scheduler
	@Bean(name = "scheduler")
    public SchedulerFactoryBean schedulerFactory(Trigger cronJobTrigger) {
        SchedulerFactoryBean bean = new SchedulerFactoryBean();  
        // 延时启动，应用启动1秒后
        bean.setStartupDelay(1);  
        // 注册触发器
        bean.setTriggers(cronJobTrigger);
        return bean;
    }  
}
