package com.mybatis.code.demo.controller.justtest;

import com.mybatis.code.demo.entity.FieldHouse;
import com.mybatis.code.demo.entity.FieldHouseExample;
import com.mybatis.code.demo.mapper.FieldHouseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 使用Example查询能解决大部分复杂的单表操作，从一定程度上能减少工作量。
 * 但是建议在条件很多并且判断很多的情况下，避免使用Example查询。这种情况下，使用XML方式会更有效。
 * selectByExample
 * deleteByExample
 * countByExample
 * updateByExampleSelective(updateByExample)
 */
@RestController
public class ExampleController {

    @Autowired
    private FieldHouseMapper fieldHouseMapper;

    /**
     * selectByExample
     */
    @GetMapping("/selectByExample")
    public Map<String,Object> selectByExample(){
        // 创建Example对象
        FieldHouseExample example = new FieldHouseExample();
        // 创建条件
        FieldHouseExample.Criteria criteria = example.createCriteria();

        // 添加条件
        criteria.andFieldHouseIsDelEqualTo(0);

        // 进行检索
        List<FieldHouse> fieldHouses = fieldHouseMapper.selectByExample(example);

        Map<String,Object> map = new HashMap<>();
        map.put("data",fieldHouses);
        return map;
    }

    /**
     * updateByExampleSelective
     */
    @GetMapping("/updateByExampleSelective")
    public String updateByExampleSelective(){
        FieldHouseExample example = new FieldHouseExample();
        FieldHouseExample.Criteria criteria = example.createCriteria();
        criteria.andFieldHouseIdEqualTo(31L);

        FieldHouse fieldHouse = new FieldHouse();
        fieldHouse.setFieldHouseTitle("你是猪哈哈哈");

        fieldHouseMapper.updateByExampleSelective(fieldHouse,example);

        return "修改成功！";
    }

    /**
     * deleteByExample
     */
    @GetMapping("/deleteByExample")
    public String deleteByExample(){
        FieldHouseExample example = new FieldHouseExample();
        FieldHouseExample.Criteria criteria = example.createCriteria();
        criteria.andFieldHouseIdEqualTo(30L);

        fieldHouseMapper.deleteByExample(example);

        return "删除成功！";
    }

    /**
     * countByExample
     */
    @GetMapping("/countByExampleMybatis")
    public String countByExampleMybatis(){
        FieldHouseExample example = new FieldHouseExample();
        FieldHouseExample.Criteria criteria = example.createCriteria();
        criteria.andFieldHouseIdGreaterThan(24L);

        return String.valueOf(fieldHouseMapper.countByExample(example));
    }

}
