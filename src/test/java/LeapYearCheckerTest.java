import org.incubyte.LeapYearChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearCheckerTest {

    private LeapYearChecker leapYearChecker;

    @BeforeEach
    public void beforeEach() {
        leapYearChecker = new LeapYearChecker();
    }

    @Test
    public void notALeapYear_WhenYearNotDivisibleBy4() {
        assertFalse(leapYearChecker.check(1997));
    }

    @Test
    public void isALeapYear_WhenDivisibleBy4() {
        assertTrue(leapYearChecker.check(1996));
    }
}
