package cn.itrip.service.Impl;

import cn.itrip.beans.pojo.User;
import cn.itrip.common.Page;
import cn.itrip.dao.UserMapper;
import cn.itrip.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;


    @Override
    public Page<User> getPageUsers(int pageIndex,  String userName) {
        int pageSize = 5;//页大小
        //封装查询条件
        Map<String,Object> params = new HashMap<>();
        params.put("userName",userName);
        params.put("from",(pageIndex-1)*pageSize);
        params.put("limit",pageSize);
        //查询满足条件的用户集合的个数
        List<User> users = userMapper.getUsersByParams(params);
        int totalCount = userMapper.getUserCountByParams(params);
        //封装查询结果
        Page<User> pageUsers = new Page<>(pageIndex,pageSize,totalCount,users);
        return pageUsers;
    }
}
