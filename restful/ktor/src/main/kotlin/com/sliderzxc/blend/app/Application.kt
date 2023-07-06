package com.sliderzxc.blend.app

import com.sliderzxc.blend.services.monitoring.configureMonitoring
import com.sliderzxc.blend.services.routing.configureRouting
import io.ktor.server.application.Application
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun Application.startApplication() {
    configureMonitoring()
    configureRouting()
}

fun main() {
    embeddedServer(Netty, 7177) {
        startApplication()
    }.start(true)
}