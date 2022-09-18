package main.principle.compositeReuse;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/9/18 15:18
 * project: DesignPattern
 * Title: MySqlDBUtil
 * description: mysql数据库连接
 */
public class MySqlDBUtil implements IDBUtil{

    private Logger mysqlDBUtilLogger = Logger.getLogger(this.getClass().getName());

    @Override
    public void getConnection() {
        mysqlDBUtilLogger.info("2020144131汪亦涵：Mysql数据库已连接！");
    }


}
