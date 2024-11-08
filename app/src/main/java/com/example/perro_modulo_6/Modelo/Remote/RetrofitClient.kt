package com.example.perro_modulo_6.Modelo.Remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {


    companion object {
        // SI QUIERE TRABAJAR CON COROUTINES ESTA CLASE QUEDA IGUAL

        private const val BASE_URL ="https://dog.ceo/"

        fun getRetrofit() : BreedApi {

            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return  retrofit.create(BreedApi::class.java)

        }

    }


}