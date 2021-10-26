package com.example.wallpaper;
import com.example.wallpaper.pojo.com.example.Example;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    @GET("api/?key=17422110-69d2fba5e758126d04252703f")
    Call<Example> getWallpaper(@Query("q") String value);
}
