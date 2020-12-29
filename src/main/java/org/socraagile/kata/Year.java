package org.socraagile.kata;

public class Year {
    public Boolean isLeapYear(int year) {
        int number = 400;
        return isDividedBy(year, 4)
                && !(isDividedBy(year, 100) && isNotDividedBy(year, number));
    }

    private boolean isNotDividedBy(int year, int number) {
        return year % number != 0;
    }

    private boolean isDividedBy(int year, int number) {
        return year % number == 0;
    }
}
