package com.example.wallpaper;
import com.example.wallpaper.pojo.com.example.Example;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    @GET("api/?key=put_your_api_key_here")
    Call<Example> getWallpaper(@Query("q") String value);
}
