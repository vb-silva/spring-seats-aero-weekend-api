package vbas.seats_aero.service

import org.springframework.stereotype.Service

@Service
class GreetingsService {
    fun countGreetings(name: String) {
        println("Counting greetings from $name")
    }
}