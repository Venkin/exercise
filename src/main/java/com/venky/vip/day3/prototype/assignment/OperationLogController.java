package com.venky.vip.day3.prototype.assignment;

import org.springframework.beans.BeanUtils;

/**
 * 操作日志模拟的一个控制器
 *
 * @author Venkin
 * @date 2019/3/17
 **/
public class OperationLogController {


    /**
     * 改造前
     * 从后台传过来的PO对象转换为前台展示的VO对象
     *
     * @param po 后台实体对象
     * @return
     */
    public OperationLogVO getOperationLog(OperationLogPO po) {

        OperationLogVO vo = new OperationLogVO();

        vo.setEnterpriseId(po.getEnterpriseId());
        vo.setObject(po.getObject());
        vo.setOperateTime(po.getOperateTime());
        vo.setOperator(po.getOperator());
        vo.setOptType(po.getOptType());
        vo.setResult(po.getResult());

        return vo;
    }

    /**
     * 使用原型模式后
     * 从后台传过来的PO对象转换为前台展示的VO对象
     *
     * @param po 后台实体对象
     * @return
     */
    public OperationLogVO getOperationLogNew(OperationLogPO po) {

        OperationLogVO vo = new OperationLogVO();
        try {
            BeanUtils.copyProperties(po, vo);
        } catch (Exception e) {
            throw new RuntimeException("克隆对象出错",e);
        }
        return vo;
    }
}
