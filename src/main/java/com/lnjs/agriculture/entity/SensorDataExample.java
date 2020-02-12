package com.lnjs.agriculture.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SensorDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SensorDataExample() {
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

        public Criteria andRecordtimeIsNull() {
            addCriterion("RecordTime is null");
            return (Criteria) this;
        }

        public Criteria andRecordtimeIsNotNull() {
            addCriterion("RecordTime is not null");
            return (Criteria) this;
        }

        public Criteria andRecordtimeEqualTo(Date value) {
            addCriterion("RecordTime =", value, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeNotEqualTo(Date value) {
            addCriterion("RecordTime <>", value, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeGreaterThan(Date value) {
            addCriterion("RecordTime >", value, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RecordTime >=", value, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeLessThan(Date value) {
            addCriterion("RecordTime <", value, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeLessThanOrEqualTo(Date value) {
            addCriterion("RecordTime <=", value, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeIn(List<Date> values) {
            addCriterion("RecordTime in", values, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeNotIn(List<Date> values) {
            addCriterion("RecordTime not in", values, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeBetween(Date value1, Date value2) {
            addCriterion("RecordTime between", value1, value2, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeNotBetween(Date value1, Date value2) {
            addCriterion("RecordTime not between", value1, value2, "recordtime");
            return (Criteria) this;
        }

        public Criteria andSensoraddressIsNull() {
            addCriterion("SensorAddress is null");
            return (Criteria) this;
        }

        public Criteria andSensoraddressIsNotNull() {
            addCriterion("SensorAddress is not null");
            return (Criteria) this;
        }

        public Criteria andSensoraddressEqualTo(Integer value) {
            addCriterion("SensorAddress =", value, "sensoraddress");
            return (Criteria) this;
        }

        public Criteria andSensoraddressNotEqualTo(Integer value) {
            addCriterion("SensorAddress <>", value, "sensoraddress");
            return (Criteria) this;
        }

        public Criteria andSensoraddressGreaterThan(Integer value) {
            addCriterion("SensorAddress >", value, "sensoraddress");
            return (Criteria) this;
        }

        public Criteria andSensoraddressGreaterThanOrEqualTo(Integer value) {
            addCriterion("SensorAddress >=", value, "sensoraddress");
            return (Criteria) this;
        }

        public Criteria andSensoraddressLessThan(Integer value) {
            addCriterion("SensorAddress <", value, "sensoraddress");
            return (Criteria) this;
        }

        public Criteria andSensoraddressLessThanOrEqualTo(Integer value) {
            addCriterion("SensorAddress <=", value, "sensoraddress");
            return (Criteria) this;
        }

        public Criteria andSensoraddressIn(List<Integer> values) {
            addCriterion("SensorAddress in", values, "sensoraddress");
            return (Criteria) this;
        }

        public Criteria andSensoraddressNotIn(List<Integer> values) {
            addCriterion("SensorAddress not in", values, "sensoraddress");
            return (Criteria) this;
        }

        public Criteria andSensoraddressBetween(Integer value1, Integer value2) {
            addCriterion("SensorAddress between", value1, value2, "sensoraddress");
            return (Criteria) this;
        }

        public Criteria andSensoraddressNotBetween(Integer value1, Integer value2) {
            addCriterion("SensorAddress not between", value1, value2, "sensoraddress");
            return (Criteria) this;
        }

        public Criteria andData00IsNull() {
            addCriterion("Data00 is null");
            return (Criteria) this;
        }

        public Criteria andData00IsNotNull() {
            addCriterion("Data00 is not null");
            return (Criteria) this;
        }

        public Criteria andData00EqualTo(Integer value) {
            addCriterion("Data00 =", value, "data00");
            return (Criteria) this;
        }

        public Criteria andData00NotEqualTo(Integer value) {
            addCriterion("Data00 <>", value, "data00");
            return (Criteria) this;
        }

        public Criteria andData00GreaterThan(Integer value) {
            addCriterion("Data00 >", value, "data00");
            return (Criteria) this;
        }

        public Criteria andData00GreaterThanOrEqualTo(Integer value) {
            addCriterion("Data00 >=", value, "data00");
            return (Criteria) this;
        }

        public Criteria andData00LessThan(Integer value) {
            addCriterion("Data00 <", value, "data00");
            return (Criteria) this;
        }

        public Criteria andData00LessThanOrEqualTo(Integer value) {
            addCriterion("Data00 <=", value, "data00");
            return (Criteria) this;
        }

        public Criteria andData00In(List<Integer> values) {
            addCriterion("Data00 in", values, "data00");
            return (Criteria) this;
        }

        public Criteria andData00NotIn(List<Integer> values) {
            addCriterion("Data00 not in", values, "data00");
            return (Criteria) this;
        }

        public Criteria andData00Between(Integer value1, Integer value2) {
            addCriterion("Data00 between", value1, value2, "data00");
            return (Criteria) this;
        }

        public Criteria andData00NotBetween(Integer value1, Integer value2) {
            addCriterion("Data00 not between", value1, value2, "data00");
            return (Criteria) this;
        }

        public Criteria andData01IsNull() {
            addCriterion("Data01 is null");
            return (Criteria) this;
        }

        public Criteria andData01IsNotNull() {
            addCriterion("Data01 is not null");
            return (Criteria) this;
        }

        public Criteria andData01EqualTo(Integer value) {
            addCriterion("Data01 =", value, "data01");
            return (Criteria) this;
        }

        public Criteria andData01NotEqualTo(Integer value) {
            addCriterion("Data01 <>", value, "data01");
            return (Criteria) this;
        }

        public Criteria andData01GreaterThan(Integer value) {
            addCriterion("Data01 >", value, "data01");
            return (Criteria) this;
        }

        public Criteria andData01GreaterThanOrEqualTo(Integer value) {
            addCriterion("Data01 >=", value, "data01");
            return (Criteria) this;
        }

        public Criteria andData01LessThan(Integer value) {
            addCriterion("Data01 <", value, "data01");
            return (Criteria) this;
        }

        public Criteria andData01LessThanOrEqualTo(Integer value) {
            addCriterion("Data01 <=", value, "data01");
            return (Criteria) this;
        }

        public Criteria andData01In(List<Integer> values) {
            addCriterion("Data01 in", values, "data01");
            return (Criteria) this;
        }

        public Criteria andData01NotIn(List<Integer> values) {
            addCriterion("Data01 not in", values, "data01");
            return (Criteria) this;
        }

        public Criteria andData01Between(Integer value1, Integer value2) {
            addCriterion("Data01 between", value1, value2, "data01");
            return (Criteria) this;
        }

        public Criteria andData01NotBetween(Integer value1, Integer value2) {
            addCriterion("Data01 not between", value1, value2, "data01");
            return (Criteria) this;
        }

        public Criteria andData02IsNull() {
            addCriterion("Data02 is null");
            return (Criteria) this;
        }

        public Criteria andData02IsNotNull() {
            addCriterion("Data02 is not null");
            return (Criteria) this;
        }

        public Criteria andData02EqualTo(Integer value) {
            addCriterion("Data02 =", value, "data02");
            return (Criteria) this;
        }

        public Criteria andData02NotEqualTo(Integer value) {
            addCriterion("Data02 <>", value, "data02");
            return (Criteria) this;
        }

        public Criteria andData02GreaterThan(Integer value) {
            addCriterion("Data02 >", value, "data02");
            return (Criteria) this;
        }

        public Criteria andData02GreaterThanOrEqualTo(Integer value) {
            addCriterion("Data02 >=", value, "data02");
            return (Criteria) this;
        }

        public Criteria andData02LessThan(Integer value) {
            addCriterion("Data02 <", value, "data02");
            return (Criteria) this;
        }

        public Criteria andData02LessThanOrEqualTo(Integer value) {
            addCriterion("Data02 <=", value, "data02");
            return (Criteria) this;
        }

        public Criteria andData02In(List<Integer> values) {
            addCriterion("Data02 in", values, "data02");
            return (Criteria) this;
        }

        public Criteria andData02NotIn(List<Integer> values) {
            addCriterion("Data02 not in", values, "data02");
            return (Criteria) this;
        }

        public Criteria andData02Between(Integer value1, Integer value2) {
            addCriterion("Data02 between", value1, value2, "data02");
            return (Criteria) this;
        }

        public Criteria andData02NotBetween(Integer value1, Integer value2) {
            addCriterion("Data02 not between", value1, value2, "data02");
            return (Criteria) this;
        }

        public Criteria andData03IsNull() {
            addCriterion("Data03 is null");
            return (Criteria) this;
        }

        public Criteria andData03IsNotNull() {
            addCriterion("Data03 is not null");
            return (Criteria) this;
        }

        public Criteria andData03EqualTo(Integer value) {
            addCriterion("Data03 =", value, "data03");
            return (Criteria) this;
        }

        public Criteria andData03NotEqualTo(Integer value) {
            addCriterion("Data03 <>", value, "data03");
            return (Criteria) this;
        }

        public Criteria andData03GreaterThan(Integer value) {
            addCriterion("Data03 >", value, "data03");
            return (Criteria) this;
        }

        public Criteria andData03GreaterThanOrEqualTo(Integer value) {
            addCriterion("Data03 >=", value, "data03");
            return (Criteria) this;
        }

        public Criteria andData03LessThan(Integer value) {
            addCriterion("Data03 <", value, "data03");
            return (Criteria) this;
        }

        public Criteria andData03LessThanOrEqualTo(Integer value) {
            addCriterion("Data03 <=", value, "data03");
            return (Criteria) this;
        }

        public Criteria andData03In(List<Integer> values) {
            addCriterion("Data03 in", values, "data03");
            return (Criteria) this;
        }

        public Criteria andData03NotIn(List<Integer> values) {
            addCriterion("Data03 not in", values, "data03");
            return (Criteria) this;
        }

        public Criteria andData03Between(Integer value1, Integer value2) {
            addCriterion("Data03 between", value1, value2, "data03");
            return (Criteria) this;
        }

        public Criteria andData03NotBetween(Integer value1, Integer value2) {
            addCriterion("Data03 not between", value1, value2, "data03");
            return (Criteria) this;
        }

        public Criteria andData04IsNull() {
            addCriterion("Data04 is null");
            return (Criteria) this;
        }

        public Criteria andData04IsNotNull() {
            addCriterion("Data04 is not null");
            return (Criteria) this;
        }

        public Criteria andData04EqualTo(Integer value) {
            addCriterion("Data04 =", value, "data04");
            return (Criteria) this;
        }

        public Criteria andData04NotEqualTo(Integer value) {
            addCriterion("Data04 <>", value, "data04");
            return (Criteria) this;
        }

        public Criteria andData04GreaterThan(Integer value) {
            addCriterion("Data04 >", value, "data04");
            return (Criteria) this;
        }

        public Criteria andData04GreaterThanOrEqualTo(Integer value) {
            addCriterion("Data04 >=", value, "data04");
            return (Criteria) this;
        }

        public Criteria andData04LessThan(Integer value) {
            addCriterion("Data04 <", value, "data04");
            return (Criteria) this;
        }

        public Criteria andData04LessThanOrEqualTo(Integer value) {
            addCriterion("Data04 <=", value, "data04");
            return (Criteria) this;
        }

        public Criteria andData04In(List<Integer> values) {
            addCriterion("Data04 in", values, "data04");
            return (Criteria) this;
        }

        public Criteria andData04NotIn(List<Integer> values) {
            addCriterion("Data04 not in", values, "data04");
            return (Criteria) this;
        }

        public Criteria andData04Between(Integer value1, Integer value2) {
            addCriterion("Data04 between", value1, value2, "data04");
            return (Criteria) this;
        }

        public Criteria andData04NotBetween(Integer value1, Integer value2) {
            addCriterion("Data04 not between", value1, value2, "data04");
            return (Criteria) this;
        }

        public Criteria andData05IsNull() {
            addCriterion("Data05 is null");
            return (Criteria) this;
        }

        public Criteria andData05IsNotNull() {
            addCriterion("Data05 is not null");
            return (Criteria) this;
        }

        public Criteria andData05EqualTo(Integer value) {
            addCriterion("Data05 =", value, "data05");
            return (Criteria) this;
        }

        public Criteria andData05NotEqualTo(Integer value) {
            addCriterion("Data05 <>", value, "data05");
            return (Criteria) this;
        }

        public Criteria andData05GreaterThan(Integer value) {
            addCriterion("Data05 >", value, "data05");
            return (Criteria) this;
        }

        public Criteria andData05GreaterThanOrEqualTo(Integer value) {
            addCriterion("Data05 >=", value, "data05");
            return (Criteria) this;
        }

        public Criteria andData05LessThan(Integer value) {
            addCriterion("Data05 <", value, "data05");
            return (Criteria) this;
        }

        public Criteria andData05LessThanOrEqualTo(Integer value) {
            addCriterion("Data05 <=", value, "data05");
            return (Criteria) this;
        }

        public Criteria andData05In(List<Integer> values) {
            addCriterion("Data05 in", values, "data05");
            return (Criteria) this;
        }

        public Criteria andData05NotIn(List<Integer> values) {
            addCriterion("Data05 not in", values, "data05");
            return (Criteria) this;
        }

        public Criteria andData05Between(Integer value1, Integer value2) {
            addCriterion("Data05 between", value1, value2, "data05");
            return (Criteria) this;
        }

        public Criteria andData05NotBetween(Integer value1, Integer value2) {
            addCriterion("Data05 not between", value1, value2, "data05");
            return (Criteria) this;
        }

        public Criteria andData06IsNull() {
            addCriterion("Data06 is null");
            return (Criteria) this;
        }

        public Criteria andData06IsNotNull() {
            addCriterion("Data06 is not null");
            return (Criteria) this;
        }

        public Criteria andData06EqualTo(Integer value) {
            addCriterion("Data06 =", value, "data06");
            return (Criteria) this;
        }

        public Criteria andData06NotEqualTo(Integer value) {
            addCriterion("Data06 <>", value, "data06");
            return (Criteria) this;
        }

        public Criteria andData06GreaterThan(Integer value) {
            addCriterion("Data06 >", value, "data06");
            return (Criteria) this;
        }

        public Criteria andData06GreaterThanOrEqualTo(Integer value) {
            addCriterion("Data06 >=", value, "data06");
            return (Criteria) this;
        }

        public Criteria andData06LessThan(Integer value) {
            addCriterion("Data06 <", value, "data06");
            return (Criteria) this;
        }

        public Criteria andData06LessThanOrEqualTo(Integer value) {
            addCriterion("Data06 <=", value, "data06");
            return (Criteria) this;
        }

        public Criteria andData06In(List<Integer> values) {
            addCriterion("Data06 in", values, "data06");
            return (Criteria) this;
        }

        public Criteria andData06NotIn(List<Integer> values) {
            addCriterion("Data06 not in", values, "data06");
            return (Criteria) this;
        }

        public Criteria andData06Between(Integer value1, Integer value2) {
            addCriterion("Data06 between", value1, value2, "data06");
            return (Criteria) this;
        }

        public Criteria andData06NotBetween(Integer value1, Integer value2) {
            addCriterion("Data06 not between", value1, value2, "data06");
            return (Criteria) this;
        }

        public Criteria andData07IsNull() {
            addCriterion("Data07 is null");
            return (Criteria) this;
        }

        public Criteria andData07IsNotNull() {
            addCriterion("Data07 is not null");
            return (Criteria) this;
        }

        public Criteria andData07EqualTo(Integer value) {
            addCriterion("Data07 =", value, "data07");
            return (Criteria) this;
        }

        public Criteria andData07NotEqualTo(Integer value) {
            addCriterion("Data07 <>", value, "data07");
            return (Criteria) this;
        }

        public Criteria andData07GreaterThan(Integer value) {
            addCriterion("Data07 >", value, "data07");
            return (Criteria) this;
        }

        public Criteria andData07GreaterThanOrEqualTo(Integer value) {
            addCriterion("Data07 >=", value, "data07");
            return (Criteria) this;
        }

        public Criteria andData07LessThan(Integer value) {
            addCriterion("Data07 <", value, "data07");
            return (Criteria) this;
        }

        public Criteria andData07LessThanOrEqualTo(Integer value) {
            addCriterion("Data07 <=", value, "data07");
            return (Criteria) this;
        }

        public Criteria andData07In(List<Integer> values) {
            addCriterion("Data07 in", values, "data07");
            return (Criteria) this;
        }

        public Criteria andData07NotIn(List<Integer> values) {
            addCriterion("Data07 not in", values, "data07");
            return (Criteria) this;
        }

        public Criteria andData07Between(Integer value1, Integer value2) {
            addCriterion("Data07 between", value1, value2, "data07");
            return (Criteria) this;
        }

        public Criteria andData07NotBetween(Integer value1, Integer value2) {
            addCriterion("Data07 not between", value1, value2, "data07");
            return (Criteria) this;
        }

        public Criteria andData08IsNull() {
            addCriterion("Data08 is null");
            return (Criteria) this;
        }

        public Criteria andData08IsNotNull() {
            addCriterion("Data08 is not null");
            return (Criteria) this;
        }

        public Criteria andData08EqualTo(Integer value) {
            addCriterion("Data08 =", value, "data08");
            return (Criteria) this;
        }

        public Criteria andData08NotEqualTo(Integer value) {
            addCriterion("Data08 <>", value, "data08");
            return (Criteria) this;
        }

        public Criteria andData08GreaterThan(Integer value) {
            addCriterion("Data08 >", value, "data08");
            return (Criteria) this;
        }

        public Criteria andData08GreaterThanOrEqualTo(Integer value) {
            addCriterion("Data08 >=", value, "data08");
            return (Criteria) this;
        }

        public Criteria andData08LessThan(Integer value) {
            addCriterion("Data08 <", value, "data08");
            return (Criteria) this;
        }

        public Criteria andData08LessThanOrEqualTo(Integer value) {
            addCriterion("Data08 <=", value, "data08");
            return (Criteria) this;
        }

        public Criteria andData08In(List<Integer> values) {
            addCriterion("Data08 in", values, "data08");
            return (Criteria) this;
        }

        public Criteria andData08NotIn(List<Integer> values) {
            addCriterion("Data08 not in", values, "data08");
            return (Criteria) this;
        }

        public Criteria andData08Between(Integer value1, Integer value2) {
            addCriterion("Data08 between", value1, value2, "data08");
            return (Criteria) this;
        }

        public Criteria andData08NotBetween(Integer value1, Integer value2) {
            addCriterion("Data08 not between", value1, value2, "data08");
            return (Criteria) this;
        }

        public Criteria andData09IsNull() {
            addCriterion("Data09 is null");
            return (Criteria) this;
        }

        public Criteria andData09IsNotNull() {
            addCriterion("Data09 is not null");
            return (Criteria) this;
        }

        public Criteria andData09EqualTo(Integer value) {
            addCriterion("Data09 =", value, "data09");
            return (Criteria) this;
        }

        public Criteria andData09NotEqualTo(Integer value) {
            addCriterion("Data09 <>", value, "data09");
            return (Criteria) this;
        }

        public Criteria andData09GreaterThan(Integer value) {
            addCriterion("Data09 >", value, "data09");
            return (Criteria) this;
        }

        public Criteria andData09GreaterThanOrEqualTo(Integer value) {
            addCriterion("Data09 >=", value, "data09");
            return (Criteria) this;
        }

        public Criteria andData09LessThan(Integer value) {
            addCriterion("Data09 <", value, "data09");
            return (Criteria) this;
        }

        public Criteria andData09LessThanOrEqualTo(Integer value) {
            addCriterion("Data09 <=", value, "data09");
            return (Criteria) this;
        }

        public Criteria andData09In(List<Integer> values) {
            addCriterion("Data09 in", values, "data09");
            return (Criteria) this;
        }

        public Criteria andData09NotIn(List<Integer> values) {
            addCriterion("Data09 not in", values, "data09");
            return (Criteria) this;
        }

        public Criteria andData09Between(Integer value1, Integer value2) {
            addCriterion("Data09 between", value1, value2, "data09");
            return (Criteria) this;
        }

        public Criteria andData09NotBetween(Integer value1, Integer value2) {
            addCriterion("Data09 not between", value1, value2, "data09");
            return (Criteria) this;
        }

        public Criteria andData0aIsNull() {
            addCriterion("Data0A is null");
            return (Criteria) this;
        }

        public Criteria andData0aIsNotNull() {
            addCriterion("Data0A is not null");
            return (Criteria) this;
        }

        public Criteria andData0aEqualTo(Integer value) {
            addCriterion("Data0A =", value, "data0a");
            return (Criteria) this;
        }

        public Criteria andData0aNotEqualTo(Integer value) {
            addCriterion("Data0A <>", value, "data0a");
            return (Criteria) this;
        }

        public Criteria andData0aGreaterThan(Integer value) {
            addCriterion("Data0A >", value, "data0a");
            return (Criteria) this;
        }

        public Criteria andData0aGreaterThanOrEqualTo(Integer value) {
            addCriterion("Data0A >=", value, "data0a");
            return (Criteria) this;
        }

        public Criteria andData0aLessThan(Integer value) {
            addCriterion("Data0A <", value, "data0a");
            return (Criteria) this;
        }

        public Criteria andData0aLessThanOrEqualTo(Integer value) {
            addCriterion("Data0A <=", value, "data0a");
            return (Criteria) this;
        }

        public Criteria andData0aIn(List<Integer> values) {
            addCriterion("Data0A in", values, "data0a");
            return (Criteria) this;
        }

        public Criteria andData0aNotIn(List<Integer> values) {
            addCriterion("Data0A not in", values, "data0a");
            return (Criteria) this;
        }

        public Criteria andData0aBetween(Integer value1, Integer value2) {
            addCriterion("Data0A between", value1, value2, "data0a");
            return (Criteria) this;
        }

        public Criteria andData0aNotBetween(Integer value1, Integer value2) {
            addCriterion("Data0A not between", value1, value2, "data0a");
            return (Criteria) this;
        }

        public Criteria andData0bIsNull() {
            addCriterion("Data0B is null");
            return (Criteria) this;
        }

        public Criteria andData0bIsNotNull() {
            addCriterion("Data0B is not null");
            return (Criteria) this;
        }

        public Criteria andData0bEqualTo(Integer value) {
            addCriterion("Data0B =", value, "data0b");
            return (Criteria) this;
        }

        public Criteria andData0bNotEqualTo(Integer value) {
            addCriterion("Data0B <>", value, "data0b");
            return (Criteria) this;
        }

        public Criteria andData0bGreaterThan(Integer value) {
            addCriterion("Data0B >", value, "data0b");
            return (Criteria) this;
        }

        public Criteria andData0bGreaterThanOrEqualTo(Integer value) {
            addCriterion("Data0B >=", value, "data0b");
            return (Criteria) this;
        }

        public Criteria andData0bLessThan(Integer value) {
            addCriterion("Data0B <", value, "data0b");
            return (Criteria) this;
        }

        public Criteria andData0bLessThanOrEqualTo(Integer value) {
            addCriterion("Data0B <=", value, "data0b");
            return (Criteria) this;
        }

        public Criteria andData0bIn(List<Integer> values) {
            addCriterion("Data0B in", values, "data0b");
            return (Criteria) this;
        }

        public Criteria andData0bNotIn(List<Integer> values) {
            addCriterion("Data0B not in", values, "data0b");
            return (Criteria) this;
        }

        public Criteria andData0bBetween(Integer value1, Integer value2) {
            addCriterion("Data0B between", value1, value2, "data0b");
            return (Criteria) this;
        }

        public Criteria andData0bNotBetween(Integer value1, Integer value2) {
            addCriterion("Data0B not between", value1, value2, "data0b");
            return (Criteria) this;
        }

        public Criteria andData0cIsNull() {
            addCriterion("Data0C is null");
            return (Criteria) this;
        }

        public Criteria andData0cIsNotNull() {
            addCriterion("Data0C is not null");
            return (Criteria) this;
        }

        public Criteria andData0cEqualTo(Integer value) {
            addCriterion("Data0C =", value, "data0c");
            return (Criteria) this;
        }

        public Criteria andData0cNotEqualTo(Integer value) {
            addCriterion("Data0C <>", value, "data0c");
            return (Criteria) this;
        }

        public Criteria andData0cGreaterThan(Integer value) {
            addCriterion("Data0C >", value, "data0c");
            return (Criteria) this;
        }

        public Criteria andData0cGreaterThanOrEqualTo(Integer value) {
            addCriterion("Data0C >=", value, "data0c");
            return (Criteria) this;
        }

        public Criteria andData0cLessThan(Integer value) {
            addCriterion("Data0C <", value, "data0c");
            return (Criteria) this;
        }

        public Criteria andData0cLessThanOrEqualTo(Integer value) {
            addCriterion("Data0C <=", value, "data0c");
            return (Criteria) this;
        }

        public Criteria andData0cIn(List<Integer> values) {
            addCriterion("Data0C in", values, "data0c");
            return (Criteria) this;
        }

        public Criteria andData0cNotIn(List<Integer> values) {
            addCriterion("Data0C not in", values, "data0c");
            return (Criteria) this;
        }

        public Criteria andData0cBetween(Integer value1, Integer value2) {
            addCriterion("Data0C between", value1, value2, "data0c");
            return (Criteria) this;
        }

        public Criteria andData0cNotBetween(Integer value1, Integer value2) {
            addCriterion("Data0C not between", value1, value2, "data0c");
            return (Criteria) this;
        }

        public Criteria andData0dIsNull() {
            addCriterion("Data0D is null");
            return (Criteria) this;
        }

        public Criteria andData0dIsNotNull() {
            addCriterion("Data0D is not null");
            return (Criteria) this;
        }

        public Criteria andData0dEqualTo(Integer value) {
            addCriterion("Data0D =", value, "data0d");
            return (Criteria) this;
        }

        public Criteria andData0dNotEqualTo(Integer value) {
            addCriterion("Data0D <>", value, "data0d");
            return (Criteria) this;
        }

        public Criteria andData0dGreaterThan(Integer value) {
            addCriterion("Data0D >", value, "data0d");
            return (Criteria) this;
        }

        public Criteria andData0dGreaterThanOrEqualTo(Integer value) {
            addCriterion("Data0D >=", value, "data0d");
            return (Criteria) this;
        }

        public Criteria andData0dLessThan(Integer value) {
            addCriterion("Data0D <", value, "data0d");
            return (Criteria) this;
        }

        public Criteria andData0dLessThanOrEqualTo(Integer value) {
            addCriterion("Data0D <=", value, "data0d");
            return (Criteria) this;
        }

        public Criteria andData0dIn(List<Integer> values) {
            addCriterion("Data0D in", values, "data0d");
            return (Criteria) this;
        }

        public Criteria andData0dNotIn(List<Integer> values) {
            addCriterion("Data0D not in", values, "data0d");
            return (Criteria) this;
        }

        public Criteria andData0dBetween(Integer value1, Integer value2) {
            addCriterion("Data0D between", value1, value2, "data0d");
            return (Criteria) this;
        }

        public Criteria andData0dNotBetween(Integer value1, Integer value2) {
            addCriterion("Data0D not between", value1, value2, "data0d");
            return (Criteria) this;
        }

        public Criteria andData0eIsNull() {
            addCriterion("Data0E is null");
            return (Criteria) this;
        }

        public Criteria andData0eIsNotNull() {
            addCriterion("Data0E is not null");
            return (Criteria) this;
        }

        public Criteria andData0eEqualTo(Integer value) {
            addCriterion("Data0E =", value, "data0e");
            return (Criteria) this;
        }

        public Criteria andData0eNotEqualTo(Integer value) {
            addCriterion("Data0E <>", value, "data0e");
            return (Criteria) this;
        }

        public Criteria andData0eGreaterThan(Integer value) {
            addCriterion("Data0E >", value, "data0e");
            return (Criteria) this;
        }

        public Criteria andData0eGreaterThanOrEqualTo(Integer value) {
            addCriterion("Data0E >=", value, "data0e");
            return (Criteria) this;
        }

        public Criteria andData0eLessThan(Integer value) {
            addCriterion("Data0E <", value, "data0e");
            return (Criteria) this;
        }

        public Criteria andData0eLessThanOrEqualTo(Integer value) {
            addCriterion("Data0E <=", value, "data0e");
            return (Criteria) this;
        }

        public Criteria andData0eIn(List<Integer> values) {
            addCriterion("Data0E in", values, "data0e");
            return (Criteria) this;
        }

        public Criteria andData0eNotIn(List<Integer> values) {
            addCriterion("Data0E not in", values, "data0e");
            return (Criteria) this;
        }

        public Criteria andData0eBetween(Integer value1, Integer value2) {
            addCriterion("Data0E between", value1, value2, "data0e");
            return (Criteria) this;
        }

        public Criteria andData0eNotBetween(Integer value1, Integer value2) {
            addCriterion("Data0E not between", value1, value2, "data0e");
            return (Criteria) this;
        }

        public Criteria andData0fIsNull() {
            addCriterion("Data0F is null");
            return (Criteria) this;
        }

        public Criteria andData0fIsNotNull() {
            addCriterion("Data0F is not null");
            return (Criteria) this;
        }

        public Criteria andData0fEqualTo(Integer value) {
            addCriterion("Data0F =", value, "data0f");
            return (Criteria) this;
        }

        public Criteria andData0fNotEqualTo(Integer value) {
            addCriterion("Data0F <>", value, "data0f");
            return (Criteria) this;
        }

        public Criteria andData0fGreaterThan(Integer value) {
            addCriterion("Data0F >", value, "data0f");
            return (Criteria) this;
        }

        public Criteria andData0fGreaterThanOrEqualTo(Integer value) {
            addCriterion("Data0F >=", value, "data0f");
            return (Criteria) this;
        }

        public Criteria andData0fLessThan(Integer value) {
            addCriterion("Data0F <", value, "data0f");
            return (Criteria) this;
        }

        public Criteria andData0fLessThanOrEqualTo(Integer value) {
            addCriterion("Data0F <=", value, "data0f");
            return (Criteria) this;
        }

        public Criteria andData0fIn(List<Integer> values) {
            addCriterion("Data0F in", values, "data0f");
            return (Criteria) this;
        }

        public Criteria andData0fNotIn(List<Integer> values) {
            addCriterion("Data0F not in", values, "data0f");
            return (Criteria) this;
        }

        public Criteria andData0fBetween(Integer value1, Integer value2) {
            addCriterion("Data0F between", value1, value2, "data0f");
            return (Criteria) this;
        }

        public Criteria andData0fNotBetween(Integer value1, Integer value2) {
            addCriterion("Data0F not between", value1, value2, "data0f");
            return (Criteria) this;
        }

        public Criteria andData10IsNull() {
            addCriterion("Data10 is null");
            return (Criteria) this;
        }

        public Criteria andData10IsNotNull() {
            addCriterion("Data10 is not null");
            return (Criteria) this;
        }

        public Criteria andData10EqualTo(Integer value) {
            addCriterion("Data10 =", value, "data10");
            return (Criteria) this;
        }

        public Criteria andData10NotEqualTo(Integer value) {
            addCriterion("Data10 <>", value, "data10");
            return (Criteria) this;
        }

        public Criteria andData10GreaterThan(Integer value) {
            addCriterion("Data10 >", value, "data10");
            return (Criteria) this;
        }

        public Criteria andData10GreaterThanOrEqualTo(Integer value) {
            addCriterion("Data10 >=", value, "data10");
            return (Criteria) this;
        }

        public Criteria andData10LessThan(Integer value) {
            addCriterion("Data10 <", value, "data10");
            return (Criteria) this;
        }

        public Criteria andData10LessThanOrEqualTo(Integer value) {
            addCriterion("Data10 <=", value, "data10");
            return (Criteria) this;
        }

        public Criteria andData10In(List<Integer> values) {
            addCriterion("Data10 in", values, "data10");
            return (Criteria) this;
        }

        public Criteria andData10NotIn(List<Integer> values) {
            addCriterion("Data10 not in", values, "data10");
            return (Criteria) this;
        }

        public Criteria andData10Between(Integer value1, Integer value2) {
            addCriterion("Data10 between", value1, value2, "data10");
            return (Criteria) this;
        }

        public Criteria andData10NotBetween(Integer value1, Integer value2) {
            addCriterion("Data10 not between", value1, value2, "data10");
            return (Criteria) this;
        }

        public Criteria andData11IsNull() {
            addCriterion("Data11 is null");
            return (Criteria) this;
        }

        public Criteria andData11IsNotNull() {
            addCriterion("Data11 is not null");
            return (Criteria) this;
        }

        public Criteria andData11EqualTo(Integer value) {
            addCriterion("Data11 =", value, "data11");
            return (Criteria) this;
        }

        public Criteria andData11NotEqualTo(Integer value) {
            addCriterion("Data11 <>", value, "data11");
            return (Criteria) this;
        }

        public Criteria andData11GreaterThan(Integer value) {
            addCriterion("Data11 >", value, "data11");
            return (Criteria) this;
        }

        public Criteria andData11GreaterThanOrEqualTo(Integer value) {
            addCriterion("Data11 >=", value, "data11");
            return (Criteria) this;
        }

        public Criteria andData11LessThan(Integer value) {
            addCriterion("Data11 <", value, "data11");
            return (Criteria) this;
        }

        public Criteria andData11LessThanOrEqualTo(Integer value) {
            addCriterion("Data11 <=", value, "data11");
            return (Criteria) this;
        }

        public Criteria andData11In(List<Integer> values) {
            addCriterion("Data11 in", values, "data11");
            return (Criteria) this;
        }

        public Criteria andData11NotIn(List<Integer> values) {
            addCriterion("Data11 not in", values, "data11");
            return (Criteria) this;
        }

        public Criteria andData11Between(Integer value1, Integer value2) {
            addCriterion("Data11 between", value1, value2, "data11");
            return (Criteria) this;
        }

        public Criteria andData11NotBetween(Integer value1, Integer value2) {
            addCriterion("Data11 not between", value1, value2, "data11");
            return (Criteria) this;
        }

        public Criteria andData12IsNull() {
            addCriterion("Data12 is null");
            return (Criteria) this;
        }

        public Criteria andData12IsNotNull() {
            addCriterion("Data12 is not null");
            return (Criteria) this;
        }

        public Criteria andData12EqualTo(Integer value) {
            addCriterion("Data12 =", value, "data12");
            return (Criteria) this;
        }

        public Criteria andData12NotEqualTo(Integer value) {
            addCriterion("Data12 <>", value, "data12");
            return (Criteria) this;
        }

        public Criteria andData12GreaterThan(Integer value) {
            addCriterion("Data12 >", value, "data12");
            return (Criteria) this;
        }

        public Criteria andData12GreaterThanOrEqualTo(Integer value) {
            addCriterion("Data12 >=", value, "data12");
            return (Criteria) this;
        }

        public Criteria andData12LessThan(Integer value) {
            addCriterion("Data12 <", value, "data12");
            return (Criteria) this;
        }

        public Criteria andData12LessThanOrEqualTo(Integer value) {
            addCriterion("Data12 <=", value, "data12");
            return (Criteria) this;
        }

        public Criteria andData12In(List<Integer> values) {
            addCriterion("Data12 in", values, "data12");
            return (Criteria) this;
        }

        public Criteria andData12NotIn(List<Integer> values) {
            addCriterion("Data12 not in", values, "data12");
            return (Criteria) this;
        }

        public Criteria andData12Between(Integer value1, Integer value2) {
            addCriterion("Data12 between", value1, value2, "data12");
            return (Criteria) this;
        }

        public Criteria andData12NotBetween(Integer value1, Integer value2) {
            addCriterion("Data12 not between", value1, value2, "data12");
            return (Criteria) this;
        }

        public Criteria andData13IsNull() {
            addCriterion("Data13 is null");
            return (Criteria) this;
        }

        public Criteria andData13IsNotNull() {
            addCriterion("Data13 is not null");
            return (Criteria) this;
        }

        public Criteria andData13EqualTo(Integer value) {
            addCriterion("Data13 =", value, "data13");
            return (Criteria) this;
        }

        public Criteria andData13NotEqualTo(Integer value) {
            addCriterion("Data13 <>", value, "data13");
            return (Criteria) this;
        }

        public Criteria andData13GreaterThan(Integer value) {
            addCriterion("Data13 >", value, "data13");
            return (Criteria) this;
        }

        public Criteria andData13GreaterThanOrEqualTo(Integer value) {
            addCriterion("Data13 >=", value, "data13");
            return (Criteria) this;
        }

        public Criteria andData13LessThan(Integer value) {
            addCriterion("Data13 <", value, "data13");
            return (Criteria) this;
        }

        public Criteria andData13LessThanOrEqualTo(Integer value) {
            addCriterion("Data13 <=", value, "data13");
            return (Criteria) this;
        }

        public Criteria andData13In(List<Integer> values) {
            addCriterion("Data13 in", values, "data13");
            return (Criteria) this;
        }

        public Criteria andData13NotIn(List<Integer> values) {
            addCriterion("Data13 not in", values, "data13");
            return (Criteria) this;
        }

        public Criteria andData13Between(Integer value1, Integer value2) {
            addCriterion("Data13 between", value1, value2, "data13");
            return (Criteria) this;
        }

        public Criteria andData13NotBetween(Integer value1, Integer value2) {
            addCriterion("Data13 not between", value1, value2, "data13");
            return (Criteria) this;
        }

        public Criteria andData14IsNull() {
            addCriterion("Data14 is null");
            return (Criteria) this;
        }

        public Criteria andData14IsNotNull() {
            addCriterion("Data14 is not null");
            return (Criteria) this;
        }

        public Criteria andData14EqualTo(Integer value) {
            addCriterion("Data14 =", value, "data14");
            return (Criteria) this;
        }

        public Criteria andData14NotEqualTo(Integer value) {
            addCriterion("Data14 <>", value, "data14");
            return (Criteria) this;
        }

        public Criteria andData14GreaterThan(Integer value) {
            addCriterion("Data14 >", value, "data14");
            return (Criteria) this;
        }

        public Criteria andData14GreaterThanOrEqualTo(Integer value) {
            addCriterion("Data14 >=", value, "data14");
            return (Criteria) this;
        }

        public Criteria andData14LessThan(Integer value) {
            addCriterion("Data14 <", value, "data14");
            return (Criteria) this;
        }

        public Criteria andData14LessThanOrEqualTo(Integer value) {
            addCriterion("Data14 <=", value, "data14");
            return (Criteria) this;
        }

        public Criteria andData14In(List<Integer> values) {
            addCriterion("Data14 in", values, "data14");
            return (Criteria) this;
        }

        public Criteria andData14NotIn(List<Integer> values) {
            addCriterion("Data14 not in", values, "data14");
            return (Criteria) this;
        }

        public Criteria andData14Between(Integer value1, Integer value2) {
            addCriterion("Data14 between", value1, value2, "data14");
            return (Criteria) this;
        }

        public Criteria andData14NotBetween(Integer value1, Integer value2) {
            addCriterion("Data14 not between", value1, value2, "data14");
            return (Criteria) this;
        }

        public Criteria andData15IsNull() {
            addCriterion("Data15 is null");
            return (Criteria) this;
        }

        public Criteria andData15IsNotNull() {
            addCriterion("Data15 is not null");
            return (Criteria) this;
        }

        public Criteria andData15EqualTo(Integer value) {
            addCriterion("Data15 =", value, "data15");
            return (Criteria) this;
        }

        public Criteria andData15NotEqualTo(Integer value) {
            addCriterion("Data15 <>", value, "data15");
            return (Criteria) this;
        }

        public Criteria andData15GreaterThan(Integer value) {
            addCriterion("Data15 >", value, "data15");
            return (Criteria) this;
        }

        public Criteria andData15GreaterThanOrEqualTo(Integer value) {
            addCriterion("Data15 >=", value, "data15");
            return (Criteria) this;
        }

        public Criteria andData15LessThan(Integer value) {
            addCriterion("Data15 <", value, "data15");
            return (Criteria) this;
        }

        public Criteria andData15LessThanOrEqualTo(Integer value) {
            addCriterion("Data15 <=", value, "data15");
            return (Criteria) this;
        }

        public Criteria andData15In(List<Integer> values) {
            addCriterion("Data15 in", values, "data15");
            return (Criteria) this;
        }

        public Criteria andData15NotIn(List<Integer> values) {
            addCriterion("Data15 not in", values, "data15");
            return (Criteria) this;
        }

        public Criteria andData15Between(Integer value1, Integer value2) {
            addCriterion("Data15 between", value1, value2, "data15");
            return (Criteria) this;
        }

        public Criteria andData15NotBetween(Integer value1, Integer value2) {
            addCriterion("Data15 not between", value1, value2, "data15");
            return (Criteria) this;
        }

        public Criteria andData16IsNull() {
            addCriterion("Data16 is null");
            return (Criteria) this;
        }

        public Criteria andData16IsNotNull() {
            addCriterion("Data16 is not null");
            return (Criteria) this;
        }

        public Criteria andData16EqualTo(Integer value) {
            addCriterion("Data16 =", value, "data16");
            return (Criteria) this;
        }

        public Criteria andData16NotEqualTo(Integer value) {
            addCriterion("Data16 <>", value, "data16");
            return (Criteria) this;
        }

        public Criteria andData16GreaterThan(Integer value) {
            addCriterion("Data16 >", value, "data16");
            return (Criteria) this;
        }

        public Criteria andData16GreaterThanOrEqualTo(Integer value) {
            addCriterion("Data16 >=", value, "data16");
            return (Criteria) this;
        }

        public Criteria andData16LessThan(Integer value) {
            addCriterion("Data16 <", value, "data16");
            return (Criteria) this;
        }

        public Criteria andData16LessThanOrEqualTo(Integer value) {
            addCriterion("Data16 <=", value, "data16");
            return (Criteria) this;
        }

        public Criteria andData16In(List<Integer> values) {
            addCriterion("Data16 in", values, "data16");
            return (Criteria) this;
        }

        public Criteria andData16NotIn(List<Integer> values) {
            addCriterion("Data16 not in", values, "data16");
            return (Criteria) this;
        }

        public Criteria andData16Between(Integer value1, Integer value2) {
            addCriterion("Data16 between", value1, value2, "data16");
            return (Criteria) this;
        }

        public Criteria andData16NotBetween(Integer value1, Integer value2) {
            addCriterion("Data16 not between", value1, value2, "data16");
            return (Criteria) this;
        }

        public Criteria andData17IsNull() {
            addCriterion("Data17 is null");
            return (Criteria) this;
        }

        public Criteria andData17IsNotNull() {
            addCriterion("Data17 is not null");
            return (Criteria) this;
        }

        public Criteria andData17EqualTo(Integer value) {
            addCriterion("Data17 =", value, "data17");
            return (Criteria) this;
        }

        public Criteria andData17NotEqualTo(Integer value) {
            addCriterion("Data17 <>", value, "data17");
            return (Criteria) this;
        }

        public Criteria andData17GreaterThan(Integer value) {
            addCriterion("Data17 >", value, "data17");
            return (Criteria) this;
        }

        public Criteria andData17GreaterThanOrEqualTo(Integer value) {
            addCriterion("Data17 >=", value, "data17");
            return (Criteria) this;
        }

        public Criteria andData17LessThan(Integer value) {
            addCriterion("Data17 <", value, "data17");
            return (Criteria) this;
        }

        public Criteria andData17LessThanOrEqualTo(Integer value) {
            addCriterion("Data17 <=", value, "data17");
            return (Criteria) this;
        }

        public Criteria andData17In(List<Integer> values) {
            addCriterion("Data17 in", values, "data17");
            return (Criteria) this;
        }

        public Criteria andData17NotIn(List<Integer> values) {
            addCriterion("Data17 not in", values, "data17");
            return (Criteria) this;
        }

        public Criteria andData17Between(Integer value1, Integer value2) {
            addCriterion("Data17 between", value1, value2, "data17");
            return (Criteria) this;
        }

        public Criteria andData17NotBetween(Integer value1, Integer value2) {
            addCriterion("Data17 not between", value1, value2, "data17");
            return (Criteria) this;
        }

        public Criteria andData18IsNull() {
            addCriterion("Data18 is null");
            return (Criteria) this;
        }

        public Criteria andData18IsNotNull() {
            addCriterion("Data18 is not null");
            return (Criteria) this;
        }

        public Criteria andData18EqualTo(Integer value) {
            addCriterion("Data18 =", value, "data18");
            return (Criteria) this;
        }

        public Criteria andData18NotEqualTo(Integer value) {
            addCriterion("Data18 <>", value, "data18");
            return (Criteria) this;
        }

        public Criteria andData18GreaterThan(Integer value) {
            addCriterion("Data18 >", value, "data18");
            return (Criteria) this;
        }

        public Criteria andData18GreaterThanOrEqualTo(Integer value) {
            addCriterion("Data18 >=", value, "data18");
            return (Criteria) this;
        }

        public Criteria andData18LessThan(Integer value) {
            addCriterion("Data18 <", value, "data18");
            return (Criteria) this;
        }

        public Criteria andData18LessThanOrEqualTo(Integer value) {
            addCriterion("Data18 <=", value, "data18");
            return (Criteria) this;
        }

        public Criteria andData18In(List<Integer> values) {
            addCriterion("Data18 in", values, "data18");
            return (Criteria) this;
        }

        public Criteria andData18NotIn(List<Integer> values) {
            addCriterion("Data18 not in", values, "data18");
            return (Criteria) this;
        }

        public Criteria andData18Between(Integer value1, Integer value2) {
            addCriterion("Data18 between", value1, value2, "data18");
            return (Criteria) this;
        }

        public Criteria andData18NotBetween(Integer value1, Integer value2) {
            addCriterion("Data18 not between", value1, value2, "data18");
            return (Criteria) this;
        }

        public Criteria andData19IsNull() {
            addCriterion("Data19 is null");
            return (Criteria) this;
        }

        public Criteria andData19IsNotNull() {
            addCriterion("Data19 is not null");
            return (Criteria) this;
        }

        public Criteria andData19EqualTo(Integer value) {
            addCriterion("Data19 =", value, "data19");
            return (Criteria) this;
        }

        public Criteria andData19NotEqualTo(Integer value) {
            addCriterion("Data19 <>", value, "data19");
            return (Criteria) this;
        }

        public Criteria andData19GreaterThan(Integer value) {
            addCriterion("Data19 >", value, "data19");
            return (Criteria) this;
        }

        public Criteria andData19GreaterThanOrEqualTo(Integer value) {
            addCriterion("Data19 >=", value, "data19");
            return (Criteria) this;
        }

        public Criteria andData19LessThan(Integer value) {
            addCriterion("Data19 <", value, "data19");
            return (Criteria) this;
        }

        public Criteria andData19LessThanOrEqualTo(Integer value) {
            addCriterion("Data19 <=", value, "data19");
            return (Criteria) this;
        }

        public Criteria andData19In(List<Integer> values) {
            addCriterion("Data19 in", values, "data19");
            return (Criteria) this;
        }

        public Criteria andData19NotIn(List<Integer> values) {
            addCriterion("Data19 not in", values, "data19");
            return (Criteria) this;
        }

        public Criteria andData19Between(Integer value1, Integer value2) {
            addCriterion("Data19 between", value1, value2, "data19");
            return (Criteria) this;
        }

        public Criteria andData19NotBetween(Integer value1, Integer value2) {
            addCriterion("Data19 not between", value1, value2, "data19");
            return (Criteria) this;
        }

        public Criteria andData1aIsNull() {
            addCriterion("Data1A is null");
            return (Criteria) this;
        }

        public Criteria andData1aIsNotNull() {
            addCriterion("Data1A is not null");
            return (Criteria) this;
        }

        public Criteria andData1aEqualTo(Integer value) {
            addCriterion("Data1A =", value, "data1a");
            return (Criteria) this;
        }

        public Criteria andData1aNotEqualTo(Integer value) {
            addCriterion("Data1A <>", value, "data1a");
            return (Criteria) this;
        }

        public Criteria andData1aGreaterThan(Integer value) {
            addCriterion("Data1A >", value, "data1a");
            return (Criteria) this;
        }

        public Criteria andData1aGreaterThanOrEqualTo(Integer value) {
            addCriterion("Data1A >=", value, "data1a");
            return (Criteria) this;
        }

        public Criteria andData1aLessThan(Integer value) {
            addCriterion("Data1A <", value, "data1a");
            return (Criteria) this;
        }

        public Criteria andData1aLessThanOrEqualTo(Integer value) {
            addCriterion("Data1A <=", value, "data1a");
            return (Criteria) this;
        }

        public Criteria andData1aIn(List<Integer> values) {
            addCriterion("Data1A in", values, "data1a");
            return (Criteria) this;
        }

        public Criteria andData1aNotIn(List<Integer> values) {
            addCriterion("Data1A not in", values, "data1a");
            return (Criteria) this;
        }

        public Criteria andData1aBetween(Integer value1, Integer value2) {
            addCriterion("Data1A between", value1, value2, "data1a");
            return (Criteria) this;
        }

        public Criteria andData1aNotBetween(Integer value1, Integer value2) {
            addCriterion("Data1A not between", value1, value2, "data1a");
            return (Criteria) this;
        }

        public Criteria andData1bIsNull() {
            addCriterion("Data1B is null");
            return (Criteria) this;
        }

        public Criteria andData1bIsNotNull() {
            addCriterion("Data1B is not null");
            return (Criteria) this;
        }

        public Criteria andData1bEqualTo(Integer value) {
            addCriterion("Data1B =", value, "data1b");
            return (Criteria) this;
        }

        public Criteria andData1bNotEqualTo(Integer value) {
            addCriterion("Data1B <>", value, "data1b");
            return (Criteria) this;
        }

        public Criteria andData1bGreaterThan(Integer value) {
            addCriterion("Data1B >", value, "data1b");
            return (Criteria) this;
        }

        public Criteria andData1bGreaterThanOrEqualTo(Integer value) {
            addCriterion("Data1B >=", value, "data1b");
            return (Criteria) this;
        }

        public Criteria andData1bLessThan(Integer value) {
            addCriterion("Data1B <", value, "data1b");
            return (Criteria) this;
        }

        public Criteria andData1bLessThanOrEqualTo(Integer value) {
            addCriterion("Data1B <=", value, "data1b");
            return (Criteria) this;
        }

        public Criteria andData1bIn(List<Integer> values) {
            addCriterion("Data1B in", values, "data1b");
            return (Criteria) this;
        }

        public Criteria andData1bNotIn(List<Integer> values) {
            addCriterion("Data1B not in", values, "data1b");
            return (Criteria) this;
        }

        public Criteria andData1bBetween(Integer value1, Integer value2) {
            addCriterion("Data1B between", value1, value2, "data1b");
            return (Criteria) this;
        }

        public Criteria andData1bNotBetween(Integer value1, Integer value2) {
            addCriterion("Data1B not between", value1, value2, "data1b");
            return (Criteria) this;
        }

        public Criteria andData1cIsNull() {
            addCriterion("Data1C is null");
            return (Criteria) this;
        }

        public Criteria andData1cIsNotNull() {
            addCriterion("Data1C is not null");
            return (Criteria) this;
        }

        public Criteria andData1cEqualTo(Integer value) {
            addCriterion("Data1C =", value, "data1c");
            return (Criteria) this;
        }

        public Criteria andData1cNotEqualTo(Integer value) {
            addCriterion("Data1C <>", value, "data1c");
            return (Criteria) this;
        }

        public Criteria andData1cGreaterThan(Integer value) {
            addCriterion("Data1C >", value, "data1c");
            return (Criteria) this;
        }

        public Criteria andData1cGreaterThanOrEqualTo(Integer value) {
            addCriterion("Data1C >=", value, "data1c");
            return (Criteria) this;
        }

        public Criteria andData1cLessThan(Integer value) {
            addCriterion("Data1C <", value, "data1c");
            return (Criteria) this;
        }

        public Criteria andData1cLessThanOrEqualTo(Integer value) {
            addCriterion("Data1C <=", value, "data1c");
            return (Criteria) this;
        }

        public Criteria andData1cIn(List<Integer> values) {
            addCriterion("Data1C in", values, "data1c");
            return (Criteria) this;
        }

        public Criteria andData1cNotIn(List<Integer> values) {
            addCriterion("Data1C not in", values, "data1c");
            return (Criteria) this;
        }

        public Criteria andData1cBetween(Integer value1, Integer value2) {
            addCriterion("Data1C between", value1, value2, "data1c");
            return (Criteria) this;
        }

        public Criteria andData1cNotBetween(Integer value1, Integer value2) {
            addCriterion("Data1C not between", value1, value2, "data1c");
            return (Criteria) this;
        }

        public Criteria andData1dIsNull() {
            addCriterion("Data1D is null");
            return (Criteria) this;
        }

        public Criteria andData1dIsNotNull() {
            addCriterion("Data1D is not null");
            return (Criteria) this;
        }

        public Criteria andData1dEqualTo(Integer value) {
            addCriterion("Data1D =", value, "data1d");
            return (Criteria) this;
        }

        public Criteria andData1dNotEqualTo(Integer value) {
            addCriterion("Data1D <>", value, "data1d");
            return (Criteria) this;
        }

        public Criteria andData1dGreaterThan(Integer value) {
            addCriterion("Data1D >", value, "data1d");
            return (Criteria) this;
        }

        public Criteria andData1dGreaterThanOrEqualTo(Integer value) {
            addCriterion("Data1D >=", value, "data1d");
            return (Criteria) this;
        }

        public Criteria andData1dLessThan(Integer value) {
            addCriterion("Data1D <", value, "data1d");
            return (Criteria) this;
        }

        public Criteria andData1dLessThanOrEqualTo(Integer value) {
            addCriterion("Data1D <=", value, "data1d");
            return (Criteria) this;
        }

        public Criteria andData1dIn(List<Integer> values) {
            addCriterion("Data1D in", values, "data1d");
            return (Criteria) this;
        }

        public Criteria andData1dNotIn(List<Integer> values) {
            addCriterion("Data1D not in", values, "data1d");
            return (Criteria) this;
        }

        public Criteria andData1dBetween(Integer value1, Integer value2) {
            addCriterion("Data1D between", value1, value2, "data1d");
            return (Criteria) this;
        }

        public Criteria andData1dNotBetween(Integer value1, Integer value2) {
            addCriterion("Data1D not between", value1, value2, "data1d");
            return (Criteria) this;
        }

        public Criteria andData1eIsNull() {
            addCriterion("Data1E is null");
            return (Criteria) this;
        }

        public Criteria andData1eIsNotNull() {
            addCriterion("Data1E is not null");
            return (Criteria) this;
        }

        public Criteria andData1eEqualTo(Integer value) {
            addCriterion("Data1E =", value, "data1e");
            return (Criteria) this;
        }

        public Criteria andData1eNotEqualTo(Integer value) {
            addCriterion("Data1E <>", value, "data1e");
            return (Criteria) this;
        }

        public Criteria andData1eGreaterThan(Integer value) {
            addCriterion("Data1E >", value, "data1e");
            return (Criteria) this;
        }

        public Criteria andData1eGreaterThanOrEqualTo(Integer value) {
            addCriterion("Data1E >=", value, "data1e");
            return (Criteria) this;
        }

        public Criteria andData1eLessThan(Integer value) {
            addCriterion("Data1E <", value, "data1e");
            return (Criteria) this;
        }

        public Criteria andData1eLessThanOrEqualTo(Integer value) {
            addCriterion("Data1E <=", value, "data1e");
            return (Criteria) this;
        }

        public Criteria andData1eIn(List<Integer> values) {
            addCriterion("Data1E in", values, "data1e");
            return (Criteria) this;
        }

        public Criteria andData1eNotIn(List<Integer> values) {
            addCriterion("Data1E not in", values, "data1e");
            return (Criteria) this;
        }

        public Criteria andData1eBetween(Integer value1, Integer value2) {
            addCriterion("Data1E between", value1, value2, "data1e");
            return (Criteria) this;
        }

        public Criteria andData1eNotBetween(Integer value1, Integer value2) {
            addCriterion("Data1E not between", value1, value2, "data1e");
            return (Criteria) this;
        }

        public Criteria andData1fIsNull() {
            addCriterion("Data1F is null");
            return (Criteria) this;
        }

        public Criteria andData1fIsNotNull() {
            addCriterion("Data1F is not null");
            return (Criteria) this;
        }

        public Criteria andData1fEqualTo(Integer value) {
            addCriterion("Data1F =", value, "data1f");
            return (Criteria) this;
        }

        public Criteria andData1fNotEqualTo(Integer value) {
            addCriterion("Data1F <>", value, "data1f");
            return (Criteria) this;
        }

        public Criteria andData1fGreaterThan(Integer value) {
            addCriterion("Data1F >", value, "data1f");
            return (Criteria) this;
        }

        public Criteria andData1fGreaterThanOrEqualTo(Integer value) {
            addCriterion("Data1F >=", value, "data1f");
            return (Criteria) this;
        }

        public Criteria andData1fLessThan(Integer value) {
            addCriterion("Data1F <", value, "data1f");
            return (Criteria) this;
        }

        public Criteria andData1fLessThanOrEqualTo(Integer value) {
            addCriterion("Data1F <=", value, "data1f");
            return (Criteria) this;
        }

        public Criteria andData1fIn(List<Integer> values) {
            addCriterion("Data1F in", values, "data1f");
            return (Criteria) this;
        }

        public Criteria andData1fNotIn(List<Integer> values) {
            addCriterion("Data1F not in", values, "data1f");
            return (Criteria) this;
        }

        public Criteria andData1fBetween(Integer value1, Integer value2) {
            addCriterion("Data1F between", value1, value2, "data1f");
            return (Criteria) this;
        }

        public Criteria andData1fNotBetween(Integer value1, Integer value2) {
            addCriterion("Data1F not between", value1, value2, "data1f");
            return (Criteria) this;
        }

        public Criteria andData20IsNull() {
            addCriterion("Data20 is null");
            return (Criteria) this;
        }

        public Criteria andData20IsNotNull() {
            addCriterion("Data20 is not null");
            return (Criteria) this;
        }

        public Criteria andData20EqualTo(Integer value) {
            addCriterion("Data20 =", value, "data20");
            return (Criteria) this;
        }

        public Criteria andData20NotEqualTo(Integer value) {
            addCriterion("Data20 <>", value, "data20");
            return (Criteria) this;
        }

        public Criteria andData20GreaterThan(Integer value) {
            addCriterion("Data20 >", value, "data20");
            return (Criteria) this;
        }

        public Criteria andData20GreaterThanOrEqualTo(Integer value) {
            addCriterion("Data20 >=", value, "data20");
            return (Criteria) this;
        }

        public Criteria andData20LessThan(Integer value) {
            addCriterion("Data20 <", value, "data20");
            return (Criteria) this;
        }

        public Criteria andData20LessThanOrEqualTo(Integer value) {
            addCriterion("Data20 <=", value, "data20");
            return (Criteria) this;
        }

        public Criteria andData20In(List<Integer> values) {
            addCriterion("Data20 in", values, "data20");
            return (Criteria) this;
        }

        public Criteria andData20NotIn(List<Integer> values) {
            addCriterion("Data20 not in", values, "data20");
            return (Criteria) this;
        }

        public Criteria andData20Between(Integer value1, Integer value2) {
            addCriterion("Data20 between", value1, value2, "data20");
            return (Criteria) this;
        }

        public Criteria andData20NotBetween(Integer value1, Integer value2) {
            addCriterion("Data20 not between", value1, value2, "data20");
            return (Criteria) this;
        }

        public Criteria andData21IsNull() {
            addCriterion("Data21 is null");
            return (Criteria) this;
        }

        public Criteria andData21IsNotNull() {
            addCriterion("Data21 is not null");
            return (Criteria) this;
        }

        public Criteria andData21EqualTo(Integer value) {
            addCriterion("Data21 =", value, "data21");
            return (Criteria) this;
        }

        public Criteria andData21NotEqualTo(Integer value) {
            addCriterion("Data21 <>", value, "data21");
            return (Criteria) this;
        }

        public Criteria andData21GreaterThan(Integer value) {
            addCriterion("Data21 >", value, "data21");
            return (Criteria) this;
        }

        public Criteria andData21GreaterThanOrEqualTo(Integer value) {
            addCriterion("Data21 >=", value, "data21");
            return (Criteria) this;
        }

        public Criteria andData21LessThan(Integer value) {
            addCriterion("Data21 <", value, "data21");
            return (Criteria) this;
        }

        public Criteria andData21LessThanOrEqualTo(Integer value) {
            addCriterion("Data21 <=", value, "data21");
            return (Criteria) this;
        }

        public Criteria andData21In(List<Integer> values) {
            addCriterion("Data21 in", values, "data21");
            return (Criteria) this;
        }

        public Criteria andData21NotIn(List<Integer> values) {
            addCriterion("Data21 not in", values, "data21");
            return (Criteria) this;
        }

        public Criteria andData21Between(Integer value1, Integer value2) {
            addCriterion("Data21 between", value1, value2, "data21");
            return (Criteria) this;
        }

        public Criteria andData21NotBetween(Integer value1, Integer value2) {
            addCriterion("Data21 not between", value1, value2, "data21");
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