package com.venky.easyexcel.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.venky.easyexcel.CustomExcelProcessor;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;

/**
 * 文章监听
 *
 * @author huwk
 * @date 2019/11/2
 **/
@Slf4j
public class ExcelAnalysisListener<T> extends AnalysisEventListener<T> {

    private CustomExcelProcessor processor;

    public ExcelAnalysisListener(CustomExcelProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void invoke(T data, AnalysisContext context) {

        if (allNull(data)) {
            log.info("元素为空，不需要解析");
            return;
        }

        if (processor != null) {
            processor.invoke(data,context);
        }
    }

    public Boolean allNull(T data){
        for (Field f :data.getClass().getDeclaredFields()) {
            f.setAccessible(true);
            try {
                if (f.get(data) != null) {
                    return false;
                }
            } catch (IllegalAccessException e) {
                log.error("IllegalAccessException ",e);
            }
        }
        return true;
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        if (processor != null) {
            processor.doAfterAllAnalysed(context);
        }
    }
}
