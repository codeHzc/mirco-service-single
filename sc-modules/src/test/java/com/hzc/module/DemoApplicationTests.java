package com.hzc.module;

import com.hzc.module.ModuleApplication;
import com.hzc.module.entity.User;
import com.hzc.module.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private UserMapper mMapper;

    @Test
    void contextLoads() {
        User user = mMapper.selectByPrimaryKey("1528764643");
        System.out.println(user);
    }

    @Test
    void testMybatisPlus() {
        User user = mMapper.selectById("1528764643");
        System.out.println(user);
    }



}
