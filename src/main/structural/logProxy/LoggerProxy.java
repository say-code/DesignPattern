package main.structural.logProxy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/10/11 13:31
 * @project DesignPattern
 * @Title LoggerProxy
 * @description 日志记录器代理
 */
public class LoggerProxy implements ILog{

    private Business business;

    Logger logger = Logger.getLogger("LoggerProxy");
    public LoggerProxy() {
        business = new Business();
    }

    @Override
    public void method() {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowTime = simpleDateFormat.format(date);
        try {
            business.method();
            logger.info("method()方法在"+nowTime+"被成功调用");
        }catch (Exception e){
            logger.info("method方法在"+nowTime+"创建失败"+",原因是"+e);
        }
    }
}
