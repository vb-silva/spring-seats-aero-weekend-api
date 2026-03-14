package vbas.seats_aero.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.http.ResponseEntity
import vbas.seats_aero.service.GreetingsService

@RestController
class GreetingsController(private val greetingsService: GreetingsService) {

    @GetMapping("/greetings")
    fun greetings(@RequestParam(required = false, defaultValue = "") name: String): ResponseEntity<String> {
        if (name.isEmpty()) {
            return ResponseEntity.badRequest().body("Name is required")
        }
        greetingsService.countGreetings(name)
        return ResponseEntity.ok("Hello, $name!")
    }
}