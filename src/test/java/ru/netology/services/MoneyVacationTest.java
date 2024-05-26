package ru.netology.services;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyVacationTest {
    @org.junit.jupiter.api.Test
    void shouldCalculateForVacationYesAndNo1() {
        MoneyVacation service = new MoneyVacation();

        long income = 10000;
        long expense = 3000;
        long threshold = 20000;

        int expected = 3;

        long actual = service.calculate(income, expense, threshold);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForVacationYesAndNo2() {
        MoneyVacation service = new MoneyVacation();

        long income = 100000;
        long expense = 60000;
        long threshold = 150000;

        int expected = 2;

        long actual = service.calculate(income, expense, threshold);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForVacationOnlyNo() {
        MoneyVacation service = new MoneyVacation();

        long income = 10000;
        long expense = 3000;
        long threshold = 200000;

        int expected = 0;

        long actual = service.calculate(income, expense, threshold);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForVacationOnlyYes() {
        MoneyVacation service = new MoneyVacation();

        long income = 9000000;
        long expense = 10;
        long threshold = 10;

        int expected = 11;

        long actual = service.calculate(income, expense, threshold);

        assertEquals(expected, actual);
    }
    
}
