package ru.netology.stats;

public class StatsService {
    public long SalesSum(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total += sale;
        }
        return total;
    }

    public long MediumSales(long[] sales) {
        long total = 0;                                 //long total = sum(sales);
        for (long sale : sales) {
            total += sale;
        }
        long medium = total / 12;
        return medium;
    }

    public int MonthMaxSale(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;
            }

        }
        return month + 1;
    }

    public int MonthMinSale(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[month]) {
                month = i;
            }

        }
        return month + 1;
    }

    public int MonthsBelowMiddle(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < MediumSales(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int MonthsHigherMiddle(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > MediumSales(sales)) {
                counter++;
            }
        }
        return counter;
    }
}
