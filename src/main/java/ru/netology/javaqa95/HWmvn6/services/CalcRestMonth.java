package ru.netology.javaqa95.HWmvn6.services;

public class CalcRestMonth {
    public int calcMonth(int money, int income, int expense, int threshold, int count) {

        for (int month = 1; month <= 12; month++) {
            if (money < threshold) {
                System.out.println("Месяц " + month + ". Денег " + money + ". Придется работать. Заработал +" + income + ", потратил " + -expense);
                money = money + income - expense;
            } else {
                System.out.println("Месяц " + month + ". Денег " + money + ". Буду отдыхать. Потратил " + -expense + ", затем ещё " + -((money - expense) * 2 / 3));
                money = (money - expense) * 1 / 3;
                count++;
            }

        }
        return count;
    }
}
