package cn.itrip.dao;

import cn.itrip.beans.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * 用户的数据访问接口
 */
public interface UserMapper {

    /**
     * 根据参数查询用户（分页查询）
     * @param params
     * @return
     */
    List<User> getUsersByParams(Map<String,Object> params);

    /**
     *
     * @param params
     * @return
     */
    int getUserCountByParams(Map<String,Object> params);
}
