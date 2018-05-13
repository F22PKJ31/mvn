package com.sac.pojo;

import java.util.ArrayList;
import java.util.List;

public class SacLessonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SacLessonExample() {
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

        public Criteria andLessonidIsNull() {
            addCriterion("lessonid is null");
            return (Criteria) this;
        }

        public Criteria andLessonidIsNotNull() {
            addCriterion("lessonid is not null");
            return (Criteria) this;
        }

        public Criteria andLessonidEqualTo(Integer value) {
            addCriterion("lessonid =", value, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidNotEqualTo(Integer value) {
            addCriterion("lessonid <>", value, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidGreaterThan(Integer value) {
            addCriterion("lessonid >", value, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lessonid >=", value, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidLessThan(Integer value) {
            addCriterion("lessonid <", value, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidLessThanOrEqualTo(Integer value) {
            addCriterion("lessonid <=", value, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidIn(List<Integer> values) {
            addCriterion("lessonid in", values, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidNotIn(List<Integer> values) {
            addCriterion("lessonid not in", values, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidBetween(Integer value1, Integer value2) {
            addCriterion("lessonid between", value1, value2, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidNotBetween(Integer value1, Integer value2) {
            addCriterion("lessonid not between", value1, value2, "lessonid");
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

        public Criteria andLessonnameIsNull() {
            addCriterion("lessonname is null");
            return (Criteria) this;
        }

        public Criteria andLessonnameIsNotNull() {
            addCriterion("lessonname is not null");
            return (Criteria) this;
        }

        public Criteria andLessonnameEqualTo(String value) {
            addCriterion("lessonname =", value, "lessonname");
            return (Criteria) this;
        }

        public Criteria andLessonnameNotEqualTo(String value) {
            addCriterion("lessonname <>", value, "lessonname");
            return (Criteria) this;
        }

        public Criteria andLessonnameGreaterThan(String value) {
            addCriterion("lessonname >", value, "lessonname");
            return (Criteria) this;
        }

        public Criteria andLessonnameGreaterThanOrEqualTo(String value) {
            addCriterion("lessonname >=", value, "lessonname");
            return (Criteria) this;
        }

        public Criteria andLessonnameLessThan(String value) {
            addCriterion("lessonname <", value, "lessonname");
            return (Criteria) this;
        }

        public Criteria andLessonnameLessThanOrEqualTo(String value) {
            addCriterion("lessonname <=", value, "lessonname");
            return (Criteria) this;
        }

        public Criteria andLessonnameLike(String value) {
            addCriterion("lessonname like", value, "lessonname");
            return (Criteria) this;
        }

        public Criteria andLessonnameNotLike(String value) {
            addCriterion("lessonname not like", value, "lessonname");
            return (Criteria) this;
        }

        public Criteria andLessonnameIn(List<String> values) {
            addCriterion("lessonname in", values, "lessonname");
            return (Criteria) this;
        }

        public Criteria andLessonnameNotIn(List<String> values) {
            addCriterion("lessonname not in", values, "lessonname");
            return (Criteria) this;
        }

        public Criteria andLessonnameBetween(String value1, String value2) {
            addCriterion("lessonname between", value1, value2, "lessonname");
            return (Criteria) this;
        }

        public Criteria andLessonnameNotBetween(String value1, String value2) {
            addCriterion("lessonname not between", value1, value2, "lessonname");
            return (Criteria) this;
        }

        public Criteria andLessonsrcIsNull() {
            addCriterion("lessonsrc is null");
            return (Criteria) this;
        }

        public Criteria andLessonsrcIsNotNull() {
            addCriterion("lessonsrc is not null");
            return (Criteria) this;
        }

        public Criteria andLessonsrcEqualTo(String value) {
            addCriterion("lessonsrc =", value, "lessonsrc");
            return (Criteria) this;
        }

        public Criteria andLessonsrcNotEqualTo(String value) {
            addCriterion("lessonsrc <>", value, "lessonsrc");
            return (Criteria) this;
        }

        public Criteria andLessonsrcGreaterThan(String value) {
            addCriterion("lessonsrc >", value, "lessonsrc");
            return (Criteria) this;
        }

        public Criteria andLessonsrcGreaterThanOrEqualTo(String value) {
            addCriterion("lessonsrc >=", value, "lessonsrc");
            return (Criteria) this;
        }

        public Criteria andLessonsrcLessThan(String value) {
            addCriterion("lessonsrc <", value, "lessonsrc");
            return (Criteria) this;
        }

        public Criteria andLessonsrcLessThanOrEqualTo(String value) {
            addCriterion("lessonsrc <=", value, "lessonsrc");
            return (Criteria) this;
        }

        public Criteria andLessonsrcLike(String value) {
            addCriterion("lessonsrc like", value, "lessonsrc");
            return (Criteria) this;
        }

        public Criteria andLessonsrcNotLike(String value) {
            addCriterion("lessonsrc not like", value, "lessonsrc");
            return (Criteria) this;
        }

        public Criteria andLessonsrcIn(List<String> values) {
            addCriterion("lessonsrc in", values, "lessonsrc");
            return (Criteria) this;
        }

        public Criteria andLessonsrcNotIn(List<String> values) {
            addCriterion("lessonsrc not in", values, "lessonsrc");
            return (Criteria) this;
        }

        public Criteria andLessonsrcBetween(String value1, String value2) {
            addCriterion("lessonsrc between", value1, value2, "lessonsrc");
            return (Criteria) this;
        }

        public Criteria andLessonsrcNotBetween(String value1, String value2) {
            addCriterion("lessonsrc not between", value1, value2, "lessonsrc");
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