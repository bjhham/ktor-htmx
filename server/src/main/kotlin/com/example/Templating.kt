package com.example

import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlin.random.Random
import kotlinx.html.*

fun Application.configureTemplating() {
    routing {
        val random = Random(System.currentTimeMillis())
        
        get("/") {
            call.respondHtml {
                leaderboardPage(random)
            }
        }
        
        get("/more-rows") {
            call.respondHtml {
                body {
                    table {
                        tbody {
                            randomRows(random)
                        }
                    }
                }
            }
        }
    }
}
