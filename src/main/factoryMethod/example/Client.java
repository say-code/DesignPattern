package main.factoryMethod.example;

import org.junit.Test;

/**
 * @author sayCode
 * @date 2022/9/28 14:31
 * project: DesignPattern
 * Title: LogTest
 * description: Log测试类
 */
public class Client {

    LogFactory factory;
    Log log;

    @Test
    public void fileLogTest(){
        factory = new FileLogFactory();
        log = factory.createLog();
        log.writeLog();
    }

    @Test
    public void databaseTest(){
        factory = new DatabaseLogFactory();
        log = factory.createLog();
        log.writeLog();
    }
}
