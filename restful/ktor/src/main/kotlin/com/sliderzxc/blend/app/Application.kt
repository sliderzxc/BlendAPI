package com.sliderzxc.blend.app

import com.sliderzxc.blend.services.configureRouting
import io.ktor.server.application.Application
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun Application.startApplication() {
    configureRouting()
}

fun main() {
    embeddedServer(Netty, 7177) {
        startApplication()
    }
}