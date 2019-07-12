package com.yuanian.masterdata.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InCorporatedCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InCorporatedCompanyExample() {
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

        public Criteria andFcompanyidIsNull() {
            addCriterion("FCOMPANYID is null");
            return (Criteria) this;
        }

        public Criteria andFcompanyidIsNotNull() {
            addCriterion("FCOMPANYID is not null");
            return (Criteria) this;
        }

        public Criteria andFcompanyidEqualTo(Object value) {
            addCriterion("FCOMPANYID =", value, "fcompanyid");
            return (Criteria) this;
        }

        public Criteria andFcompanyidNotEqualTo(Object value) {
            addCriterion("FCOMPANYID <>", value, "fcompanyid");
            return (Criteria) this;
        }

        public Criteria andFcompanyidGreaterThan(Object value) {
            addCriterion("FCOMPANYID >", value, "fcompanyid");
            return (Criteria) this;
        }

        public Criteria andFcompanyidGreaterThanOrEqualTo(Object value) {
            addCriterion("FCOMPANYID >=", value, "fcompanyid");
            return (Criteria) this;
        }

        public Criteria andFcompanyidLessThan(Object value) {
            addCriterion("FCOMPANYID <", value, "fcompanyid");
            return (Criteria) this;
        }

        public Criteria andFcompanyidLessThanOrEqualTo(Object value) {
            addCriterion("FCOMPANYID <=", value, "fcompanyid");
            return (Criteria) this;
        }

        public Criteria andFcompanyidIn(List<Object> values) {
            addCriterion("FCOMPANYID in", values, "fcompanyid");
            return (Criteria) this;
        }

        public Criteria andFcompanyidNotIn(List<Object> values) {
            addCriterion("FCOMPANYID not in", values, "fcompanyid");
            return (Criteria) this;
        }

        public Criteria andFcompanyidBetween(Object value1, Object value2) {
            addCriterion("FCOMPANYID between", value1, value2, "fcompanyid");
            return (Criteria) this;
        }

        public Criteria andFcompanyidNotBetween(Object value1, Object value2) {
            addCriterion("FCOMPANYID not between", value1, value2, "fcompanyid");
            return (Criteria) this;
        }

        public Criteria andFcompanycodeIsNull() {
            addCriterion("FCOMPANYCODE is null");
            return (Criteria) this;
        }

        public Criteria andFcompanycodeIsNotNull() {
            addCriterion("FCOMPANYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFcompanycodeEqualTo(String value) {
            addCriterion("FCOMPANYCODE =", value, "fcompanycode");
            return (Criteria) this;
        }

        public Criteria andFcompanycodeNotEqualTo(String value) {
            addCriterion("FCOMPANYCODE <>", value, "fcompanycode");
            return (Criteria) this;
        }

        public Criteria andFcompanycodeGreaterThan(String value) {
            addCriterion("FCOMPANYCODE >", value, "fcompanycode");
            return (Criteria) this;
        }

        public Criteria andFcompanycodeGreaterThanOrEqualTo(String value) {
            addCriterion("FCOMPANYCODE >=", value, "fcompanycode");
            return (Criteria) this;
        }

        public Criteria andFcompanycodeLessThan(String value) {
            addCriterion("FCOMPANYCODE <", value, "fcompanycode");
            return (Criteria) this;
        }

        public Criteria andFcompanycodeLessThanOrEqualTo(String value) {
            addCriterion("FCOMPANYCODE <=", value, "fcompanycode");
            return (Criteria) this;
        }

        public Criteria andFcompanycodeLike(String value) {
            addCriterion("FCOMPANYCODE like", value, "fcompanycode");
            return (Criteria) this;
        }

        public Criteria andFcompanycodeNotLike(String value) {
            addCriterion("FCOMPANYCODE not like", value, "fcompanycode");
            return (Criteria) this;
        }

        public Criteria andFcompanycodeIn(List<String> values) {
            addCriterion("FCOMPANYCODE in", values, "fcompanycode");
            return (Criteria) this;
        }

        public Criteria andFcompanycodeNotIn(List<String> values) {
            addCriterion("FCOMPANYCODE not in", values, "fcompanycode");
            return (Criteria) this;
        }

        public Criteria andFcompanycodeBetween(String value1, String value2) {
            addCriterion("FCOMPANYCODE between", value1, value2, "fcompanycode");
            return (Criteria) this;
        }

        public Criteria andFcompanycodeNotBetween(String value1, String value2) {
            addCriterion("FCOMPANYCODE not between", value1, value2, "fcompanycode");
            return (Criteria) this;
        }

        public Criteria andFcompanynameIsNull() {
            addCriterion("FCOMPANYNAME is null");
            return (Criteria) this;
        }

        public Criteria andFcompanynameIsNotNull() {
            addCriterion("FCOMPANYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFcompanynameEqualTo(Object value) {
            addCriterion("FCOMPANYNAME =", value, "fcompanyname");
            return (Criteria) this;
        }

        public Criteria andFcompanynameNotEqualTo(Object value) {
            addCriterion("FCOMPANYNAME <>", value, "fcompanyname");
            return (Criteria) this;
        }

        public Criteria andFcompanynameGreaterThan(Object value) {
            addCriterion("FCOMPANYNAME >", value, "fcompanyname");
            return (Criteria) this;
        }

        public Criteria andFcompanynameGreaterThanOrEqualTo(Object value) {
            addCriterion("FCOMPANYNAME >=", value, "fcompanyname");
            return (Criteria) this;
        }

        public Criteria andFcompanynameLessThan(Object value) {
            addCriterion("FCOMPANYNAME <", value, "fcompanyname");
            return (Criteria) this;
        }

        public Criteria andFcompanynameLessThanOrEqualTo(Object value) {
            addCriterion("FCOMPANYNAME <=", value, "fcompanyname");
            return (Criteria) this;
        }

        public Criteria andFcompanynameIn(List<Object> values) {
            addCriterion("FCOMPANYNAME in", values, "fcompanyname");
            return (Criteria) this;
        }

        public Criteria andFcompanynameNotIn(List<Object> values) {
            addCriterion("FCOMPANYNAME not in", values, "fcompanyname");
            return (Criteria) this;
        }

        public Criteria andFcompanynameBetween(Object value1, Object value2) {
            addCriterion("FCOMPANYNAME between", value1, value2, "fcompanyname");
            return (Criteria) this;
        }

        public Criteria andFcompanynameNotBetween(Object value1, Object value2) {
            addCriterion("FCOMPANYNAME not between", value1, value2, "fcompanyname");
            return (Criteria) this;
        }

        public Criteria andUpperidIsNull() {
            addCriterion("UPPERID is null");
            return (Criteria) this;
        }

        public Criteria andUpperidIsNotNull() {
            addCriterion("UPPERID is not null");
            return (Criteria) this;
        }

        public Criteria andUpperidEqualTo(Object value) {
            addCriterion("UPPERID =", value, "upperid");
            return (Criteria) this;
        }

        public Criteria andUpperidNotEqualTo(Object value) {
            addCriterion("UPPERID <>", value, "upperid");
            return (Criteria) this;
        }

        public Criteria andUpperidGreaterThan(Object value) {
            addCriterion("UPPERID >", value, "upperid");
            return (Criteria) this;
        }

        public Criteria andUpperidGreaterThanOrEqualTo(Object value) {
            addCriterion("UPPERID >=", value, "upperid");
            return (Criteria) this;
        }

        public Criteria andUpperidLessThan(Object value) {
            addCriterion("UPPERID <", value, "upperid");
            return (Criteria) this;
        }

        public Criteria andUpperidLessThanOrEqualTo(Object value) {
            addCriterion("UPPERID <=", value, "upperid");
            return (Criteria) this;
        }

        public Criteria andUpperidIn(List<Object> values) {
            addCriterion("UPPERID in", values, "upperid");
            return (Criteria) this;
        }

        public Criteria andUpperidNotIn(List<Object> values) {
            addCriterion("UPPERID not in", values, "upperid");
            return (Criteria) this;
        }

        public Criteria andUpperidBetween(Object value1, Object value2) {
            addCriterion("UPPERID between", value1, value2, "upperid");
            return (Criteria) this;
        }

        public Criteria andUpperidNotBetween(Object value1, Object value2) {
            addCriterion("UPPERID not between", value1, value2, "upperid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNull() {
            addCriterion("CREATEUSER is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNotNull() {
            addCriterion("CREATEUSER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserEqualTo(String value) {
            addCriterion("CREATEUSER =", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotEqualTo(String value) {
            addCriterion("CREATEUSER <>", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThan(String value) {
            addCriterion("CREATEUSER >", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEUSER >=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThan(String value) {
            addCriterion("CREATEUSER <", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThanOrEqualTo(String value) {
            addCriterion("CREATEUSER <=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLike(String value) {
            addCriterion("CREATEUSER like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotLike(String value) {
            addCriterion("CREATEUSER not like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserIn(List<String> values) {
            addCriterion("CREATEUSER in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotIn(List<String> values) {
            addCriterion("CREATEUSER not in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserBetween(String value1, String value2) {
            addCriterion("CREATEUSER between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotBetween(String value1, String value2) {
            addCriterion("CREATEUSER not between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Object value) {
            addCriterion("CREATEDATE =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Object value) {
            addCriterion("CREATEDATE <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Object value) {
            addCriterion("CREATEDATE >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Object value) {
            addCriterion("CREATEDATE >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Object value) {
            addCriterion("CREATEDATE <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Object value) {
            addCriterion("CREATEDATE <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Object> values) {
            addCriterion("CREATEDATE in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Object> values) {
            addCriterion("CREATEDATE not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Object value1, Object value2) {
            addCriterion("CREATEDATE between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Object value1, Object value2) {
            addCriterion("CREATEDATE not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andModifyuserIsNull() {
            addCriterion("MODIFYUSER is null");
            return (Criteria) this;
        }

        public Criteria andModifyuserIsNotNull() {
            addCriterion("MODIFYUSER is not null");
            return (Criteria) this;
        }

        public Criteria andModifyuserEqualTo(String value) {
            addCriterion("MODIFYUSER =", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotEqualTo(String value) {
            addCriterion("MODIFYUSER <>", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserGreaterThan(String value) {
            addCriterion("MODIFYUSER >", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFYUSER >=", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserLessThan(String value) {
            addCriterion("MODIFYUSER <", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserLessThanOrEqualTo(String value) {
            addCriterion("MODIFYUSER <=", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserLike(String value) {
            addCriterion("MODIFYUSER like", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotLike(String value) {
            addCriterion("MODIFYUSER not like", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserIn(List<String> values) {
            addCriterion("MODIFYUSER in", values, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotIn(List<String> values) {
            addCriterion("MODIFYUSER not in", values, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserBetween(String value1, String value2) {
            addCriterion("MODIFYUSER between", value1, value2, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotBetween(String value1, String value2) {
            addCriterion("MODIFYUSER not between", value1, value2, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("MODIFYDATE is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("MODIFYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Object value) {
            addCriterion("MODIFYDATE =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Object value) {
            addCriterion("MODIFYDATE <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Object value) {
            addCriterion("MODIFYDATE >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Object value) {
            addCriterion("MODIFYDATE >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Object value) {
            addCriterion("MODIFYDATE <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Object value) {
            addCriterion("MODIFYDATE <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Object> values) {
            addCriterion("MODIFYDATE in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Object> values) {
            addCriterion("MODIFYDATE not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Object value1, Object value2) {
            addCriterion("MODIFYDATE between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Object value1, Object value2) {
            addCriterion("MODIFYDATE not between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andF1IsNull() {
            addCriterion("F1 is null");
            return (Criteria) this;
        }

        public Criteria andF1IsNotNull() {
            addCriterion("F1 is not null");
            return (Criteria) this;
        }

        public Criteria andF1EqualTo(Object value) {
            addCriterion("F1 =", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotEqualTo(Object value) {
            addCriterion("F1 <>", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1GreaterThan(Object value) {
            addCriterion("F1 >", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1GreaterThanOrEqualTo(Object value) {
            addCriterion("F1 >=", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1LessThan(Object value) {
            addCriterion("F1 <", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1LessThanOrEqualTo(Object value) {
            addCriterion("F1 <=", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1In(List<Object> values) {
            addCriterion("F1 in", values, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotIn(List<Object> values) {
            addCriterion("F1 not in", values, "f1");
            return (Criteria) this;
        }

        public Criteria andF1Between(Object value1, Object value2) {
            addCriterion("F1 between", value1, value2, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotBetween(Object value1, Object value2) {
            addCriterion("F1 not between", value1, value2, "f1");
            return (Criteria) this;
        }

        public Criteria andF2IsNull() {
            addCriterion("F2 is null");
            return (Criteria) this;
        }

        public Criteria andF2IsNotNull() {
            addCriterion("F2 is not null");
            return (Criteria) this;
        }

        public Criteria andF2EqualTo(Object value) {
            addCriterion("F2 =", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotEqualTo(Object value) {
            addCriterion("F2 <>", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2GreaterThan(Object value) {
            addCriterion("F2 >", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2GreaterThanOrEqualTo(Object value) {
            addCriterion("F2 >=", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2LessThan(Object value) {
            addCriterion("F2 <", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2LessThanOrEqualTo(Object value) {
            addCriterion("F2 <=", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2In(List<Object> values) {
            addCriterion("F2 in", values, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotIn(List<Object> values) {
            addCriterion("F2 not in", values, "f2");
            return (Criteria) this;
        }

        public Criteria andF2Between(Object value1, Object value2) {
            addCriterion("F2 between", value1, value2, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotBetween(Object value1, Object value2) {
            addCriterion("F2 not between", value1, value2, "f2");
            return (Criteria) this;
        }

        public Criteria andF3IsNull() {
            addCriterion("F3 is null");
            return (Criteria) this;
        }

        public Criteria andF3IsNotNull() {
            addCriterion("F3 is not null");
            return (Criteria) this;
        }

        public Criteria andF3EqualTo(Object value) {
            addCriterion("F3 =", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotEqualTo(Object value) {
            addCriterion("F3 <>", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3GreaterThan(Object value) {
            addCriterion("F3 >", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3GreaterThanOrEqualTo(Object value) {
            addCriterion("F3 >=", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3LessThan(Object value) {
            addCriterion("F3 <", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3LessThanOrEqualTo(Object value) {
            addCriterion("F3 <=", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3In(List<Object> values) {
            addCriterion("F3 in", values, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotIn(List<Object> values) {
            addCriterion("F3 not in", values, "f3");
            return (Criteria) this;
        }

        public Criteria andF3Between(Object value1, Object value2) {
            addCriterion("F3 between", value1, value2, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotBetween(Object value1, Object value2) {
            addCriterion("F3 not between", value1, value2, "f3");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
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