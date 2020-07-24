package com.hzc.module.controller;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.hzc.common.db.page.BasePage;
import com.hzc.common.reponse.ResponseVo;
import com.hzc.module.entity.User;
import com.hzc.module.mapper.UserMapper;
import com.hzc.module.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService mUserService;

    @Autowired  // 这里是不是可以改进
    private UserMapper mUserMapper;


    @GetMapping("/testUser")
    public String testUser() {
        return "hello world!!!";
    }

    @GetMapping("/getById/{id}")
    public ResponseVo findById(@PathVariable("id") String id) {
        return ResponseVo.success(mUserService.findById(id));
    }

    @GetMapping("/getAll")
    public ResponseVo findById(BasePage<User> basePage) {
//        return ResponseVo.success(mUserMapper.selectList(null));
        return ResponseVo.success(mUserService.selectList(basePage));
    }

//    添加用户
    @PostMapping("/saveUser")
    public ResponseVo saveUser(@RequestBody User user){
        System.out.println("haha");
        return mUserService.saveUser(user);
    }





}
