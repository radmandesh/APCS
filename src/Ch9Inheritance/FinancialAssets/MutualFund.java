package Ch9Inheritance.FinancialAssets;

public class MutualFund extends ShareAsset {
    private double totalShares;
    public MutualFund(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        totalShares = 0.0;
    }

    @Override
    public double getMarketValue() {
        return this.totalShares * this.getCurrentPrice();
    }
    public double getTotalShares(){
        return totalShares;
    }
    public void purchase(int amtShares, double pricePer){
        totalShares += amtShares;
        addCost(amtShares * pricePer);
    }
}
