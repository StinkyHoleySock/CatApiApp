package com.example.trytoparse_2.data.api

import com.example.trytoparse_2.model.Kitty
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("v1/images/search")
    suspend fun getKitty(): Response<List<Kitty>>
}