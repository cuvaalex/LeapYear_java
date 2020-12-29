package org.socraagile.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class YearShould {
    private Year year = new Year();

    @DisplayName("Return false if year is not divide by 4")
    @Test
    public void return_false_if_not_divide_by_4() {
        int number = 1997;

        boolean result = year.isLeapYear(number);

        assertThat(result).isFalse();
    }

    @DisplayName("Return true if year is divide by 4")
    @Test
    public void return_true_if_divide_by_4(){
        int number = 1996;

        boolean result = year.isLeapYear(number);

        assertThat(result).isTrue();
    }

    @DisplayName("A year is a leap year if divisible by 400")
    @Test
    public void return_true_if_divisible_by_400() {
        int number = 400;

        boolean result = year.isLeapYear(number);

        assertThat(result).isTrue();
    }

    @DisplayName("A year is not a leap year if divisible by 4, by 100 but not by 400")
    @Test
    public void return_false_if_divisible_by_4_by_100_but_not_by_400() {
        int number = 1800;

        boolean result = year.isLeapYear(number);

        assertThat(result).isFalse();
    }

}
