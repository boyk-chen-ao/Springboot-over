package com.mybatis.code.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FieldHouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FieldHouseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFieldHouseIdIsNull() {
            addCriterion("field_house_id is null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIdIsNotNull() {
            addCriterion("field_house_id is not null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIdEqualTo(Long value) {
            addCriterion("field_house_id =", value, "fieldHouseId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIdNotEqualTo(Long value) {
            addCriterion("field_house_id <>", value, "fieldHouseId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIdGreaterThan(Long value) {
            addCriterion("field_house_id >", value, "fieldHouseId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("field_house_id >=", value, "fieldHouseId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIdLessThan(Long value) {
            addCriterion("field_house_id <", value, "fieldHouseId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIdLessThanOrEqualTo(Long value) {
            addCriterion("field_house_id <=", value, "fieldHouseId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIdIn(List<Long> values) {
            addCriterion("field_house_id in", values, "fieldHouseId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIdNotIn(List<Long> values) {
            addCriterion("field_house_id not in", values, "fieldHouseId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIdBetween(Long value1, Long value2) {
            addCriterion("field_house_id between", value1, value2, "fieldHouseId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIdNotBetween(Long value1, Long value2) {
            addCriterion("field_house_id not between", value1, value2, "fieldHouseId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsDelIsNull() {
            addCriterion("field_house_is_del is null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsDelIsNotNull() {
            addCriterion("field_house_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsDelEqualTo(Integer value) {
            addCriterion("field_house_is_del =", value, "fieldHouseIsDel");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsDelNotEqualTo(Integer value) {
            addCriterion("field_house_is_del <>", value, "fieldHouseIsDel");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsDelGreaterThan(Integer value) {
            addCriterion("field_house_is_del >", value, "fieldHouseIsDel");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("field_house_is_del >=", value, "fieldHouseIsDel");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsDelLessThan(Integer value) {
            addCriterion("field_house_is_del <", value, "fieldHouseIsDel");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("field_house_is_del <=", value, "fieldHouseIsDel");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsDelIn(List<Integer> values) {
            addCriterion("field_house_is_del in", values, "fieldHouseIsDel");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsDelNotIn(List<Integer> values) {
            addCriterion("field_house_is_del not in", values, "fieldHouseIsDel");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsDelBetween(Integer value1, Integer value2) {
            addCriterion("field_house_is_del between", value1, value2, "fieldHouseIsDel");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("field_house_is_del not between", value1, value2, "fieldHouseIsDel");
            return (Criteria) this;
        }

        public Criteria andFieldHouseChannelIdIsNull() {
            addCriterion("field_house_channel_id is null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseChannelIdIsNotNull() {
            addCriterion("field_house_channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseChannelIdEqualTo(Long value) {
            addCriterion("field_house_channel_id =", value, "fieldHouseChannelId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseChannelIdNotEqualTo(Long value) {
            addCriterion("field_house_channel_id <>", value, "fieldHouseChannelId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseChannelIdGreaterThan(Long value) {
            addCriterion("field_house_channel_id >", value, "fieldHouseChannelId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseChannelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("field_house_channel_id >=", value, "fieldHouseChannelId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseChannelIdLessThan(Long value) {
            addCriterion("field_house_channel_id <", value, "fieldHouseChannelId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseChannelIdLessThanOrEqualTo(Long value) {
            addCriterion("field_house_channel_id <=", value, "fieldHouseChannelId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseChannelIdIn(List<Long> values) {
            addCriterion("field_house_channel_id in", values, "fieldHouseChannelId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseChannelIdNotIn(List<Long> values) {
            addCriterion("field_house_channel_id not in", values, "fieldHouseChannelId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseChannelIdBetween(Long value1, Long value2) {
            addCriterion("field_house_channel_id between", value1, value2, "fieldHouseChannelId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseChannelIdNotBetween(Long value1, Long value2) {
            addCriterion("field_house_channel_id not between", value1, value2, "fieldHouseChannelId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseTitleIsNull() {
            addCriterion("field_house_title is null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseTitleIsNotNull() {
            addCriterion("field_house_title is not null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseTitleEqualTo(String value) {
            addCriterion("field_house_title =", value, "fieldHouseTitle");
            return (Criteria) this;
        }

        public Criteria andFieldHouseTitleNotEqualTo(String value) {
            addCriterion("field_house_title <>", value, "fieldHouseTitle");
            return (Criteria) this;
        }

        public Criteria andFieldHouseTitleGreaterThan(String value) {
            addCriterion("field_house_title >", value, "fieldHouseTitle");
            return (Criteria) this;
        }

        public Criteria andFieldHouseTitleGreaterThanOrEqualTo(String value) {
            addCriterion("field_house_title >=", value, "fieldHouseTitle");
            return (Criteria) this;
        }

        public Criteria andFieldHouseTitleLessThan(String value) {
            addCriterion("field_house_title <", value, "fieldHouseTitle");
            return (Criteria) this;
        }

        public Criteria andFieldHouseTitleLessThanOrEqualTo(String value) {
            addCriterion("field_house_title <=", value, "fieldHouseTitle");
            return (Criteria) this;
        }

        public Criteria andFieldHouseTitleLike(String value) {
            addCriterion("field_house_title like", value, "fieldHouseTitle");
            return (Criteria) this;
        }

        public Criteria andFieldHouseTitleNotLike(String value) {
            addCriterion("field_house_title not like", value, "fieldHouseTitle");
            return (Criteria) this;
        }

        public Criteria andFieldHouseTitleIn(List<String> values) {
            addCriterion("field_house_title in", values, "fieldHouseTitle");
            return (Criteria) this;
        }

        public Criteria andFieldHouseTitleNotIn(List<String> values) {
            addCriterion("field_house_title not in", values, "fieldHouseTitle");
            return (Criteria) this;
        }

        public Criteria andFieldHouseTitleBetween(String value1, String value2) {
            addCriterion("field_house_title between", value1, value2, "fieldHouseTitle");
            return (Criteria) this;
        }

        public Criteria andFieldHouseTitleNotBetween(String value1, String value2) {
            addCriterion("field_house_title not between", value1, value2, "fieldHouseTitle");
            return (Criteria) this;
        }

        public Criteria andFieldHouseRentTargetIsNull() {
            addCriterion("field_house_rent_target is null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseRentTargetIsNotNull() {
            addCriterion("field_house_rent_target is not null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseRentTargetEqualTo(String value) {
            addCriterion("field_house_rent_target =", value, "fieldHouseRentTarget");
            return (Criteria) this;
        }

        public Criteria andFieldHouseRentTargetNotEqualTo(String value) {
            addCriterion("field_house_rent_target <>", value, "fieldHouseRentTarget");
            return (Criteria) this;
        }

        public Criteria andFieldHouseRentTargetGreaterThan(String value) {
            addCriterion("field_house_rent_target >", value, "fieldHouseRentTarget");
            return (Criteria) this;
        }

        public Criteria andFieldHouseRentTargetGreaterThanOrEqualTo(String value) {
            addCriterion("field_house_rent_target >=", value, "fieldHouseRentTarget");
            return (Criteria) this;
        }

        public Criteria andFieldHouseRentTargetLessThan(String value) {
            addCriterion("field_house_rent_target <", value, "fieldHouseRentTarget");
            return (Criteria) this;
        }

        public Criteria andFieldHouseRentTargetLessThanOrEqualTo(String value) {
            addCriterion("field_house_rent_target <=", value, "fieldHouseRentTarget");
            return (Criteria) this;
        }

        public Criteria andFieldHouseRentTargetLike(String value) {
            addCriterion("field_house_rent_target like", value, "fieldHouseRentTarget");
            return (Criteria) this;
        }

        public Criteria andFieldHouseRentTargetNotLike(String value) {
            addCriterion("field_house_rent_target not like", value, "fieldHouseRentTarget");
            return (Criteria) this;
        }

        public Criteria andFieldHouseRentTargetIn(List<String> values) {
            addCriterion("field_house_rent_target in", values, "fieldHouseRentTarget");
            return (Criteria) this;
        }

        public Criteria andFieldHouseRentTargetNotIn(List<String> values) {
            addCriterion("field_house_rent_target not in", values, "fieldHouseRentTarget");
            return (Criteria) this;
        }

        public Criteria andFieldHouseRentTargetBetween(String value1, String value2) {
            addCriterion("field_house_rent_target between", value1, value2, "fieldHouseRentTarget");
            return (Criteria) this;
        }

        public Criteria andFieldHouseRentTargetNotBetween(String value1, String value2) {
            addCriterion("field_house_rent_target not between", value1, value2, "fieldHouseRentTarget");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsSelfIsNull() {
            addCriterion("field_house_is_self is null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsSelfIsNotNull() {
            addCriterion("field_house_is_self is not null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsSelfEqualTo(Integer value) {
            addCriterion("field_house_is_self =", value, "fieldHouseIsSelf");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsSelfNotEqualTo(Integer value) {
            addCriterion("field_house_is_self <>", value, "fieldHouseIsSelf");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsSelfGreaterThan(Integer value) {
            addCriterion("field_house_is_self >", value, "fieldHouseIsSelf");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsSelfGreaterThanOrEqualTo(Integer value) {
            addCriterion("field_house_is_self >=", value, "fieldHouseIsSelf");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsSelfLessThan(Integer value) {
            addCriterion("field_house_is_self <", value, "fieldHouseIsSelf");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsSelfLessThanOrEqualTo(Integer value) {
            addCriterion("field_house_is_self <=", value, "fieldHouseIsSelf");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsSelfIn(List<Integer> values) {
            addCriterion("field_house_is_self in", values, "fieldHouseIsSelf");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsSelfNotIn(List<Integer> values) {
            addCriterion("field_house_is_self not in", values, "fieldHouseIsSelf");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsSelfBetween(Integer value1, Integer value2) {
            addCriterion("field_house_is_self between", value1, value2, "fieldHouseIsSelf");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsSelfNotBetween(Integer value1, Integer value2) {
            addCriterion("field_house_is_self not between", value1, value2, "fieldHouseIsSelf");
            return (Criteria) this;
        }

        public Criteria andFieldHouseHouseIdIsNull() {
            addCriterion("field_house_house_id is null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseHouseIdIsNotNull() {
            addCriterion("field_house_house_id is not null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseHouseIdEqualTo(Long value) {
            addCriterion("field_house_house_id =", value, "fieldHouseHouseId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseHouseIdNotEqualTo(Long value) {
            addCriterion("field_house_house_id <>", value, "fieldHouseHouseId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseHouseIdGreaterThan(Long value) {
            addCriterion("field_house_house_id >", value, "fieldHouseHouseId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseHouseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("field_house_house_id >=", value, "fieldHouseHouseId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseHouseIdLessThan(Long value) {
            addCriterion("field_house_house_id <", value, "fieldHouseHouseId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseHouseIdLessThanOrEqualTo(Long value) {
            addCriterion("field_house_house_id <=", value, "fieldHouseHouseId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseHouseIdIn(List<Long> values) {
            addCriterion("field_house_house_id in", values, "fieldHouseHouseId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseHouseIdNotIn(List<Long> values) {
            addCriterion("field_house_house_id not in", values, "fieldHouseHouseId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseHouseIdBetween(Long value1, Long value2) {
            addCriterion("field_house_house_id between", value1, value2, "fieldHouseHouseId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseHouseIdNotBetween(Long value1, Long value2) {
            addCriterion("field_house_house_id not between", value1, value2, "fieldHouseHouseId");
            return (Criteria) this;
        }

        public Criteria andFieldHousePriceIsNull() {
            addCriterion("field_house_price is null");
            return (Criteria) this;
        }

        public Criteria andFieldHousePriceIsNotNull() {
            addCriterion("field_house_price is not null");
            return (Criteria) this;
        }

        public Criteria andFieldHousePriceEqualTo(String value) {
            addCriterion("field_house_price =", value, "fieldHousePrice");
            return (Criteria) this;
        }

        public Criteria andFieldHousePriceNotEqualTo(String value) {
            addCriterion("field_house_price <>", value, "fieldHousePrice");
            return (Criteria) this;
        }

        public Criteria andFieldHousePriceGreaterThan(String value) {
            addCriterion("field_house_price >", value, "fieldHousePrice");
            return (Criteria) this;
        }

        public Criteria andFieldHousePriceGreaterThanOrEqualTo(String value) {
            addCriterion("field_house_price >=", value, "fieldHousePrice");
            return (Criteria) this;
        }

        public Criteria andFieldHousePriceLessThan(String value) {
            addCriterion("field_house_price <", value, "fieldHousePrice");
            return (Criteria) this;
        }

        public Criteria andFieldHousePriceLessThanOrEqualTo(String value) {
            addCriterion("field_house_price <=", value, "fieldHousePrice");
            return (Criteria) this;
        }

        public Criteria andFieldHousePriceLike(String value) {
            addCriterion("field_house_price like", value, "fieldHousePrice");
            return (Criteria) this;
        }

        public Criteria andFieldHousePriceNotLike(String value) {
            addCriterion("field_house_price not like", value, "fieldHousePrice");
            return (Criteria) this;
        }

        public Criteria andFieldHousePriceIn(List<String> values) {
            addCriterion("field_house_price in", values, "fieldHousePrice");
            return (Criteria) this;
        }

        public Criteria andFieldHousePriceNotIn(List<String> values) {
            addCriterion("field_house_price not in", values, "fieldHousePrice");
            return (Criteria) this;
        }

        public Criteria andFieldHousePriceBetween(String value1, String value2) {
            addCriterion("field_house_price between", value1, value2, "fieldHousePrice");
            return (Criteria) this;
        }

        public Criteria andFieldHousePriceNotBetween(String value1, String value2) {
            addCriterion("field_house_price not between", value1, value2, "fieldHousePrice");
            return (Criteria) this;
        }

        public Criteria andFieldHouseAreaIsNull() {
            addCriterion("field_house_area is null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseAreaIsNotNull() {
            addCriterion("field_house_area is not null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseAreaEqualTo(String value) {
            addCriterion("field_house_area =", value, "fieldHouseArea");
            return (Criteria) this;
        }

        public Criteria andFieldHouseAreaNotEqualTo(String value) {
            addCriterion("field_house_area <>", value, "fieldHouseArea");
            return (Criteria) this;
        }

        public Criteria andFieldHouseAreaGreaterThan(String value) {
            addCriterion("field_house_area >", value, "fieldHouseArea");
            return (Criteria) this;
        }

        public Criteria andFieldHouseAreaGreaterThanOrEqualTo(String value) {
            addCriterion("field_house_area >=", value, "fieldHouseArea");
            return (Criteria) this;
        }

        public Criteria andFieldHouseAreaLessThan(String value) {
            addCriterion("field_house_area <", value, "fieldHouseArea");
            return (Criteria) this;
        }

        public Criteria andFieldHouseAreaLessThanOrEqualTo(String value) {
            addCriterion("field_house_area <=", value, "fieldHouseArea");
            return (Criteria) this;
        }

        public Criteria andFieldHouseAreaLike(String value) {
            addCriterion("field_house_area like", value, "fieldHouseArea");
            return (Criteria) this;
        }

        public Criteria andFieldHouseAreaNotLike(String value) {
            addCriterion("field_house_area not like", value, "fieldHouseArea");
            return (Criteria) this;
        }

        public Criteria andFieldHouseAreaIn(List<String> values) {
            addCriterion("field_house_area in", values, "fieldHouseArea");
            return (Criteria) this;
        }

        public Criteria andFieldHouseAreaNotIn(List<String> values) {
            addCriterion("field_house_area not in", values, "fieldHouseArea");
            return (Criteria) this;
        }

        public Criteria andFieldHouseAreaBetween(String value1, String value2) {
            addCriterion("field_house_area between", value1, value2, "fieldHouseArea");
            return (Criteria) this;
        }

        public Criteria andFieldHouseAreaNotBetween(String value1, String value2) {
            addCriterion("field_house_area not between", value1, value2, "fieldHouseArea");
            return (Criteria) this;
        }

        public Criteria andFieldHouseFixedIsNull() {
            addCriterion("field_house_fixed is null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseFixedIsNotNull() {
            addCriterion("field_house_fixed is not null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseFixedEqualTo(String value) {
            addCriterion("field_house_fixed =", value, "fieldHouseFixed");
            return (Criteria) this;
        }

        public Criteria andFieldHouseFixedNotEqualTo(String value) {
            addCriterion("field_house_fixed <>", value, "fieldHouseFixed");
            return (Criteria) this;
        }

        public Criteria andFieldHouseFixedGreaterThan(String value) {
            addCriterion("field_house_fixed >", value, "fieldHouseFixed");
            return (Criteria) this;
        }

        public Criteria andFieldHouseFixedGreaterThanOrEqualTo(String value) {
            addCriterion("field_house_fixed >=", value, "fieldHouseFixed");
            return (Criteria) this;
        }

        public Criteria andFieldHouseFixedLessThan(String value) {
            addCriterion("field_house_fixed <", value, "fieldHouseFixed");
            return (Criteria) this;
        }

        public Criteria andFieldHouseFixedLessThanOrEqualTo(String value) {
            addCriterion("field_house_fixed <=", value, "fieldHouseFixed");
            return (Criteria) this;
        }

        public Criteria andFieldHouseFixedLike(String value) {
            addCriterion("field_house_fixed like", value, "fieldHouseFixed");
            return (Criteria) this;
        }

        public Criteria andFieldHouseFixedNotLike(String value) {
            addCriterion("field_house_fixed not like", value, "fieldHouseFixed");
            return (Criteria) this;
        }

        public Criteria andFieldHouseFixedIn(List<String> values) {
            addCriterion("field_house_fixed in", values, "fieldHouseFixed");
            return (Criteria) this;
        }

        public Criteria andFieldHouseFixedNotIn(List<String> values) {
            addCriterion("field_house_fixed not in", values, "fieldHouseFixed");
            return (Criteria) this;
        }

        public Criteria andFieldHouseFixedBetween(String value1, String value2) {
            addCriterion("field_house_fixed between", value1, value2, "fieldHouseFixed");
            return (Criteria) this;
        }

        public Criteria andFieldHouseFixedNotBetween(String value1, String value2) {
            addCriterion("field_house_fixed not between", value1, value2, "fieldHouseFixed");
            return (Criteria) this;
        }

        public Criteria andFieldHouseYearIsNull() {
            addCriterion("field_house_year is null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseYearIsNotNull() {
            addCriterion("field_house_year is not null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseYearEqualTo(String value) {
            addCriterion("field_house_year =", value, "fieldHouseYear");
            return (Criteria) this;
        }

        public Criteria andFieldHouseYearNotEqualTo(String value) {
            addCriterion("field_house_year <>", value, "fieldHouseYear");
            return (Criteria) this;
        }

        public Criteria andFieldHouseYearGreaterThan(String value) {
            addCriterion("field_house_year >", value, "fieldHouseYear");
            return (Criteria) this;
        }

        public Criteria andFieldHouseYearGreaterThanOrEqualTo(String value) {
            addCriterion("field_house_year >=", value, "fieldHouseYear");
            return (Criteria) this;
        }

        public Criteria andFieldHouseYearLessThan(String value) {
            addCriterion("field_house_year <", value, "fieldHouseYear");
            return (Criteria) this;
        }

        public Criteria andFieldHouseYearLessThanOrEqualTo(String value) {
            addCriterion("field_house_year <=", value, "fieldHouseYear");
            return (Criteria) this;
        }

        public Criteria andFieldHouseYearLike(String value) {
            addCriterion("field_house_year like", value, "fieldHouseYear");
            return (Criteria) this;
        }

        public Criteria andFieldHouseYearNotLike(String value) {
            addCriterion("field_house_year not like", value, "fieldHouseYear");
            return (Criteria) this;
        }

        public Criteria andFieldHouseYearIn(List<String> values) {
            addCriterion("field_house_year in", values, "fieldHouseYear");
            return (Criteria) this;
        }

        public Criteria andFieldHouseYearNotIn(List<String> values) {
            addCriterion("field_house_year not in", values, "fieldHouseYear");
            return (Criteria) this;
        }

        public Criteria andFieldHouseYearBetween(String value1, String value2) {
            addCriterion("field_house_year between", value1, value2, "fieldHouseYear");
            return (Criteria) this;
        }

        public Criteria andFieldHouseYearNotBetween(String value1, String value2) {
            addCriterion("field_house_year not between", value1, value2, "fieldHouseYear");
            return (Criteria) this;
        }

        public Criteria andFieldHousePostionIsNull() {
            addCriterion("field_house_postion is null");
            return (Criteria) this;
        }

        public Criteria andFieldHousePostionIsNotNull() {
            addCriterion("field_house_postion is not null");
            return (Criteria) this;
        }

        public Criteria andFieldHousePostionEqualTo(String value) {
            addCriterion("field_house_postion =", value, "fieldHousePostion");
            return (Criteria) this;
        }

        public Criteria andFieldHousePostionNotEqualTo(String value) {
            addCriterion("field_house_postion <>", value, "fieldHousePostion");
            return (Criteria) this;
        }

        public Criteria andFieldHousePostionGreaterThan(String value) {
            addCriterion("field_house_postion >", value, "fieldHousePostion");
            return (Criteria) this;
        }

        public Criteria andFieldHousePostionGreaterThanOrEqualTo(String value) {
            addCriterion("field_house_postion >=", value, "fieldHousePostion");
            return (Criteria) this;
        }

        public Criteria andFieldHousePostionLessThan(String value) {
            addCriterion("field_house_postion <", value, "fieldHousePostion");
            return (Criteria) this;
        }

        public Criteria andFieldHousePostionLessThanOrEqualTo(String value) {
            addCriterion("field_house_postion <=", value, "fieldHousePostion");
            return (Criteria) this;
        }

        public Criteria andFieldHousePostionLike(String value) {
            addCriterion("field_house_postion like", value, "fieldHousePostion");
            return (Criteria) this;
        }

        public Criteria andFieldHousePostionNotLike(String value) {
            addCriterion("field_house_postion not like", value, "fieldHousePostion");
            return (Criteria) this;
        }

        public Criteria andFieldHousePostionIn(List<String> values) {
            addCriterion("field_house_postion in", values, "fieldHousePostion");
            return (Criteria) this;
        }

        public Criteria andFieldHousePostionNotIn(List<String> values) {
            addCriterion("field_house_postion not in", values, "fieldHousePostion");
            return (Criteria) this;
        }

        public Criteria andFieldHousePostionBetween(String value1, String value2) {
            addCriterion("field_house_postion between", value1, value2, "fieldHousePostion");
            return (Criteria) this;
        }

        public Criteria andFieldHousePostionNotBetween(String value1, String value2) {
            addCriterion("field_house_postion not between", value1, value2, "fieldHousePostion");
            return (Criteria) this;
        }

        public Criteria andFieldHouseDescIsNull() {
            addCriterion("field_house_desc is null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseDescIsNotNull() {
            addCriterion("field_house_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseDescEqualTo(String value) {
            addCriterion("field_house_desc =", value, "fieldHouseDesc");
            return (Criteria) this;
        }

        public Criteria andFieldHouseDescNotEqualTo(String value) {
            addCriterion("field_house_desc <>", value, "fieldHouseDesc");
            return (Criteria) this;
        }

        public Criteria andFieldHouseDescGreaterThan(String value) {
            addCriterion("field_house_desc >", value, "fieldHouseDesc");
            return (Criteria) this;
        }

        public Criteria andFieldHouseDescGreaterThanOrEqualTo(String value) {
            addCriterion("field_house_desc >=", value, "fieldHouseDesc");
            return (Criteria) this;
        }

        public Criteria andFieldHouseDescLessThan(String value) {
            addCriterion("field_house_desc <", value, "fieldHouseDesc");
            return (Criteria) this;
        }

        public Criteria andFieldHouseDescLessThanOrEqualTo(String value) {
            addCriterion("field_house_desc <=", value, "fieldHouseDesc");
            return (Criteria) this;
        }

        public Criteria andFieldHouseDescLike(String value) {
            addCriterion("field_house_desc like", value, "fieldHouseDesc");
            return (Criteria) this;
        }

        public Criteria andFieldHouseDescNotLike(String value) {
            addCriterion("field_house_desc not like", value, "fieldHouseDesc");
            return (Criteria) this;
        }

        public Criteria andFieldHouseDescIn(List<String> values) {
            addCriterion("field_house_desc in", values, "fieldHouseDesc");
            return (Criteria) this;
        }

        public Criteria andFieldHouseDescNotIn(List<String> values) {
            addCriterion("field_house_desc not in", values, "fieldHouseDesc");
            return (Criteria) this;
        }

        public Criteria andFieldHouseDescBetween(String value1, String value2) {
            addCriterion("field_house_desc between", value1, value2, "fieldHouseDesc");
            return (Criteria) this;
        }

        public Criteria andFieldHouseDescNotBetween(String value1, String value2) {
            addCriterion("field_house_desc not between", value1, value2, "fieldHouseDesc");
            return (Criteria) this;
        }

        public Criteria andFieldHouseWeightIsNull() {
            addCriterion("field_house_weight is null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseWeightIsNotNull() {
            addCriterion("field_house_weight is not null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseWeightEqualTo(Integer value) {
            addCriterion("field_house_weight =", value, "fieldHouseWeight");
            return (Criteria) this;
        }

        public Criteria andFieldHouseWeightNotEqualTo(Integer value) {
            addCriterion("field_house_weight <>", value, "fieldHouseWeight");
            return (Criteria) this;
        }

        public Criteria andFieldHouseWeightGreaterThan(Integer value) {
            addCriterion("field_house_weight >", value, "fieldHouseWeight");
            return (Criteria) this;
        }

        public Criteria andFieldHouseWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("field_house_weight >=", value, "fieldHouseWeight");
            return (Criteria) this;
        }

        public Criteria andFieldHouseWeightLessThan(Integer value) {
            addCriterion("field_house_weight <", value, "fieldHouseWeight");
            return (Criteria) this;
        }

        public Criteria andFieldHouseWeightLessThanOrEqualTo(Integer value) {
            addCriterion("field_house_weight <=", value, "fieldHouseWeight");
            return (Criteria) this;
        }

        public Criteria andFieldHouseWeightIn(List<Integer> values) {
            addCriterion("field_house_weight in", values, "fieldHouseWeight");
            return (Criteria) this;
        }

        public Criteria andFieldHouseWeightNotIn(List<Integer> values) {
            addCriterion("field_house_weight not in", values, "fieldHouseWeight");
            return (Criteria) this;
        }

        public Criteria andFieldHouseWeightBetween(Integer value1, Integer value2) {
            addCriterion("field_house_weight between", value1, value2, "fieldHouseWeight");
            return (Criteria) this;
        }

        public Criteria andFieldHouseWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("field_house_weight not between", value1, value2, "fieldHouseWeight");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsPublishIsNull() {
            addCriterion("field_house_is_publish is null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsPublishIsNotNull() {
            addCriterion("field_house_is_publish is not null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsPublishEqualTo(Integer value) {
            addCriterion("field_house_is_publish =", value, "fieldHouseIsPublish");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsPublishNotEqualTo(Integer value) {
            addCriterion("field_house_is_publish <>", value, "fieldHouseIsPublish");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsPublishGreaterThan(Integer value) {
            addCriterion("field_house_is_publish >", value, "fieldHouseIsPublish");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsPublishGreaterThanOrEqualTo(Integer value) {
            addCriterion("field_house_is_publish >=", value, "fieldHouseIsPublish");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsPublishLessThan(Integer value) {
            addCriterion("field_house_is_publish <", value, "fieldHouseIsPublish");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsPublishLessThanOrEqualTo(Integer value) {
            addCriterion("field_house_is_publish <=", value, "fieldHouseIsPublish");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsPublishIn(List<Integer> values) {
            addCriterion("field_house_is_publish in", values, "fieldHouseIsPublish");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsPublishNotIn(List<Integer> values) {
            addCriterion("field_house_is_publish not in", values, "fieldHouseIsPublish");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsPublishBetween(Integer value1, Integer value2) {
            addCriterion("field_house_is_publish between", value1, value2, "fieldHouseIsPublish");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsPublishNotBetween(Integer value1, Integer value2) {
            addCriterion("field_house_is_publish not between", value1, value2, "fieldHouseIsPublish");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsRecommendIsNull() {
            addCriterion("field_house_is_recommend is null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsRecommendIsNotNull() {
            addCriterion("field_house_is_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsRecommendEqualTo(Integer value) {
            addCriterion("field_house_is_recommend =", value, "fieldHouseIsRecommend");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsRecommendNotEqualTo(Integer value) {
            addCriterion("field_house_is_recommend <>", value, "fieldHouseIsRecommend");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsRecommendGreaterThan(Integer value) {
            addCriterion("field_house_is_recommend >", value, "fieldHouseIsRecommend");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsRecommendGreaterThanOrEqualTo(Integer value) {
            addCriterion("field_house_is_recommend >=", value, "fieldHouseIsRecommend");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsRecommendLessThan(Integer value) {
            addCriterion("field_house_is_recommend <", value, "fieldHouseIsRecommend");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsRecommendLessThanOrEqualTo(Integer value) {
            addCriterion("field_house_is_recommend <=", value, "fieldHouseIsRecommend");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsRecommendIn(List<Integer> values) {
            addCriterion("field_house_is_recommend in", values, "fieldHouseIsRecommend");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsRecommendNotIn(List<Integer> values) {
            addCriterion("field_house_is_recommend not in", values, "fieldHouseIsRecommend");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsRecommendBetween(Integer value1, Integer value2) {
            addCriterion("field_house_is_recommend between", value1, value2, "fieldHouseIsRecommend");
            return (Criteria) this;
        }

        public Criteria andFieldHouseIsRecommendNotBetween(Integer value1, Integer value2) {
            addCriterion("field_house_is_recommend not between", value1, value2, "fieldHouseIsRecommend");
            return (Criteria) this;
        }

        public Criteria andFieldHouseContactIdIsNull() {
            addCriterion("field_house_contact_id is null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseContactIdIsNotNull() {
            addCriterion("field_house_contact_id is not null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseContactIdEqualTo(Long value) {
            addCriterion("field_house_contact_id =", value, "fieldHouseContactId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseContactIdNotEqualTo(Long value) {
            addCriterion("field_house_contact_id <>", value, "fieldHouseContactId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseContactIdGreaterThan(Long value) {
            addCriterion("field_house_contact_id >", value, "fieldHouseContactId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseContactIdGreaterThanOrEqualTo(Long value) {
            addCriterion("field_house_contact_id >=", value, "fieldHouseContactId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseContactIdLessThan(Long value) {
            addCriterion("field_house_contact_id <", value, "fieldHouseContactId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseContactIdLessThanOrEqualTo(Long value) {
            addCriterion("field_house_contact_id <=", value, "fieldHouseContactId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseContactIdIn(List<Long> values) {
            addCriterion("field_house_contact_id in", values, "fieldHouseContactId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseContactIdNotIn(List<Long> values) {
            addCriterion("field_house_contact_id not in", values, "fieldHouseContactId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseContactIdBetween(Long value1, Long value2) {
            addCriterion("field_house_contact_id between", value1, value2, "fieldHouseContactId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseContactIdNotBetween(Long value1, Long value2) {
            addCriterion("field_house_contact_id not between", value1, value2, "fieldHouseContactId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCreateTimeIsNull() {
            addCriterion("field_house_create_time is null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCreateTimeIsNotNull() {
            addCriterion("field_house_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCreateTimeEqualTo(Date value) {
            addCriterion("field_house_create_time =", value, "fieldHouseCreateTime");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCreateTimeNotEqualTo(Date value) {
            addCriterion("field_house_create_time <>", value, "fieldHouseCreateTime");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCreateTimeGreaterThan(Date value) {
            addCriterion("field_house_create_time >", value, "fieldHouseCreateTime");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("field_house_create_time >=", value, "fieldHouseCreateTime");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCreateTimeLessThan(Date value) {
            addCriterion("field_house_create_time <", value, "fieldHouseCreateTime");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("field_house_create_time <=", value, "fieldHouseCreateTime");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCreateTimeIn(List<Date> values) {
            addCriterion("field_house_create_time in", values, "fieldHouseCreateTime");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCreateTimeNotIn(List<Date> values) {
            addCriterion("field_house_create_time not in", values, "fieldHouseCreateTime");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCreateTimeBetween(Date value1, Date value2) {
            addCriterion("field_house_create_time between", value1, value2, "fieldHouseCreateTime");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("field_house_create_time not between", value1, value2, "fieldHouseCreateTime");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCreateIdIsNull() {
            addCriterion("field_house_create_id is null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCreateIdIsNotNull() {
            addCriterion("field_house_create_id is not null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCreateIdEqualTo(Long value) {
            addCriterion("field_house_create_id =", value, "fieldHouseCreateId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCreateIdNotEqualTo(Long value) {
            addCriterion("field_house_create_id <>", value, "fieldHouseCreateId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCreateIdGreaterThan(Long value) {
            addCriterion("field_house_create_id >", value, "fieldHouseCreateId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCreateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("field_house_create_id >=", value, "fieldHouseCreateId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCreateIdLessThan(Long value) {
            addCriterion("field_house_create_id <", value, "fieldHouseCreateId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCreateIdLessThanOrEqualTo(Long value) {
            addCriterion("field_house_create_id <=", value, "fieldHouseCreateId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCreateIdIn(List<Long> values) {
            addCriterion("field_house_create_id in", values, "fieldHouseCreateId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCreateIdNotIn(List<Long> values) {
            addCriterion("field_house_create_id not in", values, "fieldHouseCreateId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCreateIdBetween(Long value1, Long value2) {
            addCriterion("field_house_create_id between", value1, value2, "fieldHouseCreateId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCreateIdNotBetween(Long value1, Long value2) {
            addCriterion("field_house_create_id not between", value1, value2, "fieldHouseCreateId");
            return (Criteria) this;
        }

        public Criteria andFieldHouseImageTypeIsNull() {
            addCriterion("field_house_image_type is null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseImageTypeIsNotNull() {
            addCriterion("field_house_image_type is not null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseImageTypeEqualTo(Integer value) {
            addCriterion("field_house_image_type =", value, "fieldHouseImageType");
            return (Criteria) this;
        }

        public Criteria andFieldHouseImageTypeNotEqualTo(Integer value) {
            addCriterion("field_house_image_type <>", value, "fieldHouseImageType");
            return (Criteria) this;
        }

        public Criteria andFieldHouseImageTypeGreaterThan(Integer value) {
            addCriterion("field_house_image_type >", value, "fieldHouseImageType");
            return (Criteria) this;
        }

        public Criteria andFieldHouseImageTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("field_house_image_type >=", value, "fieldHouseImageType");
            return (Criteria) this;
        }

        public Criteria andFieldHouseImageTypeLessThan(Integer value) {
            addCriterion("field_house_image_type <", value, "fieldHouseImageType");
            return (Criteria) this;
        }

        public Criteria andFieldHouseImageTypeLessThanOrEqualTo(Integer value) {
            addCriterion("field_house_image_type <=", value, "fieldHouseImageType");
            return (Criteria) this;
        }

        public Criteria andFieldHouseImageTypeIn(List<Integer> values) {
            addCriterion("field_house_image_type in", values, "fieldHouseImageType");
            return (Criteria) this;
        }

        public Criteria andFieldHouseImageTypeNotIn(List<Integer> values) {
            addCriterion("field_house_image_type not in", values, "fieldHouseImageType");
            return (Criteria) this;
        }

        public Criteria andFieldHouseImageTypeBetween(Integer value1, Integer value2) {
            addCriterion("field_house_image_type between", value1, value2, "fieldHouseImageType");
            return (Criteria) this;
        }

        public Criteria andFieldHouseImageTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("field_house_image_type not between", value1, value2, "fieldHouseImageType");
            return (Criteria) this;
        }

        public Criteria andFieldHouseContactTypeIsNull() {
            addCriterion("field_house_contact_type is null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseContactTypeIsNotNull() {
            addCriterion("field_house_contact_type is not null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseContactTypeEqualTo(Integer value) {
            addCriterion("field_house_contact_type =", value, "fieldHouseContactType");
            return (Criteria) this;
        }

        public Criteria andFieldHouseContactTypeNotEqualTo(Integer value) {
            addCriterion("field_house_contact_type <>", value, "fieldHouseContactType");
            return (Criteria) this;
        }

        public Criteria andFieldHouseContactTypeGreaterThan(Integer value) {
            addCriterion("field_house_contact_type >", value, "fieldHouseContactType");
            return (Criteria) this;
        }

        public Criteria andFieldHouseContactTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("field_house_contact_type >=", value, "fieldHouseContactType");
            return (Criteria) this;
        }

        public Criteria andFieldHouseContactTypeLessThan(Integer value) {
            addCriterion("field_house_contact_type <", value, "fieldHouseContactType");
            return (Criteria) this;
        }

        public Criteria andFieldHouseContactTypeLessThanOrEqualTo(Integer value) {
            addCriterion("field_house_contact_type <=", value, "fieldHouseContactType");
            return (Criteria) this;
        }

        public Criteria andFieldHouseContactTypeIn(List<Integer> values) {
            addCriterion("field_house_contact_type in", values, "fieldHouseContactType");
            return (Criteria) this;
        }

        public Criteria andFieldHouseContactTypeNotIn(List<Integer> values) {
            addCriterion("field_house_contact_type not in", values, "fieldHouseContactType");
            return (Criteria) this;
        }

        public Criteria andFieldHouseContactTypeBetween(Integer value1, Integer value2) {
            addCriterion("field_house_contact_type between", value1, value2, "fieldHouseContactType");
            return (Criteria) this;
        }

        public Criteria andFieldHouseContactTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("field_house_contact_type not between", value1, value2, "fieldHouseContactType");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCustomerPhoneIsNull() {
            addCriterion("field_house_customer_phone is null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCustomerPhoneIsNotNull() {
            addCriterion("field_house_customer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCustomerPhoneEqualTo(String value) {
            addCriterion("field_house_customer_phone =", value, "fieldHouseCustomerPhone");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCustomerPhoneNotEqualTo(String value) {
            addCriterion("field_house_customer_phone <>", value, "fieldHouseCustomerPhone");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCustomerPhoneGreaterThan(String value) {
            addCriterion("field_house_customer_phone >", value, "fieldHouseCustomerPhone");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCustomerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("field_house_customer_phone >=", value, "fieldHouseCustomerPhone");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCustomerPhoneLessThan(String value) {
            addCriterion("field_house_customer_phone <", value, "fieldHouseCustomerPhone");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCustomerPhoneLessThanOrEqualTo(String value) {
            addCriterion("field_house_customer_phone <=", value, "fieldHouseCustomerPhone");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCustomerPhoneLike(String value) {
            addCriterion("field_house_customer_phone like", value, "fieldHouseCustomerPhone");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCustomerPhoneNotLike(String value) {
            addCriterion("field_house_customer_phone not like", value, "fieldHouseCustomerPhone");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCustomerPhoneIn(List<String> values) {
            addCriterion("field_house_customer_phone in", values, "fieldHouseCustomerPhone");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCustomerPhoneNotIn(List<String> values) {
            addCriterion("field_house_customer_phone not in", values, "fieldHouseCustomerPhone");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCustomerPhoneBetween(String value1, String value2) {
            addCriterion("field_house_customer_phone between", value1, value2, "fieldHouseCustomerPhone");
            return (Criteria) this;
        }

        public Criteria andFieldHouseCustomerPhoneNotBetween(String value1, String value2) {
            addCriterion("field_house_customer_phone not between", value1, value2, "fieldHouseCustomerPhone");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}