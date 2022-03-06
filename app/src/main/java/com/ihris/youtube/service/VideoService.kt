package com.ihris.youtube.service

import com.ihris.youtube.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {

    @GET("/v3/9d0e5d99-a3bc-47e3-99f1-f103435a7784")
    fun listVideos(): Call<VideoDto>

}