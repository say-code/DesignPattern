package main.structural.logProxy;

import org.junit.Test;

/**
 * @author sayCode
 * @date 2022/10/11 13:43
 * @project DesignPattern
 * @Title Client
 * @description 客户端
 */
public class Client {

    LoggerProxy loggerProxy = new LoggerProxy();

    @Test
    public void clientStart(){
        loggerProxy.method();
    }
}
