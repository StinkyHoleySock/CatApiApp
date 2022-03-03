package com.example.trytoparse_2.data.repository

import com.example.trytoparse_2.data.api.RetrofitInstance
import com.example.trytoparse_2.model.Kitty
import retrofit2.Response

class Repository {

    suspend fun getCat(): Response<List<Kitty>> {
        return RetrofitInstance.api.getKitty()
    }
}