package ExerCh4

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class TwelveDaysOfChristmasTest{
    private var twelveDaysOfChristmas = TwelveDaysOfChristmas()

    @Test
    internal fun test_twelveDaysOfChristmas_when_1_then_return_PARTRIDGE() {
        assertEquals("PARTRIDGE", twelveDaysOfChristmas.getItem(1))
    }

    @Test
    internal fun test_twelveDaysOfChristmas_when_8_then_return_MAIDS() {
        assertEquals("MAIDS", twelveDaysOfChristmas.getItem(8))
    }

    @Test
    internal fun test_twelveDaysOfChristmas_when_12_then_return_DRUMMERS() {
        assertEquals("DRUMMERS", twelveDaysOfChristmas.getItem(12))
    }
}