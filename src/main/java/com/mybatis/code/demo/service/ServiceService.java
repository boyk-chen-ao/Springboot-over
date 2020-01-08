package com.mybatis.code.demo.service;

import java.util.List;
import java.util.Map;

/**
 * 服务接口
 * @author yyj
 *
 */
public interface ServiceService {

    /**
     *
     * 功能描述:根据条件查询服务列表
     * @param firstcategoryId 第一类目id
     * @param sellerId 卖家id
     * @param serviceName 服务名称
     * @param state 0/下架 1/上架
	 * @param channelId 渠道id
     * @author: cy
     * @date: 2018/11/15 13:57
     * @return:
     */
    List<Map<String, Object>> findByCase(Long firstcategoryId, Long sellerId, String serviceName, Integer state, Long channelId)throws Exception;

}
