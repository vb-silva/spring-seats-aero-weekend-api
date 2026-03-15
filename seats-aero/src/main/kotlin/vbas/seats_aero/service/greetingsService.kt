package vbas.seats_aero.service

import org.springframework.stereotype.Service
import vbas.seats_aero.repository.GreetingsRepository
import vbas.seats_aero.entity.GreetingsEntity

@Service
class GreetingsService(private val greetingsRepository: GreetingsRepository) {

    fun countGreetings(name: String): GreetingsEntity {
        println("Counting greetings from $name")
        val greetings = greetingsRepository.findByName(name)
        if (greetings.isEmpty()) {
            return greetingsRepository.save(GreetingsEntity(name = name, count = 1L))
        } else {
            val greeting = greetings.first()
            greeting.count++
            return greetingsRepository.save(greeting)
        }
    }
}