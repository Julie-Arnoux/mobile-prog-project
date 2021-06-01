package com.example.esiea3ai_arnoux.presentation.list.api

import com.example.esiea3ai_arnoux.presentation.list.Pokemon

data class PokemonResponse(
        val count: Int,
        val next: String,
        val results: List<Pokemon>
 )