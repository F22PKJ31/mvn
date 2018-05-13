package com.sac.pojo;

import java.util.ArrayList;
import java.util.List;

public class SacStudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SacStudentExample() {
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

        public Criteria andStupswIsNull() {
            addCriterion("stupsw is null");
            return (Criteria) this;
        }

        public Criteria andStupswIsNotNull() {
            addCriterion("stupsw is not null");
            return (Criteria) this;
        }

        public Criteria andStupswEqualTo(String value) {
            addCriterion("stupsw =", value, "stupsw");
            return (Criteria) this;
        }

        public Criteria andStupswNotEqualTo(String value) {
            addCriterion("stupsw <>", value, "stupsw");
            return (Criteria) this;
        }

        public Criteria andStupswGreaterThan(String value) {
            addCriterion("stupsw >", value, "stupsw");
            return (Criteria) this;
        }

        public Criteria andStupswGreaterThanOrEqualTo(String value) {
            addCriterion("stupsw >=", value, "stupsw");
            return (Criteria) this;
        }

        public Criteria andStupswLessThan(String value) {
            addCriterion("stupsw <", value, "stupsw");
            return (Criteria) this;
        }

        public Criteria andStupswLessThanOrEqualTo(String value) {
            addCriterion("stupsw <=", value, "stupsw");
            return (Criteria) this;
        }

        public Criteria andStupswLike(String value) {
            addCriterion("stupsw like", value, "stupsw");
            return (Criteria) this;
        }

        public Criteria andStupswNotLike(String value) {
            addCriterion("stupsw not like", value, "stupsw");
            return (Criteria) this;
        }

        public Criteria andStupswIn(List<String> values) {
            addCriterion("stupsw in", values, "stupsw");
            return (Criteria) this;
        }

        public Criteria andStupswNotIn(List<String> values) {
            addCriterion("stupsw not in", values, "stupsw");
            return (Criteria) this;
        }

        public Criteria andStupswBetween(String value1, String value2) {
            addCriterion("stupsw between", value1, value2, "stupsw");
            return (Criteria) this;
        }

        public Criteria andStupswNotBetween(String value1, String value2) {
            addCriterion("stupsw not between", value1, value2, "stupsw");
            return (Criteria) this;
        }

        public Criteria andStunicknameIsNull() {
            addCriterion("stunickname is null");
            return (Criteria) this;
        }

        public Criteria andStunicknameIsNotNull() {
            addCriterion("stunickname is not null");
            return (Criteria) this;
        }

        public Criteria andStunicknameEqualTo(String value) {
            addCriterion("stunickname =", value, "stunickname");
            return (Criteria) this;
        }

        public Criteria andStunicknameNotEqualTo(String value) {
            addCriterion("stunickname <>", value, "stunickname");
            return (Criteria) this;
        }

        public Criteria andStunicknameGreaterThan(String value) {
            addCriterion("stunickname >", value, "stunickname");
            return (Criteria) this;
        }

        public Criteria andStunicknameGreaterThanOrEqualTo(String value) {
            addCriterion("stunickname >=", value, "stunickname");
            return (Criteria) this;
        }

        public Criteria andStunicknameLessThan(String value) {
            addCriterion("stunickname <", value, "stunickname");
            return (Criteria) this;
        }

        public Criteria andStunicknameLessThanOrEqualTo(String value) {
            addCriterion("stunickname <=", value, "stunickname");
            return (Criteria) this;
        }

        public Criteria andStunicknameLike(String value) {
            addCriterion("stunickname like", value, "stunickname");
            return (Criteria) this;
        }

        public Criteria andStunicknameNotLike(String value) {
            addCriterion("stunickname not like", value, "stunickname");
            return (Criteria) this;
        }

        public Criteria andStunicknameIn(List<String> values) {
            addCriterion("stunickname in", values, "stunickname");
            return (Criteria) this;
        }

