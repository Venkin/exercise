package com.venky.easyexcel;

import com.alibaba.excel.context.AnalysisContext;
import com.venky.easyexcel.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 文章 导入 处理
 *
 * @author huwk
 * @date 2019/11/3
 **/
@Service
@Scope("prototype")
@Slf4j
public class ArticleExcelProcessorService implements CustomExcelProcessor<Article> {




    @Override
    public void invoke(Article data, AnalysisContext context) {

        log.info("data {} row {}",data,context.readRowHolder().getRowIndex());

    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {

    }
}
