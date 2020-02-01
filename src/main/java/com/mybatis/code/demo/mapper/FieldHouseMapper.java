package com.mybatis.code.demo.mapper;

import com.mybatis.code.demo.entity.FieldHouse;
import com.mybatis.code.demo.entity.FieldHouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FieldHouseMapper {
    long countByExample(FieldHouseExample example);

    int deleteByExample(FieldHouseExample example);

    int deleteByPrimaryKey(Long fieldHouseId);

    int insert(FieldHouse record);

    int insertSelective(FieldHouse record);

    List<FieldHouse> selectByExampleWithBLOBs(FieldHouseExample example);

    List<FieldHouse> selectByExample(FieldHouseExample example);

    FieldHouse selectByPrimaryKey(Long fieldHouseId);

    int updateByExampleSelective(@Param("record") FieldHouse record, @Param("example") FieldHouseExample example);

    int updateByExampleWithBLOBs(@Param("record") FieldHouse record, @Param("example") FieldHouseExample example);

    int updateByExample(@Param("record") FieldHouse record, @Param("example") FieldHouseExample example);

    int updateByPrimaryKeySelective(FieldHouse record);

    int updateByPrimaryKeyWithBLOBs(FieldHouse record);

    int updateByPrimaryKey(FieldHouse record);
}