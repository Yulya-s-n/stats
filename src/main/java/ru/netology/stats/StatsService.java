package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result = result + sale;
        }
        return result;
    }


    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }


    public int max(long[] sales) {
        int maxMontch = 0;
        long maxSale = sales[maxMontch];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxMontch = i;
                maxSale = sales[i];
            }
        }
        return maxMontch + 1;
    }

    public int min(long[] sales) {
        int minMontch = 0;
        long minSale = sales[minMontch];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minMontch = i;
                minSale = sales[i];
            }
        }
        return minMontch + 1;
    }

    public int bellowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int aboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = average (sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}
