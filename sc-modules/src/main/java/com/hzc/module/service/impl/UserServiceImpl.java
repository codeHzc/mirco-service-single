package com.hzc.module.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzc.common.db.page.BasePage;
import com.hzc.common.entitybefore.EntityBefore;
import com.hzc.common.reponse.ResponseVo;
import com.hzc.module.entity.User;
import com.hzc.module.mapper.UserMapper;
import com.hzc.module.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mUserMapper;

    @Override
    public User findById(String id) {
        return mUserMapper.findById(id);
    }

    @Override
    public IPage<User> selectList(BasePage<User> basePage) {
//        QueryWrapper wrapper = new QueryWrapper();
//        wrapper.orderByDesc("user_id");
//        IPage<User> page = new Page<User>(1,5);
        basePage.setRecords(mUserMapper.selectList(null));
//        return mUserMapper.selectPage(page,wrapper);
        return basePage;
    }

    @Override
    public ResponseVo saveUser(User user) {
        EntityBefore.beforInsert(user,"saveUser");
        System.out.println(user);
        return ResponseVo.success(mUserMapper.insert(user));
    }


}
