package com.macro.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbPromotionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPromotionExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andConditionIsNull() {
            addCriterion("condition is null");
            return (Criteria) this;
        }

        public Criteria andConditionIsNotNull() {
            addCriterion("condition is not null");
            return (Criteria) this;
        }

        public Criteria andConditionEqualTo(Long value) {
            addCriterion("condition =", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotEqualTo(Long value) {
            addCriterion("condition <>", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionGreaterThan(Long value) {
            addCriterion("condition >", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionGreaterThanOrEqualTo(Long value) {
            addCriterion("condition >=", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionLessThan(Long value) {
            addCriterion("condition <", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionLessThanOrEqualTo(Long value) {
            addCriterion("condition <=", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionIn(List<Long> values) {
            addCriterion("condition in", values, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotIn(List<Long> values) {
            addCriterion("condition not in", values, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionBetween(Long value1, Long value2) {
            addCriterion("condition between", value1, value2, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotBetween(Long value1, Long value2) {
            addCriterion("condition not between", value1, value2, "condition");
            return (Criteria) this;
        }

        public Criteria andReductionIsNull() {
            addCriterion("reduction is null");
            return (Criteria) this;
        }

        public Criteria andReductionIsNotNull() {
            addCriterion("reduction is not null");
            return (Criteria) this;
        }

        public Criteria andReductionEqualTo(Long value) {
            addCriterion("reduction =", value, "reduction");
            return (Criteria) this;
        }

        public Criteria andReductionNotEqualTo(Long value) {
            addCriterion("reduction <>", value, "reduction");
            return (Criteria) this;
        }

        public Criteria andReductionGreaterThan(Long value) {
            addCriterion("reduction >", value, "reduction");
            return (Criteria) this;
        }

        public Criteria andReductionGreaterThanOrEqualTo(Long value) {
            addCriterion("reduction >=", value, "reduction");
            return (Criteria) this;
        }

        public Criteria andReductionLessThan(Long value) {
            addCriterion("reduction <", value, "reduction");
            return (Criteria) this;
        }

        public Criteria andReductionLessThanOrEqualTo(Long value) {
            addCriterion("reduction <=", value, "reduction");
            return (Criteria) this;
        }

        public Criteria andReductionIn(List<Long> values) {
            addCriterion("reduction in", values, "reduction");
            return (Criteria) this;
        }

        public Criteria andReductionNotIn(List<Long> values) {
            addCriterion("reduction not in", values, "reduction");
            return (Criteria) this;
        }

        public Criteria andReductionBetween(Long value1, Long value2) {
            addCriterion("reduction between", value1, value2, "reduction");
            return (Criteria) this;
        }

        public Criteria andReductionNotBetween(Long value1, Long value2) {
            addCriterion("reduction not between", value1, value2, "reduction");
            return (Criteria) this;
        }

        public Criteria andSeckillPriceIsNull() {
            addCriterion("seckill_price is null");
            return (Criteria) this;
        }

        public Criteria andSeckillPriceIsNotNull() {
            addCriterion("seckill_price is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillPriceEqualTo(Long value) {
            addCriterion("seckill_price =", value, "seckillPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillPriceNotEqualTo(Long value) {
            addCriterion("seckill_price <>", value, "seckillPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillPriceGreaterThan(Long value) {
            addCriterion("seckill_price >", value, "seckillPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("seckill_price >=", value, "seckillPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillPriceLessThan(Long value) {
            addCriterion("seckill_price <", value, "seckillPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillPriceLessThanOrEqualTo(Long value) {
            addCriterion("seckill_price <=", value, "seckillPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillPriceIn(List<Long> values) {
            addCriterion("seckill_price in", values, "seckillPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillPriceNotIn(List<Long> values) {
            addCriterion("seckill_price not in", values, "seckillPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillPriceBetween(Long value1, Long value2) {
            addCriterion("seckill_price between", value1, value2, "seckillPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillPriceNotBetween(Long value1, Long value2) {
            addCriterion("seckill_price not between", value1, value2, "seckillPrice");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(Long value) {
            addCriterion("coupon_id =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(Long value) {
            addCriterion("coupon_id <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(Long value) {
            addCriterion("coupon_id >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(Long value) {
            addCriterion("coupon_id >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(Long value) {
            addCriterion("coupon_id <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(Long value) {
            addCriterion("coupon_id <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<Long> values) {
            addCriterion("coupon_id in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<Long> values) {
            addCriterion("coupon_id not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(Long value1, Long value2) {
            addCriterion("coupon_id between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(Long value1, Long value2) {
            addCriterion("coupon_id not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andTargetsIsNull() {
            addCriterion("targets is null");
            return (Criteria) this;
        }

        public Criteria andTargetsIsNotNull() {
            addCriterion("targets is not null");
            return (Criteria) this;
        }

        public Criteria andTargetsEqualTo(String value) {
            addCriterion("targets =", value, "targets");
            return (Criteria) this;
        }

        public Criteria andTargetsNotEqualTo(String value) {
            addCriterion("targets <>", value, "targets");
            return (Criteria) this;
        }

        public Criteria andTargetsGreaterThan(String value) {
            addCriterion("targets >", value, "targets");
            return (Criteria) this;
        }

        public Criteria andTargetsGreaterThanOrEqualTo(String value) {
            addCriterion("targets >=", value, "targets");
            return (Criteria) this;
        }

        public Criteria andTargetsLessThan(String value) {
            addCriterion("targets <", value, "targets");
            return (Criteria) this;
        }

        public Criteria andTargetsLessThanOrEqualTo(String value) {
            addCriterion("targets <=", value, "targets");
            return (Criteria) this;
        }

        public Criteria andTargetsLike(String value) {
            addCriterion("targets like", value, "targets");
            return (Criteria) this;
        }

        public Criteria andTargetsNotLike(String value) {
            addCriterion("targets not like", value, "targets");
            return (Criteria) this;
        }

        public Criteria andTargetsIn(List<String> values) {
            addCriterion("targets in", values, "targets");
            return (Criteria) this;
        }

        public Criteria andTargetsNotIn(List<String> values) {
            addCriterion("targets not in", values, "targets");
            return (Criteria) this;
        }

        public Criteria andTargetsBetween(String value1, String value2) {
            addCriterion("targets between", value1, value2, "targets");
            return (Criteria) this;
        }

        public Criteria andTargetsNotBetween(String value1, String value2) {
            addCriterion("targets not between", value1, value2, "targets");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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