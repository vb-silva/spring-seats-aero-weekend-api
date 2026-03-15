package vbas.seats_aero.repository

import org.springframework.data.jpa.repository.JpaRepository
import vbas.seats_aero.entity.GreetingsEntity
import java.util.UUID

interface GreetingsRepository : JpaRepository<GreetingsEntity, UUID> {
    fun findByName(name: String): List<GreetingsEntity>
}