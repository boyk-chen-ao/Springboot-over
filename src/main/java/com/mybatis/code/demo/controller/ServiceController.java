package com.mybatis.code.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatis.code.demo.service.ServiceService;
import com.mybatis.code.demo.utils.NewResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 服务管理
 * @Author: Csa
 * @Date: 2019/12/23 17:16
 * @Description:
 */
@Controller
@Scope("prototype")
@RequestMapping("back/service")
@Slf4j
public class ServiceController {

    private final Map<String, Object> map = new HashMap<String, Object>();

    @Resource
    ServiceService serviceService;

//    @Resource
//    CategoryService categoryService;

    /**
     *
     * 功能描述:查询服务列表
     * @param pageIndex 页码
     * @param pageSize 每页显示数
     * @param serviceName 服务名称
     * @param firstcategoryId 第一类目id
     * @param sellerId 服务卖家id
     * @param session
     * @author: cy
     * @date: 2018/11/15 11:23
     * @return: java.util.Map<java.lang.String,java.lang.Object>
     */
    @RequestMapping(value = "serviceList",method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> serviceList(@RequestParam(defaultValue = "1")Integer pageIndex,
                                           @RequestParam(defaultValue = "10")Integer pageSize, String serviceName,
                                           Long firstcategoryId, Long sellerId, Integer state, HttpSession session) throws Exception {
//        Long channelId = (Long)session.getAttribute("channelId");
        Long channelId = 1L;

        if(null==channelId){
            return NewResultUtil.resultFail("缺少渠道id",0,"");
        }
        log.info("当前渠道id:{}",channelId);

        PageHelper.startPage(pageIndex,pageSize);
        List<Map<String,Object>> services = serviceService.findByCase(firstcategoryId, sellerId, serviceName,state,channelId);
//        for (int i=0;i<services.size();i++) {
//            Map<String, Object> serviceMap = services.get(i);
//            log.info("是否推荐"+serviceMap.get("serviceIsRecommend"));
//            //服务第一类目
//            Long serviceFirstcategoryId = (Long)serviceMap.get("serviceFirstcategoryId");
//            Category firstCategory = categoryService.findById(serviceFirstcategoryId);
//            if(null!=firstCategory && firstCategory.getCategoryIsDel()==0){
//                serviceMap.put("firstCategory",firstCategory.getCategoryName());
//            }else{
//                serviceMap.put("firstCategory","");
//            }
//            //服务第二类目
//            Long serviceSecondcategoryId = (Long)serviceMap.get("serviceSecondcategoryId");
//            Category secondCategory = categoryService.findById(serviceSecondcategoryId);
//            if(null!=secondCategory && secondCategory.getCategoryIsDel()==0){
//                serviceMap.put("secondCategory",secondCategory.getCategoryName());
//            }else{
//                serviceMap.put("secondCategory","");
//            }
//
//        }
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(services);
        map.put("services", services);
        map.put("pageSize", pageSize);
        map.put("pageIndex", pageIndex);
        map.put("total", pageInfo.getTotal());
        log.info("查找成功");
        if (0 != pageInfo.getPages()) {
            map.put("Pages", pageInfo.getPages());
        } else {
            map.put("Pages", 1);  //如果页码为0，则置为1
        }
        return NewResultUtil.resultSuccess("查询成功",map);
    }


}
