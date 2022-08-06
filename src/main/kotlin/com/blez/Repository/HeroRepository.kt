package com.blez.Repository

import com.blez.models.ApiResponse
import com.blez.models.Hero

interface HeroRepository {

    val heroes : Map<Int,List<Hero>>//Used to map server response

    val page1 : List<Hero>
    val page2 : List<Hero>
    val page3 : List<Hero>
    val page4 : List<Hero>
    val page5 : List<Hero>
    suspend fun getAllHeroes(page : Int = 1) : ApiResponse
    suspend fun searchHeroes(name : String?) : ApiResponse
}