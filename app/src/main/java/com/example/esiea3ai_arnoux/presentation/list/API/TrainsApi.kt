package com.example.esiea3ai_arnoux.presentation.list.API

import android.telecom.Call
import jdk.nashorn.internal.runtime.PropertyDescriptor.GET


interface TrainsApi{
    @GET("liste-des-gares")
    fun getStationsList: Call<StationsResponse>

    //site de retrofit non reconnu dans les import (donc évidemment ça va pas marcher)
}