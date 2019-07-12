package com.yuanian.masterdata.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andProjectversionidIsNull() {
            addCriterion("PROJECTVERSIONID is null");
            return (Criteria) this;
        }

        public Criteria andProjectversionidIsNotNull() {
            addCriterion("PROJECTVERSIONID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectversionidEqualTo(String value) {
            addCriterion("PROJECTVERSIONID =", value, "projectversionid");
            return (Criteria) this;
        }

        public Criteria andProjectversionidNotEqualTo(String value) {
            addCriterion("PROJECTVERSIONID <>", value, "projectversionid");
            return (Criteria) this;
        }

        public Criteria andProjectversionidGreaterThan(String value) {
            addCriterion("PROJECTVERSIONID >", value, "projectversionid");
            return (Criteria) this;
        }

        public Criteria andProjectversionidGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTVERSIONID >=", value, "projectversionid");
            return (Criteria) this;
        }

        public Criteria andProjectversionidLessThan(String value) {
            addCriterion("PROJECTVERSIONID <", value, "projectversionid");
            return (Criteria) this;
        }

        public Criteria andProjectversionidLessThanOrEqualTo(String value) {
            addCriterion("PROJECTVERSIONID <=", value, "projectversionid");
            return (Criteria) this;
        }

        public Criteria andProjectversionidLike(String value) {
            addCriterion("PROJECTVERSIONID like", value, "projectversionid");
            return (Criteria) this;
        }

        public Criteria andProjectversionidNotLike(String value) {
            addCriterion("PROJECTVERSIONID not like", value, "projectversionid");
            return (Criteria) this;
        }

        public Criteria andProjectversionidIn(List<String> values) {
            addCriterion("PROJECTVERSIONID in", values, "projectversionid");
            return (Criteria) this;
        }

        public Criteria andProjectversionidNotIn(List<String> values) {
            addCriterion("PROJECTVERSIONID not in", values, "projectversionid");
            return (Criteria) this;
        }

        public Criteria andProjectversionidBetween(String value1, String value2) {
            addCriterion("PROJECTVERSIONID between", value1, value2, "projectversionid");
            return (Criteria) this;
        }

        public Criteria andProjectversionidNotBetween(String value1, String value2) {
            addCriterion("PROJECTVERSIONID not between", value1, value2, "projectversionid");
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

        public Criteria andProjectcodeEqualTo(Object value) {
            addCriterion("PROJECTCODE =", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeNotEqualTo(Object value) {
            addCriterion("PROJECTCODE <>", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeGreaterThan(Object value) {
            addCriterion("PROJECTCODE >", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeGreaterThanOrEqualTo(Object value) {
            addCriterion("PROJECTCODE >=", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeLessThan(Object value) {
            addCriterion("PROJECTCODE <", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeLessThanOrEqualTo(Object value) {
            addCriterion("PROJECTCODE <=", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeIn(List<Object> values) {
            addCriterion("PROJECTCODE in", values, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeNotIn(List<Object> values) {
            addCriterion("PROJECTCODE not in", values, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeBetween(Object value1, Object value2) {
            addCriterion("PROJECTCODE between", value1, value2, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeNotBetween(Object value1, Object value2) {
            addCriterion("PROJECTCODE not between", value1, value2, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("PROJECTNAME is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("PROJECTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(Object value) {
            addCriterion("PROJECTNAME =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(Object value) {
            addCriterion("PROJECTNAME <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(Object value) {
            addCriterion("PROJECTNAME >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(Object value) {
            addCriterion("PROJECTNAME >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(Object value) {
            addCriterion("PROJECTNAME <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(Object value) {
            addCriterion("PROJECTNAME <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<Object> values) {
            addCriterion("PROJECTNAME in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<Object> values) {
            addCriterion("PROJECTNAME not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(Object value1, Object value2) {
            addCriterion("PROJECTNAME between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(Object value1, Object value2) {
            addCriterion("PROJECTNAME not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andIshistoryIsNull() {
            addCriterion("ISHISTORY is null");
            return (Criteria) this;
        }

        public Criteria andIshistoryIsNotNull() {
            addCriterion("ISHISTORY is not null");
            return (Criteria) this;
        }

        public Criteria andIshistoryEqualTo(Object value) {
            addCriterion("ISHISTORY =", value, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryNotEqualTo(Object value) {
            addCriterion("ISHISTORY <>", value, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryGreaterThan(Object value) {
            addCriterion("ISHISTORY >", value, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryGreaterThanOrEqualTo(Object value) {
            addCriterion("ISHISTORY >=", value, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryLessThan(Object value) {
            addCriterion("ISHISTORY <", value, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryLessThanOrEqualTo(Object value) {
            addCriterion("ISHISTORY <=", value, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryIn(List<Object> values) {
            addCriterion("ISHISTORY in", values, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryNotIn(List<Object> values) {
            addCriterion("ISHISTORY not in", values, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryBetween(Object value1, Object value2) {
            addCriterion("ISHISTORY between", value1, value2, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryNotBetween(Object value1, Object value2) {
            addCriterion("ISHISTORY not between", value1, value2, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIsnewversionIsNull() {
            addCriterion("ISNEWVERSION is null");
            return (Criteria) this;
        }

        public Criteria andIsnewversionIsNotNull() {
            addCriterion("ISNEWVERSION is not null");
            return (Criteria) this;
        }

        public Criteria andIsnewversionEqualTo(Object value) {
            addCriterion("ISNEWVERSION =", value, "isnewversion");
            return (Criteria) this;
        }

        public Criteria andIsnewversionNotEqualTo(Object value) {
            addCriterion("ISNEWVERSION <>", value, "isnewversion");
            return (Criteria) this;
        }

        public Criteria andIsnewversionGreaterThan(Object value) {
            addCriterion("ISNEWVERSION >", value, "isnewversion");
            return (Criteria) this;
        }

        public Criteria andIsnewversionGreaterThanOrEqualTo(Object value) {
            addCriterion("ISNEWVERSION >=", value, "isnewversion");
            return (Criteria) this;
        }

        public Criteria andIsnewversionLessThan(Object value) {
            addCriterion("ISNEWVERSION <", value, "isnewversion");
            return (Criteria) this;
        }

        public Criteria andIsnewversionLessThanOrEqualTo(Object value) {
            addCriterion("ISNEWVERSION <=", value, "isnewversion");
            return (Criteria) this;
        }

        public Criteria andIsnewversionIn(List<Object> values) {
            addCriterion("ISNEWVERSION in", values, "isnewversion");
            return (Criteria) this;
        }

        public Criteria andIsnewversionNotIn(List<Object> values) {
            addCriterion("ISNEWVERSION not in", values, "isnewversion");
            return (Criteria) this;
        }

        public Criteria andIsnewversionBetween(Object value1, Object value2) {
            addCriterion("ISNEWVERSION between", value1, value2, "isnewversion");
            return (Criteria) this;
        }

        public Criteria andIsnewversionNotBetween(Object value1, Object value2) {
            addCriterion("ISNEWVERSION not between", value1, value2, "isnewversion");
            return (Criteria) this;
        }

        public Criteria andProjectversionIsNull() {
            addCriterion("PROJECTVERSION is null");
            return (Criteria) this;
        }

        public Criteria andProjectversionIsNotNull() {
            addCriterion("PROJECTVERSION is not null");
            return (Criteria) this;
        }

        public Criteria andProjectversionEqualTo(String value) {
            addCriterion("PROJECTVERSION =", value, "projectversion");
            return (Criteria) this;
        }

        public Criteria andProjectversionNotEqualTo(String value) {
            addCriterion("PROJECTVERSION <>", value, "projectversion");
            return (Criteria) this;
        }

        public Criteria andProjectversionGreaterThan(String value) {
            addCriterion("PROJECTVERSION >", value, "projectversion");
            return (Criteria) this;
        }

        public Criteria andProjectversionGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTVERSION >=", value, "projectversion");
            return (Criteria) this;
        }

        public Criteria andProjectversionLessThan(String value) {
            addCriterion("PROJECTVERSION <", value, "projectversion");
            return (Criteria) this;
        }

        public Criteria andProjectversionLessThanOrEqualTo(String value) {
            addCriterion("PROJECTVERSION <=", value, "projectversion");
            return (Criteria) this;
        }

        public Criteria andProjectversionLike(String value) {
            addCriterion("PROJECTVERSION like", value, "projectversion");
            return (Criteria) this;
        }

        public Criteria andProjectversionNotLike(String value) {
            addCriterion("PROJECTVERSION not like", value, "projectversion");
            return (Criteria) this;
        }

        public Criteria andProjectversionIn(List<String> values) {
            addCriterion("PROJECTVERSION in", values, "projectversion");
            return (Criteria) this;
        }

        public Criteria andProjectversionNotIn(List<String> values) {
            addCriterion("PROJECTVERSION not in", values, "projectversion");
            return (Criteria) this;
        }

        public Criteria andProjectversionBetween(String value1, String value2) {
            addCriterion("PROJECTVERSION between", value1, value2, "projectversion");
            return (Criteria) this;
        }

        public Criteria andProjectversionNotBetween(String value1, String value2) {
            addCriterion("PROJECTVERSION not between", value1, value2, "projectversion");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("COMPANYID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("COMPANYID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(Object value) {
            addCriterion("COMPANYID =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(Object value) {
            addCriterion("COMPANYID <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(Object value) {
            addCriterion("COMPANYID >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(Object value) {
            addCriterion("COMPANYID >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(Object value) {
            addCriterion("COMPANYID <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(Object value) {
            addCriterion("COMPANYID <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<Object> values) {
            addCriterion("COMPANYID in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<Object> values) {
            addCriterion("COMPANYID not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(Object value1, Object value2) {
            addCriterion("COMPANYID between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(Object value1, Object value2) {
            addCriterion("COMPANYID not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanycodeIsNull() {
            addCriterion("COMPANYCODE is null");
            return (Criteria) this;
        }

        public Criteria andCompanycodeIsNotNull() {
            addCriterion("COMPANYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanycodeEqualTo(Object value) {
            addCriterion("COMPANYCODE =", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeNotEqualTo(Object value) {
            addCriterion("COMPANYCODE <>", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeGreaterThan(Object value) {
            addCriterion("COMPANYCODE >", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeGreaterThanOrEqualTo(Object value) {
            addCriterion("COMPANYCODE >=", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeLessThan(Object value) {
            addCriterion("COMPANYCODE <", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeLessThanOrEqualTo(Object value) {
            addCriterion("COMPANYCODE <=", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeIn(List<Object> values) {
            addCriterion("COMPANYCODE in", values, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeNotIn(List<Object> values) {
            addCriterion("COMPANYCODE not in", values, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeBetween(Object value1, Object value2) {
            addCriterion("COMPANYCODE between", value1, value2, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeNotBetween(Object value1, Object value2) {
            addCriterion("COMPANYCODE not between", value1, value2, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("COMPANYNAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("COMPANYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(Object value) {
            addCriterion("COMPANYNAME =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(Object value) {
            addCriterion("COMPANYNAME <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(Object value) {
            addCriterion("COMPANYNAME >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(Object value) {
            addCriterion("COMPANYNAME >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(Object value) {
            addCriterion("COMPANYNAME <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(Object value) {
            addCriterion("COMPANYNAME <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<Object> values) {
            addCriterion("COMPANYNAME in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<Object> values) {
            addCriterion("COMPANYNAME not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(Object value1, Object value2) {
            addCriterion("COMPANYNAME between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(Object value1, Object value2) {
            addCriterion("COMPANYNAME not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andProjectshortnameIsNull() {
            addCriterion("PROJECTSHORTNAME is null");
            return (Criteria) this;
        }

        public Criteria andProjectshortnameIsNotNull() {
            addCriterion("PROJECTSHORTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andProjectshortnameEqualTo(Object value) {
            addCriterion("PROJECTSHORTNAME =", value, "projectshortname");
            return (Criteria) this;
        }

        public Criteria andProjectshortnameNotEqualTo(Object value) {
            addCriterion("PROJECTSHORTNAME <>", value, "projectshortname");
            return (Criteria) this;
        }

        public Criteria andProjectshortnameGreaterThan(Object value) {
            addCriterion("PROJECTSHORTNAME >", value, "projectshortname");
            return (Criteria) this;
        }

        public Criteria andProjectshortnameGreaterThanOrEqualTo(Object value) {
            addCriterion("PROJECTSHORTNAME >=", value, "projectshortname");
            return (Criteria) this;
        }

        public Criteria andProjectshortnameLessThan(Object value) {
            addCriterion("PROJECTSHORTNAME <", value, "projectshortname");
            return (Criteria) this;
        }

        public Criteria andProjectshortnameLessThanOrEqualTo(Object value) {
            addCriterion("PROJECTSHORTNAME <=", value, "projectshortname");
            return (Criteria) this;
        }

        public Criteria andProjectshortnameIn(List<Object> values) {
            addCriterion("PROJECTSHORTNAME in", values, "projectshortname");
            return (Criteria) this;
        }

        public Criteria andProjectshortnameNotIn(List<Object> values) {
            addCriterion("PROJECTSHORTNAME not in", values, "projectshortname");
            return (Criteria) this;
        }

        public Criteria andProjectshortnameBetween(Object value1, Object value2) {
            addCriterion("PROJECTSHORTNAME between", value1, value2, "projectshortname");
            return (Criteria) this;
        }

        public Criteria andProjectshortnameNotBetween(Object value1, Object value2) {
            addCriterion("PROJECTSHORTNAME not between", value1, value2, "projectshortname");
            return (Criteria) this;
        }

        public Criteria andProjectofficialnameIsNull() {
            addCriterion("PROJECTOFFICIALNAME is null");
            return (Criteria) this;
        }

        public Criteria andProjectofficialnameIsNotNull() {
            addCriterion("PROJECTOFFICIALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andProjectofficialnameEqualTo(Object value) {
            addCriterion("PROJECTOFFICIALNAME =", value, "projectofficialname");
            return (Criteria) this;
        }

        public Criteria andProjectofficialnameNotEqualTo(Object value) {
            addCriterion("PROJECTOFFICIALNAME <>", value, "projectofficialname");
            return (Criteria) this;
        }

        public Criteria andProjectofficialnameGreaterThan(Object value) {
            addCriterion("PROJECTOFFICIALNAME >", value, "projectofficialname");
            return (Criteria) this;
        }

        public Criteria andProjectofficialnameGreaterThanOrEqualTo(Object value) {
            addCriterion("PROJECTOFFICIALNAME >=", value, "projectofficialname");
            return (Criteria) this;
        }

        public Criteria andProjectofficialnameLessThan(Object value) {
            addCriterion("PROJECTOFFICIALNAME <", value, "projectofficialname");
            return (Criteria) this;
        }

        public Criteria andProjectofficialnameLessThanOrEqualTo(Object value) {
            addCriterion("PROJECTOFFICIALNAME <=", value, "projectofficialname");
            return (Criteria) this;
        }

        public Criteria andProjectofficialnameIn(List<Object> values) {
            addCriterion("PROJECTOFFICIALNAME in", values, "projectofficialname");
            return (Criteria) this;
        }

        public Criteria andProjectofficialnameNotIn(List<Object> values) {
            addCriterion("PROJECTOFFICIALNAME not in", values, "projectofficialname");
            return (Criteria) this;
        }

        public Criteria andProjectofficialnameBetween(Object value1, Object value2) {
            addCriterion("PROJECTOFFICIALNAME between", value1, value2, "projectofficialname");
            return (Criteria) this;
        }

        public Criteria andProjectofficialnameNotBetween(Object value1, Object value2) {
            addCriterion("PROJECTOFFICIALNAME not between", value1, value2, "projectofficialname");
            return (Criteria) this;
        }

        public Criteria andProjectgeneralizenameIsNull() {
            addCriterion("PROJECTGENERALIZENAME is null");
            return (Criteria) this;
        }

        public Criteria andProjectgeneralizenameIsNotNull() {
            addCriterion("PROJECTGENERALIZENAME is not null");
            return (Criteria) this;
        }

        public Criteria andProjectgeneralizenameEqualTo(Object value) {
            addCriterion("PROJECTGENERALIZENAME =", value, "projectgeneralizename");
            return (Criteria) this;
        }

        public Criteria andProjectgeneralizenameNotEqualTo(Object value) {
            addCriterion("PROJECTGENERALIZENAME <>", value, "projectgeneralizename");
            return (Criteria) this;
        }

        public Criteria andProjectgeneralizenameGreaterThan(Object value) {
            addCriterion("PROJECTGENERALIZENAME >", value, "projectgeneralizename");
            return (Criteria) this;
        }

        public Criteria andProjectgeneralizenameGreaterThanOrEqualTo(Object value) {
            addCriterion("PROJECTGENERALIZENAME >=", value, "projectgeneralizename");
            return (Criteria) this;
        }

        public Criteria andProjectgeneralizenameLessThan(Object value) {
            addCriterion("PROJECTGENERALIZENAME <", value, "projectgeneralizename");
            return (Criteria) this;
        }

        public Criteria andProjectgeneralizenameLessThanOrEqualTo(Object value) {
            addCriterion("PROJECTGENERALIZENAME <=", value, "projectgeneralizename");
            return (Criteria) this;
        }

        public Criteria andProjectgeneralizenameIn(List<Object> values) {
            addCriterion("PROJECTGENERALIZENAME in", values, "projectgeneralizename");
            return (Criteria) this;
        }

        public Criteria andProjectgeneralizenameNotIn(List<Object> values) {
            addCriterion("PROJECTGENERALIZENAME not in", values, "projectgeneralizename");
            return (Criteria) this;
        }

        public Criteria andProjectgeneralizenameBetween(Object value1, Object value2) {
            addCriterion("PROJECTGENERALIZENAME between", value1, value2, "projectgeneralizename");
            return (Criteria) this;
        }

        public Criteria andProjectgeneralizenameNotBetween(Object value1, Object value2) {
            addCriterion("PROJECTGENERALIZENAME not between", value1, value2, "projectgeneralizename");
            return (Criteria) this;
        }

        public Criteria andCityidIsNull() {
            addCriterion("CITYID is null");
            return (Criteria) this;
        }

        public Criteria andCityidIsNotNull() {
            addCriterion("CITYID is not null");
            return (Criteria) this;
        }

        public Criteria andCityidEqualTo(Object value) {
            addCriterion("CITYID =", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotEqualTo(Object value) {
            addCriterion("CITYID <>", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThan(Object value) {
            addCriterion("CITYID >", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThanOrEqualTo(Object value) {
            addCriterion("CITYID >=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThan(Object value) {
            addCriterion("CITYID <", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThanOrEqualTo(Object value) {
            addCriterion("CITYID <=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidIn(List<Object> values) {
            addCriterion("CITYID in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotIn(List<Object> values) {
            addCriterion("CITYID not in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidBetween(Object value1, Object value2) {
            addCriterion("CITYID between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotBetween(Object value1, Object value2) {
            addCriterion("CITYID not between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNull() {
            addCriterion("CITYCODE is null");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNotNull() {
            addCriterion("CITYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCitycodeEqualTo(Object value) {
            addCriterion("CITYCODE =", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotEqualTo(Object value) {
            addCriterion("CITYCODE <>", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThan(Object value) {
            addCriterion("CITYCODE >", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThanOrEqualTo(Object value) {
            addCriterion("CITYCODE >=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThan(Object value) {
            addCriterion("CITYCODE <", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThanOrEqualTo(Object value) {
            addCriterion("CITYCODE <=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIn(List<Object> values) {
            addCriterion("CITYCODE in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotIn(List<Object> values) {
            addCriterion("CITYCODE not in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeBetween(Object value1, Object value2) {
            addCriterion("CITYCODE between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotBetween(Object value1, Object value2) {
            addCriterion("CITYCODE not between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNull() {
            addCriterion("CITYNAME is null");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNotNull() {
            addCriterion("CITYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCitynameEqualTo(Object value) {
            addCriterion("CITYNAME =", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotEqualTo(Object value) {
            addCriterion("CITYNAME <>", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThan(Object value) {
            addCriterion("CITYNAME >", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThanOrEqualTo(Object value) {
            addCriterion("CITYNAME >=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThan(Object value) {
            addCriterion("CITYNAME <", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThanOrEqualTo(Object value) {
            addCriterion("CITYNAME <=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameIn(List<Object> values) {
            addCriterion("CITYNAME in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotIn(List<Object> values) {
            addCriterion("CITYNAME not in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameBetween(Object value1, Object value2) {
            addCriterion("CITYNAME between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotBetween(Object value1, Object value2) {
            addCriterion("CITYNAME not between", value1, value2, "cityname");
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

        public Criteria andPrinciplemanIsNull() {
            addCriterion("PRINCIPLEMAN is null");
            return (Criteria) this;
        }

        public Criteria andPrinciplemanIsNotNull() {
            addCriterion("PRINCIPLEMAN is not null");
            return (Criteria) this;
        }

        public Criteria andPrinciplemanEqualTo(Object value) {
            addCriterion("PRINCIPLEMAN =", value, "principleman");
            return (Criteria) this;
        }

        public Criteria andPrinciplemanNotEqualTo(Object value) {
            addCriterion("PRINCIPLEMAN <>", value, "principleman");
            return (Criteria) this;
        }

        public Criteria andPrinciplemanGreaterThan(Object value) {
            addCriterion("PRINCIPLEMAN >", value, "principleman");
            return (Criteria) this;
        }

        public Criteria andPrinciplemanGreaterThanOrEqualTo(Object value) {
            addCriterion("PRINCIPLEMAN >=", value, "principleman");
            return (Criteria) this;
        }

        public Criteria andPrinciplemanLessThan(Object value) {
            addCriterion("PRINCIPLEMAN <", value, "principleman");
            return (Criteria) this;
        }

        public Criteria andPrinciplemanLessThanOrEqualTo(Object value) {
            addCriterion("PRINCIPLEMAN <=", value, "principleman");
            return (Criteria) this;
        }

        public Criteria andPrinciplemanIn(List<Object> values) {
            addCriterion("PRINCIPLEMAN in", values, "principleman");
            return (Criteria) this;
        }

        public Criteria andPrinciplemanNotIn(List<Object> values) {
            addCriterion("PRINCIPLEMAN not in", values, "principleman");
            return (Criteria) this;
        }

        public Criteria andPrinciplemanBetween(Object value1, Object value2) {
            addCriterion("PRINCIPLEMAN between", value1, value2, "principleman");
            return (Criteria) this;
        }

        public Criteria andPrinciplemanNotBetween(Object value1, Object value2) {
            addCriterion("PRINCIPLEMAN not between", value1, value2, "principleman");
            return (Criteria) this;
        }

        public Criteria andPrinciplenameIsNull() {
            addCriterion("PRINCIPLENAME is null");
            return (Criteria) this;
        }

        public Criteria andPrinciplenameIsNotNull() {
            addCriterion("PRINCIPLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andPrinciplenameEqualTo(Object value) {
            addCriterion("PRINCIPLENAME =", value, "principlename");
            return (Criteria) this;
        }

        public Criteria andPrinciplenameNotEqualTo(Object value) {
            addCriterion("PRINCIPLENAME <>", value, "principlename");
            return (Criteria) this;
        }

        public Criteria andPrinciplenameGreaterThan(Object value) {
            addCriterion("PRINCIPLENAME >", value, "principlename");
            return (Criteria) this;
        }

        public Criteria andPrinciplenameGreaterThanOrEqualTo(Object value) {
            addCriterion("PRINCIPLENAME >=", value, "principlename");
            return (Criteria) this;
        }

        public Criteria andPrinciplenameLessThan(Object value) {
            addCriterion("PRINCIPLENAME <", value, "principlename");
            return (Criteria) this;
        }

        public Criteria andPrinciplenameLessThanOrEqualTo(Object value) {
            addCriterion("PRINCIPLENAME <=", value, "principlename");
            return (Criteria) this;
        }

        public Criteria andPrinciplenameIn(List<Object> values) {
            addCriterion("PRINCIPLENAME in", values, "principlename");
            return (Criteria) this;
        }

        public Criteria andPrinciplenameNotIn(List<Object> values) {
            addCriterion("PRINCIPLENAME not in", values, "principlename");
            return (Criteria) this;
        }

        public Criteria andPrinciplenameBetween(Object value1, Object value2) {
            addCriterion("PRINCIPLENAME between", value1, value2, "principlename");
            return (Criteria) this;
        }

        public Criteria andPrinciplenameNotBetween(Object value1, Object value2) {
            addCriterion("PRINCIPLENAME not between", value1, value2, "principlename");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNull() {
            addCriterion("BUSINESSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNotNull() {
            addCriterion("BUSINESSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeEqualTo(Object value) {
            addCriterion("BUSINESSTYPE =", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotEqualTo(Object value) {
            addCriterion("BUSINESSTYPE <>", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThan(Object value) {
            addCriterion("BUSINESSTYPE >", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThanOrEqualTo(Object value) {
            addCriterion("BUSINESSTYPE >=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThan(Object value) {
            addCriterion("BUSINESSTYPE <", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThanOrEqualTo(Object value) {
            addCriterion("BUSINESSTYPE <=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIn(List<Object> values) {
            addCriterion("BUSINESSTYPE in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotIn(List<Object> values) {
            addCriterion("BUSINESSTYPE not in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeBetween(Object value1, Object value2) {
            addCriterion("BUSINESSTYPE between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotBetween(Object value1, Object value2) {
            addCriterion("BUSINESSTYPE not between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andZlpercentIsNull() {
            addCriterion("ZLPERCENT is null");
            return (Criteria) this;
        }

        public Criteria andZlpercentIsNotNull() {
            addCriterion("ZLPERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andZlpercentEqualTo(Object value) {
            addCriterion("ZLPERCENT =", value, "zlpercent");
            return (Criteria) this;
        }

        public Criteria andZlpercentNotEqualTo(Object value) {
            addCriterion("ZLPERCENT <>", value, "zlpercent");
            return (Criteria) this;
        }

        public Criteria andZlpercentGreaterThan(Object value) {
            addCriterion("ZLPERCENT >", value, "zlpercent");
            return (Criteria) this;
        }

        public Criteria andZlpercentGreaterThanOrEqualTo(Object value) {
            addCriterion("ZLPERCENT >=", value, "zlpercent");
            return (Criteria) this;
        }

        public Criteria andZlpercentLessThan(Object value) {
            addCriterion("ZLPERCENT <", value, "zlpercent");
            return (Criteria) this;
        }

        public Criteria andZlpercentLessThanOrEqualTo(Object value) {
            addCriterion("ZLPERCENT <=", value, "zlpercent");
            return (Criteria) this;
        }

        public Criteria andZlpercentIn(List<Object> values) {
            addCriterion("ZLPERCENT in", values, "zlpercent");
            return (Criteria) this;
        }

        public Criteria andZlpercentNotIn(List<Object> values) {
            addCriterion("ZLPERCENT not in", values, "zlpercent");
            return (Criteria) this;
        }

        public Criteria andZlpercentBetween(Object value1, Object value2) {
            addCriterion("ZLPERCENT between", value1, value2, "zlpercent");
            return (Criteria) this;
        }

        public Criteria andZlpercentNotBetween(Object value1, Object value2) {
            addCriterion("ZLPERCENT not between", value1, value2, "zlpercent");
            return (Criteria) this;
        }

        public Criteria andOtherpercentIsNull() {
            addCriterion("OTHERPERCENT is null");
            return (Criteria) this;
        }

        public Criteria andOtherpercentIsNotNull() {
            addCriterion("OTHERPERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andOtherpercentEqualTo(Object value) {
            addCriterion("OTHERPERCENT =", value, "otherpercent");
            return (Criteria) this;
        }

        public Criteria andOtherpercentNotEqualTo(Object value) {
            addCriterion("OTHERPERCENT <>", value, "otherpercent");
            return (Criteria) this;
        }

        public Criteria andOtherpercentGreaterThan(Object value) {
            addCriterion("OTHERPERCENT >", value, "otherpercent");
            return (Criteria) this;
        }

        public Criteria andOtherpercentGreaterThanOrEqualTo(Object value) {
            addCriterion("OTHERPERCENT >=", value, "otherpercent");
            return (Criteria) this;
        }

        public Criteria andOtherpercentLessThan(Object value) {
            addCriterion("OTHERPERCENT <", value, "otherpercent");
            return (Criteria) this;
        }

        public Criteria andOtherpercentLessThanOrEqualTo(Object value) {
            addCriterion("OTHERPERCENT <=", value, "otherpercent");
            return (Criteria) this;
        }

        public Criteria andOtherpercentIn(List<Object> values) {
            addCriterion("OTHERPERCENT in", values, "otherpercent");
            return (Criteria) this;
        }

        public Criteria andOtherpercentNotIn(List<Object> values) {
            addCriterion("OTHERPERCENT not in", values, "otherpercent");
            return (Criteria) this;
        }

        public Criteria andOtherpercentBetween(Object value1, Object value2) {
            addCriterion("OTHERPERCENT between", value1, value2, "otherpercent");
            return (Criteria) this;
        }

        public Criteria andOtherpercentNotBetween(Object value1, Object value2) {
            addCriterion("OTHERPERCENT not between", value1, value2, "otherpercent");
            return (Criteria) this;
        }

        public Criteria andProjectgaindateIsNull() {
            addCriterion("PROJECTGAINDATE is null");
            return (Criteria) this;
        }

        public Criteria andProjectgaindateIsNotNull() {
            addCriterion("PROJECTGAINDATE is not null");
            return (Criteria) this;
        }

        public Criteria andProjectgaindateEqualTo(Object value) {
            addCriterion("PROJECTGAINDATE =", value, "projectgaindate");
            return (Criteria) this;
        }

        public Criteria andProjectgaindateNotEqualTo(Object value) {
            addCriterion("PROJECTGAINDATE <>", value, "projectgaindate");
            return (Criteria) this;
        }

        public Criteria andProjectgaindateGreaterThan(Object value) {
            addCriterion("PROJECTGAINDATE >", value, "projectgaindate");
            return (Criteria) this;
        }

        public Criteria andProjectgaindateGreaterThanOrEqualTo(Object value) {
            addCriterion("PROJECTGAINDATE >=", value, "projectgaindate");
            return (Criteria) this;
        }

        public Criteria andProjectgaindateLessThan(Object value) {
            addCriterion("PROJECTGAINDATE <", value, "projectgaindate");
            return (Criteria) this;
        }

        public Criteria andProjectgaindateLessThanOrEqualTo(Object value) {
            addCriterion("PROJECTGAINDATE <=", value, "projectgaindate");
            return (Criteria) this;
        }

        public Criteria andProjectgaindateIn(List<Object> values) {
            addCriterion("PROJECTGAINDATE in", values, "projectgaindate");
            return (Criteria) this;
        }

        public Criteria andProjectgaindateNotIn(List<Object> values) {
            addCriterion("PROJECTGAINDATE not in", values, "projectgaindate");
            return (Criteria) this;
        }

        public Criteria andProjectgaindateBetween(Object value1, Object value2) {
            addCriterion("PROJECTGAINDATE between", value1, value2, "projectgaindate");
            return (Criteria) this;
        }

        public Criteria andProjectgaindateNotBetween(Object value1, Object value2) {
            addCriterion("PROJECTGAINDATE not between", value1, value2, "projectgaindate");
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

        public Criteria andParcelpropertyEqualTo(Object value) {
            addCriterion("PARCELPROPERTY =", value, "parcelproperty");
            return (Criteria) this;
        }

        public Criteria andParcelpropertyNotEqualTo(Object value) {
            addCriterion("PARCELPROPERTY <>", value, "parcelproperty");
            return (Criteria) this;
        }

        public Criteria andParcelpropertyGreaterThan(Object value) {
            addCriterion("PARCELPROPERTY >", value, "parcelproperty");
            return (Criteria) this;
        }

        public Criteria andParcelpropertyGreaterThanOrEqualTo(Object value) {
            addCriterion("PARCELPROPERTY >=", value, "parcelproperty");
            return (Criteria) this;
        }

        public Criteria andParcelpropertyLessThan(Object value) {
            addCriterion("PARCELPROPERTY <", value, "parcelproperty");
            return (Criteria) this;
        }

        public Criteria andParcelpropertyLessThanOrEqualTo(Object value) {
            addCriterion("PARCELPROPERTY <=", value, "parcelproperty");
            return (Criteria) this;
        }

        public Criteria andParcelpropertyIn(List<Object> values) {
            addCriterion("PARCELPROPERTY in", values, "parcelproperty");
            return (Criteria) this;
        }

        public Criteria andParcelpropertyNotIn(List<Object> values) {
            addCriterion("PARCELPROPERTY not in", values, "parcelproperty");
            return (Criteria) this;
        }

        public Criteria andParcelpropertyBetween(Object value1, Object value2) {
            addCriterion("PARCELPROPERTY between", value1, value2, "parcelproperty");
            return (Criteria) this;
        }

        public Criteria andParcelpropertyNotBetween(Object value1, Object value2) {
            addCriterion("PARCELPROPERTY not between", value1, value2, "parcelproperty");
            return (Criteria) this;
        }

        public Criteria andCurrentstageIsNull() {
            addCriterion("CURRENTSTAGE is null");
            return (Criteria) this;
        }

        public Criteria andCurrentstageIsNotNull() {
            addCriterion("CURRENTSTAGE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentstageEqualTo(Object value) {
            addCriterion("CURRENTSTAGE =", value, "currentstage");
            return (Criteria) this;
        }

        public Criteria andCurrentstageNotEqualTo(Object value) {
            addCriterion("CURRENTSTAGE <>", value, "currentstage");
            return (Criteria) this;
        }

        public Criteria andCurrentstageGreaterThan(Object value) {
            addCriterion("CURRENTSTAGE >", value, "currentstage");
            return (Criteria) this;
        }

        public Criteria andCurrentstageGreaterThanOrEqualTo(Object value) {
            addCriterion("CURRENTSTAGE >=", value, "currentstage");
            return (Criteria) this;
        }

        public Criteria andCurrentstageLessThan(Object value) {
            addCriterion("CURRENTSTAGE <", value, "currentstage");
            return (Criteria) this;
        }

        public Criteria andCurrentstageLessThanOrEqualTo(Object value) {
            addCriterion("CURRENTSTAGE <=", value, "currentstage");
            return (Criteria) this;
        }

        public Criteria andCurrentstageIn(List<Object> values) {
            addCriterion("CURRENTSTAGE in", values, "currentstage");
            return (Criteria) this;
        }

        public Criteria andCurrentstageNotIn(List<Object> values) {
            addCriterion("CURRENTSTAGE not in", values, "currentstage");
            return (Criteria) this;
        }

        public Criteria andCurrentstageBetween(Object value1, Object value2) {
            addCriterion("CURRENTSTAGE between", value1, value2, "currentstage");
            return (Criteria) this;
        }

        public Criteria andCurrentstageNotBetween(Object value1, Object value2) {
            addCriterion("CURRENTSTAGE not between", value1, value2, "currentstage");
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

        public Criteria andDatastageEqualTo(Object value) {
            addCriterion("DATASTAGE =", value, "datastage");
            return (Criteria) this;
        }

        public Criteria andDatastageNotEqualTo(Object value) {
            addCriterion("DATASTAGE <>", value, "datastage");
            return (Criteria) this;
        }

        public Criteria andDatastageGreaterThan(Object value) {
            addCriterion("DATASTAGE >", value, "datastage");
            return (Criteria) this;
        }

        public Criteria andDatastageGreaterThanOrEqualTo(Object value) {
            addCriterion("DATASTAGE >=", value, "datastage");
            return (Criteria) this;
        }

        public Criteria andDatastageLessThan(Object value) {
            addCriterion("DATASTAGE <", value, "datastage");
            return (Criteria) this;
        }

        public Criteria andDatastageLessThanOrEqualTo(Object value) {
            addCriterion("DATASTAGE <=", value, "datastage");
            return (Criteria) this;
        }

        public Criteria andDatastageIn(List<Object> values) {
            addCriterion("DATASTAGE in", values, "datastage");
            return (Criteria) this;
        }

        public Criteria andDatastageNotIn(List<Object> values) {
            addCriterion("DATASTAGE not in", values, "datastage");
            return (Criteria) this;
        }

        public Criteria andDatastageBetween(Object value1, Object value2) {
            addCriterion("DATASTAGE between", value1, value2, "datastage");
            return (Criteria) this;
        }

        public Criteria andDatastageNotBetween(Object value1, Object value2) {
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

        public Criteria andTotaluseareaEqualTo(Object value) {
            addCriterion("TOTALUSEAREA =", value, "totalusearea");
            return (Criteria) this;
        }

        public Criteria andTotaluseareaNotEqualTo(Object value) {
            addCriterion("TOTALUSEAREA <>", value, "totalusearea");
            return (Criteria) this;
        }

        public Criteria andTotaluseareaGreaterThan(Object value) {
            addCriterion("TOTALUSEAREA >", value, "totalusearea");
            return (Criteria) this;
        }

        public Criteria andTotaluseareaGreaterThanOrEqualTo(Object value) {
            addCriterion("TOTALUSEAREA >=", value, "totalusearea");
            return (Criteria) this;
        }

        public Criteria andTotaluseareaLessThan(Object value) {
            addCriterion("TOTALUSEAREA <", value, "totalusearea");
            return (Criteria) this;
        }

        public Criteria andTotaluseareaLessThanOrEqualTo(Object value) {
            addCriterion("TOTALUSEAREA <=", value, "totalusearea");
            return (Criteria) this;
        }

        public Criteria andTotaluseareaIn(List<Object> values) {
            addCriterion("TOTALUSEAREA in", values, "totalusearea");
            return (Criteria) this;
        }

        public Criteria andTotaluseareaNotIn(List<Object> values) {
            addCriterion("TOTALUSEAREA not in", values, "totalusearea");
            return (Criteria) this;
        }

        public Criteria andTotaluseareaBetween(Object value1, Object value2) {
            addCriterion("TOTALUSEAREA between", value1, value2, "totalusearea");
            return (Criteria) this;
        }

        public Criteria andTotaluseareaNotBetween(Object value1, Object value2) {
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

        public Criteria andBuildingareaEqualTo(Object value) {
            addCriterion("BUILDINGAREA =", value, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaNotEqualTo(Object value) {
            addCriterion("BUILDINGAREA <>", value, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaGreaterThan(Object value) {
            addCriterion("BUILDINGAREA >", value, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaGreaterThanOrEqualTo(Object value) {
            addCriterion("BUILDINGAREA >=", value, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaLessThan(Object value) {
            addCriterion("BUILDINGAREA <", value, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaLessThanOrEqualTo(Object value) {
            addCriterion("BUILDINGAREA <=", value, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaIn(List<Object> values) {
            addCriterion("BUILDINGAREA in", values, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaNotIn(List<Object> values) {
            addCriterion("BUILDINGAREA not in", values, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaBetween(Object value1, Object value2) {
            addCriterion("BUILDINGAREA between", value1, value2, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaNotBetween(Object value1, Object value2) {
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

        public Criteria andExpropriatedareaEqualTo(Object value) {
            addCriterion("EXPROPRIATEDAREA =", value, "expropriatedarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedareaNotEqualTo(Object value) {
            addCriterion("EXPROPRIATEDAREA <>", value, "expropriatedarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedareaGreaterThan(Object value) {
            addCriterion("EXPROPRIATEDAREA >", value, "expropriatedarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedareaGreaterThanOrEqualTo(Object value) {
            addCriterion("EXPROPRIATEDAREA >=", value, "expropriatedarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedareaLessThan(Object value) {
            addCriterion("EXPROPRIATEDAREA <", value, "expropriatedarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedareaLessThanOrEqualTo(Object value) {
            addCriterion("EXPROPRIATEDAREA <=", value, "expropriatedarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedareaIn(List<Object> values) {
            addCriterion("EXPROPRIATEDAREA in", values, "expropriatedarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedareaNotIn(List<Object> values) {
            addCriterion("EXPROPRIATEDAREA not in", values, "expropriatedarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedareaBetween(Object value1, Object value2) {
            addCriterion("EXPROPRIATEDAREA between", value1, value2, "expropriatedarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedareaNotBetween(Object value1, Object value2) {
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

        public Criteria andExpropriatedgreenareaEqualTo(Object value) {
            addCriterion("EXPROPRIATEDGREENAREA =", value, "expropriatedgreenarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedgreenareaNotEqualTo(Object value) {
            addCriterion("EXPROPRIATEDGREENAREA <>", value, "expropriatedgreenarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedgreenareaGreaterThan(Object value) {
            addCriterion("EXPROPRIATEDGREENAREA >", value, "expropriatedgreenarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedgreenareaGreaterThanOrEqualTo(Object value) {
            addCriterion("EXPROPRIATEDGREENAREA >=", value, "expropriatedgreenarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedgreenareaLessThan(Object value) {
            addCriterion("EXPROPRIATEDGREENAREA <", value, "expropriatedgreenarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedgreenareaLessThanOrEqualTo(Object value) {
            addCriterion("EXPROPRIATEDGREENAREA <=", value, "expropriatedgreenarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedgreenareaIn(List<Object> values) {
            addCriterion("EXPROPRIATEDGREENAREA in", values, "expropriatedgreenarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedgreenareaNotIn(List<Object> values) {
            addCriterion("EXPROPRIATEDGREENAREA not in", values, "expropriatedgreenarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedgreenareaBetween(Object value1, Object value2) {
            addCriterion("EXPROPRIATEDGREENAREA between", value1, value2, "expropriatedgreenarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedgreenareaNotBetween(Object value1, Object value2) {
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

        public Criteria andExpropriatedroadareaEqualTo(Object value) {
            addCriterion("EXPROPRIATEDROADAREA =", value, "expropriatedroadarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedroadareaNotEqualTo(Object value) {
            addCriterion("EXPROPRIATEDROADAREA <>", value, "expropriatedroadarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedroadareaGreaterThan(Object value) {
            addCriterion("EXPROPRIATEDROADAREA >", value, "expropriatedroadarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedroadareaGreaterThanOrEqualTo(Object value) {
            addCriterion("EXPROPRIATEDROADAREA >=", value, "expropriatedroadarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedroadareaLessThan(Object value) {
            addCriterion("EXPROPRIATEDROADAREA <", value, "expropriatedroadarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedroadareaLessThanOrEqualTo(Object value) {
            addCriterion("EXPROPRIATEDROADAREA <=", value, "expropriatedroadarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedroadareaIn(List<Object> values) {
            addCriterion("EXPROPRIATEDROADAREA in", values, "expropriatedroadarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedroadareaNotIn(List<Object> values) {
            addCriterion("EXPROPRIATEDROADAREA not in", values, "expropriatedroadarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedroadareaBetween(Object value1, Object value2) {
            addCriterion("EXPROPRIATEDROADAREA between", value1, value2, "expropriatedroadarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedroadareaNotBetween(Object value1, Object value2) {
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

        public Criteria andExpropriatedotherareaEqualTo(Object value) {
            addCriterion("EXPROPRIATEDOTHERAREA =", value, "expropriatedotherarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedotherareaNotEqualTo(Object value) {
            addCriterion("EXPROPRIATEDOTHERAREA <>", value, "expropriatedotherarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedotherareaGreaterThan(Object value) {
            addCriterion("EXPROPRIATEDOTHERAREA >", value, "expropriatedotherarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedotherareaGreaterThanOrEqualTo(Object value) {
            addCriterion("EXPROPRIATEDOTHERAREA >=", value, "expropriatedotherarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedotherareaLessThan(Object value) {
            addCriterion("EXPROPRIATEDOTHERAREA <", value, "expropriatedotherarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedotherareaLessThanOrEqualTo(Object value) {
            addCriterion("EXPROPRIATEDOTHERAREA <=", value, "expropriatedotherarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedotherareaIn(List<Object> values) {
            addCriterion("EXPROPRIATEDOTHERAREA in", values, "expropriatedotherarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedotherareaNotIn(List<Object> values) {
            addCriterion("EXPROPRIATEDOTHERAREA not in", values, "expropriatedotherarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedotherareaBetween(Object value1, Object value2) {
            addCriterion("EXPROPRIATEDOTHERAREA between", value1, value2, "expropriatedotherarea");
            return (Criteria) this;
        }

        public Criteria andExpropriatedotherareaNotBetween(Object value1, Object value2) {
            addCriterion("EXPROPRIATEDOTHERAREA not between", value1, value2, "expropriatedotherarea");
            return (Criteria) this;
        }

        public Criteria andTotalholdareaIsNull() {
            addCriterion("TOTALHOLDAREA is null");
            return (Criteria) this;
        }

        public Criteria andTotalholdareaIsNotNull() {
            addCriterion("TOTALHOLDAREA is not null");
            return (Criteria) this;
        }

        public Criteria andTotalholdareaEqualTo(Object value) {
            addCriterion("TOTALHOLDAREA =", value, "totalholdarea");
            return (Criteria) this;
        }

        public Criteria andTotalholdareaNotEqualTo(Object value) {
            addCriterion("TOTALHOLDAREA <>", value, "totalholdarea");
            return (Criteria) this;
        }

        public Criteria andTotalholdareaGreaterThan(Object value) {
            addCriterion("TOTALHOLDAREA >", value, "totalholdarea");
            return (Criteria) this;
        }

        public Criteria andTotalholdareaGreaterThanOrEqualTo(Object value) {
            addCriterion("TOTALHOLDAREA >=", value, "totalholdarea");
            return (Criteria) this;
        }

        public Criteria andTotalholdareaLessThan(Object value) {
            addCriterion("TOTALHOLDAREA <", value, "totalholdarea");
            return (Criteria) this;
        }

        public Criteria andTotalholdareaLessThanOrEqualTo(Object value) {
            addCriterion("TOTALHOLDAREA <=", value, "totalholdarea");
            return (Criteria) this;
        }

        public Criteria andTotalholdareaIn(List<Object> values) {
            addCriterion("TOTALHOLDAREA in", values, "totalholdarea");
            return (Criteria) this;
        }

        public Criteria andTotalholdareaNotIn(List<Object> values) {
            addCriterion("TOTALHOLDAREA not in", values, "totalholdarea");
            return (Criteria) this;
        }

        public Criteria andTotalholdareaBetween(Object value1, Object value2) {
            addCriterion("TOTALHOLDAREA between", value1, value2, "totalholdarea");
            return (Criteria) this;
        }

        public Criteria andTotalholdareaNotBetween(Object value1, Object value2) {
            addCriterion("TOTALHOLDAREA not between", value1, value2, "totalholdarea");
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

        public Criteria andBuildingholdareaEqualTo(Object value) {
            addCriterion("BUILDINGHOLDAREA =", value, "buildingholdarea");
            return (Criteria) this;
        }

        public Criteria andBuildingholdareaNotEqualTo(Object value) {
            addCriterion("BUILDINGHOLDAREA <>", value, "buildingholdarea");
            return (Criteria) this;
        }

        public Criteria andBuildingholdareaGreaterThan(Object value) {
            addCriterion("BUILDINGHOLDAREA >", value, "buildingholdarea");
            return (Criteria) this;
        }

        public Criteria andBuildingholdareaGreaterThanOrEqualTo(Object value) {
            addCriterion("BUILDINGHOLDAREA >=", value, "buildingholdarea");
            return (Criteria) this;
        }

        public Criteria andBuildingholdareaLessThan(Object value) {
            addCriterion("BUILDINGHOLDAREA <", value, "buildingholdarea");
            return (Criteria) this;
        }

        public Criteria andBuildingholdareaLessThanOrEqualTo(Object value) {
            addCriterion("BUILDINGHOLDAREA <=", value, "buildingholdarea");
            return (Criteria) this;
        }

        public Criteria andBuildingholdareaIn(List<Object> values) {
            addCriterion("BUILDINGHOLDAREA in", values, "buildingholdarea");
            return (Criteria) this;
        }

        public Criteria andBuildingholdareaNotIn(List<Object> values) {
            addCriterion("BUILDINGHOLDAREA not in", values, "buildingholdarea");
            return (Criteria) this;
        }

        public Criteria andBuildingholdareaBetween(Object value1, Object value2) {
            addCriterion("BUILDINGHOLDAREA between", value1, value2, "buildingholdarea");
            return (Criteria) this;
        }

        public Criteria andBuildingholdareaNotBetween(Object value1, Object value2) {
            addCriterion("BUILDINGHOLDAREA not between", value1, value2, "buildingholdarea");
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

        public Criteria andDemonstrationareaEqualTo(Object value) {
            addCriterion("DEMONSTRATIONAREA =", value, "demonstrationarea");
            return (Criteria) this;
        }

        public Criteria andDemonstrationareaNotEqualTo(Object value) {
            addCriterion("DEMONSTRATIONAREA <>", value, "demonstrationarea");
            return (Criteria) this;
        }

        public Criteria andDemonstrationareaGreaterThan(Object value) {
            addCriterion("DEMONSTRATIONAREA >", value, "demonstrationarea");
            return (Criteria) this;
        }

        public Criteria andDemonstrationareaGreaterThanOrEqualTo(Object value) {
            addCriterion("DEMONSTRATIONAREA >=", value, "demonstrationarea");
            return (Criteria) this;
        }

        public Criteria andDemonstrationareaLessThan(Object value) {
            addCriterion("DEMONSTRATIONAREA <", value, "demonstrationarea");
            return (Criteria) this;
        }

        public Criteria andDemonstrationareaLessThanOrEqualTo(Object value) {
            addCriterion("DEMONSTRATIONAREA <=", value, "demonstrationarea");
            return (Criteria) this;
        }

        public Criteria andDemonstrationareaIn(List<Object> values) {
            addCriterion("DEMONSTRATIONAREA in", values, "demonstrationarea");
            return (Criteria) this;
        }

        public Criteria andDemonstrationareaNotIn(List<Object> values) {
            addCriterion("DEMONSTRATIONAREA not in", values, "demonstrationarea");
            return (Criteria) this;
        }

        public Criteria andDemonstrationareaBetween(Object value1, Object value2) {
            addCriterion("DEMONSTRATIONAREA between", value1, value2, "demonstrationarea");
            return (Criteria) this;
        }

        public Criteria andDemonstrationareaNotBetween(Object value1, Object value2) {
            addCriterion("DEMONSTRATIONAREA not between", value1, value2, "demonstrationarea");
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

        public Criteria andTotalroadareaEqualTo(Object value) {
            addCriterion("TOTALROADAREA =", value, "totalroadarea");
            return (Criteria) this;
        }

        public Criteria andTotalroadareaNotEqualTo(Object value) {
            addCriterion("TOTALROADAREA <>", value, "totalroadarea");
            return (Criteria) this;
        }

        public Criteria andTotalroadareaGreaterThan(Object value) {
            addCriterion("TOTALROADAREA >", value, "totalroadarea");
            return (Criteria) this;
        }

        public Criteria andTotalroadareaGreaterThanOrEqualTo(Object value) {
            addCriterion("TOTALROADAREA >=", value, "totalroadarea");
            return (Criteria) this;
        }

        public Criteria andTotalroadareaLessThan(Object value) {
            addCriterion("TOTALROADAREA <", value, "totalroadarea");
            return (Criteria) this;
        }

        public Criteria andTotalroadareaLessThanOrEqualTo(Object value) {
            addCriterion("TOTALROADAREA <=", value, "totalroadarea");
            return (Criteria) this;
        }

        public Criteria andTotalroadareaIn(List<Object> values) {
            addCriterion("TOTALROADAREA in", values, "totalroadarea");
            return (Criteria) this;
        }

        public Criteria andTotalroadareaNotIn(List<Object> values) {
            addCriterion("TOTALROADAREA not in", values, "totalroadarea");
            return (Criteria) this;
        }

        public Criteria andTotalroadareaBetween(Object value1, Object value2) {
            addCriterion("TOTALROADAREA between", value1, value2, "totalroadarea");
            return (Criteria) this;
        }

        public Criteria andTotalroadareaNotBetween(Object value1, Object value2) {
            addCriterion("TOTALROADAREA not between", value1, value2, "totalroadarea");
            return (Criteria) this;
        }

        public Criteria andBituminousroadIsNull() {
            addCriterion("BITUMINOUSROAD is null");
            return (Criteria) this;
        }

        public Criteria andBituminousroadIsNotNull() {
            addCriterion("BITUMINOUSROAD is not null");
            return (Criteria) this;
        }

        public Criteria andBituminousroadEqualTo(Object value) {
            addCriterion("BITUMINOUSROAD =", value, "bituminousroad");
            return (Criteria) this;
        }

        public Criteria andBituminousroadNotEqualTo(Object value) {
            addCriterion("BITUMINOUSROAD <>", value, "bituminousroad");
            return (Criteria) this;
        }

        public Criteria andBituminousroadGreaterThan(Object value) {
            addCriterion("BITUMINOUSROAD >", value, "bituminousroad");
            return (Criteria) this;
        }

        public Criteria andBituminousroadGreaterThanOrEqualTo(Object value) {
            addCriterion("BITUMINOUSROAD >=", value, "bituminousroad");
            return (Criteria) this;
        }

        public Criteria andBituminousroadLessThan(Object value) {
            addCriterion("BITUMINOUSROAD <", value, "bituminousroad");
            return (Criteria) this;
        }

        public Criteria andBituminousroadLessThanOrEqualTo(Object value) {
            addCriterion("BITUMINOUSROAD <=", value, "bituminousroad");
            return (Criteria) this;
        }

        public Criteria andBituminousroadIn(List<Object> values) {
            addCriterion("BITUMINOUSROAD in", values, "bituminousroad");
            return (Criteria) this;
        }

        public Criteria andBituminousroadNotIn(List<Object> values) {
            addCriterion("BITUMINOUSROAD not in", values, "bituminousroad");
            return (Criteria) this;
        }

        public Criteria andBituminousroadBetween(Object value1, Object value2) {
            addCriterion("BITUMINOUSROAD between", value1, value2, "bituminousroad");
            return (Criteria) this;
        }

        public Criteria andBituminousroadNotBetween(Object value1, Object value2) {
            addCriterion("BITUMINOUSROAD not between", value1, value2, "bituminousroad");
            return (Criteria) this;
        }

        public Criteria andCementroadIsNull() {
            addCriterion("CEMENTROAD is null");
            return (Criteria) this;
        }

        public Criteria andCementroadIsNotNull() {
            addCriterion("CEMENTROAD is not null");
            return (Criteria) this;
        }

        public Criteria andCementroadEqualTo(Object value) {
            addCriterion("CEMENTROAD =", value, "cementroad");
            return (Criteria) this;
        }

        public Criteria andCementroadNotEqualTo(Object value) {
            addCriterion("CEMENTROAD <>", value, "cementroad");
            return (Criteria) this;
        }

        public Criteria andCementroadGreaterThan(Object value) {
            addCriterion("CEMENTROAD >", value, "cementroad");
            return (Criteria) this;
        }

        public Criteria andCementroadGreaterThanOrEqualTo(Object value) {
            addCriterion("CEMENTROAD >=", value, "cementroad");
            return (Criteria) this;
        }

        public Criteria andCementroadLessThan(Object value) {
            addCriterion("CEMENTROAD <", value, "cementroad");
            return (Criteria) this;
        }

        public Criteria andCementroadLessThanOrEqualTo(Object value) {
            addCriterion("CEMENTROAD <=", value, "cementroad");
            return (Criteria) this;
        }

        public Criteria andCementroadIn(List<Object> values) {
            addCriterion("CEMENTROAD in", values, "cementroad");
            return (Criteria) this;
        }

        public Criteria andCementroadNotIn(List<Object> values) {
            addCriterion("CEMENTROAD not in", values, "cementroad");
            return (Criteria) this;
        }

        public Criteria andCementroadBetween(Object value1, Object value2) {
            addCriterion("CEMENTROAD between", value1, value2, "cementroad");
            return (Criteria) this;
        }

        public Criteria andCementroadNotBetween(Object value1, Object value2) {
            addCriterion("CEMENTROAD not between", value1, value2, "cementroad");
            return (Criteria) this;
        }

        public Criteria andHardroadIsNull() {
            addCriterion("HARDROAD is null");
            return (Criteria) this;
        }

        public Criteria andHardroadIsNotNull() {
            addCriterion("HARDROAD is not null");
            return (Criteria) this;
        }

        public Criteria andHardroadEqualTo(Object value) {
            addCriterion("HARDROAD =", value, "hardroad");
            return (Criteria) this;
        }

        public Criteria andHardroadNotEqualTo(Object value) {
            addCriterion("HARDROAD <>", value, "hardroad");
            return (Criteria) this;
        }

        public Criteria andHardroadGreaterThan(Object value) {
            addCriterion("HARDROAD >", value, "hardroad");
            return (Criteria) this;
        }

        public Criteria andHardroadGreaterThanOrEqualTo(Object value) {
            addCriterion("HARDROAD >=", value, "hardroad");
            return (Criteria) this;
        }

        public Criteria andHardroadLessThan(Object value) {
            addCriterion("HARDROAD <", value, "hardroad");
            return (Criteria) this;
        }

        public Criteria andHardroadLessThanOrEqualTo(Object value) {
            addCriterion("HARDROAD <=", value, "hardroad");
            return (Criteria) this;
        }

        public Criteria andHardroadIn(List<Object> values) {
            addCriterion("HARDROAD in", values, "hardroad");
            return (Criteria) this;
        }

        public Criteria andHardroadNotIn(List<Object> values) {
            addCriterion("HARDROAD not in", values, "hardroad");
            return (Criteria) this;
        }

        public Criteria andHardroadBetween(Object value1, Object value2) {
            addCriterion("HARDROAD between", value1, value2, "hardroad");
            return (Criteria) this;
        }

        public Criteria andHardroadNotBetween(Object value1, Object value2) {
            addCriterion("HARDROAD not between", value1, value2, "hardroad");
            return (Criteria) this;
        }

        public Criteria andHardplazaIsNull() {
            addCriterion("HARDPLAZA is null");
            return (Criteria) this;
        }

        public Criteria andHardplazaIsNotNull() {
            addCriterion("HARDPLAZA is not null");
            return (Criteria) this;
        }

        public Criteria andHardplazaEqualTo(Object value) {
            addCriterion("HARDPLAZA =", value, "hardplaza");
            return (Criteria) this;
        }

        public Criteria andHardplazaNotEqualTo(Object value) {
            addCriterion("HARDPLAZA <>", value, "hardplaza");
            return (Criteria) this;
        }

        public Criteria andHardplazaGreaterThan(Object value) {
            addCriterion("HARDPLAZA >", value, "hardplaza");
            return (Criteria) this;
        }

        public Criteria andHardplazaGreaterThanOrEqualTo(Object value) {
            addCriterion("HARDPLAZA >=", value, "hardplaza");
            return (Criteria) this;
        }

        public Criteria andHardplazaLessThan(Object value) {
            addCriterion("HARDPLAZA <", value, "hardplaza");
            return (Criteria) this;
        }

        public Criteria andHardplazaLessThanOrEqualTo(Object value) {
            addCriterion("HARDPLAZA <=", value, "hardplaza");
            return (Criteria) this;
        }

        public Criteria andHardplazaIn(List<Object> values) {
            addCriterion("HARDPLAZA in", values, "hardplaza");
            return (Criteria) this;
        }

        public Criteria andHardplazaNotIn(List<Object> values) {
            addCriterion("HARDPLAZA not in", values, "hardplaza");
            return (Criteria) this;
        }

        public Criteria andHardplazaBetween(Object value1, Object value2) {
            addCriterion("HARDPLAZA between", value1, value2, "hardplaza");
            return (Criteria) this;
        }

        public Criteria andHardplazaNotBetween(Object value1, Object value2) {
            addCriterion("HARDPLAZA not between", value1, value2, "hardplaza");
            return (Criteria) this;
        }

        public Criteria andHardsidewalkIsNull() {
            addCriterion("HARDSIDEWALK is null");
            return (Criteria) this;
        }

        public Criteria andHardsidewalkIsNotNull() {
            addCriterion("HARDSIDEWALK is not null");
            return (Criteria) this;
        }

        public Criteria andHardsidewalkEqualTo(Object value) {
            addCriterion("HARDSIDEWALK =", value, "hardsidewalk");
            return (Criteria) this;
        }

        public Criteria andHardsidewalkNotEqualTo(Object value) {
            addCriterion("HARDSIDEWALK <>", value, "hardsidewalk");
            return (Criteria) this;
        }

        public Criteria andHardsidewalkGreaterThan(Object value) {
            addCriterion("HARDSIDEWALK >", value, "hardsidewalk");
            return (Criteria) this;
        }

        public Criteria andHardsidewalkGreaterThanOrEqualTo(Object value) {
            addCriterion("HARDSIDEWALK >=", value, "hardsidewalk");
            return (Criteria) this;
        }

        public Criteria andHardsidewalkLessThan(Object value) {
            addCriterion("HARDSIDEWALK <", value, "hardsidewalk");
            return (Criteria) this;
        }

        public Criteria andHardsidewalkLessThanOrEqualTo(Object value) {
            addCriterion("HARDSIDEWALK <=", value, "hardsidewalk");
            return (Criteria) this;
        }

        public Criteria andHardsidewalkIn(List<Object> values) {
            addCriterion("HARDSIDEWALK in", values, "hardsidewalk");
            return (Criteria) this;
        }

        public Criteria andHardsidewalkNotIn(List<Object> values) {
            addCriterion("HARDSIDEWALK not in", values, "hardsidewalk");
            return (Criteria) this;
        }

        public Criteria andHardsidewalkBetween(Object value1, Object value2) {
            addCriterion("HARDSIDEWALK between", value1, value2, "hardsidewalk");
            return (Criteria) this;
        }

        public Criteria andHardsidewalkNotBetween(Object value1, Object value2) {
            addCriterion("HARDSIDEWALK not between", value1, value2, "hardsidewalk");
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

        public Criteria andTotalgreenareaEqualTo(Object value) {
            addCriterion("TOTALGREENAREA =", value, "totalgreenarea");
            return (Criteria) this;
        }

        public Criteria andTotalgreenareaNotEqualTo(Object value) {
            addCriterion("TOTALGREENAREA <>", value, "totalgreenarea");
            return (Criteria) this;
        }

        public Criteria andTotalgreenareaGreaterThan(Object value) {
            addCriterion("TOTALGREENAREA >", value, "totalgreenarea");
            return (Criteria) this;
        }

        public Criteria andTotalgreenareaGreaterThanOrEqualTo(Object value) {
            addCriterion("TOTALGREENAREA >=", value, "totalgreenarea");
            return (Criteria) this;
        }

        public Criteria andTotalgreenareaLessThan(Object value) {
            addCriterion("TOTALGREENAREA <", value, "totalgreenarea");
            return (Criteria) this;
        }

        public Criteria andTotalgreenareaLessThanOrEqualTo(Object value) {
            addCriterion("TOTALGREENAREA <=", value, "totalgreenarea");
            return (Criteria) this;
        }

        public Criteria andTotalgreenareaIn(List<Object> values) {
            addCriterion("TOTALGREENAREA in", values, "totalgreenarea");
            return (Criteria) this;
        }

        public Criteria andTotalgreenareaNotIn(List<Object> values) {
            addCriterion("TOTALGREENAREA not in", values, "totalgreenarea");
            return (Criteria) this;
        }

        public Criteria andTotalgreenareaBetween(Object value1, Object value2) {
            addCriterion("TOTALGREENAREA between", value1, value2, "totalgreenarea");
            return (Criteria) this;
        }

        public Criteria andTotalgreenareaNotBetween(Object value1, Object value2) {
            addCriterion("TOTALGREENAREA not between", value1, value2, "totalgreenarea");
            return (Criteria) this;
        }

        public Criteria andPublicgreenareaIsNull() {
            addCriterion("PUBLICGREENAREA is null");
            return (Criteria) this;
        }

        public Criteria andPublicgreenareaIsNotNull() {
            addCriterion("PUBLICGREENAREA is not null");
            return (Criteria) this;
        }

        public Criteria andPublicgreenareaEqualTo(Object value) {
            addCriterion("PUBLICGREENAREA =", value, "publicgreenarea");
            return (Criteria) this;
        }

        public Criteria andPublicgreenareaNotEqualTo(Object value) {
            addCriterion("PUBLICGREENAREA <>", value, "publicgreenarea");
            return (Criteria) this;
        }

        public Criteria andPublicgreenareaGreaterThan(Object value) {
            addCriterion("PUBLICGREENAREA >", value, "publicgreenarea");
            return (Criteria) this;
        }

        public Criteria andPublicgreenareaGreaterThanOrEqualTo(Object value) {
            addCriterion("PUBLICGREENAREA >=", value, "publicgreenarea");
            return (Criteria) this;
        }

        public Criteria andPublicgreenareaLessThan(Object value) {
            addCriterion("PUBLICGREENAREA <", value, "publicgreenarea");
            return (Criteria) this;
        }

        public Criteria andPublicgreenareaLessThanOrEqualTo(Object value) {
            addCriterion("PUBLICGREENAREA <=", value, "publicgreenarea");
            return (Criteria) this;
        }

        public Criteria andPublicgreenareaIn(List<Object> values) {
            addCriterion("PUBLICGREENAREA in", values, "publicgreenarea");
            return (Criteria) this;
        }

        public Criteria andPublicgreenareaNotIn(List<Object> values) {
            addCriterion("PUBLICGREENAREA not in", values, "publicgreenarea");
            return (Criteria) this;
        }

        public Criteria andPublicgreenareaBetween(Object value1, Object value2) {
            addCriterion("PUBLICGREENAREA between", value1, value2, "publicgreenarea");
            return (Criteria) this;
        }

        public Criteria andPublicgreenareaNotBetween(Object value1, Object value2) {
            addCriterion("PUBLICGREENAREA not between", value1, value2, "publicgreenarea");
            return (Criteria) this;
        }

        public Criteria andAmonggreenareaIsNull() {
            addCriterion("AMONGGREENAREA is null");
            return (Criteria) this;
        }

        public Criteria andAmonggreenareaIsNotNull() {
            addCriterion("AMONGGREENAREA is not null");
            return (Criteria) this;
        }

        public Criteria andAmonggreenareaEqualTo(Object value) {
            addCriterion("AMONGGREENAREA =", value, "amonggreenarea");
            return (Criteria) this;
        }

        public Criteria andAmonggreenareaNotEqualTo(Object value) {
            addCriterion("AMONGGREENAREA <>", value, "amonggreenarea");
            return (Criteria) this;
        }

        public Criteria andAmonggreenareaGreaterThan(Object value) {
            addCriterion("AMONGGREENAREA >", value, "amonggreenarea");
            return (Criteria) this;
        }

        public Criteria andAmonggreenareaGreaterThanOrEqualTo(Object value) {
            addCriterion("AMONGGREENAREA >=", value, "amonggreenarea");
            return (Criteria) this;
        }

        public Criteria andAmonggreenareaLessThan(Object value) {
            addCriterion("AMONGGREENAREA <", value, "amonggreenarea");
            return (Criteria) this;
        }

        public Criteria andAmonggreenareaLessThanOrEqualTo(Object value) {
            addCriterion("AMONGGREENAREA <=", value, "amonggreenarea");
            return (Criteria) this;
        }

        public Criteria andAmonggreenareaIn(List<Object> values) {
            addCriterion("AMONGGREENAREA in", values, "amonggreenarea");
            return (Criteria) this;
        }

        public Criteria andAmonggreenareaNotIn(List<Object> values) {
            addCriterion("AMONGGREENAREA not in", values, "amonggreenarea");
            return (Criteria) this;
        }

        public Criteria andAmonggreenareaBetween(Object value1, Object value2) {
            addCriterion("AMONGGREENAREA between", value1, value2, "amonggreenarea");
            return (Criteria) this;
        }

        public Criteria andAmonggreenareaNotBetween(Object value1, Object value2) {
            addCriterion("AMONGGREENAREA not between", value1, value2, "amonggreenarea");
            return (Criteria) this;
        }

        public Criteria andPrivategreenareaIsNull() {
            addCriterion("PRIVATEGREENAREA is null");
            return (Criteria) this;
        }

        public Criteria andPrivategreenareaIsNotNull() {
            addCriterion("PRIVATEGREENAREA is not null");
            return (Criteria) this;
        }

        public Criteria andPrivategreenareaEqualTo(Object value) {
            addCriterion("PRIVATEGREENAREA =", value, "privategreenarea");
            return (Criteria) this;
        }

        public Criteria andPrivategreenareaNotEqualTo(Object value) {
            addCriterion("PRIVATEGREENAREA <>", value, "privategreenarea");
            return (Criteria) this;
        }

        public Criteria andPrivategreenareaGreaterThan(Object value) {
            addCriterion("PRIVATEGREENAREA >", value, "privategreenarea");
            return (Criteria) this;
        }

        public Criteria andPrivategreenareaGreaterThanOrEqualTo(Object value) {
            addCriterion("PRIVATEGREENAREA >=", value, "privategreenarea");
            return (Criteria) this;
        }

        public Criteria andPrivategreenareaLessThan(Object value) {
            addCriterion("PRIVATEGREENAREA <", value, "privategreenarea");
            return (Criteria) this;
        }

        public Criteria andPrivategreenareaLessThanOrEqualTo(Object value) {
            addCriterion("PRIVATEGREENAREA <=", value, "privategreenarea");
            return (Criteria) this;
        }

        public Criteria andPrivategreenareaIn(List<Object> values) {
            addCriterion("PRIVATEGREENAREA in", values, "privategreenarea");
            return (Criteria) this;
        }

        public Criteria andPrivategreenareaNotIn(List<Object> values) {
            addCriterion("PRIVATEGREENAREA not in", values, "privategreenarea");
            return (Criteria) this;
        }

        public Criteria andPrivategreenareaBetween(Object value1, Object value2) {
            addCriterion("PRIVATEGREENAREA between", value1, value2, "privategreenarea");
            return (Criteria) this;
        }

        public Criteria andPrivategreenareaNotBetween(Object value1, Object value2) {
            addCriterion("PRIVATEGREENAREA not between", value1, value2, "privategreenarea");
            return (Criteria) this;
        }

        public Criteria andWaterscapeareaIsNull() {
            addCriterion("WATERSCAPEAREA is null");
            return (Criteria) this;
        }

        public Criteria andWaterscapeareaIsNotNull() {
            addCriterion("WATERSCAPEAREA is not null");
            return (Criteria) this;
        }

        public Criteria andWaterscapeareaEqualTo(Object value) {
            addCriterion("WATERSCAPEAREA =", value, "waterscapearea");
            return (Criteria) this;
        }

        public Criteria andWaterscapeareaNotEqualTo(Object value) {
            addCriterion("WATERSCAPEAREA <>", value, "waterscapearea");
            return (Criteria) this;
        }

        public Criteria andWaterscapeareaGreaterThan(Object value) {
            addCriterion("WATERSCAPEAREA >", value, "waterscapearea");
            return (Criteria) this;
        }

        public Criteria andWaterscapeareaGreaterThanOrEqualTo(Object value) {
            addCriterion("WATERSCAPEAREA >=", value, "waterscapearea");
            return (Criteria) this;
        }

        public Criteria andWaterscapeareaLessThan(Object value) {
            addCriterion("WATERSCAPEAREA <", value, "waterscapearea");
            return (Criteria) this;
        }

        public Criteria andWaterscapeareaLessThanOrEqualTo(Object value) {
            addCriterion("WATERSCAPEAREA <=", value, "waterscapearea");
            return (Criteria) this;
        }

        public Criteria andWaterscapeareaIn(List<Object> values) {
            addCriterion("WATERSCAPEAREA in", values, "waterscapearea");
            return (Criteria) this;
        }

        public Criteria andWaterscapeareaNotIn(List<Object> values) {
            addCriterion("WATERSCAPEAREA not in", values, "waterscapearea");
            return (Criteria) this;
        }

        public Criteria andWaterscapeareaBetween(Object value1, Object value2) {
            addCriterion("WATERSCAPEAREA between", value1, value2, "waterscapearea");
            return (Criteria) this;
        }

        public Criteria andWaterscapeareaNotBetween(Object value1, Object value2) {
            addCriterion("WATERSCAPEAREA not between", value1, value2, "waterscapearea");
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

        public Criteria andTotalcapacityareaEqualTo(Object value) {
            addCriterion("TOTALCAPACITYAREA =", value, "totalcapacityarea");
            return (Criteria) this;
        }

        public Criteria andTotalcapacityareaNotEqualTo(Object value) {
            addCriterion("TOTALCAPACITYAREA <>", value, "totalcapacityarea");
            return (Criteria) this;
        }

        public Criteria andTotalcapacityareaGreaterThan(Object value) {
            addCriterion("TOTALCAPACITYAREA >", value, "totalcapacityarea");
            return (Criteria) this;
        }

        public Criteria andTotalcapacityareaGreaterThanOrEqualTo(Object value) {
            addCriterion("TOTALCAPACITYAREA >=", value, "totalcapacityarea");
            return (Criteria) this;
        }

        public Criteria andTotalcapacityareaLessThan(Object value) {
            addCriterion("TOTALCAPACITYAREA <", value, "totalcapacityarea");
            return (Criteria) this;
        }

        public Criteria andTotalcapacityareaLessThanOrEqualTo(Object value) {
            addCriterion("TOTALCAPACITYAREA <=", value, "totalcapacityarea");
            return (Criteria) this;
        }

        public Criteria andTotalcapacityareaIn(List<Object> values) {
            addCriterion("TOTALCAPACITYAREA in", values, "totalcapacityarea");
            return (Criteria) this;
        }

        public Criteria andTotalcapacityareaNotIn(List<Object> values) {
            addCriterion("TOTALCAPACITYAREA not in", values, "totalcapacityarea");
            return (Criteria) this;
        }

        public Criteria andTotalcapacityareaBetween(Object value1, Object value2) {
            addCriterion("TOTALCAPACITYAREA between", value1, value2, "totalcapacityarea");
            return (Criteria) this;
        }

        public Criteria andTotalcapacityareaNotBetween(Object value1, Object value2) {
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

        public Criteria andUpcapacityareaEqualTo(Object value) {
            addCriterion("UPCAPACITYAREA =", value, "upcapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpcapacityareaNotEqualTo(Object value) {
            addCriterion("UPCAPACITYAREA <>", value, "upcapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpcapacityareaGreaterThan(Object value) {
            addCriterion("UPCAPACITYAREA >", value, "upcapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpcapacityareaGreaterThanOrEqualTo(Object value) {
            addCriterion("UPCAPACITYAREA >=", value, "upcapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpcapacityareaLessThan(Object value) {
            addCriterion("UPCAPACITYAREA <", value, "upcapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpcapacityareaLessThanOrEqualTo(Object value) {
            addCriterion("UPCAPACITYAREA <=", value, "upcapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpcapacityareaIn(List<Object> values) {
            addCriterion("UPCAPACITYAREA in", values, "upcapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpcapacityareaNotIn(List<Object> values) {
            addCriterion("UPCAPACITYAREA not in", values, "upcapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpcapacityareaBetween(Object value1, Object value2) {
            addCriterion("UPCAPACITYAREA between", value1, value2, "upcapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpcapacityareaNotBetween(Object value1, Object value2) {
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

        public Criteria andDowncapacityareaEqualTo(Object value) {
            addCriterion("DOWNCAPACITYAREA =", value, "downcapacityarea");
            return (Criteria) this;
        }

        public Criteria andDowncapacityareaNotEqualTo(Object value) {
            addCriterion("DOWNCAPACITYAREA <>", value, "downcapacityarea");
            return (Criteria) this;
        }

        public Criteria andDowncapacityareaGreaterThan(Object value) {
            addCriterion("DOWNCAPACITYAREA >", value, "downcapacityarea");
            return (Criteria) this;
        }

        public Criteria andDowncapacityareaGreaterThanOrEqualTo(Object value) {
            addCriterion("DOWNCAPACITYAREA >=", value, "downcapacityarea");
            return (Criteria) this;
        }

        public Criteria andDowncapacityareaLessThan(Object value) {
            addCriterion("DOWNCAPACITYAREA <", value, "downcapacityarea");
            return (Criteria) this;
        }

        public Criteria andDowncapacityareaLessThanOrEqualTo(Object value) {
            addCriterion("DOWNCAPACITYAREA <=", value, "downcapacityarea");
            return (Criteria) this;
        }

        public Criteria andDowncapacityareaIn(List<Object> values) {
            addCriterion("DOWNCAPACITYAREA in", values, "downcapacityarea");
            return (Criteria) this;
        }

        public Criteria andDowncapacityareaNotIn(List<Object> values) {
            addCriterion("DOWNCAPACITYAREA not in", values, "downcapacityarea");
            return (Criteria) this;
        }

        public Criteria andDowncapacityareaBetween(Object value1, Object value2) {
            addCriterion("DOWNCAPACITYAREA between", value1, value2, "downcapacityarea");
            return (Criteria) this;
        }

        public Criteria andDowncapacityareaNotBetween(Object value1, Object value2) {
            addCriterion("DOWNCAPACITYAREA not between", value1, value2, "downcapacityarea");
            return (Criteria) this;
        }

        public Criteria andTotalpublicareaIsNull() {
            addCriterion("TOTALPUBLICAREA is null");
            return (Criteria) this;
        }

        public Criteria andTotalpublicareaIsNotNull() {
            addCriterion("TOTALPUBLICAREA is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpublicareaEqualTo(Object value) {
            addCriterion("TOTALPUBLICAREA =", value, "totalpublicarea");
            return (Criteria) this;
        }

        public Criteria andTotalpublicareaNotEqualTo(Object value) {
            addCriterion("TOTALPUBLICAREA <>", value, "totalpublicarea");
            return (Criteria) this;
        }

        public Criteria andTotalpublicareaGreaterThan(Object value) {
            addCriterion("TOTALPUBLICAREA >", value, "totalpublicarea");
            return (Criteria) this;
        }

        public Criteria andTotalpublicareaGreaterThanOrEqualTo(Object value) {
            addCriterion("TOTALPUBLICAREA >=", value, "totalpublicarea");
            return (Criteria) this;
        }

        public Criteria andTotalpublicareaLessThan(Object value) {
            addCriterion("TOTALPUBLICAREA <", value, "totalpublicarea");
            return (Criteria) this;
        }

        public Criteria andTotalpublicareaLessThanOrEqualTo(Object value) {
            addCriterion("TOTALPUBLICAREA <=", value, "totalpublicarea");
            return (Criteria) this;
        }

        public Criteria andTotalpublicareaIn(List<Object> values) {
            addCriterion("TOTALPUBLICAREA in", values, "totalpublicarea");
            return (Criteria) this;
        }

        public Criteria andTotalpublicareaNotIn(List<Object> values) {
            addCriterion("TOTALPUBLICAREA not in", values, "totalpublicarea");
            return (Criteria) this;
        }

        public Criteria andTotalpublicareaBetween(Object value1, Object value2) {
            addCriterion("TOTALPUBLICAREA between", value1, value2, "totalpublicarea");
            return (Criteria) this;
        }

        public Criteria andTotalpublicareaNotBetween(Object value1, Object value2) {
            addCriterion("TOTALPUBLICAREA not between", value1, value2, "totalpublicarea");
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

        public Criteria andUpnoncapacityareaEqualTo(Object value) {
            addCriterion("UPNONCAPACITYAREA =", value, "upnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpnoncapacityareaNotEqualTo(Object value) {
            addCriterion("UPNONCAPACITYAREA <>", value, "upnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpnoncapacityareaGreaterThan(Object value) {
            addCriterion("UPNONCAPACITYAREA >", value, "upnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpnoncapacityareaGreaterThanOrEqualTo(Object value) {
            addCriterion("UPNONCAPACITYAREA >=", value, "upnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpnoncapacityareaLessThan(Object value) {
            addCriterion("UPNONCAPACITYAREA <", value, "upnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpnoncapacityareaLessThanOrEqualTo(Object value) {
            addCriterion("UPNONCAPACITYAREA <=", value, "upnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpnoncapacityareaIn(List<Object> values) {
            addCriterion("UPNONCAPACITYAREA in", values, "upnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpnoncapacityareaNotIn(List<Object> values) {
            addCriterion("UPNONCAPACITYAREA not in", values, "upnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpnoncapacityareaBetween(Object value1, Object value2) {
            addCriterion("UPNONCAPACITYAREA between", value1, value2, "upnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andUpnoncapacityareaNotBetween(Object value1, Object value2) {
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

        public Criteria andDownnoncapacityareaEqualTo(Object value) {
            addCriterion("DOWNNONCAPACITYAREA =", value, "downnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andDownnoncapacityareaNotEqualTo(Object value) {
            addCriterion("DOWNNONCAPACITYAREA <>", value, "downnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andDownnoncapacityareaGreaterThan(Object value) {
            addCriterion("DOWNNONCAPACITYAREA >", value, "downnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andDownnoncapacityareaGreaterThanOrEqualTo(Object value) {
            addCriterion("DOWNNONCAPACITYAREA >=", value, "downnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andDownnoncapacityareaLessThan(Object value) {
            addCriterion("DOWNNONCAPACITYAREA <", value, "downnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andDownnoncapacityareaLessThanOrEqualTo(Object value) {
            addCriterion("DOWNNONCAPACITYAREA <=", value, "downnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andDownnoncapacityareaIn(List<Object> values) {
            addCriterion("DOWNNONCAPACITYAREA in", values, "downnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andDownnoncapacityareaNotIn(List<Object> values) {
            addCriterion("DOWNNONCAPACITYAREA not in", values, "downnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andDownnoncapacityareaBetween(Object value1, Object value2) {
            addCriterion("DOWNNONCAPACITYAREA between", value1, value2, "downnoncapacityarea");
            return (Criteria) this;
        }

        public Criteria andDownnoncapacityareaNotBetween(Object value1, Object value2) {
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

        public Criteria andTotalbuildingareaEqualTo(Object value) {
            addCriterion("TOTALBUILDINGAREA =", value, "totalbuildingarea");
            return (Criteria) this;
        }

        public Criteria andTotalbuildingareaNotEqualTo(Object value) {
            addCriterion("TOTALBUILDINGAREA <>", value, "totalbuildingarea");
            return (Criteria) this;
        }

        public Criteria andTotalbuildingareaGreaterThan(Object value) {
            addCriterion("TOTALBUILDINGAREA >", value, "totalbuildingarea");
            return (Criteria) this;
        }

        public Criteria andTotalbuildingareaGreaterThanOrEqualTo(Object value) {
            addCriterion("TOTALBUILDINGAREA >=", value, "totalbuildingarea");
            return (Criteria) this;
        }

        public Criteria andTotalbuildingareaLessThan(Object value) {
            addCriterion("TOTALBUILDINGAREA <", value, "totalbuildingarea");
            return (Criteria) this;
        }

        public Criteria andTotalbuildingareaLessThanOrEqualTo(Object value) {
            addCriterion("TOTALBUILDINGAREA <=", value, "totalbuildingarea");
            return (Criteria) this;
        }

        public Criteria andTotalbuildingareaIn(List<Object> values) {
            addCriterion("TOTALBUILDINGAREA in", values, "totalbuildingarea");
            return (Criteria) this;
        }

        public Criteria andTotalbuildingareaNotIn(List<Object> values) {
            addCriterion("TOTALBUILDINGAREA not in", values, "totalbuildingarea");
            return (Criteria) this;
        }

        public Criteria andTotalbuildingareaBetween(Object value1, Object value2) {
            addCriterion("TOTALBUILDINGAREA between", value1, value2, "totalbuildingarea");
            return (Criteria) this;
        }

        public Criteria andTotalbuildingareaNotBetween(Object value1, Object value2) {
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

        public Criteria andUpbuildingareaEqualTo(Object value) {
            addCriterion("UPBUILDINGAREA =", value, "upbuildingarea");
            return (Criteria) this;
        }

        public Criteria andUpbuildingareaNotEqualTo(Object value) {
            addCriterion("UPBUILDINGAREA <>", value, "upbuildingarea");
            return (Criteria) this;
        }

        public Criteria andUpbuildingareaGreaterThan(Object value) {
            addCriterion("UPBUILDINGAREA >", value, "upbuildingarea");
            return (Criteria) this;
        }

        public Criteria andUpbuildingareaGreaterThanOrEqualTo(Object value) {
            addCriterion("UPBUILDINGAREA >=", value, "upbuildingarea");
            return (Criteria) this;
        }

        public Criteria andUpbuildingareaLessThan(Object value) {
            addCriterion("UPBUILDINGAREA <", value, "upbuildingarea");
            return (Criteria) this;
        }

        public Criteria andUpbuildingareaLessThanOrEqualTo(Object value) {
            addCriterion("UPBUILDINGAREA <=", value, "upbuildingarea");
            return (Criteria) this;
        }

        public Criteria andUpbuildingareaIn(List<Object> values) {
            addCriterion("UPBUILDINGAREA in", values, "upbuildingarea");
            return (Criteria) this;
        }

        public Criteria andUpbuildingareaNotIn(List<Object> values) {
            addCriterion("UPBUILDINGAREA not in", values, "upbuildingarea");
            return (Criteria) this;
        }

        public Criteria andUpbuildingareaBetween(Object value1, Object value2) {
            addCriterion("UPBUILDINGAREA between", value1, value2, "upbuildingarea");
            return (Criteria) this;
        }

        public Criteria andUpbuildingareaNotBetween(Object value1, Object value2) {
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

        public Criteria andDownbuildingareaEqualTo(Object value) {
            addCriterion("DOWNBUILDINGAREA =", value, "downbuildingarea");
            return (Criteria) this;
        }

        public Criteria andDownbuildingareaNotEqualTo(Object value) {
            addCriterion("DOWNBUILDINGAREA <>", value, "downbuildingarea");
            return (Criteria) this;
        }

        public Criteria andDownbuildingareaGreaterThan(Object value) {
            addCriterion("DOWNBUILDINGAREA >", value, "downbuildingarea");
            return (Criteria) this;
        }

        public Criteria andDownbuildingareaGreaterThanOrEqualTo(Object value) {
            addCriterion("DOWNBUILDINGAREA >=", value, "downbuildingarea");
            return (Criteria) this;
        }

        public Criteria andDownbuildingareaLessThan(Object value) {
            addCriterion("DOWNBUILDINGAREA <", value, "downbuildingarea");
            return (Criteria) this;
        }

        public Criteria andDownbuildingareaLessThanOrEqualTo(Object value) {
            addCriterion("DOWNBUILDINGAREA <=", value, "downbuildingarea");
            return (Criteria) this;
        }

        public Criteria andDownbuildingareaIn(List<Object> values) {
            addCriterion("DOWNBUILDINGAREA in", values, "downbuildingarea");
            return (Criteria) this;
        }

        public Criteria andDownbuildingareaNotIn(List<Object> values) {
            addCriterion("DOWNBUILDINGAREA not in", values, "downbuildingarea");
            return (Criteria) this;
        }

        public Criteria andDownbuildingareaBetween(Object value1, Object value2) {
            addCriterion("DOWNBUILDINGAREA between", value1, value2, "downbuildingarea");
            return (Criteria) this;
        }

        public Criteria andDownbuildingareaNotBetween(Object value1, Object value2) {
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

        public Criteria andDowngarageareaEqualTo(Object value) {
            addCriterion("DOWNGARAGEAREA =", value, "downgaragearea");
            return (Criteria) this;
        }

        public Criteria andDowngarageareaNotEqualTo(Object value) {
            addCriterion("DOWNGARAGEAREA <>", value, "downgaragearea");
            return (Criteria) this;
        }

        public Criteria andDowngarageareaGreaterThan(Object value) {
            addCriterion("DOWNGARAGEAREA >", value, "downgaragearea");
            return (Criteria) this;
        }

        public Criteria andDowngarageareaGreaterThanOrEqualTo(Object value) {
            addCriterion("DOWNGARAGEAREA >=", value, "downgaragearea");
            return (Criteria) this;
        }

        public Criteria andDowngarageareaLessThan(Object value) {
            addCriterion("DOWNGARAGEAREA <", value, "downgaragearea");
            return (Criteria) this;
        }

        public Criteria andDowngarageareaLessThanOrEqualTo(Object value) {
            addCriterion("DOWNGARAGEAREA <=", value, "downgaragearea");
            return (Criteria) this;
        }

        public Criteria andDowngarageareaIn(List<Object> values) {
            addCriterion("DOWNGARAGEAREA in", values, "downgaragearea");
            return (Criteria) this;
        }

        public Criteria andDowngarageareaNotIn(List<Object> values) {
            addCriterion("DOWNGARAGEAREA not in", values, "downgaragearea");
            return (Criteria) this;
        }

        public Criteria andDowngarageareaBetween(Object value1, Object value2) {
            addCriterion("DOWNGARAGEAREA between", value1, value2, "downgaragearea");
            return (Criteria) this;
        }

        public Criteria andDowngarageareaNotBetween(Object value1, Object value2) {
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

        public Criteria andStiltfloorareaEqualTo(Object value) {
            addCriterion("STILTFLOORAREA =", value, "stiltfloorarea");
            return (Criteria) this;
        }

        public Criteria andStiltfloorareaNotEqualTo(Object value) {
            addCriterion("STILTFLOORAREA <>", value, "stiltfloorarea");
            return (Criteria) this;
        }

        public Criteria andStiltfloorareaGreaterThan(Object value) {
            addCriterion("STILTFLOORAREA >", value, "stiltfloorarea");
            return (Criteria) this;
        }

        public Criteria andStiltfloorareaGreaterThanOrEqualTo(Object value) {
            addCriterion("STILTFLOORAREA >=", value, "stiltfloorarea");
            return (Criteria) this;
        }

        public Criteria andStiltfloorareaLessThan(Object value) {
            addCriterion("STILTFLOORAREA <", value, "stiltfloorarea");
            return (Criteria) this;
        }

        public Criteria andStiltfloorareaLessThanOrEqualTo(Object value) {
            addCriterion("STILTFLOORAREA <=", value, "stiltfloorarea");
            return (Criteria) this;
        }

        public Criteria andStiltfloorareaIn(List<Object> values) {
            addCriterion("STILTFLOORAREA in", values, "stiltfloorarea");
            return (Criteria) this;
        }

        public Criteria andStiltfloorareaNotIn(List<Object> values) {
            addCriterion("STILTFLOORAREA not in", values, "stiltfloorarea");
            return (Criteria) this;
        }

        public Criteria andStiltfloorareaBetween(Object value1, Object value2) {
            addCriterion("STILTFLOORAREA between", value1, value2, "stiltfloorarea");
            return (Criteria) this;
        }

        public Criteria andStiltfloorareaNotBetween(Object value1, Object value2) {
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

        public Criteria andTowerdownareaEqualTo(Object value) {
            addCriterion("TOWERDOWNAREA =", value, "towerdownarea");
            return (Criteria) this;
        }

        public Criteria andTowerdownareaNotEqualTo(Object value) {
            addCriterion("TOWERDOWNAREA <>", value, "towerdownarea");
            return (Criteria) this;
        }

        public Criteria andTowerdownareaGreaterThan(Object value) {
            addCriterion("TOWERDOWNAREA >", value, "towerdownarea");
            return (Criteria) this;
        }

        public Criteria andTowerdownareaGreaterThanOrEqualTo(Object value) {
            addCriterion("TOWERDOWNAREA >=", value, "towerdownarea");
            return (Criteria) this;
        }

        public Criteria andTowerdownareaLessThan(Object value) {
            addCriterion("TOWERDOWNAREA <", value, "towerdownarea");
            return (Criteria) this;
        }

        public Criteria andTowerdownareaLessThanOrEqualTo(Object value) {
            addCriterion("TOWERDOWNAREA <=", value, "towerdownarea");
            return (Criteria) this;
        }

        public Criteria andTowerdownareaIn(List<Object> values) {
            addCriterion("TOWERDOWNAREA in", values, "towerdownarea");
            return (Criteria) this;
        }

        public Criteria andTowerdownareaNotIn(List<Object> values) {
            addCriterion("TOWERDOWNAREA not in", values, "towerdownarea");
            return (Criteria) this;
        }

        public Criteria andTowerdownareaBetween(Object value1, Object value2) {
            addCriterion("TOWERDOWNAREA between", value1, value2, "towerdownarea");
            return (Criteria) this;
        }

        public Criteria andTowerdownareaNotBetween(Object value1, Object value2) {
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

        public Criteria andStoreroomnumEqualTo(Object value) {
            addCriterion("STOREROOMNUM =", value, "storeroomnum");
            return (Criteria) this;
        }

        public Criteria andStoreroomnumNotEqualTo(Object value) {
            addCriterion("STOREROOMNUM <>", value, "storeroomnum");
            return (Criteria) this;
        }

        public Criteria andStoreroomnumGreaterThan(Object value) {
            addCriterion("STOREROOMNUM >", value, "storeroomnum");
            return (Criteria) this;
        }

        public Criteria andStoreroomnumGreaterThanOrEqualTo(Object value) {
            addCriterion("STOREROOMNUM >=", value, "storeroomnum");
            return (Criteria) this;
        }

        public Criteria andStoreroomnumLessThan(Object value) {
            addCriterion("STOREROOMNUM <", value, "storeroomnum");
            return (Criteria) this;
        }

        public Criteria andStoreroomnumLessThanOrEqualTo(Object value) {
            addCriterion("STOREROOMNUM <=", value, "storeroomnum");
            return (Criteria) this;
        }

        public Criteria andStoreroomnumIn(List<Object> values) {
            addCriterion("STOREROOMNUM in", values, "storeroomnum");
            return (Criteria) this;
        }

        public Criteria andStoreroomnumNotIn(List<Object> values) {
            addCriterion("STOREROOMNUM not in", values, "storeroomnum");
            return (Criteria) this;
        }

        public Criteria andStoreroomnumBetween(Object value1, Object value2) {
            addCriterion("STOREROOMNUM between", value1, value2, "storeroomnum");
            return (Criteria) this;
        }

        public Criteria andStoreroomnumNotBetween(Object value1, Object value2) {
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

        public Criteria andStoreroomareaEqualTo(Object value) {
            addCriterion("STOREROOMAREA =", value, "storeroomarea");
            return (Criteria) this;
        }

        public Criteria andStoreroomareaNotEqualTo(Object value) {
            addCriterion("STOREROOMAREA <>", value, "storeroomarea");
            return (Criteria) this;
        }

        public Criteria andStoreroomareaGreaterThan(Object value) {
            addCriterion("STOREROOMAREA >", value, "storeroomarea");
            return (Criteria) this;
        }

        public Criteria andStoreroomareaGreaterThanOrEqualTo(Object value) {
            addCriterion("STOREROOMAREA >=", value, "storeroomarea");
            return (Criteria) this;
        }

        public Criteria andStoreroomareaLessThan(Object value) {
            addCriterion("STOREROOMAREA <", value, "storeroomarea");
            return (Criteria) this;
        }

        public Criteria andStoreroomareaLessThanOrEqualTo(Object value) {
            addCriterion("STOREROOMAREA <=", value, "storeroomarea");
            return (Criteria) this;
        }

        public Criteria andStoreroomareaIn(List<Object> values) {
            addCriterion("STOREROOMAREA in", values, "storeroomarea");
            return (Criteria) this;
        }

        public Criteria andStoreroomareaNotIn(List<Object> values) {
            addCriterion("STOREROOMAREA not in", values, "storeroomarea");
            return (Criteria) this;
        }

        public Criteria andStoreroomareaBetween(Object value1, Object value2) {
            addCriterion("STOREROOMAREA between", value1, value2, "storeroomarea");
            return (Criteria) this;
        }

        public Criteria andStoreroomareaNotBetween(Object value1, Object value2) {
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

        public Criteria andTotalsellareaEqualTo(Object value) {
            addCriterion("TOTALSELLAREA =", value, "totalsellarea");
            return (Criteria) this;
        }

        public Criteria andTotalsellareaNotEqualTo(Object value) {
            addCriterion("TOTALSELLAREA <>", value, "totalsellarea");
            return (Criteria) this;
        }

        public Criteria andTotalsellareaGreaterThan(Object value) {
            addCriterion("TOTALSELLAREA >", value, "totalsellarea");
            return (Criteria) this;
        }

        public Criteria andTotalsellareaGreaterThanOrEqualTo(Object value) {
            addCriterion("TOTALSELLAREA >=", value, "totalsellarea");
            return (Criteria) this;
        }

        public Criteria andTotalsellareaLessThan(Object value) {
            addCriterion("TOTALSELLAREA <", value, "totalsellarea");
            return (Criteria) this;
        }

        public Criteria andTotalsellareaLessThanOrEqualTo(Object value) {
            addCriterion("TOTALSELLAREA <=", value, "totalsellarea");
            return (Criteria) this;
        }

        public Criteria andTotalsellareaIn(List<Object> values) {
            addCriterion("TOTALSELLAREA in", values, "totalsellarea");
            return (Criteria) this;
        }

        public Criteria andTotalsellareaNotIn(List<Object> values) {
            addCriterion("TOTALSELLAREA not in", values, "totalsellarea");
            return (Criteria) this;
        }

        public Criteria andTotalsellareaBetween(Object value1, Object value2) {
            addCriterion("TOTALSELLAREA between", value1, value2, "totalsellarea");
            return (Criteria) this;
        }

        public Criteria andTotalsellareaNotBetween(Object value1, Object value2) {
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

        public Criteria andUpselfsellareaEqualTo(Object value) {
            addCriterion("UPSELFSELLAREA =", value, "upselfsellarea");
            return (Criteria) this;
        }

        public Criteria andUpselfsellareaNotEqualTo(Object value) {
            addCriterion("UPSELFSELLAREA <>", value, "upselfsellarea");
            return (Criteria) this;
        }

        public Criteria andUpselfsellareaGreaterThan(Object value) {
            addCriterion("UPSELFSELLAREA >", value, "upselfsellarea");
            return (Criteria) this;
        }

        public Criteria andUpselfsellareaGreaterThanOrEqualTo(Object value) {
            addCriterion("UPSELFSELLAREA >=", value, "upselfsellarea");
            return (Criteria) this;
        }

        public Criteria andUpselfsellareaLessThan(Object value) {
            addCriterion("UPSELFSELLAREA <", value, "upselfsellarea");
            return (Criteria) this;
        }

        public Criteria andUpselfsellareaLessThanOrEqualTo(Object value) {
            addCriterion("UPSELFSELLAREA <=", value, "upselfsellarea");
            return (Criteria) this;
        }

        public Criteria andUpselfsellareaIn(List<Object> values) {
            addCriterion("UPSELFSELLAREA in", values, "upselfsellarea");
            return (Criteria) this;
        }

        public Criteria andUpselfsellareaNotIn(List<Object> values) {
            addCriterion("UPSELFSELLAREA not in", values, "upselfsellarea");
            return (Criteria) this;
        }

        public Criteria andUpselfsellareaBetween(Object value1, Object value2) {
            addCriterion("UPSELFSELLAREA between", value1, value2, "upselfsellarea");
            return (Criteria) this;
        }

        public Criteria andUpselfsellareaNotBetween(Object value1, Object value2) {
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

        public Criteria andUpavailablesellareaEqualTo(Object value) {
            addCriterion("UPAVAILABLESELLAREA =", value, "upavailablesellarea");
            return (Criteria) this;
        }

        public Criteria andUpavailablesellareaNotEqualTo(Object value) {
            addCriterion("UPAVAILABLESELLAREA <>", value, "upavailablesellarea");
            return (Criteria) this;
        }

        public Criteria andUpavailablesellareaGreaterThan(Object value) {
            addCriterion("UPAVAILABLESELLAREA >", value, "upavailablesellarea");
            return (Criteria) this;
        }

        public Criteria andUpavailablesellareaGreaterThanOrEqualTo(Object value) {
            addCriterion("UPAVAILABLESELLAREA >=", value, "upavailablesellarea");
            return (Criteria) this;
        }

        public Criteria andUpavailablesellareaLessThan(Object value) {
            addCriterion("UPAVAILABLESELLAREA <", value, "upavailablesellarea");
            return (Criteria) this;
        }

        public Criteria andUpavailablesellareaLessThanOrEqualTo(Object value) {
            addCriterion("UPAVAILABLESELLAREA <=", value, "upavailablesellarea");
            return (Criteria) this;
        }

        public Criteria andUpavailablesellareaIn(List<Object> values) {
            addCriterion("UPAVAILABLESELLAREA in", values, "upavailablesellarea");
            return (Criteria) this;
        }

        public Criteria andUpavailablesellareaNotIn(List<Object> values) {
            addCriterion("UPAVAILABLESELLAREA not in", values, "upavailablesellarea");
            return (Criteria) this;
        }

        public Criteria andUpavailablesellareaBetween(Object value1, Object value2) {
            addCriterion("UPAVAILABLESELLAREA between", value1, value2, "upavailablesellarea");
            return (Criteria) this;
        }

        public Criteria andUpavailablesellareaNotBetween(Object value1, Object value2) {
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

        public Criteria andUpgovernmentareaEqualTo(Object value) {
            addCriterion("UPGOVERNMENTAREA =", value, "upgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andUpgovernmentareaNotEqualTo(Object value) {
            addCriterion("UPGOVERNMENTAREA <>", value, "upgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andUpgovernmentareaGreaterThan(Object value) {
            addCriterion("UPGOVERNMENTAREA >", value, "upgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andUpgovernmentareaGreaterThanOrEqualTo(Object value) {
            addCriterion("UPGOVERNMENTAREA >=", value, "upgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andUpgovernmentareaLessThan(Object value) {
            addCriterion("UPGOVERNMENTAREA <", value, "upgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andUpgovernmentareaLessThanOrEqualTo(Object value) {
            addCriterion("UPGOVERNMENTAREA <=", value, "upgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andUpgovernmentareaIn(List<Object> values) {
            addCriterion("UPGOVERNMENTAREA in", values, "upgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andUpgovernmentareaNotIn(List<Object> values) {
            addCriterion("UPGOVERNMENTAREA not in", values, "upgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andUpgovernmentareaBetween(Object value1, Object value2) {
            addCriterion("UPGOVERNMENTAREA between", value1, value2, "upgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andUpgovernmentareaNotBetween(Object value1, Object value2) {
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

        public Criteria andDownselfsellareaEqualTo(Object value) {
            addCriterion("DOWNSELFSELLAREA =", value, "downselfsellarea");
            return (Criteria) this;
        }

        public Criteria andDownselfsellareaNotEqualTo(Object value) {
            addCriterion("DOWNSELFSELLAREA <>", value, "downselfsellarea");
            return (Criteria) this;
        }

        public Criteria andDownselfsellareaGreaterThan(Object value) {
            addCriterion("DOWNSELFSELLAREA >", value, "downselfsellarea");
            return (Criteria) this;
        }

        public Criteria andDownselfsellareaGreaterThanOrEqualTo(Object value) {
            addCriterion("DOWNSELFSELLAREA >=", value, "downselfsellarea");
            return (Criteria) this;
        }

        public Criteria andDownselfsellareaLessThan(Object value) {
            addCriterion("DOWNSELFSELLAREA <", value, "downselfsellarea");
            return (Criteria) this;
        }

        public Criteria andDownselfsellareaLessThanOrEqualTo(Object value) {
            addCriterion("DOWNSELFSELLAREA <=", value, "downselfsellarea");
            return (Criteria) this;
        }

        public Criteria andDownselfsellareaIn(List<Object> values) {
            addCriterion("DOWNSELFSELLAREA in", values, "downselfsellarea");
            return (Criteria) this;
        }

        public Criteria andDownselfsellareaNotIn(List<Object> values) {
            addCriterion("DOWNSELFSELLAREA not in", values, "downselfsellarea");
            return (Criteria) this;
        }

        public Criteria andDownselfsellareaBetween(Object value1, Object value2) {
            addCriterion("DOWNSELFSELLAREA between", value1, value2, "downselfsellarea");
            return (Criteria) this;
        }

        public Criteria andDownselfsellareaNotBetween(Object value1, Object value2) {
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

        public Criteria andDownothersellareaEqualTo(Object value) {
            addCriterion("DOWNOTHERSELLAREA =", value, "downothersellarea");
            return (Criteria) this;
        }

        public Criteria andDownothersellareaNotEqualTo(Object value) {
            addCriterion("DOWNOTHERSELLAREA <>", value, "downothersellarea");
            return (Criteria) this;
        }

        public Criteria andDownothersellareaGreaterThan(Object value) {
            addCriterion("DOWNOTHERSELLAREA >", value, "downothersellarea");
            return (Criteria) this;
        }

        public Criteria andDownothersellareaGreaterThanOrEqualTo(Object value) {
            addCriterion("DOWNOTHERSELLAREA >=", value, "downothersellarea");
            return (Criteria) this;
        }

        public Criteria andDownothersellareaLessThan(Object value) {
            addCriterion("DOWNOTHERSELLAREA <", value, "downothersellarea");
            return (Criteria) this;
        }

        public Criteria andDownothersellareaLessThanOrEqualTo(Object value) {
            addCriterion("DOWNOTHERSELLAREA <=", value, "downothersellarea");
            return (Criteria) this;
        }

        public Criteria andDownothersellareaIn(List<Object> values) {
            addCriterion("DOWNOTHERSELLAREA in", values, "downothersellarea");
            return (Criteria) this;
        }

        public Criteria andDownothersellareaNotIn(List<Object> values) {
            addCriterion("DOWNOTHERSELLAREA not in", values, "downothersellarea");
            return (Criteria) this;
        }

        public Criteria andDownothersellareaBetween(Object value1, Object value2) {
            addCriterion("DOWNOTHERSELLAREA between", value1, value2, "downothersellarea");
            return (Criteria) this;
        }

        public Criteria andDownothersellareaNotBetween(Object value1, Object value2) {
            addCriterion("DOWNOTHERSELLAREA not between", value1, value2, "downothersellarea");
            return (Criteria) this;
        }

        public Criteria andDowngovernmentareaIsNull() {
            addCriterion("DOWNGOVERNMENTAREA is null");
            return (Criteria) this;
        }

        public Criteria andDowngovernmentareaIsNotNull() {
            addCriterion("DOWNGOVERNMENTAREA is not null");
            return (Criteria) this;
        }

        public Criteria andDowngovernmentareaEqualTo(Object value) {
            addCriterion("DOWNGOVERNMENTAREA =", value, "downgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andDowngovernmentareaNotEqualTo(Object value) {
            addCriterion("DOWNGOVERNMENTAREA <>", value, "downgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andDowngovernmentareaGreaterThan(Object value) {
            addCriterion("DOWNGOVERNMENTAREA >", value, "downgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andDowngovernmentareaGreaterThanOrEqualTo(Object value) {
            addCriterion("DOWNGOVERNMENTAREA >=", value, "downgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andDowngovernmentareaLessThan(Object value) {
            addCriterion("DOWNGOVERNMENTAREA <", value, "downgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andDowngovernmentareaLessThanOrEqualTo(Object value) {
            addCriterion("DOWNGOVERNMENTAREA <=", value, "downgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andDowngovernmentareaIn(List<Object> values) {
            addCriterion("DOWNGOVERNMENTAREA in", values, "downgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andDowngovernmentareaNotIn(List<Object> values) {
            addCriterion("DOWNGOVERNMENTAREA not in", values, "downgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andDowngovernmentareaBetween(Object value1, Object value2) {
            addCriterion("DOWNGOVERNMENTAREA between", value1, value2, "downgovernmentarea");
            return (Criteria) this;
        }

        public Criteria andDowngovernmentareaNotBetween(Object value1, Object value2) {
            addCriterion("DOWNGOVERNMENTAREA not between", value1, value2, "downgovernmentarea");
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

        public Criteria andTotalpresentareaEqualTo(Object value) {
            addCriterion("TOTALPRESENTAREA =", value, "totalpresentarea");
            return (Criteria) this;
        }

        public Criteria andTotalpresentareaNotEqualTo(Object value) {
            addCriterion("TOTALPRESENTAREA <>", value, "totalpresentarea");
            return (Criteria) this;
        }

        public Criteria andTotalpresentareaGreaterThan(Object value) {
            addCriterion("TOTALPRESENTAREA >", value, "totalpresentarea");
            return (Criteria) this;
        }

        public Criteria andTotalpresentareaGreaterThanOrEqualTo(Object value) {
            addCriterion("TOTALPRESENTAREA >=", value, "totalpresentarea");
            return (Criteria) this;
        }

        public Criteria andTotalpresentareaLessThan(Object value) {
            addCriterion("TOTALPRESENTAREA <", value, "totalpresentarea");
            return (Criteria) this;
        }

        public Criteria andTotalpresentareaLessThanOrEqualTo(Object value) {
            addCriterion("TOTALPRESENTAREA <=", value, "totalpresentarea");
            return (Criteria) this;
        }

        public Criteria andTotalpresentareaIn(List<Object> values) {
            addCriterion("TOTALPRESENTAREA in", values, "totalpresentarea");
            return (Criteria) this;
        }

        public Criteria andTotalpresentareaNotIn(List<Object> values) {
            addCriterion("TOTALPRESENTAREA not in", values, "totalpresentarea");
            return (Criteria) this;
        }

        public Criteria andTotalpresentareaBetween(Object value1, Object value2) {
            addCriterion("TOTALPRESENTAREA between", value1, value2, "totalpresentarea");
            return (Criteria) this;
        }

        public Criteria andTotalpresentareaNotBetween(Object value1, Object value2) {
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

        public Criteria andUppresentareaEqualTo(Object value) {
            addCriterion("UPPRESENTAREA =", value, "uppresentarea");
            return (Criteria) this;
        }

        public Criteria andUppresentareaNotEqualTo(Object value) {
            addCriterion("UPPRESENTAREA <>", value, "uppresentarea");
            return (Criteria) this;
        }

        public Criteria andUppresentareaGreaterThan(Object value) {
            addCriterion("UPPRESENTAREA >", value, "uppresentarea");
            return (Criteria) this;
        }

        public Criteria andUppresentareaGreaterThanOrEqualTo(Object value) {
            addCriterion("UPPRESENTAREA >=", value, "uppresentarea");
            return (Criteria) this;
        }

        public Criteria andUppresentareaLessThan(Object value) {
            addCriterion("UPPRESENTAREA <", value, "uppresentarea");
            return (Criteria) this;
        }

        public Criteria andUppresentareaLessThanOrEqualTo(Object value) {
            addCriterion("UPPRESENTAREA <=", value, "uppresentarea");
            return (Criteria) this;
        }

        public Criteria andUppresentareaIn(List<Object> values) {
            addCriterion("UPPRESENTAREA in", values, "uppresentarea");
            return (Criteria) this;
        }

        public Criteria andUppresentareaNotIn(List<Object> values) {
            addCriterion("UPPRESENTAREA not in", values, "uppresentarea");
            return (Criteria) this;
        }

        public Criteria andUppresentareaBetween(Object value1, Object value2) {
            addCriterion("UPPRESENTAREA between", value1, value2, "uppresentarea");
            return (Criteria) this;
        }

        public Criteria andUppresentareaNotBetween(Object value1, Object value2) {
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

        public Criteria andDownpresentareaEqualTo(Object value) {
            addCriterion("DOWNPRESENTAREA =", value, "downpresentarea");
            return (Criteria) this;
        }

        public Criteria andDownpresentareaNotEqualTo(Object value) {
            addCriterion("DOWNPRESENTAREA <>", value, "downpresentarea");
            return (Criteria) this;
        }

        public Criteria andDownpresentareaGreaterThan(Object value) {
            addCriterion("DOWNPRESENTAREA >", value, "downpresentarea");
            return (Criteria) this;
        }

        public Criteria andDownpresentareaGreaterThanOrEqualTo(Object value) {
            addCriterion("DOWNPRESENTAREA >=", value, "downpresentarea");
            return (Criteria) this;
        }

        public Criteria andDownpresentareaLessThan(Object value) {
            addCriterion("DOWNPRESENTAREA <", value, "downpresentarea");
            return (Criteria) this;
        }

        public Criteria andDownpresentareaLessThanOrEqualTo(Object value) {
            addCriterion("DOWNPRESENTAREA <=", value, "downpresentarea");
            return (Criteria) this;
        }

        public Criteria andDownpresentareaIn(List<Object> values) {
            addCriterion("DOWNPRESENTAREA in", values, "downpresentarea");
            return (Criteria) this;
        }

        public Criteria andDownpresentareaNotIn(List<Object> values) {
            addCriterion("DOWNPRESENTAREA not in", values, "downpresentarea");
            return (Criteria) this;
        }

        public Criteria andDownpresentareaBetween(Object value1, Object value2) {
            addCriterion("DOWNPRESENTAREA between", value1, value2, "downpresentarea");
            return (Criteria) this;
        }

        public Criteria andDownpresentareaNotBetween(Object value1, Object value2) {
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

        public Criteria andAdditionalareaEqualTo(Object value) {
            addCriterion("ADDITIONALAREA =", value, "additionalarea");
            return (Criteria) this;
        }

        public Criteria andAdditionalareaNotEqualTo(Object value) {
            addCriterion("ADDITIONALAREA <>", value, "additionalarea");
            return (Criteria) this;
        }

        public Criteria andAdditionalareaGreaterThan(Object value) {
            addCriterion("ADDITIONALAREA >", value, "additionalarea");
            return (Criteria) this;
        }

        public Criteria andAdditionalareaGreaterThanOrEqualTo(Object value) {
            addCriterion("ADDITIONALAREA >=", value, "additionalarea");
            return (Criteria) this;
        }

        public Criteria andAdditionalareaLessThan(Object value) {
            addCriterion("ADDITIONALAREA <", value, "additionalarea");
            return (Criteria) this;
        }

        public Criteria andAdditionalareaLessThanOrEqualTo(Object value) {
            addCriterion("ADDITIONALAREA <=", value, "additionalarea");
            return (Criteria) this;
        }

        public Criteria andAdditionalareaIn(List<Object> values) {
            addCriterion("ADDITIONALAREA in", values, "additionalarea");
            return (Criteria) this;
        }

        public Criteria andAdditionalareaNotIn(List<Object> values) {
            addCriterion("ADDITIONALAREA not in", values, "additionalarea");
            return (Criteria) this;
        }

        public Criteria andAdditionalareaBetween(Object value1, Object value2) {
            addCriterion("ADDITIONALAREA between", value1, value2, "additionalarea");
            return (Criteria) this;
        }

        public Criteria andAdditionalareaNotBetween(Object value1, Object value2) {
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

        public Criteria andBuildingmaxheightEqualTo(Object value) {
            addCriterion("BUILDINGMAXHEIGHT =", value, "buildingmaxheight");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheightNotEqualTo(Object value) {
            addCriterion("BUILDINGMAXHEIGHT <>", value, "buildingmaxheight");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheightGreaterThan(Object value) {
            addCriterion("BUILDINGMAXHEIGHT >", value, "buildingmaxheight");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheightGreaterThanOrEqualTo(Object value) {
            addCriterion("BUILDINGMAXHEIGHT >=", value, "buildingmaxheight");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheightLessThan(Object value) {
            addCriterion("BUILDINGMAXHEIGHT <", value, "buildingmaxheight");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheightLessThanOrEqualTo(Object value) {
            addCriterion("BUILDINGMAXHEIGHT <=", value, "buildingmaxheight");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheightIn(List<Object> values) {
            addCriterion("BUILDINGMAXHEIGHT in", values, "buildingmaxheight");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheightNotIn(List<Object> values) {
            addCriterion("BUILDINGMAXHEIGHT not in", values, "buildingmaxheight");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheightBetween(Object value1, Object value2) {
            addCriterion("BUILDINGMAXHEIGHT between", value1, value2, "buildingmaxheight");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheightNotBetween(Object value1, Object value2) {
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

        public Criteria andPlanratioEqualTo(Object value) {
            addCriterion("PLANRATIO =", value, "planratio");
            return (Criteria) this;
        }

        public Criteria andPlanratioNotEqualTo(Object value) {
            addCriterion("PLANRATIO <>", value, "planratio");
            return (Criteria) this;
        }

        public Criteria andPlanratioGreaterThan(Object value) {
            addCriterion("PLANRATIO >", value, "planratio");
            return (Criteria) this;
        }

        public Criteria andPlanratioGreaterThanOrEqualTo(Object value) {
            addCriterion("PLANRATIO >=", value, "planratio");
            return (Criteria) this;
        }

        public Criteria andPlanratioLessThan(Object value) {
            addCriterion("PLANRATIO <", value, "planratio");
            return (Criteria) this;
        }

        public Criteria andPlanratioLessThanOrEqualTo(Object value) {
            addCriterion("PLANRATIO <=", value, "planratio");
            return (Criteria) this;
        }

        public Criteria andPlanratioIn(List<Object> values) {
            addCriterion("PLANRATIO in", values, "planratio");
            return (Criteria) this;
        }

        public Criteria andPlanratioNotIn(List<Object> values) {
            addCriterion("PLANRATIO not in", values, "planratio");
            return (Criteria) this;
        }

        public Criteria andPlanratioBetween(Object value1, Object value2) {
            addCriterion("PLANRATIO between", value1, value2, "planratio");
            return (Criteria) this;
        }

        public Criteria andPlanratioNotBetween(Object value1, Object value2) {
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

        public Criteria andPlandensityEqualTo(Object value) {
            addCriterion("PLANDENSITY =", value, "plandensity");
            return (Criteria) this;
        }

        public Criteria andPlandensityNotEqualTo(Object value) {
            addCriterion("PLANDENSITY <>", value, "plandensity");
            return (Criteria) this;
        }

        public Criteria andPlandensityGreaterThan(Object value) {
            addCriterion("PLANDENSITY >", value, "plandensity");
            return (Criteria) this;
        }

        public Criteria andPlandensityGreaterThanOrEqualTo(Object value) {
            addCriterion("PLANDENSITY >=", value, "plandensity");
            return (Criteria) this;
        }

        public Criteria andPlandensityLessThan(Object value) {
            addCriterion("PLANDENSITY <", value, "plandensity");
            return (Criteria) this;
        }

        public Criteria andPlandensityLessThanOrEqualTo(Object value) {
            addCriterion("PLANDENSITY <=", value, "plandensity");
            return (Criteria) this;
        }

        public Criteria andPlandensityIn(List<Object> values) {
            addCriterion("PLANDENSITY in", values, "plandensity");
            return (Criteria) this;
        }

        public Criteria andPlandensityNotIn(List<Object> values) {
            addCriterion("PLANDENSITY not in", values, "plandensity");
            return (Criteria) this;
        }

        public Criteria andPlandensityBetween(Object value1, Object value2) {
            addCriterion("PLANDENSITY between", value1, value2, "plandensity");
            return (Criteria) this;
        }

        public Criteria andPlandensityNotBetween(Object value1, Object value2) {
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

        public Criteria andBuildingminheightEqualTo(Object value) {
            addCriterion("BUILDINGMINHEIGHT =", value, "buildingminheight");
            return (Criteria) this;
        }

        public Criteria andBuildingminheightNotEqualTo(Object value) {
            addCriterion("BUILDINGMINHEIGHT <>", value, "buildingminheight");
            return (Criteria) this;
        }

        public Criteria andBuildingminheightGreaterThan(Object value) {
            addCriterion("BUILDINGMINHEIGHT >", value, "buildingminheight");
            return (Criteria) this;
        }

        public Criteria andBuildingminheightGreaterThanOrEqualTo(Object value) {
            addCriterion("BUILDINGMINHEIGHT >=", value, "buildingminheight");
            return (Criteria) this;
        }

        public Criteria andBuildingminheightLessThan(Object value) {
            addCriterion("BUILDINGMINHEIGHT <", value, "buildingminheight");
            return (Criteria) this;
        }

        public Criteria andBuildingminheightLessThanOrEqualTo(Object value) {
            addCriterion("BUILDINGMINHEIGHT <=", value, "buildingminheight");
            return (Criteria) this;
        }

        public Criteria andBuildingminheightIn(List<Object> values) {
            addCriterion("BUILDINGMINHEIGHT in", values, "buildingminheight");
            return (Criteria) this;
        }

        public Criteria andBuildingminheightNotIn(List<Object> values) {
            addCriterion("BUILDINGMINHEIGHT not in", values, "buildingminheight");
            return (Criteria) this;
        }

        public Criteria andBuildingminheightBetween(Object value1, Object value2) {
            addCriterion("BUILDINGMINHEIGHT between", value1, value2, "buildingminheight");
            return (Criteria) this;
        }

        public Criteria andBuildingminheightNotBetween(Object value1, Object value2) {
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

        public Criteria andRealratioEqualTo(Object value) {
            addCriterion("REALRATIO =", value, "realratio");
            return (Criteria) this;
        }

        public Criteria andRealratioNotEqualTo(Object value) {
            addCriterion("REALRATIO <>", value, "realratio");
            return (Criteria) this;
        }

        public Criteria andRealratioGreaterThan(Object value) {
            addCriterion("REALRATIO >", value, "realratio");
            return (Criteria) this;
        }

        public Criteria andRealratioGreaterThanOrEqualTo(Object value) {
            addCriterion("REALRATIO >=", value, "realratio");
            return (Criteria) this;
        }

        public Criteria andRealratioLessThan(Object value) {
            addCriterion("REALRATIO <", value, "realratio");
            return (Criteria) this;
        }

        public Criteria andRealratioLessThanOrEqualTo(Object value) {
            addCriterion("REALRATIO <=", value, "realratio");
            return (Criteria) this;
        }

        public Criteria andRealratioIn(List<Object> values) {
            addCriterion("REALRATIO in", values, "realratio");
            return (Criteria) this;
        }

        public Criteria andRealratioNotIn(List<Object> values) {
            addCriterion("REALRATIO not in", values, "realratio");
            return (Criteria) this;
        }

        public Criteria andRealratioBetween(Object value1, Object value2) {
            addCriterion("REALRATIO between", value1, value2, "realratio");
            return (Criteria) this;
        }

        public Criteria andRealratioNotBetween(Object value1, Object value2) {
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

        public Criteria andRealdensityEqualTo(Object value) {
            addCriterion("REALDENSITY =", value, "realdensity");
            return (Criteria) this;
        }

        public Criteria andRealdensityNotEqualTo(Object value) {
            addCriterion("REALDENSITY <>", value, "realdensity");
            return (Criteria) this;
        }

        public Criteria andRealdensityGreaterThan(Object value) {
            addCriterion("REALDENSITY >", value, "realdensity");
            return (Criteria) this;
        }

        public Criteria andRealdensityGreaterThanOrEqualTo(Object value) {
            addCriterion("REALDENSITY >=", value, "realdensity");
            return (Criteria) this;
        }

        public Criteria andRealdensityLessThan(Object value) {
            addCriterion("REALDENSITY <", value, "realdensity");
            return (Criteria) this;
        }

        public Criteria andRealdensityLessThanOrEqualTo(Object value) {
            addCriterion("REALDENSITY <=", value, "realdensity");
            return (Criteria) this;
        }

        public Criteria andRealdensityIn(List<Object> values) {
            addCriterion("REALDENSITY in", values, "realdensity");
            return (Criteria) this;
        }

        public Criteria andRealdensityNotIn(List<Object> values) {
            addCriterion("REALDENSITY not in", values, "realdensity");
            return (Criteria) this;
        }

        public Criteria andRealdensityBetween(Object value1, Object value2) {
            addCriterion("REALDENSITY between", value1, value2, "realdensity");
            return (Criteria) this;
        }

        public Criteria andRealdensityNotBetween(Object value1, Object value2) {
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

        public Criteria andAvailablethanEqualTo(Object value) {
            addCriterion("AVAILABLETHAN =", value, "availablethan");
            return (Criteria) this;
        }

        public Criteria andAvailablethanNotEqualTo(Object value) {
            addCriterion("AVAILABLETHAN <>", value, "availablethan");
            return (Criteria) this;
        }

        public Criteria andAvailablethanGreaterThan(Object value) {
            addCriterion("AVAILABLETHAN >", value, "availablethan");
            return (Criteria) this;
        }

        public Criteria andAvailablethanGreaterThanOrEqualTo(Object value) {
            addCriterion("AVAILABLETHAN >=", value, "availablethan");
            return (Criteria) this;
        }

        public Criteria andAvailablethanLessThan(Object value) {
            addCriterion("AVAILABLETHAN <", value, "availablethan");
            return (Criteria) this;
        }

        public Criteria andAvailablethanLessThanOrEqualTo(Object value) {
            addCriterion("AVAILABLETHAN <=", value, "availablethan");
            return (Criteria) this;
        }

        public Criteria andAvailablethanIn(List<Object> values) {
            addCriterion("AVAILABLETHAN in", values, "availablethan");
            return (Criteria) this;
        }

        public Criteria andAvailablethanNotIn(List<Object> values) {
            addCriterion("AVAILABLETHAN not in", values, "availablethan");
            return (Criteria) this;
        }

        public Criteria andAvailablethanBetween(Object value1, Object value2) {
            addCriterion("AVAILABLETHAN between", value1, value2, "availablethan");
            return (Criteria) this;
        }

        public Criteria andAvailablethanNotBetween(Object value1, Object value2) {
            addCriterion("AVAILABLETHAN not between", value1, value2, "availablethan");
            return (Criteria) this;
        }

        public Criteria andPlotratioIsNull() {
            addCriterion("PLOTRATIO is null");
            return (Criteria) this;
        }

        public Criteria andPlotratioIsNotNull() {
            addCriterion("PLOTRATIO is not null");
            return (Criteria) this;
        }

        public Criteria andPlotratioEqualTo(Object value) {
            addCriterion("PLOTRATIO =", value, "plotratio");
            return (Criteria) this;
        }

        public Criteria andPlotratioNotEqualTo(Object value) {
            addCriterion("PLOTRATIO <>", value, "plotratio");
            return (Criteria) this;
        }

        public Criteria andPlotratioGreaterThan(Object value) {
            addCriterion("PLOTRATIO >", value, "plotratio");
            return (Criteria) this;
        }

        public Criteria andPlotratioGreaterThanOrEqualTo(Object value) {
            addCriterion("PLOTRATIO >=", value, "plotratio");
            return (Criteria) this;
        }

        public Criteria andPlotratioLessThan(Object value) {
            addCriterion("PLOTRATIO <", value, "plotratio");
            return (Criteria) this;
        }

        public Criteria andPlotratioLessThanOrEqualTo(Object value) {
            addCriterion("PLOTRATIO <=", value, "plotratio");
            return (Criteria) this;
        }

        public Criteria andPlotratioIn(List<Object> values) {
            addCriterion("PLOTRATIO in", values, "plotratio");
            return (Criteria) this;
        }

        public Criteria andPlotratioNotIn(List<Object> values) {
            addCriterion("PLOTRATIO not in", values, "plotratio");
            return (Criteria) this;
        }

        public Criteria andPlotratioBetween(Object value1, Object value2) {
            addCriterion("PLOTRATIO between", value1, value2, "plotratio");
            return (Criteria) this;
        }

        public Criteria andPlotratioNotBetween(Object value1, Object value2) {
            addCriterion("PLOTRATIO not between", value1, value2, "plotratio");
            return (Criteria) this;
        }

        public Criteria andBuildingdensityIsNull() {
            addCriterion("BUILDINGDENSITY is null");
            return (Criteria) this;
        }

        public Criteria andBuildingdensityIsNotNull() {
            addCriterion("BUILDINGDENSITY is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingdensityEqualTo(Object value) {
            addCriterion("BUILDINGDENSITY =", value, "buildingdensity");
            return (Criteria) this;
        }

        public Criteria andBuildingdensityNotEqualTo(Object value) {
            addCriterion("BUILDINGDENSITY <>", value, "buildingdensity");
            return (Criteria) this;
        }

        public Criteria andBuildingdensityGreaterThan(Object value) {
            addCriterion("BUILDINGDENSITY >", value, "buildingdensity");
            return (Criteria) this;
        }

        public Criteria andBuildingdensityGreaterThanOrEqualTo(Object value) {
            addCriterion("BUILDINGDENSITY >=", value, "buildingdensity");
            return (Criteria) this;
        }

        public Criteria andBuildingdensityLessThan(Object value) {
            addCriterion("BUILDINGDENSITY <", value, "buildingdensity");
            return (Criteria) this;
        }

        public Criteria andBuildingdensityLessThanOrEqualTo(Object value) {
            addCriterion("BUILDINGDENSITY <=", value, "buildingdensity");
            return (Criteria) this;
        }

        public Criteria andBuildingdensityIn(List<Object> values) {
            addCriterion("BUILDINGDENSITY in", values, "buildingdensity");
            return (Criteria) this;
        }

        public Criteria andBuildingdensityNotIn(List<Object> values) {
            addCriterion("BUILDINGDENSITY not in", values, "buildingdensity");
            return (Criteria) this;
        }

        public Criteria andBuildingdensityBetween(Object value1, Object value2) {
            addCriterion("BUILDINGDENSITY between", value1, value2, "buildingdensity");
            return (Criteria) this;
        }

        public Criteria andBuildingdensityNotBetween(Object value1, Object value2) {
            addCriterion("BUILDINGDENSITY not between", value1, value2, "buildingdensity");
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

        public Criteria andTotalstallnumEqualTo(Object value) {
            addCriterion("TOTALSTALLNUM =", value, "totalstallnum");
            return (Criteria) this;
        }

        public Criteria andTotalstallnumNotEqualTo(Object value) {
            addCriterion("TOTALSTALLNUM <>", value, "totalstallnum");
            return (Criteria) this;
        }

        public Criteria andTotalstallnumGreaterThan(Object value) {
            addCriterion("TOTALSTALLNUM >", value, "totalstallnum");
            return (Criteria) this;
        }

        public Criteria andTotalstallnumGreaterThanOrEqualTo(Object value) {
            addCriterion("TOTALSTALLNUM >=", value, "totalstallnum");
            return (Criteria) this;
        }

        public Criteria andTotalstallnumLessThan(Object value) {
            addCriterion("TOTALSTALLNUM <", value, "totalstallnum");
            return (Criteria) this;
        }

        public Criteria andTotalstallnumLessThanOrEqualTo(Object value) {
            addCriterion("TOTALSTALLNUM <=", value, "totalstallnum");
            return (Criteria) this;
        }

        public Criteria andTotalstallnumIn(List<Object> values) {
            addCriterion("TOTALSTALLNUM in", values, "totalstallnum");
            return (Criteria) this;
        }

        public Criteria andTotalstallnumNotIn(List<Object> values) {
            addCriterion("TOTALSTALLNUM not in", values, "totalstallnum");
            return (Criteria) this;
        }

        public Criteria andTotalstallnumBetween(Object value1, Object value2) {
            addCriterion("TOTALSTALLNUM between", value1, value2, "totalstallnum");
            return (Criteria) this;
        }

        public Criteria andTotalstallnumNotBetween(Object value1, Object value2) {
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

        public Criteria andUpstallnumEqualTo(Object value) {
            addCriterion("UPSTALLNUM =", value, "upstallnum");
            return (Criteria) this;
        }

        public Criteria andUpstallnumNotEqualTo(Object value) {
            addCriterion("UPSTALLNUM <>", value, "upstallnum");
            return (Criteria) this;
        }

        public Criteria andUpstallnumGreaterThan(Object value) {
            addCriterion("UPSTALLNUM >", value, "upstallnum");
            return (Criteria) this;
        }

        public Criteria andUpstallnumGreaterThanOrEqualTo(Object value) {
            addCriterion("UPSTALLNUM >=", value, "upstallnum");
            return (Criteria) this;
        }

        public Criteria andUpstallnumLessThan(Object value) {
            addCriterion("UPSTALLNUM <", value, "upstallnum");
            return (Criteria) this;
        }

        public Criteria andUpstallnumLessThanOrEqualTo(Object value) {
            addCriterion("UPSTALLNUM <=", value, "upstallnum");
            return (Criteria) this;
        }

        public Criteria andUpstallnumIn(List<Object> values) {
            addCriterion("UPSTALLNUM in", values, "upstallnum");
            return (Criteria) this;
        }

        public Criteria andUpstallnumNotIn(List<Object> values) {
            addCriterion("UPSTALLNUM not in", values, "upstallnum");
            return (Criteria) this;
        }

        public Criteria andUpstallnumBetween(Object value1, Object value2) {
            addCriterion("UPSTALLNUM between", value1, value2, "upstallnum");
            return (Criteria) this;
        }

        public Criteria andUpstallnumNotBetween(Object value1, Object value2) {
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

        public Criteria andUpgroundstallnumEqualTo(Object value) {
            addCriterion("UPGROUNDSTALLNUM =", value, "upgroundstallnum");
            return (Criteria) this;
        }

        public Criteria andUpgroundstallnumNotEqualTo(Object value) {
            addCriterion("UPGROUNDSTALLNUM <>", value, "upgroundstallnum");
            return (Criteria) this;
        }

        public Criteria andUpgroundstallnumGreaterThan(Object value) {
            addCriterion("UPGROUNDSTALLNUM >", value, "upgroundstallnum");
            return (Criteria) this;
        }

        public Criteria andUpgroundstallnumGreaterThanOrEqualTo(Object value) {
            addCriterion("UPGROUNDSTALLNUM >=", value, "upgroundstallnum");
            return (Criteria) this;
        }

        public Criteria andUpgroundstallnumLessThan(Object value) {
            addCriterion("UPGROUNDSTALLNUM <", value, "upgroundstallnum");
            return (Criteria) this;
        }

        public Criteria andUpgroundstallnumLessThanOrEqualTo(Object value) {
            addCriterion("UPGROUNDSTALLNUM <=", value, "upgroundstallnum");
            return (Criteria) this;
        }

        public Criteria andUpgroundstallnumIn(List<Object> values) {
            addCriterion("UPGROUNDSTALLNUM in", values, "upgroundstallnum");
            return (Criteria) this;
        }

        public Criteria andUpgroundstallnumNotIn(List<Object> values) {
            addCriterion("UPGROUNDSTALLNUM not in", values, "upgroundstallnum");
            return (Criteria) this;
        }

        public Criteria andUpgroundstallnumBetween(Object value1, Object value2) {
            addCriterion("UPGROUNDSTALLNUM between", value1, value2, "upgroundstallnum");
            return (Criteria) this;
        }

        public Criteria andUpgroundstallnumNotBetween(Object value1, Object value2) {
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

        public Criteria andSemiundergroundstallnumEqualTo(Object value) {
            addCriterion("SEMIUNDERGROUNDSTALLNUM =", value, "semiundergroundstallnum");
            return (Criteria) this;
        }

        public Criteria andSemiundergroundstallnumNotEqualTo(Object value) {
            addCriterion("SEMIUNDERGROUNDSTALLNUM <>", value, "semiundergroundstallnum");
            return (Criteria) this;
        }

        public Criteria andSemiundergroundstallnumGreaterThan(Object value) {
            addCriterion("SEMIUNDERGROUNDSTALLNUM >", value, "semiundergroundstallnum");
            return (Criteria) this;
        }

        public Criteria andSemiundergroundstallnumGreaterThanOrEqualTo(Object value) {
            addCriterion("SEMIUNDERGROUNDSTALLNUM >=", value, "semiundergroundstallnum");
            return (Criteria) this;
        }

        public Criteria andSemiundergroundstallnumLessThan(Object value) {
            addCriterion("SEMIUNDERGROUNDSTALLNUM <", value, "semiundergroundstallnum");
            return (Criteria) this;
        }

        public Criteria andSemiundergroundstallnumLessThanOrEqualTo(Object value) {
            addCriterion("SEMIUNDERGROUNDSTALLNUM <=", value, "semiundergroundstallnum");
            return (Criteria) this;
        }

        public Criteria andSemiundergroundstallnumIn(List<Object> values) {
            addCriterion("SEMIUNDERGROUNDSTALLNUM in", values, "semiundergroundstallnum");
            return (Criteria) this;
        }

        public Criteria andSemiundergroundstallnumNotIn(List<Object> values) {
            addCriterion("SEMIUNDERGROUNDSTALLNUM not in", values, "semiundergroundstallnum");
            return (Criteria) this;
        }

        public Criteria andSemiundergroundstallnumBetween(Object value1, Object value2) {
            addCriterion("SEMIUNDERGROUNDSTALLNUM between", value1, value2, "semiundergroundstallnum");
            return (Criteria) this;
        }

        public Criteria andSemiundergroundstallnumNotBetween(Object value1, Object value2) {
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

        public Criteria andStallnuminbuildingEqualTo(Object value) {
            addCriterion("STALLNUMINBUILDING =", value, "stallnuminbuilding");
            return (Criteria) this;
        }

        public Criteria andStallnuminbuildingNotEqualTo(Object value) {
            addCriterion("STALLNUMINBUILDING <>", value, "stallnuminbuilding");
            return (Criteria) this;
        }

        public Criteria andStallnuminbuildingGreaterThan(Object value) {
            addCriterion("STALLNUMINBUILDING >", value, "stallnuminbuilding");
            return (Criteria) this;
        }

        public Criteria andStallnuminbuildingGreaterThanOrEqualTo(Object value) {
            addCriterion("STALLNUMINBUILDING >=", value, "stallnuminbuilding");
            return (Criteria) this;
        }

        public Criteria andStallnuminbuildingLessThan(Object value) {
            addCriterion("STALLNUMINBUILDING <", value, "stallnuminbuilding");
            return (Criteria) this;
        }

        public Criteria andStallnuminbuildingLessThanOrEqualTo(Object value) {
            addCriterion("STALLNUMINBUILDING <=", value, "stallnuminbuilding");
            return (Criteria) this;
        }

        public Criteria andStallnuminbuildingIn(List<Object> values) {
            addCriterion("STALLNUMINBUILDING in", values, "stallnuminbuilding");
            return (Criteria) this;
        }

        public Criteria andStallnuminbuildingNotIn(List<Object> values) {
            addCriterion("STALLNUMINBUILDING not in", values, "stallnuminbuilding");
            return (Criteria) this;
        }

        public Criteria andStallnuminbuildingBetween(Object value1, Object value2) {
            addCriterion("STALLNUMINBUILDING between", value1, value2, "stallnuminbuilding");
            return (Criteria) this;
        }

        public Criteria andStallnuminbuildingNotBetween(Object value1, Object value2) {
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

        public Criteria andDownautostallnumEqualTo(Object value) {
            addCriterion("DOWNAUTOSTALLNUM =", value, "downautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownautostallnumNotEqualTo(Object value) {
            addCriterion("DOWNAUTOSTALLNUM <>", value, "downautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownautostallnumGreaterThan(Object value) {
            addCriterion("DOWNAUTOSTALLNUM >", value, "downautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownautostallnumGreaterThanOrEqualTo(Object value) {
            addCriterion("DOWNAUTOSTALLNUM >=", value, "downautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownautostallnumLessThan(Object value) {
            addCriterion("DOWNAUTOSTALLNUM <", value, "downautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownautostallnumLessThanOrEqualTo(Object value) {
            addCriterion("DOWNAUTOSTALLNUM <=", value, "downautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownautostallnumIn(List<Object> values) {
            addCriterion("DOWNAUTOSTALLNUM in", values, "downautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownautostallnumNotIn(List<Object> values) {
            addCriterion("DOWNAUTOSTALLNUM not in", values, "downautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownautostallnumBetween(Object value1, Object value2) {
            addCriterion("DOWNAUTOSTALLNUM between", value1, value2, "downautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownautostallnumNotBetween(Object value1, Object value2) {
            addCriterion("DOWNAUTOSTALLNUM not between", value1, value2, "downautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownstallnumIsNull() {
            addCriterion("DOWNSTALLNUM is null");
            return (Criteria) this;
        }

        public Criteria andDownstallnumIsNotNull() {
            addCriterion("DOWNSTALLNUM is not null");
            return (Criteria) this;
        }

        public Criteria andDownstallnumEqualTo(Object value) {
            addCriterion("DOWNSTALLNUM =", value, "downstallnum");
            return (Criteria) this;
        }

        public Criteria andDownstallnumNotEqualTo(Object value) {
            addCriterion("DOWNSTALLNUM <>", value, "downstallnum");
            return (Criteria) this;
        }

        public Criteria andDownstallnumGreaterThan(Object value) {
            addCriterion("DOWNSTALLNUM >", value, "downstallnum");
            return (Criteria) this;
        }

        public Criteria andDownstallnumGreaterThanOrEqualTo(Object value) {
            addCriterion("DOWNSTALLNUM >=", value, "downstallnum");
            return (Criteria) this;
        }

        public Criteria andDownstallnumLessThan(Object value) {
            addCriterion("DOWNSTALLNUM <", value, "downstallnum");
            return (Criteria) this;
        }

        public Criteria andDownstallnumLessThanOrEqualTo(Object value) {
            addCriterion("DOWNSTALLNUM <=", value, "downstallnum");
            return (Criteria) this;
        }

        public Criteria andDownstallnumIn(List<Object> values) {
            addCriterion("DOWNSTALLNUM in", values, "downstallnum");
            return (Criteria) this;
        }

        public Criteria andDownstallnumNotIn(List<Object> values) {
            addCriterion("DOWNSTALLNUM not in", values, "downstallnum");
            return (Criteria) this;
        }

        public Criteria andDownstallnumBetween(Object value1, Object value2) {
            addCriterion("DOWNSTALLNUM between", value1, value2, "downstallnum");
            return (Criteria) this;
        }

        public Criteria andDownstallnumNotBetween(Object value1, Object value2) {
            addCriterion("DOWNSTALLNUM not between", value1, value2, "downstallnum");
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

        public Criteria andDowndefencenumEqualTo(Object value) {
            addCriterion("DOWNDEFENCENUM =", value, "downdefencenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenumNotEqualTo(Object value) {
            addCriterion("DOWNDEFENCENUM <>", value, "downdefencenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenumGreaterThan(Object value) {
            addCriterion("DOWNDEFENCENUM >", value, "downdefencenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenumGreaterThanOrEqualTo(Object value) {
            addCriterion("DOWNDEFENCENUM >=", value, "downdefencenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenumLessThan(Object value) {
            addCriterion("DOWNDEFENCENUM <", value, "downdefencenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenumLessThanOrEqualTo(Object value) {
            addCriterion("DOWNDEFENCENUM <=", value, "downdefencenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenumIn(List<Object> values) {
            addCriterion("DOWNDEFENCENUM in", values, "downdefencenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenumNotIn(List<Object> values) {
            addCriterion("DOWNDEFENCENUM not in", values, "downdefencenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenumBetween(Object value1, Object value2) {
            addCriterion("DOWNDEFENCENUM between", value1, value2, "downdefencenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenumNotBetween(Object value1, Object value2) {
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

        public Criteria andDowndefencemachinenumEqualTo(Object value) {
            addCriterion("DOWNDEFENCEMACHINENUM =", value, "downdefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencemachinenumNotEqualTo(Object value) {
            addCriterion("DOWNDEFENCEMACHINENUM <>", value, "downdefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencemachinenumGreaterThan(Object value) {
            addCriterion("DOWNDEFENCEMACHINENUM >", value, "downdefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencemachinenumGreaterThanOrEqualTo(Object value) {
            addCriterion("DOWNDEFENCEMACHINENUM >=", value, "downdefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencemachinenumLessThan(Object value) {
            addCriterion("DOWNDEFENCEMACHINENUM <", value, "downdefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencemachinenumLessThanOrEqualTo(Object value) {
            addCriterion("DOWNDEFENCEMACHINENUM <=", value, "downdefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencemachinenumIn(List<Object> values) {
            addCriterion("DOWNDEFENCEMACHINENUM in", values, "downdefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencemachinenumNotIn(List<Object> values) {
            addCriterion("DOWNDEFENCEMACHINENUM not in", values, "downdefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencemachinenumBetween(Object value1, Object value2) {
            addCriterion("DOWNDEFENCEMACHINENUM between", value1, value2, "downdefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencemachinenumNotBetween(Object value1, Object value2) {
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

        public Criteria andDowndefencenonmachinenumEqualTo(Object value) {
            addCriterion("DOWNDEFENCENONMACHINENUM =", value, "downdefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenonmachinenumNotEqualTo(Object value) {
            addCriterion("DOWNDEFENCENONMACHINENUM <>", value, "downdefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenonmachinenumGreaterThan(Object value) {
            addCriterion("DOWNDEFENCENONMACHINENUM >", value, "downdefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenonmachinenumGreaterThanOrEqualTo(Object value) {
            addCriterion("DOWNDEFENCENONMACHINENUM >=", value, "downdefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenonmachinenumLessThan(Object value) {
            addCriterion("DOWNDEFENCENONMACHINENUM <", value, "downdefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenonmachinenumLessThanOrEqualTo(Object value) {
            addCriterion("DOWNDEFENCENONMACHINENUM <=", value, "downdefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenonmachinenumIn(List<Object> values) {
            addCriterion("DOWNDEFENCENONMACHINENUM in", values, "downdefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenonmachinenumNotIn(List<Object> values) {
            addCriterion("DOWNDEFENCENONMACHINENUM not in", values, "downdefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenonmachinenumBetween(Object value1, Object value2) {
            addCriterion("DOWNDEFENCENONMACHINENUM between", value1, value2, "downdefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDowndefencenonmachinenumNotBetween(Object value1, Object value2) {
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

        public Criteria andDownnondefencenumEqualTo(Object value) {
            addCriterion("DOWNNONDEFENCENUM =", value, "downnondefencenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenumNotEqualTo(Object value) {
            addCriterion("DOWNNONDEFENCENUM <>", value, "downnondefencenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenumGreaterThan(Object value) {
            addCriterion("DOWNNONDEFENCENUM >", value, "downnondefencenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenumGreaterThanOrEqualTo(Object value) {
            addCriterion("DOWNNONDEFENCENUM >=", value, "downnondefencenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenumLessThan(Object value) {
            addCriterion("DOWNNONDEFENCENUM <", value, "downnondefencenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenumLessThanOrEqualTo(Object value) {
            addCriterion("DOWNNONDEFENCENUM <=", value, "downnondefencenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenumIn(List<Object> values) {
            addCriterion("DOWNNONDEFENCENUM in", values, "downnondefencenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenumNotIn(List<Object> values) {
            addCriterion("DOWNNONDEFENCENUM not in", values, "downnondefencenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenumBetween(Object value1, Object value2) {
            addCriterion("DOWNNONDEFENCENUM between", value1, value2, "downnondefencenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenumNotBetween(Object value1, Object value2) {
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

        public Criteria andDownnondefencemachinenumEqualTo(Object value) {
            addCriterion("DOWNNONDEFENCEMACHINENUM =", value, "downnondefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencemachinenumNotEqualTo(Object value) {
            addCriterion("DOWNNONDEFENCEMACHINENUM <>", value, "downnondefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencemachinenumGreaterThan(Object value) {
            addCriterion("DOWNNONDEFENCEMACHINENUM >", value, "downnondefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencemachinenumGreaterThanOrEqualTo(Object value) {
            addCriterion("DOWNNONDEFENCEMACHINENUM >=", value, "downnondefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencemachinenumLessThan(Object value) {
            addCriterion("DOWNNONDEFENCEMACHINENUM <", value, "downnondefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencemachinenumLessThanOrEqualTo(Object value) {
            addCriterion("DOWNNONDEFENCEMACHINENUM <=", value, "downnondefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencemachinenumIn(List<Object> values) {
            addCriterion("DOWNNONDEFENCEMACHINENUM in", values, "downnondefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencemachinenumNotIn(List<Object> values) {
            addCriterion("DOWNNONDEFENCEMACHINENUM not in", values, "downnondefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencemachinenumBetween(Object value1, Object value2) {
            addCriterion("DOWNNONDEFENCEMACHINENUM between", value1, value2, "downnondefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencemachinenumNotBetween(Object value1, Object value2) {
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

        public Criteria andDownnondefencenonmachinenumEqualTo(Object value) {
            addCriterion("DOWNNONDEFENCENONMACHINENUM =", value, "downnondefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenonmachinenumNotEqualTo(Object value) {
            addCriterion("DOWNNONDEFENCENONMACHINENUM <>", value, "downnondefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenonmachinenumGreaterThan(Object value) {
            addCriterion("DOWNNONDEFENCENONMACHINENUM >", value, "downnondefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenonmachinenumGreaterThanOrEqualTo(Object value) {
            addCriterion("DOWNNONDEFENCENONMACHINENUM >=", value, "downnondefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenonmachinenumLessThan(Object value) {
            addCriterion("DOWNNONDEFENCENONMACHINENUM <", value, "downnondefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenonmachinenumLessThanOrEqualTo(Object value) {
            addCriterion("DOWNNONDEFENCENONMACHINENUM <=", value, "downnondefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenonmachinenumIn(List<Object> values) {
            addCriterion("DOWNNONDEFENCENONMACHINENUM in", values, "downnondefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenonmachinenumNotIn(List<Object> values) {
            addCriterion("DOWNNONDEFENCENONMACHINENUM not in", values, "downnondefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenonmachinenumBetween(Object value1, Object value2) {
            addCriterion("DOWNNONDEFENCENONMACHINENUM between", value1, value2, "downnondefencenonmachinenum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencenonmachinenumNotBetween(Object value1, Object value2) {
            addCriterion("DOWNNONDEFENCENONMACHINENUM not between", value1, value2, "downnondefencenonmachinenum");
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

        public Criteria andDownnonautostallnumEqualTo(Object value) {
            addCriterion("DOWNNONAUTOSTALLNUM =", value, "downnonautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownnonautostallnumNotEqualTo(Object value) {
            addCriterion("DOWNNONAUTOSTALLNUM <>", value, "downnonautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownnonautostallnumGreaterThan(Object value) {
            addCriterion("DOWNNONAUTOSTALLNUM >", value, "downnonautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownnonautostallnumGreaterThanOrEqualTo(Object value) {
            addCriterion("DOWNNONAUTOSTALLNUM >=", value, "downnonautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownnonautostallnumLessThan(Object value) {
            addCriterion("DOWNNONAUTOSTALLNUM <", value, "downnonautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownnonautostallnumLessThanOrEqualTo(Object value) {
            addCriterion("DOWNNONAUTOSTALLNUM <=", value, "downnonautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownnonautostallnumIn(List<Object> values) {
            addCriterion("DOWNNONAUTOSTALLNUM in", values, "downnonautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownnonautostallnumNotIn(List<Object> values) {
            addCriterion("DOWNNONAUTOSTALLNUM not in", values, "downnonautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownnonautostallnumBetween(Object value1, Object value2) {
            addCriterion("DOWNNONAUTOSTALLNUM between", value1, value2, "downnonautostallnum");
            return (Criteria) this;
        }

        public Criteria andDownnonautostallnumNotBetween(Object value1, Object value2) {
            addCriterion("DOWNNONAUTOSTALLNUM not between", value1, value2, "downnonautostallnum");
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

        public Criteria andSemidownnodefencemachinenumEqualTo(Object value) {
            addCriterion("SEMIDOWNNODEFENCEMACHINENUM =", value, "semidownnodefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andSemidownnodefencemachinenumNotEqualTo(Object value) {
            addCriterion("SEMIDOWNNODEFENCEMACHINENUM <>", value, "semidownnodefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andSemidownnodefencemachinenumGreaterThan(Object value) {
            addCriterion("SEMIDOWNNODEFENCEMACHINENUM >", value, "semidownnodefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andSemidownnodefencemachinenumGreaterThanOrEqualTo(Object value) {
            addCriterion("SEMIDOWNNODEFENCEMACHINENUM >=", value, "semidownnodefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andSemidownnodefencemachinenumLessThan(Object value) {
            addCriterion("SEMIDOWNNODEFENCEMACHINENUM <", value, "semidownnodefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andSemidownnodefencemachinenumLessThanOrEqualTo(Object value) {
            addCriterion("SEMIDOWNNODEFENCEMACHINENUM <=", value, "semidownnodefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andSemidownnodefencemachinenumIn(List<Object> values) {
            addCriterion("SEMIDOWNNODEFENCEMACHINENUM in", values, "semidownnodefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andSemidownnodefencemachinenumNotIn(List<Object> values) {
            addCriterion("SEMIDOWNNODEFENCEMACHINENUM not in", values, "semidownnodefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andSemidownnodefencemachinenumBetween(Object value1, Object value2) {
            addCriterion("SEMIDOWNNODEFENCEMACHINENUM between", value1, value2, "semidownnodefencemachinenum");
            return (Criteria) this;
        }

        public Criteria andSemidownnodefencemachinenumNotBetween(Object value1, Object value2) {
            addCriterion("SEMIDOWNNODEFENCEMACHINENUM not between", value1, value2, "semidownnodefencemachinenum");
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

        public Criteria andPlangreenradioEqualTo(Object value) {
            addCriterion("PLANGREENRADIO =", value, "plangreenradio");
            return (Criteria) this;
        }

        public Criteria andPlangreenradioNotEqualTo(Object value) {
            addCriterion("PLANGREENRADIO <>", value, "plangreenradio");
            return (Criteria) this;
        }

        public Criteria andPlangreenradioGreaterThan(Object value) {
            addCriterion("PLANGREENRADIO >", value, "plangreenradio");
            return (Criteria) this;
        }

        public Criteria andPlangreenradioGreaterThanOrEqualTo(Object value) {
            addCriterion("PLANGREENRADIO >=", value, "plangreenradio");
            return (Criteria) this;
        }

        public Criteria andPlangreenradioLessThan(Object value) {
            addCriterion("PLANGREENRADIO <", value, "plangreenradio");
            return (Criteria) this;
        }

        public Criteria andPlangreenradioLessThanOrEqualTo(Object value) {
            addCriterion("PLANGREENRADIO <=", value, "plangreenradio");
            return (Criteria) this;
        }

        public Criteria andPlangreenradioIn(List<Object> values) {
            addCriterion("PLANGREENRADIO in", values, "plangreenradio");
            return (Criteria) this;
        }

        public Criteria andPlangreenradioNotIn(List<Object> values) {
            addCriterion("PLANGREENRADIO not in", values, "plangreenradio");
            return (Criteria) this;
        }

        public Criteria andPlangreenradioBetween(Object value1, Object value2) {
            addCriterion("PLANGREENRADIO between", value1, value2, "plangreenradio");
            return (Criteria) this;
        }

        public Criteria andPlangreenradioNotBetween(Object value1, Object value2) {
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

        public Criteria andGreenradioEqualTo(Object value) {
            addCriterion("GREENRADIO =", value, "greenradio");
            return (Criteria) this;
        }

        public Criteria andGreenradioNotEqualTo(Object value) {
            addCriterion("GREENRADIO <>", value, "greenradio");
            return (Criteria) this;
        }

        public Criteria andGreenradioGreaterThan(Object value) {
            addCriterion("GREENRADIO >", value, "greenradio");
            return (Criteria) this;
        }

        public Criteria andGreenradioGreaterThanOrEqualTo(Object value) {
            addCriterion("GREENRADIO >=", value, "greenradio");
            return (Criteria) this;
        }

        public Criteria andGreenradioLessThan(Object value) {
            addCriterion("GREENRADIO <", value, "greenradio");
            return (Criteria) this;
        }

        public Criteria andGreenradioLessThanOrEqualTo(Object value) {
            addCriterion("GREENRADIO <=", value, "greenradio");
            return (Criteria) this;
        }

        public Criteria andGreenradioIn(List<Object> values) {
            addCriterion("GREENRADIO in", values, "greenradio");
            return (Criteria) this;
        }

        public Criteria andGreenradioNotIn(List<Object> values) {
            addCriterion("GREENRADIO not in", values, "greenradio");
            return (Criteria) this;
        }

        public Criteria andGreenradioBetween(Object value1, Object value2) {
            addCriterion("GREENRADIO between", value1, value2, "greenradio");
            return (Criteria) this;
        }

        public Criteria andGreenradioNotBetween(Object value1, Object value2) {
            addCriterion("GREENRADIO not between", value1, value2, "greenradio");
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

        public Criteria andHousetypenumEqualTo(Object value) {
            addCriterion("HOUSETYPENUM =", value, "housetypenum");
            return (Criteria) this;
        }

        public Criteria andHousetypenumNotEqualTo(Object value) {
            addCriterion("HOUSETYPENUM <>", value, "housetypenum");
            return (Criteria) this;
        }

        public Criteria andHousetypenumGreaterThan(Object value) {
            addCriterion("HOUSETYPENUM >", value, "housetypenum");
            return (Criteria) this;
        }

        public Criteria andHousetypenumGreaterThanOrEqualTo(Object value) {
            addCriterion("HOUSETYPENUM >=", value, "housetypenum");
            return (Criteria) this;
        }

        public Criteria andHousetypenumLessThan(Object value) {
            addCriterion("HOUSETYPENUM <", value, "housetypenum");
            return (Criteria) this;
        }

        public Criteria andHousetypenumLessThanOrEqualTo(Object value) {
            addCriterion("HOUSETYPENUM <=", value, "housetypenum");
            return (Criteria) this;
        }

        public Criteria andHousetypenumIn(List<Object> values) {
            addCriterion("HOUSETYPENUM in", values, "housetypenum");
            return (Criteria) this;
        }

        public Criteria andHousetypenumNotIn(List<Object> values) {
            addCriterion("HOUSETYPENUM not in", values, "housetypenum");
            return (Criteria) this;
        }

        public Criteria andHousetypenumBetween(Object value1, Object value2) {
            addCriterion("HOUSETYPENUM between", value1, value2, "housetypenum");
            return (Criteria) this;
        }

        public Criteria andHousetypenumNotBetween(Object value1, Object value2) {
            addCriterion("HOUSETYPENUM not between", value1, value2, "housetypenum");
            return (Criteria) this;
        }

        public Criteria andApprovestatusIsNull() {
            addCriterion("APPROVESTATUS is null");
            return (Criteria) this;
        }

        public Criteria andApprovestatusIsNotNull() {
            addCriterion("APPROVESTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andApprovestatusEqualTo(Object value) {
            addCriterion("APPROVESTATUS =", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusNotEqualTo(Object value) {
            addCriterion("APPROVESTATUS <>", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusGreaterThan(Object value) {
            addCriterion("APPROVESTATUS >", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusGreaterThanOrEqualTo(Object value) {
            addCriterion("APPROVESTATUS >=", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusLessThan(Object value) {
            addCriterion("APPROVESTATUS <", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusLessThanOrEqualTo(Object value) {
            addCriterion("APPROVESTATUS <=", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusIn(List<Object> values) {
            addCriterion("APPROVESTATUS in", values, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusNotIn(List<Object> values) {
            addCriterion("APPROVESTATUS not in", values, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusBetween(Object value1, Object value2) {
            addCriterion("APPROVESTATUS between", value1, value2, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusNotBetween(Object value1, Object value2) {
            addCriterion("APPROVESTATUS not between", value1, value2, "approvestatus");
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

        public Criteria andStatusEqualTo(Object value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Object value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Object value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Object value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Object value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Object value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Object> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Object> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Object value1, Object value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Object value1, Object value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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

        public Criteria andSellsystemcodeEqualTo(Object value) {
            addCriterion("SELLSYSTEMCODE =", value, "sellsystemcode");
            return (Criteria) this;
        }

        public Criteria andSellsystemcodeNotEqualTo(Object value) {
            addCriterion("SELLSYSTEMCODE <>", value, "sellsystemcode");
            return (Criteria) this;
        }

        public Criteria andSellsystemcodeGreaterThan(Object value) {
            addCriterion("SELLSYSTEMCODE >", value, "sellsystemcode");
            return (Criteria) this;
        }

        public Criteria andSellsystemcodeGreaterThanOrEqualTo(Object value) {
            addCriterion("SELLSYSTEMCODE >=", value, "sellsystemcode");
            return (Criteria) this;
        }

        public Criteria andSellsystemcodeLessThan(Object value) {
            addCriterion("SELLSYSTEMCODE <", value, "sellsystemcode");
            return (Criteria) this;
        }

        public Criteria andSellsystemcodeLessThanOrEqualTo(Object value) {
            addCriterion("SELLSYSTEMCODE <=", value, "sellsystemcode");
            return (Criteria) this;
        }

        public Criteria andSellsystemcodeIn(List<Object> values) {
            addCriterion("SELLSYSTEMCODE in", values, "sellsystemcode");
            return (Criteria) this;
        }

        public Criteria andSellsystemcodeNotIn(List<Object> values) {
            addCriterion("SELLSYSTEMCODE not in", values, "sellsystemcode");
            return (Criteria) this;
        }

        public Criteria andSellsystemcodeBetween(Object value1, Object value2) {
            addCriterion("SELLSYSTEMCODE between", value1, value2, "sellsystemcode");
            return (Criteria) this;
        }

        public Criteria andSellsystemcodeNotBetween(Object value1, Object value2) {
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

        public Criteria andCostsystemcodeEqualTo(Object value) {
            addCriterion("COSTSYSTEMCODE =", value, "costsystemcode");
            return (Criteria) this;
        }

        public Criteria andCostsystemcodeNotEqualTo(Object value) {
            addCriterion("COSTSYSTEMCODE <>", value, "costsystemcode");
            return (Criteria) this;
        }

        public Criteria andCostsystemcodeGreaterThan(Object value) {
            addCriterion("COSTSYSTEMCODE >", value, "costsystemcode");
            return (Criteria) this;
        }

        public Criteria andCostsystemcodeGreaterThanOrEqualTo(Object value) {
            addCriterion("COSTSYSTEMCODE >=", value, "costsystemcode");
            return (Criteria) this;
        }

        public Criteria andCostsystemcodeLessThan(Object value) {
            addCriterion("COSTSYSTEMCODE <", value, "costsystemcode");
            return (Criteria) this;
        }

        public Criteria andCostsystemcodeLessThanOrEqualTo(Object value) {
            addCriterion("COSTSYSTEMCODE <=", value, "costsystemcode");
            return (Criteria) this;
        }

        public Criteria andCostsystemcodeIn(List<Object> values) {
            addCriterion("COSTSYSTEMCODE in", values, "costsystemcode");
            return (Criteria) this;
        }

        public Criteria andCostsystemcodeNotIn(List<Object> values) {
            addCriterion("COSTSYSTEMCODE not in", values, "costsystemcode");
            return (Criteria) this;
        }

        public Criteria andCostsystemcodeBetween(Object value1, Object value2) {
            addCriterion("COSTSYSTEMCODE between", value1, value2, "costsystemcode");
            return (Criteria) this;
        }

        public Criteria andCostsystemcodeNotBetween(Object value1, Object value2) {
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

        public Criteria andPurchasesystemcodeEqualTo(Object value) {
            addCriterion("PURCHASESYSTEMCODE =", value, "purchasesystemcode");
            return (Criteria) this;
        }

        public Criteria andPurchasesystemcodeNotEqualTo(Object value) {
            addCriterion("PURCHASESYSTEMCODE <>", value, "purchasesystemcode");
            return (Criteria) this;
        }

        public Criteria andPurchasesystemcodeGreaterThan(Object value) {
            addCriterion("PURCHASESYSTEMCODE >", value, "purchasesystemcode");
            return (Criteria) this;
        }

        public Criteria andPurchasesystemcodeGreaterThanOrEqualTo(Object value) {
            addCriterion("PURCHASESYSTEMCODE >=", value, "purchasesystemcode");
            return (Criteria) this;
        }

        public Criteria andPurchasesystemcodeLessThan(Object value) {
            addCriterion("PURCHASESYSTEMCODE <", value, "purchasesystemcode");
            return (Criteria) this;
        }

        public Criteria andPurchasesystemcodeLessThanOrEqualTo(Object value) {
            addCriterion("PURCHASESYSTEMCODE <=", value, "purchasesystemcode");
            return (Criteria) this;
        }

        public Criteria andPurchasesystemcodeIn(List<Object> values) {
            addCriterion("PURCHASESYSTEMCODE in", values, "purchasesystemcode");
            return (Criteria) this;
        }

        public Criteria andPurchasesystemcodeNotIn(List<Object> values) {
            addCriterion("PURCHASESYSTEMCODE not in", values, "purchasesystemcode");
            return (Criteria) this;
        }

        public Criteria andPurchasesystemcodeBetween(Object value1, Object value2) {
            addCriterion("PURCHASESYSTEMCODE between", value1, value2, "purchasesystemcode");
            return (Criteria) this;
        }

        public Criteria andPurchasesystemcodeNotBetween(Object value1, Object value2) {
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

        public Criteria andFinancialsystemcodeEqualTo(Object value) {
            addCriterion("FINANCIALSYSTEMCODE =", value, "financialsystemcode");
            return (Criteria) this;
        }

        public Criteria andFinancialsystemcodeNotEqualTo(Object value) {
            addCriterion("FINANCIALSYSTEMCODE <>", value, "financialsystemcode");
            return (Criteria) this;
        }

        public Criteria andFinancialsystemcodeGreaterThan(Object value) {
            addCriterion("FINANCIALSYSTEMCODE >", value, "financialsystemcode");
            return (Criteria) this;
        }

        public Criteria andFinancialsystemcodeGreaterThanOrEqualTo(Object value) {
            addCriterion("FINANCIALSYSTEMCODE >=", value, "financialsystemcode");
            return (Criteria) this;
        }

        public Criteria andFinancialsystemcodeLessThan(Object value) {
            addCriterion("FINANCIALSYSTEMCODE <", value, "financialsystemcode");
            return (Criteria) this;
        }

        public Criteria andFinancialsystemcodeLessThanOrEqualTo(Object value) {
            addCriterion("FINANCIALSYSTEMCODE <=", value, "financialsystemcode");
            return (Criteria) this;
        }

        public Criteria andFinancialsystemcodeIn(List<Object> values) {
            addCriterion("FINANCIALSYSTEMCODE in", values, "financialsystemcode");
            return (Criteria) this;
        }

        public Criteria andFinancialsystemcodeNotIn(List<Object> values) {
            addCriterion("FINANCIALSYSTEMCODE not in", values, "financialsystemcode");
            return (Criteria) this;
        }

        public Criteria andFinancialsystemcodeBetween(Object value1, Object value2) {
            addCriterion("FINANCIALSYSTEMCODE between", value1, value2, "financialsystemcode");
            return (Criteria) this;
        }

        public Criteria andFinancialsystemcodeNotBetween(Object value1, Object value2) {
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

        public Criteria andCreateuserEqualTo(Object value) {
            addCriterion("CREATEUSER =", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotEqualTo(Object value) {
            addCriterion("CREATEUSER <>", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThan(Object value) {
            addCriterion("CREATEUSER >", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThanOrEqualTo(Object value) {
            addCriterion("CREATEUSER >=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThan(Object value) {
            addCriterion("CREATEUSER <", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThanOrEqualTo(Object value) {
            addCriterion("CREATEUSER <=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserIn(List<Object> values) {
            addCriterion("CREATEUSER in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotIn(List<Object> values) {
            addCriterion("CREATEUSER not in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserBetween(Object value1, Object value2) {
            addCriterion("CREATEUSER between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotBetween(Object value1, Object value2) {
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

        public Criteria andModifyuserEqualTo(Object value) {
            addCriterion("MODIFYUSER =", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotEqualTo(Object value) {
            addCriterion("MODIFYUSER <>", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserGreaterThan(Object value) {
            addCriterion("MODIFYUSER >", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserGreaterThanOrEqualTo(Object value) {
            addCriterion("MODIFYUSER >=", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserLessThan(Object value) {
            addCriterion("MODIFYUSER <", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserLessThanOrEqualTo(Object value) {
            addCriterion("MODIFYUSER <=", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserIn(List<Object> values) {
            addCriterion("MODIFYUSER in", values, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotIn(List<Object> values) {
            addCriterion("MODIFYUSER not in", values, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserBetween(Object value1, Object value2) {
            addCriterion("MODIFYUSER between", value1, value2, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotBetween(Object value1, Object value2) {
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

        public Criteria andStallareaIsNull() {
            addCriterion("STALLAREA is null");
            return (Criteria) this;
        }

        public Criteria andStallareaIsNotNull() {
            addCriterion("STALLAREA is not null");
            return (Criteria) this;
        }

        public Criteria andStallareaEqualTo(Object value) {
            addCriterion("STALLAREA =", value, "stallarea");
            return (Criteria) this;
        }

        public Criteria andStallareaNotEqualTo(Object value) {
            addCriterion("STALLAREA <>", value, "stallarea");
            return (Criteria) this;
        }

        public Criteria andStallareaGreaterThan(Object value) {
            addCriterion("STALLAREA >", value, "stallarea");
            return (Criteria) this;
        }

        public Criteria andStallareaGreaterThanOrEqualTo(Object value) {
            addCriterion("STALLAREA >=", value, "stallarea");
            return (Criteria) this;
        }

        public Criteria andStallareaLessThan(Object value) {
            addCriterion("STALLAREA <", value, "stallarea");
            return (Criteria) this;
        }

        public Criteria andStallareaLessThanOrEqualTo(Object value) {
            addCriterion("STALLAREA <=", value, "stallarea");
            return (Criteria) this;
        }

        public Criteria andStallareaIn(List<Object> values) {
            addCriterion("STALLAREA in", values, "stallarea");
            return (Criteria) this;
        }

        public Criteria andStallareaNotIn(List<Object> values) {
            addCriterion("STALLAREA not in", values, "stallarea");
            return (Criteria) this;
        }

        public Criteria andStallareaBetween(Object value1, Object value2) {
            addCriterion("STALLAREA between", value1, value2, "stallarea");
            return (Criteria) this;
        }

        public Criteria andStallareaNotBetween(Object value1, Object value2) {
            addCriterion("STALLAREA not between", value1, value2, "stallarea");
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

        public Criteria andInstanceidIsNull() {
            addCriterion("INSTANCEID is null");
            return (Criteria) this;
        }

        public Criteria andInstanceidIsNotNull() {
            addCriterion("INSTANCEID is not null");
            return (Criteria) this;
        }

        public Criteria andInstanceidEqualTo(Object value) {
            addCriterion("INSTANCEID =", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidNotEqualTo(Object value) {
            addCriterion("INSTANCEID <>", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidGreaterThan(Object value) {
            addCriterion("INSTANCEID >", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidGreaterThanOrEqualTo(Object value) {
            addCriterion("INSTANCEID >=", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidLessThan(Object value) {
            addCriterion("INSTANCEID <", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidLessThanOrEqualTo(Object value) {
            addCriterion("INSTANCEID <=", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidIn(List<Object> values) {
            addCriterion("INSTANCEID in", values, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidNotIn(List<Object> values) {
            addCriterion("INSTANCEID not in", values, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidBetween(Object value1, Object value2) {
            addCriterion("INSTANCEID between", value1, value2, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidNotBetween(Object value1, Object value2) {
            addCriterion("INSTANCEID not between", value1, value2, "instanceid");
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

        public Criteria andNosellstallnumEqualTo(Object value) {
            addCriterion("NOSELLSTALLNUM =", value, "nosellstallnum");
            return (Criteria) this;
        }

        public Criteria andNosellstallnumNotEqualTo(Object value) {
            addCriterion("NOSELLSTALLNUM <>", value, "nosellstallnum");
            return (Criteria) this;
        }

        public Criteria andNosellstallnumGreaterThan(Object value) {
            addCriterion("NOSELLSTALLNUM >", value, "nosellstallnum");
            return (Criteria) this;
        }

        public Criteria andNosellstallnumGreaterThanOrEqualTo(Object value) {
            addCriterion("NOSELLSTALLNUM >=", value, "nosellstallnum");
            return (Criteria) this;
        }

        public Criteria andNosellstallnumLessThan(Object value) {
            addCriterion("NOSELLSTALLNUM <", value, "nosellstallnum");
            return (Criteria) this;
        }

        public Criteria andNosellstallnumLessThanOrEqualTo(Object value) {
            addCriterion("NOSELLSTALLNUM <=", value, "nosellstallnum");
            return (Criteria) this;
        }

        public Criteria andNosellstallnumIn(List<Object> values) {
            addCriterion("NOSELLSTALLNUM in", values, "nosellstallnum");
            return (Criteria) this;
        }

        public Criteria andNosellstallnumNotIn(List<Object> values) {
            addCriterion("NOSELLSTALLNUM not in", values, "nosellstallnum");
            return (Criteria) this;
        }

        public Criteria andNosellstallnumBetween(Object value1, Object value2) {
            addCriterion("NOSELLSTALLNUM between", value1, value2, "nosellstallnum");
            return (Criteria) this;
        }

        public Criteria andNosellstallnumNotBetween(Object value1, Object value2) {
            addCriterion("NOSELLSTALLNUM not between", value1, value2, "nosellstallnum");
            return (Criteria) this;
        }

        public Criteria andImagepathIsNull() {
            addCriterion("IMAGEPATH is null");
            return (Criteria) this;
        }

        public Criteria andImagepathIsNotNull() {
            addCriterion("IMAGEPATH is not null");
            return (Criteria) this;
        }

        public Criteria andImagepathEqualTo(Object value) {
            addCriterion("IMAGEPATH =", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathNotEqualTo(Object value) {
            addCriterion("IMAGEPATH <>", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathGreaterThan(Object value) {
            addCriterion("IMAGEPATH >", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathGreaterThanOrEqualTo(Object value) {
            addCriterion("IMAGEPATH >=", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathLessThan(Object value) {
            addCriterion("IMAGEPATH <", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathLessThanOrEqualTo(Object value) {
            addCriterion("IMAGEPATH <=", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathIn(List<Object> values) {
            addCriterion("IMAGEPATH in", values, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathNotIn(List<Object> values) {
            addCriterion("IMAGEPATH not in", values, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathBetween(Object value1, Object value2) {
            addCriterion("IMAGEPATH between", value1, value2, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathNotBetween(Object value1, Object value2) {
            addCriterion("IMAGEPATH not between", value1, value2, "imagepath");
            return (Criteria) this;
        }

        public Criteria andFtpserveripIsNull() {
            addCriterion("FTPSERVERIP is null");
            return (Criteria) this;
        }

        public Criteria andFtpserveripIsNotNull() {
            addCriterion("FTPSERVERIP is not null");
            return (Criteria) this;
        }

        public Criteria andFtpserveripEqualTo(Object value) {
            addCriterion("FTPSERVERIP =", value, "ftpserverip");
            return (Criteria) this;
        }

        public Criteria andFtpserveripNotEqualTo(Object value) {
            addCriterion("FTPSERVERIP <>", value, "ftpserverip");
            return (Criteria) this;
        }

        public Criteria andFtpserveripGreaterThan(Object value) {
            addCriterion("FTPSERVERIP >", value, "ftpserverip");
            return (Criteria) this;
        }

        public Criteria andFtpserveripGreaterThanOrEqualTo(Object value) {
            addCriterion("FTPSERVERIP >=", value, "ftpserverip");
            return (Criteria) this;
        }

        public Criteria andFtpserveripLessThan(Object value) {
            addCriterion("FTPSERVERIP <", value, "ftpserverip");
            return (Criteria) this;
        }

        public Criteria andFtpserveripLessThanOrEqualTo(Object value) {
            addCriterion("FTPSERVERIP <=", value, "ftpserverip");
            return (Criteria) this;
        }

        public Criteria andFtpserveripIn(List<Object> values) {
            addCriterion("FTPSERVERIP in", values, "ftpserverip");
            return (Criteria) this;
        }

        public Criteria andFtpserveripNotIn(List<Object> values) {
            addCriterion("FTPSERVERIP not in", values, "ftpserverip");
            return (Criteria) this;
        }

        public Criteria andFtpserveripBetween(Object value1, Object value2) {
            addCriterion("FTPSERVERIP between", value1, value2, "ftpserverip");
            return (Criteria) this;
        }

        public Criteria andFtpserveripNotBetween(Object value1, Object value2) {
            addCriterion("FTPSERVERIP not between", value1, value2, "ftpserverip");
            return (Criteria) this;
        }

        public Criteria andFtpremotepathIsNull() {
            addCriterion("FTPREMOTEPATH is null");
            return (Criteria) this;
        }

        public Criteria andFtpremotepathIsNotNull() {
            addCriterion("FTPREMOTEPATH is not null");
            return (Criteria) this;
        }

        public Criteria andFtpremotepathEqualTo(Object value) {
            addCriterion("FTPREMOTEPATH =", value, "ftpremotepath");
            return (Criteria) this;
        }

        public Criteria andFtpremotepathNotEqualTo(Object value) {
            addCriterion("FTPREMOTEPATH <>", value, "ftpremotepath");
            return (Criteria) this;
        }

        public Criteria andFtpremotepathGreaterThan(Object value) {
            addCriterion("FTPREMOTEPATH >", value, "ftpremotepath");
            return (Criteria) this;
        }

        public Criteria andFtpremotepathGreaterThanOrEqualTo(Object value) {
            addCriterion("FTPREMOTEPATH >=", value, "ftpremotepath");
            return (Criteria) this;
        }

        public Criteria andFtpremotepathLessThan(Object value) {
            addCriterion("FTPREMOTEPATH <", value, "ftpremotepath");
            return (Criteria) this;
        }

        public Criteria andFtpremotepathLessThanOrEqualTo(Object value) {
            addCriterion("FTPREMOTEPATH <=", value, "ftpremotepath");
            return (Criteria) this;
        }

        public Criteria andFtpremotepathIn(List<Object> values) {
            addCriterion("FTPREMOTEPATH in", values, "ftpremotepath");
            return (Criteria) this;
        }

        public Criteria andFtpremotepathNotIn(List<Object> values) {
            addCriterion("FTPREMOTEPATH not in", values, "ftpremotepath");
            return (Criteria) this;
        }

        public Criteria andFtpremotepathBetween(Object value1, Object value2) {
            addCriterion("FTPREMOTEPATH between", value1, value2, "ftpremotepath");
            return (Criteria) this;
        }

        public Criteria andFtpremotepathNotBetween(Object value1, Object value2) {
            addCriterion("FTPREMOTEPATH not between", value1, value2, "ftpremotepath");
            return (Criteria) this;
        }

        public Criteria andFtpuseridIsNull() {
            addCriterion("FTPUSERID is null");
            return (Criteria) this;
        }

        public Criteria andFtpuseridIsNotNull() {
            addCriterion("FTPUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andFtpuseridEqualTo(Object value) {
            addCriterion("FTPUSERID =", value, "ftpuserid");
            return (Criteria) this;
        }

        public Criteria andFtpuseridNotEqualTo(Object value) {
            addCriterion("FTPUSERID <>", value, "ftpuserid");
            return (Criteria) this;
        }

        public Criteria andFtpuseridGreaterThan(Object value) {
            addCriterion("FTPUSERID >", value, "ftpuserid");
            return (Criteria) this;
        }

        public Criteria andFtpuseridGreaterThanOrEqualTo(Object value) {
            addCriterion("FTPUSERID >=", value, "ftpuserid");
            return (Criteria) this;
        }

        public Criteria andFtpuseridLessThan(Object value) {
            addCriterion("FTPUSERID <", value, "ftpuserid");
            return (Criteria) this;
        }

        public Criteria andFtpuseridLessThanOrEqualTo(Object value) {
            addCriterion("FTPUSERID <=", value, "ftpuserid");
            return (Criteria) this;
        }

        public Criteria andFtpuseridIn(List<Object> values) {
            addCriterion("FTPUSERID in", values, "ftpuserid");
            return (Criteria) this;
        }

        public Criteria andFtpuseridNotIn(List<Object> values) {
            addCriterion("FTPUSERID not in", values, "ftpuserid");
            return (Criteria) this;
        }

        public Criteria andFtpuseridBetween(Object value1, Object value2) {
            addCriterion("FTPUSERID between", value1, value2, "ftpuserid");
            return (Criteria) this;
        }

        public Criteria andFtpuseridNotBetween(Object value1, Object value2) {
            addCriterion("FTPUSERID not between", value1, value2, "ftpuserid");
            return (Criteria) this;
        }

        public Criteria andFtppasswordIsNull() {
            addCriterion("FTPPASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andFtppasswordIsNotNull() {
            addCriterion("FTPPASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andFtppasswordEqualTo(Object value) {
            addCriterion("FTPPASSWORD =", value, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordNotEqualTo(Object value) {
            addCriterion("FTPPASSWORD <>", value, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordGreaterThan(Object value) {
            addCriterion("FTPPASSWORD >", value, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordGreaterThanOrEqualTo(Object value) {
            addCriterion("FTPPASSWORD >=", value, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordLessThan(Object value) {
            addCriterion("FTPPASSWORD <", value, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordLessThanOrEqualTo(Object value) {
            addCriterion("FTPPASSWORD <=", value, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordIn(List<Object> values) {
            addCriterion("FTPPASSWORD in", values, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordNotIn(List<Object> values) {
            addCriterion("FTPPASSWORD not in", values, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordBetween(Object value1, Object value2) {
            addCriterion("FTPPASSWORD between", value1, value2, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordNotBetween(Object value1, Object value2) {
            addCriterion("FTPPASSWORD not between", value1, value2, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateIsNull() {
            addCriterion("STARTWORKINGDATE is null");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateIsNotNull() {
            addCriterion("STARTWORKINGDATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateEqualTo(Object value) {
            addCriterion("STARTWORKINGDATE =", value, "startworkingdate");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateNotEqualTo(Object value) {
            addCriterion("STARTWORKINGDATE <>", value, "startworkingdate");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateGreaterThan(Object value) {
            addCriterion("STARTWORKINGDATE >", value, "startworkingdate");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateGreaterThanOrEqualTo(Object value) {
            addCriterion("STARTWORKINGDATE >=", value, "startworkingdate");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateLessThan(Object value) {
            addCriterion("STARTWORKINGDATE <", value, "startworkingdate");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateLessThanOrEqualTo(Object value) {
            addCriterion("STARTWORKINGDATE <=", value, "startworkingdate");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateIn(List<Object> values) {
            addCriterion("STARTWORKINGDATE in", values, "startworkingdate");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateNotIn(List<Object> values) {
            addCriterion("STARTWORKINGDATE not in", values, "startworkingdate");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateBetween(Object value1, Object value2) {
            addCriterion("STARTWORKINGDATE between", value1, value2, "startworkingdate");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateNotBetween(Object value1, Object value2) {
            addCriterion("STARTWORKINGDATE not between", value1, value2, "startworkingdate");
            return (Criteria) this;
        }

        public Criteria andPresaledateIsNull() {
            addCriterion("PRESALEDATE is null");
            return (Criteria) this;
        }

        public Criteria andPresaledateIsNotNull() {
            addCriterion("PRESALEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPresaledateEqualTo(Object value) {
            addCriterion("PRESALEDATE =", value, "presaledate");
            return (Criteria) this;
        }

        public Criteria andPresaledateNotEqualTo(Object value) {
            addCriterion("PRESALEDATE <>", value, "presaledate");
            return (Criteria) this;
        }

        public Criteria andPresaledateGreaterThan(Object value) {
            addCriterion("PRESALEDATE >", value, "presaledate");
            return (Criteria) this;
        }

        public Criteria andPresaledateGreaterThanOrEqualTo(Object value) {
            addCriterion("PRESALEDATE >=", value, "presaledate");
            return (Criteria) this;
        }

        public Criteria andPresaledateLessThan(Object value) {
            addCriterion("PRESALEDATE <", value, "presaledate");
            return (Criteria) this;
        }

        public Criteria andPresaledateLessThanOrEqualTo(Object value) {
            addCriterion("PRESALEDATE <=", value, "presaledate");
            return (Criteria) this;
        }

        public Criteria andPresaledateIn(List<Object> values) {
            addCriterion("PRESALEDATE in", values, "presaledate");
            return (Criteria) this;
        }

        public Criteria andPresaledateNotIn(List<Object> values) {
            addCriterion("PRESALEDATE not in", values, "presaledate");
            return (Criteria) this;
        }

        public Criteria andPresaledateBetween(Object value1, Object value2) {
            addCriterion("PRESALEDATE between", value1, value2, "presaledate");
            return (Criteria) this;
        }

        public Criteria andPresaledateNotBetween(Object value1, Object value2) {
            addCriterion("PRESALEDATE not between", value1, value2, "presaledate");
            return (Criteria) this;
        }

        public Criteria andOpendateIsNull() {
            addCriterion("OPENDATE is null");
            return (Criteria) this;
        }

        public Criteria andOpendateIsNotNull() {
            addCriterion("OPENDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOpendateEqualTo(Object value) {
            addCriterion("OPENDATE =", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateNotEqualTo(Object value) {
            addCriterion("OPENDATE <>", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateGreaterThan(Object value) {
            addCriterion("OPENDATE >", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateGreaterThanOrEqualTo(Object value) {
            addCriterion("OPENDATE >=", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateLessThan(Object value) {
            addCriterion("OPENDATE <", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateLessThanOrEqualTo(Object value) {
            addCriterion("OPENDATE <=", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateIn(List<Object> values) {
            addCriterion("OPENDATE in", values, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateNotIn(List<Object> values) {
            addCriterion("OPENDATE not in", values, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateBetween(Object value1, Object value2) {
            addCriterion("OPENDATE between", value1, value2, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateNotBetween(Object value1, Object value2) {
            addCriterion("OPENDATE not between", value1, value2, "opendate");
            return (Criteria) this;
        }

        public Criteria andCappingdateIsNull() {
            addCriterion("CAPPINGDATE is null");
            return (Criteria) this;
        }

        public Criteria andCappingdateIsNotNull() {
            addCriterion("CAPPINGDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCappingdateEqualTo(Object value) {
            addCriterion("CAPPINGDATE =", value, "cappingdate");
            return (Criteria) this;
        }

        public Criteria andCappingdateNotEqualTo(Object value) {
            addCriterion("CAPPINGDATE <>", value, "cappingdate");
            return (Criteria) this;
        }

        public Criteria andCappingdateGreaterThan(Object value) {
            addCriterion("CAPPINGDATE >", value, "cappingdate");
            return (Criteria) this;
        }

        public Criteria andCappingdateGreaterThanOrEqualTo(Object value) {
            addCriterion("CAPPINGDATE >=", value, "cappingdate");
            return (Criteria) this;
        }

        public Criteria andCappingdateLessThan(Object value) {
            addCriterion("CAPPINGDATE <", value, "cappingdate");
            return (Criteria) this;
        }

        public Criteria andCappingdateLessThanOrEqualTo(Object value) {
            addCriterion("CAPPINGDATE <=", value, "cappingdate");
            return (Criteria) this;
        }

        public Criteria andCappingdateIn(List<Object> values) {
            addCriterion("CAPPINGDATE in", values, "cappingdate");
            return (Criteria) this;
        }

        public Criteria andCappingdateNotIn(List<Object> values) {
            addCriterion("CAPPINGDATE not in", values, "cappingdate");
            return (Criteria) this;
        }

        public Criteria andCappingdateBetween(Object value1, Object value2) {
            addCriterion("CAPPINGDATE between", value1, value2, "cappingdate");
            return (Criteria) this;
        }

        public Criteria andCappingdateNotBetween(Object value1, Object value2) {
            addCriterion("CAPPINGDATE not between", value1, value2, "cappingdate");
            return (Criteria) this;
        }

        public Criteria andCompletedateIsNull() {
            addCriterion("COMPLETEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCompletedateIsNotNull() {
            addCriterion("COMPLETEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCompletedateEqualTo(Object value) {
            addCriterion("COMPLETEDATE =", value, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateNotEqualTo(Object value) {
            addCriterion("COMPLETEDATE <>", value, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateGreaterThan(Object value) {
            addCriterion("COMPLETEDATE >", value, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateGreaterThanOrEqualTo(Object value) {
            addCriterion("COMPLETEDATE >=", value, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateLessThan(Object value) {
            addCriterion("COMPLETEDATE <", value, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateLessThanOrEqualTo(Object value) {
            addCriterion("COMPLETEDATE <=", value, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateIn(List<Object> values) {
            addCriterion("COMPLETEDATE in", values, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateNotIn(List<Object> values) {
            addCriterion("COMPLETEDATE not in", values, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateBetween(Object value1, Object value2) {
            addCriterion("COMPLETEDATE between", value1, value2, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateNotBetween(Object value1, Object value2) {
            addCriterion("COMPLETEDATE not between", value1, value2, "completedate");
            return (Criteria) this;
        }

        public Criteria andHandingdateIsNull() {
            addCriterion("HANDINGDATE is null");
            return (Criteria) this;
        }

        public Criteria andHandingdateIsNotNull() {
            addCriterion("HANDINGDATE is not null");
            return (Criteria) this;
        }

        public Criteria andHandingdateEqualTo(Object value) {
            addCriterion("HANDINGDATE =", value, "handingdate");
            return (Criteria) this;
        }

        public Criteria andHandingdateNotEqualTo(Object value) {
            addCriterion("HANDINGDATE <>", value, "handingdate");
            return (Criteria) this;
        }

        public Criteria andHandingdateGreaterThan(Object value) {
            addCriterion("HANDINGDATE >", value, "handingdate");
            return (Criteria) this;
        }

        public Criteria andHandingdateGreaterThanOrEqualTo(Object value) {
            addCriterion("HANDINGDATE >=", value, "handingdate");
            return (Criteria) this;
        }

        public Criteria andHandingdateLessThan(Object value) {
            addCriterion("HANDINGDATE <", value, "handingdate");
            return (Criteria) this;
        }

        public Criteria andHandingdateLessThanOrEqualTo(Object value) {
            addCriterion("HANDINGDATE <=", value, "handingdate");
            return (Criteria) this;
        }

        public Criteria andHandingdateIn(List<Object> values) {
            addCriterion("HANDINGDATE in", values, "handingdate");
            return (Criteria) this;
        }

        public Criteria andHandingdateNotIn(List<Object> values) {
            addCriterion("HANDINGDATE not in", values, "handingdate");
            return (Criteria) this;
        }

        public Criteria andHandingdateBetween(Object value1, Object value2) {
            addCriterion("HANDINGDATE between", value1, value2, "handingdate");
            return (Criteria) this;
        }

        public Criteria andHandingdateNotBetween(Object value1, Object value2) {
            addCriterion("HANDINGDATE not between", value1, value2, "handingdate");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateplanstartIsNull() {
            addCriterion("STARTWORKINGDATEPLANSTART is null");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateplanstartIsNotNull() {
            addCriterion("STARTWORKINGDATEPLANSTART is not null");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateplanstartEqualTo(Object value) {
            addCriterion("STARTWORKINGDATEPLANSTART =", value, "startworkingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateplanstartNotEqualTo(Object value) {
            addCriterion("STARTWORKINGDATEPLANSTART <>", value, "startworkingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateplanstartGreaterThan(Object value) {
            addCriterion("STARTWORKINGDATEPLANSTART >", value, "startworkingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateplanstartGreaterThanOrEqualTo(Object value) {
            addCriterion("STARTWORKINGDATEPLANSTART >=", value, "startworkingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateplanstartLessThan(Object value) {
            addCriterion("STARTWORKINGDATEPLANSTART <", value, "startworkingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateplanstartLessThanOrEqualTo(Object value) {
            addCriterion("STARTWORKINGDATEPLANSTART <=", value, "startworkingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateplanstartIn(List<Object> values) {
            addCriterion("STARTWORKINGDATEPLANSTART in", values, "startworkingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateplanstartNotIn(List<Object> values) {
            addCriterion("STARTWORKINGDATEPLANSTART not in", values, "startworkingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateplanstartBetween(Object value1, Object value2) {
            addCriterion("STARTWORKINGDATEPLANSTART between", value1, value2, "startworkingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateplanstartNotBetween(Object value1, Object value2) {
            addCriterion("STARTWORKINGDATEPLANSTART not between", value1, value2, "startworkingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateplanendIsNull() {
            addCriterion("STARTWORKINGDATEPLANEND is null");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateplanendIsNotNull() {
            addCriterion("STARTWORKINGDATEPLANEND is not null");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateplanendEqualTo(Object value) {
            addCriterion("STARTWORKINGDATEPLANEND =", value, "startworkingdateplanend");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateplanendNotEqualTo(Object value) {
            addCriterion("STARTWORKINGDATEPLANEND <>", value, "startworkingdateplanend");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateplanendGreaterThan(Object value) {
            addCriterion("STARTWORKINGDATEPLANEND >", value, "startworkingdateplanend");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateplanendGreaterThanOrEqualTo(Object value) {
            addCriterion("STARTWORKINGDATEPLANEND >=", value, "startworkingdateplanend");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateplanendLessThan(Object value) {
            addCriterion("STARTWORKINGDATEPLANEND <", value, "startworkingdateplanend");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateplanendLessThanOrEqualTo(Object value) {
            addCriterion("STARTWORKINGDATEPLANEND <=", value, "startworkingdateplanend");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateplanendIn(List<Object> values) {
            addCriterion("STARTWORKINGDATEPLANEND in", values, "startworkingdateplanend");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateplanendNotIn(List<Object> values) {
            addCriterion("STARTWORKINGDATEPLANEND not in", values, "startworkingdateplanend");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateplanendBetween(Object value1, Object value2) {
            addCriterion("STARTWORKINGDATEPLANEND between", value1, value2, "startworkingdateplanend");
            return (Criteria) this;
        }

        public Criteria andStartworkingdateplanendNotBetween(Object value1, Object value2) {
            addCriterion("STARTWORKINGDATEPLANEND not between", value1, value2, "startworkingdateplanend");
            return (Criteria) this;
        }

        public Criteria andPresaledateplanstartIsNull() {
            addCriterion("PRESALEDATEPLANSTART is null");
            return (Criteria) this;
        }

        public Criteria andPresaledateplanstartIsNotNull() {
            addCriterion("PRESALEDATEPLANSTART is not null");
            return (Criteria) this;
        }

        public Criteria andPresaledateplanstartEqualTo(Object value) {
            addCriterion("PRESALEDATEPLANSTART =", value, "presaledateplanstart");
            return (Criteria) this;
        }

        public Criteria andPresaledateplanstartNotEqualTo(Object value) {
            addCriterion("PRESALEDATEPLANSTART <>", value, "presaledateplanstart");
            return (Criteria) this;
        }

        public Criteria andPresaledateplanstartGreaterThan(Object value) {
            addCriterion("PRESALEDATEPLANSTART >", value, "presaledateplanstart");
            return (Criteria) this;
        }

        public Criteria andPresaledateplanstartGreaterThanOrEqualTo(Object value) {
            addCriterion("PRESALEDATEPLANSTART >=", value, "presaledateplanstart");
            return (Criteria) this;
        }

        public Criteria andPresaledateplanstartLessThan(Object value) {
            addCriterion("PRESALEDATEPLANSTART <", value, "presaledateplanstart");
            return (Criteria) this;
        }

        public Criteria andPresaledateplanstartLessThanOrEqualTo(Object value) {
            addCriterion("PRESALEDATEPLANSTART <=", value, "presaledateplanstart");
            return (Criteria) this;
        }

        public Criteria andPresaledateplanstartIn(List<Object> values) {
            addCriterion("PRESALEDATEPLANSTART in", values, "presaledateplanstart");
            return (Criteria) this;
        }

        public Criteria andPresaledateplanstartNotIn(List<Object> values) {
            addCriterion("PRESALEDATEPLANSTART not in", values, "presaledateplanstart");
            return (Criteria) this;
        }

        public Criteria andPresaledateplanstartBetween(Object value1, Object value2) {
            addCriterion("PRESALEDATEPLANSTART between", value1, value2, "presaledateplanstart");
            return (Criteria) this;
        }

        public Criteria andPresaledateplanstartNotBetween(Object value1, Object value2) {
            addCriterion("PRESALEDATEPLANSTART not between", value1, value2, "presaledateplanstart");
            return (Criteria) this;
        }

        public Criteria andPresaledateplanendIsNull() {
            addCriterion("PRESALEDATEPLANEND is null");
            return (Criteria) this;
        }

        public Criteria andPresaledateplanendIsNotNull() {
            addCriterion("PRESALEDATEPLANEND is not null");
            return (Criteria) this;
        }

        public Criteria andPresaledateplanendEqualTo(Object value) {
            addCriterion("PRESALEDATEPLANEND =", value, "presaledateplanend");
            return (Criteria) this;
        }

        public Criteria andPresaledateplanendNotEqualTo(Object value) {
            addCriterion("PRESALEDATEPLANEND <>", value, "presaledateplanend");
            return (Criteria) this;
        }

        public Criteria andPresaledateplanendGreaterThan(Object value) {
            addCriterion("PRESALEDATEPLANEND >", value, "presaledateplanend");
            return (Criteria) this;
        }

        public Criteria andPresaledateplanendGreaterThanOrEqualTo(Object value) {
            addCriterion("PRESALEDATEPLANEND >=", value, "presaledateplanend");
            return (Criteria) this;
        }

        public Criteria andPresaledateplanendLessThan(Object value) {
            addCriterion("PRESALEDATEPLANEND <", value, "presaledateplanend");
            return (Criteria) this;
        }

        public Criteria andPresaledateplanendLessThanOrEqualTo(Object value) {
            addCriterion("PRESALEDATEPLANEND <=", value, "presaledateplanend");
            return (Criteria) this;
        }

        public Criteria andPresaledateplanendIn(List<Object> values) {
            addCriterion("PRESALEDATEPLANEND in", values, "presaledateplanend");
            return (Criteria) this;
        }

        public Criteria andPresaledateplanendNotIn(List<Object> values) {
            addCriterion("PRESALEDATEPLANEND not in", values, "presaledateplanend");
            return (Criteria) this;
        }

        public Criteria andPresaledateplanendBetween(Object value1, Object value2) {
            addCriterion("PRESALEDATEPLANEND between", value1, value2, "presaledateplanend");
            return (Criteria) this;
        }

        public Criteria andPresaledateplanendNotBetween(Object value1, Object value2) {
            addCriterion("PRESALEDATEPLANEND not between", value1, value2, "presaledateplanend");
            return (Criteria) this;
        }

        public Criteria andOpendateplanstartIsNull() {
            addCriterion("OPENDATEPLANSTART is null");
            return (Criteria) this;
        }

        public Criteria andOpendateplanstartIsNotNull() {
            addCriterion("OPENDATEPLANSTART is not null");
            return (Criteria) this;
        }

        public Criteria andOpendateplanstartEqualTo(Object value) {
            addCriterion("OPENDATEPLANSTART =", value, "opendateplanstart");
            return (Criteria) this;
        }

        public Criteria andOpendateplanstartNotEqualTo(Object value) {
            addCriterion("OPENDATEPLANSTART <>", value, "opendateplanstart");
            return (Criteria) this;
        }

        public Criteria andOpendateplanstartGreaterThan(Object value) {
            addCriterion("OPENDATEPLANSTART >", value, "opendateplanstart");
            return (Criteria) this;
        }

        public Criteria andOpendateplanstartGreaterThanOrEqualTo(Object value) {
            addCriterion("OPENDATEPLANSTART >=", value, "opendateplanstart");
            return (Criteria) this;
        }

        public Criteria andOpendateplanstartLessThan(Object value) {
            addCriterion("OPENDATEPLANSTART <", value, "opendateplanstart");
            return (Criteria) this;
        }

        public Criteria andOpendateplanstartLessThanOrEqualTo(Object value) {
            addCriterion("OPENDATEPLANSTART <=", value, "opendateplanstart");
            return (Criteria) this;
        }

        public Criteria andOpendateplanstartIn(List<Object> values) {
            addCriterion("OPENDATEPLANSTART in", values, "opendateplanstart");
            return (Criteria) this;
        }

        public Criteria andOpendateplanstartNotIn(List<Object> values) {
            addCriterion("OPENDATEPLANSTART not in", values, "opendateplanstart");
            return (Criteria) this;
        }

        public Criteria andOpendateplanstartBetween(Object value1, Object value2) {
            addCriterion("OPENDATEPLANSTART between", value1, value2, "opendateplanstart");
            return (Criteria) this;
        }

        public Criteria andOpendateplanstartNotBetween(Object value1, Object value2) {
            addCriterion("OPENDATEPLANSTART not between", value1, value2, "opendateplanstart");
            return (Criteria) this;
        }

        public Criteria andOpendateplanendIsNull() {
            addCriterion("OPENDATEPLANEND is null");
            return (Criteria) this;
        }

        public Criteria andOpendateplanendIsNotNull() {
            addCriterion("OPENDATEPLANEND is not null");
            return (Criteria) this;
        }

        public Criteria andOpendateplanendEqualTo(Object value) {
            addCriterion("OPENDATEPLANEND =", value, "opendateplanend");
            return (Criteria) this;
        }

        public Criteria andOpendateplanendNotEqualTo(Object value) {
            addCriterion("OPENDATEPLANEND <>", value, "opendateplanend");
            return (Criteria) this;
        }

        public Criteria andOpendateplanendGreaterThan(Object value) {
            addCriterion("OPENDATEPLANEND >", value, "opendateplanend");
            return (Criteria) this;
        }

        public Criteria andOpendateplanendGreaterThanOrEqualTo(Object value) {
            addCriterion("OPENDATEPLANEND >=", value, "opendateplanend");
            return (Criteria) this;
        }

        public Criteria andOpendateplanendLessThan(Object value) {
            addCriterion("OPENDATEPLANEND <", value, "opendateplanend");
            return (Criteria) this;
        }

        public Criteria andOpendateplanendLessThanOrEqualTo(Object value) {
            addCriterion("OPENDATEPLANEND <=", value, "opendateplanend");
            return (Criteria) this;
        }

        public Criteria andOpendateplanendIn(List<Object> values) {
            addCriterion("OPENDATEPLANEND in", values, "opendateplanend");
            return (Criteria) this;
        }

        public Criteria andOpendateplanendNotIn(List<Object> values) {
            addCriterion("OPENDATEPLANEND not in", values, "opendateplanend");
            return (Criteria) this;
        }

        public Criteria andOpendateplanendBetween(Object value1, Object value2) {
            addCriterion("OPENDATEPLANEND between", value1, value2, "opendateplanend");
            return (Criteria) this;
        }

        public Criteria andOpendateplanendNotBetween(Object value1, Object value2) {
            addCriterion("OPENDATEPLANEND not between", value1, value2, "opendateplanend");
            return (Criteria) this;
        }

        public Criteria andCappingdateplanstartIsNull() {
            addCriterion("CAPPINGDATEPLANSTART is null");
            return (Criteria) this;
        }

        public Criteria andCappingdateplanstartIsNotNull() {
            addCriterion("CAPPINGDATEPLANSTART is not null");
            return (Criteria) this;
        }

        public Criteria andCappingdateplanstartEqualTo(Object value) {
            addCriterion("CAPPINGDATEPLANSTART =", value, "cappingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andCappingdateplanstartNotEqualTo(Object value) {
            addCriterion("CAPPINGDATEPLANSTART <>", value, "cappingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andCappingdateplanstartGreaterThan(Object value) {
            addCriterion("CAPPINGDATEPLANSTART >", value, "cappingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andCappingdateplanstartGreaterThanOrEqualTo(Object value) {
            addCriterion("CAPPINGDATEPLANSTART >=", value, "cappingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andCappingdateplanstartLessThan(Object value) {
            addCriterion("CAPPINGDATEPLANSTART <", value, "cappingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andCappingdateplanstartLessThanOrEqualTo(Object value) {
            addCriterion("CAPPINGDATEPLANSTART <=", value, "cappingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andCappingdateplanstartIn(List<Object> values) {
            addCriterion("CAPPINGDATEPLANSTART in", values, "cappingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andCappingdateplanstartNotIn(List<Object> values) {
            addCriterion("CAPPINGDATEPLANSTART not in", values, "cappingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andCappingdateplanstartBetween(Object value1, Object value2) {
            addCriterion("CAPPINGDATEPLANSTART between", value1, value2, "cappingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andCappingdateplanstartNotBetween(Object value1, Object value2) {
            addCriterion("CAPPINGDATEPLANSTART not between", value1, value2, "cappingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andCappingdateplanendIsNull() {
            addCriterion("CAPPINGDATEPLANEND is null");
            return (Criteria) this;
        }

        public Criteria andCappingdateplanendIsNotNull() {
            addCriterion("CAPPINGDATEPLANEND is not null");
            return (Criteria) this;
        }

        public Criteria andCappingdateplanendEqualTo(Object value) {
            addCriterion("CAPPINGDATEPLANEND =", value, "cappingdateplanend");
            return (Criteria) this;
        }

        public Criteria andCappingdateplanendNotEqualTo(Object value) {
            addCriterion("CAPPINGDATEPLANEND <>", value, "cappingdateplanend");
            return (Criteria) this;
        }

        public Criteria andCappingdateplanendGreaterThan(Object value) {
            addCriterion("CAPPINGDATEPLANEND >", value, "cappingdateplanend");
            return (Criteria) this;
        }

        public Criteria andCappingdateplanendGreaterThanOrEqualTo(Object value) {
            addCriterion("CAPPINGDATEPLANEND >=", value, "cappingdateplanend");
            return (Criteria) this;
        }

        public Criteria andCappingdateplanendLessThan(Object value) {
            addCriterion("CAPPINGDATEPLANEND <", value, "cappingdateplanend");
            return (Criteria) this;
        }

        public Criteria andCappingdateplanendLessThanOrEqualTo(Object value) {
            addCriterion("CAPPINGDATEPLANEND <=", value, "cappingdateplanend");
            return (Criteria) this;
        }

        public Criteria andCappingdateplanendIn(List<Object> values) {
            addCriterion("CAPPINGDATEPLANEND in", values, "cappingdateplanend");
            return (Criteria) this;
        }

        public Criteria andCappingdateplanendNotIn(List<Object> values) {
            addCriterion("CAPPINGDATEPLANEND not in", values, "cappingdateplanend");
            return (Criteria) this;
        }

        public Criteria andCappingdateplanendBetween(Object value1, Object value2) {
            addCriterion("CAPPINGDATEPLANEND between", value1, value2, "cappingdateplanend");
            return (Criteria) this;
        }

        public Criteria andCappingdateplanendNotBetween(Object value1, Object value2) {
            addCriterion("CAPPINGDATEPLANEND not between", value1, value2, "cappingdateplanend");
            return (Criteria) this;
        }

        public Criteria andCompletedateplanstartIsNull() {
            addCriterion("COMPLETEDATEPLANSTART is null");
            return (Criteria) this;
        }

        public Criteria andCompletedateplanstartIsNotNull() {
            addCriterion("COMPLETEDATEPLANSTART is not null");
            return (Criteria) this;
        }

        public Criteria andCompletedateplanstartEqualTo(Object value) {
            addCriterion("COMPLETEDATEPLANSTART =", value, "completedateplanstart");
            return (Criteria) this;
        }

        public Criteria andCompletedateplanstartNotEqualTo(Object value) {
            addCriterion("COMPLETEDATEPLANSTART <>", value, "completedateplanstart");
            return (Criteria) this;
        }

        public Criteria andCompletedateplanstartGreaterThan(Object value) {
            addCriterion("COMPLETEDATEPLANSTART >", value, "completedateplanstart");
            return (Criteria) this;
        }

        public Criteria andCompletedateplanstartGreaterThanOrEqualTo(Object value) {
            addCriterion("COMPLETEDATEPLANSTART >=", value, "completedateplanstart");
            return (Criteria) this;
        }

        public Criteria andCompletedateplanstartLessThan(Object value) {
            addCriterion("COMPLETEDATEPLANSTART <", value, "completedateplanstart");
            return (Criteria) this;
        }

        public Criteria andCompletedateplanstartLessThanOrEqualTo(Object value) {
            addCriterion("COMPLETEDATEPLANSTART <=", value, "completedateplanstart");
            return (Criteria) this;
        }

        public Criteria andCompletedateplanstartIn(List<Object> values) {
            addCriterion("COMPLETEDATEPLANSTART in", values, "completedateplanstart");
            return (Criteria) this;
        }

        public Criteria andCompletedateplanstartNotIn(List<Object> values) {
            addCriterion("COMPLETEDATEPLANSTART not in", values, "completedateplanstart");
            return (Criteria) this;
        }

        public Criteria andCompletedateplanstartBetween(Object value1, Object value2) {
            addCriterion("COMPLETEDATEPLANSTART between", value1, value2, "completedateplanstart");
            return (Criteria) this;
        }

        public Criteria andCompletedateplanstartNotBetween(Object value1, Object value2) {
            addCriterion("COMPLETEDATEPLANSTART not between", value1, value2, "completedateplanstart");
            return (Criteria) this;
        }

        public Criteria andCompletedateplanendIsNull() {
            addCriterion("COMPLETEDATEPLANEND is null");
            return (Criteria) this;
        }

        public Criteria andCompletedateplanendIsNotNull() {
            addCriterion("COMPLETEDATEPLANEND is not null");
            return (Criteria) this;
        }

        public Criteria andCompletedateplanendEqualTo(Object value) {
            addCriterion("COMPLETEDATEPLANEND =", value, "completedateplanend");
            return (Criteria) this;
        }

        public Criteria andCompletedateplanendNotEqualTo(Object value) {
            addCriterion("COMPLETEDATEPLANEND <>", value, "completedateplanend");
            return (Criteria) this;
        }

        public Criteria andCompletedateplanendGreaterThan(Object value) {
            addCriterion("COMPLETEDATEPLANEND >", value, "completedateplanend");
            return (Criteria) this;
        }

        public Criteria andCompletedateplanendGreaterThanOrEqualTo(Object value) {
            addCriterion("COMPLETEDATEPLANEND >=", value, "completedateplanend");
            return (Criteria) this;
        }

        public Criteria andCompletedateplanendLessThan(Object value) {
            addCriterion("COMPLETEDATEPLANEND <", value, "completedateplanend");
            return (Criteria) this;
        }

        public Criteria andCompletedateplanendLessThanOrEqualTo(Object value) {
            addCriterion("COMPLETEDATEPLANEND <=", value, "completedateplanend");
            return (Criteria) this;
        }

        public Criteria andCompletedateplanendIn(List<Object> values) {
            addCriterion("COMPLETEDATEPLANEND in", values, "completedateplanend");
            return (Criteria) this;
        }

        public Criteria andCompletedateplanendNotIn(List<Object> values) {
            addCriterion("COMPLETEDATEPLANEND not in", values, "completedateplanend");
            return (Criteria) this;
        }

        public Criteria andCompletedateplanendBetween(Object value1, Object value2) {
            addCriterion("COMPLETEDATEPLANEND between", value1, value2, "completedateplanend");
            return (Criteria) this;
        }

        public Criteria andCompletedateplanendNotBetween(Object value1, Object value2) {
            addCriterion("COMPLETEDATEPLANEND not between", value1, value2, "completedateplanend");
            return (Criteria) this;
        }

        public Criteria andHandingdateplanstartIsNull() {
            addCriterion("HANDINGDATEPLANSTART is null");
            return (Criteria) this;
        }

        public Criteria andHandingdateplanstartIsNotNull() {
            addCriterion("HANDINGDATEPLANSTART is not null");
            return (Criteria) this;
        }

        public Criteria andHandingdateplanstartEqualTo(Object value) {
            addCriterion("HANDINGDATEPLANSTART =", value, "handingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andHandingdateplanstartNotEqualTo(Object value) {
            addCriterion("HANDINGDATEPLANSTART <>", value, "handingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andHandingdateplanstartGreaterThan(Object value) {
            addCriterion("HANDINGDATEPLANSTART >", value, "handingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andHandingdateplanstartGreaterThanOrEqualTo(Object value) {
            addCriterion("HANDINGDATEPLANSTART >=", value, "handingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andHandingdateplanstartLessThan(Object value) {
            addCriterion("HANDINGDATEPLANSTART <", value, "handingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andHandingdateplanstartLessThanOrEqualTo(Object value) {
            addCriterion("HANDINGDATEPLANSTART <=", value, "handingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andHandingdateplanstartIn(List<Object> values) {
            addCriterion("HANDINGDATEPLANSTART in", values, "handingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andHandingdateplanstartNotIn(List<Object> values) {
            addCriterion("HANDINGDATEPLANSTART not in", values, "handingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andHandingdateplanstartBetween(Object value1, Object value2) {
            addCriterion("HANDINGDATEPLANSTART between", value1, value2, "handingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andHandingdateplanstartNotBetween(Object value1, Object value2) {
            addCriterion("HANDINGDATEPLANSTART not between", value1, value2, "handingdateplanstart");
            return (Criteria) this;
        }

        public Criteria andHandingdateplanendIsNull() {
            addCriterion("HANDINGDATEPLANEND is null");
            return (Criteria) this;
        }

        public Criteria andHandingdateplanendIsNotNull() {
            addCriterion("HANDINGDATEPLANEND is not null");
            return (Criteria) this;
        }

        public Criteria andHandingdateplanendEqualTo(Object value) {
            addCriterion("HANDINGDATEPLANEND =", value, "handingdateplanend");
            return (Criteria) this;
        }

        public Criteria andHandingdateplanendNotEqualTo(Object value) {
            addCriterion("HANDINGDATEPLANEND <>", value, "handingdateplanend");
            return (Criteria) this;
        }

        public Criteria andHandingdateplanendGreaterThan(Object value) {
            addCriterion("HANDINGDATEPLANEND >", value, "handingdateplanend");
            return (Criteria) this;
        }

        public Criteria andHandingdateplanendGreaterThanOrEqualTo(Object value) {
            addCriterion("HANDINGDATEPLANEND >=", value, "handingdateplanend");
            return (Criteria) this;
        }

        public Criteria andHandingdateplanendLessThan(Object value) {
            addCriterion("HANDINGDATEPLANEND <", value, "handingdateplanend");
            return (Criteria) this;
        }

        public Criteria andHandingdateplanendLessThanOrEqualTo(Object value) {
            addCriterion("HANDINGDATEPLANEND <=", value, "handingdateplanend");
            return (Criteria) this;
        }

        public Criteria andHandingdateplanendIn(List<Object> values) {
            addCriterion("HANDINGDATEPLANEND in", values, "handingdateplanend");
            return (Criteria) this;
        }

        public Criteria andHandingdateplanendNotIn(List<Object> values) {
            addCriterion("HANDINGDATEPLANEND not in", values, "handingdateplanend");
            return (Criteria) this;
        }

        public Criteria andHandingdateplanendBetween(Object value1, Object value2) {
            addCriterion("HANDINGDATEPLANEND between", value1, value2, "handingdateplanend");
            return (Criteria) this;
        }

        public Criteria andHandingdateplanendNotBetween(Object value1, Object value2) {
            addCriterion("HANDINGDATEPLANEND not between", value1, value2, "handingdateplanend");
            return (Criteria) this;
        }

        public Criteria andGaindateIsNull() {
            addCriterion("GAINDATE is null");
            return (Criteria) this;
        }

        public Criteria andGaindateIsNotNull() {
            addCriterion("GAINDATE is not null");
            return (Criteria) this;
        }

        public Criteria andGaindateEqualTo(Object value) {
            addCriterion("GAINDATE =", value, "gaindate");
            return (Criteria) this;
        }

        public Criteria andGaindateNotEqualTo(Object value) {
            addCriterion("GAINDATE <>", value, "gaindate");
            return (Criteria) this;
        }

        public Criteria andGaindateGreaterThan(Object value) {
            addCriterion("GAINDATE >", value, "gaindate");
            return (Criteria) this;
        }

        public Criteria andGaindateGreaterThanOrEqualTo(Object value) {
            addCriterion("GAINDATE >=", value, "gaindate");
            return (Criteria) this;
        }

        public Criteria andGaindateLessThan(Object value) {
            addCriterion("GAINDATE <", value, "gaindate");
            return (Criteria) this;
        }

        public Criteria andGaindateLessThanOrEqualTo(Object value) {
            addCriterion("GAINDATE <=", value, "gaindate");
            return (Criteria) this;
        }

        public Criteria andGaindateIn(List<Object> values) {
            addCriterion("GAINDATE in", values, "gaindate");
            return (Criteria) this;
        }

        public Criteria andGaindateNotIn(List<Object> values) {
            addCriterion("GAINDATE not in", values, "gaindate");
            return (Criteria) this;
        }

        public Criteria andGaindateBetween(Object value1, Object value2) {
            addCriterion("GAINDATE between", value1, value2, "gaindate");
            return (Criteria) this;
        }

        public Criteria andGaindateNotBetween(Object value1, Object value2) {
            addCriterion("GAINDATE not between", value1, value2, "gaindate");
            return (Criteria) this;
        }

        public Criteria andGainplanstartdateIsNull() {
            addCriterion("GAINPLANSTARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andGainplanstartdateIsNotNull() {
            addCriterion("GAINPLANSTARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andGainplanstartdateEqualTo(Object value) {
            addCriterion("GAINPLANSTARTDATE =", value, "gainplanstartdate");
            return (Criteria) this;
        }

        public Criteria andGainplanstartdateNotEqualTo(Object value) {
            addCriterion("GAINPLANSTARTDATE <>", value, "gainplanstartdate");
            return (Criteria) this;
        }

        public Criteria andGainplanstartdateGreaterThan(Object value) {
            addCriterion("GAINPLANSTARTDATE >", value, "gainplanstartdate");
            return (Criteria) this;
        }

        public Criteria andGainplanstartdateGreaterThanOrEqualTo(Object value) {
            addCriterion("GAINPLANSTARTDATE >=", value, "gainplanstartdate");
            return (Criteria) this;
        }

        public Criteria andGainplanstartdateLessThan(Object value) {
            addCriterion("GAINPLANSTARTDATE <", value, "gainplanstartdate");
            return (Criteria) this;
        }

        public Criteria andGainplanstartdateLessThanOrEqualTo(Object value) {
            addCriterion("GAINPLANSTARTDATE <=", value, "gainplanstartdate");
            return (Criteria) this;
        }

        public Criteria andGainplanstartdateIn(List<Object> values) {
            addCriterion("GAINPLANSTARTDATE in", values, "gainplanstartdate");
            return (Criteria) this;
        }

        public Criteria andGainplanstartdateNotIn(List<Object> values) {
            addCriterion("GAINPLANSTARTDATE not in", values, "gainplanstartdate");
            return (Criteria) this;
        }

        public Criteria andGainplanstartdateBetween(Object value1, Object value2) {
            addCriterion("GAINPLANSTARTDATE between", value1, value2, "gainplanstartdate");
            return (Criteria) this;
        }

        public Criteria andGainplanstartdateNotBetween(Object value1, Object value2) {
            addCriterion("GAINPLANSTARTDATE not between", value1, value2, "gainplanstartdate");
            return (Criteria) this;
        }

        public Criteria andGainplanenddateIsNull() {
            addCriterion("GAINPLANENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andGainplanenddateIsNotNull() {
            addCriterion("GAINPLANENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andGainplanenddateEqualTo(Object value) {
            addCriterion("GAINPLANENDDATE =", value, "gainplanenddate");
            return (Criteria) this;
        }

        public Criteria andGainplanenddateNotEqualTo(Object value) {
            addCriterion("GAINPLANENDDATE <>", value, "gainplanenddate");
            return (Criteria) this;
        }

        public Criteria andGainplanenddateGreaterThan(Object value) {
            addCriterion("GAINPLANENDDATE >", value, "gainplanenddate");
            return (Criteria) this;
        }

        public Criteria andGainplanenddateGreaterThanOrEqualTo(Object value) {
            addCriterion("GAINPLANENDDATE >=", value, "gainplanenddate");
            return (Criteria) this;
        }

        public Criteria andGainplanenddateLessThan(Object value) {
            addCriterion("GAINPLANENDDATE <", value, "gainplanenddate");
            return (Criteria) this;
        }

        public Criteria andGainplanenddateLessThanOrEqualTo(Object value) {
            addCriterion("GAINPLANENDDATE <=", value, "gainplanenddate");
            return (Criteria) this;
        }

        public Criteria andGainplanenddateIn(List<Object> values) {
            addCriterion("GAINPLANENDDATE in", values, "gainplanenddate");
            return (Criteria) this;
        }

        public Criteria andGainplanenddateNotIn(List<Object> values) {
            addCriterion("GAINPLANENDDATE not in", values, "gainplanenddate");
            return (Criteria) this;
        }

        public Criteria andGainplanenddateBetween(Object value1, Object value2) {
            addCriterion("GAINPLANENDDATE between", value1, value2, "gainplanenddate");
            return (Criteria) this;
        }

        public Criteria andGainplanenddateNotBetween(Object value1, Object value2) {
            addCriterion("GAINPLANENDDATE not between", value1, value2, "gainplanenddate");
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

        public Criteria andDowndefencesellnumEqualTo(Object value) {
            addCriterion("DOWNDEFENCESELLNUM =", value, "downdefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDowndefencesellnumNotEqualTo(Object value) {
            addCriterion("DOWNDEFENCESELLNUM <>", value, "downdefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDowndefencesellnumGreaterThan(Object value) {
            addCriterion("DOWNDEFENCESELLNUM >", value, "downdefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDowndefencesellnumGreaterThanOrEqualTo(Object value) {
            addCriterion("DOWNDEFENCESELLNUM >=", value, "downdefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDowndefencesellnumLessThan(Object value) {
            addCriterion("DOWNDEFENCESELLNUM <", value, "downdefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDowndefencesellnumLessThanOrEqualTo(Object value) {
            addCriterion("DOWNDEFENCESELLNUM <=", value, "downdefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDowndefencesellnumIn(List<Object> values) {
            addCriterion("DOWNDEFENCESELLNUM in", values, "downdefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDowndefencesellnumNotIn(List<Object> values) {
            addCriterion("DOWNDEFENCESELLNUM not in", values, "downdefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDowndefencesellnumBetween(Object value1, Object value2) {
            addCriterion("DOWNDEFENCESELLNUM between", value1, value2, "downdefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDowndefencesellnumNotBetween(Object value1, Object value2) {
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

        public Criteria andDownnondefencesellnumEqualTo(Object value) {
            addCriterion("DOWNNONDEFENCESELLNUM =", value, "downnondefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencesellnumNotEqualTo(Object value) {
            addCriterion("DOWNNONDEFENCESELLNUM <>", value, "downnondefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencesellnumGreaterThan(Object value) {
            addCriterion("DOWNNONDEFENCESELLNUM >", value, "downnondefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencesellnumGreaterThanOrEqualTo(Object value) {
            addCriterion("DOWNNONDEFENCESELLNUM >=", value, "downnondefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencesellnumLessThan(Object value) {
            addCriterion("DOWNNONDEFENCESELLNUM <", value, "downnondefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencesellnumLessThanOrEqualTo(Object value) {
            addCriterion("DOWNNONDEFENCESELLNUM <=", value, "downnondefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencesellnumIn(List<Object> values) {
            addCriterion("DOWNNONDEFENCESELLNUM in", values, "downnondefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencesellnumNotIn(List<Object> values) {
            addCriterion("DOWNNONDEFENCESELLNUM not in", values, "downnondefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencesellnumBetween(Object value1, Object value2) {
            addCriterion("DOWNNONDEFENCESELLNUM between", value1, value2, "downnondefencesellnum");
            return (Criteria) this;
        }

        public Criteria andDownnondefencesellnumNotBetween(Object value1, Object value2) {
            addCriterion("DOWNNONDEFENCESELLNUM not between", value1, value2, "downnondefencesellnum");
            return (Criteria) this;
        }

        public Criteria andApprovedateIsNull() {
            addCriterion("APPROVEDATE is null");
            return (Criteria) this;
        }

        public Criteria andApprovedateIsNotNull() {
            addCriterion("APPROVEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedateEqualTo(Object value) {
            addCriterion("APPROVEDATE =", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateNotEqualTo(Object value) {
            addCriterion("APPROVEDATE <>", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateGreaterThan(Object value) {
            addCriterion("APPROVEDATE >", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateGreaterThanOrEqualTo(Object value) {
            addCriterion("APPROVEDATE >=", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateLessThan(Object value) {
            addCriterion("APPROVEDATE <", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateLessThanOrEqualTo(Object value) {
            addCriterion("APPROVEDATE <=", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateIn(List<Object> values) {
            addCriterion("APPROVEDATE in", values, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateNotIn(List<Object> values) {
            addCriterion("APPROVEDATE not in", values, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateBetween(Object value1, Object value2) {
            addCriterion("APPROVEDATE between", value1, value2, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateNotBetween(Object value1, Object value2) {
            addCriterion("APPROVEDATE not between", value1, value2, "approvedate");
            return (Criteria) this;
        }

        public Criteria andPlateIsNull() {
            addCriterion("PLATE is null");
            return (Criteria) this;
        }

        public Criteria andPlateIsNotNull() {
            addCriterion("PLATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlateEqualTo(Object value) {
            addCriterion("PLATE =", value, "plate");
            return (Criteria) this;
        }

        public Criteria andPlateNotEqualTo(Object value) {
            addCriterion("PLATE <>", value, "plate");
            return (Criteria) this;
        }

        public Criteria andPlateGreaterThan(Object value) {
            addCriterion("PLATE >", value, "plate");
            return (Criteria) this;
        }

        public Criteria andPlateGreaterThanOrEqualTo(Object value) {
            addCriterion("PLATE >=", value, "plate");
            return (Criteria) this;
        }

        public Criteria andPlateLessThan(Object value) {
            addCriterion("PLATE <", value, "plate");
            return (Criteria) this;
        }

        public Criteria andPlateLessThanOrEqualTo(Object value) {
            addCriterion("PLATE <=", value, "plate");
            return (Criteria) this;
        }

        public Criteria andPlateIn(List<Object> values) {
            addCriterion("PLATE in", values, "plate");
            return (Criteria) this;
        }

        public Criteria andPlateNotIn(List<Object> values) {
            addCriterion("PLATE not in", values, "plate");
            return (Criteria) this;
        }

        public Criteria andPlateBetween(Object value1, Object value2) {
            addCriterion("PLATE between", value1, value2, "plate");
            return (Criteria) this;
        }

        public Criteria andPlateNotBetween(Object value1, Object value2) {
            addCriterion("PLATE not between", value1, value2, "plate");
            return (Criteria) this;
        }

        public Criteria andMarkettypeIsNull() {
            addCriterion("MARKETTYPE is null");
            return (Criteria) this;
        }

        public Criteria andMarkettypeIsNotNull() {
            addCriterion("MARKETTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMarkettypeEqualTo(Object value) {
            addCriterion("MARKETTYPE =", value, "markettype");
            return (Criteria) this;
        }

        public Criteria andMarkettypeNotEqualTo(Object value) {
            addCriterion("MARKETTYPE <>", value, "markettype");
            return (Criteria) this;
        }

        public Criteria andMarkettypeGreaterThan(Object value) {
            addCriterion("MARKETTYPE >", value, "markettype");
            return (Criteria) this;
        }

        public Criteria andMarkettypeGreaterThanOrEqualTo(Object value) {
            addCriterion("MARKETTYPE >=", value, "markettype");
            return (Criteria) this;
        }

        public Criteria andMarkettypeLessThan(Object value) {
            addCriterion("MARKETTYPE <", value, "markettype");
            return (Criteria) this;
        }

        public Criteria andMarkettypeLessThanOrEqualTo(Object value) {
            addCriterion("MARKETTYPE <=", value, "markettype");
            return (Criteria) this;
        }

        public Criteria andMarkettypeIn(List<Object> values) {
            addCriterion("MARKETTYPE in", values, "markettype");
            return (Criteria) this;
        }

        public Criteria andMarkettypeNotIn(List<Object> values) {
            addCriterion("MARKETTYPE not in", values, "markettype");
            return (Criteria) this;
        }

        public Criteria andMarkettypeBetween(Object value1, Object value2) {
            addCriterion("MARKETTYPE between", value1, value2, "markettype");
            return (Criteria) this;
        }

        public Criteria andMarkettypeNotBetween(Object value1, Object value2) {
            addCriterion("MARKETTYPE not between", value1, value2, "markettype");
            return (Criteria) this;
        }

        public Criteria andIsdifficultprojectIsNull() {
            addCriterion("ISDIFFICULTPROJECT is null");
            return (Criteria) this;
        }

        public Criteria andIsdifficultprojectIsNotNull() {
            addCriterion("ISDIFFICULTPROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andIsdifficultprojectEqualTo(Object value) {
            addCriterion("ISDIFFICULTPROJECT =", value, "isdifficultproject");
            return (Criteria) this;
        }

        public Criteria andIsdifficultprojectNotEqualTo(Object value) {
            addCriterion("ISDIFFICULTPROJECT <>", value, "isdifficultproject");
            return (Criteria) this;
        }

        public Criteria andIsdifficultprojectGreaterThan(Object value) {
            addCriterion("ISDIFFICULTPROJECT >", value, "isdifficultproject");
            return (Criteria) this;
        }

        public Criteria andIsdifficultprojectGreaterThanOrEqualTo(Object value) {
            addCriterion("ISDIFFICULTPROJECT >=", value, "isdifficultproject");
            return (Criteria) this;
        }

        public Criteria andIsdifficultprojectLessThan(Object value) {
            addCriterion("ISDIFFICULTPROJECT <", value, "isdifficultproject");
            return (Criteria) this;
        }

        public Criteria andIsdifficultprojectLessThanOrEqualTo(Object value) {
            addCriterion("ISDIFFICULTPROJECT <=", value, "isdifficultproject");
            return (Criteria) this;
        }

        public Criteria andIsdifficultprojectIn(List<Object> values) {
            addCriterion("ISDIFFICULTPROJECT in", values, "isdifficultproject");
            return (Criteria) this;
        }

        public Criteria andIsdifficultprojectNotIn(List<Object> values) {
            addCriterion("ISDIFFICULTPROJECT not in", values, "isdifficultproject");
            return (Criteria) this;
        }

        public Criteria andIsdifficultprojectBetween(Object value1, Object value2) {
            addCriterion("ISDIFFICULTPROJECT between", value1, value2, "isdifficultproject");
            return (Criteria) this;
        }

        public Criteria andIsdifficultprojectNotBetween(Object value1, Object value2) {
            addCriterion("ISDIFFICULTPROJECT not between", value1, value2, "isdifficultproject");
            return (Criteria) this;
        }

        public Criteria andOnehandsignlandcontractdateIsNull() {
            addCriterion("ONEHANDSIGNLANDCONTRACTDATE is null");
            return (Criteria) this;
        }

        public Criteria andOnehandsignlandcontractdateIsNotNull() {
            addCriterion("ONEHANDSIGNLANDCONTRACTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOnehandsignlandcontractdateEqualTo(Object value) {
            addCriterion("ONEHANDSIGNLANDCONTRACTDATE =", value, "onehandsignlandcontractdate");
            return (Criteria) this;
        }

        public Criteria andOnehandsignlandcontractdateNotEqualTo(Object value) {
            addCriterion("ONEHANDSIGNLANDCONTRACTDATE <>", value, "onehandsignlandcontractdate");
            return (Criteria) this;
        }

        public Criteria andOnehandsignlandcontractdateGreaterThan(Object value) {
            addCriterion("ONEHANDSIGNLANDCONTRACTDATE >", value, "onehandsignlandcontractdate");
            return (Criteria) this;
        }

        public Criteria andOnehandsignlandcontractdateGreaterThanOrEqualTo(Object value) {
            addCriterion("ONEHANDSIGNLANDCONTRACTDATE >=", value, "onehandsignlandcontractdate");
            return (Criteria) this;
        }

        public Criteria andOnehandsignlandcontractdateLessThan(Object value) {
            addCriterion("ONEHANDSIGNLANDCONTRACTDATE <", value, "onehandsignlandcontractdate");
            return (Criteria) this;
        }

        public Criteria andOnehandsignlandcontractdateLessThanOrEqualTo(Object value) {
            addCriterion("ONEHANDSIGNLANDCONTRACTDATE <=", value, "onehandsignlandcontractdate");
            return (Criteria) this;
        }

        public Criteria andOnehandsignlandcontractdateIn(List<Object> values) {
            addCriterion("ONEHANDSIGNLANDCONTRACTDATE in", values, "onehandsignlandcontractdate");
            return (Criteria) this;
        }

        public Criteria andOnehandsignlandcontractdateNotIn(List<Object> values) {
            addCriterion("ONEHANDSIGNLANDCONTRACTDATE not in", values, "onehandsignlandcontractdate");
            return (Criteria) this;
        }

        public Criteria andOnehandsignlandcontractdateBetween(Object value1, Object value2) {
            addCriterion("ONEHANDSIGNLANDCONTRACTDATE between", value1, value2, "onehandsignlandcontractdate");
            return (Criteria) this;
        }

        public Criteria andOnehandsignlandcontractdateNotBetween(Object value1, Object value2) {
            addCriterion("ONEHANDSIGNLANDCONTRACTDATE not between", value1, value2, "onehandsignlandcontractdate");
            return (Criteria) this;
        }

        public Criteria andSecondhandownershipchangedateIsNull() {
            addCriterion("SECONDHANDOWNERSHIPCHANGEDATE is null");
            return (Criteria) this;
        }

        public Criteria andSecondhandownershipchangedateIsNotNull() {
            addCriterion("SECONDHANDOWNERSHIPCHANGEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSecondhandownershipchangedateEqualTo(Object value) {
            addCriterion("SECONDHANDOWNERSHIPCHANGEDATE =", value, "secondhandownershipchangedate");
            return (Criteria) this;
        }

        public Criteria andSecondhandownershipchangedateNotEqualTo(Object value) {
            addCriterion("SECONDHANDOWNERSHIPCHANGEDATE <>", value, "secondhandownershipchangedate");
            return (Criteria) this;
        }

        public Criteria andSecondhandownershipchangedateGreaterThan(Object value) {
            addCriterion("SECONDHANDOWNERSHIPCHANGEDATE >", value, "secondhandownershipchangedate");
            return (Criteria) this;
        }

        public Criteria andSecondhandownershipchangedateGreaterThanOrEqualTo(Object value) {
            addCriterion("SECONDHANDOWNERSHIPCHANGEDATE >=", value, "secondhandownershipchangedate");
            return (Criteria) this;
        }

        public Criteria andSecondhandownershipchangedateLessThan(Object value) {
            addCriterion("SECONDHANDOWNERSHIPCHANGEDATE <", value, "secondhandownershipchangedate");
            return (Criteria) this;
        }

        public Criteria andSecondhandownershipchangedateLessThanOrEqualTo(Object value) {
            addCriterion("SECONDHANDOWNERSHIPCHANGEDATE <=", value, "secondhandownershipchangedate");
            return (Criteria) this;
        }

        public Criteria andSecondhandownershipchangedateIn(List<Object> values) {
            addCriterion("SECONDHANDOWNERSHIPCHANGEDATE in", values, "secondhandownershipchangedate");
            return (Criteria) this;
        }

        public Criteria andSecondhandownershipchangedateNotIn(List<Object> values) {
            addCriterion("SECONDHANDOWNERSHIPCHANGEDATE not in", values, "secondhandownershipchangedate");
            return (Criteria) this;
        }

        public Criteria andSecondhandownershipchangedateBetween(Object value1, Object value2) {
            addCriterion("SECONDHANDOWNERSHIPCHANGEDATE between", value1, value2, "secondhandownershipchangedate");
            return (Criteria) this;
        }

        public Criteria andSecondhandownershipchangedateNotBetween(Object value1, Object value2) {
            addCriterion("SECONDHANDOWNERSHIPCHANGEDATE not between", value1, value2, "secondhandownershipchangedate");
            return (Criteria) this;
        }

        public Criteria andConstructionlicencedateIsNull() {
            addCriterion("CONSTRUCTIONLICENCEDATE is null");
            return (Criteria) this;
        }

        public Criteria andConstructionlicencedateIsNotNull() {
            addCriterion("CONSTRUCTIONLICENCEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionlicencedateEqualTo(Object value) {
            addCriterion("CONSTRUCTIONLICENCEDATE =", value, "constructionlicencedate");
            return (Criteria) this;
        }

        public Criteria andConstructionlicencedateNotEqualTo(Object value) {
            addCriterion("CONSTRUCTIONLICENCEDATE <>", value, "constructionlicencedate");
            return (Criteria) this;
        }

        public Criteria andConstructionlicencedateGreaterThan(Object value) {
            addCriterion("CONSTRUCTIONLICENCEDATE >", value, "constructionlicencedate");
            return (Criteria) this;
        }

        public Criteria andConstructionlicencedateGreaterThanOrEqualTo(Object value) {
            addCriterion("CONSTRUCTIONLICENCEDATE >=", value, "constructionlicencedate");
            return (Criteria) this;
        }

        public Criteria andConstructionlicencedateLessThan(Object value) {
            addCriterion("CONSTRUCTIONLICENCEDATE <", value, "constructionlicencedate");
            return (Criteria) this;
        }

        public Criteria andConstructionlicencedateLessThanOrEqualTo(Object value) {
            addCriterion("CONSTRUCTIONLICENCEDATE <=", value, "constructionlicencedate");
            return (Criteria) this;
        }

        public Criteria andConstructionlicencedateIn(List<Object> values) {
            addCriterion("CONSTRUCTIONLICENCEDATE in", values, "constructionlicencedate");
            return (Criteria) this;
        }

        public Criteria andConstructionlicencedateNotIn(List<Object> values) {
            addCriterion("CONSTRUCTIONLICENCEDATE not in", values, "constructionlicencedate");
            return (Criteria) this;
        }

        public Criteria andConstructionlicencedateBetween(Object value1, Object value2) {
            addCriterion("CONSTRUCTIONLICENCEDATE between", value1, value2, "constructionlicencedate");
            return (Criteria) this;
        }

        public Criteria andConstructionlicencedateNotBetween(Object value1, Object value2) {
            addCriterion("CONSTRUCTIONLICENCEDATE not between", value1, value2, "constructionlicencedate");
            return (Criteria) this;
        }

        public Criteria andApprovetypeIsNull() {
            addCriterion("APPROVETYPE is null");
            return (Criteria) this;
        }

        public Criteria andApprovetypeIsNotNull() {
            addCriterion("APPROVETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andApprovetypeEqualTo(Object value) {
            addCriterion("APPROVETYPE =", value, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeNotEqualTo(Object value) {
            addCriterion("APPROVETYPE <>", value, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeGreaterThan(Object value) {
            addCriterion("APPROVETYPE >", value, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeGreaterThanOrEqualTo(Object value) {
            addCriterion("APPROVETYPE >=", value, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeLessThan(Object value) {
            addCriterion("APPROVETYPE <", value, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeLessThanOrEqualTo(Object value) {
            addCriterion("APPROVETYPE <=", value, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeIn(List<Object> values) {
            addCriterion("APPROVETYPE in", values, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeNotIn(List<Object> values) {
            addCriterion("APPROVETYPE not in", values, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeBetween(Object value1, Object value2) {
            addCriterion("APPROVETYPE between", value1, value2, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeNotBetween(Object value1, Object value2) {
            addCriterion("APPROVETYPE not between", value1, value2, "approvetype");
            return (Criteria) this;
        }

        public Criteria andAdjustremarkIsNull() {
            addCriterion("ADJUSTREMARK is null");
            return (Criteria) this;
        }

        public Criteria andAdjustremarkIsNotNull() {
            addCriterion("ADJUSTREMARK is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustremarkEqualTo(Object value) {
            addCriterion("ADJUSTREMARK =", value, "adjustremark");
            return (Criteria) this;
        }

        public Criteria andAdjustremarkNotEqualTo(Object value) {
            addCriterion("ADJUSTREMARK <>", value, "adjustremark");
            return (Criteria) this;
        }

        public Criteria andAdjustremarkGreaterThan(Object value) {
            addCriterion("ADJUSTREMARK >", value, "adjustremark");
            return (Criteria) this;
        }

        public Criteria andAdjustremarkGreaterThanOrEqualTo(Object value) {
            addCriterion("ADJUSTREMARK >=", value, "adjustremark");
            return (Criteria) this;
        }

        public Criteria andAdjustremarkLessThan(Object value) {
            addCriterion("ADJUSTREMARK <", value, "adjustremark");
            return (Criteria) this;
        }

        public Criteria andAdjustremarkLessThanOrEqualTo(Object value) {
            addCriterion("ADJUSTREMARK <=", value, "adjustremark");
            return (Criteria) this;
        }

        public Criteria andAdjustremarkIn(List<Object> values) {
            addCriterion("ADJUSTREMARK in", values, "adjustremark");
            return (Criteria) this;
        }

        public Criteria andAdjustremarkNotIn(List<Object> values) {
            addCriterion("ADJUSTREMARK not in", values, "adjustremark");
            return (Criteria) this;
        }

        public Criteria andAdjustremarkBetween(Object value1, Object value2) {
            addCriterion("ADJUSTREMARK between", value1, value2, "adjustremark");
            return (Criteria) this;
        }

        public Criteria andAdjustremarkNotBetween(Object value1, Object value2) {
            addCriterion("ADJUSTREMARK not between", value1, value2, "adjustremark");
            return (Criteria) this;
        }

        public Criteria andPhaseadjustremarkIsNull() {
            addCriterion("PHASEADJUSTREMARK is null");
            return (Criteria) this;
        }

        public Criteria andPhaseadjustremarkIsNotNull() {
            addCriterion("PHASEADJUSTREMARK is not null");
            return (Criteria) this;
        }

        public Criteria andPhaseadjustremarkEqualTo(Object value) {
            addCriterion("PHASEADJUSTREMARK =", value, "phaseadjustremark");
            return (Criteria) this;
        }

        public Criteria andPhaseadjustremarkNotEqualTo(Object value) {
            addCriterion("PHASEADJUSTREMARK <>", value, "phaseadjustremark");
            return (Criteria) this;
        }

        public Criteria andPhaseadjustremarkGreaterThan(Object value) {
            addCriterion("PHASEADJUSTREMARK >", value, "phaseadjustremark");
            return (Criteria) this;
        }

        public Criteria andPhaseadjustremarkGreaterThanOrEqualTo(Object value) {
            addCriterion("PHASEADJUSTREMARK >=", value, "phaseadjustremark");
            return (Criteria) this;
        }

        public Criteria andPhaseadjustremarkLessThan(Object value) {
            addCriterion("PHASEADJUSTREMARK <", value, "phaseadjustremark");
            return (Criteria) this;
        }

        public Criteria andPhaseadjustremarkLessThanOrEqualTo(Object value) {
            addCriterion("PHASEADJUSTREMARK <=", value, "phaseadjustremark");
            return (Criteria) this;
        }

        public Criteria andPhaseadjustremarkIn(List<Object> values) {
            addCriterion("PHASEADJUSTREMARK in", values, "phaseadjustremark");
            return (Criteria) this;
        }

        public Criteria andPhaseadjustremarkNotIn(List<Object> values) {
            addCriterion("PHASEADJUSTREMARK not in", values, "phaseadjustremark");
            return (Criteria) this;
        }

        public Criteria andPhaseadjustremarkBetween(Object value1, Object value2) {
            addCriterion("PHASEADJUSTREMARK between", value1, value2, "phaseadjustremark");
            return (Criteria) this;
        }

        public Criteria andPhaseadjustremarkNotBetween(Object value1, Object value2) {
            addCriterion("PHASEADJUSTREMARK not between", value1, value2, "phaseadjustremark");
            return (Criteria) this;
        }

        public Criteria andInstanceidhzsxIsNull() {
            addCriterion("INSTANCEIDHZSX is null");
            return (Criteria) this;
        }

        public Criteria andInstanceidhzsxIsNotNull() {
            addCriterion("INSTANCEIDHZSX is not null");
            return (Criteria) this;
        }

        public Criteria andInstanceidhzsxEqualTo(Object value) {
            addCriterion("INSTANCEIDHZSX =", value, "instanceidhzsx");
            return (Criteria) this;
        }

        public Criteria andInstanceidhzsxNotEqualTo(Object value) {
            addCriterion("INSTANCEIDHZSX <>", value, "instanceidhzsx");
            return (Criteria) this;
        }

        public Criteria andInstanceidhzsxGreaterThan(Object value) {
            addCriterion("INSTANCEIDHZSX >", value, "instanceidhzsx");
            return (Criteria) this;
        }

        public Criteria andInstanceidhzsxGreaterThanOrEqualTo(Object value) {
            addCriterion("INSTANCEIDHZSX >=", value, "instanceidhzsx");
            return (Criteria) this;
        }

        public Criteria andInstanceidhzsxLessThan(Object value) {
            addCriterion("INSTANCEIDHZSX <", value, "instanceidhzsx");
            return (Criteria) this;
        }

        public Criteria andInstanceidhzsxLessThanOrEqualTo(Object value) {
            addCriterion("INSTANCEIDHZSX <=", value, "instanceidhzsx");
            return (Criteria) this;
        }

        public Criteria andInstanceidhzsxIn(List<Object> values) {
            addCriterion("INSTANCEIDHZSX in", values, "instanceidhzsx");
            return (Criteria) this;
        }

        public Criteria andInstanceidhzsxNotIn(List<Object> values) {
            addCriterion("INSTANCEIDHZSX not in", values, "instanceidhzsx");
            return (Criteria) this;
        }

        public Criteria andInstanceidhzsxBetween(Object value1, Object value2) {
            addCriterion("INSTANCEIDHZSX between", value1, value2, "instanceidhzsx");
            return (Criteria) this;
        }

        public Criteria andInstanceidhzsxNotBetween(Object value1, Object value2) {
            addCriterion("INSTANCEIDHZSX not between", value1, value2, "instanceidhzsx");
            return (Criteria) this;
        }

        public Criteria andApprovedatehzsxIsNull() {
            addCriterion("APPROVEDATEHZSX is null");
            return (Criteria) this;
        }

        public Criteria andApprovedatehzsxIsNotNull() {
            addCriterion("APPROVEDATEHZSX is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedatehzsxEqualTo(Object value) {
            addCriterion("APPROVEDATEHZSX =", value, "approvedatehzsx");
            return (Criteria) this;
        }

        public Criteria andApprovedatehzsxNotEqualTo(Object value) {
            addCriterion("APPROVEDATEHZSX <>", value, "approvedatehzsx");
            return (Criteria) this;
        }

        public Criteria andApprovedatehzsxGreaterThan(Object value) {
            addCriterion("APPROVEDATEHZSX >", value, "approvedatehzsx");
            return (Criteria) this;
        }

        public Criteria andApprovedatehzsxGreaterThanOrEqualTo(Object value) {
            addCriterion("APPROVEDATEHZSX >=", value, "approvedatehzsx");
            return (Criteria) this;
        }

        public Criteria andApprovedatehzsxLessThan(Object value) {
            addCriterion("APPROVEDATEHZSX <", value, "approvedatehzsx");
            return (Criteria) this;
        }

        public Criteria andApprovedatehzsxLessThanOrEqualTo(Object value) {
            addCriterion("APPROVEDATEHZSX <=", value, "approvedatehzsx");
            return (Criteria) this;
        }

        public Criteria andApprovedatehzsxIn(List<Object> values) {
            addCriterion("APPROVEDATEHZSX in", values, "approvedatehzsx");
            return (Criteria) this;
        }

        public Criteria andApprovedatehzsxNotIn(List<Object> values) {
            addCriterion("APPROVEDATEHZSX not in", values, "approvedatehzsx");
            return (Criteria) this;
        }

        public Criteria andApprovedatehzsxBetween(Object value1, Object value2) {
            addCriterion("APPROVEDATEHZSX between", value1, value2, "approvedatehzsx");
            return (Criteria) this;
        }

        public Criteria andApprovedatehzsxNotBetween(Object value1, Object value2) {
            addCriterion("APPROVEDATEHZSX not between", value1, value2, "approvedatehzsx");
            return (Criteria) this;
        }

        public Criteria andApprovestatushzsxIsNull() {
            addCriterion("APPROVESTATUSHZSX is null");
            return (Criteria) this;
        }

        public Criteria andApprovestatushzsxIsNotNull() {
            addCriterion("APPROVESTATUSHZSX is not null");
            return (Criteria) this;
        }

        public Criteria andApprovestatushzsxEqualTo(Object value) {
            addCriterion("APPROVESTATUSHZSX =", value, "approvestatushzsx");
            return (Criteria) this;
        }

        public Criteria andApprovestatushzsxNotEqualTo(Object value) {
            addCriterion("APPROVESTATUSHZSX <>", value, "approvestatushzsx");
            return (Criteria) this;
        }

        public Criteria andApprovestatushzsxGreaterThan(Object value) {
            addCriterion("APPROVESTATUSHZSX >", value, "approvestatushzsx");
            return (Criteria) this;
        }

        public Criteria andApprovestatushzsxGreaterThanOrEqualTo(Object value) {
            addCriterion("APPROVESTATUSHZSX >=", value, "approvestatushzsx");
            return (Criteria) this;
        }

        public Criteria andApprovestatushzsxLessThan(Object value) {
            addCriterion("APPROVESTATUSHZSX <", value, "approvestatushzsx");
            return (Criteria) this;
        }

        public Criteria andApprovestatushzsxLessThanOrEqualTo(Object value) {
            addCriterion("APPROVESTATUSHZSX <=", value, "approvestatushzsx");
            return (Criteria) this;
        }

        public Criteria andApprovestatushzsxIn(List<Object> values) {
            addCriterion("APPROVESTATUSHZSX in", values, "approvestatushzsx");
            return (Criteria) this;
        }

        public Criteria andApprovestatushzsxNotIn(List<Object> values) {
            addCriterion("APPROVESTATUSHZSX not in", values, "approvestatushzsx");
            return (Criteria) this;
        }

        public Criteria andApprovestatushzsxBetween(Object value1, Object value2) {
            addCriterion("APPROVESTATUSHZSX between", value1, value2, "approvestatushzsx");
            return (Criteria) this;
        }

        public Criteria andApprovestatushzsxNotBetween(Object value1, Object value2) {
            addCriterion("APPROVESTATUSHZSX not between", value1, value2, "approvestatushzsx");
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

        public Criteria andRegioncodeIsNull() {
            addCriterion("REGIONCODE is null");
            return (Criteria) this;
        }

        public Criteria andRegioncodeIsNotNull() {
            addCriterion("REGIONCODE is not null");
            return (Criteria) this;
        }

        public Criteria andRegioncodeEqualTo(Object value) {
            addCriterion("REGIONCODE =", value, "regioncode");
            return (Criteria) this;
        }

        public Criteria andRegioncodeNotEqualTo(Object value) {
            addCriterion("REGIONCODE <>", value, "regioncode");
            return (Criteria) this;
        }

        public Criteria andRegioncodeGreaterThan(Object value) {
            addCriterion("REGIONCODE >", value, "regioncode");
            return (Criteria) this;
        }

        public Criteria andRegioncodeGreaterThanOrEqualTo(Object value) {
            addCriterion("REGIONCODE >=", value, "regioncode");
            return (Criteria) this;
        }

        public Criteria andRegioncodeLessThan(Object value) {
            addCriterion("REGIONCODE <", value, "regioncode");
            return (Criteria) this;
        }

        public Criteria andRegioncodeLessThanOrEqualTo(Object value) {
            addCriterion("REGIONCODE <=", value, "regioncode");
            return (Criteria) this;
        }

        public Criteria andRegioncodeIn(List<Object> values) {
            addCriterion("REGIONCODE in", values, "regioncode");
            return (Criteria) this;
        }

        public Criteria andRegioncodeNotIn(List<Object> values) {
            addCriterion("REGIONCODE not in", values, "regioncode");
            return (Criteria) this;
        }

        public Criteria andRegioncodeBetween(Object value1, Object value2) {
            addCriterion("REGIONCODE between", value1, value2, "regioncode");
            return (Criteria) this;
        }

        public Criteria andRegioncodeNotBetween(Object value1, Object value2) {
            addCriterion("REGIONCODE not between", value1, value2, "regioncode");
            return (Criteria) this;
        }

        public Criteria andRegionnameIsNull() {
            addCriterion("REGIONNAME is null");
            return (Criteria) this;
        }

        public Criteria andRegionnameIsNotNull() {
            addCriterion("REGIONNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRegionnameEqualTo(Object value) {
            addCriterion("REGIONNAME =", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameNotEqualTo(Object value) {
            addCriterion("REGIONNAME <>", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameGreaterThan(Object value) {
            addCriterion("REGIONNAME >", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameGreaterThanOrEqualTo(Object value) {
            addCriterion("REGIONNAME >=", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameLessThan(Object value) {
            addCriterion("REGIONNAME <", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameLessThanOrEqualTo(Object value) {
            addCriterion("REGIONNAME <=", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameIn(List<Object> values) {
            addCriterion("REGIONNAME in", values, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameNotIn(List<Object> values) {
            addCriterion("REGIONNAME not in", values, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameBetween(Object value1, Object value2) {
            addCriterion("REGIONNAME between", value1, value2, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameNotBetween(Object value1, Object value2) {
            addCriterion("REGIONNAME not between", value1, value2, "regionname");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeIsNull() {
            addCriterion("BUSINESSCODE is null");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeIsNotNull() {
            addCriterion("BUSINESSCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeEqualTo(Object value) {
            addCriterion("BUSINESSCODE =", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeNotEqualTo(Object value) {
            addCriterion("BUSINESSCODE <>", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeGreaterThan(Object value) {
            addCriterion("BUSINESSCODE >", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeGreaterThanOrEqualTo(Object value) {
            addCriterion("BUSINESSCODE >=", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeLessThan(Object value) {
            addCriterion("BUSINESSCODE <", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeLessThanOrEqualTo(Object value) {
            addCriterion("BUSINESSCODE <=", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeIn(List<Object> values) {
            addCriterion("BUSINESSCODE in", values, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeNotIn(List<Object> values) {
            addCriterion("BUSINESSCODE not in", values, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeBetween(Object value1, Object value2) {
            addCriterion("BUSINESSCODE between", value1, value2, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeNotBetween(Object value1, Object value2) {
            addCriterion("BUSINESSCODE not between", value1, value2, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinessunitIsNull() {
            addCriterion("BUSINESSUNIT is null");
            return (Criteria) this;
        }

        public Criteria andBusinessunitIsNotNull() {
            addCriterion("BUSINESSUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessunitEqualTo(Object value) {
            addCriterion("BUSINESSUNIT =", value, "businessunit");
            return (Criteria) this;
        }

        public Criteria andBusinessunitNotEqualTo(Object value) {
            addCriterion("BUSINESSUNIT <>", value, "businessunit");
            return (Criteria) this;
        }

        public Criteria andBusinessunitGreaterThan(Object value) {
            addCriterion("BUSINESSUNIT >", value, "businessunit");
            return (Criteria) this;
        }

        public Criteria andBusinessunitGreaterThanOrEqualTo(Object value) {
            addCriterion("BUSINESSUNIT >=", value, "businessunit");
            return (Criteria) this;
        }

        public Criteria andBusinessunitLessThan(Object value) {
            addCriterion("BUSINESSUNIT <", value, "businessunit");
            return (Criteria) this;
        }

        public Criteria andBusinessunitLessThanOrEqualTo(Object value) {
            addCriterion("BUSINESSUNIT <=", value, "businessunit");
            return (Criteria) this;
        }

        public Criteria andBusinessunitIn(List<Object> values) {
            addCriterion("BUSINESSUNIT in", values, "businessunit");
            return (Criteria) this;
        }

        public Criteria andBusinessunitNotIn(List<Object> values) {
            addCriterion("BUSINESSUNIT not in", values, "businessunit");
            return (Criteria) this;
        }

        public Criteria andBusinessunitBetween(Object value1, Object value2) {
            addCriterion("BUSINESSUNIT between", value1, value2, "businessunit");
            return (Criteria) this;
        }

        public Criteria andBusinessunitNotBetween(Object value1, Object value2) {
            addCriterion("BUSINESSUNIT not between", value1, value2, "businessunit");
            return (Criteria) this;
        }

        public Criteria andLargeareanameIsNull() {
            addCriterion("LARGEAREANAME is null");
            return (Criteria) this;
        }

        public Criteria andLargeareanameIsNotNull() {
            addCriterion("LARGEAREANAME is not null");
            return (Criteria) this;
        }

        public Criteria andLargeareanameEqualTo(Object value) {
            addCriterion("LARGEAREANAME =", value, "largeareaname");
            return (Criteria) this;
        }

        public Criteria andLargeareanameNotEqualTo(Object value) {
            addCriterion("LARGEAREANAME <>", value, "largeareaname");
            return (Criteria) this;
        }

        public Criteria andLargeareanameGreaterThan(Object value) {
            addCriterion("LARGEAREANAME >", value, "largeareaname");
            return (Criteria) this;
        }

        public Criteria andLargeareanameGreaterThanOrEqualTo(Object value) {
            addCriterion("LARGEAREANAME >=", value, "largeareaname");
            return (Criteria) this;
        }

        public Criteria andLargeareanameLessThan(Object value) {
            addCriterion("LARGEAREANAME <", value, "largeareaname");
            return (Criteria) this;
        }

        public Criteria andLargeareanameLessThanOrEqualTo(Object value) {
            addCriterion("LARGEAREANAME <=", value, "largeareaname");
            return (Criteria) this;
        }

        public Criteria andLargeareanameIn(List<Object> values) {
            addCriterion("LARGEAREANAME in", values, "largeareaname");
            return (Criteria) this;
        }

        public Criteria andLargeareanameNotIn(List<Object> values) {
            addCriterion("LARGEAREANAME not in", values, "largeareaname");
            return (Criteria) this;
        }

        public Criteria andLargeareanameBetween(Object value1, Object value2) {
            addCriterion("LARGEAREANAME between", value1, value2, "largeareaname");
            return (Criteria) this;
        }

        public Criteria andLargeareanameNotBetween(Object value1, Object value2) {
            addCriterion("LARGEAREANAME not between", value1, value2, "largeareaname");
            return (Criteria) this;
        }

        public Criteria andPublishdateIsNull() {
            addCriterion("PUBLISHDATE is null");
            return (Criteria) this;
        }

        public Criteria andPublishdateIsNotNull() {
            addCriterion("PUBLISHDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPublishdateEqualTo(Object value) {
            addCriterion("PUBLISHDATE =", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotEqualTo(Object value) {
            addCriterion("PUBLISHDATE <>", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateGreaterThan(Object value) {
            addCriterion("PUBLISHDATE >", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateGreaterThanOrEqualTo(Object value) {
            addCriterion("PUBLISHDATE >=", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLessThan(Object value) {
            addCriterion("PUBLISHDATE <", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLessThanOrEqualTo(Object value) {
            addCriterion("PUBLISHDATE <=", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateIn(List<Object> values) {
            addCriterion("PUBLISHDATE in", values, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotIn(List<Object> values) {
            addCriterion("PUBLISHDATE not in", values, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateBetween(Object value1, Object value2) {
            addCriterion("PUBLISHDATE between", value1, value2, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotBetween(Object value1, Object value2) {
            addCriterion("PUBLISHDATE not between", value1, value2, "publishdate");
            return (Criteria) this;
        }

        public Criteria andApprovalparametersIsNull() {
            addCriterion("APPROVALPARAMETERS is null");
            return (Criteria) this;
        }

        public Criteria andApprovalparametersIsNotNull() {
            addCriterion("APPROVALPARAMETERS is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalparametersEqualTo(Object value) {
            addCriterion("APPROVALPARAMETERS =", value, "approvalparameters");
            return (Criteria) this;
        }

        public Criteria andApprovalparametersNotEqualTo(Object value) {
            addCriterion("APPROVALPARAMETERS <>", value, "approvalparameters");
            return (Criteria) this;
        }

        public Criteria andApprovalparametersGreaterThan(Object value) {
            addCriterion("APPROVALPARAMETERS >", value, "approvalparameters");
            return (Criteria) this;
        }

        public Criteria andApprovalparametersGreaterThanOrEqualTo(Object value) {
            addCriterion("APPROVALPARAMETERS >=", value, "approvalparameters");
            return (Criteria) this;
        }

        public Criteria andApprovalparametersLessThan(Object value) {
            addCriterion("APPROVALPARAMETERS <", value, "approvalparameters");
            return (Criteria) this;
        }

        public Criteria andApprovalparametersLessThanOrEqualTo(Object value) {
            addCriterion("APPROVALPARAMETERS <=", value, "approvalparameters");
            return (Criteria) this;
        }

        public Criteria andApprovalparametersIn(List<Object> values) {
            addCriterion("APPROVALPARAMETERS in", values, "approvalparameters");
            return (Criteria) this;
        }

        public Criteria andApprovalparametersNotIn(List<Object> values) {
            addCriterion("APPROVALPARAMETERS not in", values, "approvalparameters");
            return (Criteria) this;
        }

        public Criteria andApprovalparametersBetween(Object value1, Object value2) {
            addCriterion("APPROVALPARAMETERS between", value1, value2, "approvalparameters");
            return (Criteria) this;
        }

        public Criteria andApprovalparametersNotBetween(Object value1, Object value2) {
            addCriterion("APPROVALPARAMETERS not between", value1, value2, "approvalparameters");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheighttypesIsNull() {
            addCriterion("BUILDINGMAXHEIGHTTYPES is null");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheighttypesIsNotNull() {
            addCriterion("BUILDINGMAXHEIGHTTYPES is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheighttypesEqualTo(Object value) {
            addCriterion("BUILDINGMAXHEIGHTTYPES =", value, "buildingmaxheighttypes");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheighttypesNotEqualTo(Object value) {
            addCriterion("BUILDINGMAXHEIGHTTYPES <>", value, "buildingmaxheighttypes");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheighttypesGreaterThan(Object value) {
            addCriterion("BUILDINGMAXHEIGHTTYPES >", value, "buildingmaxheighttypes");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheighttypesGreaterThanOrEqualTo(Object value) {
            addCriterion("BUILDINGMAXHEIGHTTYPES >=", value, "buildingmaxheighttypes");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheighttypesLessThan(Object value) {
            addCriterion("BUILDINGMAXHEIGHTTYPES <", value, "buildingmaxheighttypes");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheighttypesLessThanOrEqualTo(Object value) {
            addCriterion("BUILDINGMAXHEIGHTTYPES <=", value, "buildingmaxheighttypes");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheighttypesIn(List<Object> values) {
            addCriterion("BUILDINGMAXHEIGHTTYPES in", values, "buildingmaxheighttypes");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheighttypesNotIn(List<Object> values) {
            addCriterion("BUILDINGMAXHEIGHTTYPES not in", values, "buildingmaxheighttypes");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheighttypesBetween(Object value1, Object value2) {
            addCriterion("BUILDINGMAXHEIGHTTYPES between", value1, value2, "buildingmaxheighttypes");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxheighttypesNotBetween(Object value1, Object value2) {
            addCriterion("BUILDINGMAXHEIGHTTYPES not between", value1, value2, "buildingmaxheighttypes");
            return (Criteria) this;
        }

        public Criteria andBuildingminheighttypesIsNull() {
            addCriterion("BUILDINGMINHEIGHTTYPES is null");
            return (Criteria) this;
        }

        public Criteria andBuildingminheighttypesIsNotNull() {
            addCriterion("BUILDINGMINHEIGHTTYPES is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingminheighttypesEqualTo(Object value) {
            addCriterion("BUILDINGMINHEIGHTTYPES =", value, "buildingminheighttypes");
            return (Criteria) this;
        }

        public Criteria andBuildingminheighttypesNotEqualTo(Object value) {
            addCriterion("BUILDINGMINHEIGHTTYPES <>", value, "buildingminheighttypes");
            return (Criteria) this;
        }

        public Criteria andBuildingminheighttypesGreaterThan(Object value) {
            addCriterion("BUILDINGMINHEIGHTTYPES >", value, "buildingminheighttypes");
            return (Criteria) this;
        }

        public Criteria andBuildingminheighttypesGreaterThanOrEqualTo(Object value) {
            addCriterion("BUILDINGMINHEIGHTTYPES >=", value, "buildingminheighttypes");
            return (Criteria) this;
        }

        public Criteria andBuildingminheighttypesLessThan(Object value) {
            addCriterion("BUILDINGMINHEIGHTTYPES <", value, "buildingminheighttypes");
            return (Criteria) this;
        }

        public Criteria andBuildingminheighttypesLessThanOrEqualTo(Object value) {
            addCriterion("BUILDINGMINHEIGHTTYPES <=", value, "buildingminheighttypes");
            return (Criteria) this;
        }

        public Criteria andBuildingminheighttypesIn(List<Object> values) {
            addCriterion("BUILDINGMINHEIGHTTYPES in", values, "buildingminheighttypes");
            return (Criteria) this;
        }

        public Criteria andBuildingminheighttypesNotIn(List<Object> values) {
            addCriterion("BUILDINGMINHEIGHTTYPES not in", values, "buildingminheighttypes");
            return (Criteria) this;
        }

        public Criteria andBuildingminheighttypesBetween(Object value1, Object value2) {
            addCriterion("BUILDINGMINHEIGHTTYPES between", value1, value2, "buildingminheighttypes");
            return (Criteria) this;
        }

        public Criteria andBuildingminheighttypesNotBetween(Object value1, Object value2) {
            addCriterion("BUILDINGMINHEIGHTTYPES not between", value1, value2, "buildingminheighttypes");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxsjIsNull() {
            addCriterion("BUILDINGMAXSJ is null");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxsjIsNotNull() {
            addCriterion("BUILDINGMAXSJ is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxsjEqualTo(Object value) {
            addCriterion("BUILDINGMAXSJ =", value, "buildingmaxsj");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxsjNotEqualTo(Object value) {
            addCriterion("BUILDINGMAXSJ <>", value, "buildingmaxsj");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxsjGreaterThan(Object value) {
            addCriterion("BUILDINGMAXSJ >", value, "buildingmaxsj");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxsjGreaterThanOrEqualTo(Object value) {
            addCriterion("BUILDINGMAXSJ >=", value, "buildingmaxsj");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxsjLessThan(Object value) {
            addCriterion("BUILDINGMAXSJ <", value, "buildingmaxsj");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxsjLessThanOrEqualTo(Object value) {
            addCriterion("BUILDINGMAXSJ <=", value, "buildingmaxsj");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxsjIn(List<Object> values) {
            addCriterion("BUILDINGMAXSJ in", values, "buildingmaxsj");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxsjNotIn(List<Object> values) {
            addCriterion("BUILDINGMAXSJ not in", values, "buildingmaxsj");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxsjBetween(Object value1, Object value2) {
            addCriterion("BUILDINGMAXSJ between", value1, value2, "buildingmaxsj");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxsjNotBetween(Object value1, Object value2) {
            addCriterion("BUILDINGMAXSJ not between", value1, value2, "buildingmaxsj");
            return (Criteria) this;
        }

        public Criteria andBuildingminsjIsNull() {
            addCriterion("BUILDINGMINSJ is null");
            return (Criteria) this;
        }

        public Criteria andBuildingminsjIsNotNull() {
            addCriterion("BUILDINGMINSJ is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingminsjEqualTo(Object value) {
            addCriterion("BUILDINGMINSJ =", value, "buildingminsj");
            return (Criteria) this;
        }

        public Criteria andBuildingminsjNotEqualTo(Object value) {
            addCriterion("BUILDINGMINSJ <>", value, "buildingminsj");
            return (Criteria) this;
        }

        public Criteria andBuildingminsjGreaterThan(Object value) {
            addCriterion("BUILDINGMINSJ >", value, "buildingminsj");
            return (Criteria) this;
        }

        public Criteria andBuildingminsjGreaterThanOrEqualTo(Object value) {
            addCriterion("BUILDINGMINSJ >=", value, "buildingminsj");
            return (Criteria) this;
        }

        public Criteria andBuildingminsjLessThan(Object value) {
            addCriterion("BUILDINGMINSJ <", value, "buildingminsj");
            return (Criteria) this;
        }

        public Criteria andBuildingminsjLessThanOrEqualTo(Object value) {
            addCriterion("BUILDINGMINSJ <=", value, "buildingminsj");
            return (Criteria) this;
        }

        public Criteria andBuildingminsjIn(List<Object> values) {
            addCriterion("BUILDINGMINSJ in", values, "buildingminsj");
            return (Criteria) this;
        }

        public Criteria andBuildingminsjNotIn(List<Object> values) {
            addCriterion("BUILDINGMINSJ not in", values, "buildingminsj");
            return (Criteria) this;
        }

        public Criteria andBuildingminsjBetween(Object value1, Object value2) {
            addCriterion("BUILDINGMINSJ between", value1, value2, "buildingminsj");
            return (Criteria) this;
        }

        public Criteria andBuildingminsjNotBetween(Object value1, Object value2) {
            addCriterion("BUILDINGMINSJ not between", value1, value2, "buildingminsj");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxsjdwIsNull() {
            addCriterion("BUILDINGMAXSJDW is null");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxsjdwIsNotNull() {
            addCriterion("BUILDINGMAXSJDW is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxsjdwEqualTo(Object value) {
            addCriterion("BUILDINGMAXSJDW =", value, "buildingmaxsjdw");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxsjdwNotEqualTo(Object value) {
            addCriterion("BUILDINGMAXSJDW <>", value, "buildingmaxsjdw");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxsjdwGreaterThan(Object value) {
            addCriterion("BUILDINGMAXSJDW >", value, "buildingmaxsjdw");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxsjdwGreaterThanOrEqualTo(Object value) {
            addCriterion("BUILDINGMAXSJDW >=", value, "buildingmaxsjdw");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxsjdwLessThan(Object value) {
            addCriterion("BUILDINGMAXSJDW <", value, "buildingmaxsjdw");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxsjdwLessThanOrEqualTo(Object value) {
            addCriterion("BUILDINGMAXSJDW <=", value, "buildingmaxsjdw");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxsjdwIn(List<Object> values) {
            addCriterion("BUILDINGMAXSJDW in", values, "buildingmaxsjdw");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxsjdwNotIn(List<Object> values) {
            addCriterion("BUILDINGMAXSJDW not in", values, "buildingmaxsjdw");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxsjdwBetween(Object value1, Object value2) {
            addCriterion("BUILDINGMAXSJDW between", value1, value2, "buildingmaxsjdw");
            return (Criteria) this;
        }

        public Criteria andBuildingmaxsjdwNotBetween(Object value1, Object value2) {
            addCriterion("BUILDINGMAXSJDW not between", value1, value2, "buildingmaxsjdw");
            return (Criteria) this;
        }

        public Criteria andBuildingminsjdwIsNull() {
            addCriterion("BUILDINGMINSJDW is null");
            return (Criteria) this;
        }

        public Criteria andBuildingminsjdwIsNotNull() {
            addCriterion("BUILDINGMINSJDW is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingminsjdwEqualTo(Object value) {
            addCriterion("BUILDINGMINSJDW =", value, "buildingminsjdw");
            return (Criteria) this;
        }

        public Criteria andBuildingminsjdwNotEqualTo(Object value) {
            addCriterion("BUILDINGMINSJDW <>", value, "buildingminsjdw");
            return (Criteria) this;
        }

        public Criteria andBuildingminsjdwGreaterThan(Object value) {
            addCriterion("BUILDINGMINSJDW >", value, "buildingminsjdw");
            return (Criteria) this;
        }

        public Criteria andBuildingminsjdwGreaterThanOrEqualTo(Object value) {
            addCriterion("BUILDINGMINSJDW >=", value, "buildingminsjdw");
            return (Criteria) this;
        }

        public Criteria andBuildingminsjdwLessThan(Object value) {
            addCriterion("BUILDINGMINSJDW <", value, "buildingminsjdw");
            return (Criteria) this;
        }

        public Criteria andBuildingminsjdwLessThanOrEqualTo(Object value) {
            addCriterion("BUILDINGMINSJDW <=", value, "buildingminsjdw");
            return (Criteria) this;
        }

        public Criteria andBuildingminsjdwIn(List<Object> values) {
            addCriterion("BUILDINGMINSJDW in", values, "buildingminsjdw");
            return (Criteria) this;
        }

        public Criteria andBuildingminsjdwNotIn(List<Object> values) {
            addCriterion("BUILDINGMINSJDW not in", values, "buildingminsjdw");
            return (Criteria) this;
        }

        public Criteria andBuildingminsjdwBetween(Object value1, Object value2) {
            addCriterion("BUILDINGMINSJDW between", value1, value2, "buildingminsjdw");
            return (Criteria) this;
        }

        public Criteria andBuildingminsjdwNotBetween(Object value1, Object value2) {
            addCriterion("BUILDINGMINSJDW not between", value1, value2, "buildingminsjdw");
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