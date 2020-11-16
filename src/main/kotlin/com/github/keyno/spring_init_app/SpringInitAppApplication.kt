package com.github.keyno.spring_init_app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringInitAppApplication

fun main(args: Array<String>) {
    runApplication<SpringInitAppApplication>(*args)
}
