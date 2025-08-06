package dev.ggorantala.ds.arrays.theory.threedimensional.usecases;

public class PortfolioAnalyzer {
    private static final int PRICE = 0;
    private static final int VOLUME = 1;
    private static final int VOLATILITY = 2;
    // Structure: [asset][day][metric]
    private double[][][] portfolioData;

    public double calculatePortfolioValue(int day) {
        double totalValue = 0;

        for (int asset = 0; asset < portfolioData.length; asset++) {
            double price = portfolioData[asset][day][PRICE];
            double volume = portfolioData[asset][day][VOLUME];
            totalValue += price * volume;
        }

        return totalValue;
    }

    public void identifyTradingOpportunities() {
        for (int asset = 0; asset < portfolioData.length; asset++) {
            for (int day = 20; day < portfolioData[asset].length; day++) {
                double currentPrice = portfolioData[asset][day][PRICE];
                double movingAverage = calculateMovingAverage(asset, day, 20);

                if (currentPrice < movingAverage * 0.95) {
                    System.out.printf("Buy signal for asset %d on day %d\n",
                        asset, day);
                }
            }
        }
    }

    private double calculateMovingAverage(int asset, int endDay, int period) {
        double sum = 0;
        for (int day = endDay - period + 1; day <= endDay; day++) {
            sum += portfolioData[asset][day][PRICE];
        }
        return sum / period;
    }
}