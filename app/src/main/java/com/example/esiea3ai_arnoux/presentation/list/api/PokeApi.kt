package com.example.esiea3ai_arnoux.presentation.list.api

import retrofit2.Call
import retrofit2.http.GET

interface PokeApi {
    @GET("pokemon")
    fun getPokemonList(): Call<PokemonResponse>
}

