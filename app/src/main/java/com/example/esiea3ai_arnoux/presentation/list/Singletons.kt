package com.example.esiea3ai_arnoux.presentation.list

import com.example.esiea3ai_arnoux.presentation.list.api.PokeApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Singletons {
    companion object{
        val pokeApi : PokeApi = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://pokeapi.co/api/v2/")
                .build()
                .create(PokeApi::class.java)
    }

}