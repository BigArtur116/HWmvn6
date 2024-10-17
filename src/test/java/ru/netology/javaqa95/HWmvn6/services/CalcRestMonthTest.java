package ru.netology.javaqa95.HWmvn6.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcRestMonthTest {

    @ParameterizedTest
//    @CsvSource({
//            "3,0,10000,3000,20000,0",
//            "2,0,100000,60000,150000,0"
//    })
    @CsvFileSource(files = "src/test/resources/incomeExpenseTest.csv")
    public void testCalcRestMonth(int expected, int money, int income, int expense, int threshold, int count) {

        CalcRestMonth service = new CalcRestMonth();
//        int expected = 3;
        int actual = service.calcMonth(money, income, expense, threshold, count);
//        System.out.println("Количество отдыха " + count + " мес.");

        Assertions.assertEquals(expected, actual);

    }
}
