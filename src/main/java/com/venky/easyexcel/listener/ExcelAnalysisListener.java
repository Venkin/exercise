package com.venky.easyexcel.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.venky.easyexcel.CustomExcelProcessor;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * 文章监听
 *
 * @author huwk
 * @date 2019/11/2
 **/
@Slf4j
public class ExcelAnalysisListener<T> extends AnalysisEventListener<T> {

    /**
     * 每隔5条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 5;
    List<T> list = new ArrayList<>();

    private CustomExcelProcessor processor;

    public ExcelAnalysisListener(){

    }

    public ExcelAnalysisListener(CustomExcelProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void invoke(T data, AnalysisContext context) {

        if (processor != null) {
            processor.invoke(data,context);
        }

        log.info("解析到一条数据:{}", data.toString());

        if (allNull(data)) {
            log.info("元素为空，不需要解析");
            return;
        }

        list.add(data);
        if (list.size() >= BATCH_COUNT) {
            saveData();
            list.clear();
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
        saveData();
        log.info("所有数据解析完成！");
    }

    /**
     * 加上存储数据库
     */
    private void saveData() {
        log.info("{}条数据，开始存储数据库！", list.size());
        log.info("存储数据库成功！");
    }
}
