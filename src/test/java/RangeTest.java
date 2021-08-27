import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RangeTest {

    @Test
    public void isStartWithInclusiveWithKampooShouldBeTrue () {
        Range range = new Range("[1,5]");

        boolean actualResult = range.isStartWithInclusive();

        assertTrue(actualResult);
    }

    @Test
    public void isStartWithInclusiveWithBraketShouldBeFalse () {
        Range range = new Range("(1,5]");

        boolean actualResult = range.isStartWithInclusive();

        assertFalse(actualResult);
    }

    @Test
    public void getStartInputShouldbe1 () {
        Range range = new Range("(1,5]");

        int actualResult = range.getStartInput();

        assertEquals(1, actualResult);
    }
}
