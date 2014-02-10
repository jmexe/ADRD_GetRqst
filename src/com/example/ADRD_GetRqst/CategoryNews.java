package com.example.ADRD_GetRqst;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jmexe
 * Date: 2/10/14
 * Time: 12:06 AM
 * To change this template use File | Settings | File Templates.
 */
public class CategoryNews {
    public String category;
    public int categoryId;
    public List<NewsEntity> items;

    public static class NewsEntity {
        public String title;
        public String id;
        public String url;
        public String source;
        public String content;
        public String contentHTML;
        public String abs;
        public String absHTML;
        public int clickCount;

    }

}
