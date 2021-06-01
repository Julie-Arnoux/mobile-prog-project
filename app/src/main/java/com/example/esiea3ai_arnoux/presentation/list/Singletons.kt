package com.example.esiea3ai_arnoux.presentation.list

import com.example.esiea3ai_arnoux.PokeApplication.Companion.context
import com.example.esiea3ai_arnoux.presentation.list.api.PokeApi
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File

class Singletons {
    companion object{
        var cache : Cache = Cache(File(context?.cacheDir, "response"), 10*1024*1024)
        val okhttpClient : OkHttpClient = OkHttpClient().newBuilder()
                .cache(cache)
                .build()


        val pokeApi : PokeApi = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://pokeapi.co/api/v2/")
                .client(okhttpClient)
                .build()
                .create(PokeApi::class.java)
    }

}