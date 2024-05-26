package ru.netology.services;

public class MoneyVacation {
    public int calculate(long income, long expense, long threshold) {
        int countMonth = 0;
        long money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                countMonth++;
                money -= expense;
                money = money / 3;
            } else {
                money += income;
                money -= expense;
            }
        }
        return countMonth;
    }
}
