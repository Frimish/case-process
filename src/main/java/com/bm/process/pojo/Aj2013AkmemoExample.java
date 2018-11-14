package com.bm.process.pojo;

import java.util.ArrayList;
import java.util.List;

public class Aj2013AkmemoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Aj2013AkmemoExample() {
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

        public Criteria andAkmemoGuidIsNull() {
            addCriterion("AKMEMO_GUID is null");
            return (Criteria) this;
        }

        public Criteria andAkmemoGuidIsNotNull() {
            addCriterion("AKMEMO_GUID is not null");
            return (Criteria) this;
        }

        public Criteria andAkmemoGuidEqualTo(String value) {
            addCriterion("AKMEMO_GUID =", value, "akmemoGuid");
            return (Criteria) this;
        }

        public Criteria andAkmemoGuidNotEqualTo(String value) {
            addCriterion("AKMEMO_GUID <>", value, "akmemoGuid");
            return (Criteria) this;
        }

        public Criteria andAkmemoGuidGreaterThan(String value) {
            addCriterion("AKMEMO_GUID >", value, "akmemoGuid");
            return (Criteria) this;
        }

        public Criteria andAkmemoGuidGreaterThanOrEqualTo(String value) {
            addCriterion("AKMEMO_GUID >=", value, "akmemoGuid");
            return (Criteria) this;
        }

        public Criteria andAkmemoGuidLessThan(String value) {
            addCriterion("AKMEMO_GUID <", value, "akmemoGuid");
            return (Criteria) this;
        }

        public Criteria andAkmemoGuidLessThanOrEqualTo(String value) {
            addCriterion("AKMEMO_GUID <=", value, "akmemoGuid");
            return (Criteria) this;
        }

        public Criteria andAkmemoGuidLike(String value) {
            addCriterion("AKMEMO_GUID like", value, "akmemoGuid");
            return (Criteria) this;
        }

        public Criteria andAkmemoGuidNotLike(String value) {
            addCriterion("AKMEMO_GUID not like", value, "akmemoGuid");
            return (Criteria) this;
        }

        public Criteria andAkmemoGuidIn(List<String> values) {
            addCriterion("AKMEMO_GUID in", values, "akmemoGuid");
            return (Criteria) this;
        }

        public Criteria andAkmemoGuidNotIn(List<String> values) {
            addCriterion("AKMEMO_GUID not in", values, "akmemoGuid");
            return (Criteria) this;
        }

        public Criteria andAkmemoGuidBetween(String value1, String value2) {
            addCriterion("AKMEMO_GUID between", value1, value2, "akmemoGuid");
            return (Criteria) this;
        }

        public Criteria andAkmemoGuidNotBetween(String value1, String value2) {
            addCriterion("AKMEMO_GUID not between", value1, value2, "akmemoGuid");
            return (Criteria) this;
        }

        public Criteria andTjbhIsNull() {
            addCriterion("TJBH is null");
            return (Criteria) this;
        }

        public Criteria andTjbhIsNotNull() {
            addCriterion("TJBH is not null");
            return (Criteria) this;
        }

        public Criteria andTjbhEqualTo(String value) {
            addCriterion("TJBH =", value, "tjbh");
            return (Criteria) this;
        }

        public Criteria andTjbhNotEqualTo(String value) {
            addCriterion("TJBH <>", value, "tjbh");
            return (Criteria) this;
        }

        public Criteria andTjbhGreaterThan(String value) {
            addCriterion("TJBH >", value, "tjbh");
            return (Criteria) this;
        }

        public Criteria andTjbhGreaterThanOrEqualTo(String value) {
            addCriterion("TJBH >=", value, "tjbh");
            return (Criteria) this;
        }

        public Criteria andTjbhLessThan(String value) {
            addCriterion("TJBH <", value, "tjbh");
            return (Criteria) this;
        }

        public Criteria andTjbhLessThanOrEqualTo(String value) {
            addCriterion("TJBH <=", value, "tjbh");
            return (Criteria) this;
        }

        public Criteria andTjbhLike(String value) {
            addCriterion("TJBH like", value, "tjbh");
            return (Criteria) this;
        }

        public Criteria andTjbhNotLike(String value) {
            addCriterion("TJBH not like", value, "tjbh");
            return (Criteria) this;
        }

        public Criteria andTjbhIn(List<String> values) {
            addCriterion("TJBH in", values, "tjbh");
            return (Criteria) this;
        }

        public Criteria andTjbhNotIn(List<String> values) {
            addCriterion("TJBH not in", values, "tjbh");
            return (Criteria) this;
        }

