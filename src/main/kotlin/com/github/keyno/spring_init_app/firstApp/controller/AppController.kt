package com.github.keyno.spring_init_app.firstApp.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Controller
class AppController {

    @RequestMapping("/")
    fun show(): String{
        return "test"
    }
}