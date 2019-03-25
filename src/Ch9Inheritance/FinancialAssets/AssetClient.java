package Ch9Inheritance.FinancialAssets;

public class AssetClient {
    public static void main(String[] args){
        Asset[] myPortfolio = {
                new Stock("GOOG", 1192.53),
                new Stock("AAPL", 188.67),
                new Cash(15),
                new DividendStock("MSFT", 117.31)
        };

        ((Stock)myPortfolio[0]).purchase(3, 1200);
        ((Stock)myPortfolio[1]).purchase(3, 1200);
        ((DividendStock)myPortfolio[3]).purchase(3, 1200);
        ((DividendStock)myPortfolio[3]).payDividends(100);

        for(int i = 0; i < myPortfolio.length; i++){
            System.out.println(myPortfolio[i]);
            System.out.println("marketvalue " + myPortfolio[i].getMarketValue());
            System.out.println("profit " + myPortfolio[i].getProfit());
        }
    }
}
