package com.mybatis.code.demo.service.impl;

import javax.annotation.Resource;

import com.mybatis.code.demo.entity.Target;
import com.mybatis.code.demo.repository.TargetRepository;
import com.mybatis.code.demo.service.TargetService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TargetServiceimpl implements TargetService {

    // @Resource是根据名称注入 @Autowired是根据类型注入
    @Resource
    private TargetRepository targetRepository;

    //添加
    @Override
    public void save(Target target) {
        this.targetRepository.save(target);
    }

    //删除
    @Override
    public void delete(Target target) {
        this.targetRepository.delete(target);
    }

    //查询
    @Override
    public List<Target> findAll(){
        return (List<Target>) this.targetRepository.findAll();
    }
}
