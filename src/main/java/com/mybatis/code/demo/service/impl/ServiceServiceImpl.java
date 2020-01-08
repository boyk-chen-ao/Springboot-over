package com.mybatis.code.demo.service.impl;

import com.mybatis.code.demo.mapper.ServiceMapper;
import com.mybatis.code.demo.service.ServiceService;


import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Service("serviceService")
public class ServiceServiceImpl implements ServiceService {

	@Resource
	ServiceMapper serviceMapper;

	@Override
	public List<Map<String, Object>> findByCase(Long categoryId, Long sellerId, String serviceName,Integer state,Long channelId){

		return serviceMapper.findByCase(categoryId,sellerId,serviceName,state,channelId);
	}

}
