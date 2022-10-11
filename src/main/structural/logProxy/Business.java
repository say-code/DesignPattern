package main.structural.logProxy;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/10/11 13:32
 * @project DesignPattern
 * @Title Business
 * @description 日志记录器公司具体实现类
 */
public class Business implements ILog{

    Logger businessLogger = Logger.getLogger("Business");

    @Override
    public void method() {
        businessLogger.info("2020144131汪亦涵：公司日志记录器输出！");
    }
}
