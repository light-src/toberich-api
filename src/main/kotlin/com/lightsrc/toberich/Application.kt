package com.lightsrc.toberich

import org.springframework.boot.runApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.lightsrc.toberich", "com.lightsrc.toberich.apis", "com.lightsrc.toberich.models"])
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
