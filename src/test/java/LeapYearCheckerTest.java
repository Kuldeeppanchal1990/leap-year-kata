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

    @Test
    public void isLeapYear_WhenDivisbleBy400() {
        assertTrue(leapYearChecker.check(1600));
    }

    @Test
    public void isNotALeapYear_WhenDivisibleBy100ButNotBy400() {
        assertFalse(leapYearChecker.check(1800));
    }
}
