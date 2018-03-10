package com.elegant.common.model;

/**
 * 
 * Const
 * 创建人:cool-狼 
 * 时间：2018年2月23日-下午5:10:50 
 * @version 1.0.0
 *
 */
public class Const {

    public static final String CURRENT_USER = "currentUser";

    public static final String USERNAME = "username";

    public static final String BEGIN_FLAG = "begin";

    public static final String END_FLAG = "end";

    public interface Role {
        int ROLE_CUSTOMER = 0; // 普通用户

        int ROLE_ADMIN = 1; // 管理员
    }

}
