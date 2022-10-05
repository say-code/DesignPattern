package main.factoryMethod.example;

import main.principle.dependenceInversion.IDataConvertor;
import main.utils.XmlRead;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.io.UnsupportedEncodingException;

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
        XmlRead xmlRead = new XmlRead("factoryConfig.xml");
        this.factory = (LogFactory)xmlRead.newInstance();
        log = factory.createLog();
        log.writeLog();
    }
    }

