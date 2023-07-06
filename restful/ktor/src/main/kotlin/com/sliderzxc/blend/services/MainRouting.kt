package com.sliderzxc.blend.services

import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        addNoteRouting()
    }
}