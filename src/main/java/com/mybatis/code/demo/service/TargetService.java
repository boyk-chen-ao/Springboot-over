package com.mybatis.code.demo.service;

import com.mybatis.code.demo.entity.Target;
import java.util.List;

public interface TargetService {
    public void save(Target target);
    public void delete(Target target);
    public List<Target> findAll();
}
