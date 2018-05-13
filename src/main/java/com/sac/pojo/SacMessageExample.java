package com.sac.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SacMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SacMessageExample() {
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

        public Criteria andMessageidIsNull() {
            addCriterion("messageid is null");
            return (Criteria) this;
        }

        public Criteria andMessageidIsNotNull() {
            addCriterion("messageid is not null");
            return (Criteria) this;
        }

        public Criteria andMessageidEqualTo(Integer value) {
            addCriterion("messageid =", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotEqualTo(Integer value) {
            addCriterion("messageid <>", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThan(Integer value) {
            addCriterion("messageid >", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("messageid >=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThan(Integer value) {
            addCriterion("messageid <", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThanOrEqualTo(Integer value) {
            addCriterion("messageid <=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidIn(List<Integer> values) {
            addCriterion("messageid in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotIn(List<Integer> values) {
            addCriterion("messageid not in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidBetween(Integer value1, Integer value2) {
            addCriterion("messageid between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotBetween(Integer value1, Integer value2) {
            addCriterion("messageid not between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessagetitleIsNull() {
            addCriterion("messagetitle is null");
            return (Criteria) this;
        }

        public Criteria andMessagetitleIsNotNull() {
            addCriterion("messagetitle is not null");
            return (Criteria) this;
        }

        public Criteria andMessagetitleEqualTo(String value) {
            addCriterion("messagetitle =", value, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleNotEqualTo(String value) {
            addCriterion("messagetitle <>", value, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleGreaterThan(String value) {
            addCriterion("messagetitle >", value, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleGreaterThanOrEqualTo(String value) {
            addCriterion("messagetitle >=", value, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleLessThan(String value) {
            addCriterion("messagetitle <", value, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleLessThanOrEqualTo(String value) {
            addCriterion("messagetitle <=", value, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleLike(String value) {
            addCriterion("messagetitle like", value, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleNotLike(String value) {
            addCriterion("messagetitle not like", value, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleIn(List<String> values) {
            addCriterion("messagetitle in", values, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleNotIn(List<String> values) {
            addCriterion("messagetitle not in", values, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleBetween(String value1, String value2) {
            addCriterion("messagetitle between", value1, value2, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleNotBetween(String value1, String value2) {
            addCriterion("messagetitle not between", value1, value2, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagecontentIsNull() {
            addCriterion("messagecontent is null");
            return (Criteria) this;
        }

        public Criteria andMessagecontentIsNotNull() {
            addCriterion("messagecontent is not null");
            return (Criteria) this;
        }

        public Criteria andMessagecontentEqualTo(String value) {
            addCriterion("messagecontent =", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentNotEqualTo(String value) {
            addCriterion("messagecontent <>", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentGreaterThan(String value) {
            addCriterion("messagecontent >", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentGreaterThanOrEqualTo(String value) {
            addCriterion("messagecontent >=", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentLessThan(String value) {
            addCriterion("messagecontent <", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentLessThanOrEqualTo(String value) {
            addCriterion("messagecontent <=", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentLike(String value) {
            addCriterion("messagecontent like", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentNotLike(String value) {
            addCriterion("messagecontent not like", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentIn(List<String> values) {
            addCriterion("messagecontent in", values, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentNotIn(List<String> values) {
            addCriterion("messagecontent not in", values, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentBetween(String value1, String value2) {
            addCriterion("messagecontent between", value1, value2, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentNotBetween(String value1, String value2) {
            addCriterion("messagecontent not between", value1, value2, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagedateIsNull() {
            addCriterion("messagedate is null");
            return (Criteria) this;
        }

        public Criteria andMessagedateIsNotNull() {
            addCriterion("messagedate is not null");
            return (Criteria) this;
        }

        public Criteria andMessagedateEqualTo(Date value) {
            addCriterion("messagedate =", value, "messagedate");
            return (Criteria) this;
        }

        public Criteria andMessagedateNotEqualTo(Date value) {
            addCriterion("messagedate <>", value, "messagedate");
            return (Criteria) this;
        }

        public Criteria andMessagedateGreaterThan(Date value) {
            addCriterion("messagedate >", value, "messagedate");
            return (Criteria) this;
        }

        public Criteria andMessagedateGreaterThanOrEqualTo(Date value) {
            addCriterion("messagedate >=", value, "messagedate");
            return (Criteria) this;
        }

        public Criteria andMessagedateLessThan(Date value) {
            addCriterion("messagedate <", value, "messagedate");
            return (Criteria) this;
        }

        public Criteria andMessagedateLessThanOrEqualTo(Date value) {
            addCriterion("messagedate <=", value, "messagedate");
            return (Criteria) this;
        }

        public Criteria andMessagedateIn(List<Date> values) {
            addCriterion("messagedate in", values, "messagedate");
            return (Criteria) this;
        }

        public Criteria andMessagedateNotIn(List<Date> values) {
            addCriterion("messagedate not in", values, "messagedate");
            return (Criteria) this;
        }

        public Criteria andMessagedateBetween(Date value1, Date value2) {
            addCriterion("messagedate between", value1, value2, "messagedate");
            return (Criteria) this;
        }

        public Criteria andMessagedateNotBetween(Date value1, Date value2) {
            addCriterion("messagedate not between", value1, value2, "messagedate");
            return (Criteria) this;
        }

        public Criteria andMessagedescIsNull() {
            addCriterion("messagedesc is null");
            return (Criteria) this;
        }

        public Criteria andMessagedescIsNotNull() {
            addCriterion("messagedesc is not null");
            return (Criteria) this;
        }

        public Criteria andMessagedescEqualTo(String value) {
            addCriterion("messagedesc =", value, "messagedesc");
            return (Criteria) this;
        }

        public Criteria andMessagedescNotEqualTo(String value) {
            addCriterion("messagedesc <>", value, "messagedesc");
            return (Criteria) this;
        }

        public Criteria andMessagedescGreaterThan(String value) {
            addCriterion("messagedesc >", value, "messagedesc");
            return (Criteria) this;
        }

        public Criteria andMessagedescGreaterThanOrEqualTo(String value) {
            addCriterion("messagedesc >=", value, "messagedesc");
            return (Criteria) this;
        }

        public Criteria andMessagedescLessThan(String value) {
            addCriterion("messagedesc <", value, "messagedesc");
            return (Criteria) this;
        }

        public Criteria andMessagedescLessThanOrEqualTo(String value) {
            addCriterion("messagedesc <=", value, "messagedesc");
            return (Criteria) this;
        }

        public Criteria andMessagedescLike(String value) {
            addCriterion("messagedesc like", value, "messagedesc");
            return (Criteria) this;
        }

        public Criteria andMessagedescNotLike(String value) {
            addCriterion("messagedesc not like", value, "messagedesc");
            return (Criteria) this;
        }

        public Criteria andMessagedescIn(List<String> values) {
            addCriterion("messagedesc in", values, "messagedesc");
            return (Criteria) this;
        }

        public Criteria andMessagedescNotIn(List<String> values) {
            addCriterion("messagedesc not in", values, "messagedesc");
            return (Criteria) this;
        }

        public Criteria andMessagedescBetween(String value1, String value2) {
            addCriterion("messagedesc between", value1, value2, "messagedesc");
            return (Criteria) this;
        }

        public Criteria andMessagedescNotBetween(String value1, String value2) {
            addCriterion("messagedesc not between", value1, value2, "messagedesc");
            return (Criteria) this;
        }

        public Criteria andMessagecompanyIsNull() {
            addCriterion("messagecompany is null");
            return (Criteria) this;
        }

        public Criteria andMessagecompanyIsNotNull() {
            addCriterion("messagecompany is not null");
            return (Criteria) this;
        }

        public Criteria andMessagecompanyEqualTo(String value) {
            addCriterion("messagecompany =", value, "messagecompany");
            return (Criteria) this;
        }

        public Criteria andMessagecompanyNotEqualTo(String value) {
            addCriterion("messagecompany <>", value, "messagecompany");
            return (Criteria) this;
        }

        public Criteria andMessagecompanyGreaterThan(String value) {
            addCriterion("messagecompany >", value, "messagecompany");
            return (Criteria) this;
        }

        public Criteria andMessagecompanyGreaterThanOrEqualTo(String value) {
            addCriterion("messagecompany >=", value, "messagecompany");
            return (Criteria) this;
        }

        public Criteria andMessagecompanyLessThan(String value) {
            addCriterion("messagecompany <", value, "messagecompany");
            return (Criteria) this;
        }

        public Criteria andMessagecompanyLessThanOrEqualTo(String value) {
            addCriterion("messagecompany <=", value, "messagecompany");
            return (Criteria) this;
        }

        public Criteria andMessagecompanyLike(String value) {
            addCriterion("messagecompany like", value, "messagecompany");
            return (Criteria) this;
        }

        public Criteria andMessagecompanyNotLike(String value) {
            addCriterion("messagecompany not like", value, "messagecompany");
            return (Criteria) this;
        }

        public Criteria andMessagecompanyIn(List<String> values) {
            addCriterion("messagecompany in", values, "messagecompany");
            return (Criteria) this;
        }

        public Criteria andMessagecompanyNotIn(List<String> values) {
            addCriterion("messagecompany not in", values, "messagecompany");
            return (Criteria) this;
        }

        public Criteria andMessagecompanyBetween(String value1, String value2) {
            addCriterion("messagecompany between", value1, value2, "messagecompany");
            return (Criteria) this;
        }

        public Criteria andMessagecompanyNotBetween(String value1, String value2) {
            addCriterion("messagecompany not between", value1, value2, "messagecompany");
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