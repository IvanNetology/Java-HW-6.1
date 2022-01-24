package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceTest {

    @Test
    void findMaxFirst() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 10};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxLast() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 18};
        long expected = 18;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxEqual() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
        long expected = 7;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxMinus() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-77, -34, -18, -30, -97, -10, -3, -64, -4, -25, -7};
        long expected = -3;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxZero() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-77, -34, -18, 0, -97, -10, -3, -64, -4, -25, -7};
        long expected = 0;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxDifferent() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-77, 34, -18, 0, -97, -10, -3, 64, -4, 25, -7};
        long expected = 64;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}