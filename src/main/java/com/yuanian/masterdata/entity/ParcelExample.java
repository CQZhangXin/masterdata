package com.yuanian.masterdata.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParcelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParcelExample() {
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

        public Criteria andParcelversionidIsNull() {
            addCriterion("PARCELVERSIONID is null");
            return (Criteria) this;
        }

        public Criteria andParcelversionidIsNotNull() {
            addCriterion("PARCELVERSIONID is not null");
            return (Criteria) this;
        }

        public Criteria andParcelversionidEqualTo(Object value) {
            addCriterion("PARCELVERSIONID =", value, "parcelversionid");
            return (Criteria) this;
        }

        public Criteria andParcelversionidNotEqualTo(Object value) {
            addCriterion("PARCELVERSIONID <>", value, "parcelversionid");
            return (Criteria) this;
        }

        public Criteria andParcelversionidGreaterThan(Object value) {
            addCriterion("PARCELVERSIONID >", value, "parcelversionid");
            return (Criteria) this;
        }

        public Criteria andParcelversionidGreaterThanOrEqualTo(Object value) {
            addCriterion("PARCELVERSIONID >=", value, "parcelversionid");
            return (Criteria) this;
        }

        public Criteria andParcelversionidLessThan(Object value) {
            addCriterion("PARCELVERSIONID <", value, "parcelversionid");
            return (Criteria) this;
        }

        public Criteria andParcelversionidLessThanOrEqualTo(Object value) {
            addCriterion("PARCELVERSIONID <=", value, "parcelversionid");
            return (Criteria) this;
        }

        public Criteria andParcelversionidIn(List<Object> values) {
            addCriterion("PARCELVERSIONID in", values, "parcelversionid");
            return (Criteria) this;
        }

        public Criteria andParcelversionidNotIn(List<Object> values) {
            addCriterion("PARCELVERSIONID not in", values, "parcelversionid");
            return (Criteria) this;
        }

        public Criteria andParcelversionidBetween(Object value1, Object value2) {
            addCriterion("PARCELVERSIONID between", value1, value2, "parcelversionid");
            return (Criteria) this;
        }

        public Criteria andParcelversionidNotBetween(Object value1, Object value2) {
            addCriterion("PARCELVERSIONID not between", value1, value2, "parcelversionid");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNull() {
            addCriterion("PROJECTID is null");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNotNull() {
            addCriterion("PROJECTID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectidEqualTo(String value) {
            addCriterion("PROJECTID =", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotEqualTo(String value) {
            addCriterion("PROJECTID <>", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThan(String value) {
            addCriterion("PROJECTID >", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTID >=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThan(String value) {
            addCriterion("PROJECTID <", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThanOrEqualTo(String value) {
            addCriterion("PROJECTID <=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLike(String value) {
            addCriterion("PROJECTID like", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotLike(String value) {
            addCriterion("PROJECTID not like", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidIn(List<String> values) {
            addCriterion("PROJECTID in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotIn(List<String> values) {
            addCriterion("PROJECTID not in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidBetween(String value1, String value2) {
            addCriterion("PROJECTID between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotBetween(String value1, String value2) {
            addCriterion("PROJECTID not between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectcodeIsNull() {
            addCriterion("PROJECTCODE is null");
            return (Criteria) this;
        }

        public Criteria andProjectcodeIsNotNull() {
            addCriterion("PROJECTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andProjectcodeEqualTo(String value) {
            addCriterion("PROJECTCODE =", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeNotEqualTo(String value) {
            addCriterion("PROJECTCODE <>", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeGreaterThan(String value) {
            addCriterion("PROJECTCODE >", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTCODE >=", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeLessThan(String value) {
            addCriterion("PROJECTCODE <", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeLessThanOrEqualTo(String value) {
            addCriterion("PROJECTCODE <=", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeLike(String value) {
            addCriterion("PROJECTCODE like", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeNotLike(String value) {
            addCriterion("PROJECTCODE not like", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeIn(List<String> values) {
            addCriterion("PROJECTCODE in", values, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeNotIn(List<String> values) {
            addCriterion("PROJECTCODE not in", values, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeBetween(String value1, String value2) {
            addCriterion("PROJECTCODE between", value1, value2, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeNotBetween(String value1, String value2) {
            addCriterion("PROJECTCODE not between", value1, value2, "projectcode");
            return (Criteria) this;
        }

        public Criteria andParcelcodeIsNull() {
            addCriterion("PARCELCODE is null");
            return (Criteria) this;
        }

        public Criteria andParcelcodeIsNotNull() {
            addCriterion("PARCELCODE is not null");
            return (Criteria) this;
        }

        public Criteria andParcelcodeEqualTo(String value) {
            addCriterion("PARCELCODE =", value, "parcelcode");
            return (Criteria) this;
        }

        public Criteria andParcelcodeNotEqualTo(String value) {
            addCriterion("PARCELCODE <>", value, "parcelcode");
            return (Criteria) this;
        }

        public Criteria andParcelcodeGreaterThan(String value) {
            addCriterion("PARCELCODE >", value, "parcelcode");
            return (Criteria) this;
        }

        public Criteria andParcelcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PARCELCODE >=", value, "parcelcode");
            return (Criteria) this;
        }

        public Criteria andParcelcodeLessThan(String value) {
            addCriterion("PARCELCODE <", value, "parcelcode");
            return (Criteria) this;
        }

        public Criteria andParcelcodeLessThanOrEqualTo(String value) {
            addCriterion("PARCELCODE <=", value, "parcelcode");
            return (Criteria) this;
        }

        public Criteria andParcelcodeLike(String value) {
            addCriterion("PARCELCODE like", value, "parcelcode");
            return (Criteria) this;
        }

        public Criteria andParcelcodeNotLike(String value) {
            addCriterion("PARCELCODE not like", value, "parcelcode");
            return (Criteria) this;
        }

        public Criteria andParcelcodeIn(List<String> values) {
            addCriterion("PARCELCODE in", values, "parcelcode");
            return (Criteria) this;
        }

        public Criteria andParcelcodeNotIn(List<String> values) {
            addCriterion("PARCELCODE not in", values, "parcelcode");
            return (Criteria) this;
        }

        public Criteria andParcelcodeBetween(String value1, String value2) {
            addCriterion("PARCELCODE between", value1, value2, "parcelcode");
            return (Criteria) this;
        }

        public Criteria andParcelcodeNotBetween(String value1, String value2) {
            addCriterion("PARCELCODE not between", value1, value2, "parcelcode");
            return (Criteria) this;
        }

        public Criteria andParcelidIsNull() {
            addCriterion("PARCELID is null");
            return (Criteria) this;
        }

        public Criteria andParcelidIsNotNull() {
            addCriterion("PARCELID is not null");
            return (Criteria) this;
        }

        public Criteria andParcelidEqualTo(String value) {
            addCriterion("PARCELID =", value, "parcelid");
            return (Criteria) this;
        }

        public Criteria andParcelidNotEqualTo(String value) {
            addCriterion("PARCELID <>", value, "parcelid");
            return (Criteria) this;
        }

        public Criteria andParcelidGreaterThan(String value) {
            addCriterion("PARCELID >", value, "parcelid");
            return (Criteria) this;
        }

        public Criteria andParcelidGreaterThanOrEqualTo(String value) {
            addCriterion("PARCELID >=", value, "parcelid");
            return (Criteria) this;
        }

        public Criteria andParcelidLessThan(String value) {
            addCriterion("PARCELID <", value, "parcelid");
            return (Criteria) this;
        }

        public Criteria andParcelidLessThanOrEqualTo(String value) {
            addCriterion("PARCELID <=", value, "parcelid");
            return (Criteria) this;
        }

        public Criteria andParcelidLike(String value) {
            addCriterion("PARCELID like", value, "parcelid");
            return (Criteria) this;
        }

        public Criteria andParcelidNotLike(String value) {
            addCriterion("PARCELID not like", value, "parcelid");
            return (Criteria) this;
        }

        public Criteria andParcelidIn(List<String> values) {
            addCriterion("PARCELID in", values, "parcelid");
            return (Criteria) this;
        }

        public Criteria andParcelidNotIn(List<String> values) {
            addCriterion("PARCELID not in", values, "parcelid");
            return (Criteria) this;
        }

        public Criteria andParcelidBetween(String value1, String value2) {
            addCriterion("PARCELID between", value1, value2, "parcelid");
            return (Criteria) this;
        }

        public Criteria andParcelidNotBetween(String value1, String value2) {
            addCriterion("PARCELID not between", value1, value2, "parcelid");
            return (Criteria) this;
        }

        public Criteria andParcelnameIsNull() {
            addCriterion("PARCELNAME is null");
            return (Criteria) this;
        }

        public Criteria andParcelnameIsNotNull() {
            addCriterion("PARCELNAME is not null");
            return (Criteria) this;
        }

        public Criteria andParcelnameEqualTo(Object value) {
            addCriterion("PARCELNAME =", value, "parcelname");
            return (Criteria) this;
        }

        public Criteria andParcelnameNotEqualTo(Object value) {
            addCriterion("PARCELNAME <>", value, "parcelname");
            return (Criteria) this;
        }

        public Criteria andParcelnameGreaterThan(Object value) {
            addCriterion("PARCELNAME >", value, "parcelname");
            return (Criteria) this;
        }

        public Criteria andParcelnameGreaterThanOrEqualTo(Object value) {
            addCriterion("PARCELNAME >=", value, "parcelname");
            return (Criteria) this;
        }

        public Criteria andParcelnameLessThan(Object value) {
            addCriterion("PARCELNAME <", value, "parcelname");
            return (Criteria) this;
        }

        public Criteria andParcelnameLessThanOrEqualTo(Object value) {
            addCriterion("PARCELNAME <=", value, "parcelname");
            return (Criteria) this;
        }

        public Criteria andParcelnameIn(List<Object> values) {
            addCriterion("PARCELNAME in", values, "parcelname");
            return (Criteria) this;
        }

        public Criteria andParcelnameNotIn(List<Object> values) {
            addCriterion("PARCELNAME not in", values, "parcelname");
            return (Criteria) this;
        }

        public Criteria andParcelnameBetween(Object value1, Object value2) {
            addCriterion("PARCELNAME between", value1, value2, "parcelname");
            return (Criteria) this;
        }

        public Criteria andParcelnameNotBetween(Object value1, Object value2) {
            addCriterion("PARCELNAME not between", value1, value2, "parcelname");
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

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Short value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Short value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Short value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Short value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Short value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Short value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Short> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Short> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Short value1, Short value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Short value1, Short value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andParcelgeneralizenameIsNull() {
            addCriterion("PARCELGENERALIZENAME is null");
            return (Criteria) this;
        }

        public Criteria andParcelgeneralizenameIsNotNull() {
            addCriterion("PARCELGENERALIZENAME is not null");
            return (Criteria) this;
        }

        public Criteria andParcelgeneralizenameEqualTo(Object value) {
            addCriterion("PARCELGENERALIZENAME =", value, "parcelgeneralizename");
            return (Criteria) this;
        }

        public Criteria andParcelgeneralizenameNotEqualTo(Object value) {
            addCriterion("PARCELGENERALIZENAME <>", value, "parcelgeneralizename");
            return (Criteria) this;
        }

        public Criteria andParcelgeneralizenameGreaterThan(Object value) {
            addCriterion("PARCELGENERALIZENAME >", value, "parcelgeneralizename");
            return (Criteria) this;
        }

        public Criteria andParcelgeneralizenameGreaterThanOrEqualTo(Object value) {
            addCriterion("PARCELGENERALIZENAME >=", value, "parcelgeneralizename");
            return (Criteria) this;
        }

        public Criteria andParcelgeneralizenameLessThan(Object value) {
            addCriterion("PARCELGENERALIZENAME <", value, "parcelgeneralizename");
            return (Criteria) this;
        }

        public Criteria andParcelgeneralizenameLessThanOrEqualTo(Object value) {
            addCriterion("PARCELGENERALIZENAME <=", value, "parcelgeneralizename");
            return (Criteria) this;
        }

        public Criteria andParcelgeneralizenameIn(List<Object> values) {
            addCriterion("PARCELGENERALIZENAME in", values, "parcelgeneralizename");
            return (Criteria) this;
        }

        public Criteria andParcelgeneralizenameNotIn(List<Object> values) {
            addCriterion("PARCELGENERALIZENAME not in", values, "parcelgeneralizename");
            return (Criteria) this;
        }

        public Criteria andParcelgeneralizenameBetween(Object value1, Object value2) {
            addCriterion("PARCELGENERALIZENAME between", value1, value2, "parcelgeneralizename");
            return (Criteria) this;
        }

        public Criteria andParcelgeneralizenameNotBetween(Object value1, Object value2) {
            addCriterion("PARCELGENERALIZENAME not between", value1, value2, "parcelgeneralizename");
            return (Criteria) this;
        }

        public Criteria andContractcodeIsNull() {
            addCriterion("CONTRACTCODE is null");
            return (Criteria) this;
        }

        public Criteria andContractcodeIsNotNull() {
            addCriterion("CONTRACTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andContractcodeEqualTo(String value) {
            addCriterion("CONTRACTCODE =", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeNotEqualTo(String value) {
            addCriterion("CONTRACTCODE <>", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeGreaterThan(String value) {
            addCriterion("CONTRACTCODE >", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACTCODE >=", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeLessThan(String value) {
            addCriterion("CONTRACTCODE <", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeLessThanOrEqualTo(String value) {
            addCriterion("CONTRACTCODE <=", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeLike(String value) {
            addCriterion("CONTRACTCODE like", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeNotLike(String value) {
            addCriterion("CONTRACTCODE not like", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeIn(List<String> values) {
            addCriterion("CONTRACTCODE in", values, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeNotIn(List<String> values) {
            addCriterion("CONTRACTCODE not in", values, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeBetween(String value1, String value2) {
            addCriterion("CONTRACTCODE between", value1, value2, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeNotBetween(String value1, String value2) {
            addCriterion("CONTRACTCODE not between", value1, value2, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractamountIsNull() {
            addCriterion("CONTRACTAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andContractamountIsNotNull() {
            addCriterion("CONTRACTAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andContractamountEqualTo(BigDecimal value) {
            addCriterion("CONTRACTAMOUNT =", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountNotEqualTo(BigDecimal value) {
            addCriterion("CONTRACTAMOUNT <>", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountGreaterThan(BigDecimal value) {
            addCriterion("CONTRACTAMOUNT >", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACTAMOUNT >=", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountLessThan(BigDecimal value) {
            addCriterion("CONTRACTAMOUNT <", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACTAMOUNT <=", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountIn(List<BigDecimal> values) {
            addCriterion("CONTRACTAMOUNT in", values, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountNotIn(List<BigDecimal> values) {
            addCriterion("CONTRACTAMOUNT not in", values, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACTAMOUNT between", value1, value2, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACTAMOUNT not between", value1, value2, "contractamount");
            return (Criteria) this;
        }

        public Criteria andParcelstatusIsNull() {
            addCriterion("PARCELSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andParcelstatusIsNotNull() {
            addCriterion("PARCELSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andParcelstatusEqualTo(String value) {
            addCriterion("PARCELSTATUS =", value, "parcelstatus");
            return (Criteria) this;
        }

        public Criteria andParcelstatusNotEqualTo(String value) {
            addCriterion("PARCELSTATUS <>", value, "parcelstatus");
            return (Criteria) this;
        }

        public Criteria andParcelstatusGreaterThan(String value) {
            addCriterion("PARCELSTATUS >", value, "parcelstatus");
            return (Criteria) this;
        }

        public Criteria andParcelstatusGreaterThanOrEqualTo(String value) {
            addCriterion("PARCELSTATUS >=", value, "parcelstatus");
            return (Criteria) this;
        }

        public Criteria andParcelstatusLessThan(String value) {
            addCriterion("PARCELSTATUS <", value, "parcelstatus");
            return (Criteria) this;
        }

        public Criteria andParcelstatusLessThanOrEqualTo(String value) {
            addCriterion("PARCELSTATUS <=", value, "parcelstatus");
            return (Criteria) this;
        }

        public Criteria andParcelstatusLike(String value) {
            addCriterion("PARCELSTATUS like", value, "parcelstatus");
            return (Criteria) this;
        }

        public Criteria andParcelstatusNotLike(String value) {
            addCriterion("PARCELSTATUS not like", value, "parcelstatus");
            return (Criteria) this;
        }

        public Criteria andParcelstatusIn(List<String> values) {
            addCriterion("PARCELSTATUS in", values, "parcelstatus");
            return (Criteria) this;
        }

        public Criteria andParcelstatusNotIn(List<String> values) {
            addCriterion("PARCELSTATUS not in", values, "parcelstatus");
            return (Criteria) this;
        }

        public Criteria andParcelstatusBetween(String value1, String value2) {
            addCriterion("PARCELSTATUS between", value1, value2, "parcelstatus");
            return (Criteria) this;
        }

        public Criteria andParcelstatusNotBetween(String value1, String value2) {
            addCriterion("PARCELSTATUS not between", value1, value2, "parcelstatus");
            return (Criteria) this;
        }

        public Criteria andParcelpropertyIsNull() {
            addCriterion("PARCELPROPERTY is null");
            return (Criteria) this;
        }

        public Criteria andParcelpropertyIsNotNull() {
            addCriterion("PARCELPROPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andParcelpropertyEqualTo(String value) {
            addCriterion("PARCELPROPERTY =", value, "parcelproperty");
            return (Criteria) this;
        }

        public Criteria andParcelpropertyNotEqualTo(String value) {
            addCriterion("PARCELPROPERTY <>", value, "parcelproperty");
            return (Criteria) this;
        }

        public Criteria andParcelpropertyGreaterThan(String value) {
            addCriterion("PARCELPROPERTY >", value, "parcelproperty");
            return (Criteria) this;
        }

        public Criteria andParcelpropertyGreaterThanOrEqualTo(String value) {
            addCriterion("PARCELPROPERTY >=", value, "parcelproperty");
            return (Criteria) this;
        }

        public Criteria andParcelpropertyLessThan(String value) {
            addCriterion("PARCELPROPERTY <", value, "parcelproperty");
            return (Criteria) this;
        }

        public Criteria andParcelpropertyLessThanOrEqualTo(String value) {
            addCriterion("PARCELPROPERTY <=", value, "parcelproperty");
            return (Criteria) this;
        }

        public Criteria andParcelpropertyLike(String value) {
            addCriterion("PARCELPROPERTY like", value, "parcelproperty");
            return (Criteria) this;
        }

        public Criteria andParcelpropertyNotLike(String value) {
            addCriterion("PARCELPROPERTY not like", value, "parcelproperty");
            return (Criteria) this;
        }

        public Criteria andParcelpropertyIn(List<String> values) {
            addCriterion("PARCELPROPERTY in", values, "parcelproperty");
            return (Criteria) this;
        }

        public Criteria andParcelpropertyNotIn(List<String> values) {
            addCriterion("PARCELPROPERTY not in", values, "parcelproperty");
            return (Criteria) this;
        }

        public Criteria andParcelpropertyBetween(String value1, String value2) {
            addCriterion("PARCELPROPERTY between", value1, value2, "parcelproperty");
            return (Criteria) this;
        }

        public Criteria andParcelpropertyNotBetween(String value1, String value2) {
            addCriterion("PARCELPROPERTY not between", value1, value2, "parcelproperty");
            return (Criteria) this;
        }

        public Criteria andParcelgaindateIsNull() {
            addCriterion("PARCELGAINDATE is null");
            return (Criteria) this;
        }

        public Criteria andParcelgaindateIsNotNull() {
            addCriterion("PARCELGAINDATE is not null");
            return (Criteria) this;
        }

        public Criteria andParcelgaindateEqualTo(Object value) {
            addCriterion("PARCELGAINDATE =", value, "parcelgaindate");
            return (Criteria) this;
        }

        public Criteria andParcelgaindateNotEqualTo(Object value) {
            addCriterion("PARCELGAINDATE <>", value, "parcelgaindate");
            return (Criteria) this;
        }

        public Criteria andParcelgaindateGreaterThan(Object value) {
            addCriterion("PARCELGAINDATE >", value, "parcelgaindate");
            return (Criteria) this;
        }

        public Criteria andParcelgaindateGreaterThanOrEqualTo(Object value) {
            addCriterion("PARCELGAINDATE >=", value, "parcelgaindate");
            return (Criteria) this;
        }

        public Criteria andParcelgaindateLessThan(Object value) {
            addCriterion("PARCELGAINDATE <", value, "parcelgaindate");
            return (Criteria) this;
        }

        public Criteria andParcelgaindateLessThanOrEqualTo(Object value) {
            addCriterion("PARCELGAINDATE <=", value, "parcelgaindate");
            return (Criteria) this;
        }

        public Criteria andParcelgaindateIn(List<Object> values) {
            addCriterion("PARCELGAINDATE in", values, "parcelgaindate");
            return (Criteria) this;
        }

        public Criteria andParcelgaindateNotIn(List<Object> values) {
            addCriterion("PARCELGAINDATE not in", values, "parcelgaindate");
            return (Criteria) this;
        }

        public Criteria andParcelgaindateBetween(Object value1, Object value2) {
            addCriterion("PARCELGAINDATE between", value1, value2, "parcelgaindate");
            return (Criteria) this;
        }

        public Criteria andParcelgaindateNotBetween(Object value1, Object value2) {
            addCriterion("PARCELGAINDATE not between", value1, value2, "parcelgaindate");
            return (Criteria) this;
        }

        public Criteria andParceltransferdateIsNull() {
            addCriterion("PARCELTRANSFERDATE is null");
            return (Criteria) this;
        }

        public Criteria andParceltransferdateIsNotNull() {
            addCriterion("PARCELTRANSFERDATE is not null");
            return (Criteria) this;
        }

        public Criteria andParceltransferdateEqualTo(Object value) {
            addCriterion("PARCELTRANSFERDATE =", value, "parceltransferdate");
            return (Criteria) this;
        }

        public Criteria andParceltransferdateNotEqualTo(Object value) {
            addCriterion("PARCELTRANSFERDATE <>", value, "parceltransferdate");
            return (Criteria) this;
        }

        public Criteria andParceltransferdateGreaterThan(Object value) {
            addCriterion("PARCELTRANSFERDATE >", value, "parceltransferdate");
            return (Criteria) this;
        }

        public Criteria andParceltransferdateGreaterThanOrEqualTo(Object value) {
            addCriterion("PARCELTRANSFERDATE >=", value, "parceltransferdate");
            return (Criteria) this;
        }

        public Criteria andParceltransferdateLessThan(Object value) {
            addCriterion("PARCELTRANSFERDATE <", value, "parceltransferdate");
            return (Criteria) this;
        }

        public Criteria andParceltransferdateLessThanOrEqualTo(Object value) {
            addCriterion("PARCELTRANSFERDATE <=", value, "parceltransferdate");
            return (Criteria) this;
        }

        public Criteria andParceltransferdateIn(List<Object> values) {
            addCriterion("PARCELTRANSFERDATE in", values, "parceltransferdate");
            return (Criteria) this;
        }

        public Criteria andParceltransferdateNotIn(List<Object> values) {
            addCriterion("PARCELTRANSFERDATE not in", values, "parceltransferdate");
            return (Criteria) this;
        }

        public Criteria andParceltransferdateBetween(Object value1, Object value2) {
            addCriterion("PARCELTRANSFERDATE between", value1, value2, "parceltransferdate");
            return (Criteria) this;
        }

        public Criteria andParceltransferdateNotBetween(Object value1, Object value2) {
            addCriterion("PARCELTRANSFERDATE not between", value1, value2, "parceltransferdate");
            return (Criteria) this;
        }

        public Criteria andParcelselltypeIsNull() {
            addCriterion("PARCELSELLTYPE is null");
            return (Criteria) this;
        }

        public Criteria andParcelselltypeIsNotNull() {
            addCriterion("PARCELSELLTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andParcelselltypeEqualTo(String value) {
            addCriterion("PARCELSELLTYPE =", value, "parcelselltype");
            return (Criteria) this;
        }

        public Criteria andParcelselltypeNotEqualTo(String value) {
            addCriterion("PARCELSELLTYPE <>", value, "parcelselltype");
            return (Criteria) this;
        }

        public Criteria andParcelselltypeGreaterThan(String value) {
            addCriterion("PARCELSELLTYPE >", value, "parcelselltype");
            return (Criteria) this;
        }

        public Criteria andParcelselltypeGreaterThanOrEqualTo(String value) {
            addCriterion("PARCELSELLTYPE >=", value, "parcelselltype");
            return (Criteria) this;
        }

        public Criteria andParcelselltypeLessThan(String value) {
            addCriterion("PARCELSELLTYPE <", value, "parcelselltype");
            return (Criteria) this;
        }

        public Criteria andParcelselltypeLessThanOrEqualTo(String value) {
            addCriterion("PARCELSELLTYPE <=", value, "parcelselltype");
            return (Criteria) this;
        }

        public Criteria andParcelselltypeLike(String value) {
            addCriterion("PARCELSELLTYPE like", value, "parcelselltype");
            return (Criteria) this;
        }

        public Criteria andParcelselltypeNotLike(String value) {
            addCriterion("PARCELSELLTYPE not like", value, "parcelselltype");
            return (Criteria) this;
        }

        public Criteria andParcelselltypeIn(List<String> values) {
            addCriterion("PARCELSELLTYPE in", values, "parcelselltype");
            return (Criteria) this;
        }

        public Criteria andParcelselltypeNotIn(List<String> values) {
            addCriterion("PARCELSELLTYPE not in", values, "parcelselltype");
            return (Criteria) this;
        }

        public Criteria andParcelselltypeBetween(String value1, String value2) {
            addCriterion("PARCELSELLTYPE between", value1, value2, "parcelselltype");
            return (Criteria) this;
        }

        public Criteria andParcelselltypeNotBetween(String value1, String value2) {
            addCriterion("PARCELSELLTYPE not between", value1, value2, "parcelselltype");
            return (Criteria) this;
        }

        public Criteria andParcelsellmanIsNull() {
            addCriterion("PARCELSELLMAN is null");
            return (Criteria) this;
        }

        public Criteria andParcelsellmanIsNotNull() {
            addCriterion("PARCELSELLMAN is not null");
            return (Criteria) this;
        }

        public Criteria andParcelsellmanEqualTo(Object value) {
            addCriterion("PARCELSELLMAN =", value, "parcelsellman");
            return (Criteria) this;
        }

        public Criteria andParcelsellmanNotEqualTo(Object value) {
            addCriterion("PARCELSELLMAN <>", value, "parcelsellman");
            return (Criteria) this;
        }

        public Criteria andParcelsellmanGreaterThan(Object value) {
            addCriterion("PARCELSELLMAN >", value, "parcelsellman");
            return (Criteria) this;
        }

        public Criteria andParcelsellmanGreaterThanOrEqualTo(Object value) {
            addCriterion("PARCELSELLMAN >=", value, "parcelsellman");
            return (Criteria) this;
        }

        public Criteria andParcelsellmanLessThan(Object value) {
            addCriterion("PARCELSELLMAN <", value, "parcelsellman");
            return (Criteria) this;
        }

        public Criteria andParcelsellmanLessThanOrEqualTo(Object value) {
            addCriterion("PARCELSELLMAN <=", value, "parcelsellman");
            return (Criteria) this;
        }

        public Criteria andParcelsellmanIn(List<Object> values) {
            addCriterion("PARCELSELLMAN in", values, "parcelsellman");
            return (Criteria) this;
        }

        public Criteria andParcelsellmanNotIn(List<Object> values) {
            addCriterion("PARCELSELLMAN not in", values, "parcelsellman");
            return (Criteria) this;
        }

        public Criteria andParcelsellmanBetween(Object value1, Object value2) {
            addCriterion("PARCELSELLMAN between", value1, value2, "parcelsellman");
            return (Criteria) this;
        }

        public Criteria andParcelsellmanNotBetween(Object value1, Object value2) {
            addCriterion("PARCELSELLMAN not between", value1, value2, "parcelsellman");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(Object value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(Object value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(Object value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(Object value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(Object value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(Object value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<Object> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<Object> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(Object value1, Object value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(Object value1, Object value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andDatastageIsNull() {
            addCriterion("DATASTAGE is null");
            return (Criteria) this;
        }

        public Criteria andDatastageIsNotNull() {
            addCriterion("DATASTAGE is not null");
            return (Criteria) this;
        }

        public Criteria andDatastageEqualTo(String value) {
            addCriterion("DATASTAGE =", value, "datastage");
            return (Criteria) this;
        }

        public Criteria andDatastageNotEqualTo(String value) {
            addCriterion("DATASTAGE <>", value, "datastage");
            return (Criteria) this;
        }

        public Criteria andDatastageGreaterThan(String value) {
            addCriterion("DATASTAGE >", value, "datastage");
            return (Criteria) this;
        }

        public Criteria andDatastageGreaterThanOrEqualTo(String value) {
            addCriterion("DATASTAGE >=", value, "datastage");
            return (Criteria) this;
        }

        public Criteria andDatastageLessThan(String value) {
            addCriterion("DATASTAGE <", value, "datastage");
            return (Criteria) this;
        }

        public Criteria andDatastageLessThanOrEqualTo(String value) {
            addCriterion("DATASTAGE <=", value, "datastage");
            return (Criteria) this;
        }

        public Criteria andDatastageLike(String value) {
            addCriterion("DATASTAGE like", value, "datastage");
            return (Criteria) this;
        }

        public Criteria andDatastageNotLike(String value) {
            addCriterion("DATASTAGE not like", value, "datastage");
            return (Criteria) this;
        }

        public Criteria andDatastageIn(List<String> values) {
            addCriterion("DATASTAGE in", values, "datastage");
            return (Criteria) this;
        }

        public Criteria andDatastageNotIn(List<String> values) {
            addCriterion("DATASTAGE not in", values, "datastage");
            return (Criteria) this;
        }

        public Criteria andDatastageBetween(String value1, String value2) {
            addCriterion("DATASTAGE between", value1, value2, "datastage");
            return (Criteria) this;
        }

        public Criteria andDatastageNotBetween(String value1, String value2) {
            addCriterion("DATASTAGE not between", value1, value2, "datastage");
            return (Criteria) this;
        }

        public Criteria andTotaluseareaIsNull() {
            addCriterion("TOTALUSEAREA is null");
            return (Criteria) this;
        }

        public Criteria andTotaluseareaIsNotNull() {
            addCriterion("TOTALUSEAREA is not null");
            return (Criteria) this;
        }

        public Criteria andTotaluseareaEqualTo(BigDecimal value) {
            addCriterion("TOTALUSEAREA =", value, "totalusearea");
            return (Criteria) this;
        }

        public Criteria andTotaluseareaNotEqualTo(BigDecimal value) {
            addCriterion("TOTALUSEAREA <>", value, "totalusearea");
            return (Criteria) this;
        }

        public Criteria andTotaluseareaGreaterThan(BigDecimal value) {
            addCriterion("TOTALUSEAREA >", value, "totalusearea");
            return (Criteria) this;
        }

        public Criteria andTotaluseareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALUSEAREA >=", value, "totalusearea");
            return (Criteria) this;
        }

        public Criteria andTotaluseareaLessThan(BigDecimal value) {
            addCriterion("TOTALUSEAREA <", value, "totalusearea");
            return (Criteria) this;
        }

        public Criteria andTotaluseareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALUSEAREA <=", value, "totalusearea");
            return (Criteria) this;
        }

        public Criteria andTotaluseareaIn(List<BigDecimal> values) {
            addCriterion("TOTALUSEAREA in", values, "totalusearea");
            return (Criteria) this;
        }

        public Criteria andTotaluseareaNotIn(List<BigDecimal> values) {
            addCriterion("TOTALUSEAREA not in", values, "totalusearea");
            return (Criteria) this;
        }

        public Criteria andTotaluseareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALUSEAREA between", value1, value2, "totalusearea");
            return (Criteria) this;
        }

        public Criteria andTotaluseareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALUSEAREA not between", value1, value2, "totalusearea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaIsNull() {
            addCriterion("BUILDINGAREA is null");
            return (Criteria) this;
        }

        public Criteria andBuildingareaIsNotNull() {
            addCriterion("BUILDINGAREA is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingareaEqualTo(BigDecimal value) {
            addCriterion("BUILDINGAREA =", value, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaNotEqualTo(BigDecimal value) {
            addCriterion("BUILDINGAREA <>", value, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaGreaterThan(BigDecimal value) {
            addCriterion("BUILDINGAREA >", value, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUILDINGAREA >=", value, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaLessThan(BigDecimal value) {
            addCriterion("BUILDINGAREA <", value, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUILDINGAREA <=", value, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaIn(List<BigDecimal> values) {
            addCriterion("BUILDINGAREA in", values, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaNotIn(List<BigDecimal> values) {
            addCriterion("BUILDINGAREA not in", values, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUILDINGAREA between", value1, value2, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUILDINGAREA not between", value1, value2, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedareaIsNull() {
            addCriterion("EXPROPRIATEDAREA is null");
            return (Criteria) this;
        }

        public Criteria andExpropriatedareaIsNotNull() {
            addCriterion("EXPROPRIATEDAREA is not null");
            return (Criteria) this;
        }

        public Criteria andExpropriatedareaEqualTo(BigDecimal value) {
            addCriterion("EXPROPRIATEDAREA =", value, "expropriatedarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedareaNotEqualTo(BigDecimal value) {
            addCriterion("EXPROPRIATEDAREA <>", value, "expropriatedarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedareaGreaterThan(BigDecimal value) {
            addCriterion("EXPROPRIATEDAREA >", value, "expropriatedarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPROPRIATEDAREA >=", value, "expropriatedarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedareaLessThan(BigDecimal value) {
            addCriterion("EXPROPRIATEDAREA <", value, "expropriatedarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPROPRIATEDAREA <=", value, "expropriatedarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedareaIn(List<BigDecimal> values) {
            addCriterion("EXPROPRIATEDAREA in", values, "expropriatedarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedareaNotIn(List<BigDecimal> values) {
            addCriterion("EXPROPRIATEDAREA not in", values, "expropriatedarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPROPRIATEDAREA between", value1, value2, "expropriatedarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPROPRIATEDAREA not between", value1, value2, "expropriatedarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedgreenareaIsNull() {
            addCriterion("EXPROPRIATEDGREENAREA is null");
            return (Criteria) this;
        }

        public Criteria andExpropriatedgreenareaIsNotNull() {
            addCriterion("EXPROPRIATEDGREENAREA is not null");
            return (Criteria) this;
        }

        public Criteria andExpropriatedgreenareaEqualTo(BigDecimal value) {
            addCriterion("EXPROPRIATEDGREENAREA =", value, "expropriatedgreenarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedgreenareaNotEqualTo(BigDecimal value) {
            addCriterion("EXPROPRIATEDGREENAREA <>", value, "expropriatedgreenarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedgreenareaGreaterThan(BigDecimal value) {
            addCriterion("EXPROPRIATEDGREENAREA >", value, "expropriatedgreenarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedgreenareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPROPRIATEDGREENAREA >=", value, "expropriatedgreenarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedgreenareaLessThan(BigDecimal value) {
            addCriterion("EXPROPRIATEDGREENAREA <", value, "expropriatedgreenarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedgreenareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPROPRIATEDGREENAREA <=", value, "expropriatedgreenarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedgreenareaIn(List<BigDecimal> values) {
            addCriterion("EXPROPRIATEDGREENAREA in", values, "expropriatedgreenarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedgreenareaNotIn(List<BigDecimal> values) {
            addCriterion("EXPROPRIATEDGREENAREA not in", values, "expropriatedgreenarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedgreenareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPROPRIATEDGREENAREA between", value1, value2, "expropriatedgreenarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedgreenareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPROPRIATEDGREENAREA not between", value1, value2, "expropriatedgreenarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedroadareaIsNull() {
            addCriterion("EXPROPRIATEDROADAREA is null");
            return (Criteria) this;
        }

        public Criteria andExpropriatedroadareaIsNotNull() {
            addCriterion("EXPROPRIATEDROADAREA is not null");
            return (Criteria) this;
        }

        public Criteria andExpropriatedroadareaEqualTo(BigDecimal value) {
            addCriterion("EXPROPRIATEDROADAREA =", value, "expropriatedroadarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedroadareaNotEqualTo(BigDecimal value) {
            addCriterion("EXPROPRIATEDROADAREA <>", value, "expropriatedroadarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedroadareaGreaterThan(BigDecimal value) {
            addCriterion("EXPROPRIATEDROADAREA >", value, "expropriatedroadarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedroadareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPROPRIATEDROADAREA >=", value, "expropriatedroadarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedroadareaLessThan(BigDecimal value) {
            addCriterion("EXPROPRIATEDROADAREA <", value, "expropriatedroadarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedroadareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPROPRIATEDROADAREA <=", value, "expropriatedroadarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedroadareaIn(List<BigDecimal> values) {
            addCriterion("EXPROPRIATEDROADAREA in", values, "expropriatedroadarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedroadareaNotIn(List<BigDecimal> values) {
            addCriterion("EXPROPRIATEDROADAREA not in", values, "expropriatedroadarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedroadareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPROPRIATEDROADAREA between", value1, value2, "expropriatedroadarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedroadareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPROPRIATEDROADAREA not between", value1, value2, "expropriatedroadarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedotherareaIsNull() {
            addCriterion("EXPROPRIATEDOTHERAREA is null");
            return (Criteria) this;
        }

        public Criteria andExpropriatedotherareaIsNotNull() {
            addCriterion("EXPROPRIATEDOTHERAREA is not null");
            return (Criteria) this;
        }

        public Criteria andExpropriatedotherareaEqualTo(BigDecimal value) {
            addCriterion("EXPROPRIATEDOTHERAREA =", value, "expropriatedotherarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedotherareaNotEqualTo(BigDecimal value) {
            addCriterion("EXPROPRIATEDOTHERAREA <>", value, "expropriatedotherarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedotherareaGreaterThan(BigDecimal value) {
            addCriterion("EXPROPRIATEDOTHERAREA >", value, "expropriatedotherarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedotherareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPROPRIATEDOTHERAREA >=", value, "expropriatedotherarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedotherareaLessThan(BigDecimal value) {
            addCriterion("EXPROPRIATEDOTHERAREA <", value, "expropriatedotherarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedotherareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPROPRIATEDOTHERAREA <=", value, "expropriatedotherarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedotherareaIn(List<BigDecimal> values) {
            addCriterion("EXPROPRIATEDOTHERAREA in", values, "expropriatedotherarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedotherareaNotIn(List<BigDecimal> values) {
            addCriterion("EXPROPRIATEDOTHERAREA not in", values, "expropriatedotherarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedotherareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPROPRIATEDOTHERAREA between", value1, value2, "expropriatedotherarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedotherareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPROPRIATEDOTHERAREA not between", value1, value2, "expropriatedotherarea");
            return (Criteria) this;
        }

        public Criteria andBuildingholdareaIsNull() {
            addCriterion("BUILDINGHOLDAREA is null");
            return (Criteria) this;
        }

        public Criteria andBuildingholdareaIsNotNull() {
            addCriterion("BUILDINGHOLDAREA is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingholdareaEqualTo(BigDecimal value) {
            addCriterion("BUILDINGHOLDAREA =", value, "buildingholdarea");
            return (Criteria) this;
        }

        public Criteria andBuildingholdareaNotEqualTo(BigDecimal value) {
            addCriterion("BUILDINGHOLDAREA <>", value, "buildingholdarea");
            return (Criteria) this;
        }

        public Criteria andBuildingholdareaGreaterThan(BigDecimal value) {
            addCriterion("BUILDINGHOLDAREA >", value, "buildingholdarea");
            return (Criteria) this;
        }

        public Criteria andBuildingholdareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUILDINGHOLDAREA >=", value, "buildingholdarea");
            return (Criteria) this;
        }

        public Criteria andBuildingholdareaLessThan(BigDecimal value) {
            addCriterion("BUILDINGHOLDAREA <", value, "buildingholdarea");
            return (Criteria) this;
        }

        public Criteria andBuildingholdareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUILDINGHOLDAREA <=", value, "buildingholdarea");
            return (Criteria) this;
        }

        public Criteria andBuildingholdareaIn(List<BigDecimal> values) {
            addCriterion("BUILDINGHOLDAREA in", values, "buildingholdarea");
            return (Criteria) this;
        }

        public Criteria andBuildingholdareaNotIn(List<BigDecimal> values) {
            addCriterion("BUILDINGHOLDAREA not in", values, "buildingholdarea");
            return (Criteria) this;
        }

        public Criteria andBuildingholdareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUILDINGHOLDAREA between", value1, value2, "buildingholdarea");
            return (Criteria) this;
        }

        public Criteria andBuildingholdareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUILDINGHOLDAREA not between", value1, value2, "buildingholdarea");
            return (Criteria) this;
        }

        public Criteria andTotalroadareaIsNull() {
            addCriterion("TOTALROADAREA is null");
            return (Criteria) this;
        }

        public Criteria andTotalroadareaIsNotNull() {
            addCriterion("TOTALROADAREA is not null");
            return (Criteria) this;
        }

        public Criteria andTotalroadareaEqualTo(BigDecimal value) {
            addCriterion("TOTALROADAREA =", value, "totalroadarea");
            return (Criteria) this;
        }

        public Criteria andTotalroadareaNotEqualTo(BigDecimal value) {
            addCriterion("TOTALROADAREA <>", value, "totalroadarea");
            return (Criteria) this;
        }

        public Criteria andTotalroadareaGreaterThan(BigDecimal value) {
            addCriterion("TOTALROADAREA >", value, "totalroadarea");
            return (Criteria) this;
        }

        public Criteria andTotalroadareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALROADAREA >=", value, "totalroadarea");
            return (Criteria) this;
        }

        public Criteria andTotalroadareaLessThan(BigDecimal value) {
            addCriterion("TOTALROADAREA <", value, "totalroadarea");
            return (Criteria) this;
        }

        public Criteria andTotalroadareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALROADAREA <=", value, "totalroadarea");
            return (Criteria) this;
        }

        public Criteria andTotalroadareaIn(List<BigDecimal> values) {
            addCriterion("TOTALROADAREA in", values, "totalroadarea");
            return (Criteria) this;
        }

        public Criteria andTotalroadareaNotIn(List<BigDecimal> values) {
            addCriterion("TOTALROADAREA not in", values, "totalroadarea");
            return (Criteria) this;
        }

        public Criteria andTotalroadareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALROADAREA between", value1, value2, "totalroadarea");
            return (Criteria) this;
        }

        public Criteria andTotalroadareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALROADAREA not between", value1, value2, "totalroadarea");
            return (Criteria) this;
        }

        public Criteria andTotalgreenareaIsNull() {
            addCriterion("TOTALGREENAREA is null");
            return (Criteria) this;
        }

        public Criteria andTotalgreenareaIsNotNull() {
            addCriterion("TOTALGREENAREA is not null");
            return (Criteria) this;
        }

        public Criteria andTotalgreenareaEqualTo(BigDecimal value) {
            addCriterion("TOTALGREENAREA =", value, "totalgreenarea");
            return (Criteria) this;
        }

        public Criteria andTotalgreenareaNotEqualTo(BigDecimal value) {
            addCriterion("TOTALGREENAREA <>", value, "totalgreenarea");
            return (Criteria) this;
        }

        public Criteria andTotalgreenareaGreaterThan(BigDecimal value) {
            addCriterion("TOTALGREENAREA >", value, "totalgreenarea");
            return (Criteria) this;
        }

        public Criteria andTotalgreenareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALGREENAREA >=", value, "totalgreenarea");
            return (Criteria) this;
        }

        public Criteria andTotalgreenareaLessThan(BigDecimal value) {
            addCriterion("TOTALGREENAREA <", value, "totalgreenarea");
            return (Criteria) this;
        }

        public Criteria andTotalgreenareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALGREENAREA <=", value, "totalgreenarea");
            return (Criteria) this;
        }

        public Criteria andTotalgreenareaIn(List<BigDecimal> values) {
            addCriterion("TOTALGREENAREA in", values, "totalgreenarea");
            return (Criteria) this;
        }

        public Criteria andTotalgreenareaNotIn(List<BigDecimal> values) {
            addCriterion("TOTALGREENAREA not in", values, "totalgreenarea");
            return (Criteria) this;
        }

        public Criteria andTotalgreenareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALGREENAREA between", value1, value2, "totalgreenarea");
            return (Criteria) this;
        }

        public Criteria andTotalgreenareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALGREENAREA not between", value1, value2, "totalgreenarea");
            return (Criteria) this;
        }

        public Criteria andDemonstrationareaIsNull() {
            addCriterion("DEMONSTRATIONAREA is null");
            return (Criteria) this;
        }

        public Criteria andDemonstrationareaIsNotNull() {
            addCriterion("DEMONSTRATIONAREA is not null");
            return (Criteria) this;
        }

        public Criteria andDemonstrationareaEqualTo(BigDecimal value) {
            addCriterion("DEMONSTRATIONAREA =", value, "demonstrationarea");
            return (Criteria) this;
        }

        public Criteria andDemonstrationareaNotEqualTo(BigDecimal value) {
            addCriterion("DEMONSTRATIONAREA <>", value, "demonstrationarea");
            return (Criteria) this;
        }

        public Criteria andDemonstrationareaGreaterThan(BigDecimal value) {
            addCriterion("DEMONSTRATIONAREA >", value, "demonstrationarea");
            return (Criteria) this;
        }

        public Criteria andDemonstrationareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEMONSTRATIONAREA >=", value, "demonstrationarea");
            return (Criteria) this;
        }

        public Criteria andDemonstrationareaLessThan(BigDecimal value) {
            addCriterion("DEMONSTRATIONAREA <", value, "demonstrationarea");
            return (Criteria) this;
        }

        public Criteria andDemonstrationareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEMONSTRATIONAREA <=", value, "demonstrationarea");
            return (Criteria) this;
        }

        public Criteria andDemonstrationareaIn(List<BigDecimal> values) {
            addCriterion("DEMONSTRATIONAREA in", values, "demonstrationarea");
            return (Criteria) this;
        }

        public Criteria andDemonstrationareaNotIn(List<BigDecimal> values) {
            addCriterion("DEMONSTRATIONAREA not in", values, "demonstrationarea");
            return (Criteria) this;
        }

        public Criteria andDemonstrationareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEMONSTRATIONAREA between", value1, value2, "demonstrationarea");
            return (Criteria) this;
        }

        public Criteria andDemonstrationareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEMONSTRATIONAREA not between", value1, value2, "demonstrationarea");
            return (Criteria) this;
        }

        public Criteria andTotalcapacityareaIsNull() {
            addCriterion("TOTALCAPACITYAREA is null");
            return (Criteria) this;
        }

        public Criteria andTotalcapacityareaIsNotNull() {
            addCriterion("TOTALCAPACITYAREA is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcapacityareaEqualTo(BigDecimal value) {
            addCriterion("TOTALCAPACITYAREA =", value, "totalcapacityarea");
            return (Criteria) this;
        }

        public Criteria andTotalcapacityareaNotEqualTo(BigDecimal value) {
            addCriterion("TOTALCAPACITYAREA <>", value, "totalcapacityarea");
            return (Criteria) this;
        }

        public Criteria andTotalcapacityareaGreaterThan(BigDecimal value) {
            addCriterion("TOTALCAPACITYAREA >", value, "totalcapacityarea");
            return (Criteria) this;
        }

        public Criteria andTotalcapacityareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALCAPACITYAREA >=", value, "totalcapacityarea");
            return (Criteria) this;
        }

        public Criteria andTotalcapacityareaLessThan(BigDecimal value) {
            addCriterion("TOTALCAPACITYAREA <", value, "totalcapacityarea");
            return (Criteria) this;
        }

        public Criteria andTotalcapacityareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALCAPACITYAREA <=", value, "totalcapacityarea");
            return (Criteria) this;
        }

        public Criteria andTotalcapacityareaIn(List<BigDecimal> values) {
            addCriterion("TOTALCAPACITYAREA in", values, "totalcapacityarea");
            return (Criteria) this;
        }

        public Criteria andTotalcapacityareaNotIn(List<BigDecimal> values) {
            addCriterion("TOTALCAPACITYAREA not in", values, "totalcapacityarea");
            return (Criteria) this;
        }

        public Criteria andTotalcapacityareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALCAPACITYAREA between", value1, value2, "totalcapacityarea");
            return (Criteria) this;
        }

        public Criteria andTotalcapacityareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALCAPACITYAREA not between", value1, value2, "totalcapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpcapacityareaIsNull() {
            addCriterion("UPCAPACITYAREA is null");
            return (Criteria) this;
        }

        public Criteria andUpcapacityareaIsNotNull() {
            addCriterion("UPCAPACITYAREA is not null");
            return (Criteria) this;
        }

        public Criteria andUpcapacityareaEqualTo(BigDecimal value) {
            addCriterion("UPCAPACITYAREA =", value, "upcapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpcapacityareaNotEqualTo(BigDecimal value) {
            addCriterion("UPCAPACITYAREA <>", value, "upcapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpcapacityareaGreaterThan(BigDecimal value) {
            addCriterion("UPCAPACITYAREA >", value, "upcapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpcapacityareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UPCAPACITYAREA >=", value, "upcapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpcapacityareaLessThan(BigDecimal value) {
            addCriterion("UPCAPACITYAREA <", value, "upcapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpcapacityareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UPCAPACITYAREA <=", value, "upcapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpcapacityareaIn(List<BigDecimal> values) {
            addCriterion("UPCAPACITYAREA in", values, "upcapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpcapacityareaNotIn(List<BigDecimal> values) {
            addCriterion("UPCAPACITYAREA not in", values, "upcapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpcapacityareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPCAPACITYAREA between", value1, value2, "upcapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpcapacityareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPCAPACITYAREA not between", value1, value2, "upcapacityarea");
            return (Criteria) this;
        }

        public Criteria andDowncapacityareaIsNull() {
            addCriterion("DOWNCAPACITYAREA is null");
            return (Criteria) this;
        }

        public Criteria andDowncapacityareaIsNotNull() {
            addCriterion("DOWNCAPACITYAREA is not null");
            return (Criteria) this;
        }

        public Criteria andDowncapacityareaEqualTo(BigDecimal value) {
            addCriterion("DOWNCAPACITYAREA =", value, "downcapacityarea");
            return (Criteria) this;
        }

        public Criteria andDowncapacityareaNotEqualTo(BigDecimal value) {
            addCriterion("DOWNCAPACITYAREA <>", value, "downcapacityarea");
            return (Criteria) this;
        }

        public Criteria andDowncapacityareaGreaterThan(BigDecimal value) {
            addCriterion("DOWNCAPACITYAREA >", value, "downcapacityarea");
            return (Criteria) this;
        }

        public Criteria andDowncapacityareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DOWNCAPACITYAREA >=", value, "downcapacityarea");
            return (Criteria) this;
        }

        public Criteria andDowncapacityareaLessThan(BigDecimal value) {
            addCriterion("DOWNCAPACITYAREA <", value, "downcapacityarea");
            return (Criteria) this;
        }

        public Criteria andDowncapacityareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DOWNCAPACITYAREA <=", value, "downcapacityarea");
            return (Criteria) this;
        }

        public Criteria andDowncapacityareaIn(List<BigDecimal> values) {
            addCriterion("DOWNCAPACITYAREA in", values, "downcapacityarea");
            return (Criteria) this;
        }

        public Criteria andDowncapacityareaNotIn(List<BigDecimal> values) {
            addCriterion("DOWNCAPACITYAREA not in", values, "downcapacityarea");
            return (Criteria) this;
        }

        public Criteria andDowncapacityareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOWNCAPACITYAREA between", value1, value2, "downcapacityarea");
            return (Criteria) this;
        }

        public Criteria andDowncapacityareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOWNCAPACITYAREA not between", value1, value2, "downcapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpnoncapacityareaIsNull() {
            addCriterion("UPNONCAPACITYAREA is null");
            return (Criteria) this;
        }

        public Criteria andUpnoncapacityareaIsNotNull() {
            addCriterion("UPNONCAPACITYAREA is not null");
            return (Criteria) this;
        }

        public Criteria andUpnoncapacityareaEqualTo(BigDecimal value) {
            addCriterion("UPNONCAPACITYAREA =", value, "upnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpnoncapacityareaNotEqualTo(BigDecimal value) {
            addCriterion("UPNONCAPACITYAREA <>", value, "upnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpnoncapacityareaGreaterThan(BigDecimal value) {
            addCriterion("UPNONCAPACITYAREA >", value, "upnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpnoncapacityareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UPNONCAPACITYAREA >=", value, "upnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpnoncapacityareaLessThan(BigDecimal value) {
            addCriterion("UPNONCAPACITYAREA <", value, "upnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpnoncapacityareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UPNONCAPACITYAREA <=", value, "upnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpnoncapacityareaIn(List<BigDecimal> values) {
            addCriterion("UPNONCAPACITYAREA in", values, "upnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpnoncapacityareaNotIn(List<BigDecimal> values) {
            addCriterion("UPNONCAPACITYAREA not in", values, "upnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpnoncapacityareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPNONCAPACITYAREA between", value1, value2, "upnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpnoncapacityareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPNONCAPACITYAREA not between", value1, value2, "upnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andDownnoncapacityareaIsNull() {
            addCriterion("DOWNNONCAPACITYAREA is null");
            return (Criteria) this;
        }

        public Criteria andDownnoncapacityareaIsNotNull() {
            addCriterion("DOWNNONCAPACITYAREA is not null");
            return (Criteria) this;
        }

        public Criteria andDownnoncapacityareaEqualTo(BigDecimal value) {
            addCriterion("DOWNNONCAPACITYAREA =", value, "downnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andDownnoncapacityareaNotEqualTo(BigDecimal value) {
            addCriterion("DOWNNONCAPACITYAREA <>", value, "downnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andDownnoncapacityareaGreaterThan(BigDecimal value) {
            addCriterion("DOWNNONCAPACITYAREA >", value, "downnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andDownnoncapacityareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DOWNNONCAPACITYAREA >=", value, "downnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andDownnoncapacityareaLessThan(BigDecimal value) {
            addCriterion("DOWNNONCAPACITYAREA <", value, "downnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andDownnoncapacityareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DOWNNONCAPACITYAREA <=", value, "downnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andDownnoncapacityareaIn(List<BigDecimal> values) {
            addCriterion("DOWNNONCAPACITYAREA in", values, "downnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andDownnoncapacityareaNotIn(List<BigDecimal> values) {
            addCriterion("DOWNNONCAPACITYAREA not in", values, "downnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andDownnoncapacityareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOWNNONCAPACITYAREA between", value1, value2, "downnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andDownnoncapacityareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOWNNONCAPACITYAREA not between", value1, value2, "downnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andTotalbuildingareaIsNull() {
            addCriterion("TOTALBUILDINGAREA is null");
            return (Criteria) this;
        }

        public Criteria andTotalbuildingareaIsNotNull() {
            addCriterion("TOTALBUILDINGAREA is not null");
            return (Criteria) this;
        }

        public Criteria andTotalbuildingareaEqualTo(BigDecimal value) {
            addCriterion("TOTALBUILDINGAREA =", value, "totalbuildingarea");
            return (Criteria) this;
        }

        public Criteria andTotalbuildingareaNotEqualTo(BigDecimal value) {
            addCriterion("TOTALBUILDINGAREA <>", value, "totalbuildingarea");
            return (Criteria) this;
        }

        public Criteria andTotalbuildingareaGreaterThan(BigDecimal value) {
            addCriterion("TOTALBUILDINGAREA >", value, "totalbuildingarea");
            return (Criteria) this;
        }

        public Criteria andTotalbuildingareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALBUILDINGAREA >=", value, "totalbuildingarea");
            return (Criteria) this;
        }

        public Criteria andTotalbuildingareaLessThan(BigDecimal value) {
            addCriterion("TOTALBUILDINGAREA <", value, "totalbuildingarea");
            return (Criteria) this;
        }

        public Criteria andTotalbuildingareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALBUILDINGAREA <=", value, "totalbuildingarea");
            return (Criteria) this;
        }

        public Criteria andTotalbuildingareaIn(List<BigDecimal> values) {
            addCriterion("TOTALBUILDINGAREA in", values, "totalbuildingarea");
            return (Criteria) this;
        }

        public Criteria andTotalbuildingareaNotIn(List<BigDecimal> values) {
            addCriterion("TOTALBUILDINGAREA not in", values, "totalbuildingarea");
            return (Criteria) this;
        }

        public Criteria andTotalbuildingareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALBUILDINGAREA between", value1, value2, "totalbuildingarea");
            return (Criteria) this;
        }

        public Criteria andTotalbuildingareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALBUILDINGAREA not between", value1, value2, "totalbuildingarea");
            return (Criteria) this;
        }

        public Criteria andUpbuildingareaIsNull() {
            addCriterion("UPBUILDINGAREA is null");
            return (Criteria) this;
        }

        public Criteria andUpbuildingareaIsNotNull() {
            addCriterion("UPBUILDINGAREA is not null");
            return (Criteria) this;
        }

        public Criteria andUpbuildingareaEqualTo(BigDecimal value) {
            addCriterion("UPBUILDINGAREA =", value, "upbuildingarea");
            return (Criteria) this;
        }

        public Criteria andUpbuildingareaNotEqualTo(BigDecimal value) {
            addCriterion("UPBUILDINGAREA <>", value, "upbuildingarea");
            return (Criteria) this;
        }

        public Criteria andUpbuildingareaGreaterThan(BigDecimal value) {
            addCriterion("UPBUILDINGAREA >", value, "upbuildingarea");
            return (Criteria) this;
        }

        public Criteria andUpbuildingareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UPBUILDINGAREA >=", value, "upbuildingarea");
            return (Criteria) this;
        }

        public Criteria andUpbuildingareaLessThan(BigDecimal value) {
            addCriterion("UPBUILDINGAREA <", value, "upbuildingarea");
            return (Criteria) this;
        }

        public Criteria andUpbuildingareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UPBUILDINGAREA <=", value, "upbuildingarea");
            return (Criteria) this;
        }

        public Criteria andUpbuildingareaIn(List<BigDecimal> values) {
            addCriterion("UPBUILDINGAREA in", values, "upbuildingarea");
            return (Criteria) this;
        }

        public Criteria andUpbuildingareaNotIn(List<BigDecimal> values) {
            addCriterion("UPBUILDINGAREA not in", values, "upbuildingarea");
            return (Criteria) this;
        }

        public Criteria andUpbuildingareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPBUILDINGAREA between", value1, value2, "upbuildingarea");
            return (Criteria) this;
        }

        public Criteria andUpbuildingareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPBUILDINGAREA not between", value1, value2, "upbuildingarea");
            return (Criteria) this;
        }

        public Criteria andDownbuildingareaIsNull() {
            addCriterion("DOWNBUILDINGAREA is null");
            return (Criteria) this;
        }

        public Criteria andDownbuildingareaIsNotNull() {
            addCriterion("DOWNBUILDINGAREA is not null");
            return (Criteria) this;
        }

        public Criteria andDownbuildingareaEqualTo(BigDecimal value) {
            addCriterion("DOWNBUILDINGAREA =", value, "downbuildingarea");
            return (Criteria) this;
        }

        public Criteria andDownbuildingareaNotEqualTo(BigDecimal value) {
            addCriterion("DOWNBUILDINGAREA <>", value, "downbuildingarea");
            return (Criteria) this;
        }

        public Criteria andDownbuildingareaGreaterThan(BigDecimal value) {
            addCriterion("DOWNBUILDINGAREA >", value, "downbuildingarea");
            return (Criteria) this;
        }

        public Criteria andDownbuildingareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DOWNBUILDINGAREA >=", value, "downbuildingarea");
            return (Criteria) this;
        }

        public Criteria andDownbuildingareaLessThan(BigDecimal value) {
            addCriterion("DOWNBUILDINGAREA <", value, "downbuildingarea");
            return (Criteria) this;
        }

        public Criteria andDownbuildingareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DOWNBUILDINGAREA <=", value, "downbuildingarea");
            return (Criteria) this;
        }

        public Criteria andDownbuildingareaIn(List<BigDecimal> values) {
            addCriterion("DOWNBUILDINGAREA in", values, "downbuildingarea");
            return (Criteria) this;
        }

        public Criteria andDownbuildingareaNotIn(List<BigDecimal> values) {
            addCriterion("DOWNBUILDINGAREA not in", values, "downbuildingarea");
            return (Criteria) this;
        }

        public Criteria andDownbuildingareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOWNBUILDINGAREA between", value1, value2, "downbuildingarea");
            return (Criteria) this;
        }

        public Criteria andDownbuildingareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOWNBUILDINGAREA not between", value1, value2, "downbuildingarea");
            return (Criteria) this;
        }

        public Criteria andDowngarageareaIsNull() {
            addCriterion("DOWNGARAGEAREA is null");
            return (Criteria) this;
        }

        public Criteria andDowngarageareaIsNotNull() {
            addCriterion("DOWNGARAGEAREA is not null");
            return (Criteria) this;
        }

        public Criteria andDowngarageareaEqualTo(BigDecimal value) {
            addCriterion("DOWNGARAGEAREA =", value, "downgaragearea");
            return (Criteria) this;
        }

        public Criteria andDowngarageareaNotEqualTo(BigDecimal value) {
            addCriterion("DOWNGARAGEAREA <>", value, "downgaragearea");
            return (Criteria) this;
        }

        public Criteria andDowngarageareaGreaterThan(BigDecimal value) {
            addCriterion("DOWNGARAGEAREA >", value, "downgaragearea");
            return (Criteria) this;
        }

        public Criteria andDowngarageareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DOWNGARAGEAREA >=", value, "downgaragearea");
            return (Criteria) this;
        }

        public Criteria andDowngarageareaLessThan(BigDecimal value) {
            addCriterion("DOWNGARAGEAREA <", value, "downgaragearea");
            return (Criteria) this;
        }

        public Criteria andDowngarageareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DOWNGARAGEAREA <=", value, "downgaragearea");
            return (Criteria) this;
        }

        public Criteria andDowngarageareaIn(List<BigDecimal> values) {
            addCriterion("DOWNGARAGEAREA in", values, "downgaragearea");
            return (Criteria) this;
        }

        public Criteria andDowngarageareaNotIn(List<BigDecimal> values) {
            addCriterion("DOWNGARAGEAREA not in", values, "downgaragearea");
            return (Criteria) this;
        }

        public Criteria andDowngarageareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOWNGARAGEAREA between", value1, value2, "downgaragearea");
            return (Criteria) this;
        }

        public Criteria andDowngarageareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOWNGARAGEAREA not between", value1, value2, "downgaragearea");
            return (Criteria) this;
        }

        public Criteria andStiltfloorareaIsNull() {
            addCriterion("STILTFLOORAREA is null");
            return (Criteria) this;
        }

        public Criteria andStiltfloorareaIsNotNull() {
            addCriterion("STILTFLOORAREA is not null");
            return (Criteria) this;
        }

        public Criteria andStiltfloorareaEqualTo(BigDecimal value) {
            addCriterion("STILTFLOORAREA =", value, "stiltfloorarea");
            return (Criteria) this;
        }

        public Criteria andStiltfloorareaNotEqualTo(BigDecimal value) {
            addCriterion("STILTFLOORAREA <>", value, "stiltfloorarea");
            return (Criteria) this;
        }

        public Criteria andStiltfloorareaGreaterThan(BigDecimal value) {
            addCriterion("STILTFLOORAREA >", value, "stiltfloorarea");
            return (Criteria) this;
        }

        public Criteria andStiltfloorareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STILTFLOORAREA >=", value, "stiltfloorarea");
            return (Criteria) this;
        }

        public Criteria andStiltfloorareaLessThan(BigDecimal value) {
            addCriterion("STILTFLOORAREA <", value, "stiltfloorarea");
            return (Criteria) this;
        }

        public Criteria andStiltfloorareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STILTFLOORAREA <=", value, "stiltfloorarea");
            return (Criteria) this;
        }

        public Criteria andStiltfloorareaIn(List<BigDecimal> values) {
            addCriterion("STILTFLOORAREA in", values, "stiltfloorarea");
            return (Criteria) this;
        }

        public Criteria andStiltfloorareaNotIn(List<BigDecimal> values) {
            addCriterion("STILTFLOORAREA not in", values, "stiltfloorarea");
            return (Criteria) this;
        }

        public Criteria andStiltfloorareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STILTFLOORAREA between", value1, value2, "stiltfloorarea");
            return (Criteria) this;
        }

        public Criteria andStiltfloorareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STILTFLOORAREA not between", value1, value2, "stiltfloorarea");
            return (Criteria) this;
        }

        public Criteria andTowerdownareaIsNull() {
            addCriterion("TOWERDOWNAREA is null");
            return (Criteria) this;
        }

        public Criteria andTowerdownareaIsNotNull() {
            addCriterion("TOWERDOWNAREA is not null");
            return (Criteria) this;
        }

        public Criteria andTowerdownareaEqualTo(BigDecimal value) {
            addCriterion("TOWERDOWNAREA =", value, "towerdownarea");
            return (Criteria) this;
        }

        public Criteria andTowerdownareaNotEqualTo(BigDecimal value) {
            addCriterion("TOWERDOWNAREA <>", value, "towerdownarea");
            return (Criteria) this;
        }

        public Criteria andTowerdownareaGreaterThan(BigDecimal value) {
            addCriterion("TOWERDOWNAREA >", value, "towerdownarea");
            return (Criteria) this;
        }

        public Criteria andTowerdownareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOWERDOWNAREA >=", value, "towerdownarea");
            return (Criteria) this;
        }

        public Criteria andTowerdownareaLessThan(BigDecimal value) {
            addCriterion("TOWERDOWNAREA <", value, "towerdownarea");
            return (Criteria) this;
        }

        public Criteria andTowerdownareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOWERDOWNAREA <=", value, "towerdownarea");
            return (Criteria) this;
        }

        public Criteria andTowerdownareaIn(List<BigDecimal> values) {
            addCriterion("TOWERDOWNAREA in", values, "towerdownarea");
            return (Criteria) this;
        }

        public Criteria andTowerdownareaNotIn(List<BigDecimal> values) {
            addCriterion("TOWERDOWNAREA not in", values, "towerdownarea");
            return (Criteria) this;
        }

        public Criteria andTowerdownareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOWERDOWNAREA between", value1, value2, "towerdownarea");
            return (Criteria) this;
        }

        public Criteria andTowerdownareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOWERDOWNAREA not between", value1, value2, "towerdownarea");
            return (Criteria) this;
        }

        public Criteria andStoreroomnumIsNull() {
            addCriterion("STOREROOMNUM is null");
            return (Criteria) this;
        }

        public Criteria andStoreroomnumIsNotNull() {
            addCriterion("STOREROOMNUM is not null");
            return (Criteria) this;
        }

        public Criteria andStoreroomnumEqualTo(Short value) {
            addCriterion("STOREROOMNUM =", value, "storeroomnum");
            return (Criteria) this;
        }

        public Criteria andStoreroomnumNotEqualTo(Short value) {
            addCriterion("STOREROOMNUM <>", value, "storeroomnum");
            return (Criteria) this;
        }

        public Criteria andStoreroomnumGreaterThan(Short value) {
            addCriterion("STOREROOMNUM >", value, "storeroomnum");
            return (Criteria) this;
        }

        public Criteria andStoreroomnumGreaterThanOrEqualTo(Short value) {
            addCriterion("STOREROOMNUM >=", value, "storeroomnum");
            return (Criteria) this;
        }

        public Criteria andStoreroomnumLessThan(Short value) {
            addCriterion("STOREROOMNUM <", value, "storeroomnum");
            return (Criteria) this;
        }

        public Criteria andStoreroomnumLessThanOrEqualTo(Short value) {
            addCriterion("STOREROOMNUM <=", value, "storeroomnum");
            return (Criteria) this;
        }

        public Criteria andStoreroomnumIn(List<Short> values) {
            addCriterion("STOREROOMNUM in", values, "storeroomnum");
            return (Criteria) this;
        }

        public Criteria andStoreroomnumNotIn(List<Short> values) {
            addCriterion("STOREROOMNUM not in", values, "storeroomnum");
            return (Criteria) this;
        }

        public Criteria andStoreroomnumBetween(Short value1, Short value2) {
            addCriterion("STOREROOMNUM between", value1, value2, "storeroomnum");
            return (Criteria) this;
        }

        public Criteria andStoreroomnumNotBetween(Short value1, Short value2) {
            addCriterion("STOREROOMNUM not between", value1, value2, "storeroomnum");
            return (Criteria) this;
        }

        public Criteria andStoreroomareaIsNull() {
            addCriterion("STOREROOMAREA is null");
            return (Criteria) this;
        }

        public Criteria andStoreroomareaIsNotNull() {
            addCriterion("STOREROOMAREA is not null");
            return (Criteria) this;
        }

        public Criteria andStoreroomareaEqualTo(BigDecimal value) {
            addCriterion("STOREROOMAREA =", value, "storeroomarea");
            return (Criteria) this;
        }

        public Criteria andStoreroomareaNotEqualTo(BigDecimal value) {
            addCriterion("STOREROOMAREA <>", value, "storeroomarea");
            return (Criteria) this;
        }

        public Criteria andStoreroomareaGreaterThan(BigDecimal value) {
            addCriterion("STOREROOMAREA >", value, "storeroomarea");
            return (Criteria) this;
        }

        public Criteria andStoreroomareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STOREROOMAREA >=", value, "storeroomarea");
            return (Criteria) this;
        }

        public Criteria andStoreroomareaLessThan(BigDecimal value) {
            addCriterion("STOREROOMAREA <", value, "storeroomarea");
            return (Criteria) this;
        }

        public Criteria andStoreroomareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STOREROOMAREA <=", value, "storeroomarea");
            return (Criteria) this;
        }

        public Criteria andStoreroomareaIn(List<BigDecimal> values) {
            addCriterion("STOREROOMAREA in", values, "storeroomarea");
            return (Criteria) this;
        }

        public Criteria andStoreroomareaNotIn(List<BigDecimal> values) {
            addCriterion("STOREROOMAREA not in", values, "storeroomarea");
            return (Criteria) this;
        }

        public Criteria andStoreroomareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STOREROOMAREA between", value1, value2, "storeroomarea");
            return (Criteria) this;
        }

        public Criteria andStoreroomareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STOREROOMAREA not between", value1, value2, "storeroomarea");
            return (Criteria) this;
        }

        public Criteria andTotalsellareaIsNull() {
            addCriterion("TOTALSELLAREA is null");
            return (Criteria) this;
        }

        public Criteria andTotalsellareaIsNotNull() {
            addCriterion("TOTALSELLAREA is not null");
            return (Criteria) this;
        }

        public Criteria andTotalsellareaEqualTo(BigDecimal value) {
            addCriterion("TOTALSELLAREA =", value, "totalsellarea");
            return (Criteria) this;
        }

        public Criteria andTotalsellareaNotEqualTo(BigDecimal value) {
            addCriterion("TOTALSELLAREA <>", value, "totalsellarea");
            return (Criteria) this;
        }

        public Criteria andTotalsellareaGreaterThan(BigDecimal value) {
            addCriterion("TOTALSELLAREA >", value, "totalsellarea");
            return (Criteria) this;
        }

        public Criteria andTotalsellareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALSELLAREA >=", value, "totalsellarea");
            return (Criteria) this;
        }

        public Criteria andTotalsellareaLessThan(BigDecimal value) {
            addCriterion("TOTALSELLAREA <", value, "totalsellarea");
            return (Criteria) this;
        }

        public Criteria andTotalsellareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALSELLAREA <=", value, "totalsellarea");
            return (Criteria) this;
        }

        public Criteria andTotalsellareaIn(List<BigDecimal> values) {
            addCriterion("TOTALSELLAREA in", values, "totalsellarea");
            return (Criteria) this;
        }

        public Criteria andTotalsellareaNotIn(List<BigDecimal> values) {
            addCriterion("TOTALSELLAREA not in", values, "totalsellarea");
            return (Criteria) this;
        }

        public Criteria andTotalsellareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALSELLAREA between", value1, value2, "totalsellarea");
            return (Criteria) this;
        }

        public Criteria andTotalsellareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALSELLAREA not between", value1, value2, "totalsellarea");
            return (Criteria) this;
        }

        public Criteria andUpselfsellareaIsNull() {
            addCriterion("UPSELFSELLAREA is null");
            return (Criteria) this;
        }

        public Criteria andUpselfsellareaIsNotNull() {
            addCriterion("UPSELFSELLAREA is not null");
            return (Criteria) this;
        }

        public Criteria andUpselfsellareaEqualTo(BigDecimal value) {
            addCriterion("UPSELFSELLAREA =", value, "upselfsellarea");
            return (Criteria) this;
        }

        public Criteria andUpselfsellareaNotEqualTo(BigDecimal value) {
            addCriterion("UPSELFSELLAREA <>", value, "upselfsellarea");
            return (Criteria) this;
        }

        public Criteria andUpselfsellareaGreaterThan(BigDecimal value) {
            addCriterion("UPSELFSELLAREA >", value, "upselfsellarea");
            return (Criteria) this;
        }

        public Criteria andUpselfsellareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UPSELFSELLAREA >=", value, "upselfsellarea");
            return (Criteria) this;
        }

        public Criteria andUpselfsellareaLessThan(BigDecimal value) {
            addCriterion("UPSELFSELLAREA <", value, "upselfsellarea");
            return (Criteria) this;
        }

        public Criteria andUpselfsellareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UPSELFSELLAREA <=", value, "upselfsellarea");
            return (Criteria) this;
        }

        public Criteria andUpselfsellareaIn(List<BigDecimal> values) {
            addCriterion("UPSELFSELLAREA in", values, "upselfsellarea");
            return (Criteria) this;
        }

        public Criteria andUpselfsellareaNotIn(List<BigDecimal> values) {
            addCriterion("UPSELFSELLAREA not in", values, "upselfsellarea");
            return (Criteria) this;
        }

        public Criteria andUpselfsellareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPSELFSELLAREA between", value1, value2, "upselfsellarea");
            return (Criteria) this;
        }

        public Criteria andUpselfsellareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPSELFSELLAREA not between", value1, value2, "upselfsellarea");
            return (Criteria) this;
        }

        public Criteria andUpavailablesellareaIsNull() {
            addCriterion("UPAVAILABLESELLAREA is null");
            return (Criteria) this;
        }

        public Criteria andUpavailablesellareaIsNotNull() {
            addCriterion("UPAVAILABLESELLAREA is not null");
            return (Criteria) this;
        }

        public Criteria andUpavailablesellareaEqualTo(BigDecimal value) {
            addCriterion("UPAVAILABLESELLAREA =", value, "upavailablesellarea");
            return (Criteria) this;
        }

        public Criteria andUpavailablesellareaNotEqualTo(BigDecimal value) {
            addCriterion("UPAVAILABLESELLAREA <>", value, "upavailablesellarea");
            return (Criteria) this;
        }

        public Criteria andUpavailablesellareaGreaterThan(BigDecimal value) {
            addCriterion("UPAVAILABLESELLAREA >", value, "upavailablesellarea");
            return (Criteria) this;
        }

        public Criteria andUpavailablesellareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UPAVAILABLESELLAREA >=", value, "upavailablesellarea");
            return (Criteria) this;
        }

        public Criteria andUpavailablesellareaLessThan(BigDecimal value) {
            addCriterion("UPAVAILABLESELLAREA <", value, "upavailablesellarea");
            return (Criteria) this;
        }

        public Criteria andUpavailablesellareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UPAVAILABLESELLAREA <=", value, "upavailablesellarea");
            return (Criteria) this;
        }

        public Criteria andUpavailablesellareaIn(List<BigDecimal> values) {
            addCriterion("UPAVAILABLESELLAREA in", values, "upavailablesellarea");
            return (Criteria) this;
        }

        public Criteria andUpavailablesellareaNotIn(List<BigDecimal> values) {
            addCriterion("UPAVAILABLESELLAREA not in", values, "upavailablesellarea");
            return (Criteria) this;
        }

        public Criteria andUpavailablesellareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPAVAILABLESELLAREA between", value1, value2, "upavailablesellarea");
            return (Criteria) this;
        }

        public Criteria andUpavailablesellareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPAVAILABLESELLAREA not between", value1, value2, "upavailablesellarea");
            return (Criteria) this;
        }

        public Criteria andUpgovernmentareaIsNull() {
            addCriterion("UPGOVERNMENTAREA is null");
            return (Criteria) this;
        }

        public Criteria andUpgovernmentareaIsNotNull() {
            addCriterion("UPGOVERNMENTAREA is not null");
            return (Criteria) this;
        }

        public Criteria andUpgovernmentareaEqualTo(BigDecimal value) {
            addCriterion("UPGOVERNMENTAREA =", value, "upgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andUpgovernmentareaNotEqualTo(BigDecimal value) {
            addCriterion("UPGOVERNMENTAREA <>", value, "upgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andUpgovernmentareaGreaterThan(BigDecimal value) {
            addCriterion("UPGOVERNMENTAREA >", value, "upgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andUpgovernmentareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UPGOVERNMENTAREA >=", value, "upgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andUpgovernmentareaLessThan(BigDecimal value) {
            addCriterion("UPGOVERNMENTAREA <", value, "upgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andUpgovernmentareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UPGOVERNMENTAREA <=", value, "upgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andUpgovernmentareaIn(List<BigDecimal> values) {
            addCriterion("UPGOVERNMENTAREA in", values, "upgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andUpgovernmentareaNotIn(List<BigDecimal> values) {
            addCriterion("UPGOVERNMENTAREA not in", values, "upgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andUpgovernmentareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPGOVERNMENTAREA between", value1, value2, "upgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andUpgovernmentareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPGOVERNMENTAREA not between", value1, value2, "upgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andDownselfsellareaIsNull() {
            addCriterion("DOWNSELFSELLAREA is null");
            return (Criteria) this;
        }

        public Criteria andDownselfsellareaIsNotNull() {
            addCriterion("DOWNSELFSELLAREA is not null");
            return (Criteria) this;
        }

        public Criteria andDownselfsellareaEqualTo(BigDecimal value) {
            addCriterion("DOWNSELFSELLAREA =", value, "downselfsellarea");
            return (Criteria) this;
        }

        public Criteria andDownselfsellareaNotEqualTo(BigDecimal value) {
            addCriterion("DOWNSELFSELLAREA <>", value, "downselfsellarea");
            return (Criteria) this;
        }

        public Criteria andDownselfsellareaGreaterThan(BigDecimal value) {
            addCriterion("DOWNSELFSELLAREA >", value, "downselfsellarea");
            return (Criteria) this;
        }

        public Criteria andDownselfsellareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DOWNSELFSELLAREA >=", value, "downselfsellarea");
            return (Criteria) this;
        }

        public Criteria andDownselfsellareaLessThan(BigDecimal value) {
            addCriterion("DOWNSELFSELLAREA <", value, "downselfsellarea");
            return (Criteria) this;
        }

        public Criteria andDownselfsellareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DOWNSELFSELLAREA <=", value, "downselfsellarea");
            return (Criteria) this;
        }

        public Criteria andDownselfsellareaIn(List<BigDecimal> values) {
            addCriterion("DOWNSELFSELLAREA in", values, "downselfsellarea");
            return (Criteria) this;
        }

        public Criteria andDownselfsellareaNotIn(List<BigDecimal> values) {
            addCriterion("DOWNSELFSELLAREA not in", values, "downselfsellarea");
            return (Criteria) this;
        }

        public Criteria andDownselfsellareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOWNSELFSELLAREA between", value1, value2, "downselfsellarea");
            return (Criteria) this;
        }

        public Criteria andDownselfsellareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOWNSELFSELLAREA not between", value1, value2, "downselfsellarea");
            return (Criteria) this;
        }

        public Criteria andDownothersellareaIsNull() {
            addCriterion("DOWNOTHERSELLAREA is null");
            return (Criteria) this;
        }

        public Criteria andDownothersellareaIsNotNull() {
            addCriterion("DOWNOTHERSELLAREA is not null");
            return (Criteria) this;
        }

        public Criteria andDownothersellareaEqualTo(BigDecimal value) {
            addCriterion("DOWNOTHERSELLAREA =", value, "downothersellarea");
            return (Criteria) this;
        }

        public Criteria andDownothersellareaNotEqualTo(BigDecimal value) {
            addCriterion("DOWNOTHERSELLAREA <>", value, "downothersellarea");
            return (Criteria) this;
        }

        public Criteria andDownothersellareaGreaterThan(BigDecimal value) {
            addCriterion("DOWNOTHERSELLAREA >", value, "downothersellarea");
            return (Criteria) this;
        }

        public Criteria andDownothersellareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DOWNOTHERSELLAREA >=", value, "downothersellarea");
            return (Criteria) this;
        }

        public Criteria andDownothersellareaLessThan(BigDecimal value) {
            addCriterion("DOWNOTHERSELLAREA <", value, "downothersellarea");
            return (Criteria) this;
        }

        public Criteria andDownothersellareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DOWNOTHERSELLAREA <=", value, "downothersellarea");
            return (Criteria) this;
        }

        public Criteria andDownothersellareaIn(List<BigDecimal> values) {
            addCriterion("DOWNOTHERSELLAREA in", values, "downothersellarea");
            return (Criteria) this;
        }

        public Criteria andDownothersellareaNotIn(List<BigDecimal> values) {
            addCriterion("DOWNOTHERSELLAREA not in", values, "downothersellarea");
            return (Criteria) this;
        }

        public Criteria andDownothersellareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOWNOTHERSELLAREA between", value1, value2, "downothersellarea");
            return (Criteria) this;
        }

        public Criteria andDownothersellareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOWNOTHERSELLAREA not between", value1, value2, "downothersellarea");
            return (Criteria) this;
        }

        public Criteria andTotalpresentareaIsNull() {
            addCriterion("TOTALPRESENTAREA is null");
            return (Criteria) this;
        }

        public Criteria andTotalpresentareaIsNotNull() {
            addCriterion("TOTALPRESENTAREA is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpresentareaEqualTo(BigDecimal value) {
            addCriterion("TOTALPRESENTAREA =", value, "totalpresentarea");
            return (Criteria) this;
        }

        public Criteria andTotalpresentareaNotEqualTo(BigDecimal value) {
            addCriterion("TOTALPRESENTAREA <>", value, "totalpresentarea");
            return (Criteria) this;
        }

        public Criteria andTotalpresentareaGreaterThan(BigDecimal value) {
            addCriterion("TOTALPRESENTAREA >", value, "totalpresentarea");
            return (Criteria) this;
        }

        public Criteria andTotalpresentareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALPRESENTAREA >=", value, "totalpresentarea");
            return (Criteria) this;
        }

        public Criteria andTotalpresentareaLessThan(BigDecimal value) {
            addCriterion("TOTALPRESENTAREA <", value, "totalpresentarea");
            return (Criteria) this;
        }

        public Criteria andTotalpresentareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALPRESENTAREA <=", value, "totalpresentarea");
            return (Criteria) this;
        }

        public Criteria andTotalpresentareaIn(List<BigDecimal> values) {
            addCriterion("TOTALPRESENTAREA in", values, "totalpresentarea");
            return (Criteria) this;
        }

        public Criteria andTotalpresentareaNotIn(List<BigDecimal> values) {
            addCriterion("TOTALPRESENTAREA not in", values, "totalpresentarea");
            return (Criteria) this;
        }

        public Criteria andTotalpresentareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALPRESENTAREA between", value1, value2, "totalpresentarea");
            return (Criteria) this;
        }

        public Criteria andTotalpresentareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALPRESENTAREA not between", value1, value2, "totalpresentarea");
            return (Criteria) this;
        }

        public Criteria andUppresentareaIsNull() {
            addCriterion("UPPRESENTAREA is null");
            return (Criteria) this;
        }

        public Criteria andUppresentareaIsNotNull() {
            addCriterion("UPPRESENTAREA is not null");
            return (Criteria) this;
        }

        public Criteria andUppresentareaEqualTo(BigDecimal value) {
            addCriterion("UPPRESENTAREA =", value, "uppresentarea");
            return (Criteria) this;
        }

        public Criteria andUppresentareaNotEqualTo(BigDecimal value) {
            addCriterion("UPPRESENTAREA <>", value, "uppresentarea");
            return (Criteria) this;
        }

        public Criteria andUppresentareaGreaterThan(BigDecimal value) {
            addCriterion("UPPRESENTAREA >", value, "uppresentarea");
            return (Criteria) this;
        }

        public Criteria andUppresentareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UPPRESENTAREA >=", value, "uppresentarea");
            return (Criteria) this;
        }

        public Criteria andUppresentareaLessThan(BigDecimal value) {
            addCriterion("UPPRESENTAREA <", value, "uppresentarea");
            return (Criteria) this;
        }

        public Criteria andUppresentareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UPPRESENTAREA <=", value, "uppresentarea");
            return (Criteria) this;
        }

        public Criteria andUppresentareaIn(List<BigDecimal> values) {
            addCriterion("UPPRESENTAREA in", values, "uppresentarea");
            return (Criteria) this;
        }

        public Criteria andUppresentareaNotIn(List<BigDecimal> values) {
            addCriterion("UPPRESENTAREA not in", values, "uppresentarea");
            return (Criteria) this;
        }

        public Criteria andUppresentareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPPRESENTAREA between", value1, value2, "uppresentarea");
            return (Criteria) this;
        }

        public Criteria andUppresentareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPPRESENTAREA not between", value1, value2, "uppresentarea");
            return (Criteria) this;
        }

        public Criteria andDownpresentareaIsNull() {
            addCriterion("DOWNPRESENTAREA is null");
            return (Criteria) this;
        }

        public Criteria andDownpresentareaIsNotNull() {
            addCriterion("DOWNPRESENTAREA is not null");
            return (Criteria) this;
        }

        public Criteria andDownpresentareaEqualTo(BigDecimal value) {
            addCriterion("DOWNPRESENTAREA =", value, "downpresentarea");
            return (Criteria) this;
        }

        public Criteria andDownpresentareaNotEqualTo(BigDecimal value) {
            addCriterion("DOWNPRESENTAREA <>", value, "downpresentarea");
            return (Criteria) this;
        }

        public Criteria andDownpresentareaGreaterThan(BigDecimal value) {
            addCriterion("DOWNPRESENTAREA >", value, "downpresentarea");
            return (Criteria) this;
        }

        public Criteria andDownpresentareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DOWNPRESENTAREA >=", value, "downpresentarea");
            return (Criteria) this;
        }

        public Criteria andDownpresentareaLessThan(BigDecimal value) {
            addCriterion("DOWNPRESENTAREA <", value, "downpresentarea");
            return (Criteria) this;
        }

        public Criteria andDownpresentareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DOWNPRESENTAREA <=", value, "downpresentarea");
            return (Criteria) this;
        }

        public Criteria andDownpresentareaIn(List<BigDecimal> values) {
            addCriterion("DOWNPRESENTAREA in", values, "downpresentarea");
            return (Criteria) this;
        }

        public Criteria andDownpresentareaNotIn(List<BigDecimal> values) {
            addCriterion("DOWNPRESENTAREA not in", values, "downpresentarea");
            return (Criteria) this;
        }

        public Criteria andDownpresentareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOWNPRESENTAREA between", value1, value2, "downpresentarea");
            return (Criteria) this;
        }

        public Criteria andDownpresentareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOWNPRESENTAREA not between", value1, value2, "downpresentarea");
            return (Criteria) this;
        }

        public Criteria andAdditionalareaIsNull() {
            addCriterion("ADDITIONALAREA is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalareaIsNotNull() {
            addCriterion("ADDITIONALAREA is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalareaEqualTo(BigDecimal value) {
            addCriterion("ADDITIONALAREA =", value, "additionalarea");
            return (Criteria) this;
        }

        public Criteria andAdditionalareaNotEqualTo(BigDecimal value) {
            addCriterion("ADDITIONALAREA <>", value, "additionalarea");
            return (Criteria) this;
        }

        public Criteria andAdditionalareaGreaterThan(BigDecimal value) {
            addCriterion("ADDITIONALAREA >", value, "additionalarea");
            return (Criteria) this;
        }

        public Criteria andAdditionalareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ADDITIONALAREA >=", value, "additionalarea");
            return (Criteria) this;
        }

        public Criteria andAdditionalareaLessThan(BigDecimal value) {
            addCriterion("ADDITIONALAREA <", value, "additionalarea");
            return (Criteria) this;
        }

        public Criteria andAdditionalareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ADDITIONALAREA <=", value, "additionalarea");
            return (Criteria) this;
        }

        public Criteria andAdditionalareaIn(List<BigDecimal> values) {
            addCriterion("ADDITIONALAREA in", values, "additionalarea");
            return (Criteria) this;
        }

        public Criteria andAdditionalareaNotIn(List<BigDecimal> values) {
            addCriterion("ADDITIONALAREA not in", values, "additionalarea");
            return (Criteria) this;
        }

        public Criteria andAdditionalareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADDITIONALAREA between", value1, value2, "additionalarea");
            return (Criteria) this;
        }

        public Criteria andAdditionalareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADDITIONALAREA not between", value1, value2, "additionalarea");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheightIsNull() {
            addCriterion("BUILDINGMAXHEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheightIsNotNull() {
            addCriterion("BUILDINGMAXHEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheightEqualTo(String value) {
            addCriterion("BUILDINGMAXHEIGHT =", value, "buildingmaxheight");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheightNotEqualTo(String value) {
            addCriterion("BUILDINGMAXHEIGHT <>", value, "buildingmaxheight");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheightGreaterThan(String value) {
            addCriterion("BUILDINGMAXHEIGHT >", value, "buildingmaxheight");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheightGreaterThanOrEqualTo(String value) {
            addCriterion("BUILDINGMAXHEIGHT >=", value, "buildingmaxheight");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheightLessThan(String value) {
            addCriterion("BUILDINGMAXHEIGHT <", value, "buildingmaxheight");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheightLessThanOrEqualTo(String value) {
            addCriterion("BUILDINGMAXHEIGHT <=", value, "buildingmaxheight");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheightLike(String value) {
            addCriterion("BUILDINGMAXHEIGHT like", value, "buildingmaxheight");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheightNotLike(String value) {
            addCriterion("BUILDINGMAXHEIGHT not like", value, "buildingmaxheight");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheightIn(List<String> values) {
            addCriterion("BUILDINGMAXHEIGHT in", values, "buildingmaxheight");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheightNotIn(List<String> values) {
            addCriterion("BUILDINGMAXHEIGHT not in", values, "buildingmaxheight");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheightBetween(String value1, String value2) {
            addCriterion("BUILDINGMAXHEIGHT between", value1, value2, "buildingmaxheight");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheightNotBetween(String value1, String value2) {
            addCriterion("BUILDINGMAXHEIGHT not between", value1, value2, "buildingmaxheight");
            return (Criteria) this;
        }

        public Criteria andPlanratioIsNull() {
            addCriterion("PLANRATIO is null");
            return (Criteria) this;
        }

        public Criteria andPlanratioIsNotNull() {
            addCriterion("PLANRATIO is not null");
            return (Criteria) this;
        }

        public Criteria andPlanratioEqualTo(String value) {
            addCriterion("PLANRATIO =", value, "planratio");
            return (Criteria) this;
        }

        public Criteria andPlanratioNotEqualTo(String value) {
            addCriterion("PLANRATIO <>", value, "planratio");
            return (Criteria) this;
        }

        public Criteria andPlanratioGreaterThan(String value) {
            addCriterion("PLANRATIO >", value, "planratio");
            return (Criteria) this;
        }

        public Criteria andPlanratioGreaterThanOrEqualTo(String value) {
            addCriterion("PLANRATIO >=", value, "planratio");
            return (Criteria) this;
        }

        public Criteria andPlanratioLessThan(String value) {
            addCriterion("PLANRATIO <", value, "planratio");
            return (Criteria) this;
        }

        public Criteria andPlanratioLessThanOrEqualTo(String value) {
            addCriterion("PLANRATIO <=", value, "planratio");
            return (Criteria) this;
        }

        public Criteria andPlanratioLike(String value) {
            addCriterion("PLANRATIO like", value, "planratio");
            return (Criteria) this;
        }

        public Criteria andPlanratioNotLike(String value) {
            addCriterion("PLANRATIO not like", value, "planratio");
            return (Criteria) this;
        }

        public Criteria andPlanratioIn(List<String> values) {
            addCriterion("PLANRATIO in", values, "planratio");
            return (Criteria) this;
        }

        public Criteria andPlanratioNotIn(List<String> values) {
            addCriterion("PLANRATIO not in", values, "planratio");
            return (Criteria) this;
        }

        public Criteria andPlanratioBetween(String value1, String value2) {
            addCriterion("PLANRATIO between", value1, value2, "planratio");
            return (Criteria) this;
        }

        public Criteria andPlanratioNotBetween(String value1, String value2) {
            addCriterion("PLANRATIO not between", value1, value2, "planratio");
            return (Criteria) this;
        }

        public Criteria andPlandensityIsNull() {
            addCriterion("PLANDENSITY is null");
            return (Criteria) this;
        }

        public Criteria andPlandensityIsNotNull() {
            addCriterion("PLANDENSITY is not null");
            return (Criteria) this;
        }

        public Criteria andPlandensityEqualTo(String value) {
            addCriterion("PLANDENSITY =", value, "plandensity");
            return (Criteria) this;
        }

        public Criteria andPlandensityNotEqualTo(String value) {
            addCriterion("PLANDENSITY <>", value, "plandensity");
            return (Criteria) this;
        }

        public Criteria andPlandensityGreaterThan(String value) {
            addCriterion("PLANDENSITY >", value, "plandensity");
            return (Criteria) this;
        }

        public Criteria andPlandensityGreaterThanOrEqualTo(String value) {
            addCriterion("PLANDENSITY >=", value, "plandensity");
            return (Criteria) this;
        }

        public Criteria andPlandensityLessThan(String value) {
            addCriterion("PLANDENSITY <", value, "plandensity");
            return (Criteria) this;
        }

        public Criteria andPlandensityLessThanOrEqualTo(String value) {
            addCriterion("PLANDENSITY <=", value, "plandensity");
            return (Criteria) this;
        }

        public Criteria andPlandensityLike(String value) {
            addCriterion("PLANDENSITY like", value, "plandensity");
            return (Criteria) this;
        }

        public Criteria andPlandensityNotLike(String value) {
            addCriterion("PLANDENSITY not like", value, "plandensity");
            return (Criteria) this;
        }

        public Criteria andPlandensityIn(List<String> values) {
            addCriterion("PLANDENSITY in", values, "plandensity");
            return (Criteria) this;
        }

        public Criteria andPlandensityNotIn(List<String> values) {
            addCriterion("PLANDENSITY not in", values, "plandensity");
            return (Criteria) this;
        }

        public Criteria andPlandensityBetween(String value1, String value2) {
            addCriterion("PLANDENSITY between", value1, value2, "plandensity");
            return (Criteria) this;
        }

        public Criteria andPlandensityNotBetween(String value1, String value2) {
            addCriterion("PLANDENSITY not between", value1, value2, "plandensity");
            return (Criteria) this;
        }

        public Criteria andBuildingminheightIsNull() {
            addCriterion("BUILDINGMINHEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andBuildingminheightIsNotNull() {
            addCriterion("BUILDINGMINHEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingminheightEqualTo(String value) {
            addCriterion("BUILDINGMINHEIGHT =", value, "buildingminheight");
            return (Criteria) this;
        }

        public Criteria andBuildingminheightNotEqualTo(String value) {
            addCriterion("BUILDINGMINHEIGHT <>", value, "buildingminheight");
            return (Criteria) this;
        }

        public Criteria andBuildingminheightGreaterThan(String value) {
            addCriterion("BUILDINGMINHEIGHT >", value, "buildingminheight");
            return (Criteria) this;
        }

        public Criteria andBuildingminheightGreaterThanOrEqualTo(String value) {
            addCriterion("BUILDINGMINHEIGHT >=", value, "buildingminheight");
            return (Criteria) this;
        }

        public Criteria andBuildingminheightLessThan(String value) {
            addCriterion("BUILDINGMINHEIGHT <", value, "buildingminheight");
            return (Criteria) this;
        }

        public Criteria andBuildingminheightLessThanOrEqualTo(String value) {
            addCriterion("BUILDINGMINHEIGHT <=", value, "buildingminheight");
            return (Criteria) this;
        }

        public Criteria andBuildingminheightLike(String value) {
            addCriterion("BUILDINGMINHEIGHT like", value, "buildingminheight");
            return (Criteria) this;
        }

        public Criteria andBuildingminheightNotLike(String value) {
            addCriterion("BUILDINGMINHEIGHT not like", value, "buildingminheight");
            return (Criteria) this;
        }

        public Criteria andBuildingminheightIn(List<String> values) {
            addCriterion("BUILDINGMINHEIGHT in", values, "buildingminheight");
            return (Criteria) this;
        }

        public Criteria andBuildingminheightNotIn(List<String> values) {
            addCriterion("BUILDINGMINHEIGHT not in", values, "buildingminheight");
            return (Criteria) this;
        }

        public Criteria andBuildingminheightBetween(String value1, String value2) {
            addCriterion("BUILDINGMINHEIGHT between", value1, value2, "buildingminheight");
            return (Criteria) this;
        }

        public Criteria andBuildingminheightNotBetween(String value1, String value2) {
            addCriterion("BUILDINGMINHEIGHT not between", value1, value2, "buildingminheight");
            return (Criteria) this;
        }

        public Criteria andRealratioIsNull() {
            addCriterion("REALRATIO is null");
            return (Criteria) this;
        }

        public Criteria andRealratioIsNotNull() {
            addCriterion("REALRATIO is not null");
            return (Criteria) this;
        }

        public Criteria andRealratioEqualTo(BigDecimal value) {
            addCriterion("REALRATIO =", value, "realratio");
            return (Criteria) this;
        }

        public Criteria andRealratioNotEqualTo(BigDecimal value) {
            addCriterion("REALRATIO <>", value, "realratio");
            return (Criteria) this;
        }

        public Criteria andRealratioGreaterThan(BigDecimal value) {
            addCriterion("REALRATIO >", value, "realratio");
            return (Criteria) this;
        }

        public Criteria andRealratioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REALRATIO >=", value, "realratio");
            return (Criteria) this;
        }

        public Criteria andRealratioLessThan(BigDecimal value) {
            addCriterion("REALRATIO <", value, "realratio");
            return (Criteria) this;
        }

        public Criteria andRealratioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REALRATIO <=", value, "realratio");
            return (Criteria) this;
        }

        public Criteria andRealratioIn(List<BigDecimal> values) {
            addCriterion("REALRATIO in", values, "realratio");
            return (Criteria) this;
        }

        public Criteria andRealratioNotIn(List<BigDecimal> values) {
            addCriterion("REALRATIO not in", values, "realratio");
            return (Criteria) this;
        }

        public Criteria andRealratioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REALRATIO between", value1, value2, "realratio");
            return (Criteria) this;
        }

        public Criteria andRealratioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REALRATIO not between", value1, value2, "realratio");
            return (Criteria) this;
        }

        public Criteria andRealdensityIsNull() {
            addCriterion("REALDENSITY is null");
            return (Criteria) this;
        }

        public Criteria andRealdensityIsNotNull() {
            addCriterion("REALDENSITY is not null");
            return (Criteria) this;
        }

        public Criteria andRealdensityEqualTo(BigDecimal value) {
            addCriterion("REALDENSITY =", value, "realdensity");
            return (Criteria) this;
        }

        public Criteria andRealdensityNotEqualTo(BigDecimal value) {
            addCriterion("REALDENSITY <>", value, "realdensity");
            return (Criteria) this;
        }

        public Criteria andRealdensityGreaterThan(BigDecimal value) {
            addCriterion("REALDENSITY >", value, "realdensity");
            return (Criteria) this;
        }

        public Criteria andRealdensityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REALDENSITY >=", value, "realdensity");
            return (Criteria) this;
        }

        public Criteria andRealdensityLessThan(BigDecimal value) {
            addCriterion("REALDENSITY <", value, "realdensity");
            return (Criteria) this;
        }

        public Criteria andRealdensityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REALDENSITY <=", value, "realdensity");
            return (Criteria) this;
        }

        public Criteria andRealdensityIn(List<BigDecimal> values) {
            addCriterion("REALDENSITY in", values, "realdensity");
            return (Criteria) this;
        }

        public Criteria andRealdensityNotIn(List<BigDecimal> values) {
            addCriterion("REALDENSITY not in", values, "realdensity");
            return (Criteria) this;
        }

        public Criteria andRealdensityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REALDENSITY between", value1, value2, "realdensity");
            return (Criteria) this;
        }

        public Criteria andRealdensityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REALDENSITY not between", value1, value2, "realdensity");
            return (Criteria) this;
        }

        public Criteria andAvailablethanIsNull() {
            addCriterion("AVAILABLETHAN is null");
            return (Criteria) this;
        }

        public Criteria andAvailablethanIsNotNull() {
            addCriterion("AVAILABLETHAN is not null");
            return (Criteria) this;
        }

        public Criteria andAvailablethanEqualTo(BigDecimal value) {
            addCriterion("AVAILABLETHAN =", value, "availablethan");
            return (Criteria) this;
        }

        public Criteria andAvailablethanNotEqualTo(BigDecimal value) {
            addCriterion("AVAILABLETHAN <>", value, "availablethan");
            return (Criteria) this;
        }

        public Criteria andAvailablethanGreaterThan(BigDecimal value) {
            addCriterion("AVAILABLETHAN >", value, "availablethan");
            return (Criteria) this;
        }

        public Criteria andAvailablethanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AVAILABLETHAN >=", value, "availablethan");
            return (Criteria) this;
        }

        public Criteria andAvailablethanLessThan(BigDecimal value) {
            addCriterion("AVAILABLETHAN <", value, "availablethan");
            return (Criteria) this;
        }

        public Criteria andAvailablethanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AVAILABLETHAN <=", value, "availablethan");
            return (Criteria) this;
        }

        public Criteria andAvailablethanIn(List<BigDecimal> values) {
            addCriterion("AVAILABLETHAN in", values, "availablethan");
            return (Criteria) this;
        }

        public Criteria andAvailablethanNotIn(List<BigDecimal> values) {
            addCriterion("AVAILABLETHAN not in", values, "availablethan");
            return (Criteria) this;
        }

        public Criteria andAvailablethanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVAILABLETHAN between", value1, value2, "availablethan");
            return (Criteria) this;
        }

        public Criteria andAvailablethanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVAILABLETHAN not between", value1, value2, "availablethan");
            return (Criteria) this;
        }

        public Criteria andTotalstallnumIsNull() {
            addCriterion("TOTALSTALLNUM is null");
            return (Criteria) this;
        }

        public Criteria andTotalstallnumIsNotNull() {
            addCriterion("TOTALSTALLNUM is not null");
            return (Criteria) this;
        }

        public Criteria andTotalstallnumEqualTo(Short value) {
            addCriterion("TOTALSTALLNUM =", value, "totalstallnum");
            return (Criteria) this;
        }

        public Criteria andTotalstallnumNotEqualTo(Short value) {
            addCriterion("TOTALSTALLNUM <>", value, "totalstallnum");
            return (Criteria) this;
        }

        public Criteria andTotalstallnumGreaterThan(Short value) {
            addCriterion("TOTALSTALLNUM >", value, "totalstallnum");
            return (Criteria) this;
        }

        public Criteria andTotalstallnumGreaterThanOrEqualTo(Short value) {
            addCriterion("TOTALSTALLNUM >=", value, "totalstallnum");
            return (Criteria) this;
        }

        public Criteria andTotalstallnumLessThan(Short value) {
            addCriterion("TOTALSTALLNUM <", value, "totalstallnum");
            return (Criteria) this;
        }

        public Criteria andTotalstallnumLessThanOrEqualTo(Short value) {
            addCriterion("TOTALSTALLNUM <=", value, "totalstallnum");
            return (Criteria) this;
        }

        public Criteria andTotalstallnumIn(List<Short> values) {
            addCriterion("TOTALSTALLNUM in", values, "totalstallnum");
            return (Criteria) this;
        }

        public Criteria andTotalstallnumNotIn(List<Short> values) {
            addCriterion("TOTALSTALLNUM not in", values, "totalstallnum");
            return (Criteria) this;
        }

        public Criteria andTotalstallnumBetween(Short value1, Short value2) {
            addCriterion("TOTALSTALLNUM between", value1, value2, "totalstallnum");
            return (Criteria) this;
        }

        public Criteria andTotalstallnumNotBetween(Short value1, Short value2) {
            addCriterion("TOTALSTALLNUM not between", value1, value2, "totalstallnum");
            return (Criteria) this;
        }

        public Criteria andUpstallnumIsNull() {
            addCriterion("UPSTALLNUM is null");
            return (Criteria) this;
        }

        public Criteria andUpstallnumIsNotNull() {
            addCriterion("UPSTALLNUM is not null");
            return (Criteria) this;
        }

        public Criteria andUpstallnumEqualTo(Short value) {
            addCriterion("UPSTALLNUM =", value, "upstallnum");
            return (Criteria) this;
        }

        public Criteria andUpstallnumNotEqualTo(Short value) {
            addCriterion("UPSTALLNUM <>", value, "upstallnum");
            return (Criteria) this;
        }

        public Criteria andUpstallnumGreaterThan(Short value) {
            addCriterion("UPSTALLNUM >", value, "upstallnum");
            return (Criteria) this;
        }

        public Criteria andUpstallnumGreaterThanOrEqualTo(Short value) {
            addCriterion("UPSTALLNUM >=", value, "upstallnum");
            return (Criteria) this;
        }

        public Criteria andUpstallnumLessThan(Short value) {
            addCriterion("UPSTALLNUM <", value, "upstallnum");
            return (Criteria) this;
        }

        public Criteria andUpstallnumLessThanOrEqualTo(Short value) {
            addCriterion("UPSTALLNUM <=", value, "upstallnum");
            return (Criteria) this;
        }

        public Criteria andUpstallnumIn(List<Short> values) {
            addCriterion("UPSTALLNUM in", values, "upstallnum");
            return (Criteria) this;
        }

        public Criteria andUpstallnumNotIn(List<Short> values) {
            addCriterion("UPSTALLNUM not in", values, "upstallnum");
            return (Criteria) this;
        }

        public Criteria andUpstallnumBetween(Short value1, Short value2) {
            addCriterion("UPSTALLNUM between", value1, value2, "upstallnum");
            return (Criteria) this;
        }

        public Criteria andUpstallnumNotBetween(Short value1, Short value2) {
            addCriterion("UPSTALLNUM not between", value1, value2, "upstallnum");
            return (Criteria) this;
        }

        public Criteria andUpgroundstallnumIsNull() {
            addCriterion("UPGROUNDSTALLNUM is null");
            return (Criteria) this;
        }

        public Criteria andUpgroundstallnumIsNotNull() {
            addCriterion("UPGROUNDSTALLNUM is not null");
            return (Criteria) this;
        }

        public Criteria andUpgroundstallnumEqualTo(Short value) {
            addCriterion("UPGROUNDSTALLNUM =", value, "upgroundstallnum");
            return (Criteria) this;
        }

        public Criteria andUpgroundstallnumNotEqualTo(Short value) {
            addCriterion("UPGROUNDSTALLNUM <>", value, "upgroundstallnum");
            return (Criteria) this;
        }

        public Criteria andUpgroundstallnumGreaterThan(Short value) {
            addCriterion("UPGROUNDSTALLNUM >", value, "upgroundstallnum");
            return (Criteria) this;
        }

        public Criteria andUpgroundstallnumGreaterThanOrEqualTo(Short value) {
            addCriterion("UPGROUNDSTALLNUM >=", value, "upgroundstallnum");
            return (Criteria) this;
        }

        public Criteria andUpgroundstallnumLessThan(Short value) {
            addCriterion("UPGROUNDSTALLNUM <", value, "upgroundstallnum");
            return (Criteria) this;
        }

        public Criteria andUpgroundstallnumLessThanOrEqualTo(Short value) {
            addCriterion("UPGROUNDSTALLNUM <=", value, "upgroundstallnum");
            return (Criteria) this;
        }

        public Criteria andUpgroundstallnumIn(List<Short> values) {
            addCriterion("UPGROUNDSTALLNUM in", values, "upgroundstallnum");
            return (Criteria) this;
        }

        public Criteria andUpgroundstallnumNotIn(List<Short> values) {
            addCriterion("UPGROUNDSTALLNUM not in", values, "upgroundstallnum");
            return (Criteria) this;
        }

        public Criteria andUpgroundstallnumBetween(Short value1, Short value2) {
            addCriterion("UPGROUNDSTALLNUM between", value1, value2, "upgroundstallnum");
            return (Criteria) this;
        }

        public Criteria andUpgroundstallnumNotBetween(Short value1, Short value2) {
            addCriterion("UPGROUNDSTALLNUM not between", value1, value2, "upgroundstallnum");
            return (Criteria) this;
        }

        public Criteria andSemiundergroundstallnumIsNull() {
            addCriterion("SEMIUNDERGROUNDSTALLNUM is null");
            return (Criteria) this;
        }

        public Criteria andSemiundergroundstallnumIsNotNull() {
            addCriterion("SEMIUNDERGROUNDSTALLNUM is not null");
            return (Criteria) this;
        }

        public Criteria andSemiundergroundstallnumEqualTo(Short value) {
            addCriterion("SEMIUNDERGROUNDSTALLNUM =", value, "semiundergroundstallnum");
            return (Criteria) this;
        }

        public Criteria andSemiundergroundstallnumNotEqualTo(Short value) {
            addCriterion("SEMIUNDERGROUNDSTALLNUM <>", value, "semiundergroundstallnum");
            return (Criteria) this;
        }

        public Criteria andSemiundergroundstallnumGreaterThan(Short value) {
            addCriterion("SEMIUNDERGROUNDSTALLNUM >", value, "semiundergroundstallnum");
            return (Criteria) this;
        }

        public Criteria andSemiundergroundstallnumGreaterThanOrEqualTo(Short value) {
            addCriterion("SEMIUNDERGROUNDSTALLNUM >=", value, "semiundergroundstallnum");
            return (Criteria) this;
        }

        public Criteria andSemiundergroundstallnumLessThan(Short value) {
            addCriterion("SEMIUNDERGROUNDSTALLNUM <", value, "semiundergroundstallnum");
            return (Criteria) this;
        }

        public Criteria andSemiundergroundstallnumLessThanOrEqualTo(Short value) {
            addCriterion("SEMIUNDERGROUNDSTALLNUM <=", value, "semiundergroundstallnum");
            return (Criteria) this;
        }

        public Criteria andSemiundergroundstallnumIn(List<Short> values) {
            addCriterion("SEMIUNDERGROUNDSTALLNUM in", values, "semiundergroundstallnum");
            return (Criteria) this;
        }

        public Criteria andSemiundergroundstallnumNotIn(List<Short> values) {
            addCriterion("SEMIUNDERGROUNDSTALLNUM not in", values, "semiundergroundstallnum");
            return (Criteria) this;
        }

        public Criteria andSemiundergroundstallnumBetween(Short value1, Short value2) {
            addCriterion("SEMIUNDERGROUNDSTALLNUM between", value1, value2, "semiundergroundstallnum");
            return (Criteria) this;
        }

        public Criteria andSemiundergroundstallnumNotBetween(Short value1, Short value2) {
            addCriterion("SEMIUNDERGROUNDSTALLNUM not between", value1, value2, "semiundergroundstallnum");
            return (Criteria) this;
        }

        public Criteria andStallnuminbuildingIsNull() {
            addCriterion("STALLNUMINBUILDING is null");
            return (Criteria) this;
        }

        public Criteria andStallnuminbuildingIsNotNull() {
            addCriterion("STALLNUMINBUILDING is not null");
            return (Criteria) this;
        }

        public Criteria andStallnuminbuildingEqualTo(Short value) {
            addCriterion("STALLNUMINBUILDING =", value, "stallnuminbuilding");
            return (Criteria) this;
        }

        public Criteria andStallnuminbuildingNotEqualTo(Short value) {
            addCriterion("STALLNUMINBUILDING <>", value, "stallnuminbuilding");
            return (Criteria) this;
        }

        public Criteria andStallnuminbuildingGreaterThan(Short value) {
            addCriterion("STALLNUMINBUILDING >", value, "stallnuminbuilding");
            return (Criteria) this;
        }

        public Criteria andStallnuminbuildingGreaterThanOrEqualTo(Short value) {
            addCriterion("STALLNUMINBUILDING >=", value, "stallnuminbuilding");
            return (Criteria) this;
        }

        public Criteria andStallnuminbuildingLessThan(Short value) {
            addCriterion("STALLNUMINBUILDING <", value, "stallnuminbuilding");
            return (Criteria) this;
        }

        public Criteria andStallnuminbuildingLessThanOrEqualTo(Short value) {
            addCriterion("STALLNUMINBUILDING <=", value, "stallnuminbuilding");
            return (Criteria) this;
        }

        public Criteria andStallnuminbuildingIn(List<Short> values) {
            addCriterion("STALLNUMINBUILDING in", values, "stallnuminbuilding");
            return (Criteria) this;
        }

        public Criteria andStallnuminbuildingNotIn(List<Short> values) {
            addCriterion("STALLNUMINBUILDING not in", values, "stallnuminbuilding");
            return (Criteria) this;
        }

        public Criteria andStallnuminbuildingBetween(Short value1, Short value2) {
            addCriterion("STALLNUMINBUILDING between", value1, value2, "stallnuminbuilding");
            return (Criteria) this;
        }

        public Criteria andStallnuminbuildingNotBetween(Short value1, Short value2) {
            addCriterion("STALLNUMINBUILDING not between", value1, value2, "stallnuminbuilding");
            return (Criteria) this;
        }

        public Criteria andDownautostallnumIsNull() {
            addCriterion("DOWNAUTOSTALLNUM is null");
            return (Criteria) this;
        }

        public Criteria andDownautostallnumIsNotNull() {
            addCriterion("DOWNAUTOSTALLNUM is not null");
            return (Criteria) this;
        }

        public Criteria andDownautostallnumEqualTo(Short value) {
            addCriterion("DOWNAUTOSTALLNUM =", value, "downautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownautostallnumNotEqualTo(Short value) {
            addCriterion("DOWNAUTOSTALLNUM <>", value, "downautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownautostallnumGreaterThan(Short value) {
            addCriterion("DOWNAUTOSTALLNUM >", value, "downautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownautostallnumGreaterThanOrEqualTo(Short value) {
            addCriterion("DOWNAUTOSTALLNUM >=", value, "downautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownautostallnumLessThan(Short value) {
            addCriterion("DOWNAUTOSTALLNUM <", value, "downautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownautostallnumLessThanOrEqualTo(Short value) {
            addCriterion("DOWNAUTOSTALLNUM <=", value, "downautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownautostallnumIn(List<Short> values) {
            addCriterion("DOWNAUTOSTALLNUM in", values, "downautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownautostallnumNotIn(List<Short> values) {
            addCriterion("DOWNAUTOSTALLNUM not in", values, "downautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownautostallnumBetween(Short value1, Short value2) {
            addCriterion("DOWNAUTOSTALLNUM between", value1, value2, "downautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownautostallnumNotBetween(Short value1, Short value2) {
            addCriterion("DOWNAUTOSTALLNUM not between", value1, value2, "downautostallnum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenumIsNull() {
            addCriterion("DOWNDEFENCENUM is null");
            return (Criteria) this;
        }

        public Criteria andDowndefencenumIsNotNull() {
            addCriterion("DOWNDEFENCENUM is not null");
            return (Criteria) this;
        }

        public Criteria andDowndefencenumEqualTo(Short value) {
            addCriterion("DOWNDEFENCENUM =", value, "downdefencenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenumNotEqualTo(Short value) {
            addCriterion("DOWNDEFENCENUM <>", value, "downdefencenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenumGreaterThan(Short value) {
            addCriterion("DOWNDEFENCENUM >", value, "downdefencenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenumGreaterThanOrEqualTo(Short value) {
            addCriterion("DOWNDEFENCENUM >=", value, "downdefencenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenumLessThan(Short value) {
            addCriterion("DOWNDEFENCENUM <", value, "downdefencenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenumLessThanOrEqualTo(Short value) {
            addCriterion("DOWNDEFENCENUM <=", value, "downdefencenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenumIn(List<Short> values) {
            addCriterion("DOWNDEFENCENUM in", values, "downdefencenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenumNotIn(List<Short> values) {
            addCriterion("DOWNDEFENCENUM not in", values, "downdefencenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenumBetween(Short value1, Short value2) {
            addCriterion("DOWNDEFENCENUM between", value1, value2, "downdefencenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenumNotBetween(Short value1, Short value2) {
            addCriterion("DOWNDEFENCENUM not between", value1, value2, "downdefencenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencemachinenumIsNull() {
            addCriterion("DOWNDEFENCEMACHINENUM is null");
            return (Criteria) this;
        }

        public Criteria andDowndefencemachinenumIsNotNull() {
            addCriterion("DOWNDEFENCEMACHINENUM is not null");
            return (Criteria) this;
        }

        public Criteria andDowndefencemachinenumEqualTo(Short value) {
            addCriterion("DOWNDEFENCEMACHINENUM =", value, "downdefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencemachinenumNotEqualTo(Short value) {
            addCriterion("DOWNDEFENCEMACHINENUM <>", value, "downdefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencemachinenumGreaterThan(Short value) {
            addCriterion("DOWNDEFENCEMACHINENUM >", value, "downdefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencemachinenumGreaterThanOrEqualTo(Short value) {
            addCriterion("DOWNDEFENCEMACHINENUM >=", value, "downdefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencemachinenumLessThan(Short value) {
            addCriterion("DOWNDEFENCEMACHINENUM <", value, "downdefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencemachinenumLessThanOrEqualTo(Short value) {
            addCriterion("DOWNDEFENCEMACHINENUM <=", value, "downdefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencemachinenumIn(List<Short> values) {
            addCriterion("DOWNDEFENCEMACHINENUM in", values, "downdefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencemachinenumNotIn(List<Short> values) {
            addCriterion("DOWNDEFENCEMACHINENUM not in", values, "downdefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencemachinenumBetween(Short value1, Short value2) {
            addCriterion("DOWNDEFENCEMACHINENUM between", value1, value2, "downdefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencemachinenumNotBetween(Short value1, Short value2) {
            addCriterion("DOWNDEFENCEMACHINENUM not between", value1, value2, "downdefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenonmachinenumIsNull() {
            addCriterion("DOWNDEFENCENONMACHINENUM is null");
            return (Criteria) this;
        }

        public Criteria andDowndefencenonmachinenumIsNotNull() {
            addCriterion("DOWNDEFENCENONMACHINENUM is not null");
            return (Criteria) this;
        }

        public Criteria andDowndefencenonmachinenumEqualTo(Short value) {
            addCriterion("DOWNDEFENCENONMACHINENUM =", value, "downdefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenonmachinenumNotEqualTo(Short value) {
            addCriterion("DOWNDEFENCENONMACHINENUM <>", value, "downdefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenonmachinenumGreaterThan(Short value) {
            addCriterion("DOWNDEFENCENONMACHINENUM >", value, "downdefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenonmachinenumGreaterThanOrEqualTo(Short value) {
            addCriterion("DOWNDEFENCENONMACHINENUM >=", value, "downdefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenonmachinenumLessThan(Short value) {
            addCriterion("DOWNDEFENCENONMACHINENUM <", value, "downdefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenonmachinenumLessThanOrEqualTo(Short value) {
            addCriterion("DOWNDEFENCENONMACHINENUM <=", value, "downdefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenonmachinenumIn(List<Short> values) {
            addCriterion("DOWNDEFENCENONMACHINENUM in", values, "downdefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenonmachinenumNotIn(List<Short> values) {
            addCriterion("DOWNDEFENCENONMACHINENUM not in", values, "downdefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenonmachinenumBetween(Short value1, Short value2) {
            addCriterion("DOWNDEFENCENONMACHINENUM between", value1, value2, "downdefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenonmachinenumNotBetween(Short value1, Short value2) {
            addCriterion("DOWNDEFENCENONMACHINENUM not between", value1, value2, "downdefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenumIsNull() {
            addCriterion("DOWNNONDEFENCENUM is null");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenumIsNotNull() {
            addCriterion("DOWNNONDEFENCENUM is not null");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenumEqualTo(Short value) {
            addCriterion("DOWNNONDEFENCENUM =", value, "downnondefencenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenumNotEqualTo(Short value) {
            addCriterion("DOWNNONDEFENCENUM <>", value, "downnondefencenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenumGreaterThan(Short value) {
            addCriterion("DOWNNONDEFENCENUM >", value, "downnondefencenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenumGreaterThanOrEqualTo(Short value) {
            addCriterion("DOWNNONDEFENCENUM >=", value, "downnondefencenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenumLessThan(Short value) {
            addCriterion("DOWNNONDEFENCENUM <", value, "downnondefencenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenumLessThanOrEqualTo(Short value) {
            addCriterion("DOWNNONDEFENCENUM <=", value, "downnondefencenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenumIn(List<Short> values) {
            addCriterion("DOWNNONDEFENCENUM in", values, "downnondefencenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenumNotIn(List<Short> values) {
            addCriterion("DOWNNONDEFENCENUM not in", values, "downnondefencenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenumBetween(Short value1, Short value2) {
            addCriterion("DOWNNONDEFENCENUM between", value1, value2, "downnondefencenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenumNotBetween(Short value1, Short value2) {
            addCriterion("DOWNNONDEFENCENUM not between", value1, value2, "downnondefencenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencemachinenumIsNull() {
            addCriterion("DOWNNONDEFENCEMACHINENUM is null");
            return (Criteria) this;
        }

        public Criteria andDownnondefencemachinenumIsNotNull() {
            addCriterion("DOWNNONDEFENCEMACHINENUM is not null");
            return (Criteria) this;
        }

        public Criteria andDownnondefencemachinenumEqualTo(Short value) {
            addCriterion("DOWNNONDEFENCEMACHINENUM =", value, "downnondefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencemachinenumNotEqualTo(Short value) {
            addCriterion("DOWNNONDEFENCEMACHINENUM <>", value, "downnondefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencemachinenumGreaterThan(Short value) {
            addCriterion("DOWNNONDEFENCEMACHINENUM >", value, "downnondefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencemachinenumGreaterThanOrEqualTo(Short value) {
            addCriterion("DOWNNONDEFENCEMACHINENUM >=", value, "downnondefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencemachinenumLessThan(Short value) {
            addCriterion("DOWNNONDEFENCEMACHINENUM <", value, "downnondefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencemachinenumLessThanOrEqualTo(Short value) {
            addCriterion("DOWNNONDEFENCEMACHINENUM <=", value, "downnondefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencemachinenumIn(List<Short> values) {
            addCriterion("DOWNNONDEFENCEMACHINENUM in", values, "downnondefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencemachinenumNotIn(List<Short> values) {
            addCriterion("DOWNNONDEFENCEMACHINENUM not in", values, "downnondefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencemachinenumBetween(Short value1, Short value2) {
            addCriterion("DOWNNONDEFENCEMACHINENUM between", value1, value2, "downnondefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencemachinenumNotBetween(Short value1, Short value2) {
            addCriterion("DOWNNONDEFENCEMACHINENUM not between", value1, value2, "downnondefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenonmachinenumIsNull() {
            addCriterion("DOWNNONDEFENCENONMACHINENUM is null");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenonmachinenumIsNotNull() {
            addCriterion("DOWNNONDEFENCENONMACHINENUM is not null");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenonmachinenumEqualTo(Short value) {
            addCriterion("DOWNNONDEFENCENONMACHINENUM =", value, "downnondefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenonmachinenumNotEqualTo(Short value) {
            addCriterion("DOWNNONDEFENCENONMACHINENUM <>", value, "downnondefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenonmachinenumGreaterThan(Short value) {
            addCriterion("DOWNNONDEFENCENONMACHINENUM >", value, "downnondefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenonmachinenumGreaterThanOrEqualTo(Short value) {
            addCriterion("DOWNNONDEFENCENONMACHINENUM >=", value, "downnondefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenonmachinenumLessThan(Short value) {
            addCriterion("DOWNNONDEFENCENONMACHINENUM <", value, "downnondefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenonmachinenumLessThanOrEqualTo(Short value) {
            addCriterion("DOWNNONDEFENCENONMACHINENUM <=", value, "downnondefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenonmachinenumIn(List<Short> values) {
            addCriterion("DOWNNONDEFENCENONMACHINENUM in", values, "downnondefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenonmachinenumNotIn(List<Short> values) {
            addCriterion("DOWNNONDEFENCENONMACHINENUM not in", values, "downnondefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenonmachinenumBetween(Short value1, Short value2) {
            addCriterion("DOWNNONDEFENCENONMACHINENUM between", value1, value2, "downnondefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenonmachinenumNotBetween(Short value1, Short value2) {
            addCriterion("DOWNNONDEFENCENONMACHINENUM not between", value1, value2, "downnondefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andSemidownnodefencemachinenumIsNull() {
            addCriterion("SEMIDOWNNODEFENCEMACHINENUM is null");
            return (Criteria) this;
        }

        public Criteria andSemidownnodefencemachinenumIsNotNull() {
            addCriterion("SEMIDOWNNODEFENCEMACHINENUM is not null");
            return (Criteria) this;
        }

        public Criteria andSemidownnodefencemachinenumEqualTo(Short value) {
            addCriterion("SEMIDOWNNODEFENCEMACHINENUM =", value, "semidownnodefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andSemidownnodefencemachinenumNotEqualTo(Short value) {
            addCriterion("SEMIDOWNNODEFENCEMACHINENUM <>", value, "semidownnodefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andSemidownnodefencemachinenumGreaterThan(Short value) {
            addCriterion("SEMIDOWNNODEFENCEMACHINENUM >", value, "semidownnodefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andSemidownnodefencemachinenumGreaterThanOrEqualTo(Short value) {
            addCriterion("SEMIDOWNNODEFENCEMACHINENUM >=", value, "semidownnodefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andSemidownnodefencemachinenumLessThan(Short value) {
            addCriterion("SEMIDOWNNODEFENCEMACHINENUM <", value, "semidownnodefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andSemidownnodefencemachinenumLessThanOrEqualTo(Short value) {
            addCriterion("SEMIDOWNNODEFENCEMACHINENUM <=", value, "semidownnodefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andSemidownnodefencemachinenumIn(List<Short> values) {
            addCriterion("SEMIDOWNNODEFENCEMACHINENUM in", values, "semidownnodefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andSemidownnodefencemachinenumNotIn(List<Short> values) {
            addCriterion("SEMIDOWNNODEFENCEMACHINENUM not in", values, "semidownnodefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andSemidownnodefencemachinenumBetween(Short value1, Short value2) {
            addCriterion("SEMIDOWNNODEFENCEMACHINENUM between", value1, value2, "semidownnodefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andSemidownnodefencemachinenumNotBetween(Short value1, Short value2) {
            addCriterion("SEMIDOWNNODEFENCEMACHINENUM not between", value1, value2, "semidownnodefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnonautostallnumIsNull() {
            addCriterion("DOWNNONAUTOSTALLNUM is null");
            return (Criteria) this;
        }

        public Criteria andDownnonautostallnumIsNotNull() {
            addCriterion("DOWNNONAUTOSTALLNUM is not null");
            return (Criteria) this;
        }

        public Criteria andDownnonautostallnumEqualTo(Short value) {
            addCriterion("DOWNNONAUTOSTALLNUM =", value, "downnonautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownnonautostallnumNotEqualTo(Short value) {
            addCriterion("DOWNNONAUTOSTALLNUM <>", value, "downnonautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownnonautostallnumGreaterThan(Short value) {
            addCriterion("DOWNNONAUTOSTALLNUM >", value, "downnonautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownnonautostallnumGreaterThanOrEqualTo(Short value) {
            addCriterion("DOWNNONAUTOSTALLNUM >=", value, "downnonautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownnonautostallnumLessThan(Short value) {
            addCriterion("DOWNNONAUTOSTALLNUM <", value, "downnonautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownnonautostallnumLessThanOrEqualTo(Short value) {
            addCriterion("DOWNNONAUTOSTALLNUM <=", value, "downnonautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownnonautostallnumIn(List<Short> values) {
            addCriterion("DOWNNONAUTOSTALLNUM in", values, "downnonautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownnonautostallnumNotIn(List<Short> values) {
            addCriterion("DOWNNONAUTOSTALLNUM not in", values, "downnonautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownnonautostallnumBetween(Short value1, Short value2) {
            addCriterion("DOWNNONAUTOSTALLNUM between", value1, value2, "downnonautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownnonautostallnumNotBetween(Short value1, Short value2) {
            addCriterion("DOWNNONAUTOSTALLNUM not between", value1, value2, "downnonautostallnum");
            return (Criteria) this;
        }

        public Criteria andPlangreenradioIsNull() {
            addCriterion("PLANGREENRADIO is null");
            return (Criteria) this;
        }

        public Criteria andPlangreenradioIsNotNull() {
            addCriterion("PLANGREENRADIO is not null");
            return (Criteria) this;
        }

        public Criteria andPlangreenradioEqualTo(String value) {
            addCriterion("PLANGREENRADIO =", value, "plangreenradio");
            return (Criteria) this;
        }

        public Criteria andPlangreenradioNotEqualTo(String value) {
            addCriterion("PLANGREENRADIO <>", value, "plangreenradio");
            return (Criteria) this;
        }

        public Criteria andPlangreenradioGreaterThan(String value) {
            addCriterion("PLANGREENRADIO >", value, "plangreenradio");
            return (Criteria) this;
        }

        public Criteria andPlangreenradioGreaterThanOrEqualTo(String value) {
            addCriterion("PLANGREENRADIO >=", value, "plangreenradio");
            return (Criteria) this;
        }

        public Criteria andPlangreenradioLessThan(String value) {
            addCriterion("PLANGREENRADIO <", value, "plangreenradio");
            return (Criteria) this;
        }

        public Criteria andPlangreenradioLessThanOrEqualTo(String value) {
            addCriterion("PLANGREENRADIO <=", value, "plangreenradio");
            return (Criteria) this;
        }

        public Criteria andPlangreenradioLike(String value) {
            addCriterion("PLANGREENRADIO like", value, "plangreenradio");
            return (Criteria) this;
        }

        public Criteria andPlangreenradioNotLike(String value) {
            addCriterion("PLANGREENRADIO not like", value, "plangreenradio");
            return (Criteria) this;
        }

        public Criteria andPlangreenradioIn(List<String> values) {
            addCriterion("PLANGREENRADIO in", values, "plangreenradio");
            return (Criteria) this;
        }

        public Criteria andPlangreenradioNotIn(List<String> values) {
            addCriterion("PLANGREENRADIO not in", values, "plangreenradio");
            return (Criteria) this;
        }

        public Criteria andPlangreenradioBetween(String value1, String value2) {
            addCriterion("PLANGREENRADIO between", value1, value2, "plangreenradio");
            return (Criteria) this;
        }

        public Criteria andPlangreenradioNotBetween(String value1, String value2) {
            addCriterion("PLANGREENRADIO not between", value1, value2, "plangreenradio");
            return (Criteria) this;
        }

        public Criteria andGreenradioIsNull() {
            addCriterion("GREENRADIO is null");
            return (Criteria) this;
        }

        public Criteria andGreenradioIsNotNull() {
            addCriterion("GREENRADIO is not null");
            return (Criteria) this;
        }

        public Criteria andGreenradioEqualTo(BigDecimal value) {
            addCriterion("GREENRADIO =", value, "greenradio");
            return (Criteria) this;
        }

        public Criteria andGreenradioNotEqualTo(BigDecimal value) {
            addCriterion("GREENRADIO <>", value, "greenradio");
            return (Criteria) this;
        }

        public Criteria andGreenradioGreaterThan(BigDecimal value) {
            addCriterion("GREENRADIO >", value, "greenradio");
            return (Criteria) this;
        }

        public Criteria andGreenradioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GREENRADIO >=", value, "greenradio");
            return (Criteria) this;
        }

        public Criteria andGreenradioLessThan(BigDecimal value) {
            addCriterion("GREENRADIO <", value, "greenradio");
            return (Criteria) this;
        }

        public Criteria andGreenradioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GREENRADIO <=", value, "greenradio");
            return (Criteria) this;
        }

        public Criteria andGreenradioIn(List<BigDecimal> values) {
            addCriterion("GREENRADIO in", values, "greenradio");
            return (Criteria) this;
        }

        public Criteria andGreenradioNotIn(List<BigDecimal> values) {
            addCriterion("GREENRADIO not in", values, "greenradio");
            return (Criteria) this;
        }

        public Criteria andGreenradioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GREENRADIO between", value1, value2, "greenradio");
            return (Criteria) this;
        }

        public Criteria andGreenradioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GREENRADIO not between", value1, value2, "greenradio");
            return (Criteria) this;
        }

        public Criteria andStallareaIsNull() {
            addCriterion("STALLAREA is null");
            return (Criteria) this;
        }

        public Criteria andStallareaIsNotNull() {
            addCriterion("STALLAREA is not null");
            return (Criteria) this;
        }

        public Criteria andStallareaEqualTo(BigDecimal value) {
            addCriterion("STALLAREA =", value, "stallarea");
            return (Criteria) this;
        }

        public Criteria andStallareaNotEqualTo(BigDecimal value) {
            addCriterion("STALLAREA <>", value, "stallarea");
            return (Criteria) this;
        }

        public Criteria andStallareaGreaterThan(BigDecimal value) {
            addCriterion("STALLAREA >", value, "stallarea");
            return (Criteria) this;
        }

        public Criteria andStallareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STALLAREA >=", value, "stallarea");
            return (Criteria) this;
        }

        public Criteria andStallareaLessThan(BigDecimal value) {
            addCriterion("STALLAREA <", value, "stallarea");
            return (Criteria) this;
        }

        public Criteria andStallareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STALLAREA <=", value, "stallarea");
            return (Criteria) this;
        }

        public Criteria andStallareaIn(List<BigDecimal> values) {
            addCriterion("STALLAREA in", values, "stallarea");
            return (Criteria) this;
        }

        public Criteria andStallareaNotIn(List<BigDecimal> values) {
            addCriterion("STALLAREA not in", values, "stallarea");
            return (Criteria) this;
        }

        public Criteria andStallareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STALLAREA between", value1, value2, "stallarea");
            return (Criteria) this;
        }

        public Criteria andStallareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STALLAREA not between", value1, value2, "stallarea");
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

        public Criteria andHousetypenumIsNull() {
            addCriterion("HOUSETYPENUM is null");
            return (Criteria) this;
        }

        public Criteria andHousetypenumIsNotNull() {
            addCriterion("HOUSETYPENUM is not null");
            return (Criteria) this;
        }

        public Criteria andHousetypenumEqualTo(Short value) {
            addCriterion("HOUSETYPENUM =", value, "housetypenum");
            return (Criteria) this;
        }

        public Criteria andHousetypenumNotEqualTo(Short value) {
            addCriterion("HOUSETYPENUM <>", value, "housetypenum");
            return (Criteria) this;
        }

        public Criteria andHousetypenumGreaterThan(Short value) {
            addCriterion("HOUSETYPENUM >", value, "housetypenum");
            return (Criteria) this;
        }

        public Criteria andHousetypenumGreaterThanOrEqualTo(Short value) {
            addCriterion("HOUSETYPENUM >=", value, "housetypenum");
            return (Criteria) this;
        }

        public Criteria andHousetypenumLessThan(Short value) {
            addCriterion("HOUSETYPENUM <", value, "housetypenum");
            return (Criteria) this;
        }

        public Criteria andHousetypenumLessThanOrEqualTo(Short value) {
            addCriterion("HOUSETYPENUM <=", value, "housetypenum");
            return (Criteria) this;
        }

        public Criteria andHousetypenumIn(List<Short> values) {
            addCriterion("HOUSETYPENUM in", values, "housetypenum");
            return (Criteria) this;
        }

        public Criteria andHousetypenumNotIn(List<Short> values) {
            addCriterion("HOUSETYPENUM not in", values, "housetypenum");
            return (Criteria) this;
        }

        public Criteria andHousetypenumBetween(Short value1, Short value2) {
            addCriterion("HOUSETYPENUM between", value1, value2, "housetypenum");
            return (Criteria) this;
        }

        public Criteria andHousetypenumNotBetween(Short value1, Short value2) {
            addCriterion("HOUSETYPENUM not between", value1, value2, "housetypenum");
            return (Criteria) this;
        }

        public Criteria andSellsystemcodeIsNull() {
            addCriterion("SELLSYSTEMCODE is null");
            return (Criteria) this;
        }

        public Criteria andSellsystemcodeIsNotNull() {
            addCriterion("SELLSYSTEMCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSellsystemcodeEqualTo(String value) {
            addCriterion("SELLSYSTEMCODE =", value, "sellsystemcode");
            return (Criteria) this;
        }

        public Criteria andSellsystemcodeNotEqualTo(String value) {
            addCriterion("SELLSYSTEMCODE <>", value, "sellsystemcode");
            return (Criteria) this;
        }

        public Criteria andSellsystemcodeGreaterThan(String value) {
            addCriterion("SELLSYSTEMCODE >", value, "sellsystemcode");
            return (Criteria) this;
        }

        public Criteria andSellsystemcodeGreaterThanOrEqualTo(String value) {
            addCriterion("SELLSYSTEMCODE >=", value, "sellsystemcode");
            return (Criteria) this;
        }

        public Criteria andSellsystemcodeLessThan(String value) {
            addCriterion("SELLSYSTEMCODE <", value, "sellsystemcode");
            return (Criteria) this;
        }

        public Criteria andSellsystemcodeLessThanOrEqualTo(String value) {
            addCriterion("SELLSYSTEMCODE <=", value, "sellsystemcode");
            return (Criteria) this;
        }

        public Criteria andSellsystemcodeLike(String value) {
            addCriterion("SELLSYSTEMCODE like", value, "sellsystemcode");
            return (Criteria) this;
        }

        public Criteria andSellsystemcodeNotLike(String value) {
            addCriterion("SELLSYSTEMCODE not like", value, "sellsystemcode");
            return (Criteria) this;
        }

        public Criteria andSellsystemcodeIn(List<String> values) {
            addCriterion("SELLSYSTEMCODE in", values, "sellsystemcode");
            return (Criteria) this;
        }

        public Criteria andSellsystemcodeNotIn(List<String> values) {
            addCriterion("SELLSYSTEMCODE not in", values, "sellsystemcode");
            return (Criteria) this;
        }

        public Criteria andSellsystemcodeBetween(String value1, String value2) {
            addCriterion("SELLSYSTEMCODE between", value1, value2, "sellsystemcode");
            return (Criteria) this;
        }

        public Criteria andSellsystemcodeNotBetween(String value1, String value2) {
            addCriterion("SELLSYSTEMCODE not between", value1, value2, "sellsystemcode");
            return (Criteria) this;
        }

        public Criteria andCostsystemcodeIsNull() {
            addCriterion("COSTSYSTEMCODE is null");
            return (Criteria) this;
        }

        public Criteria andCostsystemcodeIsNotNull() {
            addCriterion("COSTSYSTEMCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCostsystemcodeEqualTo(String value) {
            addCriterion("COSTSYSTEMCODE =", value, "costsystemcode");
            return (Criteria) this;
        }

        public Criteria andCostsystemcodeNotEqualTo(String value) {
            addCriterion("COSTSYSTEMCODE <>", value, "costsystemcode");
            return (Criteria) this;
        }

        public Criteria andCostsystemcodeGreaterThan(String value) {
            addCriterion("COSTSYSTEMCODE >", value, "costsystemcode");
            return (Criteria) this;
        }

        public Criteria andCostsystemcodeGreaterThanOrEqualTo(String value) {
            addCriterion("COSTSYSTEMCODE >=", value, "costsystemcode");
            return (Criteria) this;
        }

        public Criteria andCostsystemcodeLessThan(String value) {
            addCriterion("COSTSYSTEMCODE <", value, "costsystemcode");
            return (Criteria) this;
        }

        public Criteria andCostsystemcodeLessThanOrEqualTo(String value) {
            addCriterion("COSTSYSTEMCODE <=", value, "costsystemcode");
            return (Criteria) this;
        }

        public Criteria andCostsystemcodeLike(String value) {
            addCriterion("COSTSYSTEMCODE like", value, "costsystemcode");
            return (Criteria) this;
        }

        public Criteria andCostsystemcodeNotLike(String value) {
            addCriterion("COSTSYSTEMCODE not like", value, "costsystemcode");
            return (Criteria) this;
        }

        public Criteria andCostsystemcodeIn(List<String> values) {
            addCriterion("COSTSYSTEMCODE in", values, "costsystemcode");
            return (Criteria) this;
        }

        public Criteria andCostsystemcodeNotIn(List<String> values) {
            addCriterion("COSTSYSTEMCODE not in", values, "costsystemcode");
            return (Criteria) this;
        }

        public Criteria andCostsystemcodeBetween(String value1, String value2) {
            addCriterion("COSTSYSTEMCODE between", value1, value2, "costsystemcode");
            return (Criteria) this;
        }

        public Criteria andCostsystemcodeNotBetween(String value1, String value2) {
            addCriterion("COSTSYSTEMCODE not between", value1, value2, "costsystemcode");
            return (Criteria) this;
        }

        public Criteria andPurchasesystemcodeIsNull() {
            addCriterion("PURCHASESYSTEMCODE is null");
            return (Criteria) this;
        }

        public Criteria andPurchasesystemcodeIsNotNull() {
            addCriterion("PURCHASESYSTEMCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasesystemcodeEqualTo(String value) {
            addCriterion("PURCHASESYSTEMCODE =", value, "purchasesystemcode");
            return (Criteria) this;
        }

        public Criteria andPurchasesystemcodeNotEqualTo(String value) {
            addCriterion("PURCHASESYSTEMCODE <>", value, "purchasesystemcode");
            return (Criteria) this;
        }

        public Criteria andPurchasesystemcodeGreaterThan(String value) {
            addCriterion("PURCHASESYSTEMCODE >", value, "purchasesystemcode");
            return (Criteria) this;
        }

        public Criteria andPurchasesystemcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASESYSTEMCODE >=", value, "purchasesystemcode");
            return (Criteria) this;
        }

        public Criteria andPurchasesystemcodeLessThan(String value) {
            addCriterion("PURCHASESYSTEMCODE <", value, "purchasesystemcode");
            return (Criteria) this;
        }

        public Criteria andPurchasesystemcodeLessThanOrEqualTo(String value) {
            addCriterion("PURCHASESYSTEMCODE <=", value, "purchasesystemcode");
            return (Criteria) this;
        }

        public Criteria andPurchasesystemcodeLike(String value) {
            addCriterion("PURCHASESYSTEMCODE like", value, "purchasesystemcode");
            return (Criteria) this;
        }

        public Criteria andPurchasesystemcodeNotLike(String value) {
            addCriterion("PURCHASESYSTEMCODE not like", value, "purchasesystemcode");
            return (Criteria) this;
        }

        public Criteria andPurchasesystemcodeIn(List<String> values) {
            addCriterion("PURCHASESYSTEMCODE in", values, "purchasesystemcode");
            return (Criteria) this;
        }

        public Criteria andPurchasesystemcodeNotIn(List<String> values) {
            addCriterion("PURCHASESYSTEMCODE not in", values, "purchasesystemcode");
            return (Criteria) this;
        }

        public Criteria andPurchasesystemcodeBetween(String value1, String value2) {
            addCriterion("PURCHASESYSTEMCODE between", value1, value2, "purchasesystemcode");
            return (Criteria) this;
        }

        public Criteria andPurchasesystemcodeNotBetween(String value1, String value2) {
            addCriterion("PURCHASESYSTEMCODE not between", value1, value2, "purchasesystemcode");
            return (Criteria) this;
        }

        public Criteria andFinancialsystemcodeIsNull() {
            addCriterion("FINANCIALSYSTEMCODE is null");
            return (Criteria) this;
        }

        public Criteria andFinancialsystemcodeIsNotNull() {
            addCriterion("FINANCIALSYSTEMCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFinancialsystemcodeEqualTo(String value) {
            addCriterion("FINANCIALSYSTEMCODE =", value, "financialsystemcode");
            return (Criteria) this;
        }

        public Criteria andFinancialsystemcodeNotEqualTo(String value) {
            addCriterion("FINANCIALSYSTEMCODE <>", value, "financialsystemcode");
            return (Criteria) this;
        }

        public Criteria andFinancialsystemcodeGreaterThan(String value) {
            addCriterion("FINANCIALSYSTEMCODE >", value, "financialsystemcode");
            return (Criteria) this;
        }

        public Criteria andFinancialsystemcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FINANCIALSYSTEMCODE >=", value, "financialsystemcode");
            return (Criteria) this;
        }

        public Criteria andFinancialsystemcodeLessThan(String value) {
            addCriterion("FINANCIALSYSTEMCODE <", value, "financialsystemcode");
            return (Criteria) this;
        }

        public Criteria andFinancialsystemcodeLessThanOrEqualTo(String value) {
            addCriterion("FINANCIALSYSTEMCODE <=", value, "financialsystemcode");
            return (Criteria) this;
        }

        public Criteria andFinancialsystemcodeLike(String value) {
            addCriterion("FINANCIALSYSTEMCODE like", value, "financialsystemcode");
            return (Criteria) this;
        }

        public Criteria andFinancialsystemcodeNotLike(String value) {
            addCriterion("FINANCIALSYSTEMCODE not like", value, "financialsystemcode");
            return (Criteria) this;
        }

        public Criteria andFinancialsystemcodeIn(List<String> values) {
            addCriterion("FINANCIALSYSTEMCODE in", values, "financialsystemcode");
            return (Criteria) this;
        }

        public Criteria andFinancialsystemcodeNotIn(List<String> values) {
            addCriterion("FINANCIALSYSTEMCODE not in", values, "financialsystemcode");
            return (Criteria) this;
        }

        public Criteria andFinancialsystemcodeBetween(String value1, String value2) {
            addCriterion("FINANCIALSYSTEMCODE between", value1, value2, "financialsystemcode");
            return (Criteria) this;
        }

        public Criteria andFinancialsystemcodeNotBetween(String value1, String value2) {
            addCriterion("FINANCIALSYSTEMCODE not between", value1, value2, "financialsystemcode");
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

        public Criteria andProjectversionidIsNull() {
            addCriterion("PROJECTVERSIONID is null");
            return (Criteria) this;
        }

        public Criteria andProjectversionidIsNotNull() {
            addCriterion("PROJECTVERSIONID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectversionidEqualTo(Object value) {
            addCriterion("PROJECTVERSIONID =", value, "projectversionid");
            return (Criteria) this;
        }

        public Criteria andProjectversionidNotEqualTo(Object value) {
            addCriterion("PROJECTVERSIONID <>", value, "projectversionid");
            return (Criteria) this;
        }

        public Criteria andProjectversionidGreaterThan(Object value) {
            addCriterion("PROJECTVERSIONID >", value, "projectversionid");
            return (Criteria) this;
        }

        public Criteria andProjectversionidGreaterThanOrEqualTo(Object value) {
            addCriterion("PROJECTVERSIONID >=", value, "projectversionid");
            return (Criteria) this;
        }

        public Criteria andProjectversionidLessThan(Object value) {
            addCriterion("PROJECTVERSIONID <", value, "projectversionid");
            return (Criteria) this;
        }

        public Criteria andProjectversionidLessThanOrEqualTo(Object value) {
            addCriterion("PROJECTVERSIONID <=", value, "projectversionid");
            return (Criteria) this;
        }

        public Criteria andProjectversionidIn(List<Object> values) {
            addCriterion("PROJECTVERSIONID in", values, "projectversionid");
            return (Criteria) this;
        }

        public Criteria andProjectversionidNotIn(List<Object> values) {
            addCriterion("PROJECTVERSIONID not in", values, "projectversionid");
            return (Criteria) this;
        }

        public Criteria andProjectversionidBetween(Object value1, Object value2) {
            addCriterion("PROJECTVERSIONID between", value1, value2, "projectversionid");
            return (Criteria) this;
        }

        public Criteria andProjectversionidNotBetween(Object value1, Object value2) {
            addCriterion("PROJECTVERSIONID not between", value1, value2, "projectversionid");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(Object value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(Object value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(Object value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(Object value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(Object value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(Object value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<Object> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<Object> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(Object value1, Object value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(Object value1, Object value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andNosellstallnumIsNull() {
            addCriterion("NOSELLSTALLNUM is null");
            return (Criteria) this;
        }

        public Criteria andNosellstallnumIsNotNull() {
            addCriterion("NOSELLSTALLNUM is not null");
            return (Criteria) this;
        }

        public Criteria andNosellstallnumEqualTo(Short value) {
            addCriterion("NOSELLSTALLNUM =", value, "nosellstallnum");
            return (Criteria) this;
        }

        public Criteria andNosellstallnumNotEqualTo(Short value) {
            addCriterion("NOSELLSTALLNUM <>", value, "nosellstallnum");
            return (Criteria) this;
        }

        public Criteria andNosellstallnumGreaterThan(Short value) {
            addCriterion("NOSELLSTALLNUM >", value, "nosellstallnum");
            return (Criteria) this;
        }

        public Criteria andNosellstallnumGreaterThanOrEqualTo(Short value) {
            addCriterion("NOSELLSTALLNUM >=", value, "nosellstallnum");
            return (Criteria) this;
        }

        public Criteria andNosellstallnumLessThan(Short value) {
            addCriterion("NOSELLSTALLNUM <", value, "nosellstallnum");
            return (Criteria) this;
        }

        public Criteria andNosellstallnumLessThanOrEqualTo(Short value) {
            addCriterion("NOSELLSTALLNUM <=", value, "nosellstallnum");
            return (Criteria) this;
        }

        public Criteria andNosellstallnumIn(List<Short> values) {
            addCriterion("NOSELLSTALLNUM in", values, "nosellstallnum");
            return (Criteria) this;
        }

        public Criteria andNosellstallnumNotIn(List<Short> values) {
            addCriterion("NOSELLSTALLNUM not in", values, "nosellstallnum");
            return (Criteria) this;
        }

        public Criteria andNosellstallnumBetween(Short value1, Short value2) {
            addCriterion("NOSELLSTALLNUM between", value1, value2, "nosellstallnum");
            return (Criteria) this;
        }

        public Criteria andNosellstallnumNotBetween(Short value1, Short value2) {
            addCriterion("NOSELLSTALLNUM not between", value1, value2, "nosellstallnum");
            return (Criteria) this;
        }

        public Criteria andDowndefencesellnumIsNull() {
            addCriterion("DOWNDEFENCESELLNUM is null");
            return (Criteria) this;
        }

        public Criteria andDowndefencesellnumIsNotNull() {
            addCriterion("DOWNDEFENCESELLNUM is not null");
            return (Criteria) this;
        }

        public Criteria andDowndefencesellnumEqualTo(Short value) {
            addCriterion("DOWNDEFENCESELLNUM =", value, "downdefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDowndefencesellnumNotEqualTo(Short value) {
            addCriterion("DOWNDEFENCESELLNUM <>", value, "downdefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDowndefencesellnumGreaterThan(Short value) {
            addCriterion("DOWNDEFENCESELLNUM >", value, "downdefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDowndefencesellnumGreaterThanOrEqualTo(Short value) {
            addCriterion("DOWNDEFENCESELLNUM >=", value, "downdefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDowndefencesellnumLessThan(Short value) {
            addCriterion("DOWNDEFENCESELLNUM <", value, "downdefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDowndefencesellnumLessThanOrEqualTo(Short value) {
            addCriterion("DOWNDEFENCESELLNUM <=", value, "downdefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDowndefencesellnumIn(List<Short> values) {
            addCriterion("DOWNDEFENCESELLNUM in", values, "downdefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDowndefencesellnumNotIn(List<Short> values) {
            addCriterion("DOWNDEFENCESELLNUM not in", values, "downdefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDowndefencesellnumBetween(Short value1, Short value2) {
            addCriterion("DOWNDEFENCESELLNUM between", value1, value2, "downdefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDowndefencesellnumNotBetween(Short value1, Short value2) {
            addCriterion("DOWNDEFENCESELLNUM not between", value1, value2, "downdefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencesellnumIsNull() {
            addCriterion("DOWNNONDEFENCESELLNUM is null");
            return (Criteria) this;
        }

        public Criteria andDownnondefencesellnumIsNotNull() {
            addCriterion("DOWNNONDEFENCESELLNUM is not null");
            return (Criteria) this;
        }

        public Criteria andDownnondefencesellnumEqualTo(Short value) {
            addCriterion("DOWNNONDEFENCESELLNUM =", value, "downnondefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencesellnumNotEqualTo(Short value) {
            addCriterion("DOWNNONDEFENCESELLNUM <>", value, "downnondefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencesellnumGreaterThan(Short value) {
            addCriterion("DOWNNONDEFENCESELLNUM >", value, "downnondefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencesellnumGreaterThanOrEqualTo(Short value) {
            addCriterion("DOWNNONDEFENCESELLNUM >=", value, "downnondefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencesellnumLessThan(Short value) {
            addCriterion("DOWNNONDEFENCESELLNUM <", value, "downnondefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencesellnumLessThanOrEqualTo(Short value) {
            addCriterion("DOWNNONDEFENCESELLNUM <=", value, "downnondefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencesellnumIn(List<Short> values) {
            addCriterion("DOWNNONDEFENCESELLNUM in", values, "downnondefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencesellnumNotIn(List<Short> values) {
            addCriterion("DOWNNONDEFENCESELLNUM not in", values, "downnondefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencesellnumBetween(Short value1, Short value2) {
            addCriterion("DOWNNONDEFENCESELLNUM between", value1, value2, "downnondefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencesellnumNotBetween(Short value1, Short value2) {
            addCriterion("DOWNNONDEFENCESELLNUM not between", value1, value2, "downnondefencesellnum");
            return (Criteria) this;
        }

        public Criteria andParceltypeIsNull() {
            addCriterion("PARCELTYPE is null");
            return (Criteria) this;
        }

        public Criteria andParceltypeIsNotNull() {
            addCriterion("PARCELTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andParceltypeEqualTo(Object value) {
            addCriterion("PARCELTYPE =", value, "parceltype");
            return (Criteria) this;
        }

        public Criteria andParceltypeNotEqualTo(Object value) {
            addCriterion("PARCELTYPE <>", value, "parceltype");
            return (Criteria) this;
        }

        public Criteria andParceltypeGreaterThan(Object value) {
            addCriterion("PARCELTYPE >", value, "parceltype");
            return (Criteria) this;
        }

        public Criteria andParceltypeGreaterThanOrEqualTo(Object value) {
            addCriterion("PARCELTYPE >=", value, "parceltype");
            return (Criteria) this;
        }

        public Criteria andParceltypeLessThan(Object value) {
            addCriterion("PARCELTYPE <", value, "parceltype");
            return (Criteria) this;
        }

        public Criteria andParceltypeLessThanOrEqualTo(Object value) {
            addCriterion("PARCELTYPE <=", value, "parceltype");
            return (Criteria) this;
        }

        public Criteria andParceltypeIn(List<Object> values) {
            addCriterion("PARCELTYPE in", values, "parceltype");
            return (Criteria) this;
        }

        public Criteria andParceltypeNotIn(List<Object> values) {
            addCriterion("PARCELTYPE not in", values, "parceltype");
            return (Criteria) this;
        }

        public Criteria andParceltypeBetween(Object value1, Object value2) {
            addCriterion("PARCELTYPE between", value1, value2, "parceltype");
            return (Criteria) this;
        }

        public Criteria andParceltypeNotBetween(Object value1, Object value2) {
            addCriterion("PARCELTYPE not between", value1, value2, "parceltype");
            return (Criteria) this;
        }

        public Criteria andFcompanycodechangeIsNull() {
            addCriterion("FCOMPANYCODECHANGE is null");
            return (Criteria) this;
        }

        public Criteria andFcompanycodechangeIsNotNull() {
            addCriterion("FCOMPANYCODECHANGE is not null");
            return (Criteria) this;
        }

        public Criteria andFcompanycodechangeEqualTo(String value) {
            addCriterion("FCOMPANYCODECHANGE =", value, "fcompanycodechange");
            return (Criteria) this;
        }

        public Criteria andFcompanycodechangeNotEqualTo(String value) {
            addCriterion("FCOMPANYCODECHANGE <>", value, "fcompanycodechange");
            return (Criteria) this;
        }

        public Criteria andFcompanycodechangeGreaterThan(String value) {
            addCriterion("FCOMPANYCODECHANGE >", value, "fcompanycodechange");
            return (Criteria) this;
        }

        public Criteria andFcompanycodechangeGreaterThanOrEqualTo(String value) {
            addCriterion("FCOMPANYCODECHANGE >=", value, "fcompanycodechange");
            return (Criteria) this;
        }

        public Criteria andFcompanycodechangeLessThan(String value) {
            addCriterion("FCOMPANYCODECHANGE <", value, "fcompanycodechange");
            return (Criteria) this;
        }

        public Criteria andFcompanycodechangeLessThanOrEqualTo(String value) {
            addCriterion("FCOMPANYCODECHANGE <=", value, "fcompanycodechange");
            return (Criteria) this;
        }

        public Criteria andFcompanycodechangeLike(String value) {
            addCriterion("FCOMPANYCODECHANGE like", value, "fcompanycodechange");
            return (Criteria) this;
        }

        public Criteria andFcompanycodechangeNotLike(String value) {
            addCriterion("FCOMPANYCODECHANGE not like", value, "fcompanycodechange");
            return (Criteria) this;
        }

        public Criteria andFcompanycodechangeIn(List<String> values) {
            addCriterion("FCOMPANYCODECHANGE in", values, "fcompanycodechange");
            return (Criteria) this;
        }

        public Criteria andFcompanycodechangeNotIn(List<String> values) {
            addCriterion("FCOMPANYCODECHANGE not in", values, "fcompanycodechange");
            return (Criteria) this;
        }

        public Criteria andFcompanycodechangeBetween(String value1, String value2) {
            addCriterion("FCOMPANYCODECHANGE between", value1, value2, "fcompanycodechange");
            return (Criteria) this;
        }

        public Criteria andFcompanycodechangeNotBetween(String value1, String value2) {
            addCriterion("FCOMPANYCODECHANGE not between", value1, value2, "fcompanycodechange");
            return (Criteria) this;
        }

        public Criteria andFcompanyidchangeIsNull() {
            addCriterion("FCOMPANYIDCHANGE is null");
            return (Criteria) this;
        }

        public Criteria andFcompanyidchangeIsNotNull() {
            addCriterion("FCOMPANYIDCHANGE is not null");
            return (Criteria) this;
        }

        public Criteria andFcompanyidchangeEqualTo(Object value) {
            addCriterion("FCOMPANYIDCHANGE =", value, "fcompanyidchange");
            return (Criteria) this;
        }

        public Criteria andFcompanyidchangeNotEqualTo(Object value) {
            addCriterion("FCOMPANYIDCHANGE <>", value, "fcompanyidchange");
            return (Criteria) this;
        }

        public Criteria andFcompanyidchangeGreaterThan(Object value) {
            addCriterion("FCOMPANYIDCHANGE >", value, "fcompanyidchange");
            return (Criteria) this;
        }

        public Criteria andFcompanyidchangeGreaterThanOrEqualTo(Object value) {
            addCriterion("FCOMPANYIDCHANGE >=", value, "fcompanyidchange");
            return (Criteria) this;
        }

        public Criteria andFcompanyidchangeLessThan(Object value) {
            addCriterion("FCOMPANYIDCHANGE <", value, "fcompanyidchange");
            return (Criteria) this;
        }

        public Criteria andFcompanyidchangeLessThanOrEqualTo(Object value) {
            addCriterion("FCOMPANYIDCHANGE <=", value, "fcompanyidchange");
            return (Criteria) this;
        }

        public Criteria andFcompanyidchangeIn(List<Object> values) {
            addCriterion("FCOMPANYIDCHANGE in", values, "fcompanyidchange");
            return (Criteria) this;
        }

        public Criteria andFcompanyidchangeNotIn(List<Object> values) {
            addCriterion("FCOMPANYIDCHANGE not in", values, "fcompanyidchange");
            return (Criteria) this;
        }

        public Criteria andFcompanyidchangeBetween(Object value1, Object value2) {
            addCriterion("FCOMPANYIDCHANGE between", value1, value2, "fcompanyidchange");
            return (Criteria) this;
        }

        public Criteria andFcompanyidchangeNotBetween(Object value1, Object value2) {
            addCriterion("FCOMPANYIDCHANGE not between", value1, value2, "fcompanyidchange");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
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