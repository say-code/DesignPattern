package main.behavior.observe;

import java.util.logging.Logger;

/**
 * @author 汪亦涵
 * @date 2022/11/6 12:47
 * @project DesignPattern
 * @Title ConcreteInvestor
 * @description 具体订阅者
 */
public class ConcreteInvestor implements IInvestor{

    private final String name;

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    public ConcreteInvestor(String name) {
        this.name = name;
    }

    @Override
    public void response(Stock stock) {
        logger.info("2020144131汪亦涵："+this.name+"您好，您订阅的"+stock.getStockName()+"价格变化幅度已超过%5，目前的价格为："+stock.getPrice()+"，请注意！");
    }


}
