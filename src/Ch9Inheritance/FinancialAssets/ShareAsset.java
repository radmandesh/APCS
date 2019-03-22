package Ch9Inheritance.FinancialAssets;

public abstract class ShareAsset implements Asset {
    private String symbol;
    private double totalCost, currentPrice;

    public ShareAsset(String symbol, double currentPrice){
        this.symbol = symbol;
        this.currentPrice = currentPrice;
        totalCost = 0.0;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getProfit(){
        return this.getMarketValue()-this.totalCost;
    }

    public void setTotalCost(double totalCost){
        this.totalCost = totalCost;
    }
    public void addCost(double cost){
        this.totalCost += cost;
    }

    public abstract double getMarketValue();
}
