package com.blez

import com.blez.Repository.HeroRepository
import com.blez.Repository.HeroRepositoryImplementation
import com.blez.models.ApiResponse

import io.ktor.http.*

import io.ktor.server.application.*

import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.ContentType.Application.Json
import kotlin.test.*
import io.ktor.server.testing.*
import io.ktor.util.Identity.decode
import kotlinx.serialization.decodeFromString

import org.koin.java.KoinJavaComponent.inject

class ApplicationTest {
    private val heroRespository : HeroRepository by inject(HeroRepository::class.java)
    @Test
    fun testRoot() = testApplication {//access root endpoint,assert correct information
        application {
           val moduleFunction = Application::module
            moduleFunction
        }
        client.get("/").apply {
            assertEquals(expected = HttpStatusCode.OK, status)
            assertEquals("\"This is Bleach Server\"", bodyAsText())
        }
    }
    fun `access all heroes endpoint, assert correct information`() = testApplication {//access root endpoint,assert correct information
        application {
            val moduleFunction = Application::module
            moduleFunction
        }
        client.get("/bleach/heroes?page=2").apply {
            assertEquals(expected = HttpStatusCode.OK, status)
            val expected = ApiResponse(
                success = true,
                message = "ok",
                prevPage = null,
                nextPage = 3,
                heroes = heroRespository.page1
            )
            val actual = kotlinx.serialization.json.Json.decodeFromString<ApiResponse>(heroRespository.getAllHeroes().toString())
            assertEquals(expected = expected, actual = actual)
        }
    }
}