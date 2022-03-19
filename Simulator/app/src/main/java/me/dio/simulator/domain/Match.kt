package me.dio.simulator.domain

import com.google.gson.annotations.SerializedName

data class Match(

    @SerializedName("descricao")
    val description: String,
    @SerializedName("local")
    val place: Place,
    @SerializedName("mandante")
    val home: Team,
    @SerializedName("visitante")
    val visitor: Team

)