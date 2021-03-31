package com.example.esiea3ai_arnoux.presentation.list.API

import com.example.esiea3ai_arnoux.presentation.list.SNCF

data class StationsResponse(
         val nhits: Int,
         val records: List<SNCF>
 )