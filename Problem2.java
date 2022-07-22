/*
9.2: (The Stock class) Following the example of the Circle class in Section 9.2,
design a class named Stock that contains:
 ■ A string data field named symbol for the stock’s symbol.
 ■ A string data field named name for the stock’s name.
 ■ A double data field named previousClosingPrice that stores the stock
price for the previous day.
 ■ A double data field named currentPrice that stores the stock price for the
current time.
 ■ A constructor that creates a stock with the specified symbol and name.
 ■ A method named getChangePercent() that returns the percentage changed
from previousClosingPrice to currentPrice.
Draw the UML diagram for the class and then implement the class. Write a test
program that creates a Stock object with the stock symbol ORCL, the name
Oracle Corporation, and the previous closing price of 34.5. Set a new current
price to 34.35 and display the price-change percentage
*/


public class Problem2 {
    public static void main(String[] args){
        Stock stock1 = new Stock("ORCL" , "Oracle Corporation");
        stock1.previousClosingPrice = 34.5;
        stock1.currentPrice = 34.35;
        if (stock1.getChangePercent() < 0)
            System.out.printf("The change percent for the (%s) %s stock\nis decreased by %2.2f "
                , stock1.symbol , stock1.name , stock1.getChangePercent() * -1);
        else
            System.out.printf("The change percent for the (%s) %s stock\nis increased by %2.2f "
                    , stock1.symbol , stock1.name , stock1.getChangePercent());
    }
}
class Stock{
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;
    public Stock(String newSymbol , String newName){
        symbol = newSymbol;
        name = newName;
    }
    public double getChangePercent(){
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
    }
}
