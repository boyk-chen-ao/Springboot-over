package com.mybatis.code.demo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 服务表
 * Service
 * 数据库表：service
 */
public class Service implements Serializable {

    /**
     * 主键
     * 表字段 : service.service_id
     */
    private Long serviceId;

    /**
     * 服务名称
     * 表字段 : service.service_name
     */
    private String serviceName;

    /**
     * 卖家ID
     * 表字段 : service.service_seller_id
     */
    private Long serviceSellerId;

    /**
     * 服务一级类别
     * 表字段 : service.service_firstcategory_id
     */
    private Long serviceFirstcategoryId;

    /**
     * 是否需要定金（0/不需要 1/需要）
     * 表字段 : service.service_ifdeposit
     */
    private Integer serviceIfdeposit;

    /**
     * 服务二级类别
     * 表字段 : service.service_secondcategory_id
     */
    private Long serviceSecondcategoryId;

    /**
     * 服务状态（0/下架  1/上架 ）
     * 表字段 : service.service_state
     */
    private Integer serviceState;

    /**
     * 服务评分
     * 表字段 : service.service_rate
     */
    private Double serviceRate;

    /**
     * 服务销量
     * 表字段 : service.service_sales
     */
    private Integer serviceSales;

    /**
     * 创建人id
     * 表字段 : service.service_create_id
     */
    private Long serviceCreateId;

    /**
     * 创建时间
     * 表字段 : service.service_create_time
     */
    private Date serviceCreateTime;

    /**
     * 更新人id
     * 表字段 : service.service_update_id
     */
    private Long serviceUpdateId;

    /**
     * 更新时间
     * 表字段 : service.service_update_time
     */
    private Date serviceUpdateTime;

    /**
     * 服务封面图片
     * 表字段 : service.service_cover
     */
    private String serviceCover;

    /**
     * 软删除标志（0未删除，1删除）
     * 表字段 : service.service_is_del
     */
    private Integer serviceIsDel;

    /**
     * 一级权重
     * 表字段 : service.service_first_sort
     */
    private Integer serviceFirstSort;

    /**
     * 二级权重
     * 表字段 : service.service_second_sort
     */
    private Integer serviceSecondSort;

    /**
     * 是否推荐（0/不推荐 1/推荐）
     * 表字段 : service.service_is_recommend
     */
    private Boolean serviceIsRecommend;

    /**
     * 展示价格
     * 表字段 : service.service_show_price
     */
    private String serviceShowPrice;

    /**
     * 服务编号
     * 表字段 : service.service_no
     */
    private String serviceNo;

    /**
     * 渠道id
     * 表字段 : service.service_channel_id
     */
    private Long serviceChannelId;

    /**
     * 服务内容
     * 表字段 : service.service_content
     */
    private String serviceContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table service
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 主键 字段:service.service_id
     *
     * @return service.service_id, 主键
     */
    public Long getServiceId() {
        return serviceId;
    }

    /**
     * 设置 主键 字段:service.service_id
     *
     * @param serviceId the value for service.service_id, 主键
     */
    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * 获取 服务名称 字段:service.service_name
     *
     * @return service.service_name, 服务名称
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * 设置 服务名称 字段:service.service_name
     *
     * @param serviceName the value for service.service_name, 服务名称
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    /**
     * 获取 卖家ID 字段:service.service_seller_id
     *
     * @return service.service_seller_id, 卖家ID
     */
    public Long getServiceSellerId() {
        return serviceSellerId;
    }

    /**
     * 设置 卖家ID 字段:service.service_seller_id
     *
     * @param serviceSellerId the value for service.service_seller_id, 卖家ID
     */
    public void setServiceSellerId(Long serviceSellerId) {
        this.serviceSellerId = serviceSellerId;
    }

    /**
     * 获取 服务一级类别 字段:service.service_firstcategory_id
     *
     * @return service.service_firstcategory_id, 服务一级类别
     */
    public Long getServiceFirstcategoryId() {
        return serviceFirstcategoryId;
    }

    /**
     * 设置 服务一级类别 字段:service.service_firstcategory_id
     *
     * @param serviceFirstcategoryId the value for service.service_firstcategory_id, 服务一级类别
     */
    public void setServiceFirstcategoryId(Long serviceFirstcategoryId) {
        this.serviceFirstcategoryId = serviceFirstcategoryId;
    }

    /**
     * 获取 是否需要定金（0/不需要 1/需要） 字段:service.service_ifdeposit
     *
     * @return service.service_ifdeposit, 是否需要定金（0/不需要 1/需要）
     */
    public Integer getServiceIfdeposit() {
        return serviceIfdeposit;
    }

