package com.venky.vip.day4.strategy.rebuild.old;

import com.venky.vip.day4.strategy.rebuild.model.SynModel;

/**
 * 风险号码同步
 *
 * @author Venkin
 * @date 2019/4/1
 **/
public class RiskNumberPush {

    /**
     * 操作数据
     *
     * @param synModel
     * @param object
     * @throws Exception
     */
    private void operate(SynModel synModel, Object object) throws Exception {
        /*企业白名单*//*
        if (QueueAction.CreateEnterpriseWhite.name().equals(synModel.getAction())) {
            enterpriseWhiteService.insert((EnterpriseWhite) object);
        } else if (QueueAction.UpdateEnterpriseWhite.name().equals(synModel.getAction())) {
            enterpriseWhiteService.updateById((EnterpriseWhite) object);
        } else if (QueueAction.DeleteEnterpriseWhite.name().equals(synModel.getAction())) {
            enterpriseWhiteService.deleteByEnterpriseId(((EnterpriseWhite) object).getEnterpriseId());
        }
        *//*号码白名单*//*
        else if (QueueAction.CreateNumberWhite.name().equals(synModel.getAction())) {
            numberWhiteService.insert((NumberWhite) object);
        } else if (QueueAction.UpdateNumberWhite.name().equals(synModel.getAction())) {
            numberWhiteService.updateById((NumberWhite) object);
        } else if (QueueAction.DeleteNumberWhite.name().equals(synModel.getAction())) {
            numberWhiteService.deleteByEnterpriseIDAndNumberAndNumberType((NumberWhite) object);
        }
        *//*号码黑名单*//*
        else if (QueueAction.CreateNumberBlack.name().equals(synModel.getAction())) {
            //需要通过redis维护有效期，且数据的次数需要基于原来的基础上
            NumberBlack numberBlack = (NumberBlack) object;
            numberBlack.setEndTime(DateUtil.addHour(new Date(), numberBlack.getLimitTime()));
            numberBlackService.add(numberBlack);
        } else if (QueueAction.UpdateNumberBlack.name().equals(synModel.getAction())) {
            numberBlackService.updateByEnterpriseIdAndNumber((NumberBlack) object);
        } else if (QueueAction.DeleteNumberBlack.name().equals(synModel.getAction())) {
            NumberBlack black = (NumberBlack) object;
            numberBlackService.deleteByEnterpriseIDAndNumber(black.getEnterpriseId(), black.getTelNumber());
        }
        *//*电话邦风险规则*//*
        else if (QueueAction.CreateDianhuabangRiskControl.name().equals(synModel.getAction())) {
            dianhuabangRiskControlService.add((DianhuabangRiskControl) object);
        } else if (QueueAction.UpdateDianhuabangRiskControl.name().equals(synModel.getAction())) {
            DianhuabangRiskControl control = (DianhuabangRiskControl) object;
            dianhuabangRiskControlService.update(control.getId(), control);
        } else if (QueueAction.DeleteDianhuabangRiskControl.name().equals(synModel.getAction())) {
            dianhuabangRiskControlService.deleteByEnterpriseId(((DianhuabangRiskControl) object).getEnterpriseId());
        }
        *//*企业免打扰号码*//*
        else if (QueueAction.CreateEnterpriseNoDisturbance.name().equals(synModel.getAction())) {
            EnterpriseNoDisturbance enterpriseNoDisturbance = (EnterpriseNoDisturbance) object;
            enterpriseNoDisturbance.setCreateTime(new Date());
            enterpriseNoDisturbance.setEndTime(DateUtil.addHour(new Date(), enterpriseNoDisturbance.getLimitTime()));
            enterpriseNoDisturbance.setUpdateTime(new Date());
            enterpriseNoDisturbanceService.insertSelective(enterpriseNoDisturbance);
        } else if (QueueAction.UpdateEnterpriseNoDisturbance.name().equals(synModel.getAction())) {
            EnterpriseNoDisturbance disturbance = (EnterpriseNoDisturbance) object;
            //数据库中不需要再维护,只从redis删除便是
            //enterpriseNoDisturbanceService.deleteByEnterpriseIDAndNumber(0,disturbance.getEnterpriseId(),disturbance.getTelNumber());
            //redis:删除redis数据
            redisTemplateBlackNumber.delete(generateEnterpriseNoDisturbanceKey(String.valueOf(disturbance.getEnterpriseId()), disturbance.getTelNumber()));
        } else if (QueueAction.DeleteEnterpriseNoDisturbance.name().equals(synModel.getAction())) {
            EnterpriseNoDisturbance disturbance = (EnterpriseNoDisturbance) object;
            //enterpriseNoDisturbanceService.deleteByEnterpriseIDAndNumber(1,disturbance.getEnterpriseId(),disturbance.getTelNumber());
            //数据库中不需要再维护,只从redis删除便是
            redisTemplateBlackNumber.delete(generateEnterpriseNoDisturbanceKey(String.valueOf(disturbance.getEnterpriseId()), disturbance.getTelNumber()));
        }

        *//*禁拨时段规则*//*
        else if (QueueAction.CreateForbiddenCallTime.name().equals(synModel.getAction())) {
            forbiddenCallTimeService.add((ForbiddenCallTime) object);
        } else if (QueueAction.UpdateForbiddenCallTime.name().equals(synModel.getAction())) {
            ForbiddenCallTime callTime = (ForbiddenCallTime) object;
            forbiddenCallTimeService.update(callTime.getId(), callTime);
        } else if (QueueAction.DeleteForbiddenCallTime.name().equals(synModel.getAction())) {
            forbiddenCallTimeService.deleteByEnterpriseId(((ForbiddenCallTime) object).getEnterpriseId());
        }
        *//*主叫规则限制*//*
        else if (QueueAction.CreateCallingRule.name().equals(synModel.getAction())) {
            callingRuleService.addCalling((CallingRule) object);
        } else if (QueueAction.UpdateCallingRule.name().equals(synModel.getAction())) {
            callingRuleService.updateByCallingNumber((CallingRule) object);
        } else if (QueueAction.DeleteCallingRule.name().equals(synModel.getAction())) {
            callingRuleService.deleteByCallingNumber(((CallingRule) object).getCallingNumber());
        }
        *//*大数据风险号码*//*
        else if (QueueAction.UpdateBigDataRiskNumber.name().equals(synModel.getAction())) {
            BigDataRiskNumber riskNumber = (BigDataRiskNumber) object;
            redisTemplateMaxCompute.delete(generateRiskNumberKey(String.valueOf(riskNumber.getEnterpriseId()), riskNumber.getCustomerNumber()));
        } else if (QueueAction.DeleteBigDataRiskNumber.name().equals(synModel.getAction())) {
            BigDataRiskNumber riskNumber = (BigDataRiskNumber) object;
            redisTemplateMaxCompute.delete(generateRiskNumberKey(String.valueOf(riskNumber.getEnterpriseId()), riskNumber.getCustomerNumber()));
        }
        *//*实时风险号码*//*
        else if (QueueAction.UpdateRealTimeRiskNumber.name().equals(synModel.getAction())) {
            RealTimeRiskNumber riskNumber = (RealTimeRiskNumber) object;
            redisTemplateRealTime.delete(generateRealTimeRiskNumberKey(riskNumber.getEnterpriseId(), riskNumber.getCustomerNumber()));
        } else if (QueueAction.DeleteRealTimeRiskNumber.name().equals(synModel.getAction())) {
            RealTimeRiskNumber riskNumber = (RealTimeRiskNumber) object;
            //删除风险号码总值
            redisTemplateRealTime.delete(generateRealTimeRiskNumberKey(riskNumber.getEnterpriseId(), riskNumber.getCustomerNumber()));
            //删除风险号码的统计数
            redisTemplateRealTime.delete(generateRealTimeRiskNumberTotalKey(riskNumber.getEnterpriseId(), riskNumber.getCustomerNumber()));
        }
        *//*cdr内容检测*//*
        else if (QueueAction.CreateContentDetectionResult.name().equals(synModel.getAction())) {
            ContentDetectionResult result = (ContentDetectionResult) object;
            logger.info("realtime asr score result:"+result.toString());
            realTimeRiskNumberValueComputeService.updateRealTimeRiskNumberValue(result);
        }

        *//*企业cdr推送*//*
        else if (QueueAction.CreateCdrPushEnterprise.name().equals(synModel.getAction())) {
            CdrPushEnterprise result = (CdrPushEnterprise) object;
            cdrPushEnterpriseService.save(result);
        } else if (QueueAction.UpdateCdrPushEnterprise.name().equals(synModel.getAction())) {
            CdrPushEnterprise result = (CdrPushEnterprise) object;
            result.setCreateTime(new Date());
            cdrPushEnterpriseService.updateByEnterpriseId(result);
        } else if (QueueAction.DeleteCdrPushEnterprise.name().equals(synModel.getAction())) {
            CdrPushEnterprise result = (CdrPushEnterprise) object;
            cdrPushEnterpriseService.deleteByEnterpriseId(result);
        }
        *//*大数据风控规则配置*//*
        else if (QueueAction.CreateEnterpriseSetting.name().equals(synModel.getAction())) {
            EnterpriseSetting enterpriseSetting = (EnterpriseSetting) object;
            enterpriseSettingService.save(enterpriseSetting);
        } else if (QueueAction.UpdateEnterpriseSetting.name().equals(synModel.getAction())) {
            EnterpriseSetting enterpriseSetting = (EnterpriseSetting) object;
            enterpriseSettingService.updateByEnterpriseId(enterpriseSetting);
        } else if (QueueAction.DeleteEnterpriseSetting.name().equals(synModel.getAction())) {
            EnterpriseSetting enterpriseSetting = (EnterpriseSetting) object;
            enterpriseSettingService.deleteByEnterpriseId(enterpriseSetting.getEnterpriseId());
        }

        *//*风控配置 多规则配置需求新增的功能*//*
        else if (QueueAction.CreateRiskControlSetting.name().equals(synModel.getAction())) {
            RiskControlSetting riskControlSetting = (RiskControlSetting) object;
            // 同步到内存中
            redisTemplate.convertAndSend(Const.REDIS_CHANNEL_RISK_CONTROL_SETTING_UPDATE, riskControlSetting);
        } else if (QueueAction.UpdateRiskControlSetting.name().equals(synModel.getAction())) {
            RiskControlSetting riskControlSetting = (RiskControlSetting) object;
            // 同步到内存中
            redisTemplate.convertAndSend(Const.REDIS_CHANNEL_RISK_CONTROL_SETTING_UPDATE, riskControlSetting);
        } else if (QueueAction.DeleteRiskControlSetting.name().equals(synModel.getAction())) {
            RiskControlSetting riskControlSetting = (RiskControlSetting) object;
            // 同步到内存中
            redisTemplate.convertAndSend(Const.REDIS_CHANNEL_RISK_CONTROL_SETTING_DELETE, riskControlSetting.getEnterpriseId());
        }

        *//*实时冻结规则 多规则配置需求新增的功能*//*
        else if (QueueAction.CreateRealTimeFreezeRule.name().equals(synModel.getAction())) {
            RealTimeFreezeRule realTimeFreezeRule = (RealTimeFreezeRule) object;
            // 同步到内存中
            redisTemplate.convertAndSend(Const.REDIS_CHANNEL_REAL_TIME_FREEZE_RULE_UPDATE, realTimeFreezeRule);
        } else if (QueueAction.UpdateRealTimeFreezeRule.name().equals(synModel.getAction())) {
            RealTimeFreezeRule realTimeFreezeRule = (RealTimeFreezeRule) object;
            // 同步到内存中
            redisTemplate.convertAndSend(Const.REDIS_CHANNEL_REAL_TIME_FREEZE_RULE_UPDATE, realTimeFreezeRule);
        } else if (QueueAction.DeleteRealTimeFreezeRule.name().equals(synModel.getAction())) {
            RealTimeFreezeRule realTimeFreezeRule = (RealTimeFreezeRule) object;
            // 同步到内存中
            redisTemplate.convertAndSend(Const.REDIS_CHANNEL_REAL_TIME_FREEZE_RULE_DELETE, realTimeFreezeRule);
        }

        *//*历史冻结规则 多规则配置需求新增的功能*//*
        else if (QueueAction.CreateBigDataFreezeRule.name().equals(synModel.getAction())) {
            BigDataFreezeRule bigDataFreezeRule = (BigDataFreezeRule) object;
            // 同步到内存中
            redisTemplate.convertAndSend(Const.REDIS_CHANNEL_BIG_DATA_FREEZE_RULE_UPDATE, bigDataFreezeRule);
        } else if (QueueAction.UpdateBigDataFreezeRule.name().equals(synModel.getAction())) {
            BigDataFreezeRule bigDataFreezeRule = (BigDataFreezeRule) object;
            // 同步到内存中
            redisTemplate.convertAndSend(Const.REDIS_CHANNEL_BIG_DATA_FREEZE_RULE_UPDATE, bigDataFreezeRule);
        } else if (QueueAction.DeleteBigDataFreezeRule.name().equals(synModel.getAction())) {
            BigDataFreezeRule bigDataFreezeRule = (BigDataFreezeRule) object;
            // 同步到内存中
            redisTemplate.convertAndSend(Const.REDIS_CHANNEL_BIG_DATA_FREEZE_RULE_DELETE, bigDataFreezeRule);
        }

        *//*放行规则 多规则配置需求新增的功能*//*
        else if (QueueAction.CreatePassRule.name().equals(synModel.getAction())) {
            PassRule passRule = (PassRule) object;
            // 同步到内存中
            redisTemplate.convertAndSend(Const.REDIS_CHANNEL_PASS_RULE_UPDATE, passRule);
        } else if (QueueAction.UpdatePassRule.name().equals(synModel.getAction())) {
            PassRule passRule = (PassRule) object;
            // 同步到内存中
            redisTemplate.convertAndSend(Const.REDIS_CHANNEL_PASS_RULE_UPDATE, passRule);
        } else if (QueueAction.DeletePassRule.name().equals(synModel.getAction())) {
            PassRule passRule = (PassRule) object;
            // 同步到内存中
            redisTemplate.convertAndSend(Const.REDIS_CHANNEL_PASS_RULE_DELETE, passRule);
        }*/

    }
}
