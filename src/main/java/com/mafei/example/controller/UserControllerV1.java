package com.mafei.example.controller;

import com.mafei.example.bean.User;
import com.mafei.example.bean.UserDTO;
import com.mafei.example.bean.UserMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserControllerV1 {

    @PostMapping
    public UserDTO index(@RequestBody User user) {
        return UserMapper.INSTANCE.userDTOToUser(user);
    }

}
