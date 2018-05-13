package com.sac.pojo;

import java.util.ArrayList;
import java.util.List;

public class SacCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SacCourseExample() {
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

        public Criteria andCourseidIsNull() {
            addCriterion("courseid is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseid is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(Integer value) {
            addCriterion("courseid =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(Integer value) {
            addCriterion("courseid <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(Integer value) {
            addCriterion("courseid >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseid >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(Integer value) {
            addCriterion("courseid <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(Integer value) {
            addCriterion("courseid <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<Integer> values) {
            addCriterion("courseid in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<Integer> values) {
            addCriterion("courseid not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(Integer value1, Integer value2) {
            addCriterion("courseid between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseid not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNull() {
            addCriterion("coursename is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNotNull() {
            addCriterion("coursename is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameEqualTo(String value) {
            addCriterion("coursename =", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotEqualTo(String value) {
            addCriterion("coursename <>", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThan(String value) {
            addCriterion("coursename >", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThanOrEqualTo(String value) {
            addCriterion("coursename >=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThan(String value) {
            addCriterion("coursename <", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThanOrEqualTo(String value) {
            addCriterion("coursename <=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLike(String value) {
            addCriterion("coursename like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotLike(String value) {
            addCriterion("coursename not like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameIn(List<String> values) {
            addCriterion("coursename in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotIn(List<String> values) {
            addCriterion("coursename not in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameBetween(String value1, String value2) {
            addCriterion("coursename between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotBetween(String value1, String value2) {
            addCriterion("coursename not between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCourseteacherIsNull() {
            addCriterion("courseteacher is null");
            return (Criteria) this;
        }

        public Criteria andCourseteacherIsNotNull() {
            addCriterion("courseteacher is not null");
            return (Criteria) this;
        }

        public Criteria andCourseteacherEqualTo(String value) {
            addCriterion("courseteacher =", value, "courseteacher");
            return (Criteria) this;
        }

        public Criteria andCourseteacherNotEqualTo(String value) {
            addCriterion("courseteacher <>", value, "courseteacher");
            return (Criteria) this;
        }

        public Criteria andCourseteacherGreaterThan(String value) {
            addCriterion("courseteacher >", value, "courseteacher");
            return (Criteria) this;
        }

        public Criteria andCourseteacherGreaterThanOrEqualTo(String value) {
            addCriterion("courseteacher >=", value, "courseteacher");
            return (Criteria) this;
        }

        public Criteria andCourseteacherLessThan(String value) {
            addCriterion("courseteacher <", value, "courseteacher");
            return (Criteria) this;
        }

        public Criteria andCourseteacherLessThanOrEqualTo(String value) {
            addCriterion("courseteacher <=", value, "courseteacher");
            return (Criteria) this;
        }

        public Criteria andCourseteacherLike(String value) {
            addCriterion("courseteacher like", value, "courseteacher");
            return (Criteria) this;
        }

        public Criteria andCourseteacherNotLike(String value) {
            addCriterion("courseteacher not like", value, "courseteacher");
            return (Criteria) this;
        }

        public Criteria andCourseteacherIn(List<String> values) {
            addCriterion("courseteacher in", values, "courseteacher");
            return (Criteria) this;
        }

        public Criteria andCourseteacherNotIn(List<String> values) {
            addCriterion("courseteacher not in", values, "courseteacher");
            return (Criteria) this;
        }

        public Criteria andCourseteacherBetween(String value1, String value2) {
            addCriterion("courseteacher between", value1, value2, "courseteacher");
            return (Criteria) this;
        }

        public Criteria andCourseteacherNotBetween(String value1, String value2) {
            addCriterion("courseteacher not between", value1, value2, "courseteacher");
            return (Criteria) this;
        }

        public Criteria andCoursemajorIsNull() {
            addCriterion("coursemajor is null");
            return (Criteria) this;
        }

        public Criteria andCoursemajorIsNotNull() {
            addCriterion("coursemajor is not null");
            return (Criteria) this;
        }

        public Criteria andCoursemajorEqualTo(String value) {
            addCriterion("coursemajor =", value, "coursemajor");
            return (Criteria) this;
        }

        public Criteria andCoursemajorNotEqualTo(String value) {
            addCriterion("coursemajor <>", value, "coursemajor");
            return (Criteria) this;
        }

        public Criteria andCoursemajorGreaterThan(String value) {
            addCriterion("coursemajor >", value, "coursemajor");
            return (Criteria) this;
        }

        public Criteria andCoursemajorGreaterThanOrEqualTo(String value) {
            addCriterion("coursemajor >=", value, "coursemajor");
            return (Criteria) this;
        }

        public Criteria andCoursemajorLessThan(String value) {
            addCriterion("coursemajor <", value, "coursemajor");
            return (Criteria) this;
        }

        public Criteria andCoursemajorLessThanOrEqualTo(String value) {
            addCriterion("coursemajor <=", value, "coursemajor");
            return (Criteria) this;
        }

        public Criteria andCoursemajorLike(String value) {
            addCriterion("coursemajor like", value, "coursemajor");
            return (Criteria) this;
        }

        public Criteria andCoursemajorNotLike(String value) {
            addCriterion("coursemajor not like", value, "coursemajor");
            return (Criteria) this;
        }

        public Criteria andCoursemajorIn(List<String> values) {
            addCriterion("coursemajor in", values, "coursemajor");
            return (Criteria) this;
        }

        public Criteria andCoursemajorNotIn(List<String> values) {
            addCriterion("coursemajor not in", values, "coursemajor");
            return (Criteria) this;
        }

        public Criteria andCoursemajorBetween(String value1, String value2) {
            addCriterion("coursemajor between", value1, value2, "coursemajor");
            return (Criteria) this;
        }

        public Criteria andCoursemajorNotBetween(String value1, String value2) {
            addCriterion("coursemajor not between", value1, value2, "coursemajor");
            return (Criteria) this;
        }

        public Criteria andCoursedescIsNull() {
            addCriterion("coursedesc is null");
            return (Criteria) this;
        }

        public Criteria andCoursedescIsNotNull() {
            addCriterion("coursedesc is not null");
            return (Criteria) this;
        }

        public Criteria andCoursedescEqualTo(String value) {
            addCriterion("coursedesc =", value, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescNotEqualTo(String value) {
            addCriterion("coursedesc <>", value, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescGreaterThan(String value) {
            addCriterion("coursedesc >", value, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescGreaterThanOrEqualTo(String value) {
            addCriterion("coursedesc >=", value, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescLessThan(String value) {
            addCriterion("coursedesc <", value, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescLessThanOrEqualTo(String value) {
            addCriterion("coursedesc <=", value, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescLike(String value) {
            addCriterion("coursedesc like", value, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescNotLike(String value) {
            addCriterion("coursedesc not like", value, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescIn(List<String> values) {
            addCriterion("coursedesc in", values, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescNotIn(List<String> values) {
            addCriterion("coursedesc not in", values, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescBetween(String value1, String value2) {
            addCriterion("coursedesc between", value1, value2, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescNotBetween(String value1, String value2) {
            addCriterion("coursedesc not between", value1, value2, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andIshomeIsNull() {
            addCriterion("ishome is null");
            return (Criteria) this;
        }

        public Criteria andIshomeIsNotNull() {
            addCriterion("ishome is not null");
            return (Criteria) this;
        }

        public Criteria andIshomeEqualTo(Integer value) {
            addCriterion("ishome =", value, "ishome");
            return (Criteria) this;
        }

        public Criteria andIshomeNotEqualTo(Integer value) {
            addCriterion("ishome <>", value, "ishome");
            return (Criteria) this;
        }

        public Criteria andIshomeGreaterThan(Integer value) {
            addCriterion("ishome >", value, "ishome");
            return (Criteria) this;
        }

        public Criteria andIshomeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ishome >=", value, "ishome");
            return (Criteria) this;
        }

        public Criteria andIshomeLessThan(Integer value) {
            addCriterion("ishome <", value, "ishome");
            return (Criteria) this;
        }

        public Criteria andIshomeLessThanOrEqualTo(Integer value) {
            addCriterion("ishome <=", value, "ishome");
            return (Criteria) this;
        }

        public Criteria andIshomeIn(List<Integer> values) {
            addCriterion("ishome in", values, "ishome");
            return (Criteria) this;
        }

        public Criteria andIshomeNotIn(List<Integer> values) {
            addCriterion("ishome not in", values, "ishome");
            return (Criteria) this;
        }

        public Criteria andIshomeBetween(Integer value1, Integer value2) {
            addCriterion("ishome between", value1, value2, "ishome");
            return (Criteria) this;
        }

        public Criteria andIshomeNotBetween(Integer value1, Integer value2) {
            addCriterion("ishome not between", value1, value2, "ishome");
            return (Criteria) this;
        }

        public Criteria andCoursepicIsNull() {
            addCriterion("coursepic is null");
            return (Criteria) this;
        }

        public Criteria andCoursepicIsNotNull() {
            addCriterion("coursepic is not null");
            return (Criteria) this;
        }

        public Criteria andCoursepicEqualTo(String value) {
            addCriterion("coursepic =", value, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicNotEqualTo(String value) {
            addCriterion("coursepic <>", value, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicGreaterThan(String value) {
            addCriterion("coursepic >", value, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicGreaterThanOrEqualTo(String value) {
            addCriterion("coursepic >=", value, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicLessThan(String value) {
            addCriterion("coursepic <", value, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicLessThanOrEqualTo(String value) {
            addCriterion("coursepic <=", value, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicLike(String value) {
            addCriterion("coursepic like", value, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicNotLike(String value) {
            addCriterion("coursepic not like", value, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicIn(List<String> values) {
            addCriterion("coursepic in", values, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicNotIn(List<String> values) {
            addCriterion("coursepic not in", values, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicBetween(String value1, String value2) {
            addCriterion("coursepic between", value1, value2, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicNotBetween(String value1, String value2) {
            addCriterion("coursepic not between", value1, value2, "coursepic");
            return (Criteria) this;
        }

        public Criteria andHomepicIsNull() {
            addCriterion("homepic is null");
            return (Criteria) this;
        }

        public Criteria andHomepicIsNotNull() {
            addCriterion("homepic is not null");
            return (Criteria) this;
        }

        public Criteria andHomepicEqualTo(String value) {
            addCriterion("homepic =", value, "homepic");
            return (Criteria) this;
        }

        public Criteria andHomepicNotEqualTo(String value) {
            addCriterion("homepic <>", value, "homepic");
            return (Criteria) this;
        }

        public Criteria andHomepicGreaterThan(String value) {
            addCriterion("homepic >", value, "homepic");
            return (Criteria) this;
        }

        public Criteria andHomepicGreaterThanOrEqualTo(String value) {
            addCriterion("homepic >=", value, "homepic");
            return (Criteria) this;
        }

        public Criteria andHomepicLessThan(String value) {
            addCriterion("homepic <", value, "homepic");
            return (Criteria) this;
        }

        public Criteria andHomepicLessThanOrEqualTo(String value) {
            addCriterion("homepic <=", value, "homepic");
            return (Criteria) this;
        }

        public Criteria andHomepicLike(String value) {
            addCriterion("homepic like", value, "homepic");
            return (Criteria) this;
        }

        public Criteria andHomepicNotLike(String value) {
            addCriterion("homepic not like", value, "homepic");
            return (Criteria) this;
        }

        public Criteria andHomepicIn(List<String> values) {
            addCriterion("homepic in", values, "homepic");
            return (Criteria) this;
        }

        public Criteria andHomepicNotIn(List<String> values) {
            addCriterion("homepic not in", values, "homepic");
            return (Criteria) this;
        }

        public Criteria andHomepicBetween(String value1, String value2) {
            addCriterion("homepic between", value1, value2, "homepic");
            return (Criteria) this;
        }

        public Criteria andHomepicNotBetween(String value1, String value2) {
            addCriterion("homepic not between", value1, value2, "homepic");
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