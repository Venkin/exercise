package com.venky.easyexcel;

import com.alibaba.excel.context.AnalysisContext;
import com.venky.easyexcel.model.SimilarQuestion;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 相似问题excel处理
 *
 * @author huwk
 * @date 2019/11/12
 **/
@Service
@Scope("prototype")
@Slf4j
public class SimilarQuestionExcelService implements CustomExcelProcessor<SimilarQuestion> {

    private List<SimilarQuestion> similars;

    public void init(List<SimilarQuestion> similars) {
        this.similars = similars;
    }

    @Override
    public void invoke(SimilarQuestion data, AnalysisContext context) {
        this.similars.add(data);

    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {

    }


}
