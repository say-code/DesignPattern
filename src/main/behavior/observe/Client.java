package main.behavior.observe;

import org.junit.Test;

/**
 * @author 汪亦涵
 * @date 2022/11/6 12:53
 * @project DesignPattern
 * @Title Client
 * @description 客户端
 */
public class Client {


    @Test
    public void investorTest(){
        Stock stock = new Stock("兴汪股票",100.12);
        IInvestor investor1 = new ConcreteInvestor("汪亦涵");
        IInvestor investor2 = new ConcreteInvestor("张越");
        IInvestor investor3 = new ConcreteInvestor("谭宇");

        //模拟订阅
        stock.attach(investor1);
        stock.attach(investor2);
        stock.attach(investor3);
        //模拟取消订阅
        stock.detach(investor3);

        //模拟发布通知
        stock.notifyInvestor();
    }
}
