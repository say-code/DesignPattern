package main.behavior.observe;

import java.util.ArrayList;

/**
 * @author 汪亦涵
 * @date 2022/11/6 12:41
 * @project DesignPattern
 * @Title Stock
 * @description 股票 被观察者
 */
public class Stock {

    private ArrayList<IInvestor> investors = new ArrayList<>();

    private String stockName;

    private double price;

    public Stock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
    }

    public void attach(IInvestor investor){
        this.investors.add(investor);
    }

    public void detach(IInvestor investor){
        this.investors.remove(investors.indexOf(investor));
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void notifyInvestor(){
        investors.forEach(investor -> {
            investor.response(this);
        });
    }
}
