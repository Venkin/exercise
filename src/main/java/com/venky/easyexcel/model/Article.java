package com.venky.easyexcel.model;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * 文章实体
 *
 * @author huwk
 * @date 2019/11/2
 **/
@Data
@ToString
public class Article {

    private String title;

    private String similars;

    private String content;

    private Date validDateFrom;

    private Date validDateTo;

}