        public Criteria andTjbhBetween(String value1, String value2) {
            addCriterion("TJBH between", value1, value2, "tjbh");
            return (Criteria) this;
        }

        public Criteria andTjbhNotBetween(String value1, String value2) {
            addCriterion("TJBH not between", value1, value2, "tjbh");
            return (Criteria) this;
        }

        public Criteria andAkmemoIsNull() {
            addCriterion("AKMEMO is null");
            return (Criteria) this;
        }

        public Criteria andAkmemoIsNotNull() {
            addCriterion("AKMEMO is not null");
            return (Criteria) this;
        }

        public Criteria andAkmemoEqualTo(String value) {
            addCriterion("AKMEMO =", value, "akmemo");
            return (Criteria) this;
        }

        public Criteria andAkmemoNotEqualTo(String value) {
            addCriterion("AKMEMO <>", value, "akmemo");
            return (Criteria) this;
        }

        public Criteria andAkmemoGreaterThan(String value) {
            addCriterion("AKMEMO >", value, "akmemo");
            return (Criteria) this;
        }

        public Criteria andAkmemoGreaterThanOrEqualTo(String value) {
            addCriterion("AKMEMO >=", value, "akmemo");
            return (Criteria) this;
        }

        public Criteria andAkmemoLessThan(String value) {
            addCriterion("AKMEMO <", value, "akmemo");
            return (Criteria) this;
        }

        public Criteria andAkmemoLessThanOrEqualTo(String value) {
            addCriterion("AKMEMO <=", value, "akmemo");
            return (Criteria) this;
        }

        public Criteria andAkmemoLike(String value) {
            addCriterion("AKMEMO like", value, "akmemo");
            return (Criteria) this;
        }

        public Criteria andAkmemoNotLike(String value) {
            addCriterion("AKMEMO not like", value, "akmemo");
            return (Criteria) this;
        }

        public Criteria andAkmemoIn(List<String> values) {
            addCriterion("AKMEMO in", values, "akmemo");
            return (Criteria) this;
        }

        public Criteria andAkmemoNotIn(List<String> values) {
            addCriterion("AKMEMO not in", values, "akmemo");
            return (Criteria) this;
        }

        public Criteria andAkmemoBetween(String value1, String value2) {
            addCriterion("AKMEMO between", value1, value2, "akmemo");
            return (Criteria) this;
        }

        public Criteria andAkmemoNotBetween(String value1, String value2) {
            addCriterion("AKMEMO not between", value1, value2, "akmemo");
            return (Criteria) this;
        }

        public Criteria andBmsahIsNull() {
            addCriterion("BMSAH is null");
            return (Criteria) this;
        }

        public Criteria andBmsahIsNotNull() {
            addCriterion("BMSAH is not null");
            return (Criteria) this;
        }

        public Criteria andBmsahEqualTo(String value) {
            addCriterion("BMSAH =", value, "bmsah");
            return (Criteria) this;
        }

        public Criteria andBmsahNotEqualTo(String value) {
            addCriterion("BMSAH <>", value, "bmsah");
            return (Criteria) this;
        }

        public Criteria andBmsahGreaterThan(String value) {
            addCriterion("BMSAH >", value, "bmsah");
            return (Criteria) this;
        }

        public Criteria andBmsahGreaterThanOrEqualTo(String value) {
            addCriterion("BMSAH >=", value, "bmsah");
            return (Criteria) this;
        }

        public Criteria andBmsahLessThan(String value) {
            addCriterion("BMSAH <", value, "bmsah");
            return (Criteria) this;
        }

        public Criteria andBmsahLessThanOrEqualTo(String value) {
            addCriterion("BMSAH <=", value, "bmsah");
            return (Criteria) this;
        }

        public Criteria andBmsahLike(String value) {
            addCriterion("BMSAH like", value, "bmsah");
            return (Criteria) this;
        }

        public Criteria andBmsahNotLike(String value) {
            addCriterion("BMSAH not like", value, "bmsah");
            return (Criteria) this;
        }

        public Criteria andBmsahIn(List<String> values) {
            addCriterion("BMSAH in", values, "bmsah");
            return (Criteria) this;
        }

        public Criteria andBmsahNotIn(List<String> values) {
            addCriterion("BMSAH not in", values, "bmsah");
            return (Criteria) this;
        }

        public Criteria andBmsahBetween(String value1, String value2) {
            addCriterion("BMSAH between", value1, value2, "bmsah");
            return (Criteria) this;
        }

        public Criteria andBmsahNotBetween(String value1, String value2) {
            addCriterion("BMSAH not between", value1, value2, "bmsah");
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