    /**
     * 设置 是否需要定金（0/不需要 1/需要） 字段:service.service_ifdeposit
     *
     * @param serviceIfdeposit the value for service.service_ifdeposit, 是否需要定金（0/不需要 1/需要）
     */
    public void setServiceIfdeposit(Integer serviceIfdeposit) {
        this.serviceIfdeposit = serviceIfdeposit;
    }

    /**
     * 获取 服务二级类别 字段:service.service_secondcategory_id
     *
     * @return service.service_secondcategory_id, 服务二级类别
     */
    public Long getServiceSecondcategoryId() {
        return serviceSecondcategoryId;
    }

    /**
     * 设置 服务二级类别 字段:service.service_secondcategory_id
     *
     * @param serviceSecondcategoryId the value for service.service_secondcategory_id, 服务二级类别
     */
    public void setServiceSecondcategoryId(Long serviceSecondcategoryId) {
        this.serviceSecondcategoryId = serviceSecondcategoryId;
    }

    /**
     * 获取 服务状态（0/下架  1/上架 ） 字段:service.service_state
     *
     * @return service.service_state, 服务状态（0/下架  1/上架 ）
     */
    public Integer getServiceState() {
        return serviceState;
    }

    /**
     * 设置 服务状态（0/下架  1/上架 ） 字段:service.service_state
     *
     * @param serviceState the value for service.service_state, 服务状态（0/下架  1/上架 ）
     */
    public void setServiceState(Integer serviceState) {
        this.serviceState = serviceState;
    }

    /**
     * 获取 服务评分 字段:service.service_rate
     *
     * @return service.service_rate, 服务评分
     */
    public Double getServiceRate() {
        return serviceRate;
    }

    /**
     * 设置 服务评分 字段:service.service_rate
     *
     * @param serviceRate the value for service.service_rate, 服务评分
     */
    public void setServiceRate(Double serviceRate) {
        this.serviceRate = serviceRate;
    }

    /**
     * 获取 服务销量 字段:service.service_sales
     *
     * @return service.service_sales, 服务销量
     */
    public Integer getServiceSales() {
        return serviceSales;
    }

    /**
     * 设置 服务销量 字段:service.service_sales
     *
     * @param serviceSales the value for service.service_sales, 服务销量
     */
    public void setServiceSales(Integer serviceSales) {
        this.serviceSales = serviceSales;
    }

    /**
     * 获取 创建人id 字段:service.service_create_id
     *
     * @return service.service_create_id, 创建人id
     */
    public Long getServiceCreateId() {
        return serviceCreateId;
    }

    /**
     * 设置 创建人id 字段:service.service_create_id
     *
     * @param serviceCreateId the value for service.service_create_id, 创建人id
     */
    public void setServiceCreateId(Long serviceCreateId) {
        this.serviceCreateId = serviceCreateId;
    }

    /**
     * 获取 创建时间 字段:service.service_create_time
     *
     * @return service.service_create_time, 创建时间
     */
    public Date getServiceCreateTime() {
        return serviceCreateTime;
    }

    /**
     * 设置 创建时间 字段:service.service_create_time
     *
     * @param serviceCreateTime the value for service.service_create_time, 创建时间
     */
    public void setServiceCreateTime(Date serviceCreateTime) {
        this.serviceCreateTime = serviceCreateTime;
    }

    /**
     * 获取 更新人id 字段:service.service_update_id
     *
     * @return service.service_update_id, 更新人id
     */
    public Long getServiceUpdateId() {
        return serviceUpdateId;
    }

    /**
     * 设置 更新人id 字段:service.service_update_id
     *
     * @param serviceUpdateId the value for service.service_update_id, 更新人id
     */
    public void setServiceUpdateId(Long serviceUpdateId) {
        this.serviceUpdateId = serviceUpdateId;
    }

    /**
     * 获取 更新时间 字段:service.service_update_time
     *
     * @return service.service_update_time, 更新时间
     */
    public Date getServiceUpdateTime() {
        return serviceUpdateTime;
    }

    /**
     * 设置 更新时间 字段:service.service_update_time
     *
     * @param serviceUpdateTime the value for service.service_update_time, 更新时间
     */
    public void setServiceUpdateTime(Date serviceUpdateTime) {
        this.serviceUpdateTime = serviceUpdateTime;
    }

    /**
     * 获取 服务封面图片 字段:service.service_cover
     *
     * @return service.service_cover, 服务封面图片
     */
    public String getServiceCover() {
        return serviceCover;
    }

