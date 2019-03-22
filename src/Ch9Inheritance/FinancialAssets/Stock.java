package Ch9Inheritance.FinancialAssets;

public class Stock extends ShareAsset {
    private int totalShares;
    public Stock(String symbol, double currentPrice){
        super(symbol, currentPrice);
        totalShares = 0;
    }
    public double getMarketValue(){
        return this.totalShares * this.getCurrentPrice();
    }
    public int getTotalShares(){
        return totalShares;
    }
    public void purchase(int amtShares, double pricePer){
        totalShares += amtShares;
        addCost(amtShares * pricePer);
    }
}
