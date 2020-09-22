package cn.itrip.service;

import cn.itrip.beans.pojo.User;
import cn.itrip.common.Page;

/**
 * 用户业务逻辑服务层
 */
public interface UserService {

    /**
     * 分页查询用户
     * @param pageIndex
     * @param userName
     * @return
     */
    Page<User> getPageUsers(int pageIndex,String userName);



}
