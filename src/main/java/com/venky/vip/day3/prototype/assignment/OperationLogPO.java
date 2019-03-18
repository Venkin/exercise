package com.venky.vip.day3.prototype.assignment;

/**
 * 操作日志对象持久化层对象
 *
 * @author Venkin
 * @date 2019/3/17
 **/
public class OperationLogPO {

    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 企业id
     */
    private String enterpriseId;
    /**
     * 操作平台
     */
    private String platform;
    /**
     * 座席编号
     */
    private String cno;
    /**
     * 操作人
     */
    private String operator;
    /**
     * 操作模块
     */
    private String module;
    /**
     * 操作对象
     */
    private String object;
    /**
     * 操作方式
     */
    private String optType;
    /**
     * 用户类型
     */
    private String userType;
    /**
     * 操作时间
     */
    private Long operateTime;
    /**
     * 操作结果
     */
    private String result;
    /**
     * 详细信息
     */
    private String comment;

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
        this.enterpriseId = enterpriseId;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getOptType() {
        return optType;
    }

    public void setOptType(String optType) {
        this.optType = optType;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Long getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
