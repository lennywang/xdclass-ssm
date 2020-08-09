package com.xdclass.ssm.service.impl;
/**
 * @Description: ${todo}
 * @author wll
 * @date 2020/8/8 22:55
 */

import com.xdclass.ssm.domain.User;
import com.xdclass.ssm.mapper.UserMapper;
import com.xdclass.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 **/
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public int save(User user) {
        userMapper.save(user);

        int i = 1 / 0;

        return 1;
    }
}
