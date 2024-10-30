package com.example.dogapi_039.Modelo.Remote

import com.example.dogapi_039.Modelo.Remote.Response.BreedImageResponse
import com.example.dogapi_039.Modelo.Remote.Response.BreedResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface BreedApi {

// todas las razas

    @GET("breeds/list/all")
    suspend fun getAllBreeds(): BreedResponse


    @GET("breed/{breed}/images")
    suspend fun  getBreedImages(@Path("breed") breed: String): BreedImageResponse

}