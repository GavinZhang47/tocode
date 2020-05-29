package com.example.tocode.code.entity;

import java.io.Serializable;

/**
 * 告警统计表(TAlarmCount)实体类
 *
 * @author makejava
 * @since 2020-05-24 20:22:00
 */
public class TAlarmCount implements Serializable {
    private static final long serialVersionUID = -49110155947835907L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 客户id
    */
    private String clientId;
    /**
    * 情绪
    */
    private String mood;
    /**
    * 时间类型 1. 0-30min 2. 30-60min 3. 60-90min 4. 90以上
    */
    private Integer timeType;
    /**
    * 谈话类型    -约谈-廉政谈话-谈话诫勉-提醒谈话-谈话函询-组织调查
    */
    private String conversationType;
    /**
    * 年龄段 1. 0-17  2. 18-25  3. 25-35  4. 36-45 5. 46-69  6. 70以上
    */
    private Integer ageType;
    /**
    * 性别  0-男  1-女
    */
    private Integer gender;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public Integer getTimeType() {
        return timeType;
    }

    public void setTimeType(Integer timeType) {
        this.timeType = timeType;
    }

    public String getConversationType() {
        return conversationType;
    }

    public void setConversationType(String conversationType) {
        this.conversationType = conversationType;
    }

    public Integer getAgeType() {
        return ageType;
    }

    public void setAgeType(Integer ageType) {
        this.ageType = ageType;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

}