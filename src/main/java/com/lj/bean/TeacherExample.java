package com.lj.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTIdsIsNull() {
            addCriterion("t_ids is null");
            return (Criteria) this;
        }

        public Criteria andTIdsIsNotNull() {
            addCriterion("t_ids is not null");
            return (Criteria) this;
        }

        public Criteria andTIdsEqualTo(Integer value) {
            addCriterion("t_ids =", value, "tIds");
            return (Criteria) this;
        }

        public Criteria andTIdsNotEqualTo(Integer value) {
            addCriterion("t_ids <>", value, "tIds");
            return (Criteria) this;
        }

        public Criteria andTIdsGreaterThan(Integer value) {
            addCriterion("t_ids >", value, "tIds");
            return (Criteria) this;
        }

        public Criteria andTIdsGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_ids >=", value, "tIds");
            return (Criteria) this;
        }

        public Criteria andTIdsLessThan(Integer value) {
            addCriterion("t_ids <", value, "tIds");
            return (Criteria) this;
        }

        public Criteria andTIdsLessThanOrEqualTo(Integer value) {
            addCriterion("t_ids <=", value, "tIds");
            return (Criteria) this;
        }

        public Criteria andTIdsIn(List<Integer> values) {
            addCriterion("t_ids in", values, "tIds");
            return (Criteria) this;
        }

        public Criteria andTIdsNotIn(List<Integer> values) {
            addCriterion("t_ids not in", values, "tIds");
            return (Criteria) this;
        }

        public Criteria andTIdsBetween(Integer value1, Integer value2) {
            addCriterion("t_ids between", value1, value2, "tIds");
            return (Criteria) this;
        }

        public Criteria andTIdsNotBetween(Integer value1, Integer value2) {
            addCriterion("t_ids not between", value1, value2, "tIds");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNull() {
            addCriterion("teacher_name is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNotNull() {
            addCriterion("teacher_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameEqualTo(String value) {
            addCriterion("teacher_name =", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotEqualTo(String value) {
            addCriterion("teacher_name <>", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThan(String value) {
            addCriterion("teacher_name >", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_name >=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThan(String value) {
            addCriterion("teacher_name <", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("teacher_name <=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLike(String value) {
            addCriterion("teacher_name like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotLike(String value) {
            addCriterion("teacher_name not like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIn(List<String> values) {
            addCriterion("teacher_name in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotIn(List<String> values) {
            addCriterion("teacher_name not in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameBetween(String value1, String value2) {
            addCriterion("teacher_name between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotBetween(String value1, String value2) {
            addCriterion("teacher_name not between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherBirIsNull() {
            addCriterion("teacher_bir is null");
            return (Criteria) this;
        }

        public Criteria andTeacherBirIsNotNull() {
            addCriterion("teacher_bir is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherBirEqualTo(Date value) {
            addCriterion("teacher_bir =", value, "teacherBir");
            return (Criteria) this;
        }

        public Criteria andTeacherBirNotEqualTo(Date value) {
            addCriterion("teacher_bir <>", value, "teacherBir");
            return (Criteria) this;
        }

        public Criteria andTeacherBirGreaterThan(Date value) {
            addCriterion("teacher_bir >", value, "teacherBir");
            return (Criteria) this;
        }

        public Criteria andTeacherBirGreaterThanOrEqualTo(Date value) {
            addCriterion("teacher_bir >=", value, "teacherBir");
            return (Criteria) this;
        }

        public Criteria andTeacherBirLessThan(Date value) {
            addCriterion("teacher_bir <", value, "teacherBir");
            return (Criteria) this;
        }

        public Criteria andTeacherBirLessThanOrEqualTo(Date value) {
            addCriterion("teacher_bir <=", value, "teacherBir");
            return (Criteria) this;
        }

        public Criteria andTeacherBirIn(List<Date> values) {
            addCriterion("teacher_bir in", values, "teacherBir");
            return (Criteria) this;
        }

        public Criteria andTeacherBirNotIn(List<Date> values) {
            addCriterion("teacher_bir not in", values, "teacherBir");
            return (Criteria) this;
        }

        public Criteria andTeacherBirBetween(Date value1, Date value2) {
            addCriterion("teacher_bir between", value1, value2, "teacherBir");
            return (Criteria) this;
        }

        public Criteria andTeacherBirNotBetween(Date value1, Date value2) {
            addCriterion("teacher_bir not between", value1, value2, "teacherBir");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptIsNull() {
            addCriterion("teacher_dept is null");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptIsNotNull() {
            addCriterion("teacher_dept is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptEqualTo(String value) {
            addCriterion("teacher_dept =", value, "teacherDept");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptNotEqualTo(String value) {
            addCriterion("teacher_dept <>", value, "teacherDept");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptGreaterThan(String value) {
            addCriterion("teacher_dept >", value, "teacherDept");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_dept >=", value, "teacherDept");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptLessThan(String value) {
            addCriterion("teacher_dept <", value, "teacherDept");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptLessThanOrEqualTo(String value) {
            addCriterion("teacher_dept <=", value, "teacherDept");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptLike(String value) {
            addCriterion("teacher_dept like", value, "teacherDept");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptNotLike(String value) {
            addCriterion("teacher_dept not like", value, "teacherDept");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptIn(List<String> values) {
            addCriterion("teacher_dept in", values, "teacherDept");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptNotIn(List<String> values) {
            addCriterion("teacher_dept not in", values, "teacherDept");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptBetween(String value1, String value2) {
            addCriterion("teacher_dept between", value1, value2, "teacherDept");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptNotBetween(String value1, String value2) {
            addCriterion("teacher_dept not between", value1, value2, "teacherDept");
            return (Criteria) this;
        }

        public Criteria andTeacherNumIsNull() {
            addCriterion("teacher_num is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNumIsNotNull() {
            addCriterion("teacher_num is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNumEqualTo(String value) {
            addCriterion("teacher_num =", value, "teacherNum");
            return (Criteria) this;
        }

        public Criteria andTeacherNumNotEqualTo(String value) {
            addCriterion("teacher_num <>", value, "teacherNum");
            return (Criteria) this;
        }

        public Criteria andTeacherNumGreaterThan(String value) {
            addCriterion("teacher_num >", value, "teacherNum");
            return (Criteria) this;
        }

        public Criteria andTeacherNumGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_num >=", value, "teacherNum");
            return (Criteria) this;
        }

        public Criteria andTeacherNumLessThan(String value) {
            addCriterion("teacher_num <", value, "teacherNum");
            return (Criteria) this;
        }

        public Criteria andTeacherNumLessThanOrEqualTo(String value) {
            addCriterion("teacher_num <=", value, "teacherNum");
            return (Criteria) this;
        }

        public Criteria andTeacherNumLike(String value) {
            addCriterion("teacher_num like", value, "teacherNum");
            return (Criteria) this;
        }

        public Criteria andTeacherNumNotLike(String value) {
            addCriterion("teacher_num not like", value, "teacherNum");
            return (Criteria) this;
        }

        public Criteria andTeacherNumIn(List<String> values) {
            addCriterion("teacher_num in", values, "teacherNum");
            return (Criteria) this;
        }

        public Criteria andTeacherNumNotIn(List<String> values) {
            addCriterion("teacher_num not in", values, "teacherNum");
            return (Criteria) this;
        }

        public Criteria andTeacherNumBetween(String value1, String value2) {
            addCriterion("teacher_num between", value1, value2, "teacherNum");
            return (Criteria) this;
        }

        public Criteria andTeacherNumNotBetween(String value1, String value2) {
            addCriterion("teacher_num not between", value1, value2, "teacherNum");
            return (Criteria) this;
        }

        public Criteria andTeacherEmilsIsNull() {
            addCriterion("teacher_emils is null");
            return (Criteria) this;
        }

        public Criteria andTeacherEmilsIsNotNull() {
            addCriterion("teacher_emils is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEmilsEqualTo(String value) {
            addCriterion("teacher_emils =", value, "teacherEmils");
            return (Criteria) this;
        }

        public Criteria andTeacherEmilsNotEqualTo(String value) {
            addCriterion("teacher_emils <>", value, "teacherEmils");
            return (Criteria) this;
        }

        public Criteria andTeacherEmilsGreaterThan(String value) {
            addCriterion("teacher_emils >", value, "teacherEmils");
            return (Criteria) this;
        }

        public Criteria andTeacherEmilsGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_emils >=", value, "teacherEmils");
            return (Criteria) this;
        }

        public Criteria andTeacherEmilsLessThan(String value) {
            addCriterion("teacher_emils <", value, "teacherEmils");
            return (Criteria) this;
        }

        public Criteria andTeacherEmilsLessThanOrEqualTo(String value) {
            addCriterion("teacher_emils <=", value, "teacherEmils");
            return (Criteria) this;
        }

        public Criteria andTeacherEmilsLike(String value) {
            addCriterion("teacher_emils like", value, "teacherEmils");
            return (Criteria) this;
        }

        public Criteria andTeacherEmilsNotLike(String value) {
            addCriterion("teacher_emils not like", value, "teacherEmils");
            return (Criteria) this;
        }

        public Criteria andTeacherEmilsIn(List<String> values) {
            addCriterion("teacher_emils in", values, "teacherEmils");
            return (Criteria) this;
        }

        public Criteria andTeacherEmilsNotIn(List<String> values) {
            addCriterion("teacher_emils not in", values, "teacherEmils");
            return (Criteria) this;
        }

        public Criteria andTeacherEmilsBetween(String value1, String value2) {
            addCriterion("teacher_emils between", value1, value2, "teacherEmils");
            return (Criteria) this;
        }

        public Criteria andTeacherEmilsNotBetween(String value1, String value2) {
            addCriterion("teacher_emils not between", value1, value2, "teacherEmils");
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