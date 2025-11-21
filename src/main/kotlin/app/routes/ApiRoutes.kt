package app.routes

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.apiRoutes() {
    routing {
        get("/") {
            call.respondText("Kotlin Universal REST API Template работает!")
        }
    }
}
