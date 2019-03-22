package Ch9Inheritance.FinancialAssets;

public class MutualFund extends ShareAsset {
    public MutualFund(String symbol, double currentPrice) {
        super(symbol, currentPrice);
    }

    @Override
    public double getMarketValue() {
        return 0;
    }
}
