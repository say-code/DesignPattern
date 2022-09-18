package main.principle.interfaceSegregation;

import org.junit.Test;

/**
 * @author sayCode
 * @date 2022/9/18 15:03
 * project: DesignPattern
 * Title: Clint
 * description: 客户端
 */
public class Client {

    private ConcreteClass concreteClass = new ConcreteClass();

    @Test
    public void startTest(){
        concreteClass.dataRead();
        concreteClass.createChart();
        concreteClass.displayChart();
    }
}
