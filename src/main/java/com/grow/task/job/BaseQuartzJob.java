package com.grow.task.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @Auther: ghw06
 * @Date: 2019/1/23
 * @Description:
 */
public abstract class BaseQuartzJob extends QuartzJobBean {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        String className = this.getClass().getName();
        logger.info(">>>>>>>>>" + className + "run");
        processJob(jobExecutionContext);
        logger.info("<<<<<<<<<" + className + "exit");
    }

    protected abstract void processJob(JobExecutionContext jobExecutionContext) throws JobExecutionException;
}
