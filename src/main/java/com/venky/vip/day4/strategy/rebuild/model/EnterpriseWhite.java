package com.venky.vip.day4.strategy.rebuild.model;

import java.util.Date;

/**
 * 企业白名单
 * @author lizheng
 *
 */
public class EnterpriseWhite {
    private Integer id;

    private String enterpriseId;

    /**
     * 白名单可用状态 0 失效 1 有效
     */
    private Integer status;

    private String comment;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}