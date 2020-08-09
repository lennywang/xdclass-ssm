package com.xdclass.ssm.controller;
/**
 * @Description: ${todo}
 * @author wll
 * @date 2020/8/8 22:48
 */

import com.xdclass.ssm.domain.User;
import com.xdclass.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 *
 **/
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/save")
    public User save(){
        User user = new User();
        user.setName("wll");
        user.setPhone(UUID.randomUUID().toString());
        userService.save(user);

        return user;
    }


}
