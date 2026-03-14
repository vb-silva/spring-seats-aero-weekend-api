package vbas.seats_aero.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {
    @GetMapping("/")
    fun hello(): String {
        return "Hello, World!"
    }

}