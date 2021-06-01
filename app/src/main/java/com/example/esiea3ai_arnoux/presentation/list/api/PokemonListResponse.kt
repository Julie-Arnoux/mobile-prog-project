package com.example.esiea3ai_arnoux.presentation.list.api

import com.example.esiea3ai_arnoux.presentation.list.Pokemon

data class PokemonListResponse(
        val count: Int,
        val next: String,
        val results: List<Pokemon>
 )