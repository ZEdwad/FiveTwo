package com.bwei.demo.utils.http;

import com.bwei.demo.bean.RecommendBean;

import io.reactivex.Flowable;
import retrofit2.http.GET;

/**
 * Created by ${李晨阳} on 2017/12/13.
 */

public interface VideoApi {

    /*
     * 首页
     * http://api.svipmovie.com/front/homePageApi/homePage.do
     */
    @GET("homePageApi/homePage.do")
    Flowable<RecommendBean> getRecommendData();

}
