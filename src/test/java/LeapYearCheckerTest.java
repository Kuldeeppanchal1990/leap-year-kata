import org.incubyte.LeapYearChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearCheckerTest {

    @Test
    public void notALeapYear_WhenYearNotDivisibleBy4() {
        LeapYearChecker leapYearChecker = new LeapYearChecker();
        Assertions.assertFalse(leapYearChecker.check(1997));
    }

}
