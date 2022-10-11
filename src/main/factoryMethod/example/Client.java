package main.factoryMethod.example;

import main.utils.XmlRead;
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
    public void start(){
        XmlRead xmlRead = new XmlRead("factoryConfig.xml",this);
        this.factory = (LogFactory)xmlRead.newInstance();
        log = factory.createLog();
        log.writeLog();
    }
}



