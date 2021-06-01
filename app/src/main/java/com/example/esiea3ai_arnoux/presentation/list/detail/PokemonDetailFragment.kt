package com.example.esiea3ai_arnoux.presentation.list.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.esiea3ai_arnoux.R
import com.example.esiea3ai_arnoux.presentation.list.Singletons
import com.example.esiea3ai_arnoux.presentation.list.api.PokemonDetailResponse
import com.example.esiea3ai_arnoux.presentation.list.api.PokemonListResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.squareup.picasso.Picasso

class PokemonDetailFragment : Fragment() {

    private lateinit var name : TextView
    private lateinit var imageView : ImageView

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pokemon_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        name = view.findViewById(R.id.pokemon_detail_name)
        imageView = view.findViewById(R.id.imageView)
        callApi()
    }

    private fun callApi() {
        val pokemonId : Int = arguments?.getInt("pokemonId") ?: -1
        Singletons.pokeApi.getPokemonDetail((pokemonId+1).toString()).enqueue(object : Callback<PokemonDetailResponse>{
            override fun onFailure(call: Call<PokemonDetailResponse>, t: Throwable) {
                TODO("Not yet implemented")
            }

            override fun onResponse(call: Call<PokemonDetailResponse>, response: Response<PokemonDetailResponse>) {
                if(response.isSuccessful && response.body() != null){
                    name.text = response.body()!!.name
                    Picasso.get().load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${pokemonId+1}.png").into(imageView)
                }
            }

        })
    }
}