        public Criteria andStunicknameNotIn(List<String> values) {
            addCriterion("stunickname not in", values, "stunickname");
            return (Criteria) this;
        }

        public Criteria andStunicknameBetween(String value1, String value2) {
            addCriterion("stunickname between", value1, value2, "stunickname");
            return (Criteria) this;
        }

        public Criteria andStunicknameNotBetween(String value1, String value2) {
            addCriterion("stunickname not between", value1, value2, "stunickname");
            return (Criteria) this;
        }

        public Criteria andStuschoolIsNull() {
            addCriterion("stuschool is null");
            return (Criteria) this;
        }

        public Criteria andStuschoolIsNotNull() {
            addCriterion("stuschool is not null");
            return (Criteria) this;
        }

        public Criteria andStuschoolEqualTo(String value) {
            addCriterion("stuschool =", value, "stuschool");
            return (Criteria) this;
        }

        public Criteria andStuschoolNotEqualTo(String value) {
            addCriterion("stuschool <>", value, "stuschool");
            return (Criteria) this;
        }

        public Criteria andStuschoolGreaterThan(String value) {
            addCriterion("stuschool >", value, "stuschool");
            return (Criteria) this;
        }

        public Criteria andStuschoolGreaterThanOrEqualTo(String value) {
            addCriterion("stuschool >=", value, "stuschool");
            return (Criteria) this;
        }

        public Criteria andStuschoolLessThan(String value) {
            addCriterion("stuschool <", value, "stuschool");
            return (Criteria) this;
        }

        public Criteria andStuschoolLessThanOrEqualTo(String value) {
            addCriterion("stuschool <=", value, "stuschool");
            return (Criteria) this;
        }

        public Criteria andStuschoolLike(String value) {
            addCriterion("stuschool like", value, "stuschool");
            return (Criteria) this;
        }

        public Criteria andStuschoolNotLike(String value) {
            addCriterion("stuschool not like", value, "stuschool");
            return (Criteria) this;
        }

        public Criteria andStuschoolIn(List<String> values) {
            addCriterion("stuschool in", values, "stuschool");
            return (Criteria) this;
        }

        public Criteria andStuschoolNotIn(List<String> values) {
            addCriterion("stuschool not in", values, "stuschool");
            return (Criteria) this;
        }

        public Criteria andStuschoolBetween(String value1, String value2) {
            addCriterion("stuschool between", value1, value2, "stuschool");
            return (Criteria) this;
        }

        public Criteria andStuschoolNotBetween(String value1, String value2) {
            addCriterion("stuschool not between", value1, value2, "stuschool");
            return (Criteria) this;
        }

        public Criteria andStuphoneIsNull() {
            addCriterion("stuphone is null");
            return (Criteria) this;
        }

        public Criteria andStuphoneIsNotNull() {
            addCriterion("stuphone is not null");
            return (Criteria) this;
        }

