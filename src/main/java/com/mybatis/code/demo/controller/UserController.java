package com.mybatis.code.demo.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatis.code.demo.entity.SysUser;
import com.mybatis.code.demo.mapper.UserMapper;
import com.mybatis.code.demo.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@Slf4j
@RestController
public class UserController {

    @Autowired(required=false)
    private UserMapper userMapper;

    @GetMapping("/query")
    public Object queryById(long id){
        return userMapper.queryUserById(id);
    }

    /**
     * 测试分页
     * @return
     */
    @GetMapping("/querySysUser")
    public Object querySysUser(){
        String orderBy = "id DESC";
        PageHelper.startPage(1,10, orderBy);
        List<SysUser> sysUsers = userMapper.querySysUser();
        PageInfo<SysUser> sysUserPageInfo = new PageInfo<>(sysUsers);
        return sysUserPageInfo;
    }

    /**
     * 测试Page的返回值
     * @return
     */
    @GetMapping("/querySysUserPage")
    public Object querySysUserPage(){
        String orderBy = "id DESC";
        PageHelper.startPage(1,10, orderBy);
        Page<SysUser> sysUsers = (Page<SysUser>)userMapper.querySysUser();
        return sysUsers;
    }

    /**
     * 添加返回结果工具包测试
     * @return
     */
    @GetMapping("/querySysUserResult")
    public Object querySysUserResult(){
        PageHelper.startPage(1,10);
        Page<SysUser> sysUsers = (Page<SysUser>)userMapper.querySysUser();

        if(Objects.isNull(sysUsers)){
            log.info("========================获取返回值结果失败===========================");
            return ResultUtil.resultFail("获取返回值结果失败！",null,null);
        }
        else {
            log.info("========================获取返回值结果成功==========================="+sysUsers);
            return ResultUtil.listResult(sysUsers.getPageNum(),sysUsers.getPageSize(),(int)sysUsers.getTotal(),sysUsers.getResult());
        }
    }
}
