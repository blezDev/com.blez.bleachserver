package com.blez.routes

import com.blez.Repository.HeroRepository
import com.blez.models.ApiResponse
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllHeroes() {
    val heroRepository : HeroRepository by inject()
    get("/bleach/heroes")
    {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            require(page in 1..5)

            val apiResponse = heroRepository.getAllHeroes(page)
            call.respond(message = apiResponse)
        }catch (e : java.lang.NumberFormatException)
        {
            call.respond(message = ApiResponse(success = false, message = "Only numbers re allowed. "), status = HttpStatusCode.BadRequest)

        }catch (e : java.lang.IllegalArgumentException)
        {
            call.respond(message = ApiResponse(success = false, message = "Heroes not found. "), status = HttpStatusCode.NotFound)



        }


    }
}