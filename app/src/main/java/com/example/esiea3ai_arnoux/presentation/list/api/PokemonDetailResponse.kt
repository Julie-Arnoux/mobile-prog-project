package com.example.esiea3ai_arnoux.presentation.list.api

data class PokemonDetailResponse(
        val name : String,
        val type: List<PokemonSlot>
)

class PokemonSlot (
    val slot: Int,
    val type: PokemonType
)

class PokemonType (
    val name: String,
    val url: String
)
