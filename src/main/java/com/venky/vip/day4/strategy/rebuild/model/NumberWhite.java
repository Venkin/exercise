package com.venky.vip.day4.strategy.rebuild.model;

import java.util.Date;

public class NumberWhite {
    private Integer id;

    private String telNumber;

    private String enterpriseId;

    /**
     * 可以状态: 0 失效 1 生效
     */
    private Integer status;

    private String comment;

    private Date createTime;

    private Integer count; //为了实现自定义的saveOrUpdate而定义的属性，用来保存id的个数

    private Integer numberType; // 号码白名单类型 0：被叫白名单 1：主叫白名单。

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber == null ? null : telNumber.trim();
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId == null ? null : enterpriseId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getNumberType() {
        return numberType;
    }

    public void setNumberType(Integer numberType) {
        this.numberType = numberType;
    }
}