package com.venky;

import com.alibaba.excel.EasyExcel;
import com.venky.easyexcel.ArticleExcelProcessorService;
import com.venky.easyexcel.CustomExcelProcessor;
import com.venky.easyexcel.listener.ExcelAnalysisListener;
import com.venky.easyexcel.model.Article;
import org.junit.Test;

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
        String fileName = "C:\\Users\\VENKY\\Desktop\\问答库批量导入模板.xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭

        CustomExcelProcessor processor = new ArticleExcelProcessorService();

        EasyExcel.read(fileName, Article.class, new ExcelAnalysisListener<Article>(processor)).sheet().doRead();


        // 写法2：
        /*ExcelReader excelReader = EasyExcel.read(fileName, Article.class, new ArticleListener()).build();
        ReadSheet readSheet = EasyExcel.readSheet(0).build();
        excelReader.read(readSheet);
        // 这里千万别忘记关闭，读的时候会创建临时文件，到时磁盘会崩的
        excelReader.finish();*/
    }

}
