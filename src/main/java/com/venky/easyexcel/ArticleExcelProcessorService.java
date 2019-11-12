package com.venky.easyexcel;

import com.alibaba.excel.context.AnalysisContext;
import com.venky.easyexcel.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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



    private Set<String> checkValueSet;

    private List<Article> articles;


    public void init(List<Article> articles) {

        this.checkValueSet = new HashSet<>();
        this.articles = articles;

    }

    @Override
    public void invoke(Article data, AnalysisContext context) {

        boolean check = checkUniqueValue(data.getTitle());

        if (check) {
            this.articles.add(data);
        } else {
            log.info("数据重复了 {}",data);
        }



    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {

        log.info("所有数据解析完成！");
    }

    private boolean checkUniqueValue(String title) {
        return checkValueSet.add(title);
    }
}
