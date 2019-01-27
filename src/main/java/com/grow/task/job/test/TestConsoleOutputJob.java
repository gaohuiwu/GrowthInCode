package com.grow.task.job.test;

import com.grow.task.job.BaseQuartzJob;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;

/**
 * @Auther: ghw06
 * @Date: 2019/1/23
 * @Description:
 */
@DisallowConcurrentExecution
@PersistJobDataAfterExecution
public class TestConsoleOutputJob  extends BaseQuartzJob {

    @Override
    protected void processJob(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        logger.info("===========>>>>>>>>>>>>>>>我是一个测试定时任务的输入而已！！！！！！！！！！！！");
    }
}