        public Criteria andStuphoneEqualTo(Long value) {
            addCriterion("stuphone =", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneNotEqualTo(Long value) {
            addCriterion("stuphone <>", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneGreaterThan(Long value) {
            addCriterion("stuphone >", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneGreaterThanOrEqualTo(Long value) {
            addCriterion("stuphone >=", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneLessThan(Long value) {
            addCriterion("stuphone <", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneLessThanOrEqualTo(Long value) {
            addCriterion("stuphone <=", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneIn(List<Long> values) {
            addCriterion("stuphone in", values, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneNotIn(List<Long> values) {
            addCriterion("stuphone not in", values, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneBetween(Long value1, Long value2) {
            addCriterion("stuphone between", value1, value2, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneNotBetween(Long value1, Long value2) {
            addCriterion("stuphone not between", value1, value2, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStumailIsNull() {
            addCriterion("stumail is null");
            return (Criteria) this;
        }

        public Criteria andStumailIsNotNull() {
            addCriterion("stumail is not null");
            return (Criteria) this;
        }

        public Criteria andStumailEqualTo(String value) {
            addCriterion("stumail =", value, "stumail");
            return (Criteria) this;
        }

        public Criteria andStumailNotEqualTo(String value) {
            addCriterion("stumail <>", value, "stumail");
            return (Criteria) this;
        }

        public Criteria andStumailGreaterThan(String value) {
            addCriterion("stumail >", value, "stumail");
            return (Criteria) this;
        }

        public Criteria andStumailGreaterThanOrEqualTo(String value) {
            addCriterion("stumail >=", value, "stumail");
            return (Criteria) this;
        }

        public Criteria andStumailLessThan(String value) {
            addCriterion("stumail <", value, "stumail");
            return (Criteria) this;
        }

        public Criteria andStumailLessThanOrEqualTo(String value) {
            addCriterion("stumail <=", value, "stumail");
            return (Criteria) this;
        }

        public Criteria andStumailLike(String value) {
            addCriterion("stumail like", value, "stumail");
            return (Criteria) this;
        }

        public Criteria andStumailNotLike(String value) {
            addCriterion("stumail not like", value, "stumail");
            return (Criteria) this;
        }

        public Criteria andStumailIn(List<String> values) {
            addCriterion("stumail in", values, "stumail");
            return (Criteria) this;
        }

        public Criteria andStumailNotIn(List<String> values) {
            addCriterion("stumail not in", values, "stumail");
            return (Criteria) this;
        }

        public Criteria andStumailBetween(String value1, String value2) {
            addCriterion("stumail between", value1, value2, "stumail");
            return (Criteria) this;
        }

        public Criteria andStumailNotBetween(String value1, String value2) {
            addCriterion("stumail not between", value1, value2, "stumail");
            return (Criteria) this;
        }

        public Criteria andStuheadpicIsNull() {
            addCriterion("stuheadpic is null");
            return (Criteria) this;
        }

        public Criteria andStuheadpicIsNotNull() {
            addCriterion("stuheadpic is not null");
            return (Criteria) this;
        }

        public Criteria andStuheadpicEqualTo(String value) {
            addCriterion("stuheadpic =", value, "stuheadpic");
            return (Criteria) this;
        }

        public Criteria andStuheadpicNotEqualTo(String value) {
            addCriterion("stuheadpic <>", value, "stuheadpic");
            return (Criteria) this;
        }

        public Criteria andStuheadpicGreaterThan(String value) {
            addCriterion("stuheadpic >", value, "stuheadpic");
            return (Criteria) this;
        }

        public Criteria andStuheadpicGreaterThanOrEqualTo(String value) {
            addCriterion("stuheadpic >=", value, "stuheadpic");
            return (Criteria) this;
        }

        public Criteria andStuheadpicLessThan(String value) {
            addCriterion("stuheadpic <", value, "stuheadpic");
            return (Criteria) this;
        }

        public Criteria andStuheadpicLessThanOrEqualTo(String value) {
            addCriterion("stuheadpic <=", value, "stuheadpic");
            return (Criteria) this;
        }

        public Criteria andStuheadpicLike(String value) {
            addCriterion("stuheadpic like", value, "stuheadpic");
            return (Criteria) this;
        }

        public Criteria andStuheadpicNotLike(String value) {
            addCriterion("stuheadpic not like", value, "stuheadpic");
            return (Criteria) this;
        }

        public Criteria andStuheadpicIn(List<String> values) {
            addCriterion("stuheadpic in", values, "stuheadpic");
            return (Criteria) this;
        }

        public Criteria andStuheadpicNotIn(List<String> values) {
            addCriterion("stuheadpic not in", values, "stuheadpic");
            return (Criteria) this;
        }

        public Criteria andStuheadpicBetween(String value1, String value2) {
            addCriterion("stuheadpic between", value1, value2, "stuheadpic");
            return (Criteria) this;
        }

        public Criteria andStuheadpicNotBetween(String value1, String value2) {
            addCriterion("stuheadpic not between", value1, value2, "stuheadpic");
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