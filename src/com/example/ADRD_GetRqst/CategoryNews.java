package com.example.ADRD_GetRqst;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jmexe
 * Date: 2/10/14
 * Time: 12:06 AM
 * To change this template use File | Settings | File Templates.
 */

/***
 * 新闻数据类
 */
public class CategoryNews {
    //新闻类型名称
    public String category;
    //新闻类型ID
    public int categoryId;
    //新闻条目
    public List<NewsEntity> items;

    //单条新闻类
    public static class NewsEntity {
        //新闻标题
        public String title;
        //新闻ID
        public String id;
        //原文链接
        public String url;
        //数据来源
        public String source;
        //新闻原文
        public String content;
        //没用数据
        public String contentHTML;
        //摘要
        public String abs;
        //没用数据
        public String absHTML;
        //新闻点击次数
        public int clickCount;

    }

}
