package com.elegant.datasource;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;

/**
 * 定义数据源的AOP切面，通过该Service的方法名判断是应该走读库还是写库
 * 
 * DataSourceAspect
 * 创建人:cool 
 * 时间：2018年1月26日-上午10:26:27 
 * @version 1.0.0
 *
 */
public class DataSourceAspect {

    /**
     * 在进入Service方法之前执行
     * 
     * @param point 切面对象
     */
    public void before(JoinPoint point) {
        // 获取到当前执行的方法名
        String methodName = point.getSignature().getName();
        if (isSlave(methodName)) {
            // 标记为读库
            DynamicDataSourceHolder.markSlave();
        } else {
            // 标记为写库
            DynamicDataSourceHolder.markMaster();
        }
    }

    /**
     * 判断是否为读库
     * TODO 这里的方法匹配采用了硬编码，这是不友好，建议使用事务策略规则进行匹配，改进这个切面的实现，但是目前已经实现了读写分离
     * 所以采用读取事物管理的策略，怎么读取呢，跟之前自己的项目中类似，后期可以shix
     * @param methodName
     * @return
     */
    private Boolean isSlave(String methodName) {
        // 方法名以query、find、get开头的方法名走从库，是在这里进行了判断是走从库还是主库
        return StringUtils.startsWithAny(methodName, "query", "find", "get", "select");
    }

}

