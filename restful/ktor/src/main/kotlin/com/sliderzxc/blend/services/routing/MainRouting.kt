package com.sliderzxc.blend.services.routing

import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        addNoteRouting()
    }
}