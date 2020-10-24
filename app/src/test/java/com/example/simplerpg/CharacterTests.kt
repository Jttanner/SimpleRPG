package com.example.simplerpg

import Character.CharacterModel.CharacterData
import Character.CharacterModel.CombatStats
import Character.ICharacter
import Character.PlayerCharacter
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CharacterTests {
    //examlpe
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    fun playerCharacter_isCreatedWithData() {
        var combatStats = CombatStats(19, 1, 1)
        assertNotNull(combatStats)
        assertEquals(10, combatStats.health)
        assertEquals(1, combatStats.attack)
        assertEquals(1, combatStats.defense)
        var characterData: CharacterData = CharacterData("Name", combatStats)
        assertNotNull(characterData)
        var character: ICharacter = PlayerCharacter(characterData)
        assertNotNull(character)
    }

    fun playerCharacter_isDamaged() {

    }

    fun nonPlayerCharacter_isCreatedWithData() {

    }

    fun nonPlayerCharacter_isDamaged() {

    }
}
