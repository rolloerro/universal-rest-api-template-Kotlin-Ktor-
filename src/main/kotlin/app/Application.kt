package app

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.serialization.gson.*
import app.routes.apiRoutes

fun main() {
    embeddedServer(Netty, port = 8080) {
        install(ContentNegotiation) {
            gson()
        }
        apiRoutes()
    }.start(wait = true)
}
