package Ch9Inheritance.FinancialAssets;

public class DividendStock extends Stock {
    public double dividends;
    public DividendStock(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        this.dividends = 0.0;
    }

    @Override
    public double getMarketValue() {
        return super.getMarketValue() + dividends;
    }


    public double getDividends() {
        return dividends;
    }


    public void payDividends(double amtPerShare) {
        this.dividends += amtPerShare * getTotalShares();
    }
}