package com.hzc.module.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hzc.common.db.page.BasePage;
import com.hzc.common.reponse.ResponseVo;
import com.hzc.module.entity.User;

import java.util.List;

public interface UserService {

    User findById(String id);

    IPage<User> selectList(BasePage<User> basePage);

    ResponseVo saveUser(User user);
}
