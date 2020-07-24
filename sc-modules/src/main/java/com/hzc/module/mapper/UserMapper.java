package com.hzc.module.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hzc.module.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
    @Delete({
            "delete from tb_user",
            "where user_id = #{userId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String userId);

    @Insert({
            "insert into tb_user (user_id, name, ",
            "pass_word, real_name, ",
            "price_id)",
            "values (#{userId,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
            "#{passWord,jdbcType=VARCHAR}, #{realName,jdbcType=VARCHAR}, ",
            "#{priceId,jdbcType=VARCHAR})"
    })
    int insert(User record);

    int insertSelective(User record);

    @Select({
            "select",
            "user_id, name, pass_word, real_name, price_id",
            "from tb_user",
            "where user_id = #{userId,jdbcType=VARCHAR}"
    })
    @ResultMap("com.hzc.module.mapper.UserMapper.BaseResultMap")
    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User record);

    @Update({
            "update tb_user",
            "set name = #{name,jdbcType=VARCHAR},",
            "pass_word = #{passWord,jdbcType=VARCHAR},",
            "real_name = #{realName,jdbcType=VARCHAR},",
            "price_id = #{priceId,jdbcType=VARCHAR}",
            "where user_id = #{userId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(User record);

    @Select("select * from tb_user where user_id=#{uid}")
    User findById(@Param("uid") String id);
}