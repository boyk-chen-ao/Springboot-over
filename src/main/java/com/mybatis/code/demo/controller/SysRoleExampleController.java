package com.mybatis.code.demo.controller;

import com.mybatis.code.demo.entity.SysRole;
import com.mybatis.code.demo.entity.SysRoleExample;
import com.mybatis.code.demo.mapper.SysRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SysRoleExampleController {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    /**
     * 通过条件进行单表查询
     * @return
     */
    @GetMapping("/querySysRoleExample")
    public Object querySysRoleExample(){

        SysRoleExample example = new SysRoleExample();

        // 设直排序规则
        example.setOrderByClause("id desc");
        // 设直是否 distinct 去重
        example .setDistinct(true);

        // 创建条件
        SysRoleExample.Criteria criteria = example.createCriteria();
        //id >= 2
        criteria.andIdGreaterThanOrEqualTo(2L);
        // role_name like "%d%"
        criteria.andRoleNameLike("%d%");

        List<SysRole> sysRoles = sysRoleMapper.selectByExample(example);

        return sysRoles;
    }

    /**
     * 按照条件批量更新
     * updateByExampleSelective
     * 与 UPDATE 相关的有两个方法，分别为 updateByExample 和 updateByExampleSelective 这两个方法的区别是，当对象的属性为空时，第一个方法会将值更新为 null ，第二个方法不会更新 null 属性的字段。
     * @return
     */
    @GetMapping("/updateSysRoleExample")
    public Object updateSysRoleExample(){

        SysRoleExample example = new SysRoleExample();

        // 创建条件
        SysRoleExample.Criteria criteria = example.createCriteria();
        // 更新所有id >= 2的数据
        criteria.andIdGreaterThanOrEqualTo(2L);

        // 创建要设置的对象
        SysRole sysRole = new SysRole();
        // 将创建人create_by 改为 "2"
        sysRole.setCreateBy(2L);

        // 更新操作
        sysRoleMapper.updateByExampleSelective(sysRole,example);

        // 再进行查询操作
        List<SysRole> sysRoles = sysRoleMapper.selectByExample(example);

        return sysRoles;
    }

    /**
     * 通过条件进行批量删除
     * @return
     */
    @GetMapping("/deleteSysRoleExample")
    public Object deleteSysRoleExample(){

        SysRoleExample example = new SysRoleExample();

        // 创建条件
        SysRoleExample.Criteria criteria = example.createCriteria();
        // 删除所有id <= 3的数据
        criteria.andIdLessThanOrEqualTo(3l);

        // 删除操作
        sysRoleMapper.deleteByExample(example);

        // 再进行查询操作
        List<SysRole> sysRoles = sysRoleMapper.selectByExample(example);

        return sysRoles;
    }

    /**
     * 通过条件进行获取总数
     * @return
     */
    @GetMapping("/countByExample")
    public Object countByExample(){

        SysRoleExample example = new SysRoleExample();

        // 创建条件
        SysRoleExample.Criteria criteria = example.createCriteria();
        // 删除所有id <= 4的数据
        criteria.andIdLessThanOrEqualTo(4l);

        // 再进行查询操作
        Long num = sysRoleMapper.countByExample(example);

        return num;
    }
}
