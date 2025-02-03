package org.incubyte;

public class LeapYearChecker {
    public boolean check(int year) {
        return (year % 4 == 0) && !(year % 100 == 0 && year % 400 != 0);
    }
}
