package com.sac.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SacPostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SacPostExample() {
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

        public Criteria andPostidIsNull() {
            addCriterion("postid is null");
            return (Criteria) this;
        }

        public Criteria andPostidIsNotNull() {
            addCriterion("postid is not null");
            return (Criteria) this;
        }

        public Criteria andPostidEqualTo(Integer value) {
            addCriterion("postid =", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotEqualTo(Integer value) {
            addCriterion("postid <>", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThan(Integer value) {
            addCriterion("postid >", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThanOrEqualTo(Integer value) {
            addCriterion("postid >=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThan(Integer value) {
            addCriterion("postid <", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThanOrEqualTo(Integer value) {
            addCriterion("postid <=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidIn(List<Integer> values) {
            addCriterion("postid in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotIn(List<Integer> values) {
            addCriterion("postid not in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidBetween(Integer value1, Integer value2) {
            addCriterion("postid between", value1, value2, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotBetween(Integer value1, Integer value2) {
            addCriterion("postid not between", value1, value2, "postid");
            return (Criteria) this;
        }

        public Criteria andPosttitleIsNull() {
            addCriterion("posttitle is null");
            return (Criteria) this;
        }

        public Criteria andPosttitleIsNotNull() {
            addCriterion("posttitle is not null");
            return (Criteria) this;
        }

        public Criteria andPosttitleEqualTo(String value) {
            addCriterion("posttitle =", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleNotEqualTo(String value) {
            addCriterion("posttitle <>", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleGreaterThan(String value) {
            addCriterion("posttitle >", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleGreaterThanOrEqualTo(String value) {
            addCriterion("posttitle >=", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleLessThan(String value) {
            addCriterion("posttitle <", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleLessThanOrEqualTo(String value) {
            addCriterion("posttitle <=", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleLike(String value) {
            addCriterion("posttitle like", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleNotLike(String value) {
            addCriterion("posttitle not like", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleIn(List<String> values) {
            addCriterion("posttitle in", values, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleNotIn(List<String> values) {
            addCriterion("posttitle not in", values, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleBetween(String value1, String value2) {
            addCriterion("posttitle between", value1, value2, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleNotBetween(String value1, String value2) {
            addCriterion("posttitle not between", value1, value2, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPostcontentIsNull() {
            addCriterion("postcontent is null");
            return (Criteria) this;
        }

        public Criteria andPostcontentIsNotNull() {
            addCriterion("postcontent is not null");
            return (Criteria) this;
        }

        public Criteria andPostcontentEqualTo(String value) {
            addCriterion("postcontent =", value, "postcontent");
            return (Criteria) this;
        }

        public Criteria andPostcontentNotEqualTo(String value) {
            addCriterion("postcontent <>", value, "postcontent");
            return (Criteria) this;
        }

        public Criteria andPostcontentGreaterThan(String value) {
            addCriterion("postcontent >", value, "postcontent");
            return (Criteria) this;
        }

        public Criteria andPostcontentGreaterThanOrEqualTo(String value) {
            addCriterion("postcontent >=", value, "postcontent");
            return (Criteria) this;
        }

        public Criteria andPostcontentLessThan(String value) {
            addCriterion("postcontent <", value, "postcontent");
            return (Criteria) this;
        }

        public Criteria andPostcontentLessThanOrEqualTo(String value) {
            addCriterion("postcontent <=", value, "postcontent");
            return (Criteria) this;
        }

        public Criteria andPostcontentLike(String value) {
            addCriterion("postcontent like", value, "postcontent");
            return (Criteria) this;
        }

        public Criteria andPostcontentNotLike(String value) {
            addCriterion("postcontent not like", value, "postcontent");
            return (Criteria) this;
        }

        public Criteria andPostcontentIn(List<String> values) {
            addCriterion("postcontent in", values, "postcontent");
            return (Criteria) this;
        }

        public Criteria andPostcontentNotIn(List<String> values) {
            addCriterion("postcontent not in", values, "postcontent");
            return (Criteria) this;
        }

        public Criteria andPostcontentBetween(String value1, String value2) {
            addCriterion("postcontent between", value1, value2, "postcontent");
            return (Criteria) this;
        }

        public Criteria andPostcontentNotBetween(String value1, String value2) {
            addCriterion("postcontent not between", value1, value2, "postcontent");
            return (Criteria) this;
        }

        public Criteria andPosternameIsNull() {
            addCriterion("postername is null");
            return (Criteria) this;
        }

        public Criteria andPosternameIsNotNull() {
            addCriterion("postername is not null");
            return (Criteria) this;
        }

        public Criteria andPosternameEqualTo(String value) {
            addCriterion("postername =", value, "postername");
            return (Criteria) this;
        }

        public Criteria andPosternameNotEqualTo(String value) {
            addCriterion("postername <>", value, "postername");
            return (Criteria) this;
        }

        public Criteria andPosternameGreaterThan(String value) {
            addCriterion("postername >", value, "postername");
            return (Criteria) this;
        }

        public Criteria andPosternameGreaterThanOrEqualTo(String value) {
            addCriterion("postername >=", value, "postername");
            return (Criteria) this;
        }

        public Criteria andPosternameLessThan(String value) {
            addCriterion("postername <", value, "postername");
            return (Criteria) this;
        }

        public Criteria andPosternameLessThanOrEqualTo(String value) {
            addCriterion("postername <=", value, "postername");
            return (Criteria) this;
        }

        public Criteria andPosternameLike(String value) {
            addCriterion("postername like", value, "postername");
            return (Criteria) this;
        }

        public Criteria andPosternameNotLike(String value) {
            addCriterion("postername not like", value, "postername");
            return (Criteria) this;
        }

        public Criteria andPosternameIn(List<String> values) {
            addCriterion("postername in", values, "postername");
            return (Criteria) this;
        }

        public Criteria andPosternameNotIn(List<String> values) {
            addCriterion("postername not in", values, "postername");
            return (Criteria) this;
        }

        public Criteria andPosternameBetween(String value1, String value2) {
            addCriterion("postername between", value1, value2, "postername");
            return (Criteria) this;
        }

        public Criteria andPosternameNotBetween(String value1, String value2) {
            addCriterion("postername not between", value1, value2, "postername");
            return (Criteria) this;
        }

        public Criteria andPostdateIsNull() {
            addCriterion("postdate is null");
            return (Criteria) this;
        }

        public Criteria andPostdateIsNotNull() {
            addCriterion("postdate is not null");
            return (Criteria) this;
        }

        public Criteria andPostdateEqualTo(Date value) {
            addCriterion("postdate =", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateNotEqualTo(Date value) {
            addCriterion("postdate <>", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateGreaterThan(Date value) {
            addCriterion("postdate >", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateGreaterThanOrEqualTo(Date value) {
            addCriterion("postdate >=", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateLessThan(Date value) {
            addCriterion("postdate <", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateLessThanOrEqualTo(Date value) {
            addCriterion("postdate <=", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateIn(List<Date> values) {
            addCriterion("postdate in", values, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateNotIn(List<Date> values) {
            addCriterion("postdate not in", values, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateBetween(Date value1, Date value2) {
            addCriterion("postdate between", value1, value2, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateNotBetween(Date value1, Date value2) {
            addCriterion("postdate not between", value1, value2, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdescIsNull() {
            addCriterion("postdesc is null");
            return (Criteria) this;
        }

        public Criteria andPostdescIsNotNull() {
            addCriterion("postdesc is not null");
            return (Criteria) this;
        }

        public Criteria andPostdescEqualTo(String value) {
            addCriterion("postdesc =", value, "postdesc");
            return (Criteria) this;
        }

        public Criteria andPostdescNotEqualTo(String value) {
            addCriterion("postdesc <>", value, "postdesc");
            return (Criteria) this;
        }

        public Criteria andPostdescGreaterThan(String value) {
            addCriterion("postdesc >", value, "postdesc");
            return (Criteria) this;
        }

        public Criteria andPostdescGreaterThanOrEqualTo(String value) {
            addCriterion("postdesc >=", value, "postdesc");
            return (Criteria) this;
        }

        public Criteria andPostdescLessThan(String value) {
            addCriterion("postdesc <", value, "postdesc");
            return (Criteria) this;
        }

        public Criteria andPostdescLessThanOrEqualTo(String value) {
            addCriterion("postdesc <=", value, "postdesc");
            return (Criteria) this;
        }

        public Criteria andPostdescLike(String value) {
            addCriterion("postdesc like", value, "postdesc");
            return (Criteria) this;
        }

        public Criteria andPostdescNotLike(String value) {
            addCriterion("postdesc not like", value, "postdesc");
            return (Criteria) this;
        }

        public Criteria andPostdescIn(List<String> values) {
            addCriterion("postdesc in", values, "postdesc");
            return (Criteria) this;
        }

        public Criteria andPostdescNotIn(List<String> values) {
            addCriterion("postdesc not in", values, "postdesc");
            return (Criteria) this;
        }

        public Criteria andPostdescBetween(String value1, String value2) {
            addCriterion("postdesc between", value1, value2, "postdesc");
            return (Criteria) this;
        }

        public Criteria andPostdescNotBetween(String value1, String value2) {
            addCriterion("postdesc not between", value1, value2, "postdesc");
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