package com.venky;

import com.alibaba.excel.EasyExcel;
import com.venky.easyexcel.ArticleExcelProcessorService;
import com.venky.easyexcel.CustomExcelProcessor;
import com.venky.easyexcel.SimilarQuestionExcelService;
import com.venky.easyexcel.listener.ExcelAnalysisListener;
import com.venky.easyexcel.model.Article;
import com.venky.easyexcel.model.SimilarQuestion;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 测试批量导入
 *
 * @author huwk
 * @date 2019/11/2
 **/
public class TestEasyExcel {

    /**
     * 最简单的读
     * <p>1. 创建excel对应的实体对象 参照{@link Article}
     * <p>2. 由于默认异步读取excel，所以需要创建excel一行一行的回调监听器，参照{@link ExcelAnalysisListener}
     * <p>3. 直接读即可
     */
    @Test
    public void simpleRead() {
        // 有个很重要的点 DemoDataListener 不能被spring管理，要每次读取excel都要new,然后里面用到spring可以构造方法传进去
        // 写法1：
        String fileName = "C:\\Users\\VENKY\\Desktop\\安装知识库.xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭


        List<Article> articles = new ArrayList<>();

        ArticleExcelProcessorService processor = new ArticleExcelProcessorService();
        processor.init(articles);
        EasyExcel.read(fileName, Article.class, new ExcelAnalysisListener<Article>(processor)).sheet(0).doRead();


        List<SimilarQuestion> similars = new ArrayList<>();
        SimilarQuestionExcelService questionExcelService = new SimilarQuestionExcelService();
        questionExcelService.init(similars);
        EasyExcel.read(fileName, SimilarQuestion.class, new ExcelAnalysisListener<SimilarQuestion>(questionExcelService)).sheet(1).doRead();

        for (Article article : articles) {

            StringBuilder sb = new StringBuilder();
            for (SimilarQuestion question : similars) {


                // 判断正文标题和相似问题标题是否相同，如果相同，进行相似问题合并
                if (article.getTitle().equals(question.getTitle())) {
                    if (question.getSimilar() != null) {
                        sb.append(question.getSimilar()).append(";");
                    }

                }
            }
            if (sb.length() >= 1) {
                sb.deleteCharAt(sb.length()-1);
                article.setSimilars(sb.toString());
            }

        }


        System.out.println(articles.size());

        String path = "C:\\Users\\VENKY\\Desktop\\安装问答库-V1.0" + ".xlsx";

        EasyExcel.write(path, Article.class).sheet("知识问答库").doWrite(articles);









        // 写法2：
        /*ExcelReader excelReader = EasyExcel.read(fileName, Article.class, new ArticleListener()).build();
        ReadSheet readSheet = EasyExcel.readSheet(0).build();
        excelReader.read(readSheet);
        // 这里千万别忘记关闭，读的时候会创建临时文件，到时磁盘会崩的
        excelReader.finish();*/
    }

}
