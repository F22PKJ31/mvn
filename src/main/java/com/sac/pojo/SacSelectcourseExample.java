package com.sac.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SacSelectcourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SacSelectcourseExample() {
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

        public Criteria andSelectidIsNull() {
            addCriterion("selectid is null");
            return (Criteria) this;
        }

        public Criteria andSelectidIsNotNull() {
            addCriterion("selectid is not null");
            return (Criteria) this;
        }

        public Criteria andSelectidEqualTo(Integer value) {
            addCriterion("selectid =", value, "selectid");
            return (Criteria) this;
        }

        public Criteria andSelectidNotEqualTo(Integer value) {
            addCriterion("selectid <>", value, "selectid");
            return (Criteria) this;
        }

        public Criteria andSelectidGreaterThan(Integer value) {
            addCriterion("selectid >", value, "selectid");
            return (Criteria) this;
        }

        public Criteria andSelectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("selectid >=", value, "selectid");
            return (Criteria) this;
        }

        public Criteria andSelectidLessThan(Integer value) {
            addCriterion("selectid <", value, "selectid");
            return (Criteria) this;
        }

        public Criteria andSelectidLessThanOrEqualTo(Integer value) {
            addCriterion("selectid <=", value, "selectid");
            return (Criteria) this;
        }

        public Criteria andSelectidIn(List<Integer> values) {
            addCriterion("selectid in", values, "selectid");
            return (Criteria) this;
        }

        public Criteria andSelectidNotIn(List<Integer> values) {
            addCriterion("selectid not in", values, "selectid");
            return (Criteria) this;
        }

        public Criteria andSelectidBetween(Integer value1, Integer value2) {
            addCriterion("selectid between", value1, value2, "selectid");
            return (Criteria) this;
        }

        public Criteria andSelectidNotBetween(Integer value1, Integer value2) {
            addCriterion("selectid not between", value1, value2, "selectid");
            return (Criteria) this;
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

        public Criteria andStuidIsNull() {
            addCriterion("stuid is null");
            return (Criteria) this;
        }

        public Criteria andStuidIsNotNull() {
            addCriterion("stuid is not null");
            return (Criteria) this;
        }

        public Criteria andStuidEqualTo(Integer value) {
            addCriterion("stuid =", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotEqualTo(Integer value) {
            addCriterion("stuid <>", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThan(Integer value) {
            addCriterion("stuid >", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuid >=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThan(Integer value) {
            addCriterion("stuid <", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThanOrEqualTo(Integer value) {
            addCriterion("stuid <=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidIn(List<Integer> values) {
            addCriterion("stuid in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotIn(List<Integer> values) {
            addCriterion("stuid not in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidBetween(Integer value1, Integer value2) {
            addCriterion("stuid between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotBetween(Integer value1, Integer value2) {
            addCriterion("stuid not between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andSelecttimeIsNull() {
            addCriterion("selecttime is null");
            return (Criteria) this;
        }

        public Criteria andSelecttimeIsNotNull() {
            addCriterion("selecttime is not null");
            return (Criteria) this;
        }

        public Criteria andSelecttimeEqualTo(Date value) {
            addCriterion("selecttime =", value, "selecttime");
            return (Criteria) this;
        }

        public Criteria andSelecttimeNotEqualTo(Date value) {
            addCriterion("selecttime <>", value, "selecttime");
            return (Criteria) this;
        }

        public Criteria andSelecttimeGreaterThan(Date value) {
            addCriterion("selecttime >", value, "selecttime");
            return (Criteria) this;
        }

        public Criteria andSelecttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("selecttime >=", value, "selecttime");
            return (Criteria) this;
        }

        public Criteria andSelecttimeLessThan(Date value) {
            addCriterion("selecttime <", value, "selecttime");
            return (Criteria) this;
        }

        public Criteria andSelecttimeLessThanOrEqualTo(Date value) {
            addCriterion("selecttime <=", value, "selecttime");
            return (Criteria) this;
        }

        public Criteria andSelecttimeIn(List<Date> values) {
            addCriterion("selecttime in", values, "selecttime");
            return (Criteria) this;
        }

        public Criteria andSelecttimeNotIn(List<Date> values) {
            addCriterion("selecttime not in", values, "selecttime");
            return (Criteria) this;
        }

        public Criteria andSelecttimeBetween(Date value1, Date value2) {
            addCriterion("selecttime between", value1, value2, "selecttime");
            return (Criteria) this;
        }

        public Criteria andSelecttimeNotBetween(Date value1, Date value2) {
            addCriterion("selecttime not between", value1, value2, "selecttime");
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