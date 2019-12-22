package com.mybatis.code.demo.mapper;

import com.mybatis.code.demo.entity.SysUser;
import com.mybatis.code.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User queryUserById(@Param(value = "id") long id);

    @Select("select * from sys_user")
    List<SysUser> querySysUser();

    int insertUser(SysUser sysUser);

    int deleteById(Long id);
}
