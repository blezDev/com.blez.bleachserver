package com.blez.plugins

import com.blez.routes.getAllHeroes
import com.blez.routes.root
import com.blez.routes.searchHeroes
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {

    routing {
        root()
        getAllHeroes()
        searchHeroes()


        static("/heroes") {
            resources("heroes")
        }
    }
}
