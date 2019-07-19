package com.example.youtubeapiwithpagination.api;

import com.example.youtubeapiwithpagination.models.YoutubeResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YoutubeApi {
    @GET("search")
    Call<YoutubeResponse> searchVideo(@Query("q") String query,
                                      @Query("type") String type,
                                      @Query("key") String key,
                                      @Query("part") String part,
                                      @Query("maxResults") String maxResults,
                                      @Query("pageToken") String pageToken);
}
