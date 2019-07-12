package com.yuanian.masterdata.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NcCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NcCompanyExample() {
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

        public Criteria andJdcodeIsNull() {
            addCriterion("JDCODE is null");
            return (Criteria) this;
        }

        public Criteria andJdcodeIsNotNull() {
            addCriterion("JDCODE is not null");
            return (Criteria) this;
        }

        public Criteria andJdcodeEqualTo(Object value) {
            addCriterion("JDCODE =", value, "jdcode");
            return (Criteria) this;
        }

        public Criteria andJdcodeNotEqualTo(Object value) {
            addCriterion("JDCODE <>", value, "jdcode");
            return (Criteria) this;
        }

        public Criteria andJdcodeGreaterThan(Object value) {
            addCriterion("JDCODE >", value, "jdcode");
            return (Criteria) this;
        }

        public Criteria andJdcodeGreaterThanOrEqualTo(Object value) {
            addCriterion("JDCODE >=", value, "jdcode");
            return (Criteria) this;
        }

        public Criteria andJdcodeLessThan(Object value) {
            addCriterion("JDCODE <", value, "jdcode");
            return (Criteria) this;
        }

        public Criteria andJdcodeLessThanOrEqualTo(Object value) {
            addCriterion("JDCODE <=", value, "jdcode");
            return (Criteria) this;
        }

        public Criteria andJdcodeIn(List<Object> values) {
            addCriterion("JDCODE in", values, "jdcode");
            return (Criteria) this;
        }

        public Criteria andJdcodeNotIn(List<Object> values) {
            addCriterion("JDCODE not in", values, "jdcode");
            return (Criteria) this;
        }

        public Criteria andJdcodeBetween(Object value1, Object value2) {
            addCriterion("JDCODE between", value1, value2, "jdcode");
            return (Criteria) this;
        }

        public Criteria andJdcodeNotBetween(Object value1, Object value2) {
            addCriterion("JDCODE not between", value1, value2, "jdcode");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(Object value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(Object value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(Object value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(Object value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(Object value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(Object value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<Object> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<Object> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(Object value1, Object value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(Object value1, Object value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Object value) {
            addCriterion("COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Object value) {
            addCriterion("COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Object value) {
            addCriterion("COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Object value) {
            addCriterion("COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Object value) {
            addCriterion("COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Object value) {
            addCriterion("COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Object> values) {
            addCriterion("COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Object> values) {
            addCriterion("COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Object value1, Object value2) {
            addCriterion("COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Object value1, Object value2) {
            addCriterion("COMPANY_ID not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(Object value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(Object value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(Object value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(Object value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(Object value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(Object value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<Object> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<Object> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(Object value1, Object value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(Object value1, Object value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andFathercompanyIdIsNull() {
            addCriterion("FATHERCOMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andFathercompanyIdIsNotNull() {
            addCriterion("FATHERCOMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFathercompanyIdEqualTo(Object value) {
            addCriterion("FATHERCOMPANY_ID =", value, "fathercompanyId");
            return (Criteria) this;
        }

        public Criteria andFathercompanyIdNotEqualTo(Object value) {
            addCriterion("FATHERCOMPANY_ID <>", value, "fathercompanyId");
            return (Criteria) this;
        }

        public Criteria andFathercompanyIdGreaterThan(Object value) {
            addCriterion("FATHERCOMPANY_ID >", value, "fathercompanyId");
            return (Criteria) this;
        }

        public Criteria andFathercompanyIdGreaterThanOrEqualTo(Object value) {
            addCriterion("FATHERCOMPANY_ID >=", value, "fathercompanyId");
            return (Criteria) this;
        }

        public Criteria andFathercompanyIdLessThan(Object value) {
            addCriterion("FATHERCOMPANY_ID <", value, "fathercompanyId");
            return (Criteria) this;
        }

        public Criteria andFathercompanyIdLessThanOrEqualTo(Object value) {
            addCriterion("FATHERCOMPANY_ID <=", value, "fathercompanyId");
            return (Criteria) this;
        }

        public Criteria andFathercompanyIdIn(List<Object> values) {
            addCriterion("FATHERCOMPANY_ID in", values, "fathercompanyId");
            return (Criteria) this;
        }

        public Criteria andFathercompanyIdNotIn(List<Object> values) {
            addCriterion("FATHERCOMPANY_ID not in", values, "fathercompanyId");
            return (Criteria) this;
        }

        public Criteria andFathercompanyIdBetween(Object value1, Object value2) {
            addCriterion("FATHERCOMPANY_ID between", value1, value2, "fathercompanyId");
            return (Criteria) this;
        }

        public Criteria andFathercompanyIdNotBetween(Object value1, Object value2) {
            addCriterion("FATHERCOMPANY_ID not between", value1, value2, "fathercompanyId");
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

        public Criteria andCountryzoneIsNull() {
            addCriterion("COUNTRYZONE is null");
            return (Criteria) this;
        }

        public Criteria andCountryzoneIsNotNull() {
            addCriterion("COUNTRYZONE is not null");
            return (Criteria) this;
        }

        public Criteria andCountryzoneEqualTo(Object value) {
            addCriterion("COUNTRYZONE =", value, "countryzone");
            return (Criteria) this;
        }

        public Criteria andCountryzoneNotEqualTo(Object value) {
            addCriterion("COUNTRYZONE <>", value, "countryzone");
            return (Criteria) this;
        }

        public Criteria andCountryzoneGreaterThan(Object value) {
            addCriterion("COUNTRYZONE >", value, "countryzone");
            return (Criteria) this;
        }

        public Criteria andCountryzoneGreaterThanOrEqualTo(Object value) {
            addCriterion("COUNTRYZONE >=", value, "countryzone");
            return (Criteria) this;
        }

        public Criteria andCountryzoneLessThan(Object value) {
            addCriterion("COUNTRYZONE <", value, "countryzone");
            return (Criteria) this;
        }

        public Criteria andCountryzoneLessThanOrEqualTo(Object value) {
            addCriterion("COUNTRYZONE <=", value, "countryzone");
            return (Criteria) this;
        }

        public Criteria andCountryzoneIn(List<Object> values) {
            addCriterion("COUNTRYZONE in", values, "countryzone");
            return (Criteria) this;
        }

        public Criteria andCountryzoneNotIn(List<Object> values) {
            addCriterion("COUNTRYZONE not in", values, "countryzone");
            return (Criteria) this;
        }

        public Criteria andCountryzoneBetween(Object value1, Object value2) {
            addCriterion("COUNTRYZONE between", value1, value2, "countryzone");
            return (Criteria) this;
        }

        public Criteria andCountryzoneNotBetween(Object value1, Object value2) {
            addCriterion("COUNTRYZONE not between", value1, value2, "countryzone");
            return (Criteria) this;
        }

        public Criteria andEnablestateIsNull() {
            addCriterion("ENABLESTATE is null");
            return (Criteria) this;
        }

        public Criteria andEnablestateIsNotNull() {
            addCriterion("ENABLESTATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnablestateEqualTo(Short value) {
            addCriterion("ENABLESTATE =", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateNotEqualTo(Short value) {
            addCriterion("ENABLESTATE <>", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateGreaterThan(Short value) {
            addCriterion("ENABLESTATE >", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateGreaterThanOrEqualTo(Short value) {
            addCriterion("ENABLESTATE >=", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateLessThan(Short value) {
            addCriterion("ENABLESTATE <", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateLessThanOrEqualTo(Short value) {
            addCriterion("ENABLESTATE <=", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateIn(List<Short> values) {
            addCriterion("ENABLESTATE in", values, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateNotIn(List<Short> values) {
            addCriterion("ENABLESTATE not in", values, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateBetween(Short value1, Short value2) {
            addCriterion("ENABLESTATE between", value1, value2, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateNotBetween(Short value1, Short value2) {
            addCriterion("ENABLESTATE not between", value1, value2, "enablestate");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeIsNull() {
            addCriterion("UNIFORM_SOCIAL_CREDIT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeIsNotNull() {
            addCriterion("UNIFORM_SOCIAL_CREDIT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeEqualTo(Object value) {
            addCriterion("UNIFORM_SOCIAL_CREDIT_CODE =", value, "uniformSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeNotEqualTo(Object value) {
            addCriterion("UNIFORM_SOCIAL_CREDIT_CODE <>", value, "uniformSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeGreaterThan(Object value) {
            addCriterion("UNIFORM_SOCIAL_CREDIT_CODE >", value, "uniformSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeGreaterThanOrEqualTo(Object value) {
            addCriterion("UNIFORM_SOCIAL_CREDIT_CODE >=", value, "uniformSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeLessThan(Object value) {
            addCriterion("UNIFORM_SOCIAL_CREDIT_CODE <", value, "uniformSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeLessThanOrEqualTo(Object value) {
            addCriterion("UNIFORM_SOCIAL_CREDIT_CODE <=", value, "uniformSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeIn(List<Object> values) {
            addCriterion("UNIFORM_SOCIAL_CREDIT_CODE in", values, "uniformSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeNotIn(List<Object> values) {
            addCriterion("UNIFORM_SOCIAL_CREDIT_CODE not in", values, "uniformSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeBetween(Object value1, Object value2) {
            addCriterion("UNIFORM_SOCIAL_CREDIT_CODE between", value1, value2, "uniformSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeNotBetween(Object value1, Object value2) {
            addCriterion("UNIFORM_SOCIAL_CREDIT_CODE not between", value1, value2, "uniformSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Object value) {
            addCriterion("PROVINCE =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Object value) {
            addCriterion("PROVINCE <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Object value) {
            addCriterion("PROVINCE >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Object value) {
            addCriterion("PROVINCE >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Object value) {
            addCriterion("PROVINCE <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Object value) {
            addCriterion("PROVINCE <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Object> values) {
            addCriterion("PROVINCE in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Object> values) {
            addCriterion("PROVINCE not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Object value1, Object value2) {
            addCriterion("PROVINCE between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Object value1, Object value2) {
            addCriterion("PROVINCE not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(Object value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Object value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Object value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Object value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Object value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Object value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Object> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Object> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Object value1, Object value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Object value1, Object value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andIsCorporationIsNull() {
            addCriterion("IS_CORPORATION is null");
            return (Criteria) this;
        }

        public Criteria andIsCorporationIsNotNull() {
            addCriterion("IS_CORPORATION is not null");
            return (Criteria) this;
        }

        public Criteria andIsCorporationEqualTo(Short value) {
            addCriterion("IS_CORPORATION =", value, "isCorporation");
            return (Criteria) this;
        }

        public Criteria andIsCorporationNotEqualTo(Short value) {
            addCriterion("IS_CORPORATION <>", value, "isCorporation");
            return (Criteria) this;
        }

        public Criteria andIsCorporationGreaterThan(Short value) {
            addCriterion("IS_CORPORATION >", value, "isCorporation");
            return (Criteria) this;
        }

        public Criteria andIsCorporationGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_CORPORATION >=", value, "isCorporation");
            return (Criteria) this;
        }

        public Criteria andIsCorporationLessThan(Short value) {
            addCriterion("IS_CORPORATION <", value, "isCorporation");
            return (Criteria) this;
        }

        public Criteria andIsCorporationLessThanOrEqualTo(Short value) {
            addCriterion("IS_CORPORATION <=", value, "isCorporation");
            return (Criteria) this;
        }

        public Criteria andIsCorporationIn(List<Short> values) {
            addCriterion("IS_CORPORATION in", values, "isCorporation");
            return (Criteria) this;
        }

        public Criteria andIsCorporationNotIn(List<Short> values) {
            addCriterion("IS_CORPORATION not in", values, "isCorporation");
            return (Criteria) this;
        }

        public Criteria andIsCorporationBetween(Short value1, Short value2) {
            addCriterion("IS_CORPORATION between", value1, value2, "isCorporation");
            return (Criteria) this;
        }

        public Criteria andIsCorporationNotBetween(Short value1, Short value2) {
            addCriterion("IS_CORPORATION not between", value1, value2, "isCorporation");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNull() {
            addCriterion("COMPANY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNotNull() {
            addCriterion("COMPANY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeEqualTo(Short value) {
            addCriterion("COMPANY_TYPE =", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotEqualTo(Short value) {
            addCriterion("COMPANY_TYPE <>", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThan(Short value) {
            addCriterion("COMPANY_TYPE >", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("COMPANY_TYPE >=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThan(Short value) {
            addCriterion("COMPANY_TYPE <", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThanOrEqualTo(Short value) {
            addCriterion("COMPANY_TYPE <=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIn(List<Short> values) {
            addCriterion("COMPANY_TYPE in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotIn(List<Short> values) {
            addCriterion("COMPANY_TYPE not in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeBetween(Short value1, Short value2) {
            addCriterion("COMPANY_TYPE between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotBetween(Short value1, Short value2) {
            addCriterion("COMPANY_TYPE not between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIsNull() {
            addCriterion("MODIFIEDTIME is null");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIsNotNull() {
            addCriterion("MODIFIEDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeEqualTo(Object value) {
            addCriterion("MODIFIEDTIME =", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotEqualTo(Object value) {
            addCriterion("MODIFIEDTIME <>", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeGreaterThan(Object value) {
            addCriterion("MODIFIEDTIME >", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeGreaterThanOrEqualTo(Object value) {
            addCriterion("MODIFIEDTIME >=", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLessThan(Object value) {
            addCriterion("MODIFIEDTIME <", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLessThanOrEqualTo(Object value) {
            addCriterion("MODIFIEDTIME <=", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIn(List<Object> values) {
            addCriterion("MODIFIEDTIME in", values, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotIn(List<Object> values) {
            addCriterion("MODIFIEDTIME not in", values, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeBetween(Object value1, Object value2) {
            addCriterion("MODIFIEDTIME between", value1, value2, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotBetween(Object value1, Object value2) {
            addCriterion("MODIFIEDTIME not between", value1, value2, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("MODIFIER is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("MODIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(Object value) {
            addCriterion("MODIFIER =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(Object value) {
            addCriterion("MODIFIER <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(Object value) {
            addCriterion("MODIFIER >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(Object value) {
            addCriterion("MODIFIER >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(Object value) {
            addCriterion("MODIFIER <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(Object value) {
            addCriterion("MODIFIER <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<Object> values) {
            addCriterion("MODIFIER in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<Object> values) {
            addCriterion("MODIFIER not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(Object value1, Object value2) {
            addCriterion("MODIFIER between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(Object value1, Object value2) {
            addCriterion("MODIFIER not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNull() {
            addCriterion("CREATIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNotNull() {
            addCriterion("CREATIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeEqualTo(Object value) {
            addCriterion("CREATIONTIME =", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotEqualTo(Object value) {
            addCriterion("CREATIONTIME <>", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThan(Object value) {
            addCriterion("CREATIONTIME >", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThanOrEqualTo(Object value) {
            addCriterion("CREATIONTIME >=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThan(Object value) {
            addCriterion("CREATIONTIME <", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThanOrEqualTo(Object value) {
            addCriterion("CREATIONTIME <=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIn(List<Object> values) {
            addCriterion("CREATIONTIME in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotIn(List<Object> values) {
            addCriterion("CREATIONTIME not in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeBetween(Object value1, Object value2) {
            addCriterion("CREATIONTIME between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotBetween(Object value1, Object value2) {
            addCriterion("CREATIONTIME not between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(Object value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(Object value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(Object value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(Object value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(Object value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(Object value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<Object> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<Object> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(Object value1, Object value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(Object value1, Object value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andPkSourceIsNull() {
            addCriterion("PK_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andPkSourceIsNotNull() {
            addCriterion("PK_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andPkSourceEqualTo(Object value) {
            addCriterion("PK_SOURCE =", value, "pkSource");
            return (Criteria) this;
        }

        public Criteria andPkSourceNotEqualTo(Object value) {
            addCriterion("PK_SOURCE <>", value, "pkSource");
            return (Criteria) this;
        }

        public Criteria andPkSourceGreaterThan(Object value) {
            addCriterion("PK_SOURCE >", value, "pkSource");
            return (Criteria) this;
        }

        public Criteria andPkSourceGreaterThanOrEqualTo(Object value) {
            addCriterion("PK_SOURCE >=", value, "pkSource");
            return (Criteria) this;
        }

        public Criteria andPkSourceLessThan(Object value) {
            addCriterion("PK_SOURCE <", value, "pkSource");
            return (Criteria) this;
        }

        public Criteria andPkSourceLessThanOrEqualTo(Object value) {
            addCriterion("PK_SOURCE <=", value, "pkSource");
            return (Criteria) this;
        }

        public Criteria andPkSourceIn(List<Object> values) {
            addCriterion("PK_SOURCE in", values, "pkSource");
            return (Criteria) this;
        }

        public Criteria andPkSourceNotIn(List<Object> values) {
            addCriterion("PK_SOURCE not in", values, "pkSource");
            return (Criteria) this;
        }

        public Criteria andPkSourceBetween(Object value1, Object value2) {
            addCriterion("PK_SOURCE between", value1, value2, "pkSource");
            return (Criteria) this;
        }

        public Criteria andPkSourceNotBetween(Object value1, Object value2) {
            addCriterion("PK_SOURCE not between", value1, value2, "pkSource");
            return (Criteria) this;
        }

        public Criteria andSourceSystemIsNull() {
            addCriterion("SOURCE_SYSTEM is null");
            return (Criteria) this;
        }

        public Criteria andSourceSystemIsNotNull() {
            addCriterion("SOURCE_SYSTEM is not null");
            return (Criteria) this;
        }

        public Criteria andSourceSystemEqualTo(Object value) {
            addCriterion("SOURCE_SYSTEM =", value, "sourceSystem");
            return (Criteria) this;
        }

        public Criteria andSourceSystemNotEqualTo(Object value) {
            addCriterion("SOURCE_SYSTEM <>", value, "sourceSystem");
            return (Criteria) this;
        }

        public Criteria andSourceSystemGreaterThan(Object value) {
            addCriterion("SOURCE_SYSTEM >", value, "sourceSystem");
            return (Criteria) this;
        }

        public Criteria andSourceSystemGreaterThanOrEqualTo(Object value) {
            addCriterion("SOURCE_SYSTEM >=", value, "sourceSystem");
            return (Criteria) this;
        }

        public Criteria andSourceSystemLessThan(Object value) {
            addCriterion("SOURCE_SYSTEM <", value, "sourceSystem");
            return (Criteria) this;
        }

        public Criteria andSourceSystemLessThanOrEqualTo(Object value) {
            addCriterion("SOURCE_SYSTEM <=", value, "sourceSystem");
            return (Criteria) this;
        }

        public Criteria andSourceSystemIn(List<Object> values) {
            addCriterion("SOURCE_SYSTEM in", values, "sourceSystem");
            return (Criteria) this;
        }

        public Criteria andSourceSystemNotIn(List<Object> values) {
            addCriterion("SOURCE_SYSTEM not in", values, "sourceSystem");
            return (Criteria) this;
        }

        public Criteria andSourceSystemBetween(Object value1, Object value2) {
            addCriterion("SOURCE_SYSTEM between", value1, value2, "sourceSystem");
            return (Criteria) this;
        }

        public Criteria andSourceSystemNotBetween(Object value1, Object value2) {
            addCriterion("SOURCE_SYSTEM not between", value1, value2, "sourceSystem");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNull() {
            addCriterion("RECEIVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNotNull() {
            addCriterion("RECEIVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeEqualTo(Object value) {
            addCriterion("RECEIVE_TIME =", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotEqualTo(Object value) {
            addCriterion("RECEIVE_TIME <>", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThan(Object value) {
            addCriterion("RECEIVE_TIME >", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThanOrEqualTo(Object value) {
            addCriterion("RECEIVE_TIME >=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThan(Object value) {
            addCriterion("RECEIVE_TIME <", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThanOrEqualTo(Object value) {
            addCriterion("RECEIVE_TIME <=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIn(List<Object> values) {
            addCriterion("RECEIVE_TIME in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotIn(List<Object> values) {
            addCriterion("RECEIVE_TIME not in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeBetween(Object value1, Object value2) {
            addCriterion("RECEIVE_TIME between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotBetween(Object value1, Object value2) {
            addCriterion("RECEIVE_TIME not between", value1, value2, "receiveTime");
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