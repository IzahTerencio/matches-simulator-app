package me.dio.simulator.domain

data class Match(

    val description: String,
    val place: Place,
    val home: Team,
    val visitor: Team

)