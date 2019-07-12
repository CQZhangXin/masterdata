package com.yuanian.masterdata.quartzUtil;

import com.alibaba.fastjson.JSON;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * @author Zhangxin
 * @title: DisallowConcurrentQuartzJobBean
 * @projectName Quartz工具类
 * @description: 重新QuartzJobBean的executeInternal
 * @date 2019/7/8  9:57
 */
@DisallowConcurrentExecution
public class DisallowConcurrentQuartzJobBean extends QuartzJobBean {
    private String targetObject;
    private String targetMethod;
    private Map<String, Object> targetParams;

    public DisallowConcurrentQuartzJobBean() {
    }

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        try {
            Object jobTargetObject = ApplicationContextAwareUtils.getBean(this.targetObject);
            if (!CollectionUtils.isEmpty(this.targetParams)) {
                Class<?> clazz = Class.forName(this.targetParams.get("clazz").toString());
                Object object = JSON.parseObject(JSON.toJSONString(this.targetParams.get("param")), clazz);
                Method m = jobTargetObject.getClass().getMethod(this.targetMethod, clazz);
                m.invoke(jobTargetObject, object);
            } else {
                Method m = jobTargetObject.getClass().getMethod(this.targetMethod);
                m.invoke(jobTargetObject);
            }

        } catch (Exception var6) {
            throw new JobExecutionException(var6);
        }
    }

    public void setTargetObject(String targetObject) {
        this.targetObject = targetObject;
    }

    public void setTargetMethod(String targetMethod) {
        this.targetMethod = targetMethod;
    }

    public Map<String, Object> getTargetParams() {
        return this.targetParams;
    }

    public void setTargetParams(Map<String, Object> targetParams) {
        this.targetParams = targetParams;
    }
}
