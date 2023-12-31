package ru.netology.stats;

public class StatsService {
    public long salesSum(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total += sale;
        }
        return total;
    }

    public long mediumSales(long[] sales) {
        long total = 0;                                 //long total = sum(sales);
        for (long sale : sales) {
            total += sale;
        }
        long medium = total / 12;
        return medium;
    }

    public int monthMaxSale(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;
            }

        }
        return month + 1;
    }

    public int monthMinSale(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[month]) {
                month = i;
            }

        }
        return month + 1;
    }

    public int monthsBelowMiddle(long[] sales) {
        int counter = 0;
        long mediana = mediumSales(sales);
        for (long sale : sales) {
            if (sale < mediana) {
                counter++;
            }
        }
        return counter;
    }

    public int monthsHigherMiddle(long[] sales) {
        int counter = 0;
        long mediana = mediumSales(sales);
        for (long sale : sales) {
            if (sale > mediana) {
                counter++;
            }
        }
        return counter;
    }
}
