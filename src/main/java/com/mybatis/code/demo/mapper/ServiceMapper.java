package com.mybatis.code.demo.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ServiceMapper {

    /**
     *
     * 功能描述:
     * @param categoryId 第一类目id
     * @param sellerId 卖家id
     * @param serviceName 服务名称
     * @author: cy
     * @date: 2018/11/15 11:34
     * @return:
     */
    List<Map<String,Object>> findByCase(@Param("categoryId") Long categoryId, @Param("sellerId") Long sellerId,
                                        @Param("serviceName") String serviceName, @Param("state") Integer state, @Param("channelId") Long channelId);

}