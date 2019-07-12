package com.yuanian.masterdata.quartzUtil;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author Zhangxin
 * @title: ApplicationContextAwareUtils
 * @projectName masterdata
 * @description: 获取bean
 * @date 2019/7/8  10:05
 */
@Component
public class ApplicationContextAwareUtils implements ApplicationContextAware  {
    private static ApplicationContext context;

    public ApplicationContextAwareUtils() {
    }

    @Override
    public void setApplicationContext(ApplicationContext context) {
        ApplicationContextAwareUtils.context = context;
    }

    //获取applicationContext
    public static ApplicationContext getApplicationContext() {
        return context;
    }

    //通过class获取Bean.
    public static <T> T getBean(Class<T> clazz) {
        return getApplicationContext().getBean(clazz);
    }

    //通过name获取 Bean.
    public static Object getBean(String name) {
        return getApplicationContext().getBean(name);
    }

    //通过name,以及Clazz返回指定的Bean
    public static <T> T getBean(String name, Class<T> clazz) {
        return getApplicationContext().getBean(name, clazz);
    }


}
