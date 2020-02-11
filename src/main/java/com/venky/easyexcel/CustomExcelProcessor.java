package com.venky.easyexcel;

import com.alibaba.excel.context.AnalysisContext;

/**
 * 自定义excel处理器
 *
 * @author huwk
 * @date 2019/11/3
 **/
public interface CustomExcelProcessor<T> {


    /**
     * When analysis one row trigger invoke function.
     *
     * @param data
     *            one row value. Is is same as {@link AnalysisContext#readRowHolder()}
     * @param context
     *            analysis context
     */
    void invoke(T data, AnalysisContext context);

    /**
     * if have something to do after all analysis
     *
     * @param context
     */
    void doAfterAllAnalysed(AnalysisContext context);


}
