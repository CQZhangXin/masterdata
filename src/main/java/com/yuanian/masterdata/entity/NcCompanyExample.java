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

        public Criteria andPkOrgIsNull() {
            addCriterion("PK_ORG is null");
            return (Criteria) this;
        }

        public Criteria andPkOrgIsNotNull() {
            addCriterion("PK_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andPkOrgEqualTo(String value) {
            addCriterion("PK_ORG =", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotEqualTo(String value) {
            addCriterion("PK_ORG <>", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgGreaterThan(String value) {
            addCriterion("PK_ORG >", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ORG >=", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgLessThan(String value) {
            addCriterion("PK_ORG <", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgLessThanOrEqualTo(String value) {
            addCriterion("PK_ORG <=", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgLike(String value) {
            addCriterion("PK_ORG like", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotLike(String value) {
            addCriterion("PK_ORG not like", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgIn(List<String> values) {
            addCriterion("PK_ORG in", values, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotIn(List<String> values) {
            addCriterion("PK_ORG not in", values, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgBetween(String value1, String value2) {
            addCriterion("PK_ORG between", value1, value2, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotBetween(String value1, String value2) {
            addCriterion("PK_ORG not between", value1, value2, "pkOrg");
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

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
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

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNull() {
            addCriterion("SHORTNAME is null");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNotNull() {
            addCriterion("SHORTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andShortnameEqualTo(String value) {
            addCriterion("SHORTNAME =", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotEqualTo(String value) {
            addCriterion("SHORTNAME <>", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThan(String value) {
            addCriterion("SHORTNAME >", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("SHORTNAME >=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThan(String value) {
            addCriterion("SHORTNAME <", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThanOrEqualTo(String value) {
            addCriterion("SHORTNAME <=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLike(String value) {
            addCriterion("SHORTNAME like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotLike(String value) {
            addCriterion("SHORTNAME not like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameIn(List<String> values) {
            addCriterion("SHORTNAME in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotIn(List<String> values) {
            addCriterion("SHORTNAME not in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameBetween(String value1, String value2) {
            addCriterion("SHORTNAME between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotBetween(String value1, String value2) {
            addCriterion("SHORTNAME not between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andMnecodeIsNull() {
            addCriterion("MNECODE is null");
            return (Criteria) this;
        }

        public Criteria andMnecodeIsNotNull() {
            addCriterion("MNECODE is not null");
            return (Criteria) this;
        }

        public Criteria andMnecodeEqualTo(String value) {
            addCriterion("MNECODE =", value, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeNotEqualTo(String value) {
            addCriterion("MNECODE <>", value, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeGreaterThan(String value) {
            addCriterion("MNECODE >", value, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeGreaterThanOrEqualTo(String value) {
            addCriterion("MNECODE >=", value, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeLessThan(String value) {
            addCriterion("MNECODE <", value, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeLessThanOrEqualTo(String value) {
            addCriterion("MNECODE <=", value, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeLike(String value) {
            addCriterion("MNECODE like", value, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeNotLike(String value) {
            addCriterion("MNECODE not like", value, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeIn(List<String> values) {
            addCriterion("MNECODE in", values, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeNotIn(List<String> values) {
            addCriterion("MNECODE not in", values, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeBetween(String value1, String value2) {
            addCriterion("MNECODE between", value1, value2, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeNotBetween(String value1, String value2) {
            addCriterion("MNECODE not between", value1, value2, "mnecode");
            return (Criteria) this;
        }

        public Criteria andUnitcodingIsNull() {
            addCriterion("UNITCODING is null");
            return (Criteria) this;
        }

        public Criteria andUnitcodingIsNotNull() {
            addCriterion("UNITCODING is not null");
            return (Criteria) this;
        }

        public Criteria andUnitcodingEqualTo(String value) {
            addCriterion("UNITCODING =", value, "unitcoding");
            return (Criteria) this;
        }

        public Criteria andUnitcodingNotEqualTo(String value) {
            addCriterion("UNITCODING <>", value, "unitcoding");
            return (Criteria) this;
        }

        public Criteria andUnitcodingGreaterThan(String value) {
            addCriterion("UNITCODING >", value, "unitcoding");
            return (Criteria) this;
        }

        public Criteria andUnitcodingGreaterThanOrEqualTo(String value) {
            addCriterion("UNITCODING >=", value, "unitcoding");
            return (Criteria) this;
        }

        public Criteria andUnitcodingLessThan(String value) {
            addCriterion("UNITCODING <", value, "unitcoding");
            return (Criteria) this;
        }

        public Criteria andUnitcodingLessThanOrEqualTo(String value) {
            addCriterion("UNITCODING <=", value, "unitcoding");
            return (Criteria) this;
        }

        public Criteria andUnitcodingLike(String value) {
            addCriterion("UNITCODING like", value, "unitcoding");
            return (Criteria) this;
        }

        public Criteria andUnitcodingNotLike(String value) {
            addCriterion("UNITCODING not like", value, "unitcoding");
            return (Criteria) this;
        }

        public Criteria andUnitcodingIn(List<String> values) {
            addCriterion("UNITCODING in", values, "unitcoding");
            return (Criteria) this;
        }

        public Criteria andUnitcodingNotIn(List<String> values) {
            addCriterion("UNITCODING not in", values, "unitcoding");
            return (Criteria) this;
        }

        public Criteria andUnitcodingBetween(String value1, String value2) {
            addCriterion("UNITCODING between", value1, value2, "unitcoding");
            return (Criteria) this;
        }

        public Criteria andUnitcodingNotBetween(String value1, String value2) {
            addCriterion("UNITCODING not between", value1, value2, "unitcoding");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNull() {
            addCriterion("UNITNAME is null");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNotNull() {
            addCriterion("UNITNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUnitnameEqualTo(String value) {
            addCriterion("UNITNAME =", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotEqualTo(String value) {
            addCriterion("UNITNAME <>", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThan(String value) {
            addCriterion("UNITNAME >", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThanOrEqualTo(String value) {
            addCriterion("UNITNAME >=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThan(String value) {
            addCriterion("UNITNAME <", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThanOrEqualTo(String value) {
            addCriterion("UNITNAME <=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLike(String value) {
            addCriterion("UNITNAME like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotLike(String value) {
            addCriterion("UNITNAME not like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameIn(List<String> values) {
            addCriterion("UNITNAME in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotIn(List<String> values) {
            addCriterion("UNITNAME not in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameBetween(String value1, String value2) {
            addCriterion("UNITNAME between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotBetween(String value1, String value2) {
            addCriterion("UNITNAME not between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgIsNull() {
            addCriterion("PK_FATHERORG is null");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgIsNotNull() {
            addCriterion("PK_FATHERORG is not null");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgEqualTo(String value) {
            addCriterion("PK_FATHERORG =", value, "pkFatherorg");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgNotEqualTo(String value) {
            addCriterion("PK_FATHERORG <>", value, "pkFatherorg");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgGreaterThan(String value) {
            addCriterion("PK_FATHERORG >", value, "pkFatherorg");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgGreaterThanOrEqualTo(String value) {
            addCriterion("PK_FATHERORG >=", value, "pkFatherorg");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgLessThan(String value) {
            addCriterion("PK_FATHERORG <", value, "pkFatherorg");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgLessThanOrEqualTo(String value) {
            addCriterion("PK_FATHERORG <=", value, "pkFatherorg");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgLike(String value) {
            addCriterion("PK_FATHERORG like", value, "pkFatherorg");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgNotLike(String value) {
            addCriterion("PK_FATHERORG not like", value, "pkFatherorg");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgIn(List<String> values) {
            addCriterion("PK_FATHERORG in", values, "pkFatherorg");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgNotIn(List<String> values) {
            addCriterion("PK_FATHERORG not in", values, "pkFatherorg");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgBetween(String value1, String value2) {
            addCriterion("PK_FATHERORG between", value1, value2, "pkFatherorg");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgNotBetween(String value1, String value2) {
            addCriterion("PK_FATHERORG not between", value1, value2, "pkFatherorg");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeIsNull() {
            addCriterion("PK_CURRTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeIsNotNull() {
            addCriterion("PK_CURRTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeEqualTo(String value) {
            addCriterion("PK_CURRTYPE =", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeNotEqualTo(String value) {
            addCriterion("PK_CURRTYPE <>", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeGreaterThan(String value) {
            addCriterion("PK_CURRTYPE >", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeGreaterThanOrEqualTo(String value) {
            addCriterion("PK_CURRTYPE >=", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeLessThan(String value) {
            addCriterion("PK_CURRTYPE <", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeLessThanOrEqualTo(String value) {
            addCriterion("PK_CURRTYPE <=", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeLike(String value) {
            addCriterion("PK_CURRTYPE like", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeNotLike(String value) {
            addCriterion("PK_CURRTYPE not like", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeIn(List<String> values) {
            addCriterion("PK_CURRTYPE in", values, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeNotIn(List<String> values) {
            addCriterion("PK_CURRTYPE not in", values, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeBetween(String value1, String value2) {
            addCriterion("PK_CURRTYPE between", value1, value2, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeNotBetween(String value1, String value2) {
            addCriterion("PK_CURRTYPE not between", value1, value2, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andDef20IsNull() {
            addCriterion("DEF20 is null");
            return (Criteria) this;
        }

        public Criteria andDef20IsNotNull() {
            addCriterion("DEF20 is not null");
            return (Criteria) this;
        }

        public Criteria andDef20EqualTo(String value) {
            addCriterion("DEF20 =", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20NotEqualTo(String value) {
            addCriterion("DEF20 <>", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20GreaterThan(String value) {
            addCriterion("DEF20 >", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20GreaterThanOrEqualTo(String value) {
            addCriterion("DEF20 >=", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20LessThan(String value) {
            addCriterion("DEF20 <", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20LessThanOrEqualTo(String value) {
            addCriterion("DEF20 <=", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20Like(String value) {
            addCriterion("DEF20 like", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20NotLike(String value) {
            addCriterion("DEF20 not like", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20In(List<String> values) {
            addCriterion("DEF20 in", values, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20NotIn(List<String> values) {
            addCriterion("DEF20 not in", values, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20Between(String value1, String value2) {
            addCriterion("DEF20 between", value1, value2, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20NotBetween(String value1, String value2) {
            addCriterion("DEF20 not between", value1, value2, "def20");
            return (Criteria) this;
        }

        public Criteria andDef2IsNull() {
            addCriterion("DEF2 is null");
            return (Criteria) this;
        }

        public Criteria andDef2IsNotNull() {
            addCriterion("DEF2 is not null");
            return (Criteria) this;
        }

        public Criteria andDef2EqualTo(String value) {
            addCriterion("DEF2 =", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotEqualTo(String value) {
            addCriterion("DEF2 <>", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2GreaterThan(String value) {
            addCriterion("DEF2 >", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2GreaterThanOrEqualTo(String value) {
            addCriterion("DEF2 >=", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2LessThan(String value) {
            addCriterion("DEF2 <", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2LessThanOrEqualTo(String value) {
            addCriterion("DEF2 <=", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2Like(String value) {
            addCriterion("DEF2 like", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotLike(String value) {
            addCriterion("DEF2 not like", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2In(List<String> values) {
            addCriterion("DEF2 in", values, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotIn(List<String> values) {
            addCriterion("DEF2 not in", values, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2Between(String value1, String value2) {
            addCriterion("DEF2 between", value1, value2, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotBetween(String value1, String value2) {
            addCriterion("DEF2 not between", value1, value2, "def2");
            return (Criteria) this;
        }

        public Criteria andDef3IsNull() {
            addCriterion("DEF3 is null");
            return (Criteria) this;
        }

        public Criteria andDef3IsNotNull() {
            addCriterion("DEF3 is not null");
            return (Criteria) this;
        }

        public Criteria andDef3EqualTo(String value) {
            addCriterion("DEF3 =", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotEqualTo(String value) {
            addCriterion("DEF3 <>", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3GreaterThan(String value) {
            addCriterion("DEF3 >", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3GreaterThanOrEqualTo(String value) {
            addCriterion("DEF3 >=", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3LessThan(String value) {
            addCriterion("DEF3 <", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3LessThanOrEqualTo(String value) {
            addCriterion("DEF3 <=", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3Like(String value) {
            addCriterion("DEF3 like", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotLike(String value) {
            addCriterion("DEF3 not like", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3In(List<String> values) {
            addCriterion("DEF3 in", values, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotIn(List<String> values) {
            addCriterion("DEF3 not in", values, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3Between(String value1, String value2) {
            addCriterion("DEF3 between", value1, value2, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotBetween(String value1, String value2) {
            addCriterion("DEF3 not between", value1, value2, "def3");
            return (Criteria) this;
        }

        public Criteria andDef9IsNull() {
            addCriterion("DEF9 is null");
            return (Criteria) this;
        }

        public Criteria andDef9IsNotNull() {
            addCriterion("DEF9 is not null");
            return (Criteria) this;
        }

        public Criteria andDef9EqualTo(String value) {
            addCriterion("DEF9 =", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9NotEqualTo(String value) {
            addCriterion("DEF9 <>", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9GreaterThan(String value) {
            addCriterion("DEF9 >", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9GreaterThanOrEqualTo(String value) {
            addCriterion("DEF9 >=", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9LessThan(String value) {
            addCriterion("DEF9 <", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9LessThanOrEqualTo(String value) {
            addCriterion("DEF9 <=", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9Like(String value) {
            addCriterion("DEF9 like", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9NotLike(String value) {
            addCriterion("DEF9 not like", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9In(List<String> values) {
            addCriterion("DEF9 in", values, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9NotIn(List<String> values) {
            addCriterion("DEF9 not in", values, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9Between(String value1, String value2) {
            addCriterion("DEF9 between", value1, value2, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9NotBetween(String value1, String value2) {
            addCriterion("DEF9 not between", value1, value2, "def9");
            return (Criteria) this;
        }

        public Criteria andDef8IsNull() {
            addCriterion("DEF8 is null");
            return (Criteria) this;
        }

        public Criteria andDef8IsNotNull() {
            addCriterion("DEF8 is not null");
            return (Criteria) this;
        }

        public Criteria andDef8EqualTo(String value) {
            addCriterion("DEF8 =", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8NotEqualTo(String value) {
            addCriterion("DEF8 <>", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8GreaterThan(String value) {
            addCriterion("DEF8 >", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8GreaterThanOrEqualTo(String value) {
            addCriterion("DEF8 >=", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8LessThan(String value) {
            addCriterion("DEF8 <", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8LessThanOrEqualTo(String value) {
            addCriterion("DEF8 <=", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8Like(String value) {
            addCriterion("DEF8 like", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8NotLike(String value) {
            addCriterion("DEF8 not like", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8In(List<String> values) {
            addCriterion("DEF8 in", values, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8NotIn(List<String> values) {
            addCriterion("DEF8 not in", values, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8Between(String value1, String value2) {
            addCriterion("DEF8 between", value1, value2, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8NotBetween(String value1, String value2) {
            addCriterion("DEF8 not between", value1, value2, "def8");
            return (Criteria) this;
        }

        public Criteria andDef6IsNull() {
            addCriterion("DEF6 is null");
            return (Criteria) this;
        }

        public Criteria andDef6IsNotNull() {
            addCriterion("DEF6 is not null");
            return (Criteria) this;
        }

        public Criteria andDef6EqualTo(String value) {
            addCriterion("DEF6 =", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6NotEqualTo(String value) {
            addCriterion("DEF6 <>", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6GreaterThan(String value) {
            addCriterion("DEF6 >", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6GreaterThanOrEqualTo(String value) {
            addCriterion("DEF6 >=", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6LessThan(String value) {
            addCriterion("DEF6 <", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6LessThanOrEqualTo(String value) {
            addCriterion("DEF6 <=", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6Like(String value) {
            addCriterion("DEF6 like", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6NotLike(String value) {
            addCriterion("DEF6 not like", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6In(List<String> values) {
            addCriterion("DEF6 in", values, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6NotIn(List<String> values) {
            addCriterion("DEF6 not in", values, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6Between(String value1, String value2) {
            addCriterion("DEF6 between", value1, value2, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6NotBetween(String value1, String value2) {
            addCriterion("DEF6 not between", value1, value2, "def6");
            return (Criteria) this;
        }

        public Criteria andDef5IsNull() {
            addCriterion("DEF5 is null");
            return (Criteria) this;
        }

        public Criteria andDef5IsNotNull() {
            addCriterion("DEF5 is not null");
            return (Criteria) this;
        }

        public Criteria andDef5EqualTo(String value) {
            addCriterion("DEF5 =", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotEqualTo(String value) {
            addCriterion("DEF5 <>", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5GreaterThan(String value) {
            addCriterion("DEF5 >", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5GreaterThanOrEqualTo(String value) {
            addCriterion("DEF5 >=", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5LessThan(String value) {
            addCriterion("DEF5 <", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5LessThanOrEqualTo(String value) {
            addCriterion("DEF5 <=", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5Like(String value) {
            addCriterion("DEF5 like", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotLike(String value) {
            addCriterion("DEF5 not like", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5In(List<String> values) {
            addCriterion("DEF5 in", values, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotIn(List<String> values) {
            addCriterion("DEF5 not in", values, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5Between(String value1, String value2) {
            addCriterion("DEF5 between", value1, value2, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotBetween(String value1, String value2) {
            addCriterion("DEF5 not between", value1, value2, "def5");
            return (Criteria) this;
        }

        public Criteria andDef10IsNull() {
            addCriterion("DEF10 is null");
            return (Criteria) this;
        }

        public Criteria andDef10IsNotNull() {
            addCriterion("DEF10 is not null");
            return (Criteria) this;
        }

        public Criteria andDef10EqualTo(String value) {
            addCriterion("DEF10 =", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10NotEqualTo(String value) {
            addCriterion("DEF10 <>", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10GreaterThan(String value) {
            addCriterion("DEF10 >", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10GreaterThanOrEqualTo(String value) {
            addCriterion("DEF10 >=", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10LessThan(String value) {
            addCriterion("DEF10 <", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10LessThanOrEqualTo(String value) {
            addCriterion("DEF10 <=", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10Like(String value) {
            addCriterion("DEF10 like", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10NotLike(String value) {
            addCriterion("DEF10 not like", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10In(List<String> values) {
            addCriterion("DEF10 in", values, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10NotIn(List<String> values) {
            addCriterion("DEF10 not in", values, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10Between(String value1, String value2) {
            addCriterion("DEF10 between", value1, value2, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10NotBetween(String value1, String value2) {
            addCriterion("DEF10 not between", value1, value2, "def10");
            return (Criteria) this;
        }

        public Criteria andDef7IsNull() {
            addCriterion("DEF7 is null");
            return (Criteria) this;
        }

        public Criteria andDef7IsNotNull() {
            addCriterion("DEF7 is not null");
            return (Criteria) this;
        }

        public Criteria andDef7EqualTo(String value) {
            addCriterion("DEF7 =", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7NotEqualTo(String value) {
            addCriterion("DEF7 <>", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7GreaterThan(String value) {
            addCriterion("DEF7 >", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7GreaterThanOrEqualTo(String value) {
            addCriterion("DEF7 >=", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7LessThan(String value) {
            addCriterion("DEF7 <", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7LessThanOrEqualTo(String value) {
            addCriterion("DEF7 <=", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7Like(String value) {
            addCriterion("DEF7 like", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7NotLike(String value) {
            addCriterion("DEF7 not like", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7In(List<String> values) {
            addCriterion("DEF7 in", values, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7NotIn(List<String> values) {
            addCriterion("DEF7 not in", values, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7Between(String value1, String value2) {
            addCriterion("DEF7 between", value1, value2, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7NotBetween(String value1, String value2) {
            addCriterion("DEF7 not between", value1, value2, "def7");
            return (Criteria) this;
        }

        public Criteria andDef4IsNull() {
            addCriterion("DEF4 is null");
            return (Criteria) this;
        }

        public Criteria andDef4IsNotNull() {
            addCriterion("DEF4 is not null");
            return (Criteria) this;
        }

        public Criteria andDef4EqualTo(String value) {
            addCriterion("DEF4 =", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotEqualTo(String value) {
            addCriterion("DEF4 <>", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4GreaterThan(String value) {
            addCriterion("DEF4 >", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4GreaterThanOrEqualTo(String value) {
            addCriterion("DEF4 >=", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4LessThan(String value) {
            addCriterion("DEF4 <", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4LessThanOrEqualTo(String value) {
            addCriterion("DEF4 <=", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4Like(String value) {
            addCriterion("DEF4 like", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotLike(String value) {
            addCriterion("DEF4 not like", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4In(List<String> values) {
            addCriterion("DEF4 in", values, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotIn(List<String> values) {
            addCriterion("DEF4 not in", values, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4Between(String value1, String value2) {
            addCriterion("DEF4 between", value1, value2, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotBetween(String value1, String value2) {
            addCriterion("DEF4 not between", value1, value2, "def4");
            return (Criteria) this;
        }

        public Criteria andDef13IsNull() {
            addCriterion("DEF13 is null");
            return (Criteria) this;
        }

        public Criteria andDef13IsNotNull() {
            addCriterion("DEF13 is not null");
            return (Criteria) this;
        }

        public Criteria andDef13EqualTo(String value) {
            addCriterion("DEF13 =", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13NotEqualTo(String value) {
            addCriterion("DEF13 <>", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13GreaterThan(String value) {
            addCriterion("DEF13 >", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13GreaterThanOrEqualTo(String value) {
            addCriterion("DEF13 >=", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13LessThan(String value) {
            addCriterion("DEF13 <", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13LessThanOrEqualTo(String value) {
            addCriterion("DEF13 <=", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13Like(String value) {
            addCriterion("DEF13 like", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13NotLike(String value) {
            addCriterion("DEF13 not like", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13In(List<String> values) {
            addCriterion("DEF13 in", values, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13NotIn(List<String> values) {
            addCriterion("DEF13 not in", values, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13Between(String value1, String value2) {
            addCriterion("DEF13 between", value1, value2, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13NotBetween(String value1, String value2) {
            addCriterion("DEF13 not between", value1, value2, "def13");
            return (Criteria) this;
        }

        public Criteria andDef14IsNull() {
            addCriterion("DEF14 is null");
            return (Criteria) this;
        }

        public Criteria andDef14IsNotNull() {
            addCriterion("DEF14 is not null");
            return (Criteria) this;
        }

        public Criteria andDef14EqualTo(String value) {
            addCriterion("DEF14 =", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14NotEqualTo(String value) {
            addCriterion("DEF14 <>", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14GreaterThan(String value) {
            addCriterion("DEF14 >", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14GreaterThanOrEqualTo(String value) {
            addCriterion("DEF14 >=", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14LessThan(String value) {
            addCriterion("DEF14 <", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14LessThanOrEqualTo(String value) {
            addCriterion("DEF14 <=", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14Like(String value) {
            addCriterion("DEF14 like", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14NotLike(String value) {
            addCriterion("DEF14 not like", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14In(List<String> values) {
            addCriterion("DEF14 in", values, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14NotIn(List<String> values) {
            addCriterion("DEF14 not in", values, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14Between(String value1, String value2) {
            addCriterion("DEF14 between", value1, value2, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14NotBetween(String value1, String value2) {
            addCriterion("DEF14 not between", value1, value2, "def14");
            return (Criteria) this;
        }

        public Criteria andDef15IsNull() {
            addCriterion("DEF15 is null");
            return (Criteria) this;
        }

        public Criteria andDef15IsNotNull() {
            addCriterion("DEF15 is not null");
            return (Criteria) this;
        }

        public Criteria andDef15EqualTo(String value) {
            addCriterion("DEF15 =", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15NotEqualTo(String value) {
            addCriterion("DEF15 <>", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15GreaterThan(String value) {
            addCriterion("DEF15 >", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15GreaterThanOrEqualTo(String value) {
            addCriterion("DEF15 >=", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15LessThan(String value) {
            addCriterion("DEF15 <", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15LessThanOrEqualTo(String value) {
            addCriterion("DEF15 <=", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15Like(String value) {
            addCriterion("DEF15 like", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15NotLike(String value) {
            addCriterion("DEF15 not like", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15In(List<String> values) {
            addCriterion("DEF15 in", values, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15NotIn(List<String> values) {
            addCriterion("DEF15 not in", values, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15Between(String value1, String value2) {
            addCriterion("DEF15 between", value1, value2, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15NotBetween(String value1, String value2) {
            addCriterion("DEF15 not between", value1, value2, "def15");
            return (Criteria) this;
        }

        public Criteria andDef16IsNull() {
            addCriterion("DEF16 is null");
            return (Criteria) this;
        }

        public Criteria andDef16IsNotNull() {
            addCriterion("DEF16 is not null");
            return (Criteria) this;
        }

        public Criteria andDef16EqualTo(String value) {
            addCriterion("DEF16 =", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16NotEqualTo(String value) {
            addCriterion("DEF16 <>", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16GreaterThan(String value) {
            addCriterion("DEF16 >", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16GreaterThanOrEqualTo(String value) {
            addCriterion("DEF16 >=", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16LessThan(String value) {
            addCriterion("DEF16 <", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16LessThanOrEqualTo(String value) {
            addCriterion("DEF16 <=", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16Like(String value) {
            addCriterion("DEF16 like", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16NotLike(String value) {
            addCriterion("DEF16 not like", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16In(List<String> values) {
            addCriterion("DEF16 in", values, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16NotIn(List<String> values) {
            addCriterion("DEF16 not in", values, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16Between(String value1, String value2) {
            addCriterion("DEF16 between", value1, value2, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16NotBetween(String value1, String value2) {
            addCriterion("DEF16 not between", value1, value2, "def16");
            return (Criteria) this;
        }

        public Criteria andDef17IsNull() {
            addCriterion("DEF17 is null");
            return (Criteria) this;
        }

        public Criteria andDef17IsNotNull() {
            addCriterion("DEF17 is not null");
            return (Criteria) this;
        }

        public Criteria andDef17EqualTo(String value) {
            addCriterion("DEF17 =", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17NotEqualTo(String value) {
            addCriterion("DEF17 <>", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17GreaterThan(String value) {
            addCriterion("DEF17 >", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17GreaterThanOrEqualTo(String value) {
            addCriterion("DEF17 >=", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17LessThan(String value) {
            addCriterion("DEF17 <", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17LessThanOrEqualTo(String value) {
            addCriterion("DEF17 <=", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17Like(String value) {
            addCriterion("DEF17 like", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17NotLike(String value) {
            addCriterion("DEF17 not like", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17In(List<String> values) {
            addCriterion("DEF17 in", values, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17NotIn(List<String> values) {
            addCriterion("DEF17 not in", values, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17Between(String value1, String value2) {
            addCriterion("DEF17 between", value1, value2, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17NotBetween(String value1, String value2) {
            addCriterion("DEF17 not between", value1, value2, "def17");
            return (Criteria) this;
        }

        public Criteria andDef18IsNull() {
            addCriterion("DEF18 is null");
            return (Criteria) this;
        }

        public Criteria andDef18IsNotNull() {
            addCriterion("DEF18 is not null");
            return (Criteria) this;
        }

        public Criteria andDef18EqualTo(String value) {
            addCriterion("DEF18 =", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18NotEqualTo(String value) {
            addCriterion("DEF18 <>", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18GreaterThan(String value) {
            addCriterion("DEF18 >", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18GreaterThanOrEqualTo(String value) {
            addCriterion("DEF18 >=", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18LessThan(String value) {
            addCriterion("DEF18 <", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18LessThanOrEqualTo(String value) {
            addCriterion("DEF18 <=", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18Like(String value) {
            addCriterion("DEF18 like", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18NotLike(String value) {
            addCriterion("DEF18 not like", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18In(List<String> values) {
            addCriterion("DEF18 in", values, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18NotIn(List<String> values) {
            addCriterion("DEF18 not in", values, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18Between(String value1, String value2) {
            addCriterion("DEF18 between", value1, value2, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18NotBetween(String value1, String value2) {
            addCriterion("DEF18 not between", value1, value2, "def18");
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

        public Criteria andEnablestateEqualTo(String value) {
            addCriterion("ENABLESTATE =", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateNotEqualTo(String value) {
            addCriterion("ENABLESTATE <>", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateGreaterThan(String value) {
            addCriterion("ENABLESTATE >", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateGreaterThanOrEqualTo(String value) {
            addCriterion("ENABLESTATE >=", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateLessThan(String value) {
            addCriterion("ENABLESTATE <", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateLessThanOrEqualTo(String value) {
            addCriterion("ENABLESTATE <=", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateLike(String value) {
            addCriterion("ENABLESTATE like", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateNotLike(String value) {
            addCriterion("ENABLESTATE not like", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateIn(List<String> values) {
            addCriterion("ENABLESTATE in", values, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateNotIn(List<String> values) {
            addCriterion("ENABLESTATE not in", values, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateBetween(String value1, String value2) {
            addCriterion("ENABLESTATE between", value1, value2, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateNotBetween(String value1, String value2) {
            addCriterion("ENABLESTATE not between", value1, value2, "enablestate");
            return (Criteria) this;
        }

        public Criteria andLegalbodycodeIsNull() {
            addCriterion("LEGALBODYCODE is null");
            return (Criteria) this;
        }

        public Criteria andLegalbodycodeIsNotNull() {
            addCriterion("LEGALBODYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andLegalbodycodeEqualTo(String value) {
            addCriterion("LEGALBODYCODE =", value, "legalbodycode");
            return (Criteria) this;
        }

        public Criteria andLegalbodycodeNotEqualTo(String value) {
            addCriterion("LEGALBODYCODE <>", value, "legalbodycode");
            return (Criteria) this;
        }

        public Criteria andLegalbodycodeGreaterThan(String value) {
            addCriterion("LEGALBODYCODE >", value, "legalbodycode");
            return (Criteria) this;
        }

        public Criteria andLegalbodycodeGreaterThanOrEqualTo(String value) {
            addCriterion("LEGALBODYCODE >=", value, "legalbodycode");
            return (Criteria) this;
        }

        public Criteria andLegalbodycodeLessThan(String value) {
            addCriterion("LEGALBODYCODE <", value, "legalbodycode");
            return (Criteria) this;
        }

        public Criteria andLegalbodycodeLessThanOrEqualTo(String value) {
            addCriterion("LEGALBODYCODE <=", value, "legalbodycode");
            return (Criteria) this;
        }

        public Criteria andLegalbodycodeLike(String value) {
            addCriterion("LEGALBODYCODE like", value, "legalbodycode");
            return (Criteria) this;
        }

        public Criteria andLegalbodycodeNotLike(String value) {
            addCriterion("LEGALBODYCODE not like", value, "legalbodycode");
            return (Criteria) this;
        }

        public Criteria andLegalbodycodeIn(List<String> values) {
            addCriterion("LEGALBODYCODE in", values, "legalbodycode");
            return (Criteria) this;
        }

        public Criteria andLegalbodycodeNotIn(List<String> values) {
            addCriterion("LEGALBODYCODE not in", values, "legalbodycode");
            return (Criteria) this;
        }

        public Criteria andLegalbodycodeBetween(String value1, String value2) {
            addCriterion("LEGALBODYCODE between", value1, value2, "legalbodycode");
            return (Criteria) this;
        }

        public Criteria andLegalbodycodeNotBetween(String value1, String value2) {
            addCriterion("LEGALBODYCODE not between", value1, value2, "legalbodycode");
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

        public Criteria andCreatedateEqualTo(String value) {
            addCriterion("CREATEDATE =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(String value) {
            addCriterion("CREATEDATE <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(String value) {
            addCriterion("CREATEDATE >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEDATE >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(String value) {
            addCriterion("CREATEDATE <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(String value) {
            addCriterion("CREATEDATE <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLike(String value) {
            addCriterion("CREATEDATE like", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotLike(String value) {
            addCriterion("CREATEDATE not like", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<String> values) {
            addCriterion("CREATEDATE in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<String> values) {
            addCriterion("CREATEDATE not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(String value1, String value2) {
            addCriterion("CREATEDATE between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(String value1, String value2) {
            addCriterion("CREATEDATE not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andOdef20IsNull() {
            addCriterion("ODEF20 is null");
            return (Criteria) this;
        }

        public Criteria andOdef20IsNotNull() {
            addCriterion("ODEF20 is not null");
            return (Criteria) this;
        }

        public Criteria andOdef20EqualTo(String value) {
            addCriterion("ODEF20 =", value, "odef20");
            return (Criteria) this;
        }

        public Criteria andOdef20NotEqualTo(String value) {
            addCriterion("ODEF20 <>", value, "odef20");
            return (Criteria) this;
        }

        public Criteria andOdef20GreaterThan(String value) {
            addCriterion("ODEF20 >", value, "odef20");
            return (Criteria) this;
        }

        public Criteria andOdef20GreaterThanOrEqualTo(String value) {
            addCriterion("ODEF20 >=", value, "odef20");
            return (Criteria) this;
        }

        public Criteria andOdef20LessThan(String value) {
            addCriterion("ODEF20 <", value, "odef20");
            return (Criteria) this;
        }

        public Criteria andOdef20LessThanOrEqualTo(String value) {
            addCriterion("ODEF20 <=", value, "odef20");
            return (Criteria) this;
        }

        public Criteria andOdef20Like(String value) {
            addCriterion("ODEF20 like", value, "odef20");
            return (Criteria) this;
        }

        public Criteria andOdef20NotLike(String value) {
            addCriterion("ODEF20 not like", value, "odef20");
            return (Criteria) this;
        }

        public Criteria andOdef20In(List<String> values) {
            addCriterion("ODEF20 in", values, "odef20");
            return (Criteria) this;
        }

        public Criteria andOdef20NotIn(List<String> values) {
            addCriterion("ODEF20 not in", values, "odef20");
            return (Criteria) this;
        }

        public Criteria andOdef20Between(String value1, String value2) {
            addCriterion("ODEF20 between", value1, value2, "odef20");
            return (Criteria) this;
        }

        public Criteria andOdef20NotBetween(String value1, String value2) {
            addCriterion("ODEF20 not between", value1, value2, "odef20");
            return (Criteria) this;
        }

        public Criteria andOdef1IsNull() {
            addCriterion("ODEF1 is null");
            return (Criteria) this;
        }

        public Criteria andOdef1IsNotNull() {
            addCriterion("ODEF1 is not null");
            return (Criteria) this;
        }

        public Criteria andOdef1EqualTo(String value) {
            addCriterion("ODEF1 =", value, "odef1");
            return (Criteria) this;
        }

        public Criteria andOdef1NotEqualTo(String value) {
            addCriterion("ODEF1 <>", value, "odef1");
            return (Criteria) this;
        }

        public Criteria andOdef1GreaterThan(String value) {
            addCriterion("ODEF1 >", value, "odef1");
            return (Criteria) this;
        }

        public Criteria andOdef1GreaterThanOrEqualTo(String value) {
            addCriterion("ODEF1 >=", value, "odef1");
            return (Criteria) this;
        }

        public Criteria andOdef1LessThan(String value) {
            addCriterion("ODEF1 <", value, "odef1");
            return (Criteria) this;
        }

        public Criteria andOdef1LessThanOrEqualTo(String value) {
            addCriterion("ODEF1 <=", value, "odef1");
            return (Criteria) this;
        }

        public Criteria andOdef1Like(String value) {
            addCriterion("ODEF1 like", value, "odef1");
            return (Criteria) this;
        }

        public Criteria andOdef1NotLike(String value) {
            addCriterion("ODEF1 not like", value, "odef1");
            return (Criteria) this;
        }

        public Criteria andOdef1In(List<String> values) {
            addCriterion("ODEF1 in", values, "odef1");
            return (Criteria) this;
        }

        public Criteria andOdef1NotIn(List<String> values) {
            addCriterion("ODEF1 not in", values, "odef1");
            return (Criteria) this;
        }

        public Criteria andOdef1Between(String value1, String value2) {
            addCriterion("ODEF1 between", value1, value2, "odef1");
            return (Criteria) this;
        }

        public Criteria andOdef1NotBetween(String value1, String value2) {
            addCriterion("ODEF1 not between", value1, value2, "odef1");
            return (Criteria) this;
        }

        public Criteria andOdef2IsNull() {
            addCriterion("ODEF2 is null");
            return (Criteria) this;
        }

        public Criteria andOdef2IsNotNull() {
            addCriterion("ODEF2 is not null");
            return (Criteria) this;
        }

        public Criteria andOdef2EqualTo(String value) {
            addCriterion("ODEF2 =", value, "odef2");
            return (Criteria) this;
        }

        public Criteria andOdef2NotEqualTo(String value) {
            addCriterion("ODEF2 <>", value, "odef2");
            return (Criteria) this;
        }

        public Criteria andOdef2GreaterThan(String value) {
            addCriterion("ODEF2 >", value, "odef2");
            return (Criteria) this;
        }

        public Criteria andOdef2GreaterThanOrEqualTo(String value) {
            addCriterion("ODEF2 >=", value, "odef2");
            return (Criteria) this;
        }

        public Criteria andOdef2LessThan(String value) {
            addCriterion("ODEF2 <", value, "odef2");
            return (Criteria) this;
        }

        public Criteria andOdef2LessThanOrEqualTo(String value) {
            addCriterion("ODEF2 <=", value, "odef2");
            return (Criteria) this;
        }

        public Criteria andOdef2Like(String value) {
            addCriterion("ODEF2 like", value, "odef2");
            return (Criteria) this;
        }

        public Criteria andOdef2NotLike(String value) {
            addCriterion("ODEF2 not like", value, "odef2");
            return (Criteria) this;
        }

        public Criteria andOdef2In(List<String> values) {
            addCriterion("ODEF2 in", values, "odef2");
            return (Criteria) this;
        }

        public Criteria andOdef2NotIn(List<String> values) {
            addCriterion("ODEF2 not in", values, "odef2");
            return (Criteria) this;
        }

        public Criteria andOdef2Between(String value1, String value2) {
            addCriterion("ODEF2 between", value1, value2, "odef2");
            return (Criteria) this;
        }

        public Criteria andOdef2NotBetween(String value1, String value2) {
            addCriterion("ODEF2 not between", value1, value2, "odef2");
            return (Criteria) this;
        }

        public Criteria andOdef3IsNull() {
            addCriterion("ODEF3 is null");
            return (Criteria) this;
        }

        public Criteria andOdef3IsNotNull() {
            addCriterion("ODEF3 is not null");
            return (Criteria) this;
        }

        public Criteria andOdef3EqualTo(String value) {
            addCriterion("ODEF3 =", value, "odef3");
            return (Criteria) this;
        }

        public Criteria andOdef3NotEqualTo(String value) {
            addCriterion("ODEF3 <>", value, "odef3");
            return (Criteria) this;
        }

        public Criteria andOdef3GreaterThan(String value) {
            addCriterion("ODEF3 >", value, "odef3");
            return (Criteria) this;
        }

        public Criteria andOdef3GreaterThanOrEqualTo(String value) {
            addCriterion("ODEF3 >=", value, "odef3");
            return (Criteria) this;
        }

        public Criteria andOdef3LessThan(String value) {
            addCriterion("ODEF3 <", value, "odef3");
            return (Criteria) this;
        }

        public Criteria andOdef3LessThanOrEqualTo(String value) {
            addCriterion("ODEF3 <=", value, "odef3");
            return (Criteria) this;
        }

        public Criteria andOdef3Like(String value) {
            addCriterion("ODEF3 like", value, "odef3");
            return (Criteria) this;
        }

        public Criteria andOdef3NotLike(String value) {
            addCriterion("ODEF3 not like", value, "odef3");
            return (Criteria) this;
        }

        public Criteria andOdef3In(List<String> values) {
            addCriterion("ODEF3 in", values, "odef3");
            return (Criteria) this;
        }

        public Criteria andOdef3NotIn(List<String> values) {
            addCriterion("ODEF3 not in", values, "odef3");
            return (Criteria) this;
        }

        public Criteria andOdef3Between(String value1, String value2) {
            addCriterion("ODEF3 between", value1, value2, "odef3");
            return (Criteria) this;
        }

        public Criteria andOdef3NotBetween(String value1, String value2) {
            addCriterion("ODEF3 not between", value1, value2, "odef3");
            return (Criteria) this;
        }

        public Criteria andOdef4IsNull() {
            addCriterion("ODEF4 is null");
            return (Criteria) this;
        }

        public Criteria andOdef4IsNotNull() {
            addCriterion("ODEF4 is not null");
            return (Criteria) this;
        }

        public Criteria andOdef4EqualTo(String value) {
            addCriterion("ODEF4 =", value, "odef4");
            return (Criteria) this;
        }

        public Criteria andOdef4NotEqualTo(String value) {
            addCriterion("ODEF4 <>", value, "odef4");
            return (Criteria) this;
        }

        public Criteria andOdef4GreaterThan(String value) {
            addCriterion("ODEF4 >", value, "odef4");
            return (Criteria) this;
        }

        public Criteria andOdef4GreaterThanOrEqualTo(String value) {
            addCriterion("ODEF4 >=", value, "odef4");
            return (Criteria) this;
        }

        public Criteria andOdef4LessThan(String value) {
            addCriterion("ODEF4 <", value, "odef4");
            return (Criteria) this;
        }

        public Criteria andOdef4LessThanOrEqualTo(String value) {
            addCriterion("ODEF4 <=", value, "odef4");
            return (Criteria) this;
        }

        public Criteria andOdef4Like(String value) {
            addCriterion("ODEF4 like", value, "odef4");
            return (Criteria) this;
        }

        public Criteria andOdef4NotLike(String value) {
            addCriterion("ODEF4 not like", value, "odef4");
            return (Criteria) this;
        }

        public Criteria andOdef4In(List<String> values) {
            addCriterion("ODEF4 in", values, "odef4");
            return (Criteria) this;
        }

        public Criteria andOdef4NotIn(List<String> values) {
            addCriterion("ODEF4 not in", values, "odef4");
            return (Criteria) this;
        }

        public Criteria andOdef4Between(String value1, String value2) {
            addCriterion("ODEF4 between", value1, value2, "odef4");
            return (Criteria) this;
        }

        public Criteria andOdef4NotBetween(String value1, String value2) {
            addCriterion("ODEF4 not between", value1, value2, "odef4");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("CNAME is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("CNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("CNAME =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("CNAME <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("CNAME >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("CNAME >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("CNAME <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("CNAME <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("CNAME like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("CNAME not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("CNAME in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("CNAME not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("CNAME between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("CNAME not between", value1, value2, "cname");
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