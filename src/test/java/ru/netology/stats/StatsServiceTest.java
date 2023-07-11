package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    public void testSalesSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.SalesSum(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMediumSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.MediumSales(sales);
        long expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMaxSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.MonthMaxSale(sales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMinSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.MonthMinSale(sales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthsBelowMiddle() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.MonthsBelowMiddle(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthsHigherMiddle() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.MonthsHigherMiddle(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}