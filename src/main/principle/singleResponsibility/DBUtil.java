package main.principle.singleResponsibility;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/9/17 11:05
 * project: SingleResponsibilityPrinciple
 * Title: CustomerDataChart
 * description: 数据库连接
 */
public class DBUtil {
    private Logger dbUtilLogger = Logger.getLogger("DBUtil");

    /**
     * 连接数据库
     */
    public void getConnection(){
        dbUtilLogger.info("2020144131汪亦涵的数据库已连接成功。");
    }



}
