package com.tazkiyatech.quran.sdk.model

import org.hamcrest.core.IsEqual.equalTo
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class JuzUnitTests {

    @Test
    fun parse_forJuz1() {
        // When.
        val juz = Juz.parse(1)

        // Then.
        assertEquals(Juz.Juz_01, juz)
    }

    @Test
    fun parse_forJuz30() {
        // When.
        val juz = Juz.parse(30)

        // Then.
        assertEquals(Juz.Juz_30, juz)
    }

    @Test
    fun getJuzNumber_forAllJuzs() {
        // Given.
        val juzs = Juz.values()

        // When. / Then.
        var expectedJuzNumber = 1

        for (juz in juzs) {
            assertEquals(expectedJuzNumber, juz.juzNumber)
            expectedJuzNumber++
        }
    }

    @Test
    fun getNumVerses_forJuz1() {
        // When.
        val numVerses = Juz.Juz_01.numVerses

        // Then.
        assertThat(numVerses, equalTo(148))
    }

    @Test
    fun getNumVerses_forJuz27() {
        // When.
        val numVerses = Juz.Juz_27.numVerses

        // Then.
        assertThat(numVerses, equalTo(399))
    }

    @Test
    fun getNumVerses_forJuz30() {
        // When.
        val numVerses = Juz.Juz_30.numVerses

        // Then.
        assertThat(numVerses, equalTo(564))
    }

    @Test
    fun getNumVerses_forAllJuzs() {
        // Given.
        val juzs = Juz.values()

        // When.
        var verseCount = 0

        for (juz in juzs) {
            val numVerses = juz.numVerses
            verseCount += numVerses
        }

        // Then.
        assertThat(verseCount, equalTo(6236))
    }
}
