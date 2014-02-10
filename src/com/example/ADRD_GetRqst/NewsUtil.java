package com.example.ADRD_GetRqst;

import android.os.AsyncTask;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Jmexe
 * Date: 2/9/14
 * Time: 11:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class NewsUtil extends AsyncTask<Integer, Void, CategoryNews>{
    public static CategoryNews GetNewsByCategory(int categoryID) {
        CategoryNews newsList = new CategoryNews();
        String raw = null;
        try {
            raw = WebUtil.HttpGet("http://www.wssummary.net/mobile.php?postType=3&categoryId="+categoryID);
        } catch (IOException e) {}

        if(raw != null) {
            Gson gson = new Gson();
            Type type = new TypeToken<CategoryNews>(){}.getType();
            newsList = gson.fromJson(raw, type);
        }

        return newsList;
    }

    @Override
    protected CategoryNews doInBackground(Integer... integers) {
        return GetNewsByCategory(integers[0]);
    }
}