    /**
     * 设置 服务封面图片 字段:service.service_cover
     *
     * @param serviceCover the value for service.service_cover, 服务封面图片
     */
    public void setServiceCover(String serviceCover) {
        this.serviceCover = serviceCover == null ? null : serviceCover.trim();
    }

    /**
     * 获取 软删除标志（0未删除，1删除） 字段:service.service_is_del
     *
     * @return service.service_is_del, 软删除标志（0未删除，1删除）
     */
    public Integer getServiceIsDel() {
        return serviceIsDel;
    }

    /**
     * 设置 软删除标志（0未删除，1删除） 字段:service.service_is_del
     *
     * @param serviceIsDel the value for service.service_is_del, 软删除标志（0未删除，1删除）
     */
    public void setServiceIsDel(Integer serviceIsDel) {
        this.serviceIsDel = serviceIsDel;
    }

    /**
     * 获取 一级权重 字段:service.service_first_sort
     *
     * @return service.service_first_sort, 一级权重
     */
    public Integer getServiceFirstSort() {
        return serviceFirstSort;
    }

    /**
     * 设置 一级权重 字段:service.service_first_sort
     *
     * @param serviceFirstSort the value for service.service_first_sort, 一级权重
     */
    public void setServiceFirstSort(Integer serviceFirstSort) {
        this.serviceFirstSort = serviceFirstSort;
    }

    /**
     * 获取 二级权重 字段:service.service_second_sort
     *
     * @return service.service_second_sort, 二级权重
     */
    public Integer getServiceSecondSort() {
        return serviceSecondSort;
    }

    /**
     * 设置 二级权重 字段:service.service_second_sort
     *
     * @param serviceSecondSort the value for service.service_second_sort, 二级权重
     */
    public void setServiceSecondSort(Integer serviceSecondSort) {
        this.serviceSecondSort = serviceSecondSort;
    }

    /**
     * 获取 是否推荐（0/不推荐 1/推荐） 字段:service.service_is_recommend
     *
     * @return service.service_is_recommend, 是否推荐（0/不推荐 1/推荐）
     */
    public Boolean getServiceIsRecommend() {
        return serviceIsRecommend;
    }

    /**
     * 设置 是否推荐（0/不推荐 1/推荐） 字段:service.service_is_recommend
     *
     * @param serviceIsRecommend the value for service.service_is_recommend, 是否推荐（0/不推荐 1/推荐）
     */
    public void setServiceIsRecommend(Boolean serviceIsRecommend) {
        this.serviceIsRecommend = serviceIsRecommend;
    }

    /**
     * 获取 展示价格 字段:service.service_show_price
     *
     * @return service.service_show_price, 展示价格
     */
    public String getServiceShowPrice() {
        return serviceShowPrice;
    }

    /**
     * 设置 展示价格 字段:service.service_show_price
     *
     * @param serviceShowPrice the value for service.service_show_price, 展示价格
     */
    public void setServiceShowPrice(String serviceShowPrice) {
        this.serviceShowPrice = serviceShowPrice == null ? null : serviceShowPrice.trim();
    }

    /**
     * 获取 服务编号 字段:service.service_no
     *
     * @return service.service_no, 服务编号
     */
    public String getServiceNo() {
        return serviceNo;
    }

    /**
     * 设置 服务编号 字段:service.service_no
     *
     * @param serviceNo the value for service.service_no, 服务编号
     */
    public void setServiceNo(String serviceNo) {
        this.serviceNo = serviceNo == null ? null : serviceNo.trim();
    }

    /**
     * 获取 渠道id 字段:service.service_channel_id
     *
     * @return service.service_channel_id, 渠道id
     */
    public Long getServiceChannelId() {
        return serviceChannelId;
    }

    /**
     * 设置 渠道id 字段:service.service_channel_id
     *
     * @param serviceChannelId the value for service.service_channel_id, 渠道id
     */
    public void setServiceChannelId(Long serviceChannelId) {
        this.serviceChannelId = serviceChannelId;
    }

    /**
     * 获取 服务内容 字段:service.service_content
     *
     * @return service.service_content, 服务内容
     */
    public String getServiceContent() {
        return serviceContent;
    }

    /**
     * 设置 服务内容 字段:service.service_content
     *
     * @param serviceContent the value for service.service_content, 服务内容
     */
    public void setServiceContent(String serviceContent) {
        this.serviceContent = serviceContent == null ? null : serviceContent.trim();
    }
}