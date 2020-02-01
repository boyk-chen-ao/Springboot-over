package com.mybatis.code.demo.controller;

import com.mybatis.code.demo.entity.Target;
import com.mybatis.code.demo.service.TargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JpaController {

    @Autowired
    private TargetService targetService;

    //添加
    @GetMapping("/save")
    public void save() {
        Target target = new Target();
        target.setTname("减肥");
        this.targetService.save(target);
    }

    //删除
    @GetMapping("/delete")
    public void delete( Integer id) {
        Target target = new Target();
        target.setTid(id);
        this.targetService.delete(target);
    }

    //查询所有
    @GetMapping("/findAll")
    public List<Target> findAll() {
        return this.targetService.findAll();
    }
}
