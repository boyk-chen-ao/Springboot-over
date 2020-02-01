package com.mybatis.code.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class FieldHouse implements Serializable {
    /**
     * 主键
     */
    private Long fieldHouseId;

    /**
     * 是否删除（0否1是）
     */
    private Integer fieldHouseIsDel;

    /**
     * 渠道id
     */
    private Long fieldHouseChannelId;

    /**
     * 标题
     */
    private String fieldHouseTitle;

    /**
     * 出租单位
     */
    private String fieldHouseRentTarget;

    /**
     * 是否园区自有产权出租（0否1是）
     */
    private Integer fieldHouseIsSelf;

    /**
     * 关联房源id
     */
    private Long fieldHouseHouseId;

    /**
     * 价格
     */
    private String fieldHousePrice;

    /**
     * 面积
     */
    private String fieldHouseArea;

    /**
     * 装修状况
     */
    private String fieldHouseFixed;

    /**
     * 起租年限
     */
    private String fieldHouseYear;

    /**
     * 场地位置
     */
    private String fieldHousePostion;

    /**
     * 场地描述
     */
    private String fieldHouseDesc;

    /**
     * 权重
     */
    private Integer fieldHouseWeight;

    /**
     * 是否发布（0否1是）
     */
    private Integer fieldHouseIsPublish;

    /**
     * 是否推荐（0否1是）
     */
    private Integer fieldHouseIsRecommend;

    /**
     * 联系人id
     */
    private Long fieldHouseContactId;

    /**
     * 创建时间
     */
    private Date fieldHouseCreateTime;

    /**
     * 创建人
     */
    private Long fieldHouseCreateId;

    /**
     * 现场图类型（1 轮播图 2 空间vr）
     */
    private Integer fieldHouseImageType;

    /**
     * 联系人类型（1内部联系人 2客户联系人）
     */
    private Integer fieldHouseContactType;

    /**
     * 客户联系人电话号码
     */
    private String fieldHouseCustomerPhone;

    /**
     * 现场图
     */
    private String fieldHouseImage;

    private static final long serialVersionUID = 1L;

    public Long getFieldHouseId() {
        return fieldHouseId;
    }

    public void setFieldHouseId(Long fieldHouseId) {
        this.fieldHouseId = fieldHouseId;
    }

    public Integer getFieldHouseIsDel() {
        return fieldHouseIsDel;
    }

    public void setFieldHouseIsDel(Integer fieldHouseIsDel) {
        this.fieldHouseIsDel = fieldHouseIsDel;
    }

    public Long getFieldHouseChannelId() {
        return fieldHouseChannelId;
    }

    public void setFieldHouseChannelId(Long fieldHouseChannelId) {
        this.fieldHouseChannelId = fieldHouseChannelId;
    }

    public String getFieldHouseTitle() {
        return fieldHouseTitle;
    }

    public void setFieldHouseTitle(String fieldHouseTitle) {
        this.fieldHouseTitle = fieldHouseTitle == null ? null : fieldHouseTitle.trim();
    }

    public String getFieldHouseRentTarget() {
        return fieldHouseRentTarget;
    }

    public void setFieldHouseRentTarget(String fieldHouseRentTarget) {
        this.fieldHouseRentTarget = fieldHouseRentTarget == null ? null : fieldHouseRentTarget.trim();
    }

    public Integer getFieldHouseIsSelf() {
        return fieldHouseIsSelf;
    }

    public void setFieldHouseIsSelf(Integer fieldHouseIsSelf) {
        this.fieldHouseIsSelf = fieldHouseIsSelf;
    }

    public Long getFieldHouseHouseId() {
        return fieldHouseHouseId;
    }

    public void setFieldHouseHouseId(Long fieldHouseHouseId) {
        this.fieldHouseHouseId = fieldHouseHouseId;
    }

    public String getFieldHousePrice() {
        return fieldHousePrice;
    }

    public void setFieldHousePrice(String fieldHousePrice) {
        this.fieldHousePrice = fieldHousePrice == null ? null : fieldHousePrice.trim();
    }

    public String getFieldHouseArea() {
        return fieldHouseArea;
    }

    public void setFieldHouseArea(String fieldHouseArea) {
        this.fieldHouseArea = fieldHouseArea == null ? null : fieldHouseArea.trim();
    }

    public String getFieldHouseFixed() {
        return fieldHouseFixed;
    }

    public void setFieldHouseFixed(String fieldHouseFixed) {
        this.fieldHouseFixed = fieldHouseFixed == null ? null : fieldHouseFixed.trim();
    }

    public String getFieldHouseYear() {
        return fieldHouseYear;
    }

    public void setFieldHouseYear(String fieldHouseYear) {
        this.fieldHouseYear = fieldHouseYear == null ? null : fieldHouseYear.trim();
    }

    public String getFieldHousePostion() {
        return fieldHousePostion;
    }

    public void setFieldHousePostion(String fieldHousePostion) {
        this.fieldHousePostion = fieldHousePostion == null ? null : fieldHousePostion.trim();
    }

    public String getFieldHouseDesc() {
        return fieldHouseDesc;
    }

    public void setFieldHouseDesc(String fieldHouseDesc) {
        this.fieldHouseDesc = fieldHouseDesc == null ? null : fieldHouseDesc.trim();
    }

    public Integer getFieldHouseWeight() {
        return fieldHouseWeight;
    }

    public void setFieldHouseWeight(Integer fieldHouseWeight) {
        this.fieldHouseWeight = fieldHouseWeight;
    }

    public Integer getFieldHouseIsPublish() {
        return fieldHouseIsPublish;
    }

    public void setFieldHouseIsPublish(Integer fieldHouseIsPublish) {
        this.fieldHouseIsPublish = fieldHouseIsPublish;
    }

    public Integer getFieldHouseIsRecommend() {
        return fieldHouseIsRecommend;
    }

    public void setFieldHouseIsRecommend(Integer fieldHouseIsRecommend) {
        this.fieldHouseIsRecommend = fieldHouseIsRecommend;
    }

    public Long getFieldHouseContactId() {
        return fieldHouseContactId;
    }

    public void setFieldHouseContactId(Long fieldHouseContactId) {
        this.fieldHouseContactId = fieldHouseContactId;
    }

    public Date getFieldHouseCreateTime() {
        return fieldHouseCreateTime;
    }

    public void setFieldHouseCreateTime(Date fieldHouseCreateTime) {
        this.fieldHouseCreateTime = fieldHouseCreateTime;
    }

    public Long getFieldHouseCreateId() {
        return fieldHouseCreateId;
    }

    public void setFieldHouseCreateId(Long fieldHouseCreateId) {
        this.fieldHouseCreateId = fieldHouseCreateId;
    }

    public Integer getFieldHouseImageType() {
        return fieldHouseImageType;
    }

    public void setFieldHouseImageType(Integer fieldHouseImageType) {
        this.fieldHouseImageType = fieldHouseImageType;
    }

    public Integer getFieldHouseContactType() {
        return fieldHouseContactType;
    }

    public void setFieldHouseContactType(Integer fieldHouseContactType) {
        this.fieldHouseContactType = fieldHouseContactType;
    }

    public String getFieldHouseCustomerPhone() {
        return fieldHouseCustomerPhone;
    }

    public void setFieldHouseCustomerPhone(String fieldHouseCustomerPhone) {
        this.fieldHouseCustomerPhone = fieldHouseCustomerPhone == null ? null : fieldHouseCustomerPhone.trim();
    }

    public String getFieldHouseImage() {
        return fieldHouseImage;
    }

    public void setFieldHouseImage(String fieldHouseImage) {
        this.fieldHouseImage = fieldHouseImage == null ? null : fieldHouseImage.trim();
    }
}