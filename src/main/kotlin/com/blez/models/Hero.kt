package com.blez.models
@kotlinx.serialization.Serializable
data class Hero(
    val id: Int,
    val name : String,
    val image : String,
    val about : String,
    val rating : Double,
    val power : Int,
    val month : String,
    val day : String,
    val family : List<String>,
    val ablitites : List<String>,
    val bankai : String
)
