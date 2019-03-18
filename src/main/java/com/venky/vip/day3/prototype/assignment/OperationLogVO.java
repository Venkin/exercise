package com.venky.vip.day3.prototype.assignment;

/**
 * 操作日志对象展示层字段
 *
 * @author Venkin
 * @date 2019/3/17
 **/
public class OperationLogVO {

    /**
     * 企业id
     */
    private String enterpriseId;
    /**
     * 操作人
     */
    private String operator;
    /**
     * 操作对象
     */
    private String object;
    /**
     * 操作方式
     */
    private String optType;
    /**
     * 操作时间
     */
    private Long operateTime;
    /**
     * 操作结果
     */
    private String result;

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
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
